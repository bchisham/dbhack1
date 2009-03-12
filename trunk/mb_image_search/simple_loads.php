<?php

//example interface/display on website:: http://seltmann.morphbank.net/dbhack1/

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
  			
  	function chrs($nex){
  	//create function to return chrs from xml; could check this against the ontology before uploading.  
  		}
  		
  	 function ann($nex){
  	 	//function for looking for annotations and return them, would be very useful with external references.
  	 	}
  			
 //create image search service query for a name, returns morphbank image ids based on keyworks search

function imageurl($name){
	 	 $mb_xml = simplexml_load_file('http://services.morphbank.net/mbd/request?method=search&objecttype=Image&keywords='. $name .'&limit=3&format=id');	
				if (!empty($name)){
					echo "searching for:  " . $name. ", ";
				foreach ($mb_xml->keywords as $keywords) {
					foreach ($mb_xml->id as $mbid){
						echo '<li style="height: 180px">';
						echo "<a href=http://test.morphbank.net/$mbid /><img src = http://test.morphbank.net/thumb/$mbid.jpg /><br />";
						echo "$keywords</td>";
						echo "</li>";
					//var_dump($mbid);
						}//closes first foreach
				}//closes  second foreach
			}else{//closes if statement
					echo "nexml parsed but no image matches were found";
						}
		}//closes the function

//all the logic for passing diff queries around for getting image urls, using earlier methods; wanted to keep it out of the index
function returnotus($nex){
	$returnotunames = otu($nex);
	foreach ($returnotunames as $array){
	$mbserviceurl = imageurl($array);
	//print_r($mbserviceurl);
		}
			}
			
?>
