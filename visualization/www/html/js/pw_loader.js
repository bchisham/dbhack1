/*
This loads all the CSS and javascript dependencies, global variables and callbacks for
PhyloWidget
*/

document.open();
document.write('\
  <link rel="stylesheet" type="text/css" href="/hackathon/css/fonts-min.css" />                    \
  <link rel="stylesheet" type="text/css" href="/hackathon/css/autocomplete.css" />                 \
  <link rel="stylesheet" type="text/css" href="/hackathon/css/resize.css" />                       \
  <link rel="stylesheet" type="text/css" href="/hackathon/css/container.css" />                    \
  <link rel="stylesheet" type="text/css" href="/hackathon/css/button.css" />                       \
  <link rel="stylesheet" type="text/css" href="/hackathon/css/widget.css">                         \
                                                                                                   \
  <script type="text/javascript" src="/hackathon/js/yahoo-dom-event.js"></script>                  \
  <script type="text/javascript" src="/hackathon/js/element-beta-min.js"></script>                 \
  <script type="text/javascript" src="/hackathon/js/dragdrop-min.js"></script>                     \
  <script type="text/javascript" src="/hackathon/js/resize-min.js"></script>                       \
  <script type="text/javascript" src="/hackathon/js/connection-min.js"></script>                   \
  <script type="text/javascript" src="/hackathon/js/animation-min.js"></script>                    \
  <script type="text/javascript" src="/hackathon/js/datasource-min.js"></script>                   \
  <script type="text/javascript" src="/hackathon/js/autocomplete-min.js"></script>                 \
  <script type="text/javascript" src="/hackathon/js/container-min.js"></script>                    \
  <script type="text/javascript" src="/hackathon/js/button-min.js"></script>                       \
  <script type="text/javascript" src="/hackathon/js/cookie-min.js"></script>                       \
  <script type="text/javascript" src="/hackathon/js/json-min.js"></script>                         \
                                                                                                   \
  <script type="text/javascript" src="/hackathon/phylowidget/scripts/phylowidget.js"></script>     \
  <script type="text/javascript" src="/hackathon/js/balloon.config.js"></script>                   \
  <script type="text/javascript" src="/hackathon/js/balloon.js"></script>                          \
  <script type="text/javascript" src="/hackathon/js/box.js"></script>                              \
  <script type="text/javascript" src="/hackathon/js/widget.js"></script>                           \
                                                                                                   \
  <script type="text/javascript">                                                                  \
    var box     = new Box;                                                                         \
    BalloonConfig(box,"GBox");                                                                     \
    var pw = new PhyloWidget.object();                                                             \
    pw.codebase = "/phylowidget/lib";                                                              \
    var widget  = new PWidget;                                                                     \
  </script>                                                                                        \
');


// This updates the tree data without re-loading phylowidget
function loadTree(tree) {
  if (tree) {
    widget.treeText.value = tree;
    PhyloWidget.updateTree(tree);
  }
}

// AJAX stuff for the tree database search
var sUrl, callback;
window.onload = function() {
  var div = document.getElementById('searchResultsContainer');
  var handleSuccess = function(o){
    div.innerHTML = o.responseText;
  };

  var handleFailure = function(o){
    div.innerHTML = 'AJAX FAILURE!';
  };

  callback = {
    success:handleSuccess,
    failure:handleFailure,
    argument:['foo','bar']
  };

  sUrl = "/cgi-bin/hackathon/tree_search.pl";
}


// Callbacks - PhyloWidget Hooks

pw_tree = function() {
  // Get the latest PhyloWidget Java applet object.
  var applet = PhyloWidget.getApplet();

  // Get the Newick string.
  var newickString = applet.getTreeString();

  // Update the textbox with the newick string.
  var el = getObject("pw_treetext");
  if (el != null)
  el.value = newickString;
}

pw_clip = function() { return false; }

/*
   create an annotation table,
   add the header and append it to the
   specified element
*/
annotation_table = function (label,el) {
  var t = document.createElement('table');
  t.setAttribute('class',',annotation');
  t.setAttribute('width','100%');
  el.innerHTML = '';
  el.appendChild(t);
  var r = document.createElement('tr');
  t.appendChild(r);
  var th = document.createElement('th');
  th.setAttribute('class','toprow');
  th.setAttribute('colspan',2);
  th.innerHTML = label;
  r.appendChild(th);
  return t;
}

annotation_table_row = function(key,val,table) {
  var r = document.createElement('tr');
  var k = document.createElement('td');
  k.setAttribute('class','key');
  k.innerHTML = key;
  r.appendChild(k);
  var v = document.createElement('td');
  v.setAttribute('class','value');
  v.innerHTML = val;
  r.appendChild(v);
  table.appendChild(r);
}

pw_hover = function(json_data) {
  // Get the Java applet.
  var applet = PhyloWidget.getApplet();

  var json = eval("("+json_data+")");
  var ann = json["Annotations"];
  
  var decorationLabels = {
    "lcol" : "Label Color",
    "ncol" : "Node Color",
    "bcol" : "Branch Color",
    "lsz"  : "Label Size",
    "nsz"  : "Node Size",
    "bsz"  : "Branch Size",
    "nsh"  : "Node Shape"
  }
  var dec = new Object;
  for (var key in decorationLabels) {
    dec[key] = ann[key];
  }
  
  var nodeInf = getObject("pw_nodeinfo");
  var nodeDec = getObject("pw_nodedecorations");
  if (!nodeDec) alert ('NO DEC!!!');
  var tab1 = annotation_table('Lorem',nodeInf);
  var tab2 = annotation_table('Ipsum',nodeDec);

  for (var key in ann) {
    var val = ann[key];
    annotation_table_row(key,val,tab1);
  }

  for (var key in dec) {
    var val = dec[key];
    annotation_table_row(key,val,tab2);
  }
}

pw_urlFocus = function() {
  var applet = PhyloWidget.getApplet();
  var urlQuery = applet.getUrlParameters();
  
  // Grab the vanilla URL for this page.
  var url = top.location.href;
  var idx = url.indexOf("?");
  var baseURL = idx >= 0 ? url.substr(0,idx) : url;
  idx = baseURL.lastIndexOf("#");
  baseURL = idx >= 0 ? baseURL.substr(0, idx) : baseURL;
  
  // Update the url link box.
  var el = getObject("pw_linktext");
  el.value = baseURL+"?"+urlQuery;
}

// When the tree textbox is defocused, update the Java applet.
pw_treeTextBlur = function() {
  var treeText = getObject("pw_treetext").value;
  PhyloWidget.getApplet().setTree(treeText);
}

// When the clip textbox is defocused, update the Java applet.
pw_clipTextBlur = function() { return false; }

// When the tree textbox is focused, put a message into the Java applet.
pw_treeTextFocus = function() {
    pw_setMessage("Click away to update the tree.");
}

pw_clipTextFocus = function() { return false; }


// A generic function for putting a message into the Java applet.
pw_setMessage = function(message) {
  var applet = PhyloWidget.getApplet();
  applet.setMessage(message);
}

// Wrapper function to get an object from the DOM via its ID attribute.
function getObject(id) {
  var el = document.getElementById(id);
  return (el);
};

