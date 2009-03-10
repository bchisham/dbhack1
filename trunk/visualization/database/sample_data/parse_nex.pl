#!/usr/bin/perl -w
# a script a parse and merge data from a nexus files
# with tree and character data:
# http://phenoscape.svn.sourceforge.net/viewvc/phenoscape/trunk/data/phenex-files/Tree%20Files/Vari_1995.nex?view=text
# and a nexml files with taxon annotations:
# http://phenoscape.svn.sourceforge.net/viewvc/phenoscape/trunk/data/phenex-files/Characiformes/Vari-etal-1995.xml?view=text
use strict;
use Bio::Phylo::IO qw(parse unparse);
use Data::Dumper;

my $nexus_file = shift;

# returns an unblessed array reference of block objects,
# i.e. taxa, matrix or forest objects
my $blocks = parse(
		    '-file'   => $nexus_file,
		    '-format' => 'nexus',
		    ) or die $!;

print Dumper $blocks;

