

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
 * Implementation of {@link org.cdao.jastor.SetOfThings}
 * Use the org.cdao.jasper.CDAOFactory to create instances of this class.
 * <p>(URI: http://localhost/~vivek/cdao.owl#SetOfThings)</p>
 * <br>
 */
public class SetOfThingsImpl extends com.ibm.adtech.jastor.ThingImpl implements org.cdao.jastor.SetOfThings {
	

	private static com.hp.hpl.jena.rdf.model.Property has__ElementProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Element");
	private java.util.ArrayList has__Element;
	private java.util.ArrayList has__Element_asCharacter;
	private java.util.ArrayList has__Element_asSetOfCharacters;
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
	private static com.hp.hpl.jena.rdf.model.Property part__ofProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#part_of");
	private java.util.ArrayList part__of;
	private static com.hp.hpl.jena.rdf.model.Property precedesProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#precedes");
	private java.util.ArrayList precedes;
 

	SetOfThingsImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static SetOfThingsImpl getSetOfThings(Resource resource, Model model) throws JastorException {
		return new SetOfThingsImpl(resource, model);
	}
	    
	static SetOfThingsImpl createSetOfThings(Resource resource, Model model) throws JastorException { 
		SetOfThingsImpl impl = new SetOfThingsImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, SetOfThings.TYPE)))
			impl._model.add(impl._resource, RDF.type, SetOfThings.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
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
		it = _model.listStatements(_resource,has__ElementProperty,(RDFNode)null);
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
		it = _model.listStatements(_resource,part__ofProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,precedesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, org.cdao.jastor.SetOfThings.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		has__Element = null;
		has__Element_asCharacter = null;
		has__Element_asSetOfCharacters = null;
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
		part__of = null;
		precedes = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initHas__Element() throws JastorException {
		this.has__Element = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__ElementProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Element properties in SetOfThings model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing has__Element = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.has__Element.add(has__Element);
			}
		}
	}

	public java.util.Iterator getHas__Element() throws JastorException {
		if (has__Element == null)
			initHas__Element();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Element,_resource,has__ElementProperty,true);
	}

	public void addHas__Element(com.ibm.adtech.jastor.Thing has__Element) throws JastorException {
		if (this.has__Element == null)
			initHas__Element();
		if (this.has__Element.contains(has__Element)) {
			this.has__Element.remove(has__Element);
			this.has__Element.add(has__Element);
			return;
		}
		this.has__Element.add(has__Element);
		_model.add(_model.createStatement(_resource,has__ElementProperty,has__Element.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addHas__Element() throws JastorException {
		com.ibm.adtech.jastor.Thing has__Element = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.has__Element == null)
			initHas__Element();
		this.has__Element.add(has__Element);
		_model.add(_model.createStatement(_resource,has__ElementProperty,has__Element.resource()));
		return has__Element;
	}
	
	public com.ibm.adtech.jastor.Thing addHas__Element(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing has__Element = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.has__Element == null)
			initHas__Element();
		if (this.has__Element.contains(has__Element))
			return has__Element;
		this.has__Element.add(has__Element);
		_model.add(_model.createStatement(_resource,has__ElementProperty,has__Element.resource()));
		return has__Element;
	}
	
	public void removeHas__Element(com.ibm.adtech.jastor.Thing has__Element) throws JastorException {
		if (this.has__Element == null)
			initHas__Element();
		if (!this.has__Element.contains(has__Element))
			return;
		if (!_model.contains(_resource, has__ElementProperty, has__Element.resource()))
			return;
		this.has__Element.remove(has__Element);
		_model.removeAll(_resource, has__ElementProperty, has__Element.resource());
	}
		
	private void initHas__Element_asCharacter() throws JastorException {
		this.has__Element_asCharacter = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__ElementProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Element properties in SetOfThings model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (_model.contains(resource,RDF.type,org.cdao.jastor.Character.TYPE)) {
				org.cdao.jastor.Character has__Element = org.cdao.jastor.CDAOFactory.getCharacter(resource,_model);
				this.has__Element_asCharacter.add(has__Element);
			}
		}
	}

	public java.util.Iterator getHas__Element_asCharacter() throws JastorException {
		if (has__Element_asCharacter == null)
			initHas__Element_asCharacter();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Element_asCharacter,_resource,has__ElementProperty,true);
	}

	public void addHas__Element(org.cdao.jastor.Character has__Element) throws JastorException {
		if (this.has__Element_asCharacter == null)
			initHas__Element_asCharacter();
		if (this.has__Element_asCharacter.contains(has__Element)) {
			this.has__Element_asCharacter.remove(has__Element);
			this.has__Element_asCharacter.add(has__Element);
			return;
		}
		this.has__Element_asCharacter.add(has__Element);
		_model.add(_model.createStatement(_resource,has__ElementProperty,has__Element.resource()));
	}
	
	public org.cdao.jastor.Character addHas__Element_asCharacter() throws JastorException {
		org.cdao.jastor.Character has__Element = org.cdao.jastor.CDAOFactory.createCharacter(_model.createResource(),_model);
		if (this.has__Element_asCharacter == null)
			initHas__Element_asCharacter();
		this.has__Element_asCharacter.add(has__Element);
		_model.add(_model.createStatement(_resource,has__ElementProperty,has__Element.resource()));
		return has__Element;
	}
	
	public org.cdao.jastor.Character addHas__Element_asCharacter(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jastor.Character has__Element = org.cdao.jastor.CDAOFactory.getCharacter(resource,_model);
		if (this.has__Element_asCharacter == null)
			initHas__Element_asCharacter();
		if (this.has__Element_asCharacter.contains(has__Element))
			return has__Element;
		this.has__Element_asCharacter.add(has__Element);
		_model.add(_model.createStatement(_resource,has__ElementProperty,has__Element.resource()));
		return has__Element;
	}
	
	public void removeHas__Element(org.cdao.jastor.Character has__Element) throws JastorException {
		if (this.has__Element_asCharacter == null)
			initHas__Element_asCharacter();
		if (!this.has__Element_asCharacter.contains(has__Element))
			return;
		if (!_model.contains(_resource, has__ElementProperty, has__Element.resource()))
			return;
		this.has__Element_asCharacter.remove(has__Element);
		_model.removeAll(_resource, has__ElementProperty, has__Element.resource());
	}
		
	private void initHas__Element_asSetOfCharacters() throws JastorException {
		this.has__Element_asSetOfCharacters = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__ElementProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Element properties in SetOfThings model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (_model.contains(resource,RDF.type,org.cdao.jastor.SetOfCharacters.TYPE)) {
				org.cdao.jastor.SetOfCharacters has__Element = org.cdao.jastor.CDAOFactory.getSetOfCharacters(resource,_model);
				this.has__Element_asSetOfCharacters.add(has__Element);
			}
		}
	}

	public java.util.Iterator getHas__Element_asSetOfCharacters() throws JastorException {
		if (has__Element_asSetOfCharacters == null)
			initHas__Element_asSetOfCharacters();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Element_asSetOfCharacters,_resource,has__ElementProperty,true);
	}

	public void addHas__Element(org.cdao.jastor.SetOfCharacters has__Element) throws JastorException {
		if (this.has__Element_asSetOfCharacters == null)
			initHas__Element_asSetOfCharacters();
		if (this.has__Element_asSetOfCharacters.contains(has__Element)) {
			this.has__Element_asSetOfCharacters.remove(has__Element);
			this.has__Element_asSetOfCharacters.add(has__Element);
			return;
		}
		this.has__Element_asSetOfCharacters.add(has__Element);
		_model.add(_model.createStatement(_resource,has__ElementProperty,has__Element.resource()));
	}
	
	public org.cdao.jastor.SetOfCharacters addHas__Element_asSetOfCharacters() throws JastorException {
		org.cdao.jastor.SetOfCharacters has__Element = org.cdao.jastor.CDAOFactory.createSetOfCharacters(_model.createResource(),_model);
		if (this.has__Element_asSetOfCharacters == null)
			initHas__Element_asSetOfCharacters();
		this.has__Element_asSetOfCharacters.add(has__Element);
		_model.add(_model.createStatement(_resource,has__ElementProperty,has__Element.resource()));
		return has__Element;
	}
	
	public org.cdao.jastor.SetOfCharacters addHas__Element_asSetOfCharacters(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jastor.SetOfCharacters has__Element = org.cdao.jastor.CDAOFactory.getSetOfCharacters(resource,_model);
		if (this.has__Element_asSetOfCharacters == null)
			initHas__Element_asSetOfCharacters();
		if (this.has__Element_asSetOfCharacters.contains(has__Element))
			return has__Element;
		this.has__Element_asSetOfCharacters.add(has__Element);
		_model.add(_model.createStatement(_resource,has__ElementProperty,has__Element.resource()));
		return has__Element;
	}
	
	public void removeHas__Element(org.cdao.jastor.SetOfCharacters has__Element) throws JastorException {
		if (this.has__Element_asSetOfCharacters == null)
			initHas__Element_asSetOfCharacters();
		if (!this.has__Element_asSetOfCharacters.contains(has__Element))
			return;
		if (!_model.contains(_resource, has__ElementProperty, has__Element.resource()))
			return;
		this.has__Element_asSetOfCharacters.remove(has__Element);
		_model.removeAll(_resource, has__ElementProperty, has__Element.resource());
	}
		 

	private void initHas__Annotation() throws JastorException {
		this.has__Annotation = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__AnnotationProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Annotation properties in SetOfThings model not a Resource", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#belongs_to properties in SetOfThings model not a Resource", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Value properties in SetOfThings model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Support_Value properties in SetOfThings model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Float_Value properties in SetOfThings model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Int_Value properties in SetOfThings model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Uncertainty_Factor properties in SetOfThings model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_Precision properties in SetOfThings model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has_External_Reference properties in SetOfThings model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#connects_to properties in SetOfThings model not a Resource", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#has properties in SetOfThings model not a Resource", stmt.getObject());
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
		 

	private void initPart__of() throws JastorException {
		this.part__of = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, part__ofProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#part_of properties in SetOfThings model not a Resource", stmt.getObject());
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
		 

	private void initPrecedes() throws JastorException {
		this.precedes = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, precedesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://localhost/~vivek/cdao.owl#precedes properties in SetOfThings model not a Resource", stmt.getObject());
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
		if (!(listener instanceof SetOfThingsListener))
			throw new IllegalArgumentException("ThingListener must be instance of SetOfThingsListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((SetOfThingsListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof SetOfThingsListener))
			throw new IllegalArgumentException("ThingListener must be instance of SetOfThingsListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(has__ElementProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _has__Element = null;
					try {
						_has__Element = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__Element == null) {
						try {
							initHas__Element();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__Element.contains(_has__Element))
						has__Element.add(_has__Element);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Element;
						synchronized (listeners) {
							consumersForHas__Element = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Element.iterator();iter.hasNext();){
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.has__ElementAdded(org.cdao.jastor.SetOfThingsImpl.this,_has__Element);
						}
					}
				}
				if (_model.contains(resource,RDF.type,org.cdao.jastor.Character.TYPE)) {
					org.cdao.jastor.Character _has__Element_asCharacter = null;
					try {
						_has__Element_asCharacter = org.cdao.jastor.CDAOFactory.getCharacter(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__Element_asCharacter == null) {
						try {
							initHas__Element_asCharacter();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__Element_asCharacter.contains(_has__Element_asCharacter))
						has__Element_asCharacter.add(_has__Element_asCharacter);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Element_asCharacter;
						synchronized (listeners) {
							consumersForHas__Element_asCharacter = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Element_asCharacter.iterator();iter.hasNext();){
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.has__ElementAdded(org.cdao.jastor.SetOfThingsImpl.this,_has__Element_asCharacter);
						}
					}
				}
				if (_model.contains(resource,RDF.type,org.cdao.jastor.SetOfCharacters.TYPE)) {
					org.cdao.jastor.SetOfCharacters _has__Element_asSetOfCharacters = null;
					try {
						_has__Element_asSetOfCharacters = org.cdao.jastor.CDAOFactory.getSetOfCharacters(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__Element_asSetOfCharacters == null) {
						try {
							initHas__Element_asSetOfCharacters();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__Element_asSetOfCharacters.contains(_has__Element_asSetOfCharacters))
						has__Element_asSetOfCharacters.add(_has__Element_asSetOfCharacters);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Element_asSetOfCharacters;
						synchronized (listeners) {
							consumersForHas__Element_asSetOfCharacters = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Element_asSetOfCharacters.iterator();iter.hasNext();){
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.has__ElementAdded(org.cdao.jastor.SetOfThingsImpl.this,_has__Element_asSetOfCharacters);
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
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.has__AnnotationAdded(org.cdao.jastor.SetOfThingsImpl.this,_has__Annotation);
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
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.belongs__toAdded(org.cdao.jastor.SetOfThingsImpl.this,_belongs__to);
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
						SetOfThingsListener listener=(SetOfThingsListener)iter.next();
						listener.has__ValueAdded(org.cdao.jastor.SetOfThingsImpl.this,(java.lang.String)obj);
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
						SetOfThingsListener listener=(SetOfThingsListener)iter.next();
						listener.has__Support__ValueAdded(org.cdao.jastor.SetOfThingsImpl.this,(java.lang.Float)obj);
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
						SetOfThingsListener listener=(SetOfThingsListener)iter.next();
						listener.has__Float__ValueAdded(org.cdao.jastor.SetOfThingsImpl.this,(java.lang.Float)obj);
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
						SetOfThingsListener listener=(SetOfThingsListener)iter.next();
						listener.has__Int__ValueAdded(org.cdao.jastor.SetOfThingsImpl.this,(java.lang.Integer)obj);
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
						SetOfThingsListener listener=(SetOfThingsListener)iter.next();
						listener.has__Uncertainty__FactorAdded(org.cdao.jastor.SetOfThingsImpl.this,(java.lang.Float)obj);
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
						SetOfThingsListener listener=(SetOfThingsListener)iter.next();
						listener.has__PrecisionAdded(org.cdao.jastor.SetOfThingsImpl.this,(java.lang.Float)obj);
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
						SetOfThingsListener listener=(SetOfThingsListener)iter.next();
						listener.has__External__ReferenceAdded(org.cdao.jastor.SetOfThingsImpl.this,literal);
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
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.connects__toAdded(org.cdao.jastor.SetOfThingsImpl.this,_connects__to);
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
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.hasAdded(org.cdao.jastor.SetOfThingsImpl.this,_has);
						}
					}
				}
				return;
			}
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
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.part__ofAdded(org.cdao.jastor.SetOfThingsImpl.this,_part__of);
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
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.precedesAdded(org.cdao.jastor.SetOfThingsImpl.this,_precedes);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(has__ElementProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _has__Element = null;
					if (has__Element != null) {
						boolean found = false;
						for (int i=0;i<has__Element.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) has__Element.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__Element = __item;
								break;
							}
						}
						if (found)
							has__Element.remove(_has__Element);
						else {
							try {
								_has__Element = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__Element = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Element;
						synchronized (listeners) {
							consumersForHas__Element = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Element.iterator();iter.hasNext();){
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.has__ElementRemoved(org.cdao.jastor.SetOfThingsImpl.this,_has__Element);
						}
					}
				}
				if (_model.contains(resource,RDF.type,org.cdao.jastor.Character.TYPE)) {
					org.cdao.jastor.Character _has__Element_asCharacter = null;
					if (has__Element_asCharacter != null) {
						boolean found = false;
						for (int i=0;i<has__Element_asCharacter.size();i++) {
							org.cdao.jastor.Character __item = (org.cdao.jastor.Character) has__Element_asCharacter.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__Element_asCharacter = __item;
								break;
							}
						}
						if (found)
							has__Element_asCharacter.remove(_has__Element_asCharacter);
						else {
							try {
								_has__Element_asCharacter = org.cdao.jastor.CDAOFactory.getCharacter(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__Element_asCharacter = org.cdao.jastor.CDAOFactory.getCharacter(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Element_asCharacter;
						synchronized (listeners) {
							consumersForHas__Element_asCharacter = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Element_asCharacter.iterator();iter.hasNext();){
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.has__ElementRemoved(org.cdao.jastor.SetOfThingsImpl.this,_has__Element_asCharacter);
						}
					}
				}
				if (_model.contains(resource,RDF.type,org.cdao.jastor.SetOfCharacters.TYPE)) {
					org.cdao.jastor.SetOfCharacters _has__Element_asSetOfCharacters = null;
					if (has__Element_asSetOfCharacters != null) {
						boolean found = false;
						for (int i=0;i<has__Element_asSetOfCharacters.size();i++) {
							org.cdao.jastor.SetOfCharacters __item = (org.cdao.jastor.SetOfCharacters) has__Element_asSetOfCharacters.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__Element_asSetOfCharacters = __item;
								break;
							}
						}
						if (found)
							has__Element_asSetOfCharacters.remove(_has__Element_asSetOfCharacters);
						else {
							try {
								_has__Element_asSetOfCharacters = org.cdao.jastor.CDAOFactory.getSetOfCharacters(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__Element_asSetOfCharacters = org.cdao.jastor.CDAOFactory.getSetOfCharacters(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Element_asSetOfCharacters;
						synchronized (listeners) {
							consumersForHas__Element_asSetOfCharacters = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Element_asSetOfCharacters.iterator();iter.hasNext();){
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.has__ElementRemoved(org.cdao.jastor.SetOfThingsImpl.this,_has__Element_asSetOfCharacters);
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
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.has__AnnotationRemoved(org.cdao.jastor.SetOfThingsImpl.this,_has__Annotation);
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
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.belongs__toRemoved(org.cdao.jastor.SetOfThingsImpl.this,_belongs__to);
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
						SetOfThingsListener listener=(SetOfThingsListener)iter.next();
						listener.has__ValueRemoved(org.cdao.jastor.SetOfThingsImpl.this,(java.lang.String)obj);
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
						SetOfThingsListener listener=(SetOfThingsListener)iter.next();
						listener.has__Support__ValueRemoved(org.cdao.jastor.SetOfThingsImpl.this,(java.lang.Float)obj);
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
						SetOfThingsListener listener=(SetOfThingsListener)iter.next();
						listener.has__Float__ValueRemoved(org.cdao.jastor.SetOfThingsImpl.this,(java.lang.Float)obj);
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
						SetOfThingsListener listener=(SetOfThingsListener)iter.next();
						listener.has__Int__ValueRemoved(org.cdao.jastor.SetOfThingsImpl.this,(java.lang.Integer)obj);
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
						SetOfThingsListener listener=(SetOfThingsListener)iter.next();
						listener.has__Uncertainty__FactorRemoved(org.cdao.jastor.SetOfThingsImpl.this,(java.lang.Float)obj);
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
						SetOfThingsListener listener=(SetOfThingsListener)iter.next();
						listener.has__PrecisionRemoved(org.cdao.jastor.SetOfThingsImpl.this,(java.lang.Float)obj);
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
						SetOfThingsListener listener=(SetOfThingsListener)iter.next();
						listener.has__External__ReferenceRemoved(org.cdao.jastor.SetOfThingsImpl.this,literal);
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
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.connects__toRemoved(org.cdao.jastor.SetOfThingsImpl.this,_connects__to);
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
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.hasRemoved(org.cdao.jastor.SetOfThingsImpl.this,_has);
						}
					}
				}
				return;
			}
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
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.part__ofRemoved(org.cdao.jastor.SetOfThingsImpl.this,_part__of);
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
							SetOfThingsListener listener=(SetOfThingsListener)iter.next();
							listener.precedesRemoved(org.cdao.jastor.SetOfThingsImpl.this,_precedes);
						}
					}
				}
				return;
			}
		}

	//}
	


}