<?php

/*	the search paramaters might change depending on kind of object returned.  ie if assocated with an ontology than a 
	search by external identifier would be best.  This is a simple keyword search, matching all on a string. Returning 
	only 5 results or less for a return
query returns xml::
http://services.morphbank.net/mbd/request?method=search&objecttype=Image&keywords=Apidae&limit=5&format=xml

<mbresponse>
<keywords>Apidae</keywords>
<objecttypes>Image </objecttypes>
<limit>5</limit>
<firstResult>0</firstResult>
<numResults>67</numResults>
<numResultsReturned>5</numResultsReturned>
<firstResult>0</firstResult>
<object>
<id>109311</id>
<dateCreated>2006-09-15 00:00:00.0 EDT</dateCreated>
<dateLastModified>2006-09-15 00:00:00.0 EDT</dateLastModified>
<dateToPublish>2005-03-14 00:00:00.0 EST</dateToPublish> -> need to know this because will be protected if dateToPublish < NOW()
<objectTypeId>Image</objectTypeId>
<description>Image added to Database</description>
<thumbURL>109311</thumbURL> -> standard image id can then be returned by path http://test.morphbank.net/109311 for record and http://test.morphbank.net/thumb/109311.jpg for thumbnail
</object>
<mbresponse>

*/
//somehow get this information on keyword service



function all($xml_file){


$xml = simplexml_load_file($xml_file);
   
   return $xml;

}

?>