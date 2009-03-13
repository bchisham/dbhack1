#!/usr/bin/perl

use strict;
use warnings;

# This is a CGI interface into an instantiation of TreeBASE in postgres.
# It provides an experimental REST interface using the PhyloWS protocol
#
# Copyright (C) William Piel 2009 (piel@treebase.org) with chunks 
# borrowed from Mike Taylor [$Id: sru.pl,v 1.11 2008-04-11 14:20:42 mike Exp $]
# and Andrew Sterling Hanenkamp [http://www.onlamp.com/onlamp/2008/02/19/library]
#
# Distribution of copies and dervative works are allowed so long as credits
# to the above authors are reiterated

use CGI qw/:standard/;
use CQL::Parser;
use DBI;
use Data::Dumper;

use lib '/Library/WebServer/CGI-Executables/perllib/XML-Twig-3.32/blib/lib';
use lib '/Library/WebServer/CGI-Executables/perllib/perl/lib';

my $corestatement = q|SELECT DISTINCT t.tree_id FROM trees t JOIN nodes n ON (t.tree_id = n.tree_id)
LEFT JOIN taxon_variants tv ON (n.taxon_variant_id = tv.taxon_variant_id)
LEFT JOIN taxa tx ON (tv.taxon_id = tx.taxon_id)
JOIN taxon_variants qtv ON (qtv.taxon_id = tx.taxon_id) |;

my $node_statement = q|SELECT DISTINCT t.tree_id FROM trees t JOIN nodes n ON (t.tree_id = n.tree_id) |;

my $tx_statement = q|SELECT DISTINCT t.tree_id FROM trees t JOIN nodes n ON (t.tree_id = n.tree_id)
LEFT JOIN taxon_variants tv ON (n.taxon_variant_id = tv.taxon_variant_id)
LEFT JOIN taxa tx ON (tv.taxon_id = tx.taxon_id) |;

my $tv_statement = q|SELECT DISTINCT t.tree_id FROM trees t JOIN nodes n ON (t.tree_id = n.tree_id)
LEFT JOIN taxon_variants tv ON (n.taxon_variant_id = tv.taxon_variant_id)
LEFT JOIN taxa tx ON (tv.taxon_id = tx.taxon_id)
JOIN taxon_variants qtv ON (qtv.taxon_id = tx.taxon_id) |;

my $h_statement = q|SELECT DISTINCT t.tree_id FROM trees t JOIN nodes n ON (t.tree_id = n.tree_id)
JOIN taxon_variants tv ON (n.taxon_variant_id = tv.taxon_variant_id)
JOIN taxa tx ON (tv.taxon_id = tx.taxon_id)
JOIN ncbi_names nna ON (tx.taxid = nna.tax_id)
JOIN ncbi_nodes nno ON (nna.tax_id = nno.tax_id),
ncbi_names hna NATURAL JOIN ncbi_nodes hno
WHERE nno.left_id >= hno.left_id
AND nno.left_id < hno.right_id |;

# We only need the object factory
use Bio::Phylo::Factory;

use Bio::Phylo::Treedrawer;
#use Bio::Phylo::Util::Logger;

#my $logger = Bio::Phylo::Util::Logger->new;
#$logger->VERBOSE( 
#	-level => 4,
#	-class => 'Bio::Phylo::Treedrawer'
#);

# Helps during debugging
$ENV{REQUEST_METHOD} = 'GET' unless defined $ENV{REQUEST_METHOD};

my $database = "tbtrees";
#my $username = "dbhack1";
#my $password = 'dbh@ck1';
my $username = "piel";
my $password = '';

my $proj;
my %obj_by_name;
my $tree;
my $forest;
my $fac;
my $qstring;
my ($openCom, $closeCom);

my $q = CGI->new;


