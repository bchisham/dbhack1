/*
This loads all the CSS and javascript dependencies, global variables and callbacks for
PhyloWidget
*/


document.write('<link rel="stylesheet" type="text/css" href="./css/fonts-min.css" />');
document.write('<link rel="stylesheet" type="text/css" href="./css/autocomplete.css" />');
document.write('<link rel="stylesheet" type="text/css" href="./css/resize.css" />');
document.write('<link rel="stylesheet" type="text/css" href="./css/container.css" />');
document.write('<link rel="stylesheet" type="text/css" href="./css/button.css" />');
document.write('<link rel="stylesheet" type="text/css" href="./css/widget.css" />');
document.write('<script type="text/javascript" src="./js/yahoo-dom-event.js"></script>');
document.write('<script type="text/javascript" src="./js/element-beta-min.js"></script>');
document.write('<script type="text/javascript" src="./js/dragdrop-min.js"></script>');
document.write('<script type="text/javascript" src="./js/resize-min.js"></script>');
document.write('<script type="text/javascript" src="./js/connection-min.js"></script>');
document.write('<script type="text/javascript" src="./js/animation-min.js"></script>');
document.write('<script type="text/javascript" src="./js/datasource-min.js"></script>');
document.write('<script type="text/javascript" src="./js/autocomplete-min.js"></script>');
document.write('<script type="text/javascript" src="./js/container-min.js"></script>');
document.write('<script type="text/javascript" src="./js/button-min.js"></script>');
document.write('<script type="text/javascript" src="./js/cookie-min.js"></script>');
document.write('<script type="text/javascript" src="./js/json-min.js"></script>');
document.write('<script type="text/javascript" src="./phylowidget/scripts/phylowidget.js"></script>');
document.write('<script type="text/javascript" src="./js/balloon.config.js"></script>');
document.write('<script type="text/javascript" src="./js/balloon.js"></script>');
document.write('<script type="text/javascript" src="./js/box.js"></script>');
document.write('<script type="text/javascript" src="./js/widget.js"></script>');

// This updates the tree data without re-loading phylowidget
function loadTree(tree) {
  if (tree) {
    widget.treeText.value = tree;
  }
  widget.updateTree(tree);
}

function transformTree (url) {
  widget.go=1;
  var applet = pw.getApplet();
  applet.transformTree(url);  
}

// AJAX stuff for the tree database search
window.onload = function() {
  var div = document.getElementById('searchResultsContainer');
  var handleSuccess = function(o){
    div.innerHTML = o.responseText;
  };

  var handleFailure = function(o){
    div.innerHTML = 'AJAX FAILURE!';
  };

  widget.callback = {
    success:handleSuccess,
    failure:handleFailure,
    argument:['foo','bar']
  };

  widget.sUrl = "/cgi-bin/tree_search.pl";

}



// Callbacks - PhyloWidget Hooks

