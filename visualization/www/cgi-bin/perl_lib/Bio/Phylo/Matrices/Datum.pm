# $Id: Datum.pm 851 2009-03-05 09:39:32Z rvos $
package Bio::Phylo::Matrices::Datum;
use vars '@ISA';
use strict;
use Bio::Phylo::Taxa::TaxonLinker;
use Bio::Phylo::Util::Exceptions 'throw';
use Bio::Phylo::Matrices::TypeSafeData;
use Bio::Phylo::Util::CONSTANT qw(:objecttypes looks_like_number looks_like_hash);
use UNIVERSAL qw(isa can);
@ISA = qw(
  Bio::Phylo::Matrices::TypeSafeData
  Bio::Phylo::Taxa::TaxonLinker
);

eval { require Bio::Seq };
if ( not $@ ) {
	push @ISA, 'Bio::Seq';
}
else {
	undef($@);
}
my $LOADED_WRAPPERS = 0;

{
    my $logger             = __PACKAGE__->get_logger;
    my $TYPE_CONSTANT      = _DATUM_;
    my $CONTAINER_CONSTANT = _MATRIX_;
    my @fields             = \( my ( %weight, %position, %annotations ) );

=head1 NAME

Bio::Phylo::Matrices::Datum - Character state sequence

=head1 SYNOPSIS

 use Bio::Phylo::Factory;
 my $fac = Bio::Phylo::Factory->new;

 # instantiating a datum object...
 my $datum = $fac->create_datum(
    -name   => 'Tooth comb size,
    -type   => 'STANDARD',
    -desc   => 'number of teeth in lower jaw comb',
    -pos    => 1,
    -weight => 2,
    -char   => [ 6 ],
 );

 # ...and linking it to a taxon object
 my $taxon = $fac->create_taxon(
     -name => 'Lemur_catta'
 );
 $datum->set_taxon( $taxon );

 # instantiating a matrix...
 my $matrix = $fac->create_matrix;

 # ...and insert datum in matrix
 $matrix->insert($datum);


=head1 DESCRIPTION

The datum object models a single observation or a sequence of observations,
which can be linked to a taxon object.

=head1 METHODS

=head2 CONSTRUCTOR

=over

=item new()

Datum object constructor.

 Type    : Constructor
 Title   : new
 Usage   : my $datum = Bio::Phylo::Matrices::Datum->new;
 Function: Instantiates a Bio::Phylo::Matrices::Datum
           object.
 Returns : A Bio::Phylo::Matrices::Datum object.
 Args    : None required. Optional:
           -taxon  => $taxon,
           -weight => 0.234,
           -type   => DNA,           
           -pos    => 2,


=cut

    sub new {

        # could be child class
        my $class = shift;

        # notify user
        $logger->info("constructor called for '$class'");
        
		if ( not $LOADED_WRAPPERS ) {
			eval do { local $/; <DATA> };
			die $@ if $@;
			$LOADED_WRAPPERS++;
		}        

        # go up inheritance tree, eventually get an ID
        my $self = $class->SUPER::new( '-tag' => 'row', @_ );
        return $self;
    }

=item new_from_bioperl()

Datum constructor from Bio::Seq argument.

 Type    : Constructor
 Title   : new_from_bioperl
 Usage   : my $datum = 
           Bio::Phylo::Matrices::Datum->new_from_bioperl($seq);
 Function: Instantiates a 
           Bio::Phylo::Matrices::Datum object.
 Returns : A Bio::Phylo::Matrices::Datum object.
 Args    : A Bio::Seq (or similar) object

=cut
    
    sub new_from_bioperl {
    	my ( $class, $seq, @args ) = @_;
    	my $type = $seq->alphabet || $seq->_guess_alphabet || 'dna';
    	my $self = $class->new( '-type' => $type, @args );
        
        # copy seq string
        my $seqstring = $seq->seq;
        if ( $seqstring and $seqstring =~ /\S/ ) {
        	eval { $self->set_char( $seqstring ) };
        	if ( $@ and UNIVERSAL::isa($@,'Bio::Phylo::Util::Exceptions::InvalidData') ) {
        		$logger->error(
        			"\nAn exception of type Bio::Phylo::Util::Exceptions::InvalidData was caught\n\n".
        			$@->description                                                                  .
        			"\n\nThe BioPerl sequence object contains invalid data ($seqstring)\n"           .
        			"I cannot store this string, I will continue instantiating an empty object.\n"   .
        			"---------------------------------- STACK ----------------------------------\n"  .
        			$@->trace->as_string                                                             .
        			"\n--------------------------------------------------------------------------"
        		);
        	}
        }                
        
        # copy name
        my $name = $seq->display_id;
        $self->set_name( $name ) if defined $name;
                
        # copy desc
        my $desc = $seq->desc;   
        $self->set_desc( $desc ) if defined $desc;   
        for my $field ( qw(start end strand) ) {
        	$self->$field( $seq->$field );
        } 	
        return $self;
    }

=back

=head2 MUTATORS

=over

=item set_weight()

Sets invocant weight.

 Type    : Mutator
 Title   : set_weight
 Usage   : $datum->set_weight($weight);
 Function: Assigns a datum's weight.
 Returns : Modified object.
 Args    : The $weight argument must be a
           number in any of Perl's number
           formats.

=cut

    sub set_weight {
        my ( $self, $weight ) = @_;
        my $id = $$self;
        $weight = 1 if not defined $weight;
        if ( looks_like_number $weight ) {
            $weight{$id} = $weight;
            $logger->info("setting weight '$weight'");
        }
        elsif ( !looks_like_number $weight ) {
            throw 'BadNumber' => 'Not a number!';
        }
    }

=item set_char()

Sets character state(s)

 Type    : Mutator
 Title   : set_char
 Usage   : $datum->set_char($char);
 Function: Assigns a datum's character value.
 Returns : Modified object.
 Args    : The $char argument is checked against
           the allowed ranges for the various
           character types: IUPAC nucleotide (for
           types of DNA|RNA|NUCLEOTIDE), IUPAC
           single letter amino acid codes (for type
           PROTEIN), integers (STANDARD) or any of perl's
           decimal formats (CONTINUOUS). The $char can be:
               * a single character;
               * a string of characters;
               * an array reference of characters;
               * an array of characters;
 Comments: Note that on assigning characters to a datum,
           previously set annotations are removed.

=cut

    sub set_char {
        my $self = shift;
        my $name = $self->get_internal_name;
        my $length = ref $_[0] ? join( '', @{ $_[0] } ) : join( '', @_ );
        $logger->info("setting $name $length chars '@_'");
        my @data;
        for my $arg (@_) {
            if ( isa( $arg, 'ARRAY' ) ) {
                push @data, @{$arg};
            }
            else {
                push @data, @{ $self->get_type_object->split($arg) };
            }
        }
        my $missing  = $self->get_missing;
        my $position = $self->get_position;
        for ( 1 .. $position - 1 ) {
            unshift @data, $missing;
        }
        my @char = @{ $self->get_entities }; # store old data for rollback
        eval {
            $self->clear;
            $self->insert( @data );
        };
        if ( $@ ) {
        	$self->clear;
        	eval { $self->insert(@char) };
			undef($@);
			throw 'InvalidData' => sprintf(
					'Invalid data for row %s (type %s: %s)',
					$self->get_internal_name, $self->get_type, join( ' ', @data )
			);
		}
		$self->set_annotations;
        return $self;
    }

=item set_position()

Set invocant starting position.

 Type    : Mutator
 Title   : set_position
 Usage   : $datum->set_position($pos);
 Function: Assigns a datum's position.
 Returns : Modified object.
 Args    : $pos must be an integer.

=cut

    sub set_position {
        my ( $self, $pos ) = @_;
        $pos = 1 if not defined $pos;
        if ( looks_like_number $pos && $pos >= 1 && $pos / int($pos) == 1 ) {
            $position{$$self} = $pos;
            $logger->info("setting position '$pos'");
        }
        else {
        	throw 'BadNumber' => "'$pos' not a positive integer!";
        }
    }

=item set_annotation()

Sets single annotation.

 Type    : Mutator
 Title   : set_annotation
 Usage   : $datum->set_annotation(
               -char       => 1,
               -annotation => { -codonpos => 1 }
           );
 Function: Assigns an annotation to a
           character in the datum.
 Returns : Modified object.
 Args    : Required: -char       => $int
           Optional: -annotation => $hashref
 Comments: Use this method to annotate
           a single character. To annotate
           multiple characters, use
           'set_annotations' (see below).

=cut

    sub set_annotation {
        my $self = shift;
        if (@_) {
            my %opt = looks_like_hash @_;
            if ( not exists $opt{'-char'} ) {
                throw 'BadArgs' => "No character to annotate specified!";
            }
            my $i   = $opt{'-char'};
            my $id  = $$self;
            my $pos = $self->get_position;
            my $len = $self->get_length;
            if ( $i > ( $pos + $len ) || $i < $pos ) {
                throw 'OutOfBounds' => "Specified char ($i) does not exist!";
            }
            if ( exists $opt{'-annotation'} ) {
                my $note = $opt{'-annotation'};
                $annotations{$id}->[$i] = {} if !$annotations{$id}->[$i];
                while ( my ( $k, $v ) = each %{$note} ) {
                    $annotations{$id}->[$i]->{$k} = $v;
                }
            }
            else {
                $annotations{$id}->[$i] = undef;
            }
        }
        else {
        	throw 'BadArgs' => "No character to annotate specified!";
        }
        return $self;
    }

=item set_annotations()

Sets list of annotations.

 Type    : Mutator
 Title   : set_annotations
 Usage   : $datum->set_annotations(
               { '-codonpos' => 1 },
               { '-codonpos' => 2 },
               { '-codonpos' => 3 },
           );
 Function: Assign annotations to
           characters in the datum.
 Returns : Modified object.
 Args    : Hash references, where
           position in the argument
           list matches that of the
           specified characters in
           the character list. If no
           argument given, annotations
           are reset.
 Comments: Use this method to annotate
           multiple characters. To
           annotate a single character,
           use 'set_annotation' (see
           above).

=cut

    sub set_annotations {
        my $self = shift;
        my @anno;
        if ( scalar @_ == 1 and UNIVERSAL::isa( $_[0], 'ARRAY' ) ) {
        	@anno = @{ $_[0] };
        }
        else {
			@anno = @_;
        }
        if ( @anno ) {
            my $id = $$self;
            my $max_index = $self->get_length - 1;
            for my $i ( 0 .. $#anno ) {
                if ( $i > $max_index ) {
                    throw 'OutOfBounds' => "Specified char ($i) does not exist!";
                }
                else {
                    if ( isa( $anno[$i], 'HASH' ) ) {
                        $annotations{$id}->[$i] = {}
                          if !$annotations{$id}->[$i];
                        while ( my ( $k, $v ) = each %{ $anno[$i] } ) {
                            $annotations{$id}->[$i]->{$k} = $v;
                        }
                    }
                    else {
                        next;
                    }
                }
            }
        }
        else {
        	$annotations{$$self} = [];
        }
    }

=back

=head2 ACCESSORS

=over

=item get_weight()

Gets invocant weight.

 Type    : Accessor
 Title   : get_weight
 Usage   : my $weight = $datum->get_weight;
 Function: Retrieves a datum's weight.
 Returns : FLOAT
 Args    : NONE

=cut

    sub get_weight {
        my $self   = shift;
        my $weight = $weight{$$self};
        return defined $weight ? $weight : 1;
    }

=item get_char()

Gets characters.

 Type    : Accessor
 Title   : get_char
 Usage   : my $char = $datum->get_char;
 Function: Retrieves a datum's character value.
 Returns : In scalar context, returns a single
           character, or a string of characters
           (e.g. a DNA sequence, or a space
           delimited series of continuous characters).
           In list context, returns a list of characters
           (of zero or more characters).
 Args    : NONE

=cut

    sub get_char {
        my $self = shift;
        my @data = @{ $self->get_entities };
        if (@data) {
            return wantarray ? @data : $self->get_type_object->join( \@data );
        }
        else {
            return wantarray ? () : '';
        }
    }

=item get_position()

Gets invocant starting position.

 Type    : Accessor
 Title   : get_position
 Usage   : my $pos = $datum->get_position;
 Function: Retrieves a datum's position.
 Returns : a SCALAR integer.
 Args    : NONE

=cut

    sub get_position {
        my $self = shift;
        my $pos  = $position{$$self};
        return defined $pos ? $pos : 1;
    }

=item get_annotation()

Retrieves character annotation (hashref).

 Type    : Accessor
 Title   : get_annotation
 Usage   : $datum->get_annotation(
               '-char' => 1,
               '-key'  => '-codonpos',
           );
 Function: Retrieves an annotation to
           a character in the datum.
 Returns : SCALAR or HASH
 Args    : Optional: -char => $int
           Optional: -key => $key

=cut

    sub get_annotation {
        my $self = shift;
        my $id   = $$self;
        if (@_) {
            my %opt = looks_like_hash @_;
            if ( not exists $opt{'-char'} ) {
            	throw 'BadArgs' => "No character to return annotation for specified!";
            }
            my $i   = $opt{'-char'};
            my $pos = $self->get_position;
            my $len = $self->get_length;
            if ( $i < $pos || $i > ( $pos + $len ) ) {
            	throw 'OutOfBounds' => "Specified char ($i) does not exist!";
            }
            if ( exists $opt{'-key'} ) {
                return $annotations{$id}->[$i]->{ $opt{'-key'} };
            }
            else {
                return $annotations{$id}->[$i];
            }
        }
        else {
            return $annotations{$id};
        }
    }

=item get_annotations()

Retrieves character annotations (array ref).

 Type    : Accessor
 Title   : get_annotations
 Usage   : my @anno = @{ $datum->get_annotation() };
 Function: Retrieves annotations
 Returns : ARRAY
 Args    : NONE

=cut

    sub get_annotations {
        my $self = shift;
        return $annotations{$$self} || [];
    }

=item get_length()

Gets invocant number of characters.

 Type    : Accessor
 Title   : get_length
 Usage   : my $length = $datum->get_length;
 Function: Retrieves a datum's length.
 Returns : a SCALAR integer.
 Args    : NONE

=cut

    sub get_length {
        my $self = shift;
#        $logger->info("Chars: @char");
        if ( my $matrix = $self->_get_container ) {
            return $matrix->get_nchar;
        }
        else {
            return scalar( @{ $self->get_entities } ) + $self->get_position - 1;
        }
    }

=item get_by_index()

Gets state at argument index.

 Type    : Accessor
 Title   : get_by_index
 Usage   : my $val = $datum->get_by_index($i);
 Function: Retrieves state at index $i.
 Returns : a character state.
 Args    : INT

=cut

    sub get_by_index {
        my ( $self, $index ) = @_;
        my $offset = $self->get_position - 1;
        return $self->get_type_object->get_missing if $offset > $index;
        my $val = $self->SUPER::get_by_index( $index - $offset );
        return defined $val ? $val : $self->get_type_object->get_missing;
    }
    
=item get_index_of()

Returns the index of the first occurrence of the 
state observation in the datum or undef if the datum 
doesn't contain the argument

 Type    : Generic query
 Title   : get_index_of
 Usage   : my $i = $datum->get_index_of($state)
 Function: Returns the index of the first occurrence of the 
           state observation in the datum or undef if the datum 
		   doesn't contain the argument
 Returns : An index or undef
 Args    : A contained object

=cut

	sub get_index_of {
		my ( $self, $obj ) = @_;
		my $is_numerical = $self->get_type =~ m/^(Continuous|Standard|Restriction)$/;
		my $i = 0;
		for my $ent ( @{ $self->get_entities } ) {
			if ( $is_numerical ) {
				return $i if $obj == $ent;
			}
			else {
				return $i if $obj eq $ent;
			}
			$i++;
		}
		return undef;
	}    

=back

=head2 TESTS

=over

=item can_contain()

Tests if invocant can contain argument.

 Type    : Test
 Title   : can_contain
 Usage   : &do_something if $datum->can_contain( @args );
 Function: Tests if $datum can contain @args
 Returns : BOOLEAN
 Args    : One or more arguments as can be provided to set_char

=cut

    sub can_contain {
        my $self = shift;
        my @data = @_;
        if ( my $obj = $self->get_type_object ) {
            if ( $obj->isa('Bio::Phylo::Matrices::Datatype::Mixed') ) {
                my @split;
                for my $datum (@data) {
                    if ( can( $datum, 'get_char' ) ) {
                        my @tmp = $datum->get_char();
                        my $i   = $datum->get_position() - 1;
                        for (@tmp) {
                            $split[ $i++ ] = $_;
                        }
                    }
                    elsif ( isa( $datum, 'ARRAY' ) ) {
                        push @split, @{$datum};
                    }
                    else {
                        my $subtype = $obj->get_type_for_site( scalar(@split) );
                        push @split, @{ $subtype->split($datum) };
                    }
                }

                #return 1;
                for my $i ( 1 .. scalar(@split) ) {
                    my $subtype = $obj->get_type_for_site( $i - 1 );
                    next if $subtype->is_valid( $split[ $i - 1 ] );
                    throw 'InvalidData' => sprintf(
                            'Invalid char %s at pos %s for type %s',
                            $split[ $i - 1 ],
                            $i, $subtype->get_type,
                    );
                }
                return 1;
            }
            else {
                return $obj->is_valid(@data);
            }
        }
        else {
            throw 'API' => "No associated type object found,\n" 
                         . "this is a bug - please report - thanks";
        }
    }

=back

=head2 CALCULATIONS

=over

=item calc_state_counts()

Calculates occurrences of states.

 Type    : Calculation
 Title   : calc_state_counts
 Usage   : my %counts = %{ $datum->calc_state_counts };
 Function: Calculates occurrences of states.
 Returns : Hashref: keys are states, values are counts
 Args    : Optional - one or more states to focus on

=cut

	sub calc_state_counts {
		my $self = shift;
		my %counts;
		if ( @_ ) {
			my %focus = map { $_ => 1 } @_;
			my @char = $self->get_char;
			for my $c ( @char ) {
				if ( exists $focus{$c} ) {
					if ( not exists $counts{$c} ) {
						$counts{$c} = 1;
					}
					else {
						$counts{$c}++;
					}
				}
			}
		}
		else {
			my @char = $self->get_char;
			for my $c ( @char ) {
				if ( not exists $counts{$c} ) {
					$counts{$c} = 1;
				}
				else {
					$counts{$c}++;
				}
			}		
		}
		return \%counts;
	}

=back

=head2 METHODS

=over

=item reverse()

Reverses contents.

 Type    : Method
 Title   : reverse
 Usage   : $datum->reverse;
 Function: Reverses a datum's contained characters
 Returns : Returns modified $datum
 Args    : NONE

=cut

    sub reverse {
        my $self     = shift;
        my @char     = $self->get_char;
        my @reversed = reverse(@char);
        $self->set_char( \@reversed );
    }

=item concat()

Appends argument to invocant.

 Type    : Method
 Title   : reverse
 Usage   : $datum->concat($datum1);
 Function: Appends $datum1 to $datum
 Returns : Returns modified $datum
 Args    : NONE

=cut

    sub concat {
        my ( $self, @data ) = @_;
        $logger->info("concatenating objects");
        my @newchars;
        my @self_chars = $self->get_char;
        my $self_i     = $self->get_position - 1;
        my $self_j     = $self->get_length - 1 + $self_i;
        @newchars[ $self_i .. $self_j ] = @self_chars;
        for my $datum (@data) {
            my @chars = $datum->get_char;
            my $i     = $datum->get_position - 1;
            my $j     = $datum->get_length - 1 + $i;
            @newchars[ $i .. $j ] = @chars;
        }
        my $missing = $self->get_missing;
        for my $i ( 0 .. $#newchars ) {
            $newchars[$i] = $missing if !defined $newchars[$i];
        }
        $self->set_char( \@newchars );
    }

=item validate()

Validates invocant data contents.

 Type    : Method
 Title   : validate
 Usage   : $datum->validate;
 Function: Validates character data contained by $datum
 Returns : True or throws Bio::Phylo::Util::Exceptions::InvalidData
 Args    : NONE

=cut

    sub validate {
        my $self = shift;
        if ( !$self->get_type_object->is_valid($self) ) {
            throw 'InvalidData' => 'Invalid data!';
        }
    }

=item clone()

Clones invocant.

 Type    : Utility method
 Title   : clone
 Usage   : my $clone = $object->clone;
 Function: Creates a copy of the invocant object.
 Returns : A copy of the invocant.
 Args    : None.
 Comments: Cloning is currently experimental, use with caution.

=cut

	sub clone {
		my $self = shift;
		my %subs = @_;
		
		# some extra logic to copy characters from source to target
		$subs{'set_char'} = 0;
		
		# some logic to copy annotations
		$subs{'set_annotation'} = 0;
		
		return $self->SUPER::clone(%subs);
	
	}

=item to_xml()

Serializes datum to nexml format.

 Type    : Format convertor
 Title   : to_xml
 Usage   : my $xml = $datum->to_xml;
 Function: Converts datum object into a nexml element structure.
 Returns : Nexml block (SCALAR).
 Args    : -chars   => [] # optional, an array ref of character IDs
           -states  => {} # optional, a hash ref of state IDs
           -symbols => {} # optional, a hash ref of symbols
           -special => {} # optional, a hash ref of special symbol IDs

=cut

	sub to_xml {
		my $self = shift;
		my %args = looks_like_hash @_;
		my $char_ids  = $args{'-chars'};
		my $state_ids = $args{'-states'};
		my $special   = $args{'-special'};
		if ( my $taxon = $self->get_taxon ) {
			$self->set_attributes( 'otu' => $taxon->get_xml_id );
		}
		my @char = $self->get_char;
		my ( $missing, $gap ) = ( $self->get_missing, $self->get_gap );
		my $xml = $self->get_xml_tag;
		
		if ( not $args{'-compact'} ) {
			for my $i ( 0 .. $#char ) {
				if ( $missing ne $char[$i] and $gap ne $char[$i] ) {
					my ( $c, $s );
					if ( $char_ids and $char_ids->[$i] ) {
						$c = $char_ids->[$i];
					}
					else {
						$c = $i;
					}
					if ( $state_ids and $state_ids->{uc $char[$i]} ) {
						$s = $state_ids->{uc $char[$i]};
					}
					else {
						$s = uc $char[$i];
					}
					$xml .= sprintf('<cell char="%s" state="%s" />', $c, $s);
				}
				elsif ( $missing eq $char[$i] or $gap eq $char[$i] ) {
					my ( $c, $s );
					if ( $char_ids and $char_ids->[$i] ) {
						$c = $char_ids->[$i];
					}
					else {
						$c = $i;
					}
					if ( $special and $special->{$char[$i]} ) {
						$s = $special->{$char[$i]};
					}
					else {
						$s = $char[$i];
					}
					$xml .= sprintf('<cell char="%s" state="%s" />', $c, $s);				
				}
			}
		}
		else {
			my @tmp = map { uc $_ } @char;
			my $seq = $self->get_type_object->join(\@tmp);
			$xml .= '<seq>' . $seq . '</seq>';	
		}
		
		$xml .= sprintf('</%s>', $self->get_tag);
		return $xml;
	}

=item copy_atts()

 Not implemented!

=cut

    sub copy_atts { }    # XXX not implemented

=item complement()

 Not implemented!

=cut

    sub complement { }   # XXX not implemented

=item slice()

 Not implemented!

=cut

    sub slice {          # XXX not implemented
        my $self  = shift;
        my $start = int $_[0];
        my $end   = int $_[1];
        my @chars = $self->get_char;
        my $pos   = $self->get_position;
        my $slice - $self->copy_atts;
    }
    sub _type      { $TYPE_CONSTANT }
    sub _container { $CONTAINER_CONSTANT }

    sub _cleanup {
        my $self = shift;
        $logger->info("cleaning up '$self'");
        if ( defined( my $id = $$self ) ) {
	        for my $field (@fields) {
	            delete $field->{$id};
	        }
        }
    }

}

