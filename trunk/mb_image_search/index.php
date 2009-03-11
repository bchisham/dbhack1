<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>mb image return</title>

<?php include_once("simple_loads.php"); ?>

</head>

<body>
<?php
$nex =  '52.xml';

$returnotunames = otu($nex);


	foreach ($returnotunames as $array){
	$mbserviceurl = imageurl($array);
	print_r($mbserviceurl);
		}
	

?>
</body>
</html>
