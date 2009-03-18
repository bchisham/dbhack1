#$Id$#

# Lanl DB xsd generator
# uses Bio::DB::HIV xml representation of the LANL DB schema
# via Bio::DB::HIV::HIVQueryHelper's HIVSchema package to 
# squish the SQL schema into an XML Schema.
#
# MAJ 11 Mar 09

# fix the coreceptor type
# countrySimpleType for all fields matching /_country$/

# some annotations are returned as expansions of codes
# that are contained in the actual db cells...
# find these and create attributes for the codes, 
# and contain the returned values in the element
# for which that code is an attribute.
# call the code an 'alt' attribute
#
# in the custom xml, these are 'option' elements with 
# a 'desc' attribute: the elt text is the DB celldata,
# the 'desc' value is the returned info
#
# the fields to handle like this:
#  patient.pat_risk_factor
#  seq_sample.ssam_badseq
#  seq_sample.ssam_sample_georegion

# the attribute thing:
# define a simpleType to specific the option elts for the attribute
#   (simpleType, restriction/base, enumeration)
# define a complexType to contain the data:
#  FIRST, (all, element)
#  THEN, (attribute name='the_name' type='simple_type_defined_above' use='required')

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

my @skip_tables = qw(sequenceentry sequenceaccessions mapimage publication); 
# skip sequenceentry, casting sequence in NeXML
# publication db is not worth it; better to slurp from genbank with the gbacc
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

my $pp = "| xml_pp -s indented ";
open my $st, "$pp > $fnames{simpleTypes}" or die $!;

my $writer = XML::Writer->new( OUTPUT => $st, NAMESPACES => 1, PREFIX_MAP => \%pfmap, 'FORCED_NS_DECLS');

$writer->xmlDecl("UTF-8");
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

my $got_country = 0;

