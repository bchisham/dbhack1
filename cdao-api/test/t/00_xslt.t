#$Id$#

use Test::More qw(no_plan);


ok(1,'Nexml to RDF translation tests begin...');
qx/which xsltproc &> \/dev\/null/;
ok( !$?, 'have xsltproc');

__END__
