#!/usr/bin/perl -w

use strict;
use lib './perl_lib/';
use Bio::Phylo;
use Bio::Phylo::IO;
use Bio::Greg::PhyloUtils;

use CGI qw/:standard/;
use CGI::Carp 'fatalsToBrowser';

# Load the tree from CGI.
my $instring = CGI::param("nexml");
my $forest = load_tree($instring);
my $tree = $forest->get_default_tree;

# Call a method to do all the real stuff.
my $BOOTSTRAP_TAG = "branch_support";
my $GENE_ID_TAG = "stable_id";
my $DUPLICATION_TAG = "duplication";

do_stuff();

# Print headers, nexml, and exit.
print header("text/plain");
print Bio::Phylo::IO->unparse(-phylo => $forest, -format => "nexml");

sub do_stuff {
    Bio::Greg::PhyloUtils->dicts_to_tags($tree);

    foreach my $node ($tree->get_nodes) {
	convert_node($node);
    }

    my ($min,$max) = get_bootstrap_ranges($tree);

    foreach my $node ($tree->get_nodes) {
	color_node_by_bootstrap($node,$min,$max);
    }

    Bio::Greg::PhyloUtils->tags_to_dict($tree);
}

sub get_bootstrap_ranges {
    my $tree = shift;

    my $min_bootstrap = 10000;
    my $max_bootstrap = 0;
    foreach my $node ($tree->get_nodes) {
	my $bs = $node->get_generic($BOOTSTRAP_TAG);
	if (defined $bs) {
	    $min_bootstrap = $bs if ($bs < $min_bootstrap);
	    $max_bootstrap = $bs if ($bs > $max_bootstrap);
	}
    }
    return ($min_bootstrap,$max_bootstrap);
}

sub color_node_by_bootstrap {
    my $node = shift;
    my $min = shift;
    my $max = shift;

    if ($node->has_tag($BOOTSTRAP_TAG)) {
	my $bs = $node->get_generic($BOOTSTRAP_TAG);
	my $range_size = 220;
	my $col_val = $range_size - ($bs - $min)/$max*$range_size;
	my $color = sprintf("(%s,%s,%s)",$col_val,$col_val,$col_val);
	$node->add_tag_value("branch_color",$color);
    }
}

sub convert_node {
    my $node = shift;

    convert_bootstrap($node);
    convert_duplication($node);
    convert_stable_id($node);
}

sub convert_stable_id {
    my $node = shift;
    if ($node->has_tag("g")) {
	my $bs = $node->get_generic("g");
	$node->add_tag_value($GENE_ID_TAG,$bs);
	$node->remove_tag("g");
    }    
}

sub convert_duplication {
    my $node = shift;
    if ($node->has_tag("d")) {
	my $bs = $node->get_generic("d");
	$node->add_tag_value($DUPLICATION_TAG,$bs);
	$node->remove_tag("d");
    }    
}

sub convert_bootstrap {
    my $node = shift;
    if ($node->has_tag("b")) {
	my $bs = $node->get_generic("b");
	$node->add_tag_value($BOOTSTRAP_TAG,$bs);
	$node->remove_tag("b");
    }
}

# Loads a NeXML file from either the input string, command-line params, or a default file.
sub load_tree {
    my $instring = shift;

    my $blocks;
    if (defined $instring) {
	$blocks = Bio::Phylo::IO->parse(-string => $instring, -format => 'nexml');
    } elsif (defined $ARGV[0]) {
	$blocks = Bio::Phylo::IO->parse(-file => $ARGV[0], -format => 'nexml');
    } else {
	$blocks = Bio::Phylo::IO->parse(-file => "./fallback.xml", -format => 'nexml');
    }

    my $forest = $blocks->[1];
    return $forest;
}
