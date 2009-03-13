<?php

//need to figure out most useful way for user to give string location of xml.
/* pass information from form.  Example nexml files, tree and matrix files
http://seltmann.morphbank.net/dbhack1/99.xml
http://seltmann.morphbank.net/dbhack1/106.xml
http://seltmann.morphbank.net/dbhack1/52.xml
http://seltmann.morphbank.net/dbhack1/apoidea_tree_otu.xml
*/


function nexml(){

echo'
<form action="index.php" method="get" > 
<!-- want to add search by chr or otu -->
	<table>
		<tr>	
			<td>nexml url:</td>
			<td><input name="nexml_url" type="text" /></td>
		</tr>
		<tr>
			<td>add other keywords:</td>
			<td><input name="keywords" type="text" /></td>
		</tr>
	</table>
	<input type="submit" />
</form>';
	}


?>