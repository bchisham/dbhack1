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
do_stuff();

# Print headers, nexml, and exit.
print header("text/plain");
print Bio::Phylo::IO->unparse(-phylo => $forest, -format => "nexml");
exit(0);

sub do_stuff {
    # Turns dictionary entries into tags in the Bio::Phylo object.
    Bio::Greg::PhyloUtils->dicts_to_tags($tree);

    foreach my $node ($tree->get_nodes) {
	$node->add_tag_value("branch_color",get_random_color());
	$node->add_tag_value("node_color",get_random_color());
	$node->add_tag_value("label_color",get_random_color());

	$node->add_tag_value("branch_size",get_random_size());
	$node->add_tag_value("node_size",get_random_size());
	$node->add_tag_value("label_size",get_random_size());

	$node->add_tag_value("node_shape",get_random_shape());
    }

    # Turns any new tags back into dictionary elements, for xml serialization.
    Bio::Greg::PhyloUtils->tags_to_dict($tree);
}

sub get_random_shape {
    my @shapes = qw(square triangle x_star oval);
    my $ind = int(rand(scalar(@shapes)));
    return $shapes[$ind];
}

sub get_random_size {
    my $lo = 0.2;
    my $hi = 3;
    return rand($hi-$lo)+$lo;
}

sub get_random_color {
    my $lo = 50;
    my $hi = 255;
    my $r = int(rand($hi-$lo))+$lo;
    my $g = int(rand($hi-$lo))+$lo;
    my $b = int(rand($hi-$lo))+$lo;
    return sprintf("(%s,%s,%s)",$r,$g,$b);
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
