#$Id$#

=head1 NAME

Bio::DB::HIV::HIVXmlSchema - routines to convert LANL HIV sequence DB data into XML
(This package eventually bound for bioperl-dev)

=head1 SYNOPSIS

use HIVXmlSchema qw(HIVNS);
print HIVNS;                  # returns "http://fortinbras.us/HIVDBSchema/1.0"

my $q = Bio::DB::Query::HIVQuery->new( 
    -query => "(F)[subtype] (Env)[gene] (BR ZA)[country]"
    ."{ pat_id risk_factor project }"
    );
my $xml_seq_doc   = $db->make_nexml_from_query( $q );
my $xml_annot_doc = $q->make_XML_with_ids( $q->ids );


=head1 DESCRIPTION

This package contains internal methods assigned to existing module
namespaces in BioPerl modules C<Bio::DB::HIV> and
C<Bio::DB::Query>. They are used to help create schema-valid XML
messages from sequence metadata returned by the Los Alamos National
Laboratories' CGI interface to their HIV Sequence Database.  The
custom XML namespace to which these routines correspond is
L<http://fortinbras.us/HIVDBSchema/1.0>. Schema definition files can
be obtained at that URL.

The namespace constant C<HIVNS> is exportable.

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

# put the following addition to Bio::HIV::Query::HIVQuery here, since 
# it's the workhorse

package Bio::DB::Query::HIVQuery;
use strict;
use HIVXmlSchemaHelper; # fully qualify the ns when necessary
use XML::LibXML;
use Log::Report;

=head2 Bio::DB::HIV::HIVQuery::make_XML_with_ids

 Title   : make_XML_with_ids
 Usage   : $q->make_XML_with_ids( @ids )
 Function: Create an XML document of sequence annotations, according to
           the XML Schema namespace http://fortinbras.us/HIVDBSchema/1.0
 Example :
 Returns : a[n array of] scalar string[s] (formatted XML)
 Args    : a[n array of] LANL id[s] (scalar[s])

=cut

sub make_XML_with_ids {
    my $self = shift;
    my @ids = @_;
    my (@hashes, $xml);
    unless ($self->_run_option == 2) {
	$self->warn("Method requires that query be run at level 2");
	return undef;
    }
    foreach (@ids) {
	my $h = $self->_xml_hashref_from_id($_);
	next unless $h; # skip on dne
	push @hashes, $h;
    }
    if (@hashes) {
	my $sch = Bio::DB::HIV::HIVXmlSchema->new();
	my $doc = XML::LibXML::Document->new();
	my ($wri, $guts);

	# use the Log::Report try block around $wri->() and check
	# $@; throw BP error if set.
	try {
	    $wri = $sch->make_writer;
	    $guts = $wri->($doc, { 'annotHivqSeq' => [@hashes] })
	};
	if ($@) {
	    $@->reportAll;
	    exit(0);
	    # handle XML::Compile::Schema error
	}
	else {
	    $doc->addChild($guts);
	    $xml = $doc->toString(1);
	}
    }
    else {
	# dude, no data!
	$self->warn("No XML was generated for this query");
    }
    return $xml;
}
    
1;

package Bio::DB::HIV;
use strict;
use HIVXmlSchemaHelper; # fully qualify the ns when necessary
use Bio::Phylo::Factory;

=head2 make_nexml_from_query

 Title   : make_nexml_from_query
 Usage   : $db->make_nexml_from_query( $hiv_query_object )
 Function: Create a NeXML-compliant XML document containing 
           sequences (not annotations; see 
           Bio::DB::Query::HIV::make_XML_with_ids()
           for that) associated with a Bio::DB::Query::HIVQuery
           object
 Example :
 Returns : NeXML-compliant XML document as string
 Args    : Bio::DB::Query::HIVQuery object; [optional] array of
           LANL sequence ids.
 Note    : Requires Rutger Vos' external package Bio::Phylo 

=cut

