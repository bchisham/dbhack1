package Bio::Phylo::Util::Logger;
use strict;
use File::Spec;
use Bio::Phylo::Util::CONSTANT 'looks_like_hash';
use Bio::Phylo::Util::Exceptions 'throw';
use Config;
use vars qw($volume $class_dir $file $VERBOSE $AUTOLOAD $TRACEBACK);
use UNIVERSAL 'isa';

BEGIN {
	my $class_file = __FILE__;
	( $volume, $class_dir, $file ) = File::Spec->splitpath( $class_file );
	$TRACEBACK = 0;
	$class_dir =~ s/Bio.Phylo.Util.?$//;
#	printf STDERR "[ %s starting, will use PREFIX=%s where applicable ]\n", __PACKAGE__, $class_dir;
}

{	
	my $self;	
	my %VERBOSE;
	my @listeners;	
	my ( $fatal, $error, $warn, $info, $debug ) = ( 0 .. 4 );		
	$VERBOSE = $warn;	

	for my $method ( qw(fatal error warn info debug) ) {
eval <<"CODE_TEMPLATE";	
	sub $method {
		my ( \$self, \$msg ) = \@_;
		my ( \$package, \$file1up, \$line1up, \$subroutine ) = caller( \$TRACEBACK + 1 );
		my ( \$pack0up, \$filename, \$line, \$sub0up )       = caller( \$TRACEBACK + 0 );
		my \$verbosity;
		if ( exists \$VERBOSE{\$subroutine} ) {
 			\$verbosity = \$VERBOSE{\$subroutine};
 		}
 		elsif ( exists \$VERBOSE{\$pack0up} ) {
 			\$verbosity = \$VERBOSE{\$pack0up};
 		}
 		else {
 			\$verbosity = \$VERBOSE;
 		}		
		if ( \$verbosity >= \$${method} ) {			
			my \$log_string;
			if ( \$filename =~ s/\\Q\$class_dir\\E// ) {
				\$log_string = sprintf( "%s %s [\\\$PREFIX/%s, %s] - %s\\n",
				uc("$method"), \$subroutine, \$filename, \$line, \$msg );
			}
			else {
				\$log_string = sprintf( "%s %s [%s, %s] - %s\\n",
				uc("$method"), \$subroutine, \$filename, \$line, \$msg );			
			}
			print STDERR \$log_string;
			\$_->( \$log_string, uc("$method"), \$subroutine, \$filename, \$line, \$msg ) for \@listeners;
		}
		return \$self;	
	}	
CODE_TEMPLATE
	}
	
	sub new {
		my $package = shift;
		
		# singleton object
		if ( not $self ) {
			$self = \$package;
			bless $self, $package;
		}
		
		# process args
		$self->VERBOSE(@_) if @_;
		
		# done
		return $self;
	}
	
	sub set_listeners {
		my ( $self, @args ) = @_;
		for my $arg ( @args ) {
			if ( isa( $arg, 'CODE' ) ) {
				push @listeners, $arg;
			}
			else {
				throw 'BadArgs' => "$arg not a CODE reference";
			}
		}
		return $self;
	}
	
	sub PREFIX { 
		my ( $self, $prefix ) = @_;
		$class_dir = $prefix if $prefix;
		return $class_dir;
	}
	
	sub VERBOSE {
		my $self = shift;
		if (@_) {
			my %opt = looks_like_hash @_;
			if ( defined $opt{'-level'} ) {
				
				# check validity
				if ( $opt{'-level'} > $debug xor $opt{'-level'} < $fatal ) {
					throw 'OutOfBounds' => "'-level' can be between $fatal and $debug, not $opt{'-level'}";
				}				
				
				if ( $opt{'-class'} ) {
					$VERBOSE{ $opt{'-class'} } = $opt{'-level'};
					$self->info("Changed verbosity for class $opt{'-class'} to $opt{'-level'}");
				}
				elsif ( $opt{'-method'} ) {
					$VERBOSE{ $opt{'-method'} } = $opt{'-level'};
					$self->info("Changed verbosity for method $opt{'-method'} to $opt{'-level'}");				
				}
				else {
					$VERBOSE = $opt{'-level'};				
					$self->info("Changed global verbosity to $VERBOSE");
				}
			}
		}
		return $VERBOSE;
	}	
	
	sub DESTROY {} # empty destructor so we don't go up inheritance tree at the end
	
}

1;		

=head1 NAME

Bio::Phylo::Util::Logger - Logger of internal messages of several severity levels 

