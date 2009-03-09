#!/usr/bin/perl -w
use strict;
use CGI qw/:standard start_table end_table escapeHTML/;
use CGI::Carp 'fatalsToBrowser';
use CGI::Cookie;
use DBI;
use Data::Dumper;

use lib '/home/smckay/bioperl-live/';
use Bio::TreeIO;

my ($user,$pass,$db) = qw/smckay sheldon123 smckay_db/;
my $dbh = DBI->connect("dbi:mysql:$db",$user,$pass);

my $treeID = param('query') || '*';
my $cookies = fetch CGI::Cookie;

my $all_ids = get_ids($treeID,$cookies);

my %item;
my @items = qw/tree treeID citation abstract label software algorithm/;
for (@items) {
    $item{$_} = param($_) || undef;
    $item{$_} =~ s/\n/ /;
    $item{$_} =~ s/\s+/ /;
}

my $has_params = $item{treeID};

my $trees = do_search($treeID) unless $has_params;

print header, start_html;

if ($has_params) {
    my $saved = do_save();
    if ($saved) {
        print h1("finished!");
        print button({-onclick=>'javascript:window.close()', -name => 'Close', -value => 'Close'});
        print end_html;
        exit;
    }
}

do_display($treeID,$trees,$cookies);
print end_html;

sub do_search {
    my $treeID = shift;
    return $dbh->selectall_arrayref(<<END) or die $DBI::errstr;
SELECT software,algorithm,label,citation,abstract
FROM tree AS t,citation_info AS c
WHERE t.treebase_id = '$treeID'
AND t.citation_info_id = c.citation_info_id
END
;
}

sub do_save {
    my $tid = param('treeID');
    if (name_collision($tid)) {
        print h3({-style=>'color:red'},"Error: $tid is not unique.  Please use a different name for this tree");
        return 0;
    }

    print p('saving tree data...');
    my $cid = generate_random_string(20);
    my $vals1 = qq('$item{tree}','$item{treeID}','$cid','$item{software}','$item{algorithm}','$item{label}');
    $dbh->do("INSERT tree (NHX_string,treebase_id,citation_info_id,software,algorithm,label) VALUES ($vals1)") or die $DBI::errstr;
    my $vals2 = qq('$cid','$item{citation}','$item{abstract}');
    $dbh->do("INSERT citation_info (citation_info_id,citation,abstract) VALUES ($vals2)") or die $DBI::errstr; 

    add_taxa($item{tree});
}

sub add_taxa {
    my $tree = shift;
    print p('indexing taxa/species...');
    my @taxa = get_taxa($tree);
    for my $taxon (@taxa) {
	my $taxon_id = lookup_taxon($taxon);
	if (!$taxon_id) {
	    $dbh->do("INSERT taxon (taxon_name) values ('$taxon')");
	    my $t = $dbh->selectall_arrayref("SELECT taxon_id FROM taxon WHERE taxon_name = '$taxon'") or die $DBI::errstr;
	    $taxon_id = $t->[0][0] if $t && ref $t eq 'ARRAY'; 
	    print p("saved new taxon $taxon $taxon_id");
	}
	tree_taxon_list($taxon,$taxon_id);
    }
    return 1;
}

sub tree_taxon_list {
    my ($taxon,$taxon_id) = @_;
    my $t = $dbh->selectall_arrayref("SELECT tree_id FROM tree WHERE treebase_id = '$item{treeID}'") or die $DBI::errstr; 

    $t = $t->[0][0] if $t && ref $t eq 'ARRAY';

    my ($species) = $taxon =~ /^([A-Z][a-z]+\s+[a-z]+)/;
    if ($species !~ /\S/) {
	$species = $taxon;
    }
    $dbh->do("INSERT tree_taxon_list (tree_id,taxon_id,species) VALUES ('$t','$taxon_id','$species')") or die $DBI::errstr;

}