sub make_nexml_from_query{
   my ($self,@args) = @_;
   my ($q)  = @args;
   
   my $bpf = Bio::Phylo::Factory->new;
   my $seqio = $self->get_Stream_by_query( $q );
   my $dat_obj   = $bpf->create_datum();
   my $taxon_obj = $bpf->create_taxon();
   my $taxa  = $bpf->create_taxa();

   # keep in mind handling the possibility that both dna and aa 
   # data maybe present, so would require a "mixed matrix" approach
   # in Bio::Phylo
   my $mx;

   while ( my $seq = $seqio->next_seq ) {
       # need a taxon (otus) elt with the LANL id + GB accn.
       # 
       # linking a taxon to its datum? $taxon->set_data($datum)
       # put LANL ID into -name
       # put GenBank Accn into -desc
       # putting a taxon into a "taxa block"? $taxa->insert($taxon)
       # linking a 

# check first seq and make matrix (but this won't work if we have mixed data)
       $mx ||= $bpf->create_matrix( -type=>$seq->alphabet ); 
       
       my ($taxon, $datum);
       #create elements...
       $taxon = $taxon_obj->new( -name => $seq->id, 
				 -desc => $seq->annotation->get_value('Special','accession'));

       $datum = $dat_obj->new_from_bioperl($seq);
       $taxon->set_data($datum);
       #organize into containers...
       $taxa->insert( $taxon );
       $mx->insert( $datum);
       1;
   }
   
   # so if @dna != 0 and @aa != 0, we require a mixed matrix.
   # link the matrix to the taxa 'block'
   $mx->set_taxa( $taxa) 

   #!!! there's a problem: the -desc field of taxon, set to 
   # the genbank accession, does not appear in the rendered
   # XML. May require a <dict> elt or something to hold it. 
   # is it a bug; should there be a @desc attribute??

   # to deliver the XML document, need to return
   # xml header
   # Nexml root element 
   # taxa 'block' $taxa->to_xml
   # matrix 'block' $mx->to_xml(-compact=>1)
   # end Nexml root element


   1;
}



1;

package Bio::DB::HIV::HIVXmlSchema;
use strict;
use constant HIVNS => 'http://fortinbras.us/HIVDBSchema/1.0';

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
 Args    : -SCHEMADIR => $dir_containing_xsd_files or [@dirs]
           -XSCARGS   => \@array_of_XML_Compile_Schema_constructor_args

=cut

# binding prefixes needs:
# compile(..., prefixes => { SCHEMA2001 => 'xs', SCHEMA2001i => 'xsi', HIVNS => 'hivq' }

sub new{
   my ($class,@args) = @_;
   my ($schema_dir,$XSC_args) = $class->SUPER::_rearrange([qw(SCHEMADIR,XSCARGS)], @args);
   my @XSDDIRs = ($schema_dir and ref($schema_dir) eq 'ARRAY') ? @$schema_dir : ($schema_dir);
   my @XSDDIRS = (@INC, $schema_dir);
   my $self = $class->SUPER::new([SCHEMA2001,SCHEMA2001i, @schemata],
				 'schema_dirs' => [@XSDDIRS],
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
 Args    : -AT_ELT => $fully_qualified_element_name_in_hivq_ns 
           -XSCARGS => [@args_to_pass_to_compiler]

=cut

sub make_writer{
   my ($self,@args) = @_;
   my ($at_elt, $XSC_args) = $self->_rearrange([qw(AT_ELT XSCARGS)], @args);
   $at_elt ||= pack_type(HIVNS, 'HivqSeqs');
   $XSC_args ||= [];
   return $self->_hivq_writer( $self->compile('WRITER',
					      $at_elt,
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
 Args    : -AT_ELT => $fully_qualified_element_name_in_hivq_ns 
           -XSCARGS => [@args_to_pass_to_compiler]

=cut

sub make_reader{
   my ($self,@args) = @_;
   my ($at_elt, $XSC_args) = $self->_rearrange([qw(AT_ELT XSCARGS)], @args);
   $at_elt ||= 'HivqSeqs';
   $XSC_args ||= [];
   return $self->_hivq_reader( $self->compile('READER',
					      $at_elt,
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

