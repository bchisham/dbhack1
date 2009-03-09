
var PWidget = function() {
  this.params = {
    nodeSize: '2f'
  };
  this.panels = [];
  this.panelObjects = {};
  this.hidden = {};
}

PWidget.prototype.saveTreeForm = function(evt) {
  var treeID = widget.treeID || widget.getTreeID();
  widget.saveTree();
  window.open('/cgi-bin/tree_save.pl?query='+treeID,'saveTree','scrollbars=1,width=800,height=600,resizable=1,location=0,status=1');
//  box.showTooltip(evt,'url:/cgi-bin/tree_save.pl?query='+treeID,1,1000,1000);
}

PWidget.prototype.loadWidget  = function(force) {
  balloon.hideTooltip(1);
  this.keepWidgetInBox();

  var c = YAHOO.util.Cookie;
  if (!c.get('loaded') && !force) {
    return false;
  }
  else {
    c.set('loaded',1);
  }

  // Never load without a tree!
  if (this.treeText && this.treeText.value) {
    this.params['tree'] = this.treeText.value;
  }

  var tree = this.params['tree'];
  if (tree) {
    tree = tree.replace(/\s+/, '', 'g');
  }

  // NO! I will not load you without a tree!
  if (!tree) {
    this.params['tree'] = c.get('tree') || '(a,((b,c),(d,e)))';
  }

  PhyloWidget.loadWidget('widgetContainer',this.params);

  // Make sure the clip board is up-to-date
  // but wait a bit for phylowidget
  var clipText = this.clipText.value;
  if (clipText) {
    setTimeout(function(){PhyloWidget.updateJavaClip(clipText)},10000);
  }
}

// We must always cram the applet into its box,
// no overflows allowed!
PWidget.prototype.keepWidgetInBox  = function(params) {
  var width  = this.getLoc('widgetContainer','width');
  var height = this.getLoc('widgetContainer','height');
  this.params['width']  = width  - 30;
  this.params['height'] = height - 30;  
  this.setStyle('widgetContainer','visibility','inherit');
}


PWidget.prototype.setStyle = function(el,att,val) {
  if (!el) return false;
  if (val && att.match(/left|top|bottom|right|width|height|padding|margin/)) val += 'px';
  if (typeof(el) != 'object') el = document.getElementById(el);

  // z-index does not work as expected
  if (att == 'z-index') {
    if (el.style) {
      el.style.zIndex = parseInt(val);
    }
  }
  else {
    YAHOO.util.Dom.setStyle(el,att,val);
  }
}

PWidget.prototype.getLayout = function() {
  var pageWidth   = YAHOO.util.Dom.getViewportWidth();
  var left1  = 10;
  var left2  = parseInt(0.30 * pageWidth) + 20;
  var left3  = parseInt(0.75 * pageWidth) - 5; 
  var narrow = parseInt(0.25 * pageWidth) - 10;
  var wide   = parseInt(0.30 * pageWidth) - 30;
  var wider  = parseInt(0.40 * pageWidth) - 30;
  var top1   = 135;
  var top2   = top1 + 90;
  var top3   = top2 + 100;
  var top4   = top3 + 100;   
  var venti  = 420;
  var grande = 130; 
  var tall   = 85;
  var small  = 75;  

  var cookie = YAHOO.util.Cookie;  

  // The core config for yahoo panels
  var panelParams = {
    close:true,
    underlay:'none',
    autofillheight:'body',
    draggable:false,
    visible:true  
  };
  
  // Have the panels been rendered before?
  this.rendered = this.panels.length > 0;

  // search box
  this.panelConfig('search',panelParams,[left1,top1,wide,venti],cookie); 
  this.searchText = document.getElementById('searchInput');

  // user panel
  this.panelConfig('user',panelParams,[left3,top1,narrow,small],cookie);

  // tree data container
  this.panelConfig('tree',panelParams,[left3,top2,narrow,tall],cookie);
  this.treeText = document.getElementById('treeText');

  // clipboard
  this.panelConfig('clip',panelParams,[left3,top3,narrow,tall],cookie);
  this.clipText = document.getElementById('clipText');

  // node info
  this.panelConfig('node',panelParams,[left3,top4,narrow,grande],cookie);

  // the container for phylowidget
  this.panelConfig('widget',panelParams,[left2,top1,wider,venti],cookie);
  this.widgetTitle = document.getElementById('widgetTitle');
  this.widgetLabel = this.widgetTitle.innerHTML;
  this.widgetContainer = document.getElementById('widgetContainer');

  this.treeText.value   = cookie.get('tree')   || '(a,((b,c),(d,e)));';
  this.clipText.value   = cookie.get('clip')   || '';
  this.searchText.value = cookie.get('search') || 'Species name';

  // check for cached show/hide info
  for (var i=0;i<this.panels.length;i++) {
    var pnl = this.panels[i].id;
    if (cookie.getSub('hidden',pnl)) {
      this.panelObjects[pnl].hide();
    }
  }

  // force load of the applet if there is a saved desktop
  var force = cookie.get('tree');
  this.loadWidget(force);
}

