#!/usr/bin/perl -w
#Script to expand sqequences into cells
#11 Mar 2009
#CDAO API Team

use strict;
my %state_map;
my @characters;
my $states_processed = 0;
my $lines = 0;
my $characters_processed = 0;
while (<STDIN>){
    #this is a state tag. Match the symbols to fill in the hash table.
    if (/\<(?:state|(?:polymorphic|uncertain)_state_set) +id=\"([-_:.?a-zA-Z-0-9]+)\" +symbol=\"([-_:.?a-zA-Z0-9]+)\".*\>/){
	if ( !(defined($1) and defined($2))){ die "id: \"$1\" symbol: \"$2\"\n"; }
	$state_map{ $2 } = $1;
	$states_processed++;
    }
    if (/\<(?:state|(?:polymorphic|uncertain)_state_set) +symbol=\"([-_:.?a-zA-Z-0-9]+)\" +id=\"([-_:.?a-zA-Z0-9]+)\".*\>/){
        if ( !(defined($1) and defined($2))){ die "symbol: \"$1\" id: \"$2\"\n"; }
	$state_map{ $1 } = $2;
	$states_processed++;
    }
    #this is a character definition
    if (/\<char .*id=\"([-_:.?a-zA-Z-0-9]+)\".*\>/){
	push @characters, $1;
	$characters_processed++;
    }
    
    #reset things after the character definitions are done
    if (/\<\/characters\>/){
	    #	print "resetting\n";
		my %empty_hash;
		my @empty_array;
		%state_map = %empty_hash;
		@characters = @empty_array;
		$states_processed = 0;
		$characters_processed = 0;
    }
    #match the actual sequence
    if (/\<seq\>/){
	my $seq = $_;
	chomp $seq;
       	$seq =~ s/\<seq\>(.+)\<\/seq\>/$1/g;
	#strip leading whitespace from the sequence
	$seq =~ s/^\W+//g;	
        #Case1 the sequence is whitespace delmited
	my @elements = split(/[^-a-zA-Z0-9.]/,$seq);
	my $current_character = 0;
	#If there is no whitespace there are no spits so the entire original
	#string will be the contained in the first element of @elments i.e.
	#it will have a size of 1.
	if (@elements == 1){
	     @elements = split(//,$elements[0]);
	}
        #Case2 the sequence was white-space delimited
	if (  $states_processed > 0){
		foreach my $element (@elements) {
			#make there aren't more characters in the sequence than expected
			#if there are they get truncated out of existance :P
			if ($current_character < $characters_processed){
				print "\t\t<!-- Making-up a cell current_character: $current_character character name: $characters[$current_character] state name:$state_map{$element}  -->\n";
				print "\t\t<cell char=\"$characters[$current_character++]\" state=\"$state_map{$element}\"/>\n"; 
			}	
		}
        }
	#do continuous states. 
	else {
		foreach my $element (@elements) {
		        #make sure there aren't more characters in the sequence than expected
			#if there are then they get truncated out of existance :P
			if ($current_character < $characters_processed){
				print "\t\t<cell char=\"$characters[$current_character++]\" state=\"$element\"/>\n";
			}	
		}
	}
	
    }
    #otherwise echo output. 
    else {
	    print $_;
    }
    $lines++;
}
