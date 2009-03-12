#!/usr/bin/perl -w

use strict;
use lib './perl_lib/';
use Bio::Phylo;
use Bio::Phylo::IO;
use Bio::Greg::PhyloUtils;

use CGI qw/:standard/;
use CGI::Carp 'fatalsToBrowser';

my $infile = $ARGV[0];
my $instring = CGI::param("nexml");

print header("text/plain");
do_stuff();
exit(0);

sub do_stuff {
    my $blocks;
    if (defined $instring) {
	$blocks = Bio::Phylo::IO->parse(-string => $instring, -format => 'nexml');
    } elsif (defined $infile) {
	$blocks = Bio::Phylo::IO->parse(-file => $infile, -format => 'nexml');
    } else {
	$blocks = Bio::Phylo::IO->parse(-file => "/homes/greg/p/dbhack1/txforms/ensembl-rosettes.xml", -format => 'nexml');
    }

    my $forest = $blocks->[1];
    my $tree = $forest->get_default_tree;

    dicts_to_tags($tree);
    foreach my $node ($tree->get_nodes) {
	convert_node($node);

	color_node_by_bootstrap($node);
    }
    tags_to_dict($tree);

    print Bio::Phylo::IO->unparse(-phylo => $forest, -format => "nexml");
}

sub color_node_by_bootstrap {
    my $node = shift;

    if ($node->has_tag("pw:bootstrap")) {
	my $bs = $node->get_generic("pw:bootstrap");
	$bs = 200 - ($bs*2); # Assume bootstrap vals from 0 - 100.
	my $color = sprintf("(%s,%s,%s)",$bs,$bs,$bs);
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
	$node->add_tag_value("pw:stable_id",$bs);
	$node->remove_tag("g");
    }    
}

sub convert_duplication {
    my $node = shift;
    if ($node->has_tag("d")) {
	my $bs = $node->get_generic("d");
	$node->add_tag_value("pw:duplication",$bs);
	$node->remove_tag("d");
    }    
}

sub convert_bootstrap {
    my $node = shift;
    if ($node->has_tag("b")) {
	my $bs = $node->get_generic("b");
	$node->add_tag_value("pw:bootstrap",$bs);
	$node->remove_tag("b");
    }
}

# Converts all annotations in the tree's dictionaries into tags.
sub dicts_to_tags {
    my $tree = shift;

    foreach my $node ($tree->get_nodes) {
	foreach my $dict (@{$node->get_dictionaries}) {
	    foreach my $annotation (@{$dict->get_entities}) {
		$node->add_tag_value($annotation->get_tag(),$annotation->get_value());
		$dict->delete($annotation);
	    }
	    $node->remove_dictionary($dict);
	}
    }
}

# Converts all annotations in the tree's tags into dictionaries.
sub tags_to_dict {
    my $tree = shift;
    my $fac = Bio::Phylo::Factory->new;

    foreach my $node ($tree->get_nodes) {
	my $dict = $fac->create_dictionary();
	
	my @tags = $node->get_all_tags;
	foreach my $tag (@tags) {
	    my $annot = $fac->create_annotation(-tag => $tag,
						-value => $node->get_generic($tag));
	    $dict->insert($annot);
	    $node->remove_tag($tag);
	}
	$node->add_dictionary($dict);
    }
}
