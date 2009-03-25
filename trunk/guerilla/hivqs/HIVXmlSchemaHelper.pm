#$Id$#
package HIVXmlSchemaHelper;
use strict;

=head1 NAME

Bio::DB::HIV::HIVXmlSchemaHelper - routines to convert LANL HIV sequence DB data into XML
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
be obtained there soon.

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

    1;

package HIVXmlSchema;
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
					      prefixes => { 
						  SCHEMA2001  => 'xs',
						  SCHEMA2001i => 'xsi',
						  HIVNS       => 'hivq'
					      },
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
					      prefixes => { 
						  SCHEMA2001  => 'xs',
						  SCHEMA2001i => 'xsi',
						  HIVNS       => 'hivq'
					      },
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

# add a couple of translation subs to HIVSchema
package HIVSchema;
use strict;
our %_ankeys_to_fields = ();
our %_values_to_codes = ();

=head1 in package HIVSchema (Bio::DB::HIV::HIVQueryHelper)

=head2 _field_from_ankey
 
 Title:     _field_from_ankey
 Usage:     $schema->_field_from_ankey($ankey)
 Function:  For converting from LANL's "native" returned annotation headers
            to C<Bio::DB::HIV>'s custom XML LANL database representation 
            (C<lanl-schema.xml>).
 Args:      a[n array of] scalar string[s], valid as <ankey> elements in 
            C<lanl-schema.xml>

=cut

sub _field_from_ankey {
    my $self = shift;
    my @args = @_;
    # memoize here
    unless (%_ankeys_to_fields) {
	my %a = $self->ankh( $self->fields );
	while ( my ($fld, $ankh) = each %a ) { 
	    $_ankeys_to_fields{$ankh->{ankey}} = $fld;
	}
    }
    return wantarray ? @_ankeys_to_fields{@args} : $_ankeys_to_fields{$args[0]};
}

=head2 _code_from_value

 Title:    _code_from_value
 Usage:    $schema->_code_from_value($fieldname, @field_values);
 Function: Convert a LANL annotation return value (encoded in the 
           C<Bio::DB::HIV> custom schema as "desc" attributes to 
           <option> elements) to the *Code attribute for the 
           XSD element associated with the (custom schema) <sfield>
           field name.
 Returns:  [an array of] code[s] (= "option" elts) looked up by field 
           value[s] (= "desc" attributes)
 Args:     the custom fieldname (in table.column format), followed by
           [an array of] the "desc" value[s] to be converted
 Note:     Requires Bio::DB::HIV::HIVQueryHelper revision 15593!

=cut

sub _code_from_value {
    my $self = shift;
    my ($fld, @val) = @_;
    # memoize here
    unless (%_values_to_codes) {
	foreach my $word ( qw( country risk_factor badseq georegion ) ) {
	    my @flds = grep /$word$/, $self->fields;
	    foreach my $f (@flds) {
		my %h;
		@h{@{$self->_sfieldh($f)->{desc}}} = 
		    @{$self->_sfieldh($f)->{option}};
		$_values_to_codes{$f} = {%h};
	    }
	}
    }
    return wantarray ? 
	@{$_values_to_codes{$fld}}{@val} : 
	$_values_to_codes{$fld}->{$val[0]};

}

1; 

package Bio::DB::Query::HIVQuery;
use strict;

=head1 in package Bio::DB::Query::HIVQuery
 