=back

=cut

# podinherit_insert_token

=head1 SEE ALSO

=over

=item L<Bio::Phylo::Taxa::TaxonLinker>

This object inherits from L<Bio::Phylo::Taxa::TaxonLinker>, so the methods
defined therein are also applicable to L<Bio::Phylo::Matrices::Datum> objects.

=item L<Bio::Phylo::Matrices::TypeSafeData>

This object inherits from L<Bio::Phylo::Matrices::TypeSafeData>, so the methods
defined therein are also applicable to L<Bio::Phylo::Matrices::Datum> objects.

=item L<Bio::Phylo::Manual>

Also see the manual: L<Bio::Phylo::Manual> and L<http://rutgervos.blogspot.com>.

=back

=head1 REVISION

 $Id: Datum.pm 851 2009-03-05 09:39:32Z rvos $

=cut

1;
__DATA__

my $DEFAULT_NAME = 'DEFAULT';

sub meta_names {
    my ($self) = @_;
    my @r;
    my $names = $self->get_generic('meta') || {};
    foreach  ( sort keys %{ $names } ) {
        push (@r, $_) unless $_ eq $DEFAULT_NAME;
    }
    unshift @r, $DEFAULT_NAME if $names->{$DEFAULT_NAME};
    return @r;
}

sub get_SeqFeatures { $logger->warn }