PWidget.prototype.saveTree = function() {
  YAHOO.util.Cookie.set('tree',widget.treeText.value);
}

PWidget.prototype.getTreeID = function() {
  return YAHOO.util.Cookie.getSub('treeID','current');
}

PWidget.prototype.getTreeIDs = function() {
  return YAHOO.util.Cookie.getSub('treeID','session');
}

PWidget.prototype.setTreeID = function(treeID) {
  YAHOO.util.Cookie.setSub('treeID','current',treeID);
  var trees = YAHOO.util.Cookie.getSub('treeID','session');

  trees = trees ? new String(trees) : null;
  if (trees && !trees.match(treeID)) {
    trees += ';'+treeID;
  }
  else {
    trees = treeID;
  }
  
  YAHOO.util.Cookie.setSub('treeID','session',trees);
}


PWidget.prototype.panelConfig = function(panel,params,myCoords,cookie) {
  if (cookie.get('panels')) {
    var crumbs = cookie.getSub('panels',panel);
    myCoords = crumbs.split(',');
  }

  var left = parseInt(myCoords[0]);
  var top  = parseInt(myCoords[1]);
  var hgt  = myCoords[3];
  var wid  = myCoords[2];
  params['xy']     = [left,top];
  params['width']  = wid+'px';
  params['height'] = hgt+'px';
  var pnl = this.panelInit(panel,params);
}