=head2 _xml_hashref_from_id
    
 Title:     _xml_hashref_from_id
 Function:  create an instance of 
            {http://fortinbras.us/HIVDBSchema/1.0}annotSeqType as a 
            hash of hashes ... of hashes suitable for use in
            XML writers compiled using XML::Compile::Schema against
            the namespace http://fortinbras.us/HIVDBSchema/1.0, using
            annotation data returned by a Bio::DB::Query::HIVQuery
            object executed at RUN_LEVEL 2.
 Arguments: an [array of] LANL sequence id number[s]
 Returns:   an array of {hash of hashes ... of hashes}
 Note:      When an annotation is returned whose value is the empty
            string (i.e. get_value($level1,$tag) is ''), the attribute
            'xsi:nil' => 'true' is returned in the hash describing the
            annotation. Whether the annotation is nillable under the
            schema or not is checked downstream from this method.
 
=cut

# todo: do not add element when all contained members are 'xsi:nil'--nah, 
# if the annotations were requested, user should know they came back empty.

# weird thing: writer thinks that the 'comments' element requires data, 
#  but its should be an optional element. So, if child elements (LANLComment, e.g
# are required, but the parent is not, you still get dinged if the parent
# element instance does not appear?? evidently.hmm

sub _xml_hashref_from_id {
    my ($self, @id) = @_;
    my $sch = $self->_schema;
    my @ret;
    my @annotTypes = ('Geo', 'Patient', 'Sample', 'StdMap', 'Virus');
    foreach my $id (@id) {
	my $ac = $self->get_annotations_by_id($id);
	my %h; # 
	# create 'registration' element

	my ($gba, $gi, $ver, $pat_id, $loc_id) = 
	    ($self->get_accessions_by_id($id),
	     $ac->get_value('Special', 'gi_number'),
	     $ac->get_value('Special', 'version'),
	     $ac->get_value('Patient', 'pat_id'),
	     $ac->get_value('Virus', 'loc_id'));
	my $reg = $h{'registration'} = {};

	$reg->{'sequenceIds'}{LANLSeqId} = $id ;
	$reg->{'sequenceIds'}{GenBankAccn} = $gba if $gba;
	$reg->{'sequenceIds'}{GI} = $gi if $gi;
	$reg->{'sequenceIds'}{SeqVersion} = $ver if $ver;
	$reg->{LANLPatientId} = $pat_id if $pat_id;
	$reg->{LANLLocationId} = $loc_id if $loc_id;

	# create annotation elements as required...
	# can leave out most 'Special' annotations (already took care of 
	# various ids)

	my ($entry, $comments_acc);
	# accumulators for annotations
	$entry = {};
	$comments_acc = {};
	# add registration element
	$entry->{registration} = $reg;

	foreach my $antype (@annotTypes) {
	    foreach my $ankey ($ac->get_keys($antype)) {
		# get the fieldname from the annotation key
		my $fld = $sch->_field_from_ankey($ankey);
		my $val = $ac->get_value($antype, $ankey);

		# now parse the fieldname to acquire the correct
		# hashref keys for an XML::Compile write for the 
		# hivqSchema...
		# handle the specials
		for ($fld) {
		    (/comment$|badseq$/) && do { 
                        # comments
			m/pat_comment/ && do {$$comments_acc{LANLPatComment}=$val;};
			m/db_comment/  && do {$$comments_acc{LANLDBComment}=$val;};
			m/gb_comment/  && do {$$comments_acc{GenBankComment}=$val;};
			m/badseq/      && do {
			    $$comments_acc{LANLProblematicSeq} = 
			    {
				$val ? 
				    (
				     'problematicValue' => $val,
				     'problemcode' => $sch->_code_from_value($fld, $val)
				    ) :
				    ('xsi:nil' => 'true')
			    };
			};
			last;
		    };
		    (/country$/) && do {
			# has attributes...
			my $tbl = $sch->tbl($fld);
			my $col = $sch->col($fld);
			$$entry{$tbl}->{$col} = 
			{
			    $val ? 
			     (
				 'countryString' => $val,
				 'ccode' => $sch->_code_from_value($fld, $val)
			     ) :
			     ( 'xsi:nil' => 'true' )
			};
			last;
		    };
		    (/risk_factor$|country$|georegion$/) && do { 
                        # have attributes...
			my $tbl = $sch->tbl($fld);
			my $col = $sch->col($fld);
			$$entry{$tbl}->{$col} = 
			{
			    $val ? 
			     (
				 $col.'String' => $val,
				 'LANLCode' => $sch->_code_from_value($fld, $val)
			     ) :
			     ( 'xsi:nil' => 'true' )
			};
			last;
		    };
		    do { 
                        # default formatted elements...
			$$entry{$sch->tbl($fld)}->{$sch->col($fld)} = 
			    $val || { 'xsi:nil' => 'true' };
			last;
		    };
		} # for ($fld)

	    }
	}
	# enter accumulated comments, if any:
	$entry->{comments} = $comments_acc if %{$comments_acc};

	# put the completed annotation hash-of-hashes into the return
	# array here.
	push @ret, $entry;
	
    }
    return @ret;
}

1;