sub get_all_SeqFeatures { $logger->warn }

sub feature_count { $logger->warn }

sub seq {
    my $self = shift;
    my $seq = $self->get_char;
    return $seq;
}

# from primary seq
sub subseq {
   my ($self,$start,$end,$replace) = @_;

   if( ref($start) && $start->isa('Bio::LocationI') ) {
       my $loc = $start;
       $replace = $end; # do we really use this anywhere? scary. HL
       my $seq = "";
       foreach my $subloc ($loc->each_Location()) {
	   my $piece = $self->subseq($subloc->start(),
				     $subloc->end(), $replace);
	   if($subloc->strand() < 0) {
	       $piece = Bio::PrimarySeq->new('-seq' => $piece)->revcom()->seq();
	   }
	   $seq .= $piece;
       }
       return $seq;
   } elsif(  defined  $start && defined $end ) {
       if( $start > $end ){
	   $self->throw("Bad start,end parameters. Start [$start] has to be ".
			"less than end [$end]");
       }
       if( $start <= 0 ) {
	   $self->throw("Bad start parameter ($start). Start must be positive.");
       }
       if( $end > $self->length ) {
	   $self->throw("Bad end parameter ($end). End must be less than the total length of sequence (total=".$self->length.")");
       }

       # remove one from start, and then length is end-start
       $start--;
       if( defined $replace ) {
	   return substr( $self->seq(), $start, ($end-$start), $replace);
       } else {
	   return substr( $self->seq(), $start, ($end-$start));
       }
   } else {
       $self->warn("Incorrect parameters to subseq - must be two integers or a Bio::LocationI object. Got:", $self,$start,$end,$replace);
       return;
   }
}

