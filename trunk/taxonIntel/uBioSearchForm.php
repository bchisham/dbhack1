<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN"
        "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<title>poc search forms using a taxon name server</title>
	<meta name="generator" content="BBEdit 8.2" />
</head>
<body>

<p>A series of simple forms for demonstrating proof-of-concept using a taxon name service to do search translations.</p>

<?php

if (isset($_GET['function']) && ($_GET['function']=='namebank_search')) {
	
	include ("./uBioFunctionsDISP.php");
	include ("./uBioFunctionsSOAP.php");
	include ("./uBioFunctionsXML.php");
	
	## GET UBIO NUMBERS
	############################################################################

	## UBIO DOES NOT DO SPACES WELL
	if (strstr($_GET['searchName'],' ') !== false) {

		$searchString = explode(' ',$_GET['searchName']);

		$names = uBioNamesXML($searchString[0]);
		
		for ($i=1 ; $i<sizeof($searchString) ; $i++ ) {
			$names1 = uBioNamesXML($searchString[$i]);
			$names = array_intersect_key($names,$names1);
		}

	} else {
		
		echo "as it comes";
		$names = uBioNamesXML($_GET['searchName']);
	
	}

	## MODIFIED SEARCH
	############################################################################
	echo '<form method="get" action="?">';
	echo '<fieldset>';
	echo '<legend>namebaseIDs you may want to search for: </legend>';
	echo '<input name="function" type="hidden" value="namebank_object" />';
	
	$namebankID = array_keys($names);
	
	checkbox_from_array_table($names,'namebankID',$_GET['searchName']);
	
	echo '<br /><input type="submit" value="Go" />';
	echo "</fieldset></form>";

} elseif (isset($_GET['function']) && ($_GET['function']=='namebank_object')) {
	
	echo "<p>This does nothing: <br />";
	echo "the form gets passed to the URI addressed on line 46<br />";
	echo "if you want to pass someother information see line 49 &quot;function&quot; as an example of hidden form vars</p>";
	print_r($_GET);

}


?>

<!-- FORM START -->
<form method="get" action="?">
	<fieldset>
	<legend>look up uBio namebaseIDs from name: </legend>
	<input name="function" type="hidden" value="namebank_search" />
	name search string: <input name="searchName" type="text" size="20" />
	<input type="submit" value="Go" />
	</fieldset>
</form>
<!-- FORM END-->

</body>
</html>
