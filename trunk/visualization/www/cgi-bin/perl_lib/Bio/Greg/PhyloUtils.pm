# $Id: Phylo.pm 841 2009-03-04 23:07:30Z rvos $
package Bio::Greg::PhyloUtils;
use strict;

# Converts all annotations in the tree's dictionaries into tags.
sub dicts_to_tags {
    my $class = shift;
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
    my $class = shift;
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



1;
