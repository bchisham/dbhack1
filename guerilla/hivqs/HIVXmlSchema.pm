#$Id$#
package HIVXmlSchema;
use strict;

=head1 NAME

Bio::DB::HIV::HIVXmlSchema - routines to convert LANL HIV sequence DB data into XML
(This package eventually bound for bioperl-dev)

=head1 SYNOPSIS

=head1 DESCRIPTION

This package contains internal methods assigned to existing module
namespaces in BioPerl modules C<Bio::DB::HIV> and
C<Bio::DB::Query>. They are used to help create schema-valid XML
messages from sequence metadata returned by the Los Alamos National
Laboratories' CGI interface to their HIV Sequence Database.  The
custom XML namespace to which these routines correspond is
L<http://fortinbras.us/HIVDBSchema/1.0>. Schema definition files can
be obtained at that URL.

=head1 IMPORTANT CAVEAT

These routines are dependent upon revision 15594 of C<Bio::DB::Query::HIVQuery>
and revision 15593 of C<Bio::DB::HIV::HIVQueryHelper>.

=head1 AUTHOR - Mark A. Jensen

Email maj@fortinbras.us

=head1 ACKNOWLEDGEMENTS

Many thanks to the knowledgeable and patient participants of the 
National Center for Evolutionary Synthesis' Database Interoperability
Hackthon, Durham, NC, USA, March 2009.

=head1 APPENDIX

The rest of the documentation details each of the contained packages.
Internal methods are usually preceded with a _

=cut

use strict;
use constant HIVNS => 'http://fortinbras.us/HIVDBSchema/1.0';
# change below to directory finder...
use constant XSDDIR => '~/fortinbras/hackathon/code/dbhack-live/guerilla/hivqs/';

use XML::LibXML;
use XML::Compile;
use XML::Compile::Util qw( SCHEMA2001 SCHEMA2001i pack_type );
use Exporter;
use base qw(XML::Compile::Schema Bio::Root::Root);

BEGIN {
    our (@ISA, @EXPORT_OK);
    push @ISA, qw( Exporter );
    @EXPORT_OK = qw( HIVNS );
}

our @schemata = qw(
                   hivqSchema.xsd 
                   hivqAnnotSeqType.xsd
                   hivqComplexTypes.xsd
                   hivqSimpleTypes.xsd
                  );

=head2 Constructor

 Title   : new
 Usage   : $sch = HIVXmlSchema->new();
 Function: create a new HIVXmlSchema object
 Example :
 Returns : a new HIVXmlSchema object (is-a XML::Compile::Schema, and
           is-a Bio::Root::Root)
 Args    : -SCHEMADIR => $dir_containing_xsd_files
           -XSCARGS   => \@array_of_XML_Compile_Schema_constructor_args

=cut

# binding prefixes needs:
# compile(..., prefixes => { SCHEMA2001 => 'xs', SCHEMA2001i => 'xsi', HIVNS => 'hivq' }

sub new{
   my ($class,@args) = @_;
   my ($schema_dir,$XSC_args) = $class->SUPER::_rearrange([qw(SCHEMADIR,XSCARGS)], @args);
   $schema_dir ||= XSDDIR;
   my $self = $class->SUPER::new([SCHEMA2001,SCHEMA2001i, @schemata],
				 @$XSC_args);

   # now,can do other stuff here using XML::Compile:Schema instance methods:
   # add filtering hooks, rewrite tables, typemaps...
   # maybe to do under the hood 
   # see http://search.cpan.org/~markov/XML-Compile-1.02/lib/XML/Compile/Schema.pod#Administration
   
   # attach hivq-specific reader and writer slots (for doc purposes really)
   $self->{_hivq_writer} = {};
   $self->{_hivq_reader} = {};

   return $self;
}

=head2 make_writer

 Title   : make_writer
 Usage   : $hivq_wri = $obj->make_writer
 Function: compile and return an XML::Compile writer based on the HIVQ schema,
           add ref to parent object
 Example :
 Returns : a coderef (see XML::Compile manpage)
 Args    : -XSCARGS => [@args_to_pass_to_compiler]

=cut

sub make_writer{
   my ($self,@args) = @_;
   my ($XSC_args) = $self->_rearrange([qw(XSCARGS)], @args);
   $XSC_args ||= [];
   return $self->_hivq_writer( $self->compile('WRITER',
					      pack_type(HIVNS,'HivqSeqs'),
					      prefixes => [ 
						  'xs'  => SCHEMA2001,
						  'xsi' => SCHEMA2001i,
						  'hivq'=> HIVNS
					      ],
					      @$XSC_args) );
}

=head2 make_reader

 Title   : make_reader
 Usage   : $hivq_rdr = $obj->make_reader
 Function: compile and return an XML::Compile reader based on the HIVQ Schema,
           add ref to parent object
 Example :
 Returns : a coderef (see XML::Compile manpage)
 Args    : -XSCARGS => [@args_to_pass_to_compiler]

=cut

sub make_reader{
   my ($self,@args) = @_;
   my ($XSC_args) = $self->_rearrange([qw(XSCARGS)], @args);
   $XSC_args ||= [];
   return $self->_hivq_reader( $self->compile('READER',
					      pack_type(HIVNS,'HivqSeqs'),
					      prefixes => [
						  'xs'   => SCHEMA2001,
						  'xsi'  => SCHEMA2001i,
						  'hivq' => HIVNS
					      ],
					      @$XSC_args) );


}

=head2 _hivq_writer

 Title   : _hivq_writer
 Usage   : $obj->_hivq_writer($newval)
 Function: container for XML::Compile compiled writer
 Example : 
 Returns : value of _writer (a coderef)
 Args    : on set, new value (a coderef or undef, optional)

=cut

sub _hivq_writer{
    my $self = shift;

    return $self->{'_hivq_writer'} = shift if @_;
    return $self->{'_hivq_writer'};
}

=head2 _hivq_reader

 Title   : _hivq_reader
 Usage   : $obj->_hivq_reader($newval)
 Function: container for XML::Compile compiled reader
 Example : 
 Returns : value of _hivq_reader (a coderef)
 Args    : on set, new value (a coderef or undef, optional)

=cut

sub _hivq_reader{
    my $self = shift;

    return $self->{'_hivq_reader'} = shift if @_;
    return $self->{'_hivq_reader'};
}

1;

