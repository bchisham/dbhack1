#$Id$#
use strict;
use Test::More qw(no_plan);
use_ok('File::Spec');

my $DDIR=File::Spec->catdir('..','..','..','data','nexml');
my $XDIR=File::Spec->catdir('..','..','xslt');

ok(1,'Nexml to RDF translation tests begin...');
qx/which xsltproc &> \/dev\/null/;
ok( !$?, 'have xsltproc');


__END__
