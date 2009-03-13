

package org.cdao.jastor;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
*/
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.rdf.listeners.StatementListener;
import com.hp.hpl.jena.vocabulary.RDF;
import com.ibm.adtech.jastor.*;
import com.ibm.adtech.jastor.util.*;


/**
 * Implementation of {@link org.cdao.jastor.CommonAncestralNode}
 * Use the org.cdao.jasper.CDAOFactory to create instances of this class.
 * <p>(URI: http://localhost/~vivek/cdao.owl#CommonAncestralNode)</p>
 * <br>
 */
public class CommonAncestralNodeImpl extends com.ibm.adtech.jastor.ThingImpl implements org.cdao.jastor.CommonAncestralNode {
	

	private static com.hp.hpl.jena.rdf.model.Property part__ofProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#part_of");
	private java.util.ArrayList part__of;
	private static com.hp.hpl.jena.rdf.model.Property has__AncestorProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Ancestor");
	private java.util.ArrayList has__Ancestor;
	private static com.hp.hpl.jena.rdf.model.Property belongs__to__Edge__as__ParentProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to_Edge_as_Parent");
	private java.util.ArrayList belongs__to__Edge__as__Parent;
	private static com.hp.hpl.jena.rdf.model.Property belongs__to__Tree__as__RootProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to_Tree_as_Root");
	private java.util.ArrayList belongs__to__Tree__as__Root;
	private static com.hp.hpl.jena.rdf.model.Property nca__node__ofProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#nca_node_of");
	private java.util.ArrayList nca__node__of;
	private static com.hp.hpl.jena.rdf.model.Property belongs__to__EdgeProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to_Edge");
	private java.util.ArrayList belongs__to__Edge;
	private static com.hp.hpl.jena.rdf.model.Property represents__TUProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#represents_TU");
	private org.cdao.jastor.TU represents__TU;
	private static com.hp.hpl.jena.rdf.model.Property has__ParentProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Parent");
	private java.util.ArrayList has__Parent;
	private static com.hp.hpl.jena.rdf.model.Property belongs__to__Edge__as__ChildProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to_Edge_as_Child");
	private org.cdao.jastor.DirectedEdge belongs__to__Edge__as__Child;
	private static com.hp.hpl.jena.rdf.model.Property has__ChildProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Child");
	private java.util.ArrayList has__Child;
	private static com.hp.hpl.jena.rdf.model.Property has__DescendantProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Descendant");
	private java.util.ArrayList has__Descendant;
	private static com.hp.hpl.jena.rdf.model.Property belongs__to__TreeProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to_Tree");
	private java.util.ArrayList belongs__to__Tree;
	private static com.hp.hpl.jena.rdf.model.Property belongs__to__NetworkProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to_Network");
	private java.util.ArrayList belongs__to__Network;
	private static com.hp.hpl.jena.rdf.model.Property has__AnnotationProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Annotation");
	private java.util.ArrayList has__Annotation;
	private static com.hp.hpl.jena.rdf.model.Property belongs__toProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to");
	private java.util.ArrayList belongs__to;
	private static com.hp.hpl.jena.rdf.model.Property has__ValueProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Value");
	private java.util.ArrayList has__Value;
	private static com.hp.hpl.jena.rdf.model.Property has__Support__ValueProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Support_Value");
	private java.util.ArrayList has__Support__Value;
	private static com.hp.hpl.jena.rdf.model.Property has__Float__ValueProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Float_Value");
	private java.util.ArrayList has__Float__Value;
	private static com.hp.hpl.jena.rdf.model.Property has__Int__ValueProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Int_Value");
	private java.util.ArrayList has__Int__Value;
	private static com.hp.hpl.jena.rdf.model.Property has__Uncertainty__FactorProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Uncertainty_Factor");
	private java.util.ArrayList has__Uncertainty__Factor;
	private static com.hp.hpl.jena.rdf.model.Property has__PrecisionProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Precision");
	private java.util.ArrayList has__Precision;
	private static com.hp.hpl.jena.rdf.model.Property has__External__ReferenceProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_External_Reference");
	private java.util.ArrayList has__External__Reference;
	private static com.hp.hpl.jena.rdf.model.Property connects__toProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#connects_to");
	private java.util.ArrayList connects__to;
	private static com.hp.hpl.jena.rdf.model.Property hasProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has");
	private java.util.ArrayList has;
	private static com.hp.hpl.jena.rdf.model.Property precedesProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#precedes");
	private java.util.ArrayList precedes;
 

	CommonAncestralNodeImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static CommonAncestralNodeImpl getCommonAncestralNode(Resource resource, Model model) throws JastorException {
		return new CommonAncestralNodeImpl(resource, model);
	}
	    
