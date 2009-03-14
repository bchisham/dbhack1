#$Id$#

# Lanl DB xsd generator
# uses Bio::DB::HIV xml representation of the LANL DB schema
# via Bio::DB::HIV::HIVQueryHelper's HIVSchema package to 
# squish the SQL schema into an XML Schema.
#
# MAJ 11 Mar 09

# try this: don't qualify the names in the type definitions, but qualify
# in 

$|=1;
use strict;
use Bio::DB::HIV::HIVQueryHelper;
use XML::Writer;

# add a countrySimpleType "by hand"

my %fnames = (
    'simpleTypes'  => 'hivqSimpleTypes.xsd',
    'complexTypes' => 'hivqComplexTypes.xsd',
    'annotSeqType' => 'hivqAnnotSeqType.xsd',
    'main'         => 'hivqSchema.xsd'
    );

my %xmlns = (
    'XMLSchema'    => "http://www.w3.org/2001/XMLSchema",
    'HIVDBSchema'  => "http://fortinbras.us/HIVDBSchema/1.0",
    'NeXML'        => "http://www.nexml.org/1.0"
    );

my @skip_tables = qw(sequenceentry sequenceaccessions mapimage); 
# skip sequenceentry, casting sequence in NeXML
# create the id + "registration" elements
# by hand

my @skip_cols = qw();
my @skip_fields = qw( max_rec order select_all sort_dir show_sql );
my @skip_options = qw( Any );

# array to contain the complexType names
my @cTypes; 
# hash containing the simpleTypes (value,\@array) of the complexType (key)
my %sTypesOf;

my $sch = HIVSchema->new( './lanl-schema.xml' );
# use _sfieldh() method on field names to check specials
# i.e., look at attribute 'type', e.g.

my $xs = $xmlns{XMLSchema};
my $tns = $xmlns{HIVDBSchema};

my %pfmap = (  $xs => 'xs',
	       $tns => 'tns');

# create the simpleTypes .xsd

open my $st, ">$fnames{simpleTypes}" or die $!;

my $writer = XML::Writer->new( OUTPUT => $st, NAMESPACES => 1, PREFIX_MAP => \%pfmap, 'FORCED_NS_DECLS');

$writer->startTag([$xs, 'schema'],
		  'targetNamespace' => $tns,
		  'elementFormDefault' => 'qualified',
		  'attributeFormDefault' => 'unqualified');

# some utility types
$writer->startTag([$xs, 'simpleType'],
		  'name' => 'integerGt0');
{
    $writer->startTag([$xs,'restriction'],
		      'base'=>[$xs, 'integer']);
    $writer->emptyTag([$xs, 'minInclusive'],
		      'value' => 0);
    $writer->endTag([$xs, 'restriction']);
}
$writer->endTag([$xs, 'simpleType']);

foreach my $fld ($sch->fields) {
    my $tn = $sch->col($fld);
    my $tbl = $sch->tbl($fld);
#    $tn =~ s/^[a-z]{1,4}_//;
    # so, have $fld, $tbl, $tn ("basename" of the column)
    next if grep /^$fld$/, @skip_fields; # skip this field
    next if ($fld =~ /_id$/); # skip the ids- 
    next if grep /^$tbl$/, @skip_tables; # skip this table
    next if grep /^$tn$/, @skip_cols; # skip this column


    my $h = $sch->_sfieldh($fld); # attribute hash
	
    ($$h{type} eq 'option') && do { # fields with option list
	# change the type for certain fields
	$writer->startTag([$xs, 'simpleType'],
			  'name' => $tn.'Type');
	if ($tn =~ m{number|_num_}) { # to xs:integer base
	    $writer->startTag([$xs, 'restriction'],
			      'base' => [$xs, "integer"]);
	    $writer->emptyTag([$xs, 'minInclusive'],
			      'value' => 0);
	    $writer->endTag([$xs, 'restriction']);
	}
	elsif ($tn =~ m{year$}) { # to xs:gYear base
	    $writer->startTag([$xs, 'restriction'],
			      'base' => [$xs,'gYear']);
	    $writer->endTag;
	}
	else { # default: create an "enum type"
	    $writer->startTag([$xs, 'restriction'],
			      'base' => [$xs, "string"]);
	    $writer->emptyTag([$xs, 'maxLength'],
			      'value' => 100);
	    foreach my $opt ($sch->options($fld)) {
		next if grep /^$opt$/, @skip_options; # skip
		$writer->emptyTag([$xs, 'enumeration'],
				  'value' => $opt);
	    }
	    $writer->endTag([$xs, 'restriction']);
	}
	$writer->endTag([$xs, 'simpleType']);
    };
    ($$h{type} eq 'text') && do { # free text fields that may need 
                                  # or expect more explicit type restriction...
	$writer->startTag([$xs, 'simpleType'],
			  'name' => $tn.'Type');

	# type restrictions based on name patterns...
	if ($tn =~ m{_days$|_age$|number|_num_|count$|viral_load}) {
	    # including ..._id here...
	    $writer->startTag([$xs, 'restriction'],
			      'base' => [$xs,"integer"]);
	    $writer->emptyTag([$xs, 'minInclusive'],
			      'value' => 0);
	    $writer->endTag([$xs, 'restriction']);
	}
	else { # plain text
	    $writer->startTag([$xs, 'restriction'],
			      'base' => [$xs,"string"]);
	    $writer->emptyTag([$xs, 'maxLength'],
			      'value' => 100);
	    $writer->endTag([$xs, 'restriction']);
	}
	$writer->endTag([$xs, 'simpleType']);
	
    };
}