sub lookup_taxon {
    my $taxon = shift;
    my $exists = $dbh->selectall_arrayref("SELECT taxon_id from taxon WHERE taxon_name = '$taxon'") or die $DBI::errstr;
    if ($exists and ref $exists eq 'ARRAY') {
	return $exists->[0][0];
    }
    else {
	return 0;
    }
}


sub get_ids {
    my ($tid,$cookies) = @_;
    my ($ids) = grep {/session/} $cookies->{'treeID'}->value if $cookies->{'treeID'};
    $ids =~ s/session=//;
    my @all_ids = grep {$_ ne $tid} split(';',$ids);
    return 0 unless @all_ids;
    my $id = shift @all_ids; 
    my $q = "SELECT treebase_id,label FROM tree WHERE treebase_id = '$id' ";
    for (@all_ids) {
	$q .= "OR treebase_id = '$_' ";
    }
    return $dbh->selectall_arrayref($q) or die $DBI::errstr;
}

sub do_display {
    my ($treeID,$trees,$cookies) = @_;
    my $tree;
    if ($trees) {
      $tree = $cookies->{'tree'}->value if $cookies->{'tree'};
      $treeID =~ s/[^A-Za-z0-9_ ]+//g;
    }
    else {
	$tree = $item{tree};
	$trees = [1];
	$treeID = $item{treeID};
    }

    print start_form(-name => 'f1'),submit();
    my %seen; # Oh dear, what is up with this?
    for my $t (@$trees) {
	if (ref $t eq 'ARRAY') {
	    @item{qw/software algorithm label citation abstract/} = @$t;
	}

	++$seen{$item{citation}} < 2 || next;
        my $rows = [];
	push @$rows, td({-style=>"padding-right:10px"},b('ID: ')). td(textfield(-name => 'treeID', -value => $treeID));
	push @$rows, td([b('Description'),textfield(-name => 'label', -value => $item{label})]);
        push @$rows, td([b('Tree (Newick)'),textarea({-rows => 3, -cols => 80, -name => 'tree', -value => $tree})]);
	push @$rows, td([b('Software: '),textfield(-name => 'software', -value => $item{software})]);
	push @$rows, td([b('Algorithm: '),textfield(-name => 'algorithm', -value => $item{algorithm})]);
	push @$rows, td([b('Citation: '),textarea({-rows => 3, -cols => 80, -name => 'citation', -value => $item{citation}})]);
	push @$rows, td([b('Abstract: '),textarea({-rows => 20, -cols => 80, -name => 'abstract', -value => $item{abstract}})]);
        

        print p("The current tree ID is $treeID, change this name to create a new record in the database");
        print  table({-style => "width:95%;font-size:10pt"},
		     Tr($rows)
		     );

	print submit(), end_form();
    }
}

sub name_collision {
    my $tree_id = shift;
    my $has_id  = $dbh->selectall_arrayref("SELECT treebase_id FROM tree WHERE treebase_id = '$tree_id'") or die $DBI::errstr;  
    return $has_id && ref $has_id eq 'ARRAY' && $has_id->[0][0] eq $tree_id;
}

sub get_taxa {
    my $tree = shift;
    my $f = "/tmp/tree$$";
    open TREE, ">$f" or die $!;
    print TREE $tree;
    close TREE;
    my $treeIO = Bio::TreeIO->new( -format => 'newick', -file => $f );
    my @taxa = grep {s/_/ /g} map {$_->id} $treeIO->next_tree->get_leaf_nodes;
}

###########################################################
# Written by Guy Malachi http://guymal.com
# 18 August, 2002
###########################################################

# This function generates random strings of a given length
sub generate_random_string
{
    my $length_of_randomstring=shift;# the length of 
	 # the random string to generate

	my @chars=('a'..'z','A'..'Z','0'..'9','_');
    my $random_string;
    foreach (1..$length_of_randomstring) 
    {
	# rand @chars will generate a random 
	# number between 0 and scalar @chars
	$random_string.=$chars[rand @chars];
    }
    return $random_string;
}
