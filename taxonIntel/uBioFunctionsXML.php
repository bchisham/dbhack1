<?php


################################################################################
function uBioNamesXML($searchString) {

#	echo "<p>Looking for: $searchString</p>";
	
	## GET XML DATA
	$reader = new XMLReader();
	$reader -> open("http://www.ubio.org/webservices/service.php?function=namebank_search&searchName=$searchString&sci=1&keyCode=f74cc909af5e2aa4f4f6a78fc3795aae6bcedabb");	
	
	## INIT
	$i=0;
	$s=0;
	
	## READ INTERESTING BITS
	while ($reader -> read()) {
		
		## GET NAME BANK ID
		if (($reader -> name == "namebankID") && ($reader->nodeType == XMLReader::ELEMENT)) {
			$reader -> read();
#			echo "<br />".$reader -> value;
			$nameBankID[$i] = $reader -> value;
			$i++;
		}
		
		## GET NAME STRING
		if (($reader -> name == "nameString") && ($reader->nodeType == XMLReader::ELEMENT)) {
			$reader -> read();
#			echo "<br />".base64_decode($reader -> value);
			$nameString[$s] = base64_decode($reader -> value);
			$s++;
		}

	}
		
	$reader -> close();
	
	## BUNG AND RETURN
	$answer = array_combine($nameBankID,$nameString);
	return($answer);
}

?>
