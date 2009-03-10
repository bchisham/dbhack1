

package org.cdao.jasper;

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
 * Implementation of {@link org.cdao.jasper.DesoxiRibonucleotideResidueStateDatum}
 * Use the org.cdao.CDAOFactory to create instances of this class.
 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DesoxiRibonucleotideResidueStateDatum)</p>
 * <br>
 */
public class DesoxiRibonucleotideResidueStateDatumImpl extends com.ibm.adtech.jastor.ThingImpl implements org.cdao.jasper.DesoxiRibonucleotideResidueStateDatum {
	

	private static com.hp.hpl.jena.rdf.model.Property belongs__to__CharacterProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to_Character");
	private org.cdao.jasper.Character belongs__to__Character;
	private static com.hp.hpl.jena.rdf.model.Property homologous__toProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#homologous_to");
	private java.util.ArrayList homologous__to;
	private static com.hp.hpl.jena.rdf.model.Property has__StateProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_State");
	private java.util.ArrayList has__State;
	private static com.hp.hpl.jena.rdf.model.Property has__CoordinateProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Coordinate");
	private java.util.ArrayList has__Coordinate;
	private static com.hp.hpl.jena.rdf.model.Property belongs__to__TUProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to_TU");
	private org.cdao.jasper.TU belongs__to__TU;
	private static com.hp.hpl.jena.rdf.model.Property belongs__toProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to");
	private java.util.ArrayList belongs__to;
	private static com.hp.hpl.jena.rdf.model.Property has__AnnotationProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Annotation");
	private java.util.ArrayList has__Annotation;
	private static com.hp.hpl.jena.rdf.model.Property has__External__ReferenceProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_External_Reference");
	private java.util.ArrayList has__External__Reference;
	private static com.hp.hpl.jena.rdf.model.Property has__PrecisionProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Precision");
	private java.util.ArrayList has__Precision;
	private static com.hp.hpl.jena.rdf.model.Property has__Uncertainty__FactorProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Uncertainty_Factor");
	private java.util.ArrayList has__Uncertainty__Factor;
	private static com.hp.hpl.jena.rdf.model.Property has__Float__ValueProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Float_Value");
	private java.util.ArrayList has__Float__Value;
	private static com.hp.hpl.jena.rdf.model.Property has__Int__ValueProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Int_Value");
	private java.util.ArrayList has__Int__Value;
	private static com.hp.hpl.jena.rdf.model.Property has__ValueProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Value");
	private java.util.ArrayList has__Value;
	private static com.hp.hpl.jena.rdf.model.Property has__Support__ValueProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Support_Value");
	private java.util.ArrayList has__Support__Value;
	private static com.hp.hpl.jena.rdf.model.Property hasProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has");
	private java.util.ArrayList has;
	private static com.hp.hpl.jena.rdf.model.Property connects__toProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#connects_to");
	private java.util.ArrayList connects__to;
	private static com.hp.hpl.jena.rdf.model.Property exclude__SubtreeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude_Subtree");
	private java.util.ArrayList exclude__Subtree;
	private static com.hp.hpl.jena.rdf.model.Property part__ofProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#part_of");
	private java.util.ArrayList part__of;
	private static com.hp.hpl.jena.rdf.model.Property has__TypeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Type");
	private java.util.ArrayList has__Type;
	private static com.hp.hpl.jena.rdf.model.Property exclude__NodeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude_Node");
	private java.util.ArrayList exclude__Node;
	private static com.hp.hpl.jena.rdf.model.Property precedesProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#precedes");
	private java.util.ArrayList precedes;
	private static com.hp.hpl.jena.rdf.model.Property excludeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude");
	private java.util.ArrayList exclude;
	private static com.hp.hpl.jena.rdf.model.Property has__Nucleotide__StateProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Nucleotide_State");
	private java.util.ArrayList has__Nucleotide__State_asDesoxiRibonucleotideResidue;
	private java.util.ArrayList has__Nucleotide__State_asGeneric__State;
	private static com.hp.hpl.jena.rdf.model.Property belongs__to__Nucleotide__CharacterProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to_Nucleotide_Character");
	private org.cdao.jasper.DesoxiRibonucleotideResidueCharacter belongs__to__Nucleotide__Character;
 

	DesoxiRibonucleotideResidueStateDatumImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static DesoxiRibonucleotideResidueStateDatumImpl getDesoxiRibonucleotideResidueStateDatum(Resource resource, Model model) throws JastorException {
		return new DesoxiRibonucleotideResidueStateDatumImpl(resource, model);
	}
	    
