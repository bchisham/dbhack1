<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
		<title>mb image return from nexml</title>
		<link rel="stylesheet" title="Default" href="http://www.morphbank.net/style/morphbank2.css" type="text/css" media="screen" />
		<link rel="shortcut icon" href="http://www.morphbank.net/style/webImages/mLogo16.ico" />


<?php include_once("simple_loads.php"); ?>
<?php include_once("form_nexml.php"); ?>

	</head>

<body>
<div id="main">
<div class="mainHeader">
<div class="mainHeaderLogo"> <a href="http://www.morphbank.net/index.php"><img border="0" src="http://www.morphbank.net/style/webImages/mbLogoHeader.png" alt="logo" /></a>&nbsp; </div>
<div class="mainHeaderTitle">
Morphbank: Results from nexml Search
</div>

</div>
<div class="mainRibbon"></div>
<div class="mainGenericContainer" ><h1>
stuff</h1><div>


<?php

nexml();

$nex = $_GET["nexml_url"];

	if (!empty($nex)) {
		echo "searching this nexml document, returning three images for each result <h3><br />" . $_GET["nexml_url"] . "</h3>";
		echo '<ul id="boxes">';
	returnotus($nex);
		echo '</ul>';
	
			}else{
		echo "upload a nexml file <br />";
		echo "try this example nexml tree file: <h3>http://seltmann.morphbank.net/dbhack1/apoidea_tree_otu.xml</h3> <br /> 
		or this nexml matrix file: <h3>http://seltmann.morphbank.net/dbhack1/52.xml</h3>";


	}

?>

	</body>
</html>