// Configure YAHOO panel widget thingamajigs
PWidget.prototype.panelInit = function(panel,params) {
  this.panels.push(document.getElementById(panel));

  // certain things must be done for the applet container
  var isWidget  = panel == 'widget';

  //params['close'] = isWidget ? false : true;
  var pnl = new YAHOO.widget.Panel(panel, params);

  // Create Resize instance, binding it to the panel DIV
  var resize = new YAHOO.util.Resize(panel, {
        draggable: false,
  	handles: ["br"],
        autoRatio: false,
        minWidth:  isWidget ? 300 : 200,
        minHeight: isWidget ? 300 : 75,
        status: true,
        proxy: true
  });

  // Setup startResize handler, to constrain the resize width/height
  // if the constraintoviewport configuration property is enabled.
  resize.on("startResize", function(args) {
     if (this.element.id == 'widget_c') {
         widget.setStyle('widgetContainer','visibility','hidden');
         document.getElementById('widgetContainer').innerHTML = '';
     }

     if (this.cfg.getProperty("constraintoviewport")) {
       var D = YAHOO.util.Dom;
       var clientRegion = D.getClientRegion();
       var elRegion = D.getRegion(this.element);

       resize.set("maxWidth", clientRegion.right - elRegion.left - YAHOO.widget.Overlay.VIEWPORT_OFFSET);
       resize.set("maxHeight", clientRegion.bottom - elRegion.top - YAHOO.widget.Overlay.VIEWPORT_OFFSET);
     } 
     else {
       resize.set("maxWidth", null);
       resize.set("maxHeight", null);
     }

   }, pnl, true);

   // make sure the Phylowidget applet is resized to fit in its box
   if (isWidget) {
     resize.on("endResize", function(args) {
       widget.setStyle('widgetContainer','visibility','inherit');
       widget.loadWidget();
     }, pnl, true);
   }


   // Setup resize handler to update the Panel's 'height' configuration property
   // whenever the size of the 'resizablepanel' DIV changes.

   // Setting the height configuration property will result in the
   // body of the Panel being resized to fill the new height (based on the
   // autofillheight property introduced in 2.6.0) and the iframe shim and
   // shadow being resized also if required (for IE6 and IE7 quirks mode).
   resize.on("resize", function(args) {
     var panelHeight = args.height;
     this.cfg.setProperty("height", panelHeight + "px");
   }, pnl, true);

  // Now, make draggable with the drag warning inserted
  pnl.beforeRenderEvent.subscribe(function() {
    var dd = new YAHOO.util.DDOnTop(panel);
    dd.setHandleElId(pnl.header);
    // can't drag over page header
    dd.setYConstraint( params['xy'][1]-120 , 5000 , 10 );
  }, pnl, true);

  this.panelObjects[panel] = pnl;

  // We are overriding the default panel hide method
  // so we can toggle the show/hide button 
  var p = new YAHOO.widget.Panel;
  pnl.hide = function() {
    widget.addButton(panel,1);
    widget.buttonStyle(panel+'Button-button','closed');
    widget.hidden[panel] = true;
    if (panel == 'widget') {
      widget.widgetContainer.innerHTML = '';
    }
    p.hide.call(this);
  };
  pnl.show = function() {
    widget.hidden[panel] = false;
    widget.buttonStyle(panel+'Button-button','open');
    if (panel == 'widget') {
      widget.loadWidget();
    }
    p.show.call(this);
  }

  //this.addButton(panel);
  pnl.render();

  return pnl;
}

// Add a show/hide button
PWidget.prototype.addButton = function(panel,uncheck) {
  var buttonId = panel+'Button';
  if (document.getElementById(buttonId+'-button')) {
    return false;
  }

  this.setStyle('showhide','display','inline');

  var Button = YAHOO.widget.Button;
  var bParams = {
    label:     panel,
    id:        buttonId,
    name:      buttonId,
    value:     '1',
    container: 'showhide'
  }

  var myButton = new Button(bParams);
  myButton.set('checked','true');

  var onButtonClick = function(e) {
    widget.showHide(e.target);
  }
  myButton.addListener("click", onButtonClick);
}


// Our custom drag and drop implementation, extending YAHOO.util.DD
YAHOO.util.DDOnTop = function(id, sGroup, config) {
    YAHOO.util.DDOnTop.superclass.constructor.apply(this, arguments);
};

/*
* Insert some logic in the drag/drop 
*/
YAHOO.extend(YAHOO.util.DDOnTop, YAHOO.util.DD, {
   startDrag: function(x, y) {
    widget.hideMenu();
	var el = this.getEl();
    var container = el.id+'Container';

    el.onmousemove = function() {
      widget.dragWarn(el);
    };
    widget.setStyle(container,'visibility','hidden');

    // applet has rendering issues on move, get rid of it.
    if (el.id.match('widget')) {
      widget.widgetContainer.innerHTML = '';
    }

  },
  endDrag: function(e) {
    var el = this.getEl();
    var container = el.id+'Container';

    el.onmousemove = null;
    widget.widgetTitle.innerHTML = widget.widgetLabel;;

    // reload the applet if required
    if (el.id.match('widget')) {
      widget.loadWidget();
    }

    // Tricky! Setting visibility to 'visible' will override
    // the panel.hide method.
    widget.setStyle(container,'visibility','inherit');
    widget.setStyle('widgetContainer','visibility','inherit');
  }
});