#==============================================================
sub error {
    my %_messages = (
		     1 => "General system error",
		     4 => "Unsupported operation",
		     5 => "Unsupported version",
		     10 => "Query syntax error",
		     39 => "Proximity not supported",
		     61 => "First record position out of range",
		     66 => "Unknown schema for retrieval",
		     );

    my($code, $details) = @_;
    $details =~ s/&/&amp;/g;
    $details =~ s/</&lt;/g;
    $details =~ s/>/&gt;/g;
    my $message = $_messages{$code} || "Oops!";

print qq|
<?xml version="1.0"?>
<zs:searchRetrieveResponse xmlns:zs='http://www.loc.gov/zing/srw/'>
  <zs:version>1.1</zs:version>
  <zs:diagnostics xmlns='info:srw/schema/1/diagnostic-v1.1'>
    <diagnostic>
      <uri>info:srw/diagnostic/1/$code</uri>
      <details>$details</details>
      <message>$message</message>
    </diagnostic>
  </zs:diagnostics>
</zs:searchRetrieveResponse>|;
	exit;
	
}


#==============================================================
sub barf($$;$) {
    my ($status, $title, $message) = @_;

    die {
        status  => $status, 
        title   => $title, 
        message => $message,
    };
}

my $self_url = $q->url( -full => 1 );
#==============================================================
sub absolute_url($) {
    my $path = shift;
    return $self_url . $path;
}

#==============================================================
# Store the path into this variable for easy dispatch in a moment
#local $_ = $q->path_info;

sub GET($$) {
    my ($path, $code) = @_;
    return unless $q->request_method eq 'GET' or $q->request_method eq 'HEAD';
    return unless $q->path_info =~ $path;
    $code->();
    exit;
}

#==============================================================
sub POST($$) {
    my ($path, $code) = @_;
    return unless $q->request_method eq 'POST';
    return unless $q->path_info =~ $path;
    $code->();
    exit;
}

#==============================================================
sub PUT($$) {
    my ($path, $code) = @_;
    return unless $q->request_method eq 'PUT';
    return unless $q->path_info =~ $path;
    $code->();
    exit;
}

#==============================================================
sub DELETE($$) {
    my ($path, $code) = @_;
    return unless $q->request_method eq 'DELETE';
    return unless $q->path_info =~ $path;
    $code->();
    exit;
}


# walktree
#==============================================================
sub walktree {
	my $dbh = shift;
	my $children = shift;
	my $current_parent_id = shift;
	my $support = shift;
	my $length = shift;
	
	my $statement = "SELECT COUNT(*) FROM edges WHERE parent_id = $current_parent_id";
	my $totRec = $dbh->selectrow_array ($statement);
	
	#print "(" if ($totRec > 0);
	
	# making sure that the parent node object
	# exists and is part of the tree
	if ( not exists $obj_by_name{$current_parent_id} ) {
		$obj_by_name{$current_parent_id} = $fac->create_node( -name => $current_parent_id );
		$tree->insert( $obj_by_name{$current_parent_id} );
	}

	$children->execute($current_parent_id);
	
	my $br = 0;
	for my $row (@{$children->fetchall_arrayref}) {
		$br++;
		my ($id, $label, $edge_length, $edge_support, $nodeid) = @$row;
		
		$statement = "SELECT COUNT(*) FROM edges WHERE parent_id = $current_parent_id";
		$totRec = $dbh->selectrow_array ($statement);
		
		# making sure that the child node object
		# exists and is part of the tree
		if ( not exists $obj_by_name{$id} ) {
			$statement = "SELECT t.namestring, t.namebankid, taxid ";
			$statement .= "FROM nodes n, taxa t ";
			$statement .= "WHERE (n.taxon_id = t.taxon_id AND n.node_id = $nodeid) ";
			my ($namestring, $namebankid, $taxid) = $dbh->selectrow_array ($statement);
			
			if ($label) {
				print "$openCom taxon_label: $label $closeCom\n";
				print "$openCom taxon: $namestring $closeCom\n" if ($namestring);
				print "$openCom ubio_namebankid: $namebankid $closeCom\n" if ($namebankid);
				print "$openCom ncbi_taxid: $taxid $closeCom\n" if ($taxid);
				print "$openCom         xxx           $closeCom\n";
			}
			
			if ($edge_length) {
				$obj_by_name{$id} = $fac->create_node( -name => $label, -branch_length => $edge_length );
			} else {
				$obj_by_name{$id} = $fac->create_node( -name => $label );
			}
			$tree->insert( $obj_by_name{$id} );
		}
		
		# now that we're sure the both exist,
		# we can connect the two nodes
		$obj_by_name{$id}->set_parent( $obj_by_name{$current_parent_id} );

		#print &tokenize($label);
		walktree($dbh, $children, $id, $edge_support, $edge_length);
		#print "," if ($br < $totRec);
	}
	
	if ($totRec > 0) {
		#print ")". &tokenize($support);
		#print ":". &tokenize($length) if ($length);
	} else {
		#print ":". &tokenize($length) if ($length);
	}
}