sub write_GFF { $logger->warn }

sub annotation { $logger->warn }

sub species { $logger->warn }

sub primary_seq { $logger->warn }

sub accession_number { $logger->warn }

sub alphabet {
    my $self = shift;
    my $type = $self->get_type;
    return lc $type;
}

sub can_call_new { $logger->warn }

sub desc {
    my ( $self, $desc ) = @_;
    if ( defined $desc ) {
        $self->set_desc( $desc );
    }
    return $self->get_desc;
}

sub display_id { shift->get_name }

sub id { shift->get_name }

sub is_circular { $logger->warn }

sub length { shift->get_length }

sub moltype { shift->alphabet }

sub primary_id { $logger->warn }

sub revcom { $logger->warn }

sub translate { $logger->warn }

sub trunc { $logger->warn }

sub get_nse{
   my ($self,$char1,$char2) = @_;

   $char1 ||= "/";
   $char2 ||= "-";

   $self->throw("Attribute id not set") unless defined($self->id());
   $self->throw("Attribute start not set") unless defined($self->start());
   $self->throw("Attribute end not set") unless defined($self->end());

   return $self->id() . $char1 . $self->start . $char2 . $self->end ;

}

sub strand {
	my ( $self, $strand ) = @_;
	if ( defined $strand ) {
		$self->set_generic( 'strand' => $strand );
	}
	return $self->get_generic( 'strand' );
}

sub start {
	my ( $self, $start ) = @_;
	if ( defined $start ) {
		$self->set_position( $start );
	}
	return $self->get_position;
}

sub end {
	my ( $self, $end ) = @_;
	if ( defined $end ) {
		$self->set_generic( 'end' => $end );
	}
	$end = $self->get_generic( 'end' );
	if ( defined $end ) {
		return $end;
	}
	else {
		return scalar( @{ $self->get_entities } ) + $self->get_position - 1;
	}
}