=head1 SYNOPSIS

 use strict;
 use Bio::Phylo::Util::Logger;
 use Bio::Phylo::IO 'parse';
 
 # Create a file handle for logger to write to.
 # This is not necessary, by default the logger
 # writes to STDERR, but sometimes you will want
 # to write to a file, as per this example.
 open my $fh, '>', 'parsing.log' or die $!;
 
 # Instantiate a logger object.
 my $logger = Bio::Phylo::Util::Logger->new;
 
 # Set the verbosity level of the tree class.
 # 4 is the most verbose level. All log messages
 # emanating from the tree class will be 
 # transmitted
 $logger->VERBOSE( 
     '-level' => 4,
     '-class' => 'Bio::Phylo::Forest::Tree',
 );
 
 # Set the verbosity level of the set_name
 # method in the base class. Messages coming
 # from this method will be transmitted.
 $logger->VERBOSE( 
     '-level'  => 4,
     '-method' => 'Bio::Phylo::set_name',
 );
 
 # 'Listeners' are subroutine references that
 # are executed when a message is transmitted.
 # The first argument passed to these subroutines
 # is the log message. This particular listener
 # will write the message to the 'parsing.log'
 # file, if the $fh file handle is still open.
 $logger->set_listeners(
     sub {
         my ($msg) = @_;
         if ( $fh->opened ) {
             print $fh $msg;
         }
     }
 );

 # Now parse a tree, and see what is logged.
 my $tree = parse( 
     '-format' => 'newick', 
     '-string' => do { local $/; <DATA> },
 )->first;

 # Cleanly close the log handle.
 close $fh;
 
 __DATA__
 ((((A,B),C),D),E);

The example above will write something like the following to the log file:

 INFO Bio::Phylo::Forest::Tree::new [$PREFIX/Bio/Phylo/Forest/Tree.pm, 88] - constructor called for 'Bio::Phylo::Forest::Tree'
 INFO Bio::Phylo::set_name [$PREFIX/Bio/Phylo.pm, 280] - setting name 'A'
 INFO Bio::Phylo::set_name [$PREFIX/Bio/Phylo.pm, 280] - setting name 'B'
 INFO Bio::Phylo::set_name [$PREFIX/Bio/Phylo.pm, 280] - setting name 'C'
 INFO Bio::Phylo::set_name [$PREFIX/Bio/Phylo.pm, 280] - setting name 'D'
 INFO Bio::Phylo::set_name [$PREFIX/Bio/Phylo.pm, 280] - setting name 'E'

=head1 DESCRIPTION

This class defines a logger, a utility object for logging messages.
The other objects in Bio::Phylo use this logger to give detailed feedback
about what they are doing at per-class, per-method user-configurable log levels
(debug, info, warn, error and fatal). 

By default, the logger formats its 
messages to show where the logging method (i.e. DEBUG, INFO, WARN, ERROR or FATAL)
was called, so in the above example the $logger->info method was called in
Bio/Phylo.pm on line 280. However, in some cases you may want to have the
message be formatted to originate earlier in the call stack. An example of
this is in Bio::Phylo::Util::Exceptions, which calls $logger->error automatically 
every time an exception is thrown. This behaviour would not be very useful if the
resulting message is shown to originate from within the "throw" method - so
instead it seems to originate from where the exception was thrown, i.e. one
frame up in the call stack. This behaviour can be achieved by changing the value
of the $Bio::Phylo::Util::Logger::TRACEBACK variable. For each increment in that
variable, the logger moves one frame up in the call stack.

The least verbose is level 0, in which case only 'fatal' messages are shown. 
The most verbose level, 4, shows debugging messages, including from internal 
methods (i.e. ones that start with underscores, and special 'ALLCAPS' perl 
methods like DESTROY or TIEARRAY). For example, to monitor what the root class 
is doing, you would say:

 $logger->( -class => 'Bio::Phylo', -level => 4 )

To define global verbosity you can omit the -class argument. To set verbosity
at a more granular level, you can use the -method argument, which takes a 
fully qualified method name such as 'Bio::Phylo::set_name', such that messages
originating from within that method's body get a different verbosity level.

=head1 METHODS

=head2 CONSTRUCTOR

=over

=item new()

Constructor for Logger.

 Type    : Constructor
 Title   : new
 Usage   : my $logger = Bio::Phylo::Util::Logger->new;
 Function: Instantiates a logger
 Returns : a Bio::Phylo::Util::Logger object
 Args    : -verbose => verbosity, 0 .. 4 (optional)
 		   -package => a package for which to set verbosity (optional)	

=back

=head2 LOGGING METHODS

=over

=item log()

