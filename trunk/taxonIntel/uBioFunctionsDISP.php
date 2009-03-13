<?php


################################################################################
function checkbox_from_array($namebankData,$select_name,$selected) {

	$set = array_keys($namebankData);
	$longNames = array_values($namebankData);

	## EXPLODE SELECTED DATA INTO AN ARRAY
	if (!empty($selected) && (!is_array($selected))) {
		$selected_array=explode(",",$selected);
	} elseif (is_array($selected)) {
		$selected_array = $selected;
	} else {
		$selected_array[0]="";
	}

	## WRITE MENU
	for ($i=0 ; $i<sizeof($set) ; $i++) {
		
		if ($i!=0) echo ' <br /> ';

		## FORM ELEMENT
		echo '<input type="checkbox" name="'.$select_name.'['.$i.']'.'"';
		echo ' id='.addquotes($select_name.'['.$i.']');
		echo ' value='.addquotes($set[$i]);

		## IF CHECKED - DO SO
		if (in_array($longNames[$i],$selected_array)) 
			echo ' checked="checked"';
		
		echo '/>';

		## LABEL
		echo "<label for=".addquotes($select_name.'['.$i.']').'>';
		echo htmlentities($set[$i]);
		echo ' (';
		echo htmlentities($longNames[$i]);
		echo ")</label>";
	}
}



################################################################################
function checkbox_from_array_table($namebankData,$select_name,$selected) {

	$set = array_keys($namebankData);
	$longNames = array_values($namebankData);

	## EXPLODE SELECTED DATA INTO AN ARRAY
	if (!empty($selected) && (!is_array($selected))) {
		$selected_array=explode(",",$selected);
	} elseif (is_array($selected)) {
		$selected_array = $selected;
	} else {
		$selected_array[0]="";
	}

	echo '<table>';

	echo '<tr><td>&nbsp;';
	echo '</td><td>ID';
	echo '</td><td>Name';
	echo '</td><td>Others';
	echo '</td></tr>';


	## WRITE MENU
	for ($i=0 ; $i<sizeof($set) ; $i++) {
		
		echo '<tr><td>';

		## FORM ELEMENT
		echo '<input type="checkbox" name="'.$select_name.'['.$i.']'.'"';
		echo ' id='.addquotes($select_name.'['.$i.']');
		echo ' value='.addquotes($set[$i]);

		## IF CHECKED - DO SO
		if (in_array($longNames[$i],$selected_array)) 
			echo ' checked="checked"';
		
		echo '/>';
		
		echo '</td><td>';

		## LABEL
		echo "<label for=".addquotes($select_name.'['.$i.']').'>';
		echo htmlentities($set[$i]);
		echo "</label>";

		echo '</td><td>';

		echo "<label for=".addquotes($select_name.'['.$i.']').'>';
		echo htmlentities($longNames[$i]);
		echo "</label>";
		
		echo '</td><td>';
		
		$tns = uBioTNSviaSOAP($set[$i]);
		if (is_array($tns)) {
			$keys = array_keys($tns);
			for ($k=0 ; $k<sizeof($tns) ; $k++) {
				echo $keys[$k].' ('.$tns[$keys[$k]].') ';
			}
		} else {
			echo 'none';
		}
		echo '</td></tr>';
		
		
	}
	
	echo '</table>';
}


################################################################################
function addquotes($s) {

	return("'$s'");
}

?>