	static CommonAncestralNodeImpl createCommonAncestralNode(Resource resource, Model model) throws JastorException { 
		CommonAncestralNodeImpl impl = new CommonAncestralNodeImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, CommonAncestralNode.TYPE)))
			impl._model.add(impl._resource, RDF.type, CommonAncestralNode.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
		if (!_model.contains(_resource, RDF.type, org.cdao.jastor.Node.TYPE))
			_model.add(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(_resource, RDF.type, org.cdao.jastor.Node.TYPE));     
		if (!_model.contains(_resource, RDF.type, org.cdao.jastor.AncestralNode.TYPE))
			_model.add(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(_resource, RDF.type, org.cdao.jastor.AncestralNode.TYPE));     
	}
   
	void addHasValueValues() {
	}
    
    private void setupModelListener() {
    	listeners = new java.util.ArrayList();
    	org.cdao.jastor.CDAOFactory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,part__ofProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__AncestorProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,belongs__to__Edge__as__ParentProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,belongs__to__Tree__as__RootProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,nca__node__ofProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,belongs__to__EdgeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,represents__TUProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__ParentProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,belongs__to__Edge__as__ChildProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__ChildProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__DescendantProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,belongs__to__TreeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,belongs__to__NetworkProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__AnnotationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,belongs__toProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__ValueProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__Support__ValueProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__Float__ValueProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__Int__ValueProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__Uncertainty__FactorProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__PrecisionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__External__ReferenceProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,connects__toProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,precedesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, org.cdao.jastor.CommonAncestralNode.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, org.cdao.jastor.Node.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, org.cdao.jastor.AncestralNode.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		part__of = null;
		has__Ancestor = null;
		belongs__to__Edge__as__Parent = null;
		belongs__to__Tree__as__Root = null;
		nca__node__of = null;
		belongs__to__Edge = null;
		represents__TU = null;
		has__Parent = null;
		belongs__to__Edge__as__Child = null;
		has__Child = null;
		has__Descendant = null;
		belongs__to__Tree = null;
		belongs__to__Network = null;
		has__Annotation = null;
		belongs__to = null;
		has__Value = null;
		has__Support__Value = null;
		has__Float__Value = null;
		has__Int__Value = null;
		has__Uncertainty__Factor = null;
		has__Precision = null;
		has__External__Reference = null;
		connects__to = null;
		has = null;
		precedes = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initPart__of() throws JastorException {
		this.part__of = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, part__ofProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#part_of properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing part__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.part__of.add(part__of);
			}
		}
	}

	public java.util.Iterator getPart__of() throws JastorException {
		if (part__of == null)
			initPart__of();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(part__of,_resource,part__ofProperty,true);
	}

	public void addPart__of(com.ibm.adtech.jastor.Thing part__of) throws JastorException {
		if (this.part__of == null)
			initPart__of();
		if (this.part__of.contains(part__of)) {
			this.part__of.remove(part__of);
			this.part__of.add(part__of);
			return;
		}
		this.part__of.add(part__of);
		_model.add(_model.createStatement(_resource,part__ofProperty,part__of.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addPart__of() throws JastorException {
		com.ibm.adtech.jastor.Thing part__of = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.part__of == null)
			initPart__of();
		this.part__of.add(part__of);
		_model.add(_model.createStatement(_resource,part__ofProperty,part__of.resource()));
		return part__of;
	}
	
	public com.ibm.adtech.jastor.Thing addPart__of(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing part__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.part__of == null)
			initPart__of();
		if (this.part__of.contains(part__of))
			return part__of;
		this.part__of.add(part__of);
		_model.add(_model.createStatement(_resource,part__ofProperty,part__of.resource()));
		return part__of;
	}
	
	public void removePart__of(com.ibm.adtech.jastor.Thing part__of) throws JastorException {
		if (this.part__of == null)
			initPart__of();
		if (!this.part__of.contains(part__of))
			return;
		if (!_model.contains(_resource, part__ofProperty, part__of.resource()))
			return;
		this.part__of.remove(part__of);
		_model.removeAll(_resource, part__ofProperty, part__of.resource());
	}
		 

	private void initHas__Ancestor() throws JastorException {
		this.has__Ancestor = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__AncestorProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Ancestor properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jastor.Node has__Ancestor = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
				this.has__Ancestor.add(has__Ancestor);
			}
		}
	}

	public java.util.Iterator getHas__Ancestor() throws JastorException {
		if (has__Ancestor == null)
			initHas__Ancestor();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Ancestor,_resource,has__AncestorProperty,true);
	}

	public void addHas__Ancestor(org.cdao.jastor.Node has__Ancestor) throws JastorException {
		if (this.has__Ancestor == null)
			initHas__Ancestor();
		if (this.has__Ancestor.contains(has__Ancestor)) {
			this.has__Ancestor.remove(has__Ancestor);
			this.has__Ancestor.add(has__Ancestor);
			return;
		}
		this.has__Ancestor.add(has__Ancestor);
		_model.add(_model.createStatement(_resource,has__AncestorProperty,has__Ancestor.resource()));
	}
	
	public org.cdao.jastor.Node addHas__Ancestor() throws JastorException {
		org.cdao.jastor.Node has__Ancestor = org.cdao.jastor.CDAOFactory.createNode(_model.createResource(),_model);
		if (this.has__Ancestor == null)
			initHas__Ancestor();
		this.has__Ancestor.add(has__Ancestor);
		_model.add(_model.createStatement(_resource,has__AncestorProperty,has__Ancestor.resource()));
		return has__Ancestor;
	}
	
	public org.cdao.jastor.Node addHas__Ancestor(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jastor.Node has__Ancestor = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
		if (this.has__Ancestor == null)
			initHas__Ancestor();
		if (this.has__Ancestor.contains(has__Ancestor))
			return has__Ancestor;
		this.has__Ancestor.add(has__Ancestor);
		_model.add(_model.createStatement(_resource,has__AncestorProperty,has__Ancestor.resource()));
		return has__Ancestor;
	}
	
	public void removeHas__Ancestor(org.cdao.jastor.Node has__Ancestor) throws JastorException {
		if (this.has__Ancestor == null)
			initHas__Ancestor();
		if (!this.has__Ancestor.contains(has__Ancestor))
			return;
		if (!_model.contains(_resource, has__AncestorProperty, has__Ancestor.resource()))
			return;
		this.has__Ancestor.remove(has__Ancestor);
		_model.removeAll(_resource, has__AncestorProperty, has__Ancestor.resource());
	}
		 

	private void initBelongs__to__Edge__as__Parent() throws JastorException {
		this.belongs__to__Edge__as__Parent = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, belongs__to__Edge__as__ParentProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#belongs_to_Edge_as_Parent properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jastor.DirectedEdge belongs__to__Edge__as__Parent = org.cdao.jastor.CDAOFactory.getDirectedEdge(resource,_model);
				this.belongs__to__Edge__as__Parent.add(belongs__to__Edge__as__Parent);
			}
		}
	}

	public java.util.Iterator getBelongs__to__Edge__as__Parent() throws JastorException {
		if (belongs__to__Edge__as__Parent == null)
			initBelongs__to__Edge__as__Parent();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(belongs__to__Edge__as__Parent,_resource,belongs__to__Edge__as__ParentProperty,true);
	}

	public void addBelongs__to__Edge__as__Parent(org.cdao.jastor.DirectedEdge belongs__to__Edge__as__Parent) throws JastorException {
		if (this.belongs__to__Edge__as__Parent == null)
			initBelongs__to__Edge__as__Parent();
		if (this.belongs__to__Edge__as__Parent.contains(belongs__to__Edge__as__Parent)) {
			this.belongs__to__Edge__as__Parent.remove(belongs__to__Edge__as__Parent);
			this.belongs__to__Edge__as__Parent.add(belongs__to__Edge__as__Parent);
			return;
		}
		this.belongs__to__Edge__as__Parent.add(belongs__to__Edge__as__Parent);
		_model.add(_model.createStatement(_resource,belongs__to__Edge__as__ParentProperty,belongs__to__Edge__as__Parent.resource()));
	}
	
	public org.cdao.jastor.DirectedEdge addBelongs__to__Edge__as__Parent() throws JastorException {
		org.cdao.jastor.DirectedEdge belongs__to__Edge__as__Parent = org.cdao.jastor.CDAOFactory.createDirectedEdge(_model.createResource(),_model);
		if (this.belongs__to__Edge__as__Parent == null)
			initBelongs__to__Edge__as__Parent();
		this.belongs__to__Edge__as__Parent.add(belongs__to__Edge__as__Parent);
		_model.add(_model.createStatement(_resource,belongs__to__Edge__as__ParentProperty,belongs__to__Edge__as__Parent.resource()));
		return belongs__to__Edge__as__Parent;
	}
	
	public org.cdao.jastor.DirectedEdge addBelongs__to__Edge__as__Parent(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jastor.DirectedEdge belongs__to__Edge__as__Parent = org.cdao.jastor.CDAOFactory.getDirectedEdge(resource,_model);
		if (this.belongs__to__Edge__as__Parent == null)
			initBelongs__to__Edge__as__Parent();
		if (this.belongs__to__Edge__as__Parent.contains(belongs__to__Edge__as__Parent))
			return belongs__to__Edge__as__Parent;
		this.belongs__to__Edge__as__Parent.add(belongs__to__Edge__as__Parent);
		_model.add(_model.createStatement(_resource,belongs__to__Edge__as__ParentProperty,belongs__to__Edge__as__Parent.resource()));
		return belongs__to__Edge__as__Parent;
	}
	
	public void removeBelongs__to__Edge__as__Parent(org.cdao.jastor.DirectedEdge belongs__to__Edge__as__Parent) throws JastorException {
		if (this.belongs__to__Edge__as__Parent == null)
			initBelongs__to__Edge__as__Parent();
		if (!this.belongs__to__Edge__as__Parent.contains(belongs__to__Edge__as__Parent))
			return;
		if (!_model.contains(_resource, belongs__to__Edge__as__ParentProperty, belongs__to__Edge__as__Parent.resource()))
			return;
		this.belongs__to__Edge__as__Parent.remove(belongs__to__Edge__as__Parent);
		_model.removeAll(_resource, belongs__to__Edge__as__ParentProperty, belongs__to__Edge__as__Parent.resource());
	}
		 

	private void initBelongs__to__Tree__as__Root() throws JastorException {
		this.belongs__to__Tree__as__Root = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, belongs__to__Tree__as__RootProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#belongs_to_Tree_as_Root properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jastor.Tree belongs__to__Tree__as__Root = org.cdao.jastor.CDAOFactory.getTree(resource,_model);
				this.belongs__to__Tree__as__Root.add(belongs__to__Tree__as__Root);
			}
		}
	}

	public java.util.Iterator getBelongs__to__Tree__as__Root() throws JastorException {
		if (belongs__to__Tree__as__Root == null)
			initBelongs__to__Tree__as__Root();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(belongs__to__Tree__as__Root,_resource,belongs__to__Tree__as__RootProperty,true);
	}

	public void addBelongs__to__Tree__as__Root(org.cdao.jastor.Tree belongs__to__Tree__as__Root) throws JastorException {
		if (this.belongs__to__Tree__as__Root == null)
			initBelongs__to__Tree__as__Root();
		if (this.belongs__to__Tree__as__Root.contains(belongs__to__Tree__as__Root)) {
			this.belongs__to__Tree__as__Root.remove(belongs__to__Tree__as__Root);
			this.belongs__to__Tree__as__Root.add(belongs__to__Tree__as__Root);
			return;
		}
		this.belongs__to__Tree__as__Root.add(belongs__to__Tree__as__Root);
		_model.add(_model.createStatement(_resource,belongs__to__Tree__as__RootProperty,belongs__to__Tree__as__Root.resource()));
	}
	
	public org.cdao.jastor.Tree addBelongs__to__Tree__as__Root() throws JastorException {
		org.cdao.jastor.Tree belongs__to__Tree__as__Root = org.cdao.jastor.CDAOFactory.createTree(_model.createResource(),_model);
		if (this.belongs__to__Tree__as__Root == null)
			initBelongs__to__Tree__as__Root();
		this.belongs__to__Tree__as__Root.add(belongs__to__Tree__as__Root);
		_model.add(_model.createStatement(_resource,belongs__to__Tree__as__RootProperty,belongs__to__Tree__as__Root.resource()));
		return belongs__to__Tree__as__Root;
	}
	
	public org.cdao.jastor.Tree addBelongs__to__Tree__as__Root(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jastor.Tree belongs__to__Tree__as__Root = org.cdao.jastor.CDAOFactory.getTree(resource,_model);
		if (this.belongs__to__Tree__as__Root == null)
			initBelongs__to__Tree__as__Root();
		if (this.belongs__to__Tree__as__Root.contains(belongs__to__Tree__as__Root))
			return belongs__to__Tree__as__Root;
		this.belongs__to__Tree__as__Root.add(belongs__to__Tree__as__Root);
		_model.add(_model.createStatement(_resource,belongs__to__Tree__as__RootProperty,belongs__to__Tree__as__Root.resource()));
		return belongs__to__Tree__as__Root;
	}
	
	public void removeBelongs__to__Tree__as__Root(org.cdao.jastor.Tree belongs__to__Tree__as__Root) throws JastorException {
		if (this.belongs__to__Tree__as__Root == null)
			initBelongs__to__Tree__as__Root();
		if (!this.belongs__to__Tree__as__Root.contains(belongs__to__Tree__as__Root))
			return;
		if (!_model.contains(_resource, belongs__to__Tree__as__RootProperty, belongs__to__Tree__as__Root.resource()))
			return;
		this.belongs__to__Tree__as__Root.remove(belongs__to__Tree__as__Root);
		_model.removeAll(_resource, belongs__to__Tree__as__RootProperty, belongs__to__Tree__as__Root.resource());
	}
		 

	private void initNca__node__of() throws JastorException {
		this.nca__node__of = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, nca__node__ofProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#nca_node_of properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jastor.SetOfNodes nca__node__of = org.cdao.jastor.CDAOFactory.getSetOfNodes(resource,_model);
				this.nca__node__of.add(nca__node__of);
			}
		}
	}

	public java.util.Iterator getNca__node__of() throws JastorException {
		if (nca__node__of == null)
			initNca__node__of();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(nca__node__of,_resource,nca__node__ofProperty,true);
	}

	public void addNca__node__of(org.cdao.jastor.SetOfNodes nca__node__of) throws JastorException {
		if (this.nca__node__of == null)
			initNca__node__of();
		if (this.nca__node__of.contains(nca__node__of)) {
			this.nca__node__of.remove(nca__node__of);
			this.nca__node__of.add(nca__node__of);
			return;
		}
		this.nca__node__of.add(nca__node__of);
		_model.add(_model.createStatement(_resource,nca__node__ofProperty,nca__node__of.resource()));
	}
	
	public org.cdao.jastor.SetOfNodes addNca__node__of() throws JastorException {
		org.cdao.jastor.SetOfNodes nca__node__of = org.cdao.jastor.CDAOFactory.createSetOfNodes(_model.createResource(),_model);
		if (this.nca__node__of == null)
			initNca__node__of();
		this.nca__node__of.add(nca__node__of);
		_model.add(_model.createStatement(_resource,nca__node__ofProperty,nca__node__of.resource()));
		return nca__node__of;
	}
	
	public org.cdao.jastor.SetOfNodes addNca__node__of(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jastor.SetOfNodes nca__node__of = org.cdao.jastor.CDAOFactory.getSetOfNodes(resource,_model);
		if (this.nca__node__of == null)
			initNca__node__of();
		if (this.nca__node__of.contains(nca__node__of))
			return nca__node__of;
		this.nca__node__of.add(nca__node__of);
		_model.add(_model.createStatement(_resource,nca__node__ofProperty,nca__node__of.resource()));
		return nca__node__of;
	}
	
	public void removeNca__node__of(org.cdao.jastor.SetOfNodes nca__node__of) throws JastorException {
		if (this.nca__node__of == null)
			initNca__node__of();
		if (!this.nca__node__of.contains(nca__node__of))
			return;
		if (!_model.contains(_resource, nca__node__ofProperty, nca__node__of.resource()))
			return;
		this.nca__node__of.remove(nca__node__of);
		_model.removeAll(_resource, nca__node__ofProperty, nca__node__of.resource());
	}
		 

	private void initBelongs__to__Edge() throws JastorException {
		this.belongs__to__Edge = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, belongs__to__EdgeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#belongs_to_Edge properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jastor.Edge belongs__to__Edge = org.cdao.jastor.CDAOFactory.getEdge(resource,_model);
				this.belongs__to__Edge.add(belongs__to__Edge);
			}
		}
	}

	public java.util.Iterator getBelongs__to__Edge() throws JastorException {
		if (belongs__to__Edge == null)
			initBelongs__to__Edge();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(belongs__to__Edge,_resource,belongs__to__EdgeProperty,true);
	}

	public void addBelongs__to__Edge(org.cdao.jastor.Edge belongs__to__Edge) throws JastorException {
		if (this.belongs__to__Edge == null)
			initBelongs__to__Edge();
		if (this.belongs__to__Edge.contains(belongs__to__Edge)) {
			this.belongs__to__Edge.remove(belongs__to__Edge);
			this.belongs__to__Edge.add(belongs__to__Edge);
			return;
		}
		this.belongs__to__Edge.add(belongs__to__Edge);
		_model.add(_model.createStatement(_resource,belongs__to__EdgeProperty,belongs__to__Edge.resource()));
	}
	
	public org.cdao.jastor.Edge addBelongs__to__Edge() throws JastorException {
		org.cdao.jastor.Edge belongs__to__Edge = org.cdao.jastor.CDAOFactory.createEdge(_model.createResource(),_model);
		if (this.belongs__to__Edge == null)
			initBelongs__to__Edge();
		this.belongs__to__Edge.add(belongs__to__Edge);
		_model.add(_model.createStatement(_resource,belongs__to__EdgeProperty,belongs__to__Edge.resource()));
		return belongs__to__Edge;
	}
	
	public org.cdao.jastor.Edge addBelongs__to__Edge(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jastor.Edge belongs__to__Edge = org.cdao.jastor.CDAOFactory.getEdge(resource,_model);
		if (this.belongs__to__Edge == null)
			initBelongs__to__Edge();
		if (this.belongs__to__Edge.contains(belongs__to__Edge))
			return belongs__to__Edge;
		this.belongs__to__Edge.add(belongs__to__Edge);
		_model.add(_model.createStatement(_resource,belongs__to__EdgeProperty,belongs__to__Edge.resource()));
		return belongs__to__Edge;
	}
	
	public void removeBelongs__to__Edge(org.cdao.jastor.Edge belongs__to__Edge) throws JastorException {
		if (this.belongs__to__Edge == null)
			initBelongs__to__Edge();
		if (!this.belongs__to__Edge.contains(belongs__to__Edge))
			return;
		if (!_model.contains(_resource, belongs__to__EdgeProperty, belongs__to__Edge.resource()))
			return;
		this.belongs__to__Edge.remove(belongs__to__Edge);
		_model.removeAll(_resource, belongs__to__EdgeProperty, belongs__to__Edge.resource());
	}
		 

	public org.cdao.jastor.TU getRepresents__TU() throws JastorException {
		if (represents__TU != null)
			return represents__TU;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, represents__TUProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
			throw new JastorInvalidRDFNodeException(uri() + ": represents__TU getProperty() in org.cdao.jasper.CommonAncestralNode model not Resource", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
		represents__TU = org.cdao.jastor.CDAOFactory.getTU(resource,_model);
		return represents__TU;
	}

	public void setRepresents__TU(org.cdao.jastor.TU represents__TU) throws JastorException {
		if (_model.contains(_resource,represents__TUProperty)) {
			_model.removeAll(_resource,represents__TUProperty,null);
		}
		this.represents__TU = represents__TU;
		if (represents__TU != null) {
			_model.add(_model.createStatement(_resource,represents__TUProperty, represents__TU.resource()));
		}			
	}
		
	public org.cdao.jastor.TU setRepresents__TU() throws JastorException {
		if (_model.contains(_resource,represents__TUProperty)) {
			_model.removeAll(_resource,represents__TUProperty,null);
		}
		org.cdao.jastor.TU represents__TU = org.cdao.jastor.CDAOFactory.createTU(_model.createResource(),_model);
		this.represents__TU = represents__TU;
		_model.add(_model.createStatement(_resource,represents__TUProperty, represents__TU.resource()));
		return represents__TU;
	}
	
	public org.cdao.jastor.TU setRepresents__TU(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		if (_model.contains(_resource,represents__TUProperty)) {
			_model.removeAll(_resource,represents__TUProperty,null);
		}
		org.cdao.jastor.TU represents__TU = org.cdao.jastor.CDAOFactory.getTU(resource,_model);
		this.represents__TU = represents__TU;
		_model.add(_model.createStatement(_resource,represents__TUProperty, represents__TU.resource()));
		return represents__TU;
	}
	

	private void initHas__Parent() throws JastorException {
		this.has__Parent = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__ParentProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Parent properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jastor.Node has__Parent = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
				this.has__Parent.add(has__Parent);
			}
		}
	}

	public java.util.Iterator getHas__Parent() throws JastorException {
		if (has__Parent == null)
			initHas__Parent();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Parent,_resource,has__ParentProperty,true);
	}

	public void addHas__Parent(org.cdao.jastor.Node has__Parent) throws JastorException {
		if (this.has__Parent == null)
			initHas__Parent();
		if (this.has__Parent.contains(has__Parent)) {
			this.has__Parent.remove(has__Parent);
			this.has__Parent.add(has__Parent);
			return;
		}
		this.has__Parent.add(has__Parent);
		_model.add(_model.createStatement(_resource,has__ParentProperty,has__Parent.resource()));
	}
	
	public org.cdao.jastor.Node addHas__Parent() throws JastorException {
		org.cdao.jastor.Node has__Parent = org.cdao.jastor.CDAOFactory.createNode(_model.createResource(),_model);
		if (this.has__Parent == null)
			initHas__Parent();
		this.has__Parent.add(has__Parent);
		_model.add(_model.createStatement(_resource,has__ParentProperty,has__Parent.resource()));
		return has__Parent;
	}
	
	public org.cdao.jastor.Node addHas__Parent(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jastor.Node has__Parent = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
		if (this.has__Parent == null)
			initHas__Parent();
		if (this.has__Parent.contains(has__Parent))
			return has__Parent;
		this.has__Parent.add(has__Parent);
		_model.add(_model.createStatement(_resource,has__ParentProperty,has__Parent.resource()));
		return has__Parent;
	}
	
	public void removeHas__Parent(org.cdao.jastor.Node has__Parent) throws JastorException {
		if (this.has__Parent == null)
			initHas__Parent();
		if (!this.has__Parent.contains(has__Parent))
			return;
		if (!_model.contains(_resource, has__ParentProperty, has__Parent.resource()))
			return;
		this.has__Parent.remove(has__Parent);
		_model.removeAll(_resource, has__ParentProperty, has__Parent.resource());
	}
		 

	public org.cdao.jastor.DirectedEdge getBelongs__to__Edge__as__Child() throws JastorException {
		if (belongs__to__Edge__as__Child != null)
			return belongs__to__Edge__as__Child;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, belongs__to__Edge__as__ChildProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
			throw new JastorInvalidRDFNodeException(uri() + ": belongs__to__Edge__as__Child getProperty() in org.cdao.jasper.CommonAncestralNode model not Resource", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
		belongs__to__Edge__as__Child = org.cdao.jastor.CDAOFactory.getDirectedEdge(resource,_model);
		return belongs__to__Edge__as__Child;
	}

	public void setBelongs__to__Edge__as__Child(org.cdao.jastor.DirectedEdge belongs__to__Edge__as__Child) throws JastorException {
		if (_model.contains(_resource,belongs__to__Edge__as__ChildProperty)) {
			_model.removeAll(_resource,belongs__to__Edge__as__ChildProperty,null);
		}
		this.belongs__to__Edge__as__Child = belongs__to__Edge__as__Child;
		if (belongs__to__Edge__as__Child != null) {
			_model.add(_model.createStatement(_resource,belongs__to__Edge__as__ChildProperty, belongs__to__Edge__as__Child.resource()));
		}			
	}
		
	public org.cdao.jastor.DirectedEdge setBelongs__to__Edge__as__Child() throws JastorException {
		if (_model.contains(_resource,belongs__to__Edge__as__ChildProperty)) {
			_model.removeAll(_resource,belongs__to__Edge__as__ChildProperty,null);
		}
		org.cdao.jastor.DirectedEdge belongs__to__Edge__as__Child = org.cdao.jastor.CDAOFactory.createDirectedEdge(_model.createResource(),_model);
		this.belongs__to__Edge__as__Child = belongs__to__Edge__as__Child;
		_model.add(_model.createStatement(_resource,belongs__to__Edge__as__ChildProperty, belongs__to__Edge__as__Child.resource()));
		return belongs__to__Edge__as__Child;
	}
	
	public org.cdao.jastor.DirectedEdge setBelongs__to__Edge__as__Child(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		if (_model.contains(_resource,belongs__to__Edge__as__ChildProperty)) {
			_model.removeAll(_resource,belongs__to__Edge__as__ChildProperty,null);
		}
		org.cdao.jastor.DirectedEdge belongs__to__Edge__as__Child = org.cdao.jastor.CDAOFactory.getDirectedEdge(resource,_model);
		this.belongs__to__Edge__as__Child = belongs__to__Edge__as__Child;
		_model.add(_model.createStatement(_resource,belongs__to__Edge__as__ChildProperty, belongs__to__Edge__as__Child.resource()));
		return belongs__to__Edge__as__Child;
	}
	

	private void initHas__Child() throws JastorException {
		this.has__Child = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__ChildProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Child properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jastor.Node has__Child = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
				this.has__Child.add(has__Child);
			}
		}
	}

	public java.util.Iterator getHas__Child() throws JastorException {
		if (has__Child == null)
			initHas__Child();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Child,_resource,has__ChildProperty,true);
	}

	public void addHas__Child(org.cdao.jastor.Node has__Child) throws JastorException {
		if (this.has__Child == null)
			initHas__Child();
		if (this.has__Child.contains(has__Child)) {
			this.has__Child.remove(has__Child);
			this.has__Child.add(has__Child);
			return;
		}
		this.has__Child.add(has__Child);
		_model.add(_model.createStatement(_resource,has__ChildProperty,has__Child.resource()));
	}
	
	public org.cdao.jastor.Node addHas__Child() throws JastorException {
		org.cdao.jastor.Node has__Child = org.cdao.jastor.CDAOFactory.createNode(_model.createResource(),_model);
		if (this.has__Child == null)
			initHas__Child();
		this.has__Child.add(has__Child);
		_model.add(_model.createStatement(_resource,has__ChildProperty,has__Child.resource()));
		return has__Child;
	}
	
	public org.cdao.jastor.Node addHas__Child(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jastor.Node has__Child = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
		if (this.has__Child == null)
			initHas__Child();
		if (this.has__Child.contains(has__Child))
			return has__Child;
		this.has__Child.add(has__Child);
		_model.add(_model.createStatement(_resource,has__ChildProperty,has__Child.resource()));
		return has__Child;
	}
	
	public void removeHas__Child(org.cdao.jastor.Node has__Child) throws JastorException {
		if (this.has__Child == null)
			initHas__Child();
		if (!this.has__Child.contains(has__Child))
			return;
		if (!_model.contains(_resource, has__ChildProperty, has__Child.resource()))
			return;
		this.has__Child.remove(has__Child);
		_model.removeAll(_resource, has__ChildProperty, has__Child.resource());
	}
		 

	private void initHas__Descendant() throws JastorException {
		this.has__Descendant = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__DescendantProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Descendant properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jastor.Node has__Descendant = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
				this.has__Descendant.add(has__Descendant);
			}
		}
	}

	public java.util.Iterator getHas__Descendant() throws JastorException {
		if (has__Descendant == null)
			initHas__Descendant();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Descendant,_resource,has__DescendantProperty,true);
	}

	public void addHas__Descendant(org.cdao.jastor.Node has__Descendant) throws JastorException {
		if (this.has__Descendant == null)
			initHas__Descendant();
		if (this.has__Descendant.contains(has__Descendant)) {
			this.has__Descendant.remove(has__Descendant);
			this.has__Descendant.add(has__Descendant);
			return;
		}
		this.has__Descendant.add(has__Descendant);
		_model.add(_model.createStatement(_resource,has__DescendantProperty,has__Descendant.resource()));
	}
	
	public org.cdao.jastor.Node addHas__Descendant() throws JastorException {
		org.cdao.jastor.Node has__Descendant = org.cdao.jastor.CDAOFactory.createNode(_model.createResource(),_model);
		if (this.has__Descendant == null)
			initHas__Descendant();
		this.has__Descendant.add(has__Descendant);
		_model.add(_model.createStatement(_resource,has__DescendantProperty,has__Descendant.resource()));
		return has__Descendant;
	}
	
	public org.cdao.jastor.Node addHas__Descendant(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jastor.Node has__Descendant = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
		if (this.has__Descendant == null)
			initHas__Descendant();
		if (this.has__Descendant.contains(has__Descendant))
			return has__Descendant;
		this.has__Descendant.add(has__Descendant);
		_model.add(_model.createStatement(_resource,has__DescendantProperty,has__Descendant.resource()));
		return has__Descendant;
	}
	
	public void removeHas__Descendant(org.cdao.jastor.Node has__Descendant) throws JastorException {
		if (this.has__Descendant == null)
			initHas__Descendant();
		if (!this.has__Descendant.contains(has__Descendant))
			return;
		if (!_model.contains(_resource, has__DescendantProperty, has__Descendant.resource()))
			return;
		this.has__Descendant.remove(has__Descendant);
		_model.removeAll(_resource, has__DescendantProperty, has__Descendant.resource());
	}
		 

	private void initBelongs__to__Tree() throws JastorException {
		this.belongs__to__Tree = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, belongs__to__TreeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#belongs_to_Tree properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jastor.Tree belongs__to__Tree = org.cdao.jastor.CDAOFactory.getTree(resource,_model);
				this.belongs__to__Tree.add(belongs__to__Tree);
			}
		}
	}

	public java.util.Iterator getBelongs__to__Tree() throws JastorException {
		if (belongs__to__Tree == null)
			initBelongs__to__Tree();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(belongs__to__Tree,_resource,belongs__to__TreeProperty,true);
	}

	public void addBelongs__to__Tree(org.cdao.jastor.Tree belongs__to__Tree) throws JastorException {
		if (this.belongs__to__Tree == null)
			initBelongs__to__Tree();
		if (this.belongs__to__Tree.contains(belongs__to__Tree)) {
			this.belongs__to__Tree.remove(belongs__to__Tree);
			this.belongs__to__Tree.add(belongs__to__Tree);
			return;
		}
		this.belongs__to__Tree.add(belongs__to__Tree);
		_model.add(_model.createStatement(_resource,belongs__to__TreeProperty,belongs__to__Tree.resource()));
	}
	
	public org.cdao.jastor.Tree addBelongs__to__Tree() throws JastorException {
		org.cdao.jastor.Tree belongs__to__Tree = org.cdao.jastor.CDAOFactory.createTree(_model.createResource(),_model);
		if (this.belongs__to__Tree == null)
			initBelongs__to__Tree();
		this.belongs__to__Tree.add(belongs__to__Tree);
		_model.add(_model.createStatement(_resource,belongs__to__TreeProperty,belongs__to__Tree.resource()));
		return belongs__to__Tree;
	}
	
	public org.cdao.jastor.Tree addBelongs__to__Tree(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jastor.Tree belongs__to__Tree = org.cdao.jastor.CDAOFactory.getTree(resource,_model);
		if (this.belongs__to__Tree == null)
			initBelongs__to__Tree();
		if (this.belongs__to__Tree.contains(belongs__to__Tree))
			return belongs__to__Tree;
		this.belongs__to__Tree.add(belongs__to__Tree);
		_model.add(_model.createStatement(_resource,belongs__to__TreeProperty,belongs__to__Tree.resource()));
		return belongs__to__Tree;
	}
	
	public void removeBelongs__to__Tree(org.cdao.jastor.Tree belongs__to__Tree) throws JastorException {
		if (this.belongs__to__Tree == null)
			initBelongs__to__Tree();
		if (!this.belongs__to__Tree.contains(belongs__to__Tree))
			return;
		if (!_model.contains(_resource, belongs__to__TreeProperty, belongs__to__Tree.resource()))
			return;
		this.belongs__to__Tree.remove(belongs__to__Tree);
		_model.removeAll(_resource, belongs__to__TreeProperty, belongs__to__Tree.resource());
	}
		 

	private void initBelongs__to__Network() throws JastorException {
		this.belongs__to__Network = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, belongs__to__NetworkProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#belongs_to_Network properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jastor.Network belongs__to__Network = org.cdao.jastor.CDAOFactory.getNetwork(resource,_model);
				this.belongs__to__Network.add(belongs__to__Network);
			}
		}
	}

	public java.util.Iterator getBelongs__to__Network() throws JastorException {
		if (belongs__to__Network == null)
			initBelongs__to__Network();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(belongs__to__Network,_resource,belongs__to__NetworkProperty,true);
	}

	public void addBelongs__to__Network(org.cdao.jastor.Network belongs__to__Network) throws JastorException {
		if (this.belongs__to__Network == null)
			initBelongs__to__Network();
		if (this.belongs__to__Network.contains(belongs__to__Network)) {
			this.belongs__to__Network.remove(belongs__to__Network);
			this.belongs__to__Network.add(belongs__to__Network);
			return;
		}
		this.belongs__to__Network.add(belongs__to__Network);
		_model.add(_model.createStatement(_resource,belongs__to__NetworkProperty,belongs__to__Network.resource()));
	}
	
	public org.cdao.jastor.Network addBelongs__to__Network() throws JastorException {
		org.cdao.jastor.Network belongs__to__Network = org.cdao.jastor.CDAOFactory.createNetwork(_model.createResource(),_model);
		if (this.belongs__to__Network == null)
			initBelongs__to__Network();
		this.belongs__to__Network.add(belongs__to__Network);
		_model.add(_model.createStatement(_resource,belongs__to__NetworkProperty,belongs__to__Network.resource()));
		return belongs__to__Network;
	}
	
	public org.cdao.jastor.Network addBelongs__to__Network(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jastor.Network belongs__to__Network = org.cdao.jastor.CDAOFactory.getNetwork(resource,_model);
		if (this.belongs__to__Network == null)
			initBelongs__to__Network();
		if (this.belongs__to__Network.contains(belongs__to__Network))
			return belongs__to__Network;
		this.belongs__to__Network.add(belongs__to__Network);
		_model.add(_model.createStatement(_resource,belongs__to__NetworkProperty,belongs__to__Network.resource()));
		return belongs__to__Network;
	}
	
	public void removeBelongs__to__Network(org.cdao.jastor.Network belongs__to__Network) throws JastorException {
		if (this.belongs__to__Network == null)
			initBelongs__to__Network();
		if (!this.belongs__to__Network.contains(belongs__to__Network))
			return;
		if (!_model.contains(_resource, belongs__to__NetworkProperty, belongs__to__Network.resource()))
			return;
		this.belongs__to__Network.remove(belongs__to__Network);
		_model.removeAll(_resource, belongs__to__NetworkProperty, belongs__to__Network.resource());
	}
		 

	private void initHas__Annotation() throws JastorException {
		this.has__Annotation = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__AnnotationProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Annotation properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jastor.CDAOAnnotation has__Annotation = org.cdao.jastor.CDAOFactory.getCDAOAnnotation(resource,_model);
				this.has__Annotation.add(has__Annotation);
			}
		}
	}

	public java.util.Iterator getHas__Annotation() throws JastorException {
		if (has__Annotation == null)
			initHas__Annotation();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Annotation,_resource,has__AnnotationProperty,true);
	}

	public void addHas__Annotation(org.cdao.jastor.CDAOAnnotation has__Annotation) throws JastorException {
		if (this.has__Annotation == null)
			initHas__Annotation();
		if (this.has__Annotation.contains(has__Annotation)) {
			this.has__Annotation.remove(has__Annotation);
			this.has__Annotation.add(has__Annotation);
			return;
		}
		this.has__Annotation.add(has__Annotation);
		_model.add(_model.createStatement(_resource,has__AnnotationProperty,has__Annotation.resource()));
	}
	
	public org.cdao.jastor.CDAOAnnotation addHas__Annotation() throws JastorException {
		org.cdao.jastor.CDAOAnnotation has__Annotation = org.cdao.jastor.CDAOFactory.createCDAOAnnotation(_model.createResource(),_model);
		if (this.has__Annotation == null)
			initHas__Annotation();
		this.has__Annotation.add(has__Annotation);
		_model.add(_model.createStatement(_resource,has__AnnotationProperty,has__Annotation.resource()));
		return has__Annotation;
	}
	
	public org.cdao.jastor.CDAOAnnotation addHas__Annotation(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jastor.CDAOAnnotation has__Annotation = org.cdao.jastor.CDAOFactory.getCDAOAnnotation(resource,_model);
		if (this.has__Annotation == null)
			initHas__Annotation();
		if (this.has__Annotation.contains(has__Annotation))
			return has__Annotation;
		this.has__Annotation.add(has__Annotation);
		_model.add(_model.createStatement(_resource,has__AnnotationProperty,has__Annotation.resource()));
		return has__Annotation;
	}
	
	public void removeHas__Annotation(org.cdao.jastor.CDAOAnnotation has__Annotation) throws JastorException {
		if (this.has__Annotation == null)
			initHas__Annotation();
		if (!this.has__Annotation.contains(has__Annotation))
			return;
		if (!_model.contains(_resource, has__AnnotationProperty, has__Annotation.resource()))
			return;
		this.has__Annotation.remove(has__Annotation);
		_model.removeAll(_resource, has__AnnotationProperty, has__Annotation.resource());
	}
		 

	private void initBelongs__to() throws JastorException {
		this.belongs__to = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, belongs__toProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#belongs_to properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing belongs__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.belongs__to.add(belongs__to);
			}
		}
	}

	public java.util.Iterator getBelongs__to() throws JastorException {
		if (belongs__to == null)
			initBelongs__to();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(belongs__to,_resource,belongs__toProperty,true);
	}

	public void addBelongs__to(com.ibm.adtech.jastor.Thing belongs__to) throws JastorException {
		if (this.belongs__to == null)
			initBelongs__to();
		if (this.belongs__to.contains(belongs__to)) {
			this.belongs__to.remove(belongs__to);
			this.belongs__to.add(belongs__to);
			return;
		}
		this.belongs__to.add(belongs__to);
		_model.add(_model.createStatement(_resource,belongs__toProperty,belongs__to.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addBelongs__to() throws JastorException {
		com.ibm.adtech.jastor.Thing belongs__to = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.belongs__to == null)
			initBelongs__to();
		this.belongs__to.add(belongs__to);
		_model.add(_model.createStatement(_resource,belongs__toProperty,belongs__to.resource()));
		return belongs__to;
	}
	
	public com.ibm.adtech.jastor.Thing addBelongs__to(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing belongs__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.belongs__to == null)
			initBelongs__to();
		if (this.belongs__to.contains(belongs__to))
			return belongs__to;
		this.belongs__to.add(belongs__to);
		_model.add(_model.createStatement(_resource,belongs__toProperty,belongs__to.resource()));
		return belongs__to;
	}
	
	public void removeBelongs__to(com.ibm.adtech.jastor.Thing belongs__to) throws JastorException {
		if (this.belongs__to == null)
			initBelongs__to();
		if (!this.belongs__to.contains(belongs__to))
			return;
		if (!_model.contains(_resource, belongs__toProperty, belongs__to.resource()))
			return;
		this.belongs__to.remove(belongs__to);
		_model.removeAll(_resource, belongs__toProperty, belongs__to.resource());
	}
		 

	private void initHas__Value() throws JastorException {
		has__Value = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, has__ValueProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Value properties in CommonAncestralNode model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#anySimpleType");
			if (obj != null)
				has__Value.add(obj);
		}
	}

	public java.util.Iterator getHas__Value() throws JastorException {
		if (has__Value == null)
			initHas__Value();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Value,_resource,has__ValueProperty,false);
	}

	public void addHas__Value(java.lang.String has__Value) throws JastorException {
		if (this.has__Value == null)
			initHas__Value();
		if (this.has__Value.contains(has__Value))
			return;
		if (_model.contains(_resource, has__ValueProperty, createLiteral(has__Value)))
			return;
		this.has__Value.add(has__Value);
		_model.add(_resource, has__ValueProperty, createLiteral(has__Value));
	}
	
	public void removeHas__Value(java.lang.String has__Value) throws JastorException {
		if (this.has__Value == null)
			initHas__Value();
		if (!this.has__Value.contains(has__Value))
			return;
		if (!_model.contains(_resource, has__ValueProperty, createLiteral(has__Value)))
			return;
		this.has__Value.remove(has__Value);
		_model.removeAll(_resource, has__ValueProperty, createLiteral(has__Value));
	}


	private void initHas__Support__Value() throws JastorException {
		has__Support__Value = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, has__Support__ValueProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Support_Value properties in CommonAncestralNode model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
			if (obj != null)
				has__Support__Value.add(obj);
		}
	}

	public java.util.Iterator getHas__Support__Value() throws JastorException {
		if (has__Support__Value == null)
			initHas__Support__Value();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Support__Value,_resource,has__Support__ValueProperty,false);
	}

	public void addHas__Support__Value(java.lang.Float has__Support__Value) throws JastorException {
		if (this.has__Support__Value == null)
			initHas__Support__Value();
		if (this.has__Support__Value.contains(has__Support__Value))
			return;
		if (_model.contains(_resource, has__Support__ValueProperty, createLiteral(has__Support__Value)))
			return;
		this.has__Support__Value.add(has__Support__Value);
		_model.add(_resource, has__Support__ValueProperty, createLiteral(has__Support__Value));
	}
	
	public void removeHas__Support__Value(java.lang.Float has__Support__Value) throws JastorException {
		if (this.has__Support__Value == null)
			initHas__Support__Value();
		if (!this.has__Support__Value.contains(has__Support__Value))
			return;
		if (!_model.contains(_resource, has__Support__ValueProperty, createLiteral(has__Support__Value)))
			return;
		this.has__Support__Value.remove(has__Support__Value);
		_model.removeAll(_resource, has__Support__ValueProperty, createLiteral(has__Support__Value));
	}


	private void initHas__Float__Value() throws JastorException {
		has__Float__Value = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, has__Float__ValueProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Float_Value properties in CommonAncestralNode model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
			if (obj != null)
				has__Float__Value.add(obj);
		}
	}

	public java.util.Iterator getHas__Float__Value() throws JastorException {
		if (has__Float__Value == null)
			initHas__Float__Value();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Float__Value,_resource,has__Float__ValueProperty,false);
	}

	public void addHas__Float__Value(java.lang.Float has__Float__Value) throws JastorException {
		if (this.has__Float__Value == null)
			initHas__Float__Value();
		if (this.has__Float__Value.contains(has__Float__Value))
			return;
		if (_model.contains(_resource, has__Float__ValueProperty, createLiteral(has__Float__Value)))
			return;
		this.has__Float__Value.add(has__Float__Value);
		_model.add(_resource, has__Float__ValueProperty, createLiteral(has__Float__Value));
	}
	
	public void removeHas__Float__Value(java.lang.Float has__Float__Value) throws JastorException {
		if (this.has__Float__Value == null)
			initHas__Float__Value();
		if (!this.has__Float__Value.contains(has__Float__Value))
			return;
		if (!_model.contains(_resource, has__Float__ValueProperty, createLiteral(has__Float__Value)))
			return;
		this.has__Float__Value.remove(has__Float__Value);
		_model.removeAll(_resource, has__Float__ValueProperty, createLiteral(has__Float__Value));
	}


	private void initHas__Int__Value() throws JastorException {
		has__Int__Value = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, has__Int__ValueProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Int_Value properties in CommonAncestralNode model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
			if (obj != null)
				has__Int__Value.add(obj);
		}
	}

	public java.util.Iterator getHas__Int__Value() throws JastorException {
		if (has__Int__Value == null)
			initHas__Int__Value();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Int__Value,_resource,has__Int__ValueProperty,false);
	}

	public void addHas__Int__Value(java.lang.Integer has__Int__Value) throws JastorException {
		if (this.has__Int__Value == null)
			initHas__Int__Value();
		if (this.has__Int__Value.contains(has__Int__Value))
			return;
		if (_model.contains(_resource, has__Int__ValueProperty, createLiteral(has__Int__Value)))
			return;
		this.has__Int__Value.add(has__Int__Value);
		_model.add(_resource, has__Int__ValueProperty, createLiteral(has__Int__Value));
	}
	
	public void removeHas__Int__Value(java.lang.Integer has__Int__Value) throws JastorException {
		if (this.has__Int__Value == null)
			initHas__Int__Value();
		if (!this.has__Int__Value.contains(has__Int__Value))
			return;
		if (!_model.contains(_resource, has__Int__ValueProperty, createLiteral(has__Int__Value)))
			return;
		this.has__Int__Value.remove(has__Int__Value);
		_model.removeAll(_resource, has__Int__ValueProperty, createLiteral(has__Int__Value));
	}


	private void initHas__Uncertainty__Factor() throws JastorException {
		has__Uncertainty__Factor = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, has__Uncertainty__FactorProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Uncertainty_Factor properties in CommonAncestralNode model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
			if (obj != null)
				has__Uncertainty__Factor.add(obj);
		}
	}

	public java.util.Iterator getHas__Uncertainty__Factor() throws JastorException {
		if (has__Uncertainty__Factor == null)
			initHas__Uncertainty__Factor();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Uncertainty__Factor,_resource,has__Uncertainty__FactorProperty,false);
	}

	public void addHas__Uncertainty__Factor(java.lang.Float has__Uncertainty__Factor) throws JastorException {
		if (this.has__Uncertainty__Factor == null)
			initHas__Uncertainty__Factor();
		if (this.has__Uncertainty__Factor.contains(has__Uncertainty__Factor))
			return;
		if (_model.contains(_resource, has__Uncertainty__FactorProperty, createLiteral(has__Uncertainty__Factor)))
			return;
		this.has__Uncertainty__Factor.add(has__Uncertainty__Factor);
		_model.add(_resource, has__Uncertainty__FactorProperty, createLiteral(has__Uncertainty__Factor));
	}
	
	public void removeHas__Uncertainty__Factor(java.lang.Float has__Uncertainty__Factor) throws JastorException {
		if (this.has__Uncertainty__Factor == null)
			initHas__Uncertainty__Factor();
		if (!this.has__Uncertainty__Factor.contains(has__Uncertainty__Factor))
			return;
		if (!_model.contains(_resource, has__Uncertainty__FactorProperty, createLiteral(has__Uncertainty__Factor)))
			return;
		this.has__Uncertainty__Factor.remove(has__Uncertainty__Factor);
		_model.removeAll(_resource, has__Uncertainty__FactorProperty, createLiteral(has__Uncertainty__Factor));
	}


	private void initHas__Precision() throws JastorException {
		has__Precision = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, has__PrecisionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Precision properties in CommonAncestralNode model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
			if (obj != null)
				has__Precision.add(obj);
		}
	}

	public java.util.Iterator getHas__Precision() throws JastorException {
		if (has__Precision == null)
			initHas__Precision();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Precision,_resource,has__PrecisionProperty,false);
	}

	public void addHas__Precision(java.lang.Float has__Precision) throws JastorException {
		if (this.has__Precision == null)
			initHas__Precision();
		if (this.has__Precision.contains(has__Precision))
			return;
		if (_model.contains(_resource, has__PrecisionProperty, createLiteral(has__Precision)))
			return;
		this.has__Precision.add(has__Precision);
		_model.add(_resource, has__PrecisionProperty, createLiteral(has__Precision));
	}
	
	public void removeHas__Precision(java.lang.Float has__Precision) throws JastorException {
		if (this.has__Precision == null)
			initHas__Precision();
		if (!this.has__Precision.contains(has__Precision))
			return;
		if (!_model.contains(_resource, has__PrecisionProperty, createLiteral(has__Precision)))
			return;
		this.has__Precision.remove(has__Precision);
		_model.removeAll(_resource, has__PrecisionProperty, createLiteral(has__Precision));
	}


	private void initHas__External__Reference() throws JastorException {
		has__External__Reference = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, has__External__ReferenceProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_External_Reference properties in CommonAncestralNode model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			has__External__Reference.add(literal);
		}
	}

	public java.util.Iterator getHas__External__Reference() throws JastorException {
		if (has__External__Reference == null)
			initHas__External__Reference();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__External__Reference,_resource,has__External__ReferenceProperty,false);
	}

	public void addHas__External__Reference(com.hp.hpl.jena.rdf.model.Literal has__External__Reference) throws JastorException {
		if (this.has__External__Reference == null)
			initHas__External__Reference();
		if (this.has__External__Reference.contains(has__External__Reference))
			return;
		if (_model.contains(_resource, has__External__ReferenceProperty, createLiteral(has__External__Reference)))
			return;
		this.has__External__Reference.add(has__External__Reference);
		_model.add(_resource, has__External__ReferenceProperty, has__External__Reference);
	}
	
	public void removeHas__External__Reference(com.hp.hpl.jena.rdf.model.Literal has__External__Reference) throws JastorException {
		if (this.has__External__Reference == null)
			initHas__External__Reference();
		if (!this.has__External__Reference.contains(has__External__Reference))
			return;
		if (!_model.contains(_resource, has__External__ReferenceProperty, createLiteral(has__External__Reference)))
			return;
		this.has__External__Reference.remove(has__External__Reference);
		_model.removeAll(_resource, has__External__ReferenceProperty, createLiteral(has__External__Reference));
	}


	private void initConnects__to() throws JastorException {
		this.connects__to = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, connects__toProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#connects_to properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing connects__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.connects__to.add(connects__to);
			}
		}
	}

	public java.util.Iterator getConnects__to() throws JastorException {
		if (connects__to == null)
			initConnects__to();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(connects__to,_resource,connects__toProperty,true);
	}

	public void addConnects__to(com.ibm.adtech.jastor.Thing connects__to) throws JastorException {
		if (this.connects__to == null)
			initConnects__to();
		if (this.connects__to.contains(connects__to)) {
			this.connects__to.remove(connects__to);
			this.connects__to.add(connects__to);
			return;
		}
		this.connects__to.add(connects__to);
		_model.add(_model.createStatement(_resource,connects__toProperty,connects__to.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addConnects__to() throws JastorException {
		com.ibm.adtech.jastor.Thing connects__to = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.connects__to == null)
			initConnects__to();
		this.connects__to.add(connects__to);
		_model.add(_model.createStatement(_resource,connects__toProperty,connects__to.resource()));
		return connects__to;
	}
	
	public com.ibm.adtech.jastor.Thing addConnects__to(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing connects__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.connects__to == null)
			initConnects__to();
		if (this.connects__to.contains(connects__to))
			return connects__to;
		this.connects__to.add(connects__to);
		_model.add(_model.createStatement(_resource,connects__toProperty,connects__to.resource()));
		return connects__to;
	}
	
	public void removeConnects__to(com.ibm.adtech.jastor.Thing connects__to) throws JastorException {
		if (this.connects__to == null)
			initConnects__to();
		if (!this.connects__to.contains(connects__to))
			return;
		if (!_model.contains(_resource, connects__toProperty, connects__to.resource()))
			return;
		this.connects__to.remove(connects__to);
		_model.removeAll(_resource, connects__toProperty, connects__to.resource());
	}
		 

	private void initHas() throws JastorException {
		this.has = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, hasProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing has = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.has.add(has);
			}
		}
	}

	public java.util.Iterator getHas() throws JastorException {
		if (has == null)
			initHas();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has,_resource,hasProperty,true);
	}

	public void addHas(com.ibm.adtech.jastor.Thing has) throws JastorException {
		if (this.has == null)
			initHas();
		if (this.has.contains(has)) {
			this.has.remove(has);
			this.has.add(has);
			return;
		}
		this.has.add(has);
		_model.add(_model.createStatement(_resource,hasProperty,has.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addHas() throws JastorException {
		com.ibm.adtech.jastor.Thing has = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.has == null)
			initHas();
		this.has.add(has);
		_model.add(_model.createStatement(_resource,hasProperty,has.resource()));
		return has;
	}
	
	public com.ibm.adtech.jastor.Thing addHas(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing has = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.has == null)
			initHas();
		if (this.has.contains(has))
			return has;
		this.has.add(has);
		_model.add(_model.createStatement(_resource,hasProperty,has.resource()));
		return has;
	}
	
	public void removeHas(com.ibm.adtech.jastor.Thing has) throws JastorException {
		if (this.has == null)
			initHas();
		if (!this.has.contains(has))
			return;
		if (!_model.contains(_resource, hasProperty, has.resource()))
			return;
		this.has.remove(has);
		_model.removeAll(_resource, hasProperty, has.resource());
	}
		 

	private void initPrecedes() throws JastorException {
		this.precedes = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, precedesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#precedes properties in CommonAncestralNode model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing precedes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.precedes.add(precedes);
			}
		}
	}

	public java.util.Iterator getPrecedes() throws JastorException {
		if (precedes == null)
			initPrecedes();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(precedes,_resource,precedesProperty,true);
	}

	public void addPrecedes(com.ibm.adtech.jastor.Thing precedes) throws JastorException {
		if (this.precedes == null)
			initPrecedes();
		if (this.precedes.contains(precedes)) {
			this.precedes.remove(precedes);
			this.precedes.add(precedes);
			return;
		}
		this.precedes.add(precedes);
		_model.add(_model.createStatement(_resource,precedesProperty,precedes.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addPrecedes() throws JastorException {
		com.ibm.adtech.jastor.Thing precedes = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.precedes == null)
			initPrecedes();
		this.precedes.add(precedes);
		_model.add(_model.createStatement(_resource,precedesProperty,precedes.resource()));
		return precedes;
	}
	
	public com.ibm.adtech.jastor.Thing addPrecedes(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing precedes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.precedes == null)
			initPrecedes();
		if (this.precedes.contains(precedes))
			return precedes;
		this.precedes.add(precedes);
		_model.add(_model.createStatement(_resource,precedesProperty,precedes.resource()));
		return precedes;
	}
	
	public void removePrecedes(com.ibm.adtech.jastor.Thing precedes) throws JastorException {
		if (this.precedes == null)
			initPrecedes();
		if (!this.precedes.contains(precedes))
			return;
		if (!_model.contains(_resource, precedesProperty, precedes.resource()))
			return;
		this.precedes.remove(precedes);
		_model.removeAll(_resource, precedesProperty, precedes.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof CommonAncestralNodeListener))
			throw new IllegalArgumentException("ThingListener must be instance of CommonAncestralNodeListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((CommonAncestralNodeListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof CommonAncestralNodeListener))
			throw new IllegalArgumentException("ThingListener must be instance of CommonAncestralNodeListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(part__ofProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _part__of = null;
					try {
						_part__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (part__of == null) {
						try {
							initPart__of();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!part__of.contains(_part__of))
						part__of.add(_part__of);
					if (listeners != null) {
						java.util.ArrayList consumersForPart__of;
						synchronized (listeners) {
							consumersForPart__of = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPart__of.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.part__ofAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_part__of);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__AncestorProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Node _has__Ancestor = null;
					try {
						_has__Ancestor = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__Ancestor == null) {
						try {
							initHas__Ancestor();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__Ancestor.contains(_has__Ancestor))
						has__Ancestor.add(_has__Ancestor);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Ancestor;
						synchronized (listeners) {
							consumersForHas__Ancestor = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Ancestor.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.has__AncestorAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_has__Ancestor);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__Edge__as__ParentProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.DirectedEdge _belongs__to__Edge__as__Parent = null;
					try {
						_belongs__to__Edge__as__Parent = org.cdao.jastor.CDAOFactory.getDirectedEdge(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (belongs__to__Edge__as__Parent == null) {
						try {
							initBelongs__to__Edge__as__Parent();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!belongs__to__Edge__as__Parent.contains(_belongs__to__Edge__as__Parent))
						belongs__to__Edge__as__Parent.add(_belongs__to__Edge__as__Parent);
					if (listeners != null) {
						java.util.ArrayList consumersForBelongs__to__Edge__as__Parent;
						synchronized (listeners) {
							consumersForBelongs__to__Edge__as__Parent = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForBelongs__to__Edge__as__Parent.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.belongs__to__Edge__as__ParentAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_belongs__to__Edge__as__Parent);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__Tree__as__RootProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Tree _belongs__to__Tree__as__Root = null;
					try {
						_belongs__to__Tree__as__Root = org.cdao.jastor.CDAOFactory.getTree(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (belongs__to__Tree__as__Root == null) {
						try {
							initBelongs__to__Tree__as__Root();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!belongs__to__Tree__as__Root.contains(_belongs__to__Tree__as__Root))
						belongs__to__Tree__as__Root.add(_belongs__to__Tree__as__Root);
					if (listeners != null) {
						java.util.ArrayList consumersForBelongs__to__Tree__as__Root;
						synchronized (listeners) {
							consumersForBelongs__to__Tree__as__Root = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForBelongs__to__Tree__as__Root.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.belongs__to__Tree__as__RootAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_belongs__to__Tree__as__Root);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(nca__node__ofProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.SetOfNodes _nca__node__of = null;
					try {
						_nca__node__of = org.cdao.jastor.CDAOFactory.getSetOfNodes(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (nca__node__of == null) {
						try {
							initNca__node__of();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!nca__node__of.contains(_nca__node__of))
						nca__node__of.add(_nca__node__of);
					if (listeners != null) {
						java.util.ArrayList consumersForNca__node__of;
						synchronized (listeners) {
							consumersForNca__node__of = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForNca__node__of.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.nca__node__ofAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_nca__node__of);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__EdgeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Edge _belongs__to__Edge = null;
					try {
						_belongs__to__Edge = org.cdao.jastor.CDAOFactory.getEdge(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (belongs__to__Edge == null) {
						try {
							initBelongs__to__Edge();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!belongs__to__Edge.contains(_belongs__to__Edge))
						belongs__to__Edge.add(_belongs__to__Edge);
					if (listeners != null) {
						java.util.ArrayList consumersForBelongs__to__Edge;
						synchronized (listeners) {
							consumersForBelongs__to__Edge = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForBelongs__to__Edge.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.belongs__to__EdgeAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_belongs__to__Edge);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(represents__TUProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				represents__TU = null;
				if (true) { // don't check resource type if the property range is Resource
					try {
						represents__TU = org.cdao.jastor.CDAOFactory.getTU(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.represents__TUChanged(org.cdao.jastor.CommonAncestralNodeImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__ParentProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Node _has__Parent = null;
					try {
						_has__Parent = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__Parent == null) {
						try {
							initHas__Parent();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__Parent.contains(_has__Parent))
						has__Parent.add(_has__Parent);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Parent;
						synchronized (listeners) {
							consumersForHas__Parent = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Parent.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.has__ParentAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_has__Parent);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__Edge__as__ChildProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				belongs__to__Edge__as__Child = null;
				if (true) { // don't check resource type if the property range is Resource
					try {
						belongs__to__Edge__as__Child = org.cdao.jastor.CDAOFactory.getDirectedEdge(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.belongs__to__Edge__as__ChildChanged(org.cdao.jastor.CommonAncestralNodeImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__ChildProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Node _has__Child = null;
					try {
						_has__Child = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__Child == null) {
						try {
							initHas__Child();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__Child.contains(_has__Child))
						has__Child.add(_has__Child);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Child;
						synchronized (listeners) {
							consumersForHas__Child = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Child.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.has__ChildAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_has__Child);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__DescendantProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Node _has__Descendant = null;
					try {
						_has__Descendant = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__Descendant == null) {
						try {
							initHas__Descendant();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__Descendant.contains(_has__Descendant))
						has__Descendant.add(_has__Descendant);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Descendant;
						synchronized (listeners) {
							consumersForHas__Descendant = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Descendant.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.has__DescendantAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_has__Descendant);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__TreeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Tree _belongs__to__Tree = null;
					try {
						_belongs__to__Tree = org.cdao.jastor.CDAOFactory.getTree(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (belongs__to__Tree == null) {
						try {
							initBelongs__to__Tree();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!belongs__to__Tree.contains(_belongs__to__Tree))
						belongs__to__Tree.add(_belongs__to__Tree);
					if (listeners != null) {
						java.util.ArrayList consumersForBelongs__to__Tree;
						synchronized (listeners) {
							consumersForBelongs__to__Tree = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForBelongs__to__Tree.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.belongs__to__TreeAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_belongs__to__Tree);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__NetworkProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Network _belongs__to__Network = null;
					try {
						_belongs__to__Network = org.cdao.jastor.CDAOFactory.getNetwork(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (belongs__to__Network == null) {
						try {
							initBelongs__to__Network();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!belongs__to__Network.contains(_belongs__to__Network))
						belongs__to__Network.add(_belongs__to__Network);
					if (listeners != null) {
						java.util.ArrayList consumersForBelongs__to__Network;
						synchronized (listeners) {
							consumersForBelongs__to__Network = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForBelongs__to__Network.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.belongs__to__NetworkAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_belongs__to__Network);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__AnnotationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.CDAOAnnotation _has__Annotation = null;
					try {
						_has__Annotation = org.cdao.jastor.CDAOFactory.getCDAOAnnotation(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__Annotation == null) {
						try {
							initHas__Annotation();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__Annotation.contains(_has__Annotation))
						has__Annotation.add(_has__Annotation);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Annotation;
						synchronized (listeners) {
							consumersForHas__Annotation = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Annotation.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.has__AnnotationAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_has__Annotation);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__toProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _belongs__to = null;
					try {
						_belongs__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (belongs__to == null) {
						try {
							initBelongs__to();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!belongs__to.contains(_belongs__to))
						belongs__to.add(_belongs__to);
					if (listeners != null) {
						java.util.ArrayList consumersForBelongs__to;
						synchronized (listeners) {
							consumersForBelongs__to = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForBelongs__to.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.belongs__toAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_belongs__to);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__ValueProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#anySimpleType");
				if (has__Value == null) {
					try {
						initHas__Value();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !has__Value.contains(obj))
					has__Value.add(obj);
				java.util.ArrayList consumersForHas__Value;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForHas__Value = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForHas__Value.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.has__ValueAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__Support__ValueProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
				if (has__Support__Value == null) {
					try {
						initHas__Support__Value();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !has__Support__Value.contains(obj))
					has__Support__Value.add(obj);
				java.util.ArrayList consumersForHas__Support__Value;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForHas__Support__Value = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForHas__Support__Value.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.has__Support__ValueAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,(java.lang.Float)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__Float__ValueProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
				if (has__Float__Value == null) {
					try {
						initHas__Float__Value();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !has__Float__Value.contains(obj))
					has__Float__Value.add(obj);
				java.util.ArrayList consumersForHas__Float__Value;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForHas__Float__Value = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForHas__Float__Value.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.has__Float__ValueAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,(java.lang.Float)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__Int__ValueProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
				if (has__Int__Value == null) {
					try {
						initHas__Int__Value();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !has__Int__Value.contains(obj))
					has__Int__Value.add(obj);
				java.util.ArrayList consumersForHas__Int__Value;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForHas__Int__Value = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForHas__Int__Value.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.has__Int__ValueAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,(java.lang.Integer)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__Uncertainty__FactorProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
				if (has__Uncertainty__Factor == null) {
					try {
						initHas__Uncertainty__Factor();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !has__Uncertainty__Factor.contains(obj))
					has__Uncertainty__Factor.add(obj);
				java.util.ArrayList consumersForHas__Uncertainty__Factor;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForHas__Uncertainty__Factor = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForHas__Uncertainty__Factor.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.has__Uncertainty__FactorAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,(java.lang.Float)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__PrecisionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
				if (has__Precision == null) {
					try {
						initHas__Precision();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !has__Precision.contains(obj))
					has__Precision.add(obj);
				java.util.ArrayList consumersForHas__Precision;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForHas__Precision = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForHas__Precision.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.has__PrecisionAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,(java.lang.Float)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__External__ReferenceProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (has__External__Reference == null)
					try {
						initHas__External__Reference();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!has__External__Reference.contains(literal))
					has__External__Reference.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForHas__External__Reference;
					synchronized (listeners) {
						consumersForHas__External__Reference = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForHas__External__Reference.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.has__External__ReferenceAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(connects__toProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _connects__to = null;
					try {
						_connects__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (connects__to == null) {
						try {
							initConnects__to();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!connects__to.contains(_connects__to))
						connects__to.add(_connects__to);
					if (listeners != null) {
						java.util.ArrayList consumersForConnects__to;
						synchronized (listeners) {
							consumersForConnects__to = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForConnects__to.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.connects__toAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_connects__to);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _has = null;
					try {
						_has = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has == null) {
						try {
							initHas();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has.contains(_has))
						has.add(_has);
					if (listeners != null) {
						java.util.ArrayList consumersForHas;
						synchronized (listeners) {
							consumersForHas = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.hasAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_has);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(precedesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _precedes = null;
					try {
						_precedes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (precedes == null) {
						try {
							initPrecedes();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!precedes.contains(_precedes))
						precedes.add(_precedes);
					if (listeners != null) {
						java.util.ArrayList consumersForPrecedes;
						synchronized (listeners) {
							consumersForPrecedes = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPrecedes.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.precedesAdded(org.cdao.jastor.CommonAncestralNodeImpl.this,_precedes);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(part__ofProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _part__of = null;
					if (part__of != null) {
						boolean found = false;
						for (int i=0;i<part__of.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) part__of.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_part__of = __item;
								break;
							}
						}
						if (found)
							part__of.remove(_part__of);
						else {
							try {
								_part__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_part__of = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForPart__of;
						synchronized (listeners) {
							consumersForPart__of = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPart__of.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.part__ofRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_part__of);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__AncestorProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Node _has__Ancestor = null;
					if (has__Ancestor != null) {
						boolean found = false;
						for (int i=0;i<has__Ancestor.size();i++) {
							org.cdao.jastor.Node __item = (org.cdao.jastor.Node) has__Ancestor.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__Ancestor = __item;
								break;
							}
						}
						if (found)
							has__Ancestor.remove(_has__Ancestor);
						else {
							try {
								_has__Ancestor = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__Ancestor = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Ancestor;
						synchronized (listeners) {
							consumersForHas__Ancestor = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Ancestor.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.has__AncestorRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_has__Ancestor);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__Edge__as__ParentProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.DirectedEdge _belongs__to__Edge__as__Parent = null;
					if (belongs__to__Edge__as__Parent != null) {
						boolean found = false;
						for (int i=0;i<belongs__to__Edge__as__Parent.size();i++) {
							org.cdao.jastor.DirectedEdge __item = (org.cdao.jastor.DirectedEdge) belongs__to__Edge__as__Parent.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_belongs__to__Edge__as__Parent = __item;
								break;
							}
						}
						if (found)
							belongs__to__Edge__as__Parent.remove(_belongs__to__Edge__as__Parent);
						else {
							try {
								_belongs__to__Edge__as__Parent = org.cdao.jastor.CDAOFactory.getDirectedEdge(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_belongs__to__Edge__as__Parent = org.cdao.jastor.CDAOFactory.getDirectedEdge(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForBelongs__to__Edge__as__Parent;
						synchronized (listeners) {
							consumersForBelongs__to__Edge__as__Parent = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForBelongs__to__Edge__as__Parent.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.belongs__to__Edge__as__ParentRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_belongs__to__Edge__as__Parent);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__Tree__as__RootProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Tree _belongs__to__Tree__as__Root = null;
					if (belongs__to__Tree__as__Root != null) {
						boolean found = false;
						for (int i=0;i<belongs__to__Tree__as__Root.size();i++) {
							org.cdao.jastor.Tree __item = (org.cdao.jastor.Tree) belongs__to__Tree__as__Root.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_belongs__to__Tree__as__Root = __item;
								break;
							}
						}
						if (found)
							belongs__to__Tree__as__Root.remove(_belongs__to__Tree__as__Root);
						else {
							try {
								_belongs__to__Tree__as__Root = org.cdao.jastor.CDAOFactory.getTree(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_belongs__to__Tree__as__Root = org.cdao.jastor.CDAOFactory.getTree(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForBelongs__to__Tree__as__Root;
						synchronized (listeners) {
							consumersForBelongs__to__Tree__as__Root = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForBelongs__to__Tree__as__Root.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.belongs__to__Tree__as__RootRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_belongs__to__Tree__as__Root);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(nca__node__ofProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.SetOfNodes _nca__node__of = null;
					if (nca__node__of != null) {
						boolean found = false;
						for (int i=0;i<nca__node__of.size();i++) {
							org.cdao.jastor.SetOfNodes __item = (org.cdao.jastor.SetOfNodes) nca__node__of.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_nca__node__of = __item;
								break;
							}
						}
						if (found)
							nca__node__of.remove(_nca__node__of);
						else {
							try {
								_nca__node__of = org.cdao.jastor.CDAOFactory.getSetOfNodes(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_nca__node__of = org.cdao.jastor.CDAOFactory.getSetOfNodes(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForNca__node__of;
						synchronized (listeners) {
							consumersForNca__node__of = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForNca__node__of.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.nca__node__ofRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_nca__node__of);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__EdgeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Edge _belongs__to__Edge = null;
					if (belongs__to__Edge != null) {
						boolean found = false;
						for (int i=0;i<belongs__to__Edge.size();i++) {
							org.cdao.jastor.Edge __item = (org.cdao.jastor.Edge) belongs__to__Edge.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_belongs__to__Edge = __item;
								break;
							}
						}
						if (found)
							belongs__to__Edge.remove(_belongs__to__Edge);
						else {
							try {
								_belongs__to__Edge = org.cdao.jastor.CDAOFactory.getEdge(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_belongs__to__Edge = org.cdao.jastor.CDAOFactory.getEdge(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForBelongs__to__Edge;
						synchronized (listeners) {
							consumersForBelongs__to__Edge = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForBelongs__to__Edge.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.belongs__to__EdgeRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_belongs__to__Edge);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(represents__TUProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
					if (represents__TU != null && represents__TU.resource().equals(resource))
						represents__TU = null;				
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.represents__TUChanged(org.cdao.jastor.CommonAncestralNodeImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__ParentProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Node _has__Parent = null;
					if (has__Parent != null) {
						boolean found = false;
						for (int i=0;i<has__Parent.size();i++) {
							org.cdao.jastor.Node __item = (org.cdao.jastor.Node) has__Parent.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__Parent = __item;
								break;
							}
						}
						if (found)
							has__Parent.remove(_has__Parent);
						else {
							try {
								_has__Parent = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__Parent = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Parent;
						synchronized (listeners) {
							consumersForHas__Parent = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Parent.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.has__ParentRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_has__Parent);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__Edge__as__ChildProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
					if (belongs__to__Edge__as__Child != null && belongs__to__Edge__as__Child.resource().equals(resource))
						belongs__to__Edge__as__Child = null;				
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.belongs__to__Edge__as__ChildChanged(org.cdao.jastor.CommonAncestralNodeImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__ChildProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Node _has__Child = null;
					if (has__Child != null) {
						boolean found = false;
						for (int i=0;i<has__Child.size();i++) {
							org.cdao.jastor.Node __item = (org.cdao.jastor.Node) has__Child.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__Child = __item;
								break;
							}
						}
						if (found)
							has__Child.remove(_has__Child);
						else {
							try {
								_has__Child = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__Child = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Child;
						synchronized (listeners) {
							consumersForHas__Child = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Child.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.has__ChildRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_has__Child);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__DescendantProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Node _has__Descendant = null;
					if (has__Descendant != null) {
						boolean found = false;
						for (int i=0;i<has__Descendant.size();i++) {
							org.cdao.jastor.Node __item = (org.cdao.jastor.Node) has__Descendant.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__Descendant = __item;
								break;
							}
						}
						if (found)
							has__Descendant.remove(_has__Descendant);
						else {
							try {
								_has__Descendant = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__Descendant = org.cdao.jastor.CDAOFactory.getNode(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Descendant;
						synchronized (listeners) {
							consumersForHas__Descendant = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Descendant.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.has__DescendantRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_has__Descendant);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__TreeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Tree _belongs__to__Tree = null;
					if (belongs__to__Tree != null) {
						boolean found = false;
						for (int i=0;i<belongs__to__Tree.size();i++) {
							org.cdao.jastor.Tree __item = (org.cdao.jastor.Tree) belongs__to__Tree.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_belongs__to__Tree = __item;
								break;
							}
						}
						if (found)
							belongs__to__Tree.remove(_belongs__to__Tree);
						else {
							try {
								_belongs__to__Tree = org.cdao.jastor.CDAOFactory.getTree(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_belongs__to__Tree = org.cdao.jastor.CDAOFactory.getTree(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForBelongs__to__Tree;
						synchronized (listeners) {
							consumersForBelongs__to__Tree = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForBelongs__to__Tree.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.belongs__to__TreeRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_belongs__to__Tree);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__NetworkProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.Network _belongs__to__Network = null;
					if (belongs__to__Network != null) {
						boolean found = false;
						for (int i=0;i<belongs__to__Network.size();i++) {
							org.cdao.jastor.Network __item = (org.cdao.jastor.Network) belongs__to__Network.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_belongs__to__Network = __item;
								break;
							}
						}
						if (found)
							belongs__to__Network.remove(_belongs__to__Network);
						else {
							try {
								_belongs__to__Network = org.cdao.jastor.CDAOFactory.getNetwork(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_belongs__to__Network = org.cdao.jastor.CDAOFactory.getNetwork(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForBelongs__to__Network;
						synchronized (listeners) {
							consumersForBelongs__to__Network = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForBelongs__to__Network.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.belongs__to__NetworkRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_belongs__to__Network);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__AnnotationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jastor.CDAOAnnotation _has__Annotation = null;
					if (has__Annotation != null) {
						boolean found = false;
						for (int i=0;i<has__Annotation.size();i++) {
							org.cdao.jastor.CDAOAnnotation __item = (org.cdao.jastor.CDAOAnnotation) has__Annotation.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__Annotation = __item;
								break;
							}
						}
						if (found)
							has__Annotation.remove(_has__Annotation);
						else {
							try {
								_has__Annotation = org.cdao.jastor.CDAOFactory.getCDAOAnnotation(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__Annotation = org.cdao.jastor.CDAOFactory.getCDAOAnnotation(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Annotation;
						synchronized (listeners) {
							consumersForHas__Annotation = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Annotation.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.has__AnnotationRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_has__Annotation);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__toProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _belongs__to = null;
					if (belongs__to != null) {
						boolean found = false;
						for (int i=0;i<belongs__to.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) belongs__to.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_belongs__to = __item;
								break;
							}
						}
						if (found)
							belongs__to.remove(_belongs__to);
						else {
							try {
								_belongs__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_belongs__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForBelongs__to;
						synchronized (listeners) {
							consumersForBelongs__to = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForBelongs__to.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.belongs__toRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_belongs__to);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__ValueProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#anySimpleType");
				if (has__Value != null) {
					if (has__Value.contains(obj))
						has__Value.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.has__ValueRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,(java.lang.String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__Support__ValueProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
				if (has__Support__Value != null) {
					if (has__Support__Value.contains(obj))
						has__Support__Value.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.has__Support__ValueRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,(java.lang.Float)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__Float__ValueProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
				if (has__Float__Value != null) {
					if (has__Float__Value.contains(obj))
						has__Float__Value.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.has__Float__ValueRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,(java.lang.Float)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__Int__ValueProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Integer","http://www.w3.org/2001/XMLSchema#int");
				if (has__Int__Value != null) {
					if (has__Int__Value.contains(obj))
						has__Int__Value.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.has__Int__ValueRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,(java.lang.Integer)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__Uncertainty__FactorProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
				if (has__Uncertainty__Factor != null) {
					if (has__Uncertainty__Factor.contains(obj))
						has__Uncertainty__Factor.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.has__Uncertainty__FactorRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,(java.lang.Float)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__PrecisionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
				if (has__Precision != null) {
					if (has__Precision.contains(obj))
						has__Precision.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.has__PrecisionRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,(java.lang.Float)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__External__ReferenceProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (has__External__Reference != null) {
					if (has__External__Reference.contains(literal))
						has__External__Reference.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForHas__External__Reference;
					synchronized (listeners) {
						consumersForHas__External__Reference = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForHas__External__Reference.iterator();iter.hasNext();){
						CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
						listener.has__External__ReferenceRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(connects__toProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _connects__to = null;
					if (connects__to != null) {
						boolean found = false;
						for (int i=0;i<connects__to.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) connects__to.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_connects__to = __item;
								break;
							}
						}
						if (found)
							connects__to.remove(_connects__to);
						else {
							try {
								_connects__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_connects__to = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForConnects__to;
						synchronized (listeners) {
							consumersForConnects__to = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForConnects__to.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.connects__toRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_connects__to);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _has = null;
					if (has != null) {
						boolean found = false;
						for (int i=0;i<has.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) has.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has = __item;
								break;
							}
						}
						if (found)
							has.remove(_has);
						else {
							try {
								_has = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas;
						synchronized (listeners) {
							consumersForHas = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.hasRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_has);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(precedesProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _precedes = null;
					if (precedes != null) {
						boolean found = false;
						for (int i=0;i<precedes.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) precedes.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_precedes = __item;
								break;
							}
						}
						if (found)
							precedes.remove(_precedes);
						else {
							try {
								_precedes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_precedes = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForPrecedes;
						synchronized (listeners) {
							consumersForPrecedes = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPrecedes.iterator();iter.hasNext();){
							CommonAncestralNodeListener listener=(CommonAncestralNodeListener)iter.next();
							listener.precedesRemoved(org.cdao.jastor.CommonAncestralNodeImpl.this,_precedes);
						}
					}
				}
				return;
			}
		}

	//}
	


}