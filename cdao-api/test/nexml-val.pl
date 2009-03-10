#$Id$#
# nexml validator agent

#  nexml: FAIL
# -or-
#  nexml: SUCCESS


use strict;
use LWP::UserAgent;
use HTML::Parser;
use Getopt::Std;
use constant VURL =>'http://nexml.org/nexml/validator.cgi';

my %opts;
# opts
# -v : verbose ( the "detailed output" )
# -V : very verbose ( "detailed output" plus the input file as returned )
getopts('vV', \%opts);

my ($rsp, $fmref, $p, $in_main, $collecting);
my @msg_types = qw(debug info warn error fatal);
my %msg_store;

my $ua = LWP::UserAgent->new();
$ua->agent( 'Validator/1.0 '.$ua->_agent);



foreach (@ARGV) {

    unless ( -e && -f ) {
	warn "Issue with uploaded file '$_': $@";
	next;
    }

    $fmref = [$_,undef];
    $rsp = $ua->post( VURL, 
		      Content_type => 'form-data',
		      Content => $fmref );
    if ($rsp->is_error) {
	warn "Issue with HTTP response: ".$rsp->status_line;
	next;
    }

    @msg_store{@msg_types} = '' x scalar @msg_types;
    
    $p = HTML::Parser->new( empty_element_tags => 1,
			    start_h => [\&start, "self, tagname, attr, text"],
			    end_h => [\&end, "self, tagname"],
			    ignore_tags( qw(script ) )
	);
			    
    1;
    
}

sub start {
    my ($self, $tagname, $attrh, $text) = @_;
    ($$attrh{id} eq 'main') && do {
	$in_main = 1;
    };
    ($tagname eq 'h3') && $in_main && do {
	if ($text =~ /Detailed results/) {
	    $collecting = 1;
	}
    };
    ($tagname eq 'li') && $collecting && do {
	for ($$attrh{class}) {
	    m{debug} && do {
	    };
	    m{info} && do {
	    };
	    m{error} && do {
	    };
	    m{fatal} && do {
	    };
	    
	
    };
	
    return;
}

sub end {
    my ($self, $tagname) = @_;
    ($tagname eq 'main') && do {
	$in_main = 0;
    };
    return;
}