$writer->endTag([$xs, 'schema']); # simpleTypes .xsd
$writer->end();
close($st);

# create complexTypes .xsd

open my $ct, ">$fnames{complexTypes}" or die $!; 

$writer = XML::Writer->new( OUTPUT => $ct, NAMESPACES => 1, PREFIX_MAP => \%pfmap, 'FORCED_NS_DECLS');

$writer->startTag([$xs, 'schema'],
		 'targetNamespace' => $tns,
		 'elementFormDefault' => 'qualified',
		 'attributeFormDefault' => 'unqualified');
$writer->startTag([$xs, 'include'],
		 'schemaLocation' => $fnames{'simpleTypes'});
$writer->endTag;

foreach my $tbl ($sch->tables) {
    next if grep /^$tbl$/, @skip_tables;
    next if $tbl eq 'COMMAND'; # create genomic_region elt by hand below
    my @cols = $sch->columns($tbl);
    $writer->startTag([$xs, 'complexType'],
		      'name' => $tbl.'Type');
    push @cTypes, $tbl.'Type';
    $writer->startTag([$xs, 'sequence']);
    foreach my $col (@cols) {
	next if $col=~/_id$/; # skip ids
#	$col =~ s/^[a-z]{1,4}_//;
	$writer->emptyTag([$xs, 'element'],
			  'name' => $col,
			  'type' => [$tns, $col."Type"],
			  'minOccurs' => 0);
    }
    $writer->endTag([$xs, 'sequence']);
    $writer->endTag([$xs, 'complexType']);
}

$writer->endTag([$xs, 'schema']); # complexTypes .xsd
$writer->end;
close($ct);

# create the 'annotationSequence' .xsd

open my $at, ">$fnames{annotSeqType}" or die $@;

$writer = XML::Writer->new( OUTPUT => $at, NAMESPACES => 1, PREFIX_MAP => \%pfmap, 'FORCED_NS_DECLS');

# what namespaces, includes, schemaLocations here??
$writer->startTag([$xs, 'schema'],
		  'targetNamespace'    => $xmlns{HIVDBSchema},
		  'elementFormDefault' => 'qualified',
		  'attributeFormDefault' => 'unqualified');
# include types by reference 
# (might not need the simpleTypes here...)
$writer->emptyTag([$xs, 'include'], 
		  'schemaLocation' => $fnames{simpleTypes});
$writer->emptyTag([$xs, 'include'], 
		  'schemaLocation' => $fnames{complexTypes});
# need a 'registration' type
# all the issues of ids start to come into play here.?

# make a complexType encompassing the registration
# should the 'registrationType' have slots for all the ids that could be 
# associated with the seq? (which are: 
# 'sequenceentry.se_id'
# 'sequenceaccessions.sa_genbankaccession'
#  sequenceaccessions.sa_gi
#  sequenceaccessions.sa_version
# 'location2.loc_id'
# 'patient.pat_id'
# 'person.per_id'
# 'publication.pub_id'
# 'author.au_per_id' *
# 'author.au_pub_id' *
# 'location2.loc_se_id' *
# 'mapimage.mi_se_id' *
# 'se_pub_link.spl_pub_id' *
# 'se_pub_link.spl_se_id' *
# 'seq_sample.ssam_pat_id' *
# 'seq_sample.ssam_se_id' *
# 'seqentryfeature.sef_pub_id' *
# 'seqentryfeature.sef_se_id' *
# 'sequenceaccessions.sa_se_id' *
# 'sequencefeature2.sf_loc_id' *
# 'sequencemap.sm_se_id' *
#
# * = foreign key; leave these out

# presumably, if the sequence has been obtained via a join among the tables 
# represented by these ids (ssam, se, sa, pub, per, and/or loc), then
# the table record ids given in the registration element all pertain
# to one another and to the sequence -- so it's reasonable to group them

$writer->startTag([$xs, 'complexType'],
		  'name'=>'registrationType');
