#!/usr/bin/perl

use strict;
use MIME::Base64;
use XML::XPath;
require LWP::UserAgent;
require Encode;

my $uBio = "http://www.ubio.org/webservices/service_internal.php?";

my $data_file = shift @ARGV;

if ($data_file eq "") {
  print "Input error! Usage: perl get_name_ids.pl [data_file] \n";
  exit;
}

my $file= $data_file;
open(DATA, "<:utf8", "$file") || die "Cannot open $file!: $!";


my %webHits;
my ($in, $taxon_id, $taxon_string, $namebankid);
my %taxidlist = ();
my ($urlused, $ncbi, $itis, $gbif, $catalogue_of_life, $index_fungorum);

while ($in = <DATA>) {
	chomp($in);
	my ($taxon_string) = split(/\t/,$in);
	
	($namebankid, $urlused) = &getuBIOid(\%webHits, $taxon_string );

	if ($namebankid > 0) {
		print "$taxon_string\n";
		print "   >namebankid = $namebankid\n";
			
		my $efetch = "http://www.ubio.org/browser/details.php?";
		$efetch .= "namebankID=$namebankid";
						
		my $efetch_result;
	
		$efetch_result = &urlFetch($efetch);
	
		if ($efetch_result =~ m/ncbi\.nlm\.nih\.gov\/Taxonomy\/Browser\/wwwtax\.cgi\?mode=Info\&id=(\d+)\&/) {
			$ncbi = $1;
			print "   >ncbi = $ncbi\n";
		}
		
		if ($efetch_result =~ m/itis\.gov\/servlet\/SingleRpt\/SingleRpt\?search_topic=TSN\&search_value=(\d+) target=new\>/){
			$itis = $1;
			print "   >itis = $itis\n";
		}
		
		if ($efetch_result =~ m/catalogueoflife\.org\/annual-checklist\/browse_taxa\.php\?selected_taxon=(\d+)/){
			$catalogue_of_life = $1;
			print "   >catalogue_of_life = $catalogue_of_life\n";
		}
		
		if ($efetch_result =~ m/data\.gbif\.org\/species\/(\d+)\//){
			$gbif = $1;
			print "   >gbif = $gbif\n";
		}
		
		if ($efetch_result =~ m/speciesfungorum\.org\/Names\/namesrecord\.asp\?RecordID=(\d+)/){
			$index_fungorum = $1;
			print "   >index_fungorum = $index_fungorum\n";
		}
		print "\n";

	} else {
		print "Error: $taxon_string = $urlused\n";
	}
}

close (DATA);

exit;



#==============================================================
sub getuBIOid {
	my $refwebHits = shift;
	my $namestring = shift;

	$namestring =~ s/"//g;
	$namestring =~ s/'//g;

	my ($efetch, $efetch_result);
	
	
	if ( !(defined($$refwebHits{$namestring})) ) {

		$efetch = "http://www.ubio.org/browser/search.php?";
		$efetch .= "search_all=" . &sentenceEncode("$namestring");
		
		$efetch_result = &urlFetch($efetch);

		#$efetch_result = Encode::decode_utf8( $efetch_result );
		#$new_string = Encode::decode_utf8( $new_string );
		
		$$refwebHits{$namestring} = $efetch_result;
			
	} else {
		$efetch_result = $$refwebHits{$namestring};
	}
	
	my @hits = ();
	while ($efetch_result =~ m/details.php\?namebankID=(\d+)\'\>\Q$namestring\E\<\/a\>/gi) {
		push(@hits,$1);
	}
	
	return ( $hits[0] , $efetch);
}

# fetches a web result, assumes utf8 content
#==============================================================
sub urlFetch {
	my $efetch = shift;

	my $ua = new LWP::UserAgent;
	my $request = new HTTP::Request('GET', $efetch);
	my $response = $ua->request($request);
	my $efetch_result = $response->content;
	#$efetch_result = Encode::decode_utf8( $efetch_result );
	return($efetch_result);
}

# takes a string of text and makes it fit for an URL string
#==============================================================
sub sentenceEncode {
	my $preURL = $_[0];
	
	my @values = split (/ /, $preURL);
	
	foreach my $evalue (@values) {
		$evalue = &wordEncode($evalue);
	}
	
	my $postURL = join("+", @values);
	return ($postURL);
}

# used by &sentenceEncode
#==============================================================
sub wordEncode {
	my $theURL = $_[0];
	$theURL =~ s/([\W])/"%" . uc(sprintf("%2.2x",ord($1)))/eg;
	return $theURL;
}



