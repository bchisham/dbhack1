<?php

//shows entire output from nexml file
function simple($nex){
$nexmb = simplexml_load_file($nex);
    print_r($nexmb);
  		}  
  		
  //returns an array of otu labels		
 function otu($nex){
	$nexmb = simplexml_load_file($nex);
  			foreach ($nexmb->otus->otu as $otu) {
			  	 $name[] = $otu['label'];
					}
  		return $name;
  			}
  			
 //create image search service query for a name, returns morphbank image ids based on keyworks search
function imageurl($name){
	 	 $mb_xml = simplexml_load_file('http://services.morphbank.net/mbd/request?method=search&objecttype=Image&keywords='. $name .'&limit=3&format=id');	

	return $mb_xml;
}

  			
?>