Prints argument debugging message, depending on verbosity.

 Type    : logging method
 Title   : log
 Usage   : $logger->log( "WARN", "warning message" );
 Function: prints logging message, depending on verbosity
 Returns : invocant
 Args    : message log level, logging message

=item debug()

Prints argument debugging message, depending on verbosity.

 Type    : logging method
 Title   : debug
 Usage   : $logger->debug( "debugging message" );
 Function: prints debugging message, depending on verbosity
 Returns : invocant
 Args    : logging message

=item info()

Prints argument informational message, depending on verbosity.

 Type    : logging method
 Title   : info
 Usage   : $logger->info( "info message" );
 Function: prints info message, depending on verbosity
 Returns : invocant
 Args    : logging message

=item warn()

Prints argument warning message, depending on verbosity.

 Type    : logging method
 Title   : warn
 Usage   : $logger->warn( "warning message" );
 Function: prints warning message, depending on verbosity
 Returns : invocant
 Args    : logging message

=item error()

Prints argument error message, depending on verbosity.

 Type    : logging method
 Title   : error
 Usage   : $logger->error( "error message" );
 Function: prints error message, depending on verbosity
 Returns : invocant
 Args    : logging message

=item fatal()

Prints argument fatal message, depending on verbosity.

 Type    : logging method
 Title   : fatal
 Usage   : $logger->fatal( "fatal message" );
 Function: prints fatal message, depending on verbosity
 Returns : invocant
 Args    : logging message

=item set_listeners()

Adds listeners to send log messages to.

 Type    : Mutator
 Title   : set_listeners()
 Usage   : $logger->set_listeners( sub { warn shift } )
 Function: Sets additional listeners to log to (e.g. a file)
 Returns : invocant
 Args    : One or more code references
 Comments: On execution of the listeners, the @_ arguments are:
           $log_string, # the formatted log string
           $level,      # log level, i.e DEBUG, INFO, WARN, ERROR or FATAL
           $subroutine, # the calling subroutine
           $filename,   # filename where log method was called
           $line,       # line where log method was called
           $msg         # the unformatted message

=item PREFIX()

Getter and setter of path prefix to strip from source file paths in messages.
By default, messages will have a field such as C<[$PREFIX/Bio/Phylo.pm, 280]>,
which indicates the message was sent from line 280 in file Bio/Phylo.pm inside
path $PREFIX. This is done so that your log won't be cluttered with 
unnecessarily long paths. To find out what C<$PREFIX> is set to, call the 
PREFIX() method on the logger, and to change it provide a path argument 
relative to which the paths to source files will be constructed.

 Type    : Mutator/Accessor
 Title   : PREFIX()
 Usage   : $logger->PREFIX( '/path/to/bio/phylo' )
 Function: Sets/gets $PREFIX
 Returns : Verbose level
 Args    : Optional: a path
 Comments:

=item VERBOSE()

Setter for the verbose level. This comes in five levels: 

	0 = only fatal messages (though, when something fatal happens, you'll most 
	likely get an exception object), 
	
	1 = errors (hopefully recoverable), 
	
	2 = warnings (recoverable), 
	
	3 = info (useful diagnostics), 
	
	4 = debug (almost every method call)

Without additional arguments, i.e. by just calling VERBOSE( -level => $level ),
you set the global verbosity level. By default this is 2. By increasing this
level, the number of messages quickly becomes too great to make sense out of.
To focus on a particular class, you can add the -class => 'Some::Class' 
(where 'Some::Class' stands for any of the class names in the Bio::Phylo 
release) argument, which means that messages originating from that class will 
have a different (presumably higher) verbosity level than the global level. 
By adding the -method => 'Fully::Qualified::method_name' (say, 
'Bio::Phylo::set_name'), you can change the verbosity of a specific method. When
evaluating whether or not to transmit a message, the method-specific verbosity
level takes precedence over the class-specific level, which takes precedence
over the global level.

 Type    : Mutator
 Title   : VERBOSE()
 Usage   : $logger->VERBOSE( -level => $level )
 Function: Sets/gets verbose level
 Returns : Verbose level
 Args    : -level   => 4 # or lower
 
           # optional, or any other class 
           -class   => 'Bio::Phylo' 
           
           # optional, fully qualified method name
           -method' => 'Bio::Phylo::set_name' 

=back

=head1 SEE ALSO

Also see the manual: L<Bio::Phylo::Manual> and L<http://rutgervos.blogspot.com>.

=head1 REVISION

 $Id: Logger.pm 841 2009-03-04 23:07:30Z rvos $

=cut