# tokenize -- encapsulate tokens according to nexus rules
# technically speaking, single quotes should be repeated
# e.g. change "It's nice" to "'It''s nice'", but I'd rather not
# mess with that, so I'm changing all single quotes to double
#==============================================================
sub tokenize {

    my $token = shift;
   
    $token =~ s/\'/\"/g;
   
    if ($token =~ m/[-\/\?\<\>\*\%\&\$\#\@\!\"]/) {
        $token = "\'$token\'";
    } else {
        $token =~ s/\s/_/g;
    }
   
    return ($token);

}

# Connect to Postgres using DBI
#==============================================================
sub ConnectToPg {

    my ($cstr, $user, $pass) = @_;
   
    $cstr = "DBI:Pg:dbname="."$cstr";
    #$cstr .= ";host=dev.nescent.org";
   
    my $dbh = DBI->connect($cstr, $user, $pass, {PrintError => 1, RaiseError => 1});
    $dbh || &error("DBI connect failed : ",$dbh->errstr);

    return($dbh);
}

#==============================================================
sub query_tree {

    my($node, $dbh) = @_;

	# this node is not a term
	if (!$node->isa("CQL::TermNode")) {
		if (!$node->isa("CQL::ProxNode")) {
			#print "(";
			$qstring .= "(";
			# investigate the left branch
			query_tree($node->left(), $dbh);

			if ($node->isa("CQL::AndNode")) {
				#print " AND ";
				$qstring .= "\nINTERSECT\n";
			} elsif ($node->isa("CQL::OrNode")) {
				#print " OR ";
				$qstring .=  "\nUNION\n";
			} elsif ($node->isa("CQL::NotNode")) {
				#print " NOT ";
				$qstring .= "\nEXCEPT\n";
			} else {
				#print " AND ";
				$qstring .= "\nINTERSECT\n";
			}
			# investigate the right branch
			query_tree($node->right(), $dbh);
			#print ")";
			$qstring .= ")";
		} else {
		# oops
		error( 39, "No support for proximity searching" );		
		}
	} elsif($node->isa("CQL::TermNode")) {
		# this node is a term
		my $relation = $node->getRelation();
		
		my $getQualifier = $node->getQualifier();
		my $getBase = $relation->getBase();
		my $getTerm = $node->getTerm();

		if ($getQualifier eq "taxon_name") {
			$qstring .= "($tv_statement\nWHERE qtv.fullnamestring LIKE ";
			$qstring .= $dbh->quote($getTerm);
			$qstring .= ")";
		} elsif ($getQualifier eq "taxon_label") {
			$qstring .= "($node_statement\nWHERE n.node_label LIKE ";
			$qstring .= $dbh->quote($getTerm);
			$qstring .= ")";
		} elsif ($getQualifier eq "h.taxon_name") {
			$qstring .= "($h_statement\nAND hna.name_txt LIKE ";
			$qstring .= $dbh->quote($getTerm);
			$qstring .= ")";
		} elsif ($getQualifier eq "ncbi_taxid") {
			if ($getTerm =~ m/^\d+$/) {
				$qstring .= "($tx_statement\nWHERE tx.taxid = $getTerm)";
			} else {
				error( 1, "ncbi_taxid must be a number" );
			}
		} elsif ($getQualifier eq "h.ncbi_taxid") {
			if ($getTerm =~ m/^\d+$/) {
				$qstring .= "($h_statement\nAND hna.tax_id = $getTerm)";
			} else {
				error( 1, "h.ncbi_taxid must be a number" );
			}
		} elsif ($getQualifier eq "ubio_namebankid") {
			if ($getTerm =~ m/^\d+$/) {
				$qstring .= "($tv_statement\nWHERE tv.namebankid = $getTerm)";
			} else {
				error( 1, "ubio_namebankid must be a number" );
			}
		} elsif ($getQualifier eq "taxon_id") {
			if ($getTerm =~ m/^\d+$/) {
				$qstring .= "($tx_statement\nWHERE tx.taxon_id = $getTerm)";
			} else {
				error( 1, "taxon_id must be a number" );
			}
		} else {
			error( 1, "search terms allowed: taxon_name, taxon_label, ncbi_taxid, ubio_namebankid, taxon_id, h.ncbi_taxid, h.taxon_name" );
		}
		
	} else {
		# oops
		error( 1, "unrecognised term-node $node" );
	}
}


#==============================================================
eval {

#============================
# Provide some documentation
    GET qr{^/phylows/?$} => sub {
        print $q->header('text/html');

        print $q->h1('TreeBASE REST API Documentation');
        
print q{
<p><b>Here is a list of what you can do now:</b></p>
<dl><dt>GET /phylows/tree/&lt;identifier&gt;/[{format}=&lt;format&gt;]</dt> <dd>Returns a tree, e.g. &lt;identifier&gt; = LTB:Tree1234 or TB:1234. Format is nexus or defaults to NeXML.</dd> <dt>GET /phylows/tree/&lt;identifier&gt;/clade/&lt;nodeID&gt;/[{format}=&lt;format&gt;]</dt>
	<dd>Retrieve a clade (subtree) of a tree. Format is nexus or defaults to NeXML.</dd>
</dl>
<p><b>Some example searches using SRU/CQL:</b></p>
<p>Search terms (&quot;indices&quot;): </p>
<p><b>taxon_name</b> is a string such as &quot;Homo sapiens&quot;, &quot;Homo sapiens Linnaeus, 1758&quot;, &quot;Mammalia&quot; etc...<br>
	<b>taxon_label</b> is a string attached to the node of a tree<br>
	<b>ncbi_taxid</b> is a integer used by NCBI to track its taxonomic names<br>
	<b>ubio_namebankid</b> is an integer used by uBio to track taxonomic names<br>
	<b>taxon_id</b> is an integer for TreeBASE's own taxonomic names<br>
	<b>h.ncbi_taxid</b> is a higher classification search based on NCBI's classification and using the NCBI's taxid<br>
	<b>h.taxon_name</b> is a higher classification search based on NCBI's classification and using a taxon name string.</p>
<dl><dt>GET /phylows/find/tree/?query=taxon_name+any+%22Homo+sapiens%25%22+and+ncbi_taxid+%3D+9593&amp;operation=searchRetrieve&amp;recordSchema=pc</dt> <dd>Returns all trees that have both a taxon starting with &quot;Homo sapiens&quot; and a node linked to NCBI taxid 9593 (which = <i>Gorilla gorilla</i>)</dd> <dt>GET /phylows/find/tree/?query=h%2Etaxon_name+any+Primates+or+h%2Etaxon_name+any+Aves&amp;operation=searchRetrieve&amp;recordSchema=pc</dt>
	<dd>Retrieve all trees that have either any kind of <i>Primates</i> OR any kind of <i>Aves</i>.</dd>
</dl>
<p><b>Here is a list of what you can do (eventually):</b></p>
<dl><dt>GET /phylows/tree/&lt;identifier&gt;/?[metadata={<b>true</b>|false}]&amp;[topology={<b>true</b>|false}]&amp;[{recordSchema|format}=&lt;format&gt;]</dt> <dd>Returns a tree, e.g. &lt;identifier&gt; = LTB:Tree1234</dd> <dt>GET /phylows/tree/&lt;identifier&gt;/clade/&lt;nodeID&gt;?[metadata={<b>true</b>|false}]&amp;[{recordSchema|format}=&lt;format&gt;]</dt> <dd>Retrieve a clade (subtree) of a tree.</dd>
	<dd>
</dl>
};


	};

#============================
# Query for trees

    GET qr{^/phylows/find/tree/?$} => sub {
    
		my $version = param('version');
		my $operation = param('operation');
		my $fullquery = param('query');
		my $startRecord = param('startRecord');
		my $maximumRecords = param('maximumRecords');
		my $recordSchema = param('recordSchema');
		
		if ($operation ne "searchRetrieve") {
			error(4, "Only searchRetrieve is supported");
		}
		if ($recordSchema ne "pc") {
			error( 66, "recordSchema must be pc");
		}
		
		my ($query,$sortStatement);
		if ($fullquery =~ m/^(.+) sortBy (.+)$/) {
			$query = $1;
			$sortStatement = $2;
		} else {
			$query = $fullquery;
		}
		
		my $parser = new CQL::Parser();
		my $node;
		eval {
			$node = $parser->parse($query);
		};
		
		if ($@) {
			error(10,"$@");
		}
		
		
		$qstring = "";
		my $dbh = &ConnectToPg($database, $username, $password);
		query_tree($node, $dbh);
		
		
		print $q->header('text/html');
		print $q->h1('Results');
		print $q->h3('(This should be delivered in some sort of XML)');
		print $q->p("$sortStatement") if $sortStatement;
		
		print $q->p("<pre>Query String = <b>$query</b></pre>");
		print $q->p("<pre>$qstring</pre>");
		
		#Use fetchrow_hashref
		my $sth = $dbh->prepare($qstring)
			or die "Can't prepare $qstring: $dbh->errstr\n";		
		my $rv = $sth->execute ()
			or die "can't execute the query: $sth->errstr\n";

		my $cnt = 1;
		while(my @row = $sth->fetchrow_array) {
			print "$cnt ";
			print a( {-href=>"http://purl.org/phylo/treebase/phylows/tree/TB:$row[0]"}, "http://purl.org/phylo/treebase/phylows/tree/TB:$row[0]");
			print " ";
			print a( {-href=>"http://purl.org/phylo/treebase/phylows/tree/TB:$row[0]?format=nexus"}, "[nexus]");
			print "<br>\n";
			$cnt++;
		}
		my $rd = $sth->finish;

        my $rc = $dbh->disconnect;

	};

#============================
# Find a tree by tree_id

    GET qr{^/phylows/tree/(LTB|TB):(\w*[cx\d]+)/?$} => sub {
		my $idtype = $1;
        my $id = $2;
		
		my $dbh = &ConnectToPg($database, $username, $password);
		
		my $statement;
		if ($idtype eq "LTB") {
			$statement = "SELECT count(*) FROM trees WHERE (legacy_id = '$id')";
		} elsif ($idtype eq "TB") {
			$statement = "SELECT count(*) FROM trees WHERE (tree_id = '$id')";
		}
		
		my $totRec = $dbh->selectrow_array ($statement);
		
		if ($totRec == 1) {
			#print $q->header('text/html');
			#print $q->p("There is $totRec record(s) for $idtype $id");
			
			$statement = "SELECT root, tree_label, tree_type, algorithm, ";
			$statement .= "software, s.legacy_id, author, year, title, s_title, ";
			$statement .= "volume, pages, doi FROM  trees t JOIN study s ON (s.study_id = t.study_id) ";
			
			if ($idtype eq "LTB") {
				$statement .= "WHERE (t.legacy_id = '$id')";
			} elsif ($idtype eq "TB") {
				$statement .= "WHERE (tree_id = '$id')";
			}
			
			my ($root, $tree_label, @rest) = $dbh->selectrow_array ($statement);
			
			if (param('format') eq "nexus") {
				print $q->header('text/plain');
				$openCom = '[';
				$closeCom = ']';
			} elsif (param('format') eq "newick") {
				print $q->header('text/plain');
				$openCom = '[';
				$closeCom = ']';			
			} elsif (param('format') eq "svg") {
				print $q->header('image/svg+xml');
				$openCom = '<!--';
				$closeCom = '-->';
			} else {
				print $q->header('text/xml');
				$openCom = '<!--';
				$closeCom = '-->';
			}
			
			
			print "$openCom tree_type: $rest[0] $closeCom\n" if ($rest[0]);
			print "$openCom algorithm: $rest[1] $closeCom\n" if ($rest[1]);
			print "$openCom software: $rest[2] $closeCom\n" if ($rest[2]);
			print "$openCom study_id: $rest[3] $closeCom\n" if ($rest[3]);
			if ($rest[4]) {
				foreach my $i ( split(/; */, $rest[4]) ) {
					print "$openCom author: $i $closeCom\n";
				}
			}
			print "$openCom year: $rest[5] $closeCom\n" if ($rest[5]);
			print "$openCom title: $rest[6] $closeCom\n" if ($rest[6]);
			print "$openCom journal: $rest[7] $closeCom\n" if ($rest[7]);
			print "$openCom volume: $rest[8] $closeCom\n" if ($rest[8]);
			print "$openCom pages: $rest[9] $closeCom\n" if ($rest[9]);
			print "$openCom doi: $rest[10] $closeCom\n" if ($rest[10]);
			print "$openCom         xxx           $closeCom\n";

			# return a list of all children
			$statement  = "SELECT child_id, node_label, edge_length, edge_support, node_id ";
			$statement .= "FROM edges e INNER JOIN nodes n ON e.child_ID = n.node_id ";
			$statement .= "WHERE parent_id = ?";
			my $children = $dbh->prepare ($statement);
			
			$fac = Bio::Phylo::Factory->new;
			$proj = $fac->create_project;
			$forest = $fac->create_forest;
			$proj->insert( $forest );
			$tree = $fac->create_tree;
			$forest->insert( $tree );

			if (param('format') eq "nexus") {
				$tree->set_name("'$tree_label $id'");
			} else {
				$tree->set_name($tree_label . " $id");
			}
			
			&walktree($dbh, $children, $root+1);

			if (param('format') eq "nexus") {
				print $proj->to_nexus;
			} elsif(param('format') eq "newick") {
				#print $proj->to_newick;
				print "This Does Not Work Yet\n";
			} elsif(param('format') eq "svg") {
			
				print "<!-- This Does Not Work Yet -->\n";
				die;

				print $tree->to_svg;

				my $treedrawer = Bio::Phylo::Treedrawer->new(
					-width  => 400,
					-height => 600,
					-shape  => 'CURVY',
					-mode   => 'CLADO',
					-format => 'SVG'
				);			
				
				print "<!-- I am here 2 -->\n";
				
				 $treedrawer->set_scale_options(
					-width => '100%',
					-major => '10%', # major cross hatch interval
					-minor => '2%',  # minor cross hatch interval
					-label => 'MYA',
				 );
				
				print "<!-- I am here 3 -->\n";
				
				$treedrawer->set_tree($tree);
				print $treedrawer->draw;
				
				print "<!-- I am here 4 -->\n";
				
			} else {
				print $proj->to_xml;
			}


		} elsif($totRec > 1) {
        	# Too many records
			barf 404, "Too Many Records", "Too many trees for tree $id.";
		} else {
        	# No such resource exists
			barf 404, "Resource Not Found", "Tree for $id does not exist.";
        }
		
		my $rc = $dbh->disconnect;

    };

#============================
# Find a clade by tree_id plus number of nodes from the root

    GET qr{^/phylows/tree/(LTB|TB):(\w*[cx\d]+)/clade/(\d+)/?$} => sub {
		my $idtype = $1;
        my $id = $2;
        my $clade = $3;
		
		my $dbh = &ConnectToPg($database, $username, $password);
		
		my $statement;
		if ($idtype eq "LTB") {
			$statement = "SELECT count(*) FROM trees WHERE (legacy_id = '$id')";
		} elsif ($idtype eq "TB") {
			$statement = "SELECT count(*) FROM trees WHERE (tree_id = '$id')";
		}
		
		my $totRec = $dbh->selectrow_array ($statement);
		
		if ($totRec == 1) {
			
			$statement = "SELECT count(*) FROM nodes n JOIN trees t ON (n.tree_id = t.tree_id) ";			
			if ($idtype eq "LTB") {
				$statement .= "WHERE (t.legacy_id = '$id')";
			} elsif ($idtype eq "TB") {
				$statement .= "WHERE (t.tree_id = '$id')";
			}
			my $totNodes = $dbh->selectrow_array ($statement);
			$clade = $totNodes - 2 if (($clade + 2) > $totNodes);
			
			$statement = "SELECT root, tree_label, tree_type, algorithm, ";
			$statement .= "software, s.legacy_id, author, year, title, s_title, ";
			$statement .= "volume, pages, doi FROM  trees t JOIN study s ON (s.study_id = t.study_id) ";
			if ($idtype eq "LTB") {
				$statement .= "WHERE (t.legacy_id = '$id')";
			} elsif ($idtype eq "TB") {
				$statement .= "WHERE (tree_id = '$id')";
			}
			
			my ($root, $tree_label, @rest) = $dbh->selectrow_array ($statement);

			if (param('format') eq "nexus") {
				print $q->header('text/plain');
				$openCom = '[';
				$closeCom = ']';
			} elsif (param('format') eq "newick") {
				print $q->header('text/plain');
				$openCom = '[';
				$closeCom = ']';			
			} elsif (param('format') eq "svg") {
				print $q->header('image/svg+xml');
				$openCom = '<!--';
				$closeCom = '-->';
			} else {
				print $q->header('text/xml');
				$openCom = '<!--';
				$closeCom = '-->';
			}
			
			print "$openCom tree_type: $rest[0] $closeCom\n" if ($rest[0]);
			print "$openCom algorithm: $rest[1] $closeCom\n" if ($rest[1]);
			print "$openCom software: $rest[2] $closeCom\n" if ($rest[2]);
			print "$openCom study_id: $rest[3] $closeCom\n" if ($rest[3]);
			if ($rest[4]) {
				foreach my $i ( split(/; */, $rest[4]) ) {
					print "$openCom author: $i $closeCom\n";
				}
			}
			print "$openCom year: $rest[5] $closeCom\n" if ($rest[5]);
			print "$openCom title: $rest[6] $closeCom\n" if ($rest[6]);
			print "$openCom journal: $rest[7] $closeCom\n" if ($rest[7]);
			print "$openCom volume: $rest[8] $closeCom\n" if ($rest[8]);
			print "$openCom pages: $rest[9] $closeCom\n" if ($rest[9]);
			print "$openCom doi: $rest[10] $closeCom\n" if ($rest[10]);
			print "$openCom         xxx           $closeCom\n";

			# return a list of all children
			$statement  = "SELECT child_id, node_label, edge_length, edge_support, node_id ";
			$statement .= "FROM edges e INNER JOIN nodes n ON e.child_ID = n.node_id ";
			$statement .= "WHERE parent_id = ?";
			my $children = $dbh->prepare ($statement);
			
			$fac = Bio::Phylo::Factory->new;
			$proj = $fac->create_project;
			$forest = $fac->create_forest;
			$proj->insert( $forest );
			$tree = $fac->create_tree;
			$forest->insert( $tree );
			
			if (param('format') eq "nexus") {
				$tree->set_name("'$tree_label $id'");
			} else {
				$tree->set_name($tree_label . " $id");
			}
			
			my $startroot = ($root + 1 + $clade);
			
			
			&walktree($dbh, $children, $startroot);

			if (param('format') eq "nexus") {
				print $proj->to_nexus;
			} elsif(param('format') eq "newick") {
				print "This Does Not Work Yet\n";
			} else {
				print $proj->to_xml;
			}


		} elsif($totRec > 1) {
        	# Too many records
			barf 404, "Too Many Records", "Too many trees for tree $id.";
		} else {
        	# No such resource exists
			barf 404, "Resource Not Found", "Tree for $id does not exist.";
        }
		
		my $rc = $dbh->disconnect;

    };


};

if ($@) {
	my $ERROR;
    # Handle barfing
    if (ref $@) {
        $ERROR = $@;
        print $q->header( -status => $ERROR->{status}, -type => 'text/html' );
        print $q->h1( $ERROR->{title} );
        print $q->p( $ERROR->{message} ) if $ERROR->{message};
    }

    # Handle anything else
    else {
        $ERROR = $@;
        print $q->header( -status => 500, -type => 'text/html' );
        print $q->title('Server Error');
        print $q->p( $ERROR );
    }

    exit;
}

# Nothing handles this, throw back a standard 404
print $q->header(-status => 404, -type => 'text/html');
print $q->h1('Resource Not Found');

