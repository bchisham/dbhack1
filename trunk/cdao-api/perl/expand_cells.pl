#!/usr/bin/perl -w
#Script to expand sqequences into cells
#11 Mar 2009
#CDAO API Team

use strict;
my %state_map;
my @characters;
my $states_processed = 0;
my $lines = 0;
while (<STDIN>){
    #this is a state tag. Match the symbols to fill in the hash table.
    if (/\<(?:state|(?:polymorphic|uncertain)_state_set) +id=\"([-_:.?a-zA-Z-0-9]+)\" +symbol=\"([-_:.?a-zA-Z0-9]+)\".*\>/){
	    #  print "adding id: $1 symbol: $2\n";
	if ( !(defined($1) and defined($2))){ die "id: \"$1\" symbol: \"$2\"\n"; }
	$state_map{ $2 } = $1;
	$states_processed++;
    }
    if (/\<(?:state|(?:polymorphic|uncertain)_state_set) +symbol=\"([-_:.?a-zA-Z-0-9]+)\" +id=\"([-_:.?a-zA-Z0-9]+)\".*\>/){
        if ( !(defined($1) and defined($2))){ die "symbol: \"$1\" id: \"$2\"\n"; }
#	print "addint symbol: $1 id: $2\n";
	$state_map{ $1 } = $2;
	$states_processed++;
    }

    if (/\<char.*id=\"([-_:.?a-zA-Z-0-9]+)\".*\>/){
	push @characters, $1;
	#print "pushed character $2\n";
    }
    if (/\<\/characters\>/){
	    #	print "resetting\n";
		my %empty_hash;
		my @empty_array;
		%state_map = %empty_hash;
		@characters = @empty_array;
		$states_processed = 0;
    }
    if (/\<seq\>/){
	    #foreach my $key (keys %state_map){
	    #print "key: $key state: $state_map{$key}\n";
	    #}

	my $seq = $_;
	chomp $seq;
       	$seq =~ s/\<seq\>(.+)\<\/seq\>/$1/g;
	$seq =~ s/^\W+//g;

	#print "<any>after stripping tags seq is \"$seq\"</any>\n";	
        #Case1 the sequence is whitespace delmited
	my @elements = split(/[^-a-zA-Z0-9.]/,$seq);
	my $current_character = 0;
	#If there is no whitespace there are no spits so the entire original
	#string will be the contained in the first element of @elments i.e.
	#it will have a size of 1.
	if (@elements == 1){
	     @elements = split(//,$elements[0]);
	     #print "After split there are: @elements elements\n";
	}
        #Case2 the sequence was white-space delimited
	#print "Size of characters: \"@characters\"\n";
	#print "processed $states_processed states\n";
	if ($states_processed){
		foreach my $element (@elements) {
			#print "<any>$element</any>\n";
			print "\t\t<cell char=\"$characters[$current_character++]\" state=\"$state_map{$element}\"/>\n";  
		}
        }
	else {
		foreach my $element (@elements) {
			#print "<any>$element</any>\n";
			print "\t\t<cell char=\"$characters[$current_character++]\" state=\"$element\"/>\n";  
		}
	}
	
    }
    else {
	    print $_;
    }
    $lines++;
}
