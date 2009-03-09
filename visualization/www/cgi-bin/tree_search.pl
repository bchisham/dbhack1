#!/usr/bin/perl -w
use strict;
use CGI qw/:standard start_table end_table escapeHTML/;
use CGI::Carp 'fatalsToBrowser';
use DBI;

my ($user,$pass,$db) = qw/smckay sheldon123 smckay_db/;

my $dbh = DBI->connect("dbi:mysql:$db",$user,$pass);

my $search_term = param('query') || '*';
if (length $search_term > 1) {
    $search_term =~ s/\*/\%/g;
    $search_term .= '%' unless $search_term =~ /\%$/;
}

my $trees = do_search($search_term);

print header;
print start_html();
do_display($search_term,$trees);
print end_html;

sub do_search {
    my $search_term = shift;
    return $dbh->selectall_arrayref(<<END);
SELECT species,treebase_id,software,algorithm,label,nhx_string
FROM tree_taxon_list AS tt,tree AS t
WHERE tt.species LIKE '$search_term\%' 
AND t.tree_id = tt.tree_id
END
;
}

sub do_display {
    my ($search_term,$trees) = @_;

#    print '<center>',
   print  start_table({-style => "width:100%", -cell-spacing => 5});

    
    $search_term =~ s/[^A-Za-z0-9_ ]+//g;

    print Tr(
             th(
                {-colspan=>2,style=>"background:gainsboro"},
                "Search results for '$search_term'"
                )
             );
      
    my %seen; # Oh dear, what is up with this?
    for my $t (@$trees) {
        my ($species,$tid,$software,$algorithm,$label,$tree) = @$t; 
	++$seen{$tid} < 2 || next;
	$label =~ s/\;.+$//;
	# this is to shut IE up!
        $tree = escapeHTML($tree);
        my $mouseover = "<p>Tree ID: $tid</p>Software: $software<br>Algorithm: $algorithm<p>Click link for more info...</p>";
        print
            Tr (
#                td(checkbox()),
                td({-style => 'font-size:10pt'},span({-class=>'link',onclick=>"box.showTooltip(event,'url:/cgi-bin/tree_info.pl?query=$tid',1,500,500)"}, $label)),
                td(
		   {-class => 'link',
                     -onclick => "balloon.hideTooltip(1);widget.setTreeID('$tid');loadTree('$tree')",
                     #-onmouseover => "balloon.showTooltip(event,'Click this link to load the $label tree into PhyloWidget',0,150);"
                     },
                    '[view]')
                );
    }


}

