#!/usr/bin/perl -w

use strict;
use lib './perl_lib/';

use Bio::Phylo;
use Bio::Phylo::IO;
use Bio::Greg::PhyloUtils;

use CGI;
use CGI::Carp 'fatalsToBrowser';

use LWP::Simple qw(!head);
use XML::Twig;

# Load the tree from CGI.
my $instring = CGI::param("nexml");
my $forest = load_tree($instring);
my $tree = $forest->get_default_tree;

# Call a method to do all the real stuff.
do_stuff();

# Print headers, nexml, and exit.
print CGI::header("text/plain");
print Bio::Phylo::IO->unparse(-phylo => $forest, -format => "nexml");
exit(0);

sub do_stuff {
    # Turns dictionary entries into tags in the Bio::Phylo object.
    Bio::Greg::PhyloUtils->dicts_to_tags($tree);

    # DO STUFF TO THE TREE HERE!

    foreach my $node ($tree->get_leaf_nodes) {
	search_and_load_image($node);
    }

    # STOP DOING STUFF TO THE TREE!

    # Turns any new tags back into dictionary elements, for xml serialization.
    Bio::Greg::PhyloUtils->tags_to_dict($tree);
}


sub search_and_load_image {
    my $node = shift;

    my $taxon_name = "";
    if ($node->has_tag("taxon_name")) {
	$taxon_name = $node->get_generic("taxon_name");
    } else {
	$taxon_name = $node->get_name;
    }

    my $search_url = "http://services.morphbank.net/mbd/request?";
    $search_url .= "method=search&objecttype=Image&limit=1&format=id&keywords=$taxon_name";

    #my $response_xml = `wget -O - www.google.com`;
    my $response_xml = LWP::Simple::get("http://www.google.com/");

    #print $search_url."\n";
    #print $search_url."\n";
    #exit(0);

    print CGI::header("text/plain");
    print "SEARCH: $search_url\n";
    print "RESPONSE: ".$response_xml."\n";
    #print $ENV{'PERL5LIB'}."\n";
    #print "@INC\n";
    print "\n";
    exit(0);

    my $t= XML::Twig->new();
    $t->parse( $response_xml);

    my @ids = $t->get_xpath("id[1]");
    if (scalar(@ids) > 0) {
	my $el = $ids[0];
	if (defined $el) {
	    my $id = $el->text;
	    my $img_url = "http://test.morphbank.net/thumb/$id.jpg";
	    $node->add_tag_value("img",$img_url);
	}
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