/*
* Mitigate hideous Java applet overlay issue with a friendly warning message!
*/	
PWidget.prototype.dragWarn = function(panel) {
  if (widget.isOverlap(widget.widgetContainer,panel)) {
    widget.widgetTitle.innerHTML = '<b style="color:red">Note: The PhyloWidget panel is always on top</b>';
    widget.setStyle('widgetContainer','visibility','hidden');
  }
  else {
    widget.widgetTitle.innerHTML = widget.widgetLabel;
    widget.setStyle('widgetContainer','visibility','inherit');
  }
}


// Uses YAHOO's region class for element coordinates
PWidget.prototype.getLoc = function(el,request) {
  var region = YAHOO.util.Dom.getRegion(el);

  switch(request) {
    case ('y1') : return parseInt(region.top);
    case ('y2') : return parseInt(region.bottom);
    case ('x1') : return parseInt(region.left);
    case ('x2') : return parseInt(region.right);
    case ('width')  : return (parseInt(region.right)  - parseInt(region.left));
    case ('height') : return (parseInt(region.bottom) - parseInt(region.top));
    case ('region') : return region;
 }
}

// Try to find overlap
PWidget.prototype.isOverlap = function(el1,el2) {
  if (!el1 || !el2) return false;
  var R1 = this.getLoc(el1,'region');
  var R2 = this.getLoc(el2,'region');
  if (!R1 || !R2) return false;
  var intersect = R1.intersect(R2);
  if (intersect) {
    // extent of overlap;
    intersect = new Array((intersect.right - intersect.left),(intersect.bottom - intersect.top));
  }
  return intersect;
}


/*
* Override phylowidget's reporting methods
* for our own evil purposes
*/
PhyloWidget.updateTree = function(newText) {
  // If we are callig a tree update, better make sure
  // phylowidget is running
  var loaded = document.getElementById('pulpcore_holder');
 
  if (newText) {
    newtext = new String(newText);

    if (newText == 'PhyloWidget;') {
      return false;
    }
    if (!loaded) {
      widget.params['tree'] = newText;
      widget.loadWidget(1); // force load
    }
  }
  else {
    return false;
  }

  if (widget.treeID) {
    widget.setTreeID(widget.treeID);
  }

  setTimeout( function() { 
    document.getElementById('treeText').value = newText;
    PhyloWidget.updateJavaTree(newText);
  },100);
}

PhyloWidget.updateClip = function(newText) {
  var treeID = widget.getTreeID();
  newText = new String(newText);
 
 // add a treeID tag unless this is a leaf node
  if (treeID && newText.match(/\)/) && !newText.match(/origin_/)) {
    var pf = 'origin_'+treeID+';';
    newText = new String(newText);
    newText = newText.replace(/\;/,pf);
  }

  setTimeout( function() {
    document.getElementById('clipText').value = newText;
    PhyloWidget.updateJavaClip(	newText);
  },100);
}

PhyloWidget.updateNode = function(newText) {
  setTimeout(function() {
    document.getElementById('nodeText').innerHTML = newText;
  },200);
},

// Push back to the applet
PhyloWidget.updateJavaTree = function(value) {
  if (!value) {
    value = document.getElementById('clipText').value;
  }
  if (!value) {return false}
  AppletLoader.callAppletMethod("updateTree",value);
}

PhyloWidget.updateJavaClip = function(value) {
  if (!value) {
    value = document.getElementById('clipText').value;
  }
  if (!value) {return false}
  AppletLoader.callAppletMethod("updateClip",value);
}


/*
* Cross-browser opacity setter
*/
PWidget.prototype.setOpacity = function(el,opc) {

  var o = parseFloat(opc/100);
  // CSS standards-compliant browsers!
  this.setStyle(el,'opacity',o);
  // old IE
  this.setStyle(el,'filter','alpha(opacity= '+opc+')');
  // old Mozilla/NN
  this.setStyle(el,'MozOpacity',o);
  // old Safari
  this.setStyle(el,'KhtmlOpacity',o);
}