foreach my $fld ($sch->fields) {
    my $tn = $sch->col($fld);
    my $tbl = $sch->tbl($fld);
#    $tn =~ s/^[a-z]{1,4}_//;
    # so, have $fld, $tbl, $tn ("basename" of the column)
    next if grep /^$fld$/, @skip_fields; # skip this field
    next if ($fld =~ /_id$/); # skip the ids- 
    next if grep /^$tbl$/, @skip_tables; # skip this table
    next if grep /^$tn$/, @skip_cols; # skip this column

    if ($fld =~ /_country$/) {
	next if $got_country;
	$got_country = 1;
	$tn = 'country';
    }
	
    my $h = $sch->_sfieldh($fld); # attribute hash
    # handle the attribute/element specials described in comments above...
    ($tn eq 'country') && do {
	# define the countryCodeType
	$writer->startTag([$xs, 'simpleType'],
			  'name'=>'countryCodeType');
	$writer->startTag([$xs, 'restriction'],
			  'base'=>[$xs, 'string']);
	{ # 2-letter country code as attribute
	    map { 
		($_ ne 'Any') ? $writer->emptyTag([$xs, 'enumeration'],
					'value' => $_) : ()
	    } ($sch->options($fld));
	}
	$writer->endTag([$xs, 'restriction']);
	$writer->endTag([$xs, 'simpleType']);

	# define the countryType, has ccode attribute, contains 
	# the 'countryString' element
	$writer->startTag([$xs, 'complexType'], 
			  'name' => 'countryType');
	{
	    # country name as returned, element text
	    $writer->startTag([$xs, 'all']);
	    {
		$writer->startTag([$xs, 'element'],
				  'name'=>'countryString',
				  'minOccurs' => 1,
				  'maxOccurs' => 1);
		$writer->startTag([$xs, 'simpleType']);
		{
		    $writer->startTag([$xs, 'restriction'],
				      'base'=>[$xs,'string']);
		    $writer->emptyTag([$xs, 'maxLength'],
				      'value' => 50);
		    $writer->endTag([$xs, 'restriction']);
		}
		$writer->endTag([$xs, 'simpleType']);
		$writer->endTag([$xs, 'element']);
	    }
	    $writer->endTag([$xs, 'all']);

	    $writer->emptyTag([$xs, 'attribute'],
			      'name' => 'ccode',
			      'type' => [$tns, 'countryCodeType'],
			      'use' => 'required');
	}
	$writer->endTag([$xs, 'complexType']);
	next;
    };

    ($tn =~ /risk_factor$|badseq$|georegion$/) && do {
	$writer->startTag([$xs, 'simpleType'],
			  'name' => $tn.'CodeType');
	$writer->startTag([$xs, 'restriction'],
			  'base'=>[$xs, 'string']);
	{
	    map {
		($_ ne 'Any') ? $writer->emptyTag([$xs, 'enumeration'],
					'value'=>$_) : ()
	    } ($sch->options($fld));
	}
	$writer->endTag([$xs, 'restriction']);
	$writer->endTag([$xs, 'simpleType']);

	$writer->startTag([$xs, 'complexType'],
			  'name' => $tn.'Type');
	{
	    $writer->startTag([$xs, 'all']);
	    {
		$writer->startTag([$xs, 'element'],
				  'name' => $tn.'String',
				  'minOccurs'=>1,
				  'maxOccurs'=>1);
		$writer->startTag([$xs, 'simpleType']);
		{
		    $writer->startTag([$xs, 'restriction'],
				      'base'=>[$xs, 'string']);
		    $writer->emptyTag([$xs, 'maxLength'],
				      'value' => 50);
		    $writer->endTag([$xs, 'restriction']);
		}
		$writer->endTag([$xs, 'simpleType']);
		$writer->endTag([$xs, 'element']);
	    }
	    $writer->endTag([$xs, 'all']);
	}
	$writer->emptyTag([$xs, 'attribute'],
			  'name' => 'LANLcode',
			  'type' => [$tns, $tn.'CodeType'],
			  'use' => 'required');
	$writer->endTag([$xs, 'complexType']);
	next;
    };
    ($$h{type} eq 'option') && do { # fields with option list
	# change the type for certain fields
	$writer->startTag([$xs, 'simpleType'],
			  'name' => $tn.'Type');
	if ($tn =~ m{number|_num_}) { # to xs:integer base
	    $writer->startTag([$xs, 'restriction'],
			      'base' => [$xs, 'integer']);
	    $writer->emptyTag([$xs, 'minInclusive'],
			      'value' => 0);
	    $writer->endTag([$xs, 'restriction']);
	}
	elsif ($tn =~ m{year$}) { # to xs:gYear base
	    $writer->emptyTag([$xs, 'restriction'],
			      'base' => [$xs,'gYear']);
	}
	else { # default: create an "enum type"
	    $writer->startTag([$xs, 'restriction'],
			      'base' => [$xs, 'string']);
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

open my $ct, "$pp > $fnames{complexTypes}" or die $!; 

$writer = XML::Writer->new( OUTPUT => $ct, NAMESPACES => 1, PREFIX_MAP => \%pfmap, 'FORCED_NS_DECLS');

$writer->xmlDecl("UTF-8");
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
    $writer->startTag([$xs, 'all']);
    foreach my $col (@cols) {
	next if $col=~/_id$/; # skip ids
	# handle specials
	if ($col =~ /country$/) {
	    $writer->emptyTag([$xs,'element'],
			      'name'=>$col,
			      'type'=>[$tns, 'countryType'],
			      'minOccurs' => 0);
	}
	# default
	else {
	    $writer->emptyTag([$xs, 'element'],
			      'name' => $col,
			      'type' => [$tns, $col."Type"],
			      'minOccurs' => 0);
	}
    }
    $writer->endTag([$xs, 'all']);
    $writer->endTag([$xs, 'complexType']);
}

$writer->endTag([$xs, 'schema']); # complexTypes .xsd
$writer->end;
close($ct);

# create the 'annotationSequence' .xsd

open my $at, "$pp > $fnames{annotSeqType}" or die $@;

$writer = XML::Writer->new( OUTPUT => $at, NAMESPACES => 1, PREFIX_MAP => \%pfmap, 'FORCED_NS_DECLS');

$writer->xmlDecl("UTF-8");
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
			      'name' => 'SeqVersion',
			      'type' => [$tns, 'integerGt0'],
			      'minOccurs' => 0);
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
		      'name'      => 'LANLPatientId',
		      'type'      => [$tns, 'integerGt0'],
		      'minOccurs' => 0);
    $writer->emptyTag([$xs, 'element'],
		      'name'      => 'LANLLocationID',
		      'type'      => [$tns, 'integerGt0'],
		      'minOccurs' => 0);
}
$writer->endTag([$xs, 'sequence']);
$writer->endTag([$xs, 'complexType']); # registrationType

