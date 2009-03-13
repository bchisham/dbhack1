<?php 

##	uBio keyCode:	f74cc909af5e2aa4f4f6a78fc3795aae6bcedabb
################################################################################


################################################################################
#
# [classificationTitleID] => 106
# [classificationTitle] => Species2000 &amp; ITIS Catalogue of Life: 2008
#
#
#	Homo Sapiens = 2481730
#	Aves = 21645
################################################################################

$NAME_ID = 2481730;
$TITL_ID = 106;

##	THIS DOES CONNECT TO UBIO'S SOAP SERVICE
################################################################################
$wdsl = 'http://www.ubio.org/soap/';
$uBioClient = new SoapClient($wdsl);

echo "\r\r<h1>Fucntions</h1>\r\r";
var_dump($uBioClient -> __getFunctions());


##	THIS DOES GET A CLASSIFICATIONBANK OBJECT BASED ON NAME
################################################################################
$nameBankObject = ($uBioClient -> __soapCall("namebank_search",Array(
		"searchName" => "Homo sapiens",
		"searchAuth" => '',
		"searchYear" => '',
		"order" => '',
		"rank" => '',
		"sci" => 1,
		"linkedVern" => 1,
		"vern" => 1,
		"keyCode" => "f74cc909af5e2aa4f4f6a78fc3795aae6bcedabb"
		)));

echo "\r\r<h1>namebank_search</h1>\r\r";
echo "<p>return a taxon records based on search</p>";
$nameBankVars = (get_object_vars($nameBankObject));
print_r($nameBankVars);
/*
##	THIS DOES GET A CLASSIFICATIONBANK OBJECT BASED ON NAME
################################################################################
$nameBankObject1 = ($uBioClient -> __soapCall("namebank_search2",Array(
		"searchName" => "Homo",
		"searchAuth" => '',
		"searchYear" => '',
		"order" => '',
		"rank" => '',
		"sci" => '1',
		"linkedVern" => '0',
		"vern" => '0',
		"keyCode" => "f74cc909af5e2aa4f4f6a78fc3795aae6bcedabb"
		)));

echo "\r\r<h1>namebank_search2</h1>\r\r";
$nameBankVars1 = (get_object_vars($nameBankObject1));
print_r($nameBankVars1);
*/
/*
##	THIS DOES GET A CLASSIFICATIONBANK OBJECT BASED ON NAME
################################################################################
$nameBankObject = ($uBioClient -> __soapCall("namebank_search_structured",Array(
		"searchName" => "Homo",
		"searchAuth" => '',
		"searchYear" => '',
		"order" => '',
		"rank" => '',
		"sci" => '1',
		"linkedVern" => '0',
		"vern" => '0',
		"keyCode" => "f74cc909af5e2aa4f4f6a78fc3795aae6bcedabb"
		)));

echo "\r\r<h1>namebank_search_structured</h1>\r\r";
$nameBankVars = (get_object_vars($nameBankObject));
print_r($nameBankVars);
*/

##	THIS DOES GET A NAMEBANK OBJECT BASED ON ID
################################################################################
$nameBankObject = ($uBioClient -> __soapCall("namebank_object",Array(
	"namebankID" => $NAME_ID, 
	"keyCode" => "f74cc909af5e2aa4f4f6a78fc3795aae6bcedabb"
	)));
	
echo "\r\r<h1>namebank_object</h1>\r\r";
echo "<p>return a taxon records based on primary key.</p>";
$nameBankVars = (get_object_vars($nameBankObject));

print_r($nameBankVars);

$answer['namebankID'] = $nameBankVars['namebankID'];
$answer['nameString'] = base64_decode($nameBankVars['nameString']);
#print_r($answer);

/*
$nameBankVars['mappings'];
for ($i=0 ; $i<sizeof($nameBankVars['mappings']) ; $i++) {
	print_r($nameBankVars['mappings'][$i]);
	echo "\r<br />\r";
}
*/





##	THIS DOES GET A CLASSIFICATIONBANK OBJECT BASED ON ID
################################################################################
$classBankObject = ($uBioClient -> __soapCall("classificationbank_search",Array(
		"namebankID" => $NAME_ID,
		"clientVersion" => '',
		"requestorIP" => $_SERVER['REMOTE_ADDR'],
		"classificationTitleID" => '',
		"keyCode" => "f74cc909af5e2aa4f4f6a78fc3795aae6bcedabb"
		)));

echo "\r\r<h1>classificationbank_search</h1>\r\r";
echo "<p>return a list of classifications that contain this taxonID</p>";
echo "<p>classificationBankID == hierarchiesID</p>";
print_r($classBankObject);
$classBankVars = (get_object_vars($classBankObject));

$answer = get_object_vars($classBankVars['seniorNames'][0]);
#print_r($answer);


################################################################################
$classBankObject = ($uBioClient -> __soapCall("classification_list",Array(
		"classificationTitleID" => $answer["classificationTitleID"],
		"clientVersion" => '',
		"requestorIP" => $_SERVER['REMOTE_ADDR'],
		"keyCode" => "f74cc909af5e2aa4f4f6a78fc3795aae6bcedabb"
		)));

echo "\r\r<h1>classification_list</h1>\r\r";
echo "<p>return metadata for a classification</p>";
print_r($classBankObject);


################################################################################
$classBankObject = ($uBioClient -> __soapCall("classificationbank_object",Array(
		"hierarchiesID" => $answer["classificationBankID"],
		"childrenFlag" => '1',
		"ancestryFlag" => '1',
		"justificationsFlag" => '0',
		"synonymsFlag" => '1',
		"clientVersion" => '',
		"requestorIP" => $_SERVER['REMOTE_ADDR'],
		"keyCode" => "f74cc909af5e2aa4f4f6a78fc3795aae6bcedabb"
		)));

echo "\r\r<h1>classificationbank_object</h1>\r\r";
print_r($classBankObject);


################################################################################

$uBioSynObject = ($uBioClient -> __soapCall("synonym_list",Array(
		"hierarchiesID" => $answer["classificationBankID"],
		"clientVersion" => '0',
		"requestorIP" => $_SERVER['REMOTE_ADDR'],
		"keyCode" => "f74cc909af5e2aa4f4f6a78fc3795aae6bcedabb"
		)));

echo "\r\r<h1>synonym_list  -- need hierarchiesID</h1>\r\r";
print_r($uBioSynObject);


################################################################################
?>