$writer->startTag([$xs, 'sequence']);
{
    $writer->startTag([$xs, 'element'],
		      'name' => 'sequenceIds');
    $writer->startTag([$xs, 'complexType']);
    {
	$writer->startTag([$xs, 'sequence']);
	{
	    $writer->emptyTag([$xs, 'element'],
			      'name' => 'LANLSeqId',
			      'type' => [$tns, 'integerGt0'],
			      'minOccurs'=>1); # must have
	    $writer->startTag([$xs, 'element'],
			      'name' => 'GenBankAccn',
			      'minOccurs' => 0);
	    {
		$writer->startTag([$xs, 'simpleType']);
		$writer->startTag([$xs, 'restriction'],
				  'base' => [$xs, 'string']);
		$writer->emptyTag([$xs, 'pattern'],
				  'value' => "[A-Z]{2}[0-9]+");
		$writer->endTag([$xs, 'restriction']);
		$writer->endTag([$xs, 'simpleType']);
	    }
	    $writer->endTag([$xs, 'element']);
	    
	    $writer->emptyTag([$xs, 'element'],
			      'name' => 'GI',
			      'type' => [$tns, 'integerGt0'],
			      'minOccurs' => 0);

	}
	$writer->endTag([$xs, 'sequence']);
    }
    $writer->endTag([$xs, 'complexType']);
    $writer->endTag([$xs, 'element']); # sequenceIds

    $writer->emptyTag([$xs, 'element'],
		      'name'      => 'LanlPatientId',
		      'type'      => [$tns, 'integerGt0'],
		      'minOccurs' => 0);
    $writer->emptyTag([$xs, 'element'],
		      'name'      => 'LanlLocationID',
		      'type'      => [$tns, 'integerGt0'],
		      'minOccurs' => 0);
    $writer->startTag([$xs, 'element'],
		      'name'      => 'LanlPubInfo',
		      'minOccurs' => 0);
    $writer->startTag([$xs, 'complexType']);
    {
	$writer->startTag([$xs, 'sequence']);
	{
	    $writer->emptyTag([$xs, 'element'],
			      'name'      => 'LanlPersonID',
			      'type'      => [$tns, 'integerGt0'],
			      'minOccurs' => 0);
	    $writer->emptyTag([$xs, 'element'],
			      'name'      => 'LanlPubID',
			      'type'      => [$tns, 'integerGt0'],
			      'minOccurs' => 0);
	    $writer->emptyTag([$xs, 'element'],
			      'name'      => 'LanlPubLink',
			      'type'      => [$xs, 'anyURI'],
			      'minOccurs' => 0);
	}
	$writer->endTag([$xs, 'sequence']);
    }
    $writer->endTag([$xs, 'complexType']);
    $writer->endTag([$xs, 'element']); # LanlPubInfo

}
$writer->endTag([$xs, 'sequence']);
$writer->endTag([$xs, 'complexType']); # registrationType

# create the final schema element type
# how does this work? 
#  each complexType is a sequence of simpleTypes, the complexType corresponding
#  to the table, the simpleTypes corresponding to the table columns
#
# all the primary key ids, plus gb accn and gi, are wrapped into the 
# registration element of type registrationType.
#

$writer->startTag([$xs, 'complexType'],
		  'name' => 'annotSeqType');
$writer->startTag([$xs, 'sequence']);
{
    $writer->emptyTag([$xs, 'element'],
		      'name' => 'registration',
		      'type' => [$tns,'registrationType'],
		      'minOccurs' => 1,
		      'maxOccurs' => 1); # must have one and only one per rec
    foreach my $ctype (@cTypes) {
	my ($tn) = ($ctype =~ /^(.*)Type$/);
	$writer->emptyTag([$xs, 'element'],
			  'name'=>$tn,
			  'type'=>[$tns, $ctype],
			  'minOccurs'=>0); # all lower level annotations are
	                                   # optional
    }
    $writer->emptyTag([$xs, 'element'],
		      'name' => 'genomic_region',
		      'type' => [$tns, 'genomic_regionType'],
		      'minOccurs' => 0,
		      'maxOccurs' => 1 # may need to be more liberal here?
	);
}
$writer->endTag([$xs, 'sequence']);
$writer->endTag([$xs, 'complexType']);	# annotSeqType

$writer->endTag([$xs, 'schema']); # annotSeqType .xsd
close($at);

open my $scht, ">$fnames{main}" or die $!;
$writer = XML::Writer->new( OUTPUT => $scht, NAMESPACES => 1, PREFIX_MAP => \%pfmap, 'FORCED_NS_DECLS');

$writer->startTag([$xs, 'schema'],
		  'targetNamespace' => $tns,
		  'elementFormDefault' => 'qualified',
		  'attributeFormDefault' => 'unqualified');
$writer->emptyTag([$xs, 'include'], 
		  'schemaLocation' => $fnames{simpleTypes});
$writer->emptyTag([$xs, 'include'], 
		  'schemaLocation' => $fnames{complexTypes});
$writer->emptyTag([$xs, 'include'], 
		  'schemaLocation' => $fnames{annotSeqType});
$writer->startTag([$xs, 'element'],
		  'name'=>'HivqSeqs');
$writer->startTag([$xs, 'complexType']);
{
    $writer->startTag([$xs, 'sequence']);
    {
	$writer->emptyTag([$xs, 'element'],
			  'name'=>'annotHivqSeq',
			  'type'=>[$tns, 'annotSeqType'],
			  'minOccurs'=>0,
			  'maxOccurs'=>'unbounded');
    }
    $writer->endTag([$xs, 'sequence']);
}
$writer->endTag([$xs, 'complexType']);
$writer->endTag([$xs, 'element']);

$writer->endTag([$xs, 'schema']); # top level schema .xsd
close($scht);
1;