	static DesoxiRibonucleotideResidueStateDatumImpl createDesoxiRibonucleotideResidueStateDatum(Resource resource, Model model) throws JastorException { 
		DesoxiRibonucleotideResidueStateDatumImpl impl = new DesoxiRibonucleotideResidueStateDatumImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, DesoxiRibonucleotideResidueStateDatum.TYPE)))
			impl._model.add(impl._resource, RDF.type, DesoxiRibonucleotideResidueStateDatum.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
		if (!_model.contains(_resource, RDF.type, org.cdao.jasper.CharacterStateDatum.TYPE))
			_model.add(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(_resource, RDF.type, org.cdao.jasper.CharacterStateDatum.TYPE));     
		if (!_model.contains(_resource, RDF.type, org.cdao.jasper.CategoricalStateDatum.TYPE))
			_model.add(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(_resource, RDF.type, org.cdao.jasper.CategoricalStateDatum.TYPE));     
		if (!_model.contains(_resource, RDF.type, org.cdao.jasper.MolecularStateDatum.TYPE))
			_model.add(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(_resource, RDF.type, org.cdao.jasper.MolecularStateDatum.TYPE));     
	}
   
	void addHasValueValues() {
	}
    
    private void setupModelListener() {
    	listeners = new java.util.ArrayList();
    	org.cdao.jasper.CDAOFactory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,belongs__to__CharacterProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,homologous__toProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__StateProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__CoordinateProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,belongs__to__TUProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,belongs__toProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__AnnotationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__External__ReferenceProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__PrecisionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__Uncertainty__FactorProperty,(RDFNode)null);
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
		it = _model.listStatements(_resource,has__ValueProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__Support__ValueProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,connects__toProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,exclude__SubtreeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,part__ofProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__TypeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,exclude__NodeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,precedesProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,excludeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,has__Nucleotide__StateProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,belongs__to__Nucleotide__CharacterProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, org.cdao.jasper.DesoxiRibonucleotideResidueStateDatum.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, org.cdao.jasper.CharacterStateDatum.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, org.cdao.jasper.CategoricalStateDatum.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, org.cdao.jasper.MolecularStateDatum.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		belongs__to__Character = null;
		homologous__to = null;
		has__State = null;
		has__Coordinate = null;
		belongs__to__TU = null;
		belongs__to = null;
		has__Annotation = null;
		has__External__Reference = null;
		has__Precision = null;
		has__Uncertainty__Factor = null;
		has__Float__Value = null;
		has__Int__Value = null;
		has__Value = null;
		has__Support__Value = null;
		has = null;
		connects__to = null;
		exclude__Subtree = null;
		part__of = null;
		has__Type = null;
		exclude__Node = null;
		precedes = null;
		exclude = null;
		has__Nucleotide__State_asDesoxiRibonucleotideResidue = null;
		has__Nucleotide__State_asGeneric__State = null;
		belongs__to__Nucleotide__Character = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	public org.cdao.jasper.Character getBelongs__to__Character() throws JastorException {
		if (belongs__to__Character != null)
			return belongs__to__Character;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, belongs__to__CharacterProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
			throw new JastorInvalidRDFNodeException(uri() + ": belongs__to__Character getProperty() in org.cdao.DesoxiRibonucleotideResidueStateDatum model not Resource", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
		belongs__to__Character = org.cdao.jasper.CDAOFactory.getCharacter(resource,_model);
		return belongs__to__Character;
	}

	public void setBelongs__to__Character(org.cdao.jasper.Character belongs__to__Character) throws JastorException {
		if (_model.contains(_resource,belongs__to__CharacterProperty)) {
			_model.removeAll(_resource,belongs__to__CharacterProperty,null);
		}
		this.belongs__to__Character = belongs__to__Character;
		if (belongs__to__Character != null) {
			_model.add(_model.createStatement(_resource,belongs__to__CharacterProperty, belongs__to__Character.resource()));
		}			
	}
		
	public org.cdao.jasper.Character setBelongs__to__Character() throws JastorException {
		if (_model.contains(_resource,belongs__to__CharacterProperty)) {
			_model.removeAll(_resource,belongs__to__CharacterProperty,null);
		}
		org.cdao.jasper.Character belongs__to__Character = org.cdao.jasper.CDAOFactory.createCharacter(_model.createResource(),_model);
		this.belongs__to__Character = belongs__to__Character;
		_model.add(_model.createStatement(_resource,belongs__to__CharacterProperty, belongs__to__Character.resource()));
		return belongs__to__Character;
	}
	
	public org.cdao.jasper.Character setBelongs__to__Character(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		if (_model.contains(_resource,belongs__to__CharacterProperty)) {
			_model.removeAll(_resource,belongs__to__CharacterProperty,null);
		}
		org.cdao.jasper.Character belongs__to__Character = org.cdao.jasper.CDAOFactory.getCharacter(resource,_model);
		this.belongs__to__Character = belongs__to__Character;
		_model.add(_model.createStatement(_resource,belongs__to__CharacterProperty, belongs__to__Character.resource()));
		return belongs__to__Character;
	}
	

	private void initHomologous__to() throws JastorException {
		this.homologous__to = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, homologous__toProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#homologous_to properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jasper.CharacterStateDatum homologous__to = org.cdao.jasper.CDAOFactory.getCharacterStateDatum(resource,_model);
				this.homologous__to.add(homologous__to);
			}
		}
	}

	public java.util.Iterator getHomologous__to() throws JastorException {
		if (homologous__to == null)
			initHomologous__to();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(homologous__to,_resource,homologous__toProperty,true);
	}

	public void addHomologous__to(org.cdao.jasper.CharacterStateDatum homologous__to) throws JastorException {
		if (this.homologous__to == null)
			initHomologous__to();
		if (this.homologous__to.contains(homologous__to)) {
			this.homologous__to.remove(homologous__to);
			this.homologous__to.add(homologous__to);
			return;
		}
		this.homologous__to.add(homologous__to);
		_model.add(_model.createStatement(_resource,homologous__toProperty,homologous__to.resource()));
	}
	
	public org.cdao.jasper.CharacterStateDatum addHomologous__to() throws JastorException {
		org.cdao.jasper.CharacterStateDatum homologous__to = org.cdao.jasper.CDAOFactory.createCharacterStateDatum(_model.createResource(),_model);
		if (this.homologous__to == null)
			initHomologous__to();
		this.homologous__to.add(homologous__to);
		_model.add(_model.createStatement(_resource,homologous__toProperty,homologous__to.resource()));
		return homologous__to;
	}
	
	public org.cdao.jasper.CharacterStateDatum addHomologous__to(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jasper.CharacterStateDatum homologous__to = org.cdao.jasper.CDAOFactory.getCharacterStateDatum(resource,_model);
		if (this.homologous__to == null)
			initHomologous__to();
		if (this.homologous__to.contains(homologous__to))
			return homologous__to;
		this.homologous__to.add(homologous__to);
		_model.add(_model.createStatement(_resource,homologous__toProperty,homologous__to.resource()));
		return homologous__to;
	}
	
	public void removeHomologous__to(org.cdao.jasper.CharacterStateDatum homologous__to) throws JastorException {
		if (this.homologous__to == null)
			initHomologous__to();
		if (!this.homologous__to.contains(homologous__to))
			return;
		if (!_model.contains(_resource, homologous__toProperty, homologous__to.resource()))
			return;
		this.homologous__to.remove(homologous__to);
		_model.removeAll(_resource, homologous__toProperty, homologous__to.resource());
	}
		 

	private void initHas__State() throws JastorException {
		this.has__State = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__StateProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_State properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jasper.CharacterStateDomain has__State = org.cdao.jasper.CDAOFactory.getCharacterStateDomain(resource,_model);
				this.has__State.add(has__State);
			}
		}
	}

	public java.util.Iterator getHas__State() throws JastorException {
		if (has__State == null)
			initHas__State();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__State,_resource,has__StateProperty,true);
	}

	public void addHas__State(org.cdao.jasper.CharacterStateDomain has__State) throws JastorException {
		if (this.has__State == null)
			initHas__State();
		if (this.has__State.contains(has__State)) {
			this.has__State.remove(has__State);
			this.has__State.add(has__State);
			return;
		}
		this.has__State.add(has__State);
		_model.add(_model.createStatement(_resource,has__StateProperty,has__State.resource()));
	}
	
	public org.cdao.jasper.CharacterStateDomain addHas__State() throws JastorException {
		org.cdao.jasper.CharacterStateDomain has__State = org.cdao.jasper.CDAOFactory.createCharacterStateDomain(_model.createResource(),_model);
		if (this.has__State == null)
			initHas__State();
		this.has__State.add(has__State);
		_model.add(_model.createStatement(_resource,has__StateProperty,has__State.resource()));
		return has__State;
	}
	
	public org.cdao.jasper.CharacterStateDomain addHas__State(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jasper.CharacterStateDomain has__State = org.cdao.jasper.CDAOFactory.getCharacterStateDomain(resource,_model);
		if (this.has__State == null)
			initHas__State();
		if (this.has__State.contains(has__State))
			return has__State;
		this.has__State.add(has__State);
		_model.add(_model.createStatement(_resource,has__StateProperty,has__State.resource()));
		return has__State;
	}
	
	public void removeHas__State(org.cdao.jasper.CharacterStateDomain has__State) throws JastorException {
		if (this.has__State == null)
			initHas__State();
		if (!this.has__State.contains(has__State))
			return;
		if (!_model.contains(_resource, has__StateProperty, has__State.resource()))
			return;
		this.has__State.remove(has__State);
		_model.removeAll(_resource, has__StateProperty, has__State.resource());
	}
		 

	private void initHas__Coordinate() throws JastorException {
		this.has__Coordinate = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__CoordinateProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Coordinate properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jasper.DatumCoordinate has__Coordinate = org.cdao.jasper.CDAOFactory.getDatumCoordinate(resource,_model);
				this.has__Coordinate.add(has__Coordinate);
			}
		}
	}

	public java.util.Iterator getHas__Coordinate() throws JastorException {
		if (has__Coordinate == null)
			initHas__Coordinate();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Coordinate,_resource,has__CoordinateProperty,true);
	}

	public void addHas__Coordinate(org.cdao.jasper.DatumCoordinate has__Coordinate) throws JastorException {
		if (this.has__Coordinate == null)
			initHas__Coordinate();
		if (this.has__Coordinate.contains(has__Coordinate)) {
			this.has__Coordinate.remove(has__Coordinate);
			this.has__Coordinate.add(has__Coordinate);
			return;
		}
		this.has__Coordinate.add(has__Coordinate);
		_model.add(_model.createStatement(_resource,has__CoordinateProperty,has__Coordinate.resource()));
	}
	
	public org.cdao.jasper.DatumCoordinate addHas__Coordinate() throws JastorException {
		org.cdao.jasper.DatumCoordinate has__Coordinate = org.cdao.jasper.CDAOFactory.createDatumCoordinate(_model.createResource(),_model);
		if (this.has__Coordinate == null)
			initHas__Coordinate();
		this.has__Coordinate.add(has__Coordinate);
		_model.add(_model.createStatement(_resource,has__CoordinateProperty,has__Coordinate.resource()));
		return has__Coordinate;
	}
	
	public org.cdao.jasper.DatumCoordinate addHas__Coordinate(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jasper.DatumCoordinate has__Coordinate = org.cdao.jasper.CDAOFactory.getDatumCoordinate(resource,_model);
		if (this.has__Coordinate == null)
			initHas__Coordinate();
		if (this.has__Coordinate.contains(has__Coordinate))
			return has__Coordinate;
		this.has__Coordinate.add(has__Coordinate);
		_model.add(_model.createStatement(_resource,has__CoordinateProperty,has__Coordinate.resource()));
		return has__Coordinate;
	}
	
	public void removeHas__Coordinate(org.cdao.jasper.DatumCoordinate has__Coordinate) throws JastorException {
		if (this.has__Coordinate == null)
			initHas__Coordinate();
		if (!this.has__Coordinate.contains(has__Coordinate))
			return;
		if (!_model.contains(_resource, has__CoordinateProperty, has__Coordinate.resource()))
			return;
		this.has__Coordinate.remove(has__Coordinate);
		_model.removeAll(_resource, has__CoordinateProperty, has__Coordinate.resource());
	}
		 

	public org.cdao.jasper.TU getBelongs__to__TU() throws JastorException {
		if (belongs__to__TU != null)
			return belongs__to__TU;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, belongs__to__TUProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
			throw new JastorInvalidRDFNodeException(uri() + ": belongs__to__TU getProperty() in org.cdao.DesoxiRibonucleotideResidueStateDatum model not Resource", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
		belongs__to__TU = org.cdao.jasper.CDAOFactory.getTU(resource,_model);
		return belongs__to__TU;
	}

	public void setBelongs__to__TU(org.cdao.jasper.TU belongs__to__TU) throws JastorException {
		if (_model.contains(_resource,belongs__to__TUProperty)) {
			_model.removeAll(_resource,belongs__to__TUProperty,null);
		}
		this.belongs__to__TU = belongs__to__TU;
		if (belongs__to__TU != null) {
			_model.add(_model.createStatement(_resource,belongs__to__TUProperty, belongs__to__TU.resource()));
		}			
	}
		
	public org.cdao.jasper.TU setBelongs__to__TU() throws JastorException {
		if (_model.contains(_resource,belongs__to__TUProperty)) {
			_model.removeAll(_resource,belongs__to__TUProperty,null);
		}
		org.cdao.jasper.TU belongs__to__TU = org.cdao.jasper.CDAOFactory.createTU(_model.createResource(),_model);
		this.belongs__to__TU = belongs__to__TU;
		_model.add(_model.createStatement(_resource,belongs__to__TUProperty, belongs__to__TU.resource()));
		return belongs__to__TU;
	}
	
	public org.cdao.jasper.TU setBelongs__to__TU(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		if (_model.contains(_resource,belongs__to__TUProperty)) {
			_model.removeAll(_resource,belongs__to__TUProperty,null);
		}
		org.cdao.jasper.TU belongs__to__TU = org.cdao.jasper.CDAOFactory.getTU(resource,_model);
		this.belongs__to__TU = belongs__to__TU;
		_model.add(_model.createStatement(_resource,belongs__to__TUProperty, belongs__to__TU.resource()));
		return belongs__to__TU;
	}
	

	private void initBelongs__to() throws JastorException {
		this.belongs__to = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, belongs__toProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
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
		 

	private void initHas__Annotation() throws JastorException {
		this.has__Annotation = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__AnnotationProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Annotation properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jasper.CDAOAnnotation has__Annotation = org.cdao.jasper.CDAOFactory.getCDAOAnnotation(resource,_model);
				this.has__Annotation.add(has__Annotation);
			}
		}
	}

	public java.util.Iterator getHas__Annotation() throws JastorException {
		if (has__Annotation == null)
			initHas__Annotation();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Annotation,_resource,has__AnnotationProperty,true);
	}

	public void addHas__Annotation(org.cdao.jasper.CDAOAnnotation has__Annotation) throws JastorException {
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
	
	public org.cdao.jasper.CDAOAnnotation addHas__Annotation() throws JastorException {
		org.cdao.jasper.CDAOAnnotation has__Annotation = org.cdao.jasper.CDAOFactory.createCDAOAnnotation(_model.createResource(),_model);
		if (this.has__Annotation == null)
			initHas__Annotation();
		this.has__Annotation.add(has__Annotation);
		_model.add(_model.createStatement(_resource,has__AnnotationProperty,has__Annotation.resource()));
		return has__Annotation;
	}
	
	public org.cdao.jasper.CDAOAnnotation addHas__Annotation(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jasper.CDAOAnnotation has__Annotation = org.cdao.jasper.CDAOFactory.getCDAOAnnotation(resource,_model);
		if (this.has__Annotation == null)
			initHas__Annotation();
		if (this.has__Annotation.contains(has__Annotation))
			return has__Annotation;
		this.has__Annotation.add(has__Annotation);
		_model.add(_model.createStatement(_resource,has__AnnotationProperty,has__Annotation.resource()));
		return has__Annotation;
	}
	
	public void removeHas__Annotation(org.cdao.jasper.CDAOAnnotation has__Annotation) throws JastorException {
		if (this.has__Annotation == null)
			initHas__Annotation();
		if (!this.has__Annotation.contains(has__Annotation))
			return;
		if (!_model.contains(_resource, has__AnnotationProperty, has__Annotation.resource()))
			return;
		this.has__Annotation.remove(has__Annotation);
		_model.removeAll(_resource, has__AnnotationProperty, has__Annotation.resource());
	}
		 

	private void initHas__External__Reference() throws JastorException {
		has__External__Reference = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, has__External__ReferenceProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_External_Reference properties in DesoxiRibonucleotideResidueStateDatum model not a Literal", stmt.getObject());
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


	private void initHas__Precision() throws JastorException {
		has__Precision = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, has__PrecisionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Precision properties in DesoxiRibonucleotideResidueStateDatum model not a Literal", stmt.getObject());
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


	private void initHas__Uncertainty__Factor() throws JastorException {
		has__Uncertainty__Factor = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, has__Uncertainty__FactorProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Uncertainty_Factor properties in DesoxiRibonucleotideResidueStateDatum model not a Literal", stmt.getObject());
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


	private void initHas__Float__Value() throws JastorException {
		has__Float__Value = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, has__Float__ValueProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Float_Value properties in DesoxiRibonucleotideResidueStateDatum model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Int_Value properties in DesoxiRibonucleotideResidueStateDatum model not a Literal", stmt.getObject());
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


	private void initHas__Value() throws JastorException {
		has__Value = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, has__ValueProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Value properties in DesoxiRibonucleotideResidueStateDatum model not a Literal", stmt.getObject());
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
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Support_Value properties in DesoxiRibonucleotideResidueStateDatum model not a Literal", stmt.getObject());
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


	private void initHas() throws JastorException {
		this.has = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, hasProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
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
		 

	private void initConnects__to() throws JastorException {
		this.connects__to = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, connects__toProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#connects_to properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
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
		 

	private void initExclude__Subtree() throws JastorException {
		this.exclude__Subtree = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, exclude__SubtreeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude_Subtree properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jasper.Subtree exclude__Subtree = org.cdao.jasper.CDAOFactory.getSubtree(resource,_model);
				this.exclude__Subtree.add(exclude__Subtree);
			}
		}
	}

	public java.util.Iterator getExclude__Subtree() throws JastorException {
		if (exclude__Subtree == null)
			initExclude__Subtree();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(exclude__Subtree,_resource,exclude__SubtreeProperty,true);
	}

	public void addExclude__Subtree(org.cdao.jasper.Subtree exclude__Subtree) throws JastorException {
		if (this.exclude__Subtree == null)
			initExclude__Subtree();
		if (this.exclude__Subtree.contains(exclude__Subtree)) {
			this.exclude__Subtree.remove(exclude__Subtree);
			this.exclude__Subtree.add(exclude__Subtree);
			return;
		}
		this.exclude__Subtree.add(exclude__Subtree);
		_model.add(_model.createStatement(_resource,exclude__SubtreeProperty,exclude__Subtree.resource()));
	}
	
	public org.cdao.jasper.Subtree addExclude__Subtree() throws JastorException {
		org.cdao.jasper.Subtree exclude__Subtree = org.cdao.jasper.CDAOFactory.createSubtree(_model.createResource(),_model);
		if (this.exclude__Subtree == null)
			initExclude__Subtree();
		this.exclude__Subtree.add(exclude__Subtree);
		_model.add(_model.createStatement(_resource,exclude__SubtreeProperty,exclude__Subtree.resource()));
		return exclude__Subtree;
	}
	
	public org.cdao.jasper.Subtree addExclude__Subtree(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jasper.Subtree exclude__Subtree = org.cdao.jasper.CDAOFactory.getSubtree(resource,_model);
		if (this.exclude__Subtree == null)
			initExclude__Subtree();
		if (this.exclude__Subtree.contains(exclude__Subtree))
			return exclude__Subtree;
		this.exclude__Subtree.add(exclude__Subtree);
		_model.add(_model.createStatement(_resource,exclude__SubtreeProperty,exclude__Subtree.resource()));
		return exclude__Subtree;
	}
	
	public void removeExclude__Subtree(org.cdao.jasper.Subtree exclude__Subtree) throws JastorException {
		if (this.exclude__Subtree == null)
			initExclude__Subtree();
		if (!this.exclude__Subtree.contains(exclude__Subtree))
			return;
		if (!_model.contains(_resource, exclude__SubtreeProperty, exclude__Subtree.resource()))
			return;
		this.exclude__Subtree.remove(exclude__Subtree);
		_model.removeAll(_resource, exclude__SubtreeProperty, exclude__Subtree.resource());
	}
		 

	private void initPart__of() throws JastorException {
		this.part__of = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, part__ofProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#part_of properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
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
		 

	private void initHas__Type() throws JastorException {
		this.has__Type = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__TypeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Type properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing has__Type = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.has__Type.add(has__Type);
			}
		}
	}

	public java.util.Iterator getHas__Type() throws JastorException {
		if (has__Type == null)
			initHas__Type();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Type,_resource,has__TypeProperty,true);
	}

	public void addHas__Type(com.ibm.adtech.jastor.Thing has__Type) throws JastorException {
		if (this.has__Type == null)
			initHas__Type();
		if (this.has__Type.contains(has__Type)) {
			this.has__Type.remove(has__Type);
			this.has__Type.add(has__Type);
			return;
		}
		this.has__Type.add(has__Type);
		_model.add(_model.createStatement(_resource,has__TypeProperty,has__Type.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addHas__Type() throws JastorException {
		com.ibm.adtech.jastor.Thing has__Type = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.has__Type == null)
			initHas__Type();
		this.has__Type.add(has__Type);
		_model.add(_model.createStatement(_resource,has__TypeProperty,has__Type.resource()));
		return has__Type;
	}
	
	public com.ibm.adtech.jastor.Thing addHas__Type(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing has__Type = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.has__Type == null)
			initHas__Type();
		if (this.has__Type.contains(has__Type))
			return has__Type;
		this.has__Type.add(has__Type);
		_model.add(_model.createStatement(_resource,has__TypeProperty,has__Type.resource()));
		return has__Type;
	}
	
	public void removeHas__Type(com.ibm.adtech.jastor.Thing has__Type) throws JastorException {
		if (this.has__Type == null)
			initHas__Type();
		if (!this.has__Type.contains(has__Type))
			return;
		if (!_model.contains(_resource, has__TypeProperty, has__Type.resource()))
			return;
		this.has__Type.remove(has__Type);
		_model.removeAll(_resource, has__TypeProperty, has__Type.resource());
	}
		 

	private void initExclude__Node() throws JastorException {
		this.exclude__Node = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, exclude__NodeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude_Node properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				org.cdao.jasper.Node exclude__Node = org.cdao.jasper.CDAOFactory.getNode(resource,_model);
				this.exclude__Node.add(exclude__Node);
			}
		}
	}

	public java.util.Iterator getExclude__Node() throws JastorException {
		if (exclude__Node == null)
			initExclude__Node();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(exclude__Node,_resource,exclude__NodeProperty,true);
	}

	public void addExclude__Node(org.cdao.jasper.Node exclude__Node) throws JastorException {
		if (this.exclude__Node == null)
			initExclude__Node();
		if (this.exclude__Node.contains(exclude__Node)) {
			this.exclude__Node.remove(exclude__Node);
			this.exclude__Node.add(exclude__Node);
			return;
		}
		this.exclude__Node.add(exclude__Node);
		_model.add(_model.createStatement(_resource,exclude__NodeProperty,exclude__Node.resource()));
	}
	
	public org.cdao.jasper.Node addExclude__Node() throws JastorException {
		org.cdao.jasper.Node exclude__Node = org.cdao.jasper.CDAOFactory.createNode(_model.createResource(),_model);
		if (this.exclude__Node == null)
			initExclude__Node();
		this.exclude__Node.add(exclude__Node);
		_model.add(_model.createStatement(_resource,exclude__NodeProperty,exclude__Node.resource()));
		return exclude__Node;
	}
	
	public org.cdao.jasper.Node addExclude__Node(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jasper.Node exclude__Node = org.cdao.jasper.CDAOFactory.getNode(resource,_model);
		if (this.exclude__Node == null)
			initExclude__Node();
		if (this.exclude__Node.contains(exclude__Node))
			return exclude__Node;
		this.exclude__Node.add(exclude__Node);
		_model.add(_model.createStatement(_resource,exclude__NodeProperty,exclude__Node.resource()));
		return exclude__Node;
	}
	
	public void removeExclude__Node(org.cdao.jasper.Node exclude__Node) throws JastorException {
		if (this.exclude__Node == null)
			initExclude__Node();
		if (!this.exclude__Node.contains(exclude__Node))
			return;
		if (!_model.contains(_resource, exclude__NodeProperty, exclude__Node.resource()))
			return;
		this.exclude__Node.remove(exclude__Node);
		_model.removeAll(_resource, exclude__NodeProperty, exclude__Node.resource());
	}
		 

	private void initPrecedes() throws JastorException {
		this.precedes = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, precedesProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#precedes properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
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
		 

	private void initExclude() throws JastorException {
		this.exclude = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, excludeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing exclude = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.exclude.add(exclude);
			}
		}
	}

	public java.util.Iterator getExclude() throws JastorException {
		if (exclude == null)
			initExclude();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(exclude,_resource,excludeProperty,true);
	}

	public void addExclude(com.ibm.adtech.jastor.Thing exclude) throws JastorException {
		if (this.exclude == null)
			initExclude();
		if (this.exclude.contains(exclude)) {
			this.exclude.remove(exclude);
			this.exclude.add(exclude);
			return;
		}
		this.exclude.add(exclude);
		_model.add(_model.createStatement(_resource,excludeProperty,exclude.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addExclude() throws JastorException {
		com.ibm.adtech.jastor.Thing exclude = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.exclude == null)
			initExclude();
		this.exclude.add(exclude);
		_model.add(_model.createStatement(_resource,excludeProperty,exclude.resource()));
		return exclude;
	}
	
	public com.ibm.adtech.jastor.Thing addExclude(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing exclude = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.exclude == null)
			initExclude();
		if (this.exclude.contains(exclude))
			return exclude;
		this.exclude.add(exclude);
		_model.add(_model.createStatement(_resource,excludeProperty,exclude.resource()));
		return exclude;
	}
	
	public void removeExclude(com.ibm.adtech.jastor.Thing exclude) throws JastorException {
		if (this.exclude == null)
			initExclude();
		if (!this.exclude.contains(exclude))
			return;
		if (!_model.contains(_resource, excludeProperty, exclude.resource()))
			return;
		this.exclude.remove(exclude);
		_model.removeAll(_resource, excludeProperty, exclude.resource());
	}
		 

	private void initHas__Nucleotide__State_asDesoxiRibonucleotideResidue() throws JastorException {
		this.has__Nucleotide__State_asDesoxiRibonucleotideResidue = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__Nucleotide__StateProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Nucleotide_State properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (_model.contains(resource,RDF.type,org.cdao.jasper.DesoxiRibonucleotideResidue.TYPE)) {
				org.cdao.jasper.DesoxiRibonucleotideResidue has__Nucleotide__State = org.cdao.jasper.CDAOFactory.getDesoxiRibonucleotideResidue(resource,_model);
				this.has__Nucleotide__State_asDesoxiRibonucleotideResidue.add(has__Nucleotide__State);
			}
		}
	}

	public java.util.Iterator getHas__Nucleotide__State_asDesoxiRibonucleotideResidue() throws JastorException {
		if (has__Nucleotide__State_asDesoxiRibonucleotideResidue == null)
			initHas__Nucleotide__State_asDesoxiRibonucleotideResidue();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Nucleotide__State_asDesoxiRibonucleotideResidue,_resource,has__Nucleotide__StateProperty,true);
	}

	public void addHas__Nucleotide__State(org.cdao.jasper.DesoxiRibonucleotideResidue has__Nucleotide__State) throws JastorException {
		if (this.has__Nucleotide__State_asDesoxiRibonucleotideResidue == null)
			initHas__Nucleotide__State_asDesoxiRibonucleotideResidue();
		if (this.has__Nucleotide__State_asDesoxiRibonucleotideResidue.contains(has__Nucleotide__State)) {
			this.has__Nucleotide__State_asDesoxiRibonucleotideResidue.remove(has__Nucleotide__State);
			this.has__Nucleotide__State_asDesoxiRibonucleotideResidue.add(has__Nucleotide__State);
			return;
		}
		this.has__Nucleotide__State_asDesoxiRibonucleotideResidue.add(has__Nucleotide__State);
		_model.add(_model.createStatement(_resource,has__Nucleotide__StateProperty,has__Nucleotide__State.resource()));
	}
	
	public org.cdao.jasper.DesoxiRibonucleotideResidue addHas__Nucleotide__State_asDesoxiRibonucleotideResidue() throws JastorException {
		org.cdao.jasper.DesoxiRibonucleotideResidue has__Nucleotide__State = org.cdao.jasper.CDAOFactory.createDesoxiRibonucleotideResidue(_model.createResource(),_model);
		if (this.has__Nucleotide__State_asDesoxiRibonucleotideResidue == null)
			initHas__Nucleotide__State_asDesoxiRibonucleotideResidue();
		this.has__Nucleotide__State_asDesoxiRibonucleotideResidue.add(has__Nucleotide__State);
		_model.add(_model.createStatement(_resource,has__Nucleotide__StateProperty,has__Nucleotide__State.resource()));
		return has__Nucleotide__State;
	}
	
	public org.cdao.jasper.DesoxiRibonucleotideResidue addHas__Nucleotide__State_asDesoxiRibonucleotideResidue(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jasper.DesoxiRibonucleotideResidue has__Nucleotide__State = org.cdao.jasper.CDAOFactory.getDesoxiRibonucleotideResidue(resource,_model);
		if (this.has__Nucleotide__State_asDesoxiRibonucleotideResidue == null)
			initHas__Nucleotide__State_asDesoxiRibonucleotideResidue();
		if (this.has__Nucleotide__State_asDesoxiRibonucleotideResidue.contains(has__Nucleotide__State))
			return has__Nucleotide__State;
		this.has__Nucleotide__State_asDesoxiRibonucleotideResidue.add(has__Nucleotide__State);
		_model.add(_model.createStatement(_resource,has__Nucleotide__StateProperty,has__Nucleotide__State.resource()));
		return has__Nucleotide__State;
	}
	
	public void removeHas__Nucleotide__State(org.cdao.jasper.DesoxiRibonucleotideResidue has__Nucleotide__State) throws JastorException {
		if (this.has__Nucleotide__State_asDesoxiRibonucleotideResidue == null)
			initHas__Nucleotide__State_asDesoxiRibonucleotideResidue();
		if (!this.has__Nucleotide__State_asDesoxiRibonucleotideResidue.contains(has__Nucleotide__State))
			return;
		if (!_model.contains(_resource, has__Nucleotide__StateProperty, has__Nucleotide__State.resource()))
			return;
		this.has__Nucleotide__State_asDesoxiRibonucleotideResidue.remove(has__Nucleotide__State);
		_model.removeAll(_resource, has__Nucleotide__StateProperty, has__Nucleotide__State.resource());
	}
		
	private void initHas__Nucleotide__State_asGeneric__State() throws JastorException {
		this.has__Nucleotide__State_asGeneric__State = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, has__Nucleotide__StateProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Nucleotide_State properties in DesoxiRibonucleotideResidueStateDatum model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (_model.contains(resource,RDF.type,org.cdao.jasper.Generic__State.TYPE)) {
				org.cdao.jasper.Generic__State has__Nucleotide__State = org.cdao.jasper.CDAOFactory.getGeneric__State(resource,_model);
				this.has__Nucleotide__State_asGeneric__State.add(has__Nucleotide__State);
			}
		}
	}

	public java.util.Iterator getHas__Nucleotide__State_asGeneric__State() throws JastorException {
		if (has__Nucleotide__State_asGeneric__State == null)
			initHas__Nucleotide__State_asGeneric__State();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(has__Nucleotide__State_asGeneric__State,_resource,has__Nucleotide__StateProperty,true);
	}

	public void addHas__Nucleotide__State(org.cdao.jasper.Generic__State has__Nucleotide__State) throws JastorException {
		if (this.has__Nucleotide__State_asGeneric__State == null)
			initHas__Nucleotide__State_asGeneric__State();
		if (this.has__Nucleotide__State_asGeneric__State.contains(has__Nucleotide__State)) {
			this.has__Nucleotide__State_asGeneric__State.remove(has__Nucleotide__State);
			this.has__Nucleotide__State_asGeneric__State.add(has__Nucleotide__State);
			return;
		}
		this.has__Nucleotide__State_asGeneric__State.add(has__Nucleotide__State);
		_model.add(_model.createStatement(_resource,has__Nucleotide__StateProperty,has__Nucleotide__State.resource()));
	}
	
	public org.cdao.jasper.Generic__State addHas__Nucleotide__State_asGeneric__State() throws JastorException {
		org.cdao.jasper.Generic__State has__Nucleotide__State = org.cdao.jasper.CDAOFactory.createGeneric__State(_model.createResource(),_model);
		if (this.has__Nucleotide__State_asGeneric__State == null)
			initHas__Nucleotide__State_asGeneric__State();
		this.has__Nucleotide__State_asGeneric__State.add(has__Nucleotide__State);
		_model.add(_model.createStatement(_resource,has__Nucleotide__StateProperty,has__Nucleotide__State.resource()));
		return has__Nucleotide__State;
	}
	
	public org.cdao.jasper.Generic__State addHas__Nucleotide__State_asGeneric__State(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		org.cdao.jasper.Generic__State has__Nucleotide__State = org.cdao.jasper.CDAOFactory.getGeneric__State(resource,_model);
		if (this.has__Nucleotide__State_asGeneric__State == null)
			initHas__Nucleotide__State_asGeneric__State();
		if (this.has__Nucleotide__State_asGeneric__State.contains(has__Nucleotide__State))
			return has__Nucleotide__State;
		this.has__Nucleotide__State_asGeneric__State.add(has__Nucleotide__State);
		_model.add(_model.createStatement(_resource,has__Nucleotide__StateProperty,has__Nucleotide__State.resource()));
		return has__Nucleotide__State;
	}
	
	public void removeHas__Nucleotide__State(org.cdao.jasper.Generic__State has__Nucleotide__State) throws JastorException {
		if (this.has__Nucleotide__State_asGeneric__State == null)
			initHas__Nucleotide__State_asGeneric__State();
		if (!this.has__Nucleotide__State_asGeneric__State.contains(has__Nucleotide__State))
			return;
		if (!_model.contains(_resource, has__Nucleotide__StateProperty, has__Nucleotide__State.resource()))
			return;
		this.has__Nucleotide__State_asGeneric__State.remove(has__Nucleotide__State);
		_model.removeAll(_resource, has__Nucleotide__StateProperty, has__Nucleotide__State.resource());
	}
		 

	public org.cdao.jasper.DesoxiRibonucleotideResidueCharacter getBelongs__to__Nucleotide__Character() throws JastorException {
		if (belongs__to__Nucleotide__Character != null)
			return belongs__to__Nucleotide__Character;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, belongs__to__Nucleotide__CharacterProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
			throw new JastorInvalidRDFNodeException(uri() + ": belongs__to__Nucleotide__Character getProperty() in org.cdao.DesoxiRibonucleotideResidueStateDatum model not Resource", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
		belongs__to__Nucleotide__Character = org.cdao.jasper.CDAOFactory.getDesoxiRibonucleotideResidueCharacter(resource,_model);
		return belongs__to__Nucleotide__Character;
	}

	public void setBelongs__to__Nucleotide__Character(org.cdao.jasper.DesoxiRibonucleotideResidueCharacter belongs__to__Nucleotide__Character) throws JastorException {
		if (_model.contains(_resource,belongs__to__Nucleotide__CharacterProperty)) {
			_model.removeAll(_resource,belongs__to__Nucleotide__CharacterProperty,null);
		}
		this.belongs__to__Nucleotide__Character = belongs__to__Nucleotide__Character;
		if (belongs__to__Nucleotide__Character != null) {
			_model.add(_model.createStatement(_resource,belongs__to__Nucleotide__CharacterProperty, belongs__to__Nucleotide__Character.resource()));
		}			
	}
		
	public org.cdao.jasper.DesoxiRibonucleotideResidueCharacter setBelongs__to__Nucleotide__Character() throws JastorException {
		if (_model.contains(_resource,belongs__to__Nucleotide__CharacterProperty)) {
			_model.removeAll(_resource,belongs__to__Nucleotide__CharacterProperty,null);
		}
		org.cdao.jasper.DesoxiRibonucleotideResidueCharacter belongs__to__Nucleotide__Character = org.cdao.jasper.CDAOFactory.createDesoxiRibonucleotideResidueCharacter(_model.createResource(),_model);
		this.belongs__to__Nucleotide__Character = belongs__to__Nucleotide__Character;
		_model.add(_model.createStatement(_resource,belongs__to__Nucleotide__CharacterProperty, belongs__to__Nucleotide__Character.resource()));
		return belongs__to__Nucleotide__Character;
	}
	
	public org.cdao.jasper.DesoxiRibonucleotideResidueCharacter setBelongs__to__Nucleotide__Character(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		if (_model.contains(_resource,belongs__to__Nucleotide__CharacterProperty)) {
			_model.removeAll(_resource,belongs__to__Nucleotide__CharacterProperty,null);
		}
		org.cdao.jasper.DesoxiRibonucleotideResidueCharacter belongs__to__Nucleotide__Character = org.cdao.jasper.CDAOFactory.getDesoxiRibonucleotideResidueCharacter(resource,_model);
		this.belongs__to__Nucleotide__Character = belongs__to__Nucleotide__Character;
		_model.add(_model.createStatement(_resource,belongs__to__Nucleotide__CharacterProperty, belongs__to__Nucleotide__Character.resource()));
		return belongs__to__Nucleotide__Character;
	}
	 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof DesoxiRibonucleotideResidueStateDatumListener))
			throw new IllegalArgumentException("ThingListener must be instance of DesoxiRibonucleotideResidueStateDatumListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((DesoxiRibonucleotideResidueStateDatumListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof DesoxiRibonucleotideResidueStateDatumListener))
			throw new IllegalArgumentException("ThingListener must be instance of DesoxiRibonucleotideResidueStateDatumListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(belongs__to__CharacterProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				belongs__to__Character = null;
				if (true) { // don't check resource type if the property range is Resource
					try {
						belongs__to__Character = org.cdao.jasper.CDAOFactory.getCharacter(resource,_model);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.belongs__to__CharacterChanged(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(homologous__toProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jasper.CharacterStateDatum _homologous__to = null;
					try {
						_homologous__to = org.cdao.jasper.CDAOFactory.getCharacterStateDatum(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (homologous__to == null) {
						try {
							initHomologous__to();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!homologous__to.contains(_homologous__to))
						homologous__to.add(_homologous__to);
					if (listeners != null) {
						java.util.ArrayList consumersForHomologous__to;
						synchronized (listeners) {
							consumersForHomologous__to = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHomologous__to.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.homologous__toAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_homologous__to);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__StateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jasper.CharacterStateDomain _has__State = null;
					try {
						_has__State = org.cdao.jasper.CDAOFactory.getCharacterStateDomain(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__State == null) {
						try {
							initHas__State();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__State.contains(_has__State))
						has__State.add(_has__State);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__State;
						synchronized (listeners) {
							consumersForHas__State = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__State.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.has__StateAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_has__State);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__CoordinateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jasper.DatumCoordinate _has__Coordinate = null;
					try {
						_has__Coordinate = org.cdao.jasper.CDAOFactory.getDatumCoordinate(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__Coordinate == null) {
						try {
							initHas__Coordinate();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__Coordinate.contains(_has__Coordinate))
						has__Coordinate.add(_has__Coordinate);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Coordinate;
						synchronized (listeners) {
							consumersForHas__Coordinate = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Coordinate.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.has__CoordinateAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_has__Coordinate);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__TUProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				belongs__to__TU = null;
				if (true) { // don't check resource type if the property range is Resource
					try {
						belongs__to__TU = org.cdao.jasper.CDAOFactory.getTU(resource,_model);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.belongs__to__TUChanged(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this);
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
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.belongs__toAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_belongs__to);
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
					org.cdao.jasper.CDAOAnnotation _has__Annotation = null;
					try {
						_has__Annotation = org.cdao.jasper.CDAOFactory.getCDAOAnnotation(resource,_model);
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
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.has__AnnotationAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_has__Annotation);
						}
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.has__External__ReferenceAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,literal);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.has__PrecisionAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,(java.lang.Float)obj);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.has__Uncertainty__FactorAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,(java.lang.Float)obj);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.has__Float__ValueAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,(java.lang.Float)obj);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.has__Int__ValueAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,(java.lang.Integer)obj);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.has__ValueAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,(java.lang.String)obj);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.has__Support__ValueAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,(java.lang.Float)obj);
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
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.hasAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_has);
						}
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
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.connects__toAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_connects__to);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(exclude__SubtreeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jasper.Subtree _exclude__Subtree = null;
					try {
						_exclude__Subtree = org.cdao.jasper.CDAOFactory.getSubtree(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (exclude__Subtree == null) {
						try {
							initExclude__Subtree();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!exclude__Subtree.contains(_exclude__Subtree))
						exclude__Subtree.add(_exclude__Subtree);
					if (listeners != null) {
						java.util.ArrayList consumersForExclude__Subtree;
						synchronized (listeners) {
							consumersForExclude__Subtree = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForExclude__Subtree.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.exclude__SubtreeAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_exclude__Subtree);
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
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.part__ofAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_part__of);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__TypeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _has__Type = null;
					try {
						_has__Type = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__Type == null) {
						try {
							initHas__Type();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__Type.contains(_has__Type))
						has__Type.add(_has__Type);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Type;
						synchronized (listeners) {
							consumersForHas__Type = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Type.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.has__TypeAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_has__Type);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(exclude__NodeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jasper.Node _exclude__Node = null;
					try {
						_exclude__Node = org.cdao.jasper.CDAOFactory.getNode(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (exclude__Node == null) {
						try {
							initExclude__Node();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!exclude__Node.contains(_exclude__Node))
						exclude__Node.add(_exclude__Node);
					if (listeners != null) {
						java.util.ArrayList consumersForExclude__Node;
						synchronized (listeners) {
							consumersForExclude__Node = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForExclude__Node.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.exclude__NodeAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_exclude__Node);
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
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.precedesAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_precedes);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(excludeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _exclude = null;
					try {
						_exclude = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (exclude == null) {
						try {
							initExclude();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!exclude.contains(_exclude))
						exclude.add(_exclude);
					if (listeners != null) {
						java.util.ArrayList consumersForExclude;
						synchronized (listeners) {
							consumersForExclude = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForExclude.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.excludeAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_exclude);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__Nucleotide__StateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (_model.contains(resource,RDF.type,org.cdao.jasper.DesoxiRibonucleotideResidue.TYPE)) {
					org.cdao.jasper.DesoxiRibonucleotideResidue _has__Nucleotide__State_asDesoxiRibonucleotideResidue = null;
					try {
						_has__Nucleotide__State_asDesoxiRibonucleotideResidue = org.cdao.jasper.CDAOFactory.getDesoxiRibonucleotideResidue(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__Nucleotide__State_asDesoxiRibonucleotideResidue == null) {
						try {
							initHas__Nucleotide__State_asDesoxiRibonucleotideResidue();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__Nucleotide__State_asDesoxiRibonucleotideResidue.contains(_has__Nucleotide__State_asDesoxiRibonucleotideResidue))
						has__Nucleotide__State_asDesoxiRibonucleotideResidue.add(_has__Nucleotide__State_asDesoxiRibonucleotideResidue);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Nucleotide__State_asDesoxiRibonucleotideResidue;
						synchronized (listeners) {
							consumersForHas__Nucleotide__State_asDesoxiRibonucleotideResidue = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Nucleotide__State_asDesoxiRibonucleotideResidue.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.has__Nucleotide__StateAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_has__Nucleotide__State_asDesoxiRibonucleotideResidue);
						}
					}
				}
				if (_model.contains(resource,RDF.type,org.cdao.jasper.Generic__State.TYPE)) {
					org.cdao.jasper.Generic__State _has__Nucleotide__State_asGeneric__State = null;
					try {
						_has__Nucleotide__State_asGeneric__State = org.cdao.jasper.CDAOFactory.getGeneric__State(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (has__Nucleotide__State_asGeneric__State == null) {
						try {
							initHas__Nucleotide__State_asGeneric__State();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!has__Nucleotide__State_asGeneric__State.contains(_has__Nucleotide__State_asGeneric__State))
						has__Nucleotide__State_asGeneric__State.add(_has__Nucleotide__State_asGeneric__State);
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Nucleotide__State_asGeneric__State;
						synchronized (listeners) {
							consumersForHas__Nucleotide__State_asGeneric__State = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Nucleotide__State_asGeneric__State.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.has__Nucleotide__StateAdded(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_has__Nucleotide__State_asGeneric__State);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__Nucleotide__CharacterProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				belongs__to__Nucleotide__Character = null;
				if (true) { // don't check resource type if the property range is Resource
					try {
						belongs__to__Nucleotide__Character = org.cdao.jasper.CDAOFactory.getDesoxiRibonucleotideResidueCharacter(resource,_model);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.belongs__to__Nucleotide__CharacterChanged(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(belongs__to__CharacterProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
					if (belongs__to__Character != null && belongs__to__Character.resource().equals(resource))
						belongs__to__Character = null;				
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.belongs__to__CharacterChanged(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(homologous__toProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jasper.CharacterStateDatum _homologous__to = null;
					if (homologous__to != null) {
						boolean found = false;
						for (int i=0;i<homologous__to.size();i++) {
							org.cdao.jasper.CharacterStateDatum __item = (org.cdao.jasper.CharacterStateDatum) homologous__to.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_homologous__to = __item;
								break;
							}
						}
						if (found)
							homologous__to.remove(_homologous__to);
						else {
							try {
								_homologous__to = org.cdao.jasper.CDAOFactory.getCharacterStateDatum(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_homologous__to = org.cdao.jasper.CDAOFactory.getCharacterStateDatum(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHomologous__to;
						synchronized (listeners) {
							consumersForHomologous__to = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHomologous__to.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.homologous__toRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_homologous__to);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__StateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jasper.CharacterStateDomain _has__State = null;
					if (has__State != null) {
						boolean found = false;
						for (int i=0;i<has__State.size();i++) {
							org.cdao.jasper.CharacterStateDomain __item = (org.cdao.jasper.CharacterStateDomain) has__State.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__State = __item;
								break;
							}
						}
						if (found)
							has__State.remove(_has__State);
						else {
							try {
								_has__State = org.cdao.jasper.CDAOFactory.getCharacterStateDomain(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__State = org.cdao.jasper.CDAOFactory.getCharacterStateDomain(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__State;
						synchronized (listeners) {
							consumersForHas__State = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__State.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.has__StateRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_has__State);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__CoordinateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jasper.DatumCoordinate _has__Coordinate = null;
					if (has__Coordinate != null) {
						boolean found = false;
						for (int i=0;i<has__Coordinate.size();i++) {
							org.cdao.jasper.DatumCoordinate __item = (org.cdao.jasper.DatumCoordinate) has__Coordinate.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__Coordinate = __item;
								break;
							}
						}
						if (found)
							has__Coordinate.remove(_has__Coordinate);
						else {
							try {
								_has__Coordinate = org.cdao.jasper.CDAOFactory.getDatumCoordinate(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__Coordinate = org.cdao.jasper.CDAOFactory.getDatumCoordinate(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Coordinate;
						synchronized (listeners) {
							consumersForHas__Coordinate = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Coordinate.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.has__CoordinateRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_has__Coordinate);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__TUProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
					if (belongs__to__TU != null && belongs__to__TU.resource().equals(resource))
						belongs__to__TU = null;				
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.belongs__to__TUChanged(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this);
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
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.belongs__toRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_belongs__to);
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
					org.cdao.jasper.CDAOAnnotation _has__Annotation = null;
					if (has__Annotation != null) {
						boolean found = false;
						for (int i=0;i<has__Annotation.size();i++) {
							org.cdao.jasper.CDAOAnnotation __item = (org.cdao.jasper.CDAOAnnotation) has__Annotation.get(i);
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
								_has__Annotation = org.cdao.jasper.CDAOFactory.getCDAOAnnotation(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__Annotation = org.cdao.jasper.CDAOFactory.getCDAOAnnotation(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Annotation;
						synchronized (listeners) {
							consumersForHas__Annotation = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Annotation.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.has__AnnotationRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_has__Annotation);
						}
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.has__External__ReferenceRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,literal);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.has__PrecisionRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,(java.lang.Float)obj);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.has__Uncertainty__FactorRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,(java.lang.Float)obj);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.has__Float__ValueRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,(java.lang.Float)obj);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.has__Int__ValueRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,(java.lang.Integer)obj);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.has__ValueRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,(java.lang.String)obj);
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
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.has__Support__ValueRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,(java.lang.Float)obj);
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
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.hasRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_has);
						}
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
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.connects__toRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_connects__to);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(exclude__SubtreeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jasper.Subtree _exclude__Subtree = null;
					if (exclude__Subtree != null) {
						boolean found = false;
						for (int i=0;i<exclude__Subtree.size();i++) {
							org.cdao.jasper.Subtree __item = (org.cdao.jasper.Subtree) exclude__Subtree.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_exclude__Subtree = __item;
								break;
							}
						}
						if (found)
							exclude__Subtree.remove(_exclude__Subtree);
						else {
							try {
								_exclude__Subtree = org.cdao.jasper.CDAOFactory.getSubtree(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_exclude__Subtree = org.cdao.jasper.CDAOFactory.getSubtree(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForExclude__Subtree;
						synchronized (listeners) {
							consumersForExclude__Subtree = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForExclude__Subtree.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.exclude__SubtreeRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_exclude__Subtree);
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
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.part__ofRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_part__of);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__TypeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _has__Type = null;
					if (has__Type != null) {
						boolean found = false;
						for (int i=0;i<has__Type.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) has__Type.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__Type = __item;
								break;
							}
						}
						if (found)
							has__Type.remove(_has__Type);
						else {
							try {
								_has__Type = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__Type = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Type;
						synchronized (listeners) {
							consumersForHas__Type = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Type.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.has__TypeRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_has__Type);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(exclude__NodeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					org.cdao.jasper.Node _exclude__Node = null;
					if (exclude__Node != null) {
						boolean found = false;
						for (int i=0;i<exclude__Node.size();i++) {
							org.cdao.jasper.Node __item = (org.cdao.jasper.Node) exclude__Node.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_exclude__Node = __item;
								break;
							}
						}
						if (found)
							exclude__Node.remove(_exclude__Node);
						else {
							try {
								_exclude__Node = org.cdao.jasper.CDAOFactory.getNode(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_exclude__Node = org.cdao.jasper.CDAOFactory.getNode(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForExclude__Node;
						synchronized (listeners) {
							consumersForExclude__Node = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForExclude__Node.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.exclude__NodeRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_exclude__Node);
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
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.precedesRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_precedes);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(excludeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _exclude = null;
					if (exclude != null) {
						boolean found = false;
						for (int i=0;i<exclude.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) exclude.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_exclude = __item;
								break;
							}
						}
						if (found)
							exclude.remove(_exclude);
						else {
							try {
								_exclude = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_exclude = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForExclude;
						synchronized (listeners) {
							consumersForExclude = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForExclude.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.excludeRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_exclude);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(has__Nucleotide__StateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (_model.contains(resource,RDF.type,org.cdao.jasper.DesoxiRibonucleotideResidue.TYPE)) {
					org.cdao.jasper.DesoxiRibonucleotideResidue _has__Nucleotide__State_asDesoxiRibonucleotideResidue = null;
					if (has__Nucleotide__State_asDesoxiRibonucleotideResidue != null) {
						boolean found = false;
						for (int i=0;i<has__Nucleotide__State_asDesoxiRibonucleotideResidue.size();i++) {
							org.cdao.jasper.DesoxiRibonucleotideResidue __item = (org.cdao.jasper.DesoxiRibonucleotideResidue) has__Nucleotide__State_asDesoxiRibonucleotideResidue.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__Nucleotide__State_asDesoxiRibonucleotideResidue = __item;
								break;
							}
						}
						if (found)
							has__Nucleotide__State_asDesoxiRibonucleotideResidue.remove(_has__Nucleotide__State_asDesoxiRibonucleotideResidue);
						else {
							try {
								_has__Nucleotide__State_asDesoxiRibonucleotideResidue = org.cdao.jasper.CDAOFactory.getDesoxiRibonucleotideResidue(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__Nucleotide__State_asDesoxiRibonucleotideResidue = org.cdao.jasper.CDAOFactory.getDesoxiRibonucleotideResidue(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Nucleotide__State_asDesoxiRibonucleotideResidue;
						synchronized (listeners) {
							consumersForHas__Nucleotide__State_asDesoxiRibonucleotideResidue = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Nucleotide__State_asDesoxiRibonucleotideResidue.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.has__Nucleotide__StateRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_has__Nucleotide__State_asDesoxiRibonucleotideResidue);
						}
					}
				}
				if (_model.contains(resource,RDF.type,org.cdao.jasper.Generic__State.TYPE)) {
					org.cdao.jasper.Generic__State _has__Nucleotide__State_asGeneric__State = null;
					if (has__Nucleotide__State_asGeneric__State != null) {
						boolean found = false;
						for (int i=0;i<has__Nucleotide__State_asGeneric__State.size();i++) {
							org.cdao.jasper.Generic__State __item = (org.cdao.jasper.Generic__State) has__Nucleotide__State_asGeneric__State.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_has__Nucleotide__State_asGeneric__State = __item;
								break;
							}
						}
						if (found)
							has__Nucleotide__State_asGeneric__State.remove(_has__Nucleotide__State_asGeneric__State);
						else {
							try {
								_has__Nucleotide__State_asGeneric__State = org.cdao.jasper.CDAOFactory.getGeneric__State(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_has__Nucleotide__State_asGeneric__State = org.cdao.jasper.CDAOFactory.getGeneric__State(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHas__Nucleotide__State_asGeneric__State;
						synchronized (listeners) {
							consumersForHas__Nucleotide__State_asGeneric__State = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHas__Nucleotide__State_asGeneric__State.iterator();iter.hasNext();){
							DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
							listener.has__Nucleotide__StateRemoved(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this,_has__Nucleotide__State_asGeneric__State);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(belongs__to__Nucleotide__CharacterProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
					if (belongs__to__Nucleotide__Character != null && belongs__to__Nucleotide__Character.resource().equals(resource))
						belongs__to__Nucleotide__Character = null;				
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						DesoxiRibonucleotideResidueStateDatumListener listener=(DesoxiRibonucleotideResidueStateDatumListener)iter.next();
						listener.belongs__to__Nucleotide__CharacterChanged(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.this);
					}
				}
				return;
			}
		}

	//}
	


}