# type for commenty things

$writer->startTag([$xs, 'complexType'],
		  'name' => 'commentType');
$writer->startTag([$xs, 'all']);
{
    $writer->emptyTag([$xs, 'element'],
		      'name'=>'LANLDBComment',
		      'type'=>[$xs,'string'],
		      'minOccurs' => 0,
		      'maxOccurs' => 1);
    $writer->emptyTag([$xs, 'element'],
		      'name'=>'GenBankComment',
		      'type'=>[$xs, 'string'],
		      'minOccurs' => 0,
		      'maxOccurs' => 1);
    $writer->emptyTag([$xs,'element'],
		      'name'=>'LANLPatComment',
		      'type'=>[$xs, 'string'],
		      'minOccurs' => 0,
		      'maxOccurs' => 1);
    $writer->startTag([$xs, 'element'],
		      'name'=>'LANLProblematicSeq',
		      'minOccurs' => 0,
		      'maxOccurs' => 1);
    {
	$writer->startTag([$xs, 'complexType']);
	{
	    $writer->startTag([$xs, 'all']);
	    {
		$writer->startTag([$xs, 'element'],
				  'name' => 'problematicValue',
				  'minOccurs' => 1,
				  'maxOccurs' => 1);
		$writer->startTag([$xs, 'simpleType']);
		{
		    $writer->startTag([$xs, 'restriction'],
				      'base'=>[$xs,'string']);
		    $writer->emptyTag([$xs, 'maxLength'],
				      'value' => 50);
		    $writer->endTag([$xs, 'restriction']);
		}
		$writer->endTag([$xs, 'simpleType']);
		$writer->endTag([$xs, 'element']);
	    }
	    $writer->endTag([$xs, 'all']);

	    $writer->emptyTag([$xs, 'attribute'],
			      'name' => 'problemcode',
			      'type' => [$tns, 'ssam_badseqCodeType'],
			      'use'  => 'required');
	}
	$writer->endTag([$xs, 'complexType']);
    }
    $writer->endTag([$xs, 'element']);
}
$writer->endTag([$xs, 'all']);
$writer->endTag([$xs, 'complexType']);
	
		      

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
$writer->startTag([$xs, 'all']);
{
    $writer->emptyTag([$xs, 'element'],
		      'name' => 'registration',
		      'type' => [$tns,'registrationType'],
		      'minOccurs' => 1,
		      'maxOccurs' => 1); # must have one and only one per rec
    $writer->emptyTag([$xs, 'element'],
		      'name' => 'comments',
		      'type' => [$tns, 'commentType'],
		      'minOccurs' => 0,
		      'maxOccurs' => 1); # optional
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
$writer->endTag([$xs, 'all']);
$writer->endTag([$xs, 'complexType']);	# annotSeqType

$writer->endTag([$xs, 'schema']); # annotSeqType .xsd
close($at);

open my $scht, "$pp > $fnames{main}" or die $!;
$writer = XML::Writer->new( OUTPUT => $scht, NAMESPACES => 1, PREFIX_MAP => \%pfmap, 'FORCED_NS_DECLS');
$writer->xmlDecl("UTF-8");
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
