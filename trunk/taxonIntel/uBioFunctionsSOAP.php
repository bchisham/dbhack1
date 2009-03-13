<?php 

## TAKES: 	namebankID NUMBER
## RETURNS:	array with various provider ID as array key & provider name as values
################################################################################
function uBioTNSviaSOAP($namebankID) {

	$nameBankVars = uBioObjectSOAP($namebankID);

	## GET MAPPING SECTION
	$nameBankMaps = $nameBankVars['mappings'];
	
	if (is_array($nameBankMaps)) {
		for ($i=0 ; $i<sizeof($nameBankMaps) ; $i++) {
			$key[$i] = $nameBankMaps[$i] -> foreignKey;
			$tit[$i] = $nameBankMaps[$i] -> collectionsTitle;
			
		}
		$answer = array_combine($tit,$key);
		return($answer);
	} else {
		return(false);
	}
}

## TAKES: 	namebankID NUMBER
## RETURNS:	array with various provider ID as array key & provider name as values
################################################################################
function uBioObjectSOAP($namebankID) {

	$wdsl = 'http://www.ubio.org/soap/';
	$keyCode = 'f74cc909af5e2aa4f4f6a78fc3795aae6bcedabb';

	$uBioClient = new SoapClient($wdsl);

	$nameBankObject = ($uBioClient -> __soapCall("namebank_object",Array(
		"namebankID" => $namebankID, 
		"keyCode" => $keyCode
		)));
		
	$nameBankVars = (get_object_vars($nameBankObject));
		
	return($nameBankVars);

}

?>
