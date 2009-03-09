#!/usr/bin/perl -w
# a little script for ajax autocompletion
use strict;
use CGI 'header', 'param';
use DBI;

my ($user,$pass,$db) = qw/smckay sheldon123 smckay_db/;

# connect
my $dbh = DBI->connect("dbi:mysql:$db",$user,$pass);

my $spec = param('query') || exit;;

my $species = $dbh->selectall_arrayref("SELECT DISTINCT species FROM tree_taxon_list WHERE species LIKE '$spec%'");

print header("text/plain");


for my $row (@{$species}[0..9]) {
    print join("\t",@$row), "\n";
}
exit 0;

