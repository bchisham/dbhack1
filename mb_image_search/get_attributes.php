<?php

$xml = new SimpleXMLElement('from_mx.xml');

/* For each <movie> node, we echo a separate <plot>. */
foreach ($xml->label as $label) {
   echo $label->id, '<br />';
}
?>