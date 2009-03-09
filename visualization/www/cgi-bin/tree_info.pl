#!/usr/bin/perl -w
# This populates the info box for each tree
# it polls the meta-data from the tree database
use strict;
use CGI qw/:standard start_table end_table escapeHTML/;
use CGI::Carp 'fatalsToBrowser';
use DBI;

my ($user,$pass,$db) = qw/smckay sheldon123 smckay_db/;

my $dbh = DBI->connect("dbi:mysql:$db",$user,$pass);

my $treeID = param('query') || '*';

my $trees = do_search($treeID);

print header;
print start_html();
do_display($treeID,$trees);
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

sub do_display {
    my ($treeID,$trees) = @_;

    $treeID =~ s/[^A-Za-z0-9_ ]+//g;

    my %seen; # Oh dear, what is up with this?
    for my $t (@$trees) {
        my ($software,$algorithm,$label,$citation,$abstract) = @$t; 
	++$seen{$citation} < 2 || next;
        my $rows = [th({-align=>'left'}, "$treeID: $label")];
	push @$rows, td(b('Software: '),$software) if $software;
	push @$rows, td(b('Algorithm: '),$algorithm) if $algorithm;
	push @$rows, td(b('Citation: '),$citation) if $citation;
	push @$rows, td(b('Abstract: '),$abstract) if $abstract;

        print  table({-style => "width:95%;font-size:10pt"},
		     Tr($rows)
		     );
    }
}