PWidget.prototype.showMenu = function(el,menuId) {
  var menuTop   = this.getLoc(el,'y2') - 2;
  var menuWidth = this.getLoc(el,'width') - 2;
  var menuLeft  = this.getLoc(el,'x1'); 

  this.setStyle(menuId,'top',menuTop);
  this.setStyle(menuId,'left',menuLeft);
  this.setStyle(menuId,'width',menuWidth);
  this.setOpacity(menuId,80);
  this.setStyle(menuId,'display','inline');
  this.hideIfOverLap(menuId);
}

PWidget.prototype.hideMenu = function() {
  var close = function (el) {widget.setStyle(el,'display','none')};
  YAHOO.util.Dom.getElementsByClassName('menu','div',null,close);
  this.setStyle('widgetContainer','visibility','inherit');
}

PWidget.prototype.saveDesktop = function() {
  var c = YAHOO.util.Cookie;

  // expire in one month
  var bestBefore = new Date();
  bestBefore.setDate(bestBefore.getDate()+30);
  bestBefore = {expires:bestBefore};

  // save the coordinates and dimensions of all panels

    for (var i=0;i<this.panels.length;i++) {
      var el = this.panels[i].id;
      var t  = this.getLoc(el,'y1');
      var l  = this.getLoc(el,'x1');
      var w  = this.getLoc(el,'width');
      var h  = this.getLoc(el,'height') - 10;
      c.setSub("panels", el, l+','+t+','+w+','+h, bestBefore);

      // also remember who is hidden
      if (this.hidden[el]) {
        c.setSub("hidden",el,1,bestBefore);
      }
      else {
        c.removeSub("hidden",el);
      }
    }


  // save data and query string if requested

    if (this.treeText.value) {
      c.set("tree", this.treeText.value, bestBefore);
    }
    if (this.clipText.value) {
      c.set("clip", this.clipText.value, bestBefore);
    }
    var searchBox = document.getElementById('searchInput');
    if (searchBox && searchBox.value) {
      c.set("search", searchBox.value, bestBefore);
    }
	
}

PWidget.prototype.resetDesktop = function() {
  
  var cookies = ['panels','tree','treeID','clip','search','hidden','loaded'];
  for (var i=0;i<cookies.length;i++) {
    YAHOO.util.Cookie.remove(cookies[i]);
  }
  var p = document.getElementById('panels');
  document.body.removeChild(p);
  
  window.location.reload();
}

PWidget.prototype.hideIfOverLap = function(el) {
  if (widget.isOverlap(el,'widget')) {
    this.setStyle('widgetContainer','visibility','hidden');
  }
}

PWidget.prototype.showHide = function(button) {
  var panelId = button.id.match(/^[a-z]+/);
  var panel   = this.panelObjects[panelId];
  var hidden  = this.hidden[panelId];

  if (hidden) {
    panel.show();
  }
  else {
    panel.hide();
  }
}

PWidget.prototype.buttonStyle = function(button,state) {
  switch(state) {
    case ('open')   : {
      widget.setStyle(button,'background',"url('/images/phylowidget/sprite.png') repeat-x 0 -1400px");
      widget.setStyle(button,'color','white');
      break;
    }
    case ('closed') : {
      widget.setStyle(button,'background',"url('/images/phylowidget/sprite.png') repeat-x")
      widget.setStyle(button,'color','black');
      break;
    }
  }
}


PWidget.prototype.doSearch = function() {
  var postData = 'query='+widget.searchText.value;
  var request = YAHOO.util.Connect.asyncRequest('POST', sUrl, callback, postData);
  document.getElementById('searchResultsContainer').innerHTML = '\
    <p style="color:blue;text-align:center;padding:20px"><b>Searching...</b></p>';
}

PWidget.prototype.clearSearch - function() {
  document.getElementById('searchResultsContainer').innerHTML = '';
  widget.searchText.value = '';
}