pw_tree = function() {
  // Get the latest PhyloWidget Java applet object.
  var applet = pw.getApplet();

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
start_annotation_table = function (el,label) {
  var t = document.createElement('table');
  t.setAttribute('class','annotation');
  t.setAttribute('width','100%');
  el.appendChild(t);
  if (label) {
    var r = document.createElement('tr');
    t.appendChild(r);
    var th = document.createElement('th');
    th.setAttribute('align','left');
    th.setAttribute('class','toprow');
    th.setAttribute('colspan',2);
    th.innerHTML = label;
    r.appendChild(th);
  }
  return t;
}

decoration_table = function(el,decorations,lookup) {
  var shapes = {    
   's' : 'square',
   't' : 'triangle',
   'x' : 'star',
   'o' : 'circle' 
  };
  var sizes = { 
    1 : 'S',
    2 : 'M',
    3 : 'L'
  };
  var colors = {
    '#000000' : 'black',
    '#FF0000' : 'red',
    '#0000FF' : 'blue',
    '#00FF00' : 'green',
    '#FFFF00' : 'yellow',
    '#FF00FF' : 'purple'
  };

  el.innerHTML = '';
  var t = start_annotation_table(el);
  var rows = {
    'node'   : ['ncol', 'nsz', 'nsh' ],
    'branch' : ['bcol', 'bsz'],
    'label'  : ['lcol', 'lsz']
  }
  
  for (var r in rows) {
    var row = document.createElement('span');
    for (var i=0;i < rows[r].length;i++) {
      var key = rows[r][i];
      var obj = key.match('col') ? colors
              : key.match('sz')  ? sizes
              : shapes;
      var dsc = key.match('col') ? 'color'
              : key.match('sz')  ? 'size' 
              : 'shape';
              
      var val = decorations[key];
      var sel = document.createElement('select');
      sel.setAttribute('name',key);
      sel.setAttribute('id',key);
      sel.setAttribute('onchange','pw_updateNode()');
      add_select_option(dsc,'',sel,val);
      for (var k in obj) {
        add_select_option(obj[k],k,sel,val);
      }
      row.appendChild(sel);
    }
    annotation_display_row(r,row.innerHTML,t,null,'decorate');
  }
}

add_select_option = function (name,val,sel,def) {
  var opt = document.createElement('option');
  opt.setAttribute('value',val);
  if (def && def == val) {
    opt.setAttribute('selected',true);
  }
  opt.innerHTML = name;
  sel.appendChild(opt);
}

annotation_input_row = function(key,val,table) {
  var v = document.createElement('input');
  v.setAttribute('name',key);
  v.setAttribute('value',val);
  v.setAttribute('type','text');
  var sz = val.length >= 10 ? val.length : 10;
  v.setAttribute('size',sz);
  v.setAttribute('id',key);
  v.setAttribute('onchange','pw_updateNode()');
  _annotation_table_row(key,v,table);
}

annotation_display_row = function(key,val,table,def,decorate) {
  _annotation_table_row(key,val,table,def,decorate);
}

_annotation_table_row = function(key,val,table,def,decorate) {
  var r = document.createElement('tr');
  var k = document.createElement('td');
  var cName = decorate ? 'decKey' : 'key';
  k.setAttribute('class',cName);
  k.innerHTML = key;
  r.appendChild(k);
  var v = document.createElement('td');
  v.setAttribute('class','value');
  if (typeof(val) == 'object') {
    v.appendChild(val);
  }
  else {
    v.innerHTML = val;
  }
  r.appendChild(v);
  table.appendChild(r);
}

pw_hover = function(json_data) {
  var json = eval("("+json_data+")");
 
  var ann = json["annotations"];
  var cal = json["calculations"];
  widget.nodeJSON  = json;
  widget.nodeLabel = ann['Label'];

  var decLabels = {'ncol':1,'nsz':1,'nsh':1,'bcol':1,'bsz':1,'lcol':1,'lsz':1};
  widget.decLabels = decLabels;
  var dec = new Object;
  for (var key in decLabels) {
    dec[key] = ann[key] || '';
    if (ann[key]) {ann[key] = null;}
  }

  var nodeInf = getObject("pw_nodeinfo");
  var nodeDec = getObject("pw_nodedecorations");
  
  nodeInf.innerHTML = '';
  var tab1 = start_annotation_table(nodeInf,'Information');
  var tab2 = start_annotation_table(nodeInf,'Annotations');

  for (var key in cal) {
    var val = cal[key];
    if (val) {
      if (Math.round(val) > 1) {
        val = Math.round(val);
      }
      annotation_display_row(key,val,tab1);
    }
  }
  for (var key in ann) {
    var val = ann[key];
    if (val) {
      annotation_input_row(key,val,tab2);
    }
  }
  tab2.innerHTML += '\
  <tr class="value"> \
    <td colspan=2>   \
      <textarea onchange="pw_updateNode()" id="newAnnotations" rows=3 style="width:100%"> \
      </textarea>     \
    </td>            \
  </tr>';

  decoration_table(nodeDec,dec,decLabels);
  pw_WTF_is_wrong_with_IE(nodeInf);
  pw_WTF_is_wrong_with_IE(nodeDec);
}

pw_updateAnnotation = function (node,key,val) {
  var applet = pw.getApplet();
  if (!applet) {return false}
  applet.setAnnotation(node,key,val);

}

pw_updateNode = function() {
  for (var key in widget.nodeJSON['annotations']) {
    var el = getObject(key);
    if (el) {
      var val = el.value;
      widget.nodeJSON['annotations'][key] = val;
    }
  }
  for (var key in widget.decLabels) {
    var el = getObject(key);
    if (el) {
      var val = el.value;
      if (val) {widget.nodeJSON['annotations'][key] = val;}
    }
  }

  // parse any new annotations
  var newAnn = getObject('newAnnotations');
  if (newAnn && newAnn.value) {
    var vals = newAnn.value;
    //alert("NOt yet implemented, but the value is: "+vals);
  }

  var jData = YAHOO.lang.JSON.stringify(widget.nodeJSON['annotations']);
  var applet = pw.getApplet();
  if (!applet) {alert('NO applet!');}
  applet.setAnnotations(widget.nodeLabel,jData);  
}

pw_WTF_is_wrong_with_IE = function(el) {
  var ih = el.innerHTML;
  el.innerHTML = ih;
}

pw_urlFocus = function() {
  var applet = pw.getApplet();
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
  pw.getApplet().setTree(treeText);
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
  var applet = pw.getApplet();
  applet.setMessage(message);
}

// Wrapper function to get an object from the DOM via its ID attribute.
function getObject(id) {
  var el = document.getElementById(id);
  return (el);
};

