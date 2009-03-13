

package org.cdao.jastor;

import com.ibm.adtech.jastor.*;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.vocabulary.RDF;

/**
 * Factory for instantiating objects for ontology classes in the CDAO ontology.  The
 * get methods leave the model unchanged and return a Java view of the object in the model.  The create methods
 * may add certain baseline properties to the model such as rdf:type and any properties with hasValue restrictions.
 * <p>(URI: http://www.cdao.org/CDAO)</p>
 * <br>
 * <br>
 * <br>
 */
public class CDAOFactory extends com.ibm.adtech.jastor.ThingFactory { 



	/**
	 * Create a new instance of CoordinateList.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CoordinateList
	 * @param model the Jena Model.
	 */
	public static CoordinateList createCoordinateList(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CoordinateListImpl.createCoordinateList(resource,model);
	}
	
	/**
	 * Create a new instance of CoordinateList.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CoordinateList
	 * @param model the Jena Model.
	 */
	public static CoordinateList createCoordinateList(String uri, Model model) throws JastorException {
		CoordinateList obj = org.cdao.jastor.CoordinateListImpl.createCoordinateList(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CoordinateList.  Leaves the model unchanged.
	 * @param uri The uri of the CoordinateList
	 * @param model the Jena Model.
	 */
	public static CoordinateList getCoordinateList(String uri, Model model) throws JastorException {
		return getCoordinateList(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CoordinateList.  Leaves the model unchanged.
	 * @param resource The resource of the CoordinateList
	 * @param model the Jena Model.
	 */
	public static CoordinateList getCoordinateList(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.CoordinateList.class.hashCode()) + resource.toString();
		org.cdao.jastor.CoordinateListImpl obj = (org.cdao.jastor.CoordinateListImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CoordinateListImpl.getCoordinateList(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CoordinateList for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#CoordinateList
	 * @param model the Jena Model
	 * @return a List of CoordinateList
	 */
	public static java.util.List getAllCoordinateList(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CoordinateList.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCoordinateList(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of AminoAcidResidueStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AminoAcidResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidueStateDatum createAminoAcidResidueStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.AminoAcidResidueStateDatumImpl.createAminoAcidResidueStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of AminoAcidResidueStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AminoAcidResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidueStateDatum createAminoAcidResidueStateDatum(String uri, Model model) throws JastorException {
		AminoAcidResidueStateDatum obj = org.cdao.jastor.AminoAcidResidueStateDatumImpl.createAminoAcidResidueStateDatum(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of AminoAcidResidueStateDatum.  Leaves the model unchanged.
	 * @param uri The uri of the AminoAcidResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidueStateDatum getAminoAcidResidueStateDatum(String uri, Model model) throws JastorException {
		return getAminoAcidResidueStateDatum(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of AminoAcidResidueStateDatum.  Leaves the model unchanged.
	 * @param resource The resource of the AminoAcidResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidueStateDatum getAminoAcidResidueStateDatum(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.AminoAcidResidueStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jastor.AminoAcidResidueStateDatumImpl obj = (org.cdao.jastor.AminoAcidResidueStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.AminoAcidResidueStateDatumImpl.getAminoAcidResidueStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of AminoAcidResidueStateDatum for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#AminoAcidResidueStateDatum
	 * @param model the Jena Model
	 * @return a List of AminoAcidResidueStateDatum
	 */
	public static java.util.List getAllAminoAcidResidueStateDatum(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,AminoAcidResidueStateDatum.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAminoAcidResidueStateDatum(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Character.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Character
	 * @param model the Jena Model.
	 */
	public static Character createCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CharacterImpl.createCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of Character.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Character
	 * @param model the Jena Model.
	 */
	public static Character createCharacter(String uri, Model model) throws JastorException {
		Character obj = org.cdao.jastor.CharacterImpl.createCharacter(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Character.  Leaves the model unchanged.
	 * @param uri The uri of the Character
	 * @param model the Jena Model.
	 */
	public static Character getCharacter(String uri, Model model) throws JastorException {
		return getCharacter(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Character.  Leaves the model unchanged.
	 * @param resource The resource of the Character
	 * @param model the Jena Model.
	 */
	public static Character getCharacter(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Character.class.hashCode()) + resource.toString();
		org.cdao.jastor.CharacterImpl obj = (org.cdao.jastor.CharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CharacterImpl.getCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Character for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Character
	 * @param model the Jena Model
	 * @return a List of Character
	 */
	public static java.util.List getAllCharacter(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Character.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCharacter(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of TreeAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TreeAnnotation
	 * @param model the Jena Model.
	 */
	public static TreeAnnotation createTreeAnnotation(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.TreeAnnotationImpl.createTreeAnnotation(resource,model);
	}
	
	/**
	 * Create a new instance of TreeAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TreeAnnotation
	 * @param model the Jena Model.
	 */
	public static TreeAnnotation createTreeAnnotation(String uri, Model model) throws JastorException {
		TreeAnnotation obj = org.cdao.jastor.TreeAnnotationImpl.createTreeAnnotation(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of TreeAnnotation.  Leaves the model unchanged.
	 * @param uri The uri of the TreeAnnotation
	 * @param model the Jena Model.
	 */
	public static TreeAnnotation getTreeAnnotation(String uri, Model model) throws JastorException {
		return getTreeAnnotation(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of TreeAnnotation.  Leaves the model unchanged.
	 * @param resource The resource of the TreeAnnotation
	 * @param model the Jena Model.
	 */
	public static TreeAnnotation getTreeAnnotation(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.TreeAnnotation.class.hashCode()) + resource.toString();
		org.cdao.jastor.TreeAnnotationImpl obj = (org.cdao.jastor.TreeAnnotationImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.TreeAnnotationImpl.getTreeAnnotation(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TreeAnnotation for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#TreeAnnotation
	 * @param model the Jena Model
	 * @return a List of TreeAnnotation
	 */
	public static java.util.List getAllTreeAnnotation(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,TreeAnnotation.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getTreeAnnotation(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of EdgeAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the EdgeAnnotation
	 * @param model the Jena Model.
	 */
	public static EdgeAnnotation createEdgeAnnotation(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.EdgeAnnotationImpl.createEdgeAnnotation(resource,model);
	}
	
	/**
	 * Create a new instance of EdgeAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the EdgeAnnotation
	 * @param model the Jena Model.
	 */
	public static EdgeAnnotation createEdgeAnnotation(String uri, Model model) throws JastorException {
		EdgeAnnotation obj = org.cdao.jastor.EdgeAnnotationImpl.createEdgeAnnotation(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of EdgeAnnotation.  Leaves the model unchanged.
	 * @param uri The uri of the EdgeAnnotation
	 * @param model the Jena Model.
	 */
	public static EdgeAnnotation getEdgeAnnotation(String uri, Model model) throws JastorException {
		return getEdgeAnnotation(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of EdgeAnnotation.  Leaves the model unchanged.
	 * @param resource The resource of the EdgeAnnotation
	 * @param model the Jena Model.
	 */
	public static EdgeAnnotation getEdgeAnnotation(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.EdgeAnnotation.class.hashCode()) + resource.toString();
		org.cdao.jastor.EdgeAnnotationImpl obj = (org.cdao.jastor.EdgeAnnotationImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.EdgeAnnotationImpl.getEdgeAnnotation(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of EdgeAnnotation for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#EdgeAnnotation
	 * @param model the Jena Model
	 * @return a List of EdgeAnnotation
	 */
	public static java.util.List getAllEdgeAnnotation(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,EdgeAnnotation.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getEdgeAnnotation(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of EdgeLength.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the EdgeLength
	 * @param model the Jena Model.
	 */
	public static EdgeLength createEdgeLength(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.EdgeLengthImpl.createEdgeLength(resource,model);
	}
	
	/**
	 * Create a new instance of EdgeLength.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the EdgeLength
	 * @param model the Jena Model.
	 */
	public static EdgeLength createEdgeLength(String uri, Model model) throws JastorException {
		EdgeLength obj = org.cdao.jastor.EdgeLengthImpl.createEdgeLength(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of EdgeLength.  Leaves the model unchanged.
	 * @param uri The uri of the EdgeLength
	 * @param model the Jena Model.
	 */
	public static EdgeLength getEdgeLength(String uri, Model model) throws JastorException {
		return getEdgeLength(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of EdgeLength.  Leaves the model unchanged.
	 * @param resource The resource of the EdgeLength
	 * @param model the Jena Model.
	 */
	public static EdgeLength getEdgeLength(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.EdgeLength.class.hashCode()) + resource.toString();
		org.cdao.jastor.EdgeLengthImpl obj = (org.cdao.jastor.EdgeLengthImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.EdgeLengthImpl.getEdgeLength(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of EdgeLength for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#EdgeLength
	 * @param model the Jena Model
	 * @return a List of EdgeLength
	 */
	public static java.util.List getAllEdgeLength(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,EdgeLength.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getEdgeLength(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of RootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the RootedTree
	 * @param model the Jena Model.
	 */
	public static RootedTree createRootedTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.RootedTreeImpl.createRootedTree(resource,model);
	}
	
	/**
	 * Create a new instance of RootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the RootedTree
	 * @param model the Jena Model.
	 */
	public static RootedTree createRootedTree(String uri, Model model) throws JastorException {
		RootedTree obj = org.cdao.jastor.RootedTreeImpl.createRootedTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of RootedTree.  Leaves the model unchanged.
	 * @param uri The uri of the RootedTree
	 * @param model the Jena Model.
	 */
	public static RootedTree getRootedTree(String uri, Model model) throws JastorException {
		return getRootedTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of RootedTree.  Leaves the model unchanged.
	 * @param resource The resource of the RootedTree
	 * @param model the Jena Model.
	 */
	public static RootedTree getRootedTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.RootedTree.class.hashCode()) + resource.toString();
		org.cdao.jastor.RootedTreeImpl obj = (org.cdao.jastor.RootedTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.RootedTreeImpl.getRootedTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of RootedTree for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#RootedTree
	 * @param model the Jena Model
	 * @return a List of RootedTree
	 */
	public static java.util.List getAllRootedTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,RootedTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getRootedTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of DesoxiRibonucleotideResidue.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DesoxiRibonucleotideResidue
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidue createDesoxiRibonucleotideResidue(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.DesoxiRibonucleotideResidueImpl.createDesoxiRibonucleotideResidue(resource,model);
	}
	
	/**
	 * Create a new instance of DesoxiRibonucleotideResidue.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DesoxiRibonucleotideResidue
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidue createDesoxiRibonucleotideResidue(String uri, Model model) throws JastorException {
		DesoxiRibonucleotideResidue obj = org.cdao.jastor.DesoxiRibonucleotideResidueImpl.createDesoxiRibonucleotideResidue(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of DesoxiRibonucleotideResidue.  Leaves the model unchanged.
	 * @param uri The uri of the DesoxiRibonucleotideResidue
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidue getDesoxiRibonucleotideResidue(String uri, Model model) throws JastorException {
		return getDesoxiRibonucleotideResidue(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of DesoxiRibonucleotideResidue.  Leaves the model unchanged.
	 * @param resource The resource of the DesoxiRibonucleotideResidue
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidue getDesoxiRibonucleotideResidue(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.DesoxiRibonucleotideResidue.class.hashCode()) + resource.toString();
		org.cdao.jastor.DesoxiRibonucleotideResidueImpl obj = (org.cdao.jastor.DesoxiRibonucleotideResidueImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.DesoxiRibonucleotideResidueImpl.getDesoxiRibonucleotideResidue(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DesoxiRibonucleotideResidue for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#DesoxiRibonucleotideResidue
	 * @param model the Jena Model
	 * @return a List of DesoxiRibonucleotideResidue
	 */
	public static java.util.List getAllDesoxiRibonucleotideResidue(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,DesoxiRibonucleotideResidue.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDesoxiRibonucleotideResidue(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Tree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Tree
	 * @param model the Jena Model.
	 */
	public static Tree createTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.TreeImpl.createTree(resource,model);
	}
	
	/**
	 * Create a new instance of Tree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Tree
	 * @param model the Jena Model.
	 */
	public static Tree createTree(String uri, Model model) throws JastorException {
		Tree obj = org.cdao.jastor.TreeImpl.createTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Tree.  Leaves the model unchanged.
	 * @param uri The uri of the Tree
	 * @param model the Jena Model.
	 */
	public static Tree getTree(String uri, Model model) throws JastorException {
		return getTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Tree.  Leaves the model unchanged.
	 * @param resource The resource of the Tree
	 * @param model the Jena Model.
	 */
	public static Tree getTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Tree.class.hashCode()) + resource.toString();
		org.cdao.jastor.TreeImpl obj = (org.cdao.jastor.TreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.TreeImpl.getTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Tree for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Tree
	 * @param model the Jena Model
	 * @return a List of Tree
	 */
	public static java.util.List getAllTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Tree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Edge.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Edge
	 * @param model the Jena Model.
	 */
	public static Edge createEdge(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.EdgeImpl.createEdge(resource,model);
	}
	
	/**
	 * Create a new instance of Edge.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Edge
	 * @param model the Jena Model.
	 */
	public static Edge createEdge(String uri, Model model) throws JastorException {
		Edge obj = org.cdao.jastor.EdgeImpl.createEdge(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Edge.  Leaves the model unchanged.
	 * @param uri The uri of the Edge
	 * @param model the Jena Model.
	 */
	public static Edge getEdge(String uri, Model model) throws JastorException {
		return getEdge(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Edge.  Leaves the model unchanged.
	 * @param resource The resource of the Edge
	 * @param model the Jena Model.
	 */
	public static Edge getEdge(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Edge.class.hashCode()) + resource.toString();
		org.cdao.jastor.EdgeImpl obj = (org.cdao.jastor.EdgeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.EdgeImpl.getEdge(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Edge for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Edge
	 * @param model the Jena Model
	 * @return a List of Edge
	 */
	public static java.util.List getAllEdge(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Edge.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getEdge(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Sequence.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Sequence
	 * @param model the Jena Model.
	 */
	public static Sequence createSequence(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.SequenceImpl.createSequence(resource,model);
	}
	
	/**
	 * Create a new instance of Sequence.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Sequence
	 * @param model the Jena Model.
	 */
	public static Sequence createSequence(String uri, Model model) throws JastorException {
		Sequence obj = org.cdao.jastor.SequenceImpl.createSequence(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Sequence.  Leaves the model unchanged.
	 * @param uri The uri of the Sequence
	 * @param model the Jena Model.
	 */
	public static Sequence getSequence(String uri, Model model) throws JastorException {
		return getSequence(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Sequence.  Leaves the model unchanged.
	 * @param resource The resource of the Sequence
	 * @param model the Jena Model.
	 */
	public static Sequence getSequence(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Sequence.class.hashCode()) + resource.toString();
		org.cdao.jastor.SequenceImpl obj = (org.cdao.jastor.SequenceImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.SequenceImpl.getSequence(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Sequence for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Sequence
	 * @param model the Jena Model
	 * @return a List of Sequence
	 */
	public static java.util.List getAllSequence(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Sequence.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getSequence(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of SubstitutionModel.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SubstitutionModel
	 * @param model the Jena Model.
	 */
	public static SubstitutionModel createSubstitutionModel(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.SubstitutionModelImpl.createSubstitutionModel(resource,model);
	}
	
	/**
	 * Create a new instance of SubstitutionModel.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SubstitutionModel
	 * @param model the Jena Model.
	 */
	public static SubstitutionModel createSubstitutionModel(String uri, Model model) throws JastorException {
		SubstitutionModel obj = org.cdao.jastor.SubstitutionModelImpl.createSubstitutionModel(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of SubstitutionModel.  Leaves the model unchanged.
	 * @param uri The uri of the SubstitutionModel
	 * @param model the Jena Model.
	 */
	public static SubstitutionModel getSubstitutionModel(String uri, Model model) throws JastorException {
		return getSubstitutionModel(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of SubstitutionModel.  Leaves the model unchanged.
	 * @param resource The resource of the SubstitutionModel
	 * @param model the Jena Model.
	 */
	public static SubstitutionModel getSubstitutionModel(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.SubstitutionModel.class.hashCode()) + resource.toString();
		org.cdao.jastor.SubstitutionModelImpl obj = (org.cdao.jastor.SubstitutionModelImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.SubstitutionModelImpl.getSubstitutionModel(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SubstitutionModel for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#SubstitutionModel
	 * @param model the Jena Model
	 * @return a List of SubstitutionModel
	 */
	public static java.util.List getAllSubstitutionModel(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,SubstitutionModel.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getSubstitutionModel(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Continuous.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Continuous
	 * @param model the Jena Model.
	 */
	public static Continuous createContinuous(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.ContinuousImpl.createContinuous(resource,model);
	}
	
	/**
	 * Create a new instance of Continuous.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Continuous
	 * @param model the Jena Model.
	 */
	public static Continuous createContinuous(String uri, Model model) throws JastorException {
		Continuous obj = org.cdao.jastor.ContinuousImpl.createContinuous(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Continuous.  Leaves the model unchanged.
	 * @param uri The uri of the Continuous
	 * @param model the Jena Model.
	 */
	public static Continuous getContinuous(String uri, Model model) throws JastorException {
		return getContinuous(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Continuous.  Leaves the model unchanged.
	 * @param resource The resource of the Continuous
	 * @param model the Jena Model.
	 */
	public static Continuous getContinuous(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Continuous.class.hashCode()) + resource.toString();
		org.cdao.jastor.ContinuousImpl obj = (org.cdao.jastor.ContinuousImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.ContinuousImpl.getContinuous(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Continuous for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Continuous
	 * @param model the Jena Model
	 * @return a List of Continuous
	 */
	public static java.util.List getAllContinuous(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Continuous.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getContinuous(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CompoundStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CompoundStateDatum
	 * @param model the Jena Model.
	 */
	public static CompoundStateDatum createCompoundStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CompoundStateDatumImpl.createCompoundStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of CompoundStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CompoundStateDatum
	 * @param model the Jena Model.
	 */
	public static CompoundStateDatum createCompoundStateDatum(String uri, Model model) throws JastorException {
		CompoundStateDatum obj = org.cdao.jastor.CompoundStateDatumImpl.createCompoundStateDatum(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CompoundStateDatum.  Leaves the model unchanged.
	 * @param uri The uri of the CompoundStateDatum
	 * @param model the Jena Model.
	 */
	public static CompoundStateDatum getCompoundStateDatum(String uri, Model model) throws JastorException {
		return getCompoundStateDatum(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CompoundStateDatum.  Leaves the model unchanged.
	 * @param resource The resource of the CompoundStateDatum
	 * @param model the Jena Model.
	 */
	public static CompoundStateDatum getCompoundStateDatum(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.CompoundStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jastor.CompoundStateDatumImpl obj = (org.cdao.jastor.CompoundStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CompoundStateDatumImpl.getCompoundStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CompoundStateDatum for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#CompoundStateDatum
	 * @param model the Jena Model
	 * @return a List of CompoundStateDatum
	 */
	public static java.util.List getAllCompoundStateDatum(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CompoundStateDatum.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCompoundStateDatum(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of EdgeTransformation.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the EdgeTransformation
	 * @param model the Jena Model.
	 */
	public static EdgeTransformation createEdgeTransformation(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.EdgeTransformationImpl.createEdgeTransformation(resource,model);
	}
	
	/**
	 * Create a new instance of EdgeTransformation.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the EdgeTransformation
	 * @param model the Jena Model.
	 */
	public static EdgeTransformation createEdgeTransformation(String uri, Model model) throws JastorException {
		EdgeTransformation obj = org.cdao.jastor.EdgeTransformationImpl.createEdgeTransformation(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of EdgeTransformation.  Leaves the model unchanged.
	 * @param uri The uri of the EdgeTransformation
	 * @param model the Jena Model.
	 */
	public static EdgeTransformation getEdgeTransformation(String uri, Model model) throws JastorException {
		return getEdgeTransformation(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of EdgeTransformation.  Leaves the model unchanged.
	 * @param resource The resource of the EdgeTransformation
	 * @param model the Jena Model.
	 */
	public static EdgeTransformation getEdgeTransformation(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.EdgeTransformation.class.hashCode()) + resource.toString();
		org.cdao.jastor.EdgeTransformationImpl obj = (org.cdao.jastor.EdgeTransformationImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.EdgeTransformationImpl.getEdgeTransformation(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of EdgeTransformation for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#EdgeTransformation
	 * @param model the Jena Model
	 * @return a List of EdgeTransformation
	 */
	public static java.util.List getAllEdgeTransformation(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,EdgeTransformation.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getEdgeTransformation(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CharacterStateDomain.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CharacterStateDomain
	 * @param model the Jena Model.
	 */
	public static CharacterStateDomain createCharacterStateDomain(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CharacterStateDomainImpl.createCharacterStateDomain(resource,model);
	}
	
	/**
	 * Create a new instance of CharacterStateDomain.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CharacterStateDomain
	 * @param model the Jena Model.
	 */
	public static CharacterStateDomain createCharacterStateDomain(String uri, Model model) throws JastorException {
		CharacterStateDomain obj = org.cdao.jastor.CharacterStateDomainImpl.createCharacterStateDomain(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CharacterStateDomain.  Leaves the model unchanged.
	 * @param uri The uri of the CharacterStateDomain
	 * @param model the Jena Model.
	 */
	public static CharacterStateDomain getCharacterStateDomain(String uri, Model model) throws JastorException {
		return getCharacterStateDomain(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CharacterStateDomain.  Leaves the model unchanged.
	 * @param resource The resource of the CharacterStateDomain
	 * @param model the Jena Model.
	 */
	public static CharacterStateDomain getCharacterStateDomain(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.CharacterStateDomain.class.hashCode()) + resource.toString();
		org.cdao.jastor.CharacterStateDomainImpl obj = (org.cdao.jastor.CharacterStateDomainImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CharacterStateDomainImpl.getCharacterStateDomain(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CharacterStateDomain for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#CharacterStateDomain
	 * @param model the Jena Model
	 * @return a List of CharacterStateDomain
	 */
	public static java.util.List getAllCharacterStateDomain(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CharacterStateDomain.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCharacterStateDomain(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CoordinatePoint.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CoordinatePoint
	 * @param model the Jena Model.
	 */
	public static CoordinatePoint createCoordinatePoint(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CoordinatePointImpl.createCoordinatePoint(resource,model);
	}
	
	/**
	 * Create a new instance of CoordinatePoint.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CoordinatePoint
	 * @param model the Jena Model.
	 */
	public static CoordinatePoint createCoordinatePoint(String uri, Model model) throws JastorException {
		CoordinatePoint obj = org.cdao.jastor.CoordinatePointImpl.createCoordinatePoint(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CoordinatePoint.  Leaves the model unchanged.
	 * @param uri The uri of the CoordinatePoint
	 * @param model the Jena Model.
	 */
	public static CoordinatePoint getCoordinatePoint(String uri, Model model) throws JastorException {
		return getCoordinatePoint(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CoordinatePoint.  Leaves the model unchanged.
	 * @param resource The resource of the CoordinatePoint
	 * @param model the Jena Model.
	 */
	public static CoordinatePoint getCoordinatePoint(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.CoordinatePoint.class.hashCode()) + resource.toString();
		org.cdao.jastor.CoordinatePointImpl obj = (org.cdao.jastor.CoordinatePointImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CoordinatePointImpl.getCoordinatePoint(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CoordinatePoint for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#CoordinatePoint
	 * @param model the Jena Model
	 * @return a List of CoordinatePoint
	 */
	public static java.util.List getAllCoordinatePoint(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CoordinatePoint.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCoordinatePoint(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CategoricalCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CategoricalCharacter
	 * @param model the Jena Model.
	 */
	public static CategoricalCharacter createCategoricalCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CategoricalCharacterImpl.createCategoricalCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of CategoricalCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CategoricalCharacter
	 * @param model the Jena Model.
	 */
	public static CategoricalCharacter createCategoricalCharacter(String uri, Model model) throws JastorException {
		CategoricalCharacter obj = org.cdao.jastor.CategoricalCharacterImpl.createCategoricalCharacter(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CategoricalCharacter.  Leaves the model unchanged.
	 * @param uri The uri of the CategoricalCharacter
	 * @param model the Jena Model.
	 */
	public static CategoricalCharacter getCategoricalCharacter(String uri, Model model) throws JastorException {
		return getCategoricalCharacter(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CategoricalCharacter.  Leaves the model unchanged.
	 * @param resource The resource of the CategoricalCharacter
	 * @param model the Jena Model.
	 */
	public static CategoricalCharacter getCategoricalCharacter(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.CategoricalCharacter.class.hashCode()) + resource.toString();
		org.cdao.jastor.CategoricalCharacterImpl obj = (org.cdao.jastor.CategoricalCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CategoricalCharacterImpl.getCategoricalCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CategoricalCharacter for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#CategoricalCharacter
	 * @param model the Jena Model
	 * @return a List of CategoricalCharacter
	 */
	public static java.util.List getAllCategoricalCharacter(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CategoricalCharacter.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCategoricalCharacter(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of AncestralNode.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AncestralNode
	 * @param model the Jena Model.
	 */
	public static AncestralNode createAncestralNode(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.AncestralNodeImpl.createAncestralNode(resource,model);
	}
	
	/**
	 * Create a new instance of AncestralNode.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AncestralNode
	 * @param model the Jena Model.
	 */
	public static AncestralNode createAncestralNode(String uri, Model model) throws JastorException {
		AncestralNode obj = org.cdao.jastor.AncestralNodeImpl.createAncestralNode(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of AncestralNode.  Leaves the model unchanged.
	 * @param uri The uri of the AncestralNode
	 * @param model the Jena Model.
	 */
	public static AncestralNode getAncestralNode(String uri, Model model) throws JastorException {
		return getAncestralNode(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of AncestralNode.  Leaves the model unchanged.
	 * @param resource The resource of the AncestralNode
	 * @param model the Jena Model.
	 */
	public static AncestralNode getAncestralNode(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.AncestralNode.class.hashCode()) + resource.toString();
		org.cdao.jastor.AncestralNodeImpl obj = (org.cdao.jastor.AncestralNodeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.AncestralNodeImpl.getAncestralNode(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of AncestralNode for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#AncestralNode
	 * @param model the Jena Model
	 * @return a List of AncestralNode
	 */
	public static java.util.List getAllAncestralNode(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,AncestralNode.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAncestralNode(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of _Thing.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the _Thing
	 * @param model the Jena Model.
	 */
	public static _Thing create_Thing(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor._ThingImpl.create_Thing(resource,model);
	}
	
	/**
	 * Create a new instance of _Thing.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the _Thing
	 * @param model the Jena Model.
	 */
	public static _Thing create_Thing(String uri, Model model) throws JastorException {
		_Thing obj = org.cdao.jastor._ThingImpl.create_Thing(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of _Thing.  Leaves the model unchanged.
	 * @param uri The uri of the _Thing
	 * @param model the Jena Model.
	 */
	public static _Thing get_Thing(String uri, Model model) throws JastorException {
		return get_Thing(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of _Thing.  Leaves the model unchanged.
	 * @param resource The resource of the _Thing
	 * @param model the Jena Model.
	 */
	public static _Thing get_Thing(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor._Thing.class.hashCode()) + resource.toString();
		org.cdao.jastor._ThingImpl obj = (org.cdao.jastor._ThingImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor._ThingImpl.get_Thing(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of _Thing for every resource in the model with rdf:Type http://www.w3.org/2002/07/owl#Thing
	 * @param model the Jena Model
	 * @return a List of _Thing
	 */
	public static java.util.List getAll_Thing(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,_Thing.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(get_Thing(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of DatumCoordinate.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DatumCoordinate
	 * @param model the Jena Model.
	 */
	public static DatumCoordinate createDatumCoordinate(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.DatumCoordinateImpl.createDatumCoordinate(resource,model);
	}
	
	/**
	 * Create a new instance of DatumCoordinate.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DatumCoordinate
	 * @param model the Jena Model.
	 */
	public static DatumCoordinate createDatumCoordinate(String uri, Model model) throws JastorException {
		DatumCoordinate obj = org.cdao.jastor.DatumCoordinateImpl.createDatumCoordinate(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of DatumCoordinate.  Leaves the model unchanged.
	 * @param uri The uri of the DatumCoordinate
	 * @param model the Jena Model.
	 */
	public static DatumCoordinate getDatumCoordinate(String uri, Model model) throws JastorException {
		return getDatumCoordinate(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of DatumCoordinate.  Leaves the model unchanged.
	 * @param resource The resource of the DatumCoordinate
	 * @param model the Jena Model.
	 */
	public static DatumCoordinate getDatumCoordinate(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.DatumCoordinate.class.hashCode()) + resource.toString();
		org.cdao.jastor.DatumCoordinateImpl obj = (org.cdao.jastor.DatumCoordinateImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.DatumCoordinateImpl.getDatumCoordinate(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DatumCoordinate for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#DatumCoordinate
	 * @param model the Jena Model
	 * @return a List of DatumCoordinate
	 */
	public static java.util.List getAllDatumCoordinate(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,DatumCoordinate.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDatumCoordinate(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of GapCost.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the GapCost
	 * @param model the Jena Model.
	 */
	public static GapCost createGapCost(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.GapCostImpl.createGapCost(resource,model);
	}
	
	/**
	 * Create a new instance of GapCost.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the GapCost
	 * @param model the Jena Model.
	 */
	public static GapCost createGapCost(String uri, Model model) throws JastorException {
		GapCost obj = org.cdao.jastor.GapCostImpl.createGapCost(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of GapCost.  Leaves the model unchanged.
	 * @param uri The uri of the GapCost
	 * @param model the Jena Model.
	 */
	public static GapCost getGapCost(String uri, Model model) throws JastorException {
		return getGapCost(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of GapCost.  Leaves the model unchanged.
	 * @param resource The resource of the GapCost
	 * @param model the Jena Model.
	 */
	public static GapCost getGapCost(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.GapCost.class.hashCode()) + resource.toString();
		org.cdao.jastor.GapCostImpl obj = (org.cdao.jastor.GapCostImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.GapCostImpl.getGapCost(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of GapCost for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#GapCost
	 * @param model the Jena Model
	 * @return a List of GapCost
	 */
	public static java.util.List getAllGapCost(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,GapCost.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getGapCost(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of AminoAcidResidueCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AminoAcidResidueCharacter
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidueCharacter createAminoAcidResidueCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.AminoAcidResidueCharacterImpl.createAminoAcidResidueCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of AminoAcidResidueCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AminoAcidResidueCharacter
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidueCharacter createAminoAcidResidueCharacter(String uri, Model model) throws JastorException {
		AminoAcidResidueCharacter obj = org.cdao.jastor.AminoAcidResidueCharacterImpl.createAminoAcidResidueCharacter(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of AminoAcidResidueCharacter.  Leaves the model unchanged.
	 * @param uri The uri of the AminoAcidResidueCharacter
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidueCharacter getAminoAcidResidueCharacter(String uri, Model model) throws JastorException {
		return getAminoAcidResidueCharacter(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of AminoAcidResidueCharacter.  Leaves the model unchanged.
	 * @param resource The resource of the AminoAcidResidueCharacter
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidueCharacter getAminoAcidResidueCharacter(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.AminoAcidResidueCharacter.class.hashCode()) + resource.toString();
		org.cdao.jastor.AminoAcidResidueCharacterImpl obj = (org.cdao.jastor.AminoAcidResidueCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.AminoAcidResidueCharacterImpl.getAminoAcidResidueCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of AminoAcidResidueCharacter for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#AminoAcidResidueCharacter
	 * @param model the Jena Model
	 * @return a List of AminoAcidResidueCharacter
	 */
	public static java.util.List getAllAminoAcidResidueCharacter(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,AminoAcidResidueCharacter.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAminoAcidResidueCharacter(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of MolecularCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MolecularCharacter
	 * @param model the Jena Model.
	 */
	public static MolecularCharacter createMolecularCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.MolecularCharacterImpl.createMolecularCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of MolecularCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MolecularCharacter
	 * @param model the Jena Model.
	 */
	public static MolecularCharacter createMolecularCharacter(String uri, Model model) throws JastorException {
		MolecularCharacter obj = org.cdao.jastor.MolecularCharacterImpl.createMolecularCharacter(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of MolecularCharacter.  Leaves the model unchanged.
	 * @param uri The uri of the MolecularCharacter
	 * @param model the Jena Model.
	 */
	public static MolecularCharacter getMolecularCharacter(String uri, Model model) throws JastorException {
		return getMolecularCharacter(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of MolecularCharacter.  Leaves the model unchanged.
	 * @param resource The resource of the MolecularCharacter
	 * @param model the Jena Model.
	 */
	public static MolecularCharacter getMolecularCharacter(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.MolecularCharacter.class.hashCode()) + resource.toString();
		org.cdao.jastor.MolecularCharacterImpl obj = (org.cdao.jastor.MolecularCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.MolecularCharacterImpl.getMolecularCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MolecularCharacter for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#MolecularCharacter
	 * @param model the Jena Model
	 * @return a List of MolecularCharacter
	 */
	public static java.util.List getAllMolecularCharacter(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,MolecularCharacter.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMolecularCharacter(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Network.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Network
	 * @param model the Jena Model.
	 */
	public static Network createNetwork(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.NetworkImpl.createNetwork(resource,model);
	}
	
	/**
	 * Create a new instance of Network.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Network
	 * @param model the Jena Model.
	 */
	public static Network createNetwork(String uri, Model model) throws JastorException {
		Network obj = org.cdao.jastor.NetworkImpl.createNetwork(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Network.  Leaves the model unchanged.
	 * @param uri The uri of the Network
	 * @param model the Jena Model.
	 */
	public static Network getNetwork(String uri, Model model) throws JastorException {
		return getNetwork(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Network.  Leaves the model unchanged.
	 * @param resource The resource of the Network
	 * @param model the Jena Model.
	 */
	public static Network getNetwork(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Network.class.hashCode()) + resource.toString();
		org.cdao.jastor.NetworkImpl obj = (org.cdao.jastor.NetworkImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.NetworkImpl.getNetwork(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Network for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Network
	 * @param model the Jena Model
	 * @return a List of Network
	 */
	public static java.util.List getAllNetwork(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Network.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getNetwork(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ModelDescription.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ModelDescription
	 * @param model the Jena Model.
	 */
	public static ModelDescription createModelDescription(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.ModelDescriptionImpl.createModelDescription(resource,model);
	}
	
	/**
	 * Create a new instance of ModelDescription.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ModelDescription
	 * @param model the Jena Model.
	 */
	public static ModelDescription createModelDescription(String uri, Model model) throws JastorException {
		ModelDescription obj = org.cdao.jastor.ModelDescriptionImpl.createModelDescription(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ModelDescription.  Leaves the model unchanged.
	 * @param uri The uri of the ModelDescription
	 * @param model the Jena Model.
	 */
	public static ModelDescription getModelDescription(String uri, Model model) throws JastorException {
		return getModelDescription(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ModelDescription.  Leaves the model unchanged.
	 * @param resource The resource of the ModelDescription
	 * @param model the Jena Model.
	 */
	public static ModelDescription getModelDescription(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.ModelDescription.class.hashCode()) + resource.toString();
		org.cdao.jastor.ModelDescriptionImpl obj = (org.cdao.jastor.ModelDescriptionImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.ModelDescriptionImpl.getModelDescription(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ModelDescription for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#ModelDescription
	 * @param model the Jena Model
	 * @return a List of ModelDescription
	 */
	public static java.util.List getAllModelDescription(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ModelDescription.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getModelDescription(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Molecular.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Molecular
	 * @param model the Jena Model.
	 */
	public static Molecular createMolecular(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.MolecularImpl.createMolecular(resource,model);
	}
	
	/**
	 * Create a new instance of Molecular.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Molecular
	 * @param model the Jena Model.
	 */
	public static Molecular createMolecular(String uri, Model model) throws JastorException {
		Molecular obj = org.cdao.jastor.MolecularImpl.createMolecular(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Molecular.  Leaves the model unchanged.
	 * @param uri The uri of the Molecular
	 * @param model the Jena Model.
	 */
	public static Molecular getMolecular(String uri, Model model) throws JastorException {
		return getMolecular(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Molecular.  Leaves the model unchanged.
	 * @param resource The resource of the Molecular
	 * @param model the Jena Model.
	 */
	public static Molecular getMolecular(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Molecular.class.hashCode()) + resource.toString();
		org.cdao.jastor.MolecularImpl obj = (org.cdao.jastor.MolecularImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.MolecularImpl.getMolecular(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Molecular for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Molecular
	 * @param model the Jena Model
	 * @return a List of Molecular
	 */
	public static java.util.List getAllMolecular(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Molecular.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMolecular(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of DistanceMatrixBasedMethod.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DistanceMatrixBasedMethod
	 * @param model the Jena Model.
	 */
	public static DistanceMatrixBasedMethod createDistanceMatrixBasedMethod(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.DistanceMatrixBasedMethodImpl.createDistanceMatrixBasedMethod(resource,model);
	}
	
	/**
	 * Create a new instance of DistanceMatrixBasedMethod.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DistanceMatrixBasedMethod
	 * @param model the Jena Model.
	 */
	public static DistanceMatrixBasedMethod createDistanceMatrixBasedMethod(String uri, Model model) throws JastorException {
		DistanceMatrixBasedMethod obj = org.cdao.jastor.DistanceMatrixBasedMethodImpl.createDistanceMatrixBasedMethod(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of DistanceMatrixBasedMethod.  Leaves the model unchanged.
	 * @param uri The uri of the DistanceMatrixBasedMethod
	 * @param model the Jena Model.
	 */
	public static DistanceMatrixBasedMethod getDistanceMatrixBasedMethod(String uri, Model model) throws JastorException {
		return getDistanceMatrixBasedMethod(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of DistanceMatrixBasedMethod.  Leaves the model unchanged.
	 * @param resource The resource of the DistanceMatrixBasedMethod
	 * @param model the Jena Model.
	 */
	public static DistanceMatrixBasedMethod getDistanceMatrixBasedMethod(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.DistanceMatrixBasedMethod.class.hashCode()) + resource.toString();
		org.cdao.jastor.DistanceMatrixBasedMethodImpl obj = (org.cdao.jastor.DistanceMatrixBasedMethodImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.DistanceMatrixBasedMethodImpl.getDistanceMatrixBasedMethod(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DistanceMatrixBasedMethod for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#DistanceMatrixBasedMethod
	 * @param model the Jena Model
	 * @return a List of DistanceMatrixBasedMethod
	 */
	public static java.util.List getAllDistanceMatrixBasedMethod(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,DistanceMatrixBasedMethod.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDistanceMatrixBasedMethod(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of MaximumLikelihoodMethod.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MaximumLikelihoodMethod
	 * @param model the Jena Model.
	 */
	public static MaximumLikelihoodMethod createMaximumLikelihoodMethod(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.MaximumLikelihoodMethodImpl.createMaximumLikelihoodMethod(resource,model);
	}
	
	/**
	 * Create a new instance of MaximumLikelihoodMethod.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MaximumLikelihoodMethod
	 * @param model the Jena Model.
	 */
	public static MaximumLikelihoodMethod createMaximumLikelihoodMethod(String uri, Model model) throws JastorException {
		MaximumLikelihoodMethod obj = org.cdao.jastor.MaximumLikelihoodMethodImpl.createMaximumLikelihoodMethod(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of MaximumLikelihoodMethod.  Leaves the model unchanged.
	 * @param uri The uri of the MaximumLikelihoodMethod
	 * @param model the Jena Model.
	 */
	public static MaximumLikelihoodMethod getMaximumLikelihoodMethod(String uri, Model model) throws JastorException {
		return getMaximumLikelihoodMethod(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of MaximumLikelihoodMethod.  Leaves the model unchanged.
	 * @param resource The resource of the MaximumLikelihoodMethod
	 * @param model the Jena Model.
	 */
	public static MaximumLikelihoodMethod getMaximumLikelihoodMethod(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.MaximumLikelihoodMethod.class.hashCode()) + resource.toString();
		org.cdao.jastor.MaximumLikelihoodMethodImpl obj = (org.cdao.jastor.MaximumLikelihoodMethodImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.MaximumLikelihoodMethodImpl.getMaximumLikelihoodMethod(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MaximumLikelihoodMethod for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#MaximumLikelihoodMethod
	 * @param model the Jena Model
	 * @return a List of MaximumLikelihoodMethod
	 */
	public static java.util.List getAllMaximumLikelihoodMethod(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,MaximumLikelihoodMethod.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMaximumLikelihoodMethod(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Lineage.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Lineage
	 * @param model the Jena Model.
	 */
	public static Lineage createLineage(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.LineageImpl.createLineage(resource,model);
	}
	
	/**
	 * Create a new instance of Lineage.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Lineage
	 * @param model the Jena Model.
	 */
	public static Lineage createLineage(String uri, Model model) throws JastorException {
		Lineage obj = org.cdao.jastor.LineageImpl.createLineage(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Lineage.  Leaves the model unchanged.
	 * @param uri The uri of the Lineage
	 * @param model the Jena Model.
	 */
	public static Lineage getLineage(String uri, Model model) throws JastorException {
		return getLineage(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Lineage.  Leaves the model unchanged.
	 * @param resource The resource of the Lineage
	 * @param model the Jena Model.
	 */
	public static Lineage getLineage(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Lineage.class.hashCode()) + resource.toString();
		org.cdao.jastor.LineageImpl obj = (org.cdao.jastor.LineageImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.LineageImpl.getLineage(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Lineage for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Lineage
	 * @param model the Jena Model
	 * @return a List of Lineage
	 */
	public static java.util.List getAllLineage(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Lineage.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getLineage(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of AminoAcidResidue.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AminoAcidResidue
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidue createAminoAcidResidue(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.AminoAcidResidueImpl.createAminoAcidResidue(resource,model);
	}
	
	/**
	 * Create a new instance of AminoAcidResidue.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AminoAcidResidue
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidue createAminoAcidResidue(String uri, Model model) throws JastorException {
		AminoAcidResidue obj = org.cdao.jastor.AminoAcidResidueImpl.createAminoAcidResidue(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of AminoAcidResidue.  Leaves the model unchanged.
	 * @param uri The uri of the AminoAcidResidue
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidue getAminoAcidResidue(String uri, Model model) throws JastorException {
		return getAminoAcidResidue(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of AminoAcidResidue.  Leaves the model unchanged.
	 * @param resource The resource of the AminoAcidResidue
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidue getAminoAcidResidue(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.AminoAcidResidue.class.hashCode()) + resource.toString();
		org.cdao.jastor.AminoAcidResidueImpl obj = (org.cdao.jastor.AminoAcidResidueImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.AminoAcidResidueImpl.getAminoAcidResidue(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of AminoAcidResidue for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#AminoAcidResidue
	 * @param model the Jena Model
	 * @return a List of AminoAcidResidue
	 */
	public static java.util.List getAllAminoAcidResidue(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,AminoAcidResidue.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAminoAcidResidue(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of SetOfNodes.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SetOfNodes
	 * @param model the Jena Model.
	 */
	public static SetOfNodes createSetOfNodes(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.SetOfNodesImpl.createSetOfNodes(resource,model);
	}
	
	/**
	 * Create a new instance of SetOfNodes.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SetOfNodes
	 * @param model the Jena Model.
	 */
	public static SetOfNodes createSetOfNodes(String uri, Model model) throws JastorException {
		SetOfNodes obj = org.cdao.jastor.SetOfNodesImpl.createSetOfNodes(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of SetOfNodes.  Leaves the model unchanged.
	 * @param uri The uri of the SetOfNodes
	 * @param model the Jena Model.
	 */
	public static SetOfNodes getSetOfNodes(String uri, Model model) throws JastorException {
		return getSetOfNodes(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of SetOfNodes.  Leaves the model unchanged.
	 * @param resource The resource of the SetOfNodes
	 * @param model the Jena Model.
	 */
	public static SetOfNodes getSetOfNodes(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.SetOfNodes.class.hashCode()) + resource.toString();
		org.cdao.jastor.SetOfNodesImpl obj = (org.cdao.jastor.SetOfNodesImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.SetOfNodesImpl.getSetOfNodes(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SetOfNodes for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#SetOfNodes
	 * @param model the Jena Model
	 * @return a List of SetOfNodes
	 */
	public static java.util.List getAllSetOfNodes(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,SetOfNodes.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getSetOfNodes(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of MRCANode.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MRCANode
	 * @param model the Jena Model.
	 */
	public static MRCANode createMRCANode(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.MRCANodeImpl.createMRCANode(resource,model);
	}
	
	/**
	 * Create a new instance of MRCANode.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MRCANode
	 * @param model the Jena Model.
	 */
	public static MRCANode createMRCANode(String uri, Model model) throws JastorException {
		MRCANode obj = org.cdao.jastor.MRCANodeImpl.createMRCANode(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of MRCANode.  Leaves the model unchanged.
	 * @param uri The uri of the MRCANode
	 * @param model the Jena Model.
	 */
	public static MRCANode getMRCANode(String uri, Model model) throws JastorException {
		return getMRCANode(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of MRCANode.  Leaves the model unchanged.
	 * @param resource The resource of the MRCANode
	 * @param model the Jena Model.
	 */
	public static MRCANode getMRCANode(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.MRCANode.class.hashCode()) + resource.toString();
		org.cdao.jastor.MRCANodeImpl obj = (org.cdao.jastor.MRCANodeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.MRCANodeImpl.getMRCANode(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MRCANode for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#MRCANode
	 * @param model the Jena Model
	 * @return a List of MRCANode
	 */
	public static java.util.List getAllMRCANode(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,MRCANode.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMRCANode(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of TreeProcedure.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TreeProcedure
	 * @param model the Jena Model.
	 */
	public static TreeProcedure createTreeProcedure(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.TreeProcedureImpl.createTreeProcedure(resource,model);
	}
	
	/**
	 * Create a new instance of TreeProcedure.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TreeProcedure
	 * @param model the Jena Model.
	 */
	public static TreeProcedure createTreeProcedure(String uri, Model model) throws JastorException {
		TreeProcedure obj = org.cdao.jastor.TreeProcedureImpl.createTreeProcedure(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of TreeProcedure.  Leaves the model unchanged.
	 * @param uri The uri of the TreeProcedure
	 * @param model the Jena Model.
	 */
	public static TreeProcedure getTreeProcedure(String uri, Model model) throws JastorException {
		return getTreeProcedure(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of TreeProcedure.  Leaves the model unchanged.
	 * @param resource The resource of the TreeProcedure
	 * @param model the Jena Model.
	 */
	public static TreeProcedure getTreeProcedure(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.TreeProcedure.class.hashCode()) + resource.toString();
		org.cdao.jastor.TreeProcedureImpl obj = (org.cdao.jastor.TreeProcedureImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.TreeProcedureImpl.getTreeProcedure(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TreeProcedure for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#TreeProcedure
	 * @param model the Jena Model
	 * @return a List of TreeProcedure
	 */
	public static java.util.List getAllTreeProcedure(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,TreeProcedure.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getTreeProcedure(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Categorical.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Categorical
	 * @param model the Jena Model.
	 */
	public static Categorical createCategorical(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CategoricalImpl.createCategorical(resource,model);
	}
	
	/**
	 * Create a new instance of Categorical.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Categorical
	 * @param model the Jena Model.
	 */
	public static Categorical createCategorical(String uri, Model model) throws JastorException {
		Categorical obj = org.cdao.jastor.CategoricalImpl.createCategorical(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Categorical.  Leaves the model unchanged.
	 * @param uri The uri of the Categorical
	 * @param model the Jena Model.
	 */
	public static Categorical getCategorical(String uri, Model model) throws JastorException {
		return getCategorical(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Categorical.  Leaves the model unchanged.
	 * @param resource The resource of the Categorical
	 * @param model the Jena Model.
	 */
	public static Categorical getCategorical(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Categorical.class.hashCode()) + resource.toString();
		org.cdao.jastor.CategoricalImpl obj = (org.cdao.jastor.CategoricalImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CategoricalImpl.getCategorical(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Categorical for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Categorical
	 * @param model the Jena Model
	 * @return a List of Categorical
	 */
	public static java.util.List getAllCategorical(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Categorical.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCategorical(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of DesoxiRibonucleotideResidueCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DesoxiRibonucleotideResidueCharacter
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidueCharacter createDesoxiRibonucleotideResidueCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.DesoxiRibonucleotideResidueCharacterImpl.createDesoxiRibonucleotideResidueCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of DesoxiRibonucleotideResidueCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DesoxiRibonucleotideResidueCharacter
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidueCharacter createDesoxiRibonucleotideResidueCharacter(String uri, Model model) throws JastorException {
		DesoxiRibonucleotideResidueCharacter obj = org.cdao.jastor.DesoxiRibonucleotideResidueCharacterImpl.createDesoxiRibonucleotideResidueCharacter(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of DesoxiRibonucleotideResidueCharacter.  Leaves the model unchanged.
	 * @param uri The uri of the DesoxiRibonucleotideResidueCharacter
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidueCharacter getDesoxiRibonucleotideResidueCharacter(String uri, Model model) throws JastorException {
		return getDesoxiRibonucleotideResidueCharacter(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of DesoxiRibonucleotideResidueCharacter.  Leaves the model unchanged.
	 * @param resource The resource of the DesoxiRibonucleotideResidueCharacter
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidueCharacter getDesoxiRibonucleotideResidueCharacter(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.DesoxiRibonucleotideResidueCharacter.class.hashCode()) + resource.toString();
		org.cdao.jastor.DesoxiRibonucleotideResidueCharacterImpl obj = (org.cdao.jastor.DesoxiRibonucleotideResidueCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.DesoxiRibonucleotideResidueCharacterImpl.getDesoxiRibonucleotideResidueCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DesoxiRibonucleotideResidueCharacter for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#DesoxiRibonucleotideResidueCharacter
	 * @param model the Jena Model
	 * @return a List of DesoxiRibonucleotideResidueCharacter
	 */
	public static java.util.List getAllDesoxiRibonucleotideResidueCharacter(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,DesoxiRibonucleotideResidueCharacter.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDesoxiRibonucleotideResidueCharacter(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CharacterStateDataMatrixAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CharacterStateDataMatrixAnnotation
	 * @param model the Jena Model.
	 */
	public static CharacterStateDataMatrixAnnotation createCharacterStateDataMatrixAnnotation(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CharacterStateDataMatrixAnnotationImpl.createCharacterStateDataMatrixAnnotation(resource,model);
	}
	
	/**
	 * Create a new instance of CharacterStateDataMatrixAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CharacterStateDataMatrixAnnotation
	 * @param model the Jena Model.
	 */
	public static CharacterStateDataMatrixAnnotation createCharacterStateDataMatrixAnnotation(String uri, Model model) throws JastorException {
		CharacterStateDataMatrixAnnotation obj = org.cdao.jastor.CharacterStateDataMatrixAnnotationImpl.createCharacterStateDataMatrixAnnotation(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CharacterStateDataMatrixAnnotation.  Leaves the model unchanged.
	 * @param uri The uri of the CharacterStateDataMatrixAnnotation
	 * @param model the Jena Model.
	 */
	public static CharacterStateDataMatrixAnnotation getCharacterStateDataMatrixAnnotation(String uri, Model model) throws JastorException {
		return getCharacterStateDataMatrixAnnotation(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CharacterStateDataMatrixAnnotation.  Leaves the model unchanged.
	 * @param resource The resource of the CharacterStateDataMatrixAnnotation
	 * @param model the Jena Model.
	 */
	public static CharacterStateDataMatrixAnnotation getCharacterStateDataMatrixAnnotation(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.CharacterStateDataMatrixAnnotation.class.hashCode()) + resource.toString();
		org.cdao.jastor.CharacterStateDataMatrixAnnotationImpl obj = (org.cdao.jastor.CharacterStateDataMatrixAnnotationImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CharacterStateDataMatrixAnnotationImpl.getCharacterStateDataMatrixAnnotation(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CharacterStateDataMatrixAnnotation for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#CharacterStateDataMatrixAnnotation
	 * @param model the Jena Model
	 * @return a List of CharacterStateDataMatrixAnnotation
	 */
	public static java.util.List getAllCharacterStateDataMatrixAnnotation(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CharacterStateDataMatrixAnnotation.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCharacterStateDataMatrixAnnotation(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ContinuousCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ContinuousCharacter
	 * @param model the Jena Model.
	 */
	public static ContinuousCharacter createContinuousCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.ContinuousCharacterImpl.createContinuousCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of ContinuousCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ContinuousCharacter
	 * @param model the Jena Model.
	 */
	public static ContinuousCharacter createContinuousCharacter(String uri, Model model) throws JastorException {
		ContinuousCharacter obj = org.cdao.jastor.ContinuousCharacterImpl.createContinuousCharacter(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ContinuousCharacter.  Leaves the model unchanged.
	 * @param uri The uri of the ContinuousCharacter
	 * @param model the Jena Model.
	 */
	public static ContinuousCharacter getContinuousCharacter(String uri, Model model) throws JastorException {
		return getContinuousCharacter(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ContinuousCharacter.  Leaves the model unchanged.
	 * @param resource The resource of the ContinuousCharacter
	 * @param model the Jena Model.
	 */
	public static ContinuousCharacter getContinuousCharacter(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.ContinuousCharacter.class.hashCode()) + resource.toString();
		org.cdao.jastor.ContinuousCharacterImpl obj = (org.cdao.jastor.ContinuousCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.ContinuousCharacterImpl.getContinuousCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ContinuousCharacter for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#ContinuousCharacter
	 * @param model the Jena Model
	 * @return a List of ContinuousCharacter
	 */
	public static java.util.List getAllContinuousCharacter(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ContinuousCharacter.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getContinuousCharacter(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of RibonucleotideResidue.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the RibonucleotideResidue
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidue createRibonucleotideResidue(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.RibonucleotideResidueImpl.createRibonucleotideResidue(resource,model);
	}
	
	/**
	 * Create a new instance of RibonucleotideResidue.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the RibonucleotideResidue
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidue createRibonucleotideResidue(String uri, Model model) throws JastorException {
		RibonucleotideResidue obj = org.cdao.jastor.RibonucleotideResidueImpl.createRibonucleotideResidue(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of RibonucleotideResidue.  Leaves the model unchanged.
	 * @param uri The uri of the RibonucleotideResidue
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidue getRibonucleotideResidue(String uri, Model model) throws JastorException {
		return getRibonucleotideResidue(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of RibonucleotideResidue.  Leaves the model unchanged.
	 * @param resource The resource of the RibonucleotideResidue
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidue getRibonucleotideResidue(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.RibonucleotideResidue.class.hashCode()) + resource.toString();
		org.cdao.jastor.RibonucleotideResidueImpl obj = (org.cdao.jastor.RibonucleotideResidueImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.RibonucleotideResidueImpl.getRibonucleotideResidue(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of RibonucleotideResidue for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#RibonucleotideResidue
	 * @param model the Jena Model
	 * @return a List of RibonucleotideResidue
	 */
	public static java.util.List getAllRibonucleotideResidue(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,RibonucleotideResidue.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getRibonucleotideResidue(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of RibonucleotideResidueStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the RibonucleotideResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidueStateDatum createRibonucleotideResidueStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.RibonucleotideResidueStateDatumImpl.createRibonucleotideResidueStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of RibonucleotideResidueStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the RibonucleotideResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidueStateDatum createRibonucleotideResidueStateDatum(String uri, Model model) throws JastorException {
		RibonucleotideResidueStateDatum obj = org.cdao.jastor.RibonucleotideResidueStateDatumImpl.createRibonucleotideResidueStateDatum(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of RibonucleotideResidueStateDatum.  Leaves the model unchanged.
	 * @param uri The uri of the RibonucleotideResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidueStateDatum getRibonucleotideResidueStateDatum(String uri, Model model) throws JastorException {
		return getRibonucleotideResidueStateDatum(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of RibonucleotideResidueStateDatum.  Leaves the model unchanged.
	 * @param resource The resource of the RibonucleotideResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidueStateDatum getRibonucleotideResidueStateDatum(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.RibonucleotideResidueStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jastor.RibonucleotideResidueStateDatumImpl obj = (org.cdao.jastor.RibonucleotideResidueStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.RibonucleotideResidueStateDatumImpl.getRibonucleotideResidueStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of RibonucleotideResidueStateDatum for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#RibonucleotideResidueStateDatum
	 * @param model the Jena Model
	 * @return a List of RibonucleotideResidueStateDatum
	 */
	public static java.util.List getAllRibonucleotideResidueStateDatum(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,RibonucleotideResidueStateDatum.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getRibonucleotideResidueStateDatum(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of GammaDistribution.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the GammaDistribution
	 * @param model the Jena Model.
	 */
	public static GammaDistribution createGammaDistribution(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.GammaDistributionImpl.createGammaDistribution(resource,model);
	}
	
	/**
	 * Create a new instance of GammaDistribution.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the GammaDistribution
	 * @param model the Jena Model.
	 */
	public static GammaDistribution createGammaDistribution(String uri, Model model) throws JastorException {
		GammaDistribution obj = org.cdao.jastor.GammaDistributionImpl.createGammaDistribution(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of GammaDistribution.  Leaves the model unchanged.
	 * @param uri The uri of the GammaDistribution
	 * @param model the Jena Model.
	 */
	public static GammaDistribution getGammaDistribution(String uri, Model model) throws JastorException {
		return getGammaDistribution(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of GammaDistribution.  Leaves the model unchanged.
	 * @param resource The resource of the GammaDistribution
	 * @param model the Jena Model.
	 */
	public static GammaDistribution getGammaDistribution(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.GammaDistribution.class.hashCode()) + resource.toString();
		org.cdao.jastor.GammaDistributionImpl obj = (org.cdao.jastor.GammaDistributionImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.GammaDistributionImpl.getGammaDistribution(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of GammaDistribution for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#GammaDistribution
	 * @param model the Jena Model
	 * @return a List of GammaDistribution
	 */
	public static java.util.List getAllGammaDistribution(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,GammaDistribution.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getGammaDistribution(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of MolecularStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MolecularStateDatum
	 * @param model the Jena Model.
	 */
	public static MolecularStateDatum createMolecularStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.MolecularStateDatumImpl.createMolecularStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of MolecularStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MolecularStateDatum
	 * @param model the Jena Model.
	 */
	public static MolecularStateDatum createMolecularStateDatum(String uri, Model model) throws JastorException {
		MolecularStateDatum obj = org.cdao.jastor.MolecularStateDatumImpl.createMolecularStateDatum(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of MolecularStateDatum.  Leaves the model unchanged.
	 * @param uri The uri of the MolecularStateDatum
	 * @param model the Jena Model.
	 */
	public static MolecularStateDatum getMolecularStateDatum(String uri, Model model) throws JastorException {
		return getMolecularStateDatum(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of MolecularStateDatum.  Leaves the model unchanged.
	 * @param resource The resource of the MolecularStateDatum
	 * @param model the Jena Model.
	 */
	public static MolecularStateDatum getMolecularStateDatum(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.MolecularStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jastor.MolecularStateDatumImpl obj = (org.cdao.jastor.MolecularStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.MolecularStateDatumImpl.getMolecularStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MolecularStateDatum for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#MolecularStateDatum
	 * @param model the Jena Model
	 * @return a List of MolecularStateDatum
	 */
	public static java.util.List getAllMolecularStateDatum(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,MolecularStateDatum.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMolecularStateDatum(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of SetOfCharacters.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SetOfCharacters
	 * @param model the Jena Model.
	 */
	public static SetOfCharacters createSetOfCharacters(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.SetOfCharactersImpl.createSetOfCharacters(resource,model);
	}
	
	/**
	 * Create a new instance of SetOfCharacters.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SetOfCharacters
	 * @param model the Jena Model.
	 */
	public static SetOfCharacters createSetOfCharacters(String uri, Model model) throws JastorException {
		SetOfCharacters obj = org.cdao.jastor.SetOfCharactersImpl.createSetOfCharacters(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of SetOfCharacters.  Leaves the model unchanged.
	 * @param uri The uri of the SetOfCharacters
	 * @param model the Jena Model.
	 */
	public static SetOfCharacters getSetOfCharacters(String uri, Model model) throws JastorException {
		return getSetOfCharacters(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of SetOfCharacters.  Leaves the model unchanged.
	 * @param resource The resource of the SetOfCharacters
	 * @param model the Jena Model.
	 */
	public static SetOfCharacters getSetOfCharacters(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.SetOfCharacters.class.hashCode()) + resource.toString();
		org.cdao.jastor.SetOfCharactersImpl obj = (org.cdao.jastor.SetOfCharactersImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.SetOfCharactersImpl.getSetOfCharacters(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SetOfCharacters for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#SetOfCharacters
	 * @param model the Jena Model
	 * @return a List of SetOfCharacters
	 */
	public static java.util.List getAllSetOfCharacters(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,SetOfCharacters.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getSetOfCharacters(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Kimura2Parameters.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Kimura2Parameters
	 * @param model the Jena Model.
	 */
	public static Kimura2Parameters createKimura2Parameters(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.Kimura2ParametersImpl.createKimura2Parameters(resource,model);
	}
	
	/**
	 * Create a new instance of Kimura2Parameters.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Kimura2Parameters
	 * @param model the Jena Model.
	 */
	public static Kimura2Parameters createKimura2Parameters(String uri, Model model) throws JastorException {
		Kimura2Parameters obj = org.cdao.jastor.Kimura2ParametersImpl.createKimura2Parameters(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Kimura2Parameters.  Leaves the model unchanged.
	 * @param uri The uri of the Kimura2Parameters
	 * @param model the Jena Model.
	 */
	public static Kimura2Parameters getKimura2Parameters(String uri, Model model) throws JastorException {
		return getKimura2Parameters(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Kimura2Parameters.  Leaves the model unchanged.
	 * @param resource The resource of the Kimura2Parameters
	 * @param model the Jena Model.
	 */
	public static Kimura2Parameters getKimura2Parameters(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Kimura2Parameters.class.hashCode()) + resource.toString();
		org.cdao.jastor.Kimura2ParametersImpl obj = (org.cdao.jastor.Kimura2ParametersImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.Kimura2ParametersImpl.getKimura2Parameters(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Kimura2Parameters for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Kimura2Parameters
	 * @param model the Jena Model
	 * @return a List of Kimura2Parameters
	 */
	public static java.util.List getAllKimura2Parameters(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Kimura2Parameters.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getKimura2Parameters(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of DirectedEdge.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DirectedEdge
	 * @param model the Jena Model.
	 */
	public static DirectedEdge createDirectedEdge(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.DirectedEdgeImpl.createDirectedEdge(resource,model);
	}
	
	/**
	 * Create a new instance of DirectedEdge.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DirectedEdge
	 * @param model the Jena Model.
	 */
	public static DirectedEdge createDirectedEdge(String uri, Model model) throws JastorException {
		DirectedEdge obj = org.cdao.jastor.DirectedEdgeImpl.createDirectedEdge(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of DirectedEdge.  Leaves the model unchanged.
	 * @param uri The uri of the DirectedEdge
	 * @param model the Jena Model.
	 */
	public static DirectedEdge getDirectedEdge(String uri, Model model) throws JastorException {
		return getDirectedEdge(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of DirectedEdge.  Leaves the model unchanged.
	 * @param resource The resource of the DirectedEdge
	 * @param model the Jena Model.
	 */
	public static DirectedEdge getDirectedEdge(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.DirectedEdge.class.hashCode()) + resource.toString();
		org.cdao.jastor.DirectedEdgeImpl obj = (org.cdao.jastor.DirectedEdgeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.DirectedEdgeImpl.getDirectedEdge(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DirectedEdge for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#DirectedEdge
	 * @param model the Jena Model
	 * @return a List of DirectedEdge
	 */
	public static java.util.List getAllDirectedEdge(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,DirectedEdge.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDirectedEdge(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ParsimonyMethod.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ParsimonyMethod
	 * @param model the Jena Model.
	 */
	public static ParsimonyMethod createParsimonyMethod(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.ParsimonyMethodImpl.createParsimonyMethod(resource,model);
	}
	
	/**
	 * Create a new instance of ParsimonyMethod.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ParsimonyMethod
	 * @param model the Jena Model.
	 */
	public static ParsimonyMethod createParsimonyMethod(String uri, Model model) throws JastorException {
		ParsimonyMethod obj = org.cdao.jastor.ParsimonyMethodImpl.createParsimonyMethod(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ParsimonyMethod.  Leaves the model unchanged.
	 * @param uri The uri of the ParsimonyMethod
	 * @param model the Jena Model.
	 */
	public static ParsimonyMethod getParsimonyMethod(String uri, Model model) throws JastorException {
		return getParsimonyMethod(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ParsimonyMethod.  Leaves the model unchanged.
	 * @param resource The resource of the ParsimonyMethod
	 * @param model the Jena Model.
	 */
	public static ParsimonyMethod getParsimonyMethod(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.ParsimonyMethod.class.hashCode()) + resource.toString();
		org.cdao.jastor.ParsimonyMethodImpl obj = (org.cdao.jastor.ParsimonyMethodImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.ParsimonyMethodImpl.getParsimonyMethod(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ParsimonyMethod for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#ParsimonyMethod
	 * @param model the Jena Model
	 * @return a List of ParsimonyMethod
	 */
	public static java.util.List getAllParsimonyMethod(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ParsimonyMethod.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getParsimonyMethod(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of TUAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TUAnnotation
	 * @param model the Jena Model.
	 */
	public static TUAnnotation createTUAnnotation(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.TUAnnotationImpl.createTUAnnotation(resource,model);
	}
	
	/**
	 * Create a new instance of TUAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TUAnnotation
	 * @param model the Jena Model.
	 */
	public static TUAnnotation createTUAnnotation(String uri, Model model) throws JastorException {
		TUAnnotation obj = org.cdao.jastor.TUAnnotationImpl.createTUAnnotation(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of TUAnnotation.  Leaves the model unchanged.
	 * @param uri The uri of the TUAnnotation
	 * @param model the Jena Model.
	 */
	public static TUAnnotation getTUAnnotation(String uri, Model model) throws JastorException {
		return getTUAnnotation(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of TUAnnotation.  Leaves the model unchanged.
	 * @param resource The resource of the TUAnnotation
	 * @param model the Jena Model.
	 */
	public static TUAnnotation getTUAnnotation(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.TUAnnotation.class.hashCode()) + resource.toString();
		org.cdao.jastor.TUAnnotationImpl obj = (org.cdao.jastor.TUAnnotationImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.TUAnnotationImpl.getTUAnnotation(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TUAnnotation for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#TUAnnotation
	 * @param model the Jena Model
	 * @return a List of TUAnnotation
	 */
	public static java.util.List getAllTUAnnotation(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,TUAnnotation.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getTUAnnotation(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Compound.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Compound
	 * @param model the Jena Model.
	 */
	public static Compound createCompound(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CompoundImpl.createCompound(resource,model);
	}
	
	/**
	 * Create a new instance of Compound.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Compound
	 * @param model the Jena Model.
	 */
	public static Compound createCompound(String uri, Model model) throws JastorException {
		Compound obj = org.cdao.jastor.CompoundImpl.createCompound(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Compound.  Leaves the model unchanged.
	 * @param uri The uri of the Compound
	 * @param model the Jena Model.
	 */
	public static Compound getCompound(String uri, Model model) throws JastorException {
		return getCompound(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Compound.  Leaves the model unchanged.
	 * @param resource The resource of the Compound
	 * @param model the Jena Model.
	 */
	public static Compound getCompound(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Compound.class.hashCode()) + resource.toString();
		org.cdao.jastor.CompoundImpl obj = (org.cdao.jastor.CompoundImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CompoundImpl.getCompound(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Compound for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Compound
	 * @param model the Jena Model
	 * @return a List of Compound
	 */
	public static java.util.List getAllCompound(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Compound.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCompound(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of UncertainStateDomain.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the UncertainStateDomain
	 * @param model the Jena Model.
	 */
	public static UncertainStateDomain createUncertainStateDomain(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.UncertainStateDomainImpl.createUncertainStateDomain(resource,model);
	}
	
	/**
	 * Create a new instance of UncertainStateDomain.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the UncertainStateDomain
	 * @param model the Jena Model.
	 */
	public static UncertainStateDomain createUncertainStateDomain(String uri, Model model) throws JastorException {
		UncertainStateDomain obj = org.cdao.jastor.UncertainStateDomainImpl.createUncertainStateDomain(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of UncertainStateDomain.  Leaves the model unchanged.
	 * @param uri The uri of the UncertainStateDomain
	 * @param model the Jena Model.
	 */
	public static UncertainStateDomain getUncertainStateDomain(String uri, Model model) throws JastorException {
		return getUncertainStateDomain(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of UncertainStateDomain.  Leaves the model unchanged.
	 * @param resource The resource of the UncertainStateDomain
	 * @param model the Jena Model.
	 */
	public static UncertainStateDomain getUncertainStateDomain(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.UncertainStateDomain.class.hashCode()) + resource.toString();
		org.cdao.jastor.UncertainStateDomainImpl obj = (org.cdao.jastor.UncertainStateDomainImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.UncertainStateDomainImpl.getUncertainStateDomain(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of UncertainStateDomain for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#UncertainStateDomain
	 * @param model the Jena Model
	 * @return a List of UncertainStateDomain
	 */
	public static java.util.List getAllUncertainStateDomain(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,UncertainStateDomain.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getUncertainStateDomain(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CoordinateRange.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CoordinateRange
	 * @param model the Jena Model.
	 */
	public static CoordinateRange createCoordinateRange(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CoordinateRangeImpl.createCoordinateRange(resource,model);
	}
	
	/**
	 * Create a new instance of CoordinateRange.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CoordinateRange
	 * @param model the Jena Model.
	 */
	public static CoordinateRange createCoordinateRange(String uri, Model model) throws JastorException {
		CoordinateRange obj = org.cdao.jastor.CoordinateRangeImpl.createCoordinateRange(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CoordinateRange.  Leaves the model unchanged.
	 * @param uri The uri of the CoordinateRange
	 * @param model the Jena Model.
	 */
	public static CoordinateRange getCoordinateRange(String uri, Model model) throws JastorException {
		return getCoordinateRange(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CoordinateRange.  Leaves the model unchanged.
	 * @param resource The resource of the CoordinateRange
	 * @param model the Jena Model.
	 */
	public static CoordinateRange getCoordinateRange(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.CoordinateRange.class.hashCode()) + resource.toString();
		org.cdao.jastor.CoordinateRangeImpl obj = (org.cdao.jastor.CoordinateRangeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CoordinateRangeImpl.getCoordinateRange(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CoordinateRange for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#CoordinateRange
	 * @param model the Jena Model
	 * @return a List of CoordinateRange
	 */
	public static java.util.List getAllCoordinateRange(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CoordinateRange.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCoordinateRange(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of SetOfThings.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SetOfThings
	 * @param model the Jena Model.
	 */
	public static SetOfThings createSetOfThings(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.SetOfThingsImpl.createSetOfThings(resource,model);
	}
	
	/**
	 * Create a new instance of SetOfThings.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SetOfThings
	 * @param model the Jena Model.
	 */
	public static SetOfThings createSetOfThings(String uri, Model model) throws JastorException {
		SetOfThings obj = org.cdao.jastor.SetOfThingsImpl.createSetOfThings(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of SetOfThings.  Leaves the model unchanged.
	 * @param uri The uri of the SetOfThings
	 * @param model the Jena Model.
	 */
	public static SetOfThings getSetOfThings(String uri, Model model) throws JastorException {
		return getSetOfThings(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of SetOfThings.  Leaves the model unchanged.
	 * @param resource The resource of the SetOfThings
	 * @param model the Jena Model.
	 */
	public static SetOfThings getSetOfThings(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.SetOfThings.class.hashCode()) + resource.toString();
		org.cdao.jastor.SetOfThingsImpl obj = (org.cdao.jastor.SetOfThingsImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.SetOfThingsImpl.getSetOfThings(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SetOfThings for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#SetOfThings
	 * @param model the Jena Model
	 * @return a List of SetOfThings
	 */
	public static java.util.List getAllSetOfThings(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,SetOfThings.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getSetOfThings(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CategoricalStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CategoricalStateDatum
	 * @param model the Jena Model.
	 */
	public static CategoricalStateDatum createCategoricalStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CategoricalStateDatumImpl.createCategoricalStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of CategoricalStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CategoricalStateDatum
	 * @param model the Jena Model.
	 */
	public static CategoricalStateDatum createCategoricalStateDatum(String uri, Model model) throws JastorException {
		CategoricalStateDatum obj = org.cdao.jastor.CategoricalStateDatumImpl.createCategoricalStateDatum(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CategoricalStateDatum.  Leaves the model unchanged.
	 * @param uri The uri of the CategoricalStateDatum
	 * @param model the Jena Model.
	 */
	public static CategoricalStateDatum getCategoricalStateDatum(String uri, Model model) throws JastorException {
		return getCategoricalStateDatum(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CategoricalStateDatum.  Leaves the model unchanged.
	 * @param resource The resource of the CategoricalStateDatum
	 * @param model the Jena Model.
	 */
	public static CategoricalStateDatum getCategoricalStateDatum(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.CategoricalStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jastor.CategoricalStateDatumImpl obj = (org.cdao.jastor.CategoricalStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CategoricalStateDatumImpl.getCategoricalStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CategoricalStateDatum for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#CategoricalStateDatum
	 * @param model the Jena Model
	 * @return a List of CategoricalStateDatum
	 */
	public static java.util.List getAllCategoricalStateDatum(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CategoricalStateDatum.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCategoricalStateDatum(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Generic__State.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Generic__State
	 * @param model the Jena Model.
	 */
	public static Generic__State createGeneric__State(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.Generic__StateImpl.createGeneric__State(resource,model);
	}
	
	/**
	 * Create a new instance of Generic__State.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Generic__State
	 * @param model the Jena Model.
	 */
	public static Generic__State createGeneric__State(String uri, Model model) throws JastorException {
		Generic__State obj = org.cdao.jastor.Generic__StateImpl.createGeneric__State(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Generic__State.  Leaves the model unchanged.
	 * @param uri The uri of the Generic__State
	 * @param model the Jena Model.
	 */
	public static Generic__State getGeneric__State(String uri, Model model) throws JastorException {
		return getGeneric__State(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Generic__State.  Leaves the model unchanged.
	 * @param resource The resource of the Generic__State
	 * @param model the Jena Model.
	 */
	public static Generic__State getGeneric__State(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Generic__State.class.hashCode()) + resource.toString();
		org.cdao.jastor.Generic__StateImpl obj = (org.cdao.jastor.Generic__StateImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.Generic__StateImpl.getGeneric__State(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Generic__State for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Generic_State
	 * @param model the Jena Model
	 * @return a List of Generic__State
	 */
	public static java.util.List getAllGeneric__State(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Generic__State.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getGeneric__State(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CompoundCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CompoundCharacter
	 * @param model the Jena Model.
	 */
	public static CompoundCharacter createCompoundCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CompoundCharacterImpl.createCompoundCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of CompoundCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CompoundCharacter
	 * @param model the Jena Model.
	 */
	public static CompoundCharacter createCompoundCharacter(String uri, Model model) throws JastorException {
		CompoundCharacter obj = org.cdao.jastor.CompoundCharacterImpl.createCompoundCharacter(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CompoundCharacter.  Leaves the model unchanged.
	 * @param uri The uri of the CompoundCharacter
	 * @param model the Jena Model.
	 */
	public static CompoundCharacter getCompoundCharacter(String uri, Model model) throws JastorException {
		return getCompoundCharacter(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CompoundCharacter.  Leaves the model unchanged.
	 * @param resource The resource of the CompoundCharacter
	 * @param model the Jena Model.
	 */
	public static CompoundCharacter getCompoundCharacter(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.CompoundCharacter.class.hashCode()) + resource.toString();
		org.cdao.jastor.CompoundCharacterImpl obj = (org.cdao.jastor.CompoundCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CompoundCharacterImpl.getCompoundCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CompoundCharacter for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#CompoundCharacter
	 * @param model the Jena Model
	 * @return a List of CompoundCharacter
	 */
	public static java.util.List getAllCompoundCharacter(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CompoundCharacter.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCompoundCharacter(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of AminoAcid.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AminoAcid
	 * @param model the Jena Model.
	 */
	public static AminoAcid createAminoAcid(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.AminoAcidImpl.createAminoAcid(resource,model);
	}
	
	/**
	 * Create a new instance of AminoAcid.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AminoAcid
	 * @param model the Jena Model.
	 */
	public static AminoAcid createAminoAcid(String uri, Model model) throws JastorException {
		AminoAcid obj = org.cdao.jastor.AminoAcidImpl.createAminoAcid(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of AminoAcid.  Leaves the model unchanged.
	 * @param uri The uri of the AminoAcid
	 * @param model the Jena Model.
	 */
	public static AminoAcid getAminoAcid(String uri, Model model) throws JastorException {
		return getAminoAcid(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of AminoAcid.  Leaves the model unchanged.
	 * @param resource The resource of the AminoAcid
	 * @param model the Jena Model.
	 */
	public static AminoAcid getAminoAcid(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.AminoAcid.class.hashCode()) + resource.toString();
		org.cdao.jastor.AminoAcidImpl obj = (org.cdao.jastor.AminoAcidImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.AminoAcidImpl.getAminoAcid(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of AminoAcid for every resource in the model with rdf:Type http://www.co-ode.org/ontologies/amino-acid/2005/10/11/amino-acid.owl#AminoAcid
	 * @param model the Jena Model
	 * @return a List of AminoAcid
	 */
	public static java.util.List getAllAminoAcid(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,AminoAcid.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAminoAcid(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of StandardCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the StandardCharacter
	 * @param model the Jena Model.
	 */
	public static StandardCharacter createStandardCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.StandardCharacterImpl.createStandardCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of StandardCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the StandardCharacter
	 * @param model the Jena Model.
	 */
	public static StandardCharacter createStandardCharacter(String uri, Model model) throws JastorException {
		StandardCharacter obj = org.cdao.jastor.StandardCharacterImpl.createStandardCharacter(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of StandardCharacter.  Leaves the model unchanged.
	 * @param uri The uri of the StandardCharacter
	 * @param model the Jena Model.
	 */
	public static StandardCharacter getStandardCharacter(String uri, Model model) throws JastorException {
		return getStandardCharacter(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of StandardCharacter.  Leaves the model unchanged.
	 * @param resource The resource of the StandardCharacter
	 * @param model the Jena Model.
	 */
	public static StandardCharacter getStandardCharacter(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.StandardCharacter.class.hashCode()) + resource.toString();
		org.cdao.jastor.StandardCharacterImpl obj = (org.cdao.jastor.StandardCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.StandardCharacterImpl.getStandardCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of StandardCharacter for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#StandardCharacter
	 * @param model the Jena Model
	 * @return a List of StandardCharacter
	 */
	public static java.util.List getAllStandardCharacter(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,StandardCharacter.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getStandardCharacter(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of TaxonomicLink.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TaxonomicLink
	 * @param model the Jena Model.
	 */
	public static TaxonomicLink createTaxonomicLink(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.TaxonomicLinkImpl.createTaxonomicLink(resource,model);
	}
	
	/**
	 * Create a new instance of TaxonomicLink.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TaxonomicLink
	 * @param model the Jena Model.
	 */
	public static TaxonomicLink createTaxonomicLink(String uri, Model model) throws JastorException {
		TaxonomicLink obj = org.cdao.jastor.TaxonomicLinkImpl.createTaxonomicLink(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of TaxonomicLink.  Leaves the model unchanged.
	 * @param uri The uri of the TaxonomicLink
	 * @param model the Jena Model.
	 */
	public static TaxonomicLink getTaxonomicLink(String uri, Model model) throws JastorException {
		return getTaxonomicLink(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of TaxonomicLink.  Leaves the model unchanged.
	 * @param resource The resource of the TaxonomicLink
	 * @param model the Jena Model.
	 */
	public static TaxonomicLink getTaxonomicLink(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.TaxonomicLink.class.hashCode()) + resource.toString();
		org.cdao.jastor.TaxonomicLinkImpl obj = (org.cdao.jastor.TaxonomicLinkImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.TaxonomicLinkImpl.getTaxonomicLink(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TaxonomicLink for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#TaxonomicLink
	 * @param model the Jena Model
	 * @return a List of TaxonomicLink
	 */
	public static java.util.List getAllTaxonomicLink(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,TaxonomicLink.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getTaxonomicLink(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Branch.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Branch
	 * @param model the Jena Model.
	 */
	public static Branch createBranch(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.BranchImpl.createBranch(resource,model);
	}
	
	/**
	 * Create a new instance of Branch.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Branch
	 * @param model the Jena Model.
	 */
	public static Branch createBranch(String uri, Model model) throws JastorException {
		Branch obj = org.cdao.jastor.BranchImpl.createBranch(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Branch.  Leaves the model unchanged.
	 * @param uri The uri of the Branch
	 * @param model the Jena Model.
	 */
	public static Branch getBranch(String uri, Model model) throws JastorException {
		return getBranch(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Branch.  Leaves the model unchanged.
	 * @param resource The resource of the Branch
	 * @param model the Jena Model.
	 */
	public static Branch getBranch(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Branch.class.hashCode()) + resource.toString();
		org.cdao.jastor.BranchImpl obj = (org.cdao.jastor.BranchImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.BranchImpl.getBranch(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Branch for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Branch
	 * @param model the Jena Model
	 * @return a List of Branch
	 */
	public static java.util.List getAllBranch(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Branch.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getBranch(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Standard.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Standard
	 * @param model the Jena Model.
	 */
	public static Standard createStandard(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.StandardImpl.createStandard(resource,model);
	}
	
	/**
	 * Create a new instance of Standard.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Standard
	 * @param model the Jena Model.
	 */
	public static Standard createStandard(String uri, Model model) throws JastorException {
		Standard obj = org.cdao.jastor.StandardImpl.createStandard(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Standard.  Leaves the model unchanged.
	 * @param uri The uri of the Standard
	 * @param model the Jena Model.
	 */
	public static Standard getStandard(String uri, Model model) throws JastorException {
		return getStandard(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Standard.  Leaves the model unchanged.
	 * @param resource The resource of the Standard
	 * @param model the Jena Model.
	 */
	public static Standard getStandard(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Standard.class.hashCode()) + resource.toString();
		org.cdao.jastor.StandardImpl obj = (org.cdao.jastor.StandardImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.StandardImpl.getStandard(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Standard for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Standard
	 * @param model the Jena Model
	 * @return a List of Standard
	 */
	public static java.util.List getAllStandard(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Standard.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getStandard(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CharacterStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CharacterStateDatum
	 * @param model the Jena Model.
	 */
	public static CharacterStateDatum createCharacterStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CharacterStateDatumImpl.createCharacterStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of CharacterStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CharacterStateDatum
	 * @param model the Jena Model.
	 */
	public static CharacterStateDatum createCharacterStateDatum(String uri, Model model) throws JastorException {
		CharacterStateDatum obj = org.cdao.jastor.CharacterStateDatumImpl.createCharacterStateDatum(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CharacterStateDatum.  Leaves the model unchanged.
	 * @param uri The uri of the CharacterStateDatum
	 * @param model the Jena Model.
	 */
	public static CharacterStateDatum getCharacterStateDatum(String uri, Model model) throws JastorException {
		return getCharacterStateDatum(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CharacterStateDatum.  Leaves the model unchanged.
	 * @param resource The resource of the CharacterStateDatum
	 * @param model the Jena Model.
	 */
	public static CharacterStateDatum getCharacterStateDatum(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.CharacterStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jastor.CharacterStateDatumImpl obj = (org.cdao.jastor.CharacterStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CharacterStateDatumImpl.getCharacterStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CharacterStateDatum for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#CharacterStateDatum
	 * @param model the Jena Model
	 * @return a List of CharacterStateDatum
	 */
	public static java.util.List getAllCharacterStateDatum(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CharacterStateDatum.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCharacterStateDatum(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ContinuousStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ContinuousStateDatum
	 * @param model the Jena Model.
	 */
	public static ContinuousStateDatum createContinuousStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.ContinuousStateDatumImpl.createContinuousStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of ContinuousStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ContinuousStateDatum
	 * @param model the Jena Model.
	 */
	public static ContinuousStateDatum createContinuousStateDatum(String uri, Model model) throws JastorException {
		ContinuousStateDatum obj = org.cdao.jastor.ContinuousStateDatumImpl.createContinuousStateDatum(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ContinuousStateDatum.  Leaves the model unchanged.
	 * @param uri The uri of the ContinuousStateDatum
	 * @param model the Jena Model.
	 */
	public static ContinuousStateDatum getContinuousStateDatum(String uri, Model model) throws JastorException {
		return getContinuousStateDatum(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ContinuousStateDatum.  Leaves the model unchanged.
	 * @param resource The resource of the ContinuousStateDatum
	 * @param model the Jena Model.
	 */
	public static ContinuousStateDatum getContinuousStateDatum(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.ContinuousStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jastor.ContinuousStateDatumImpl obj = (org.cdao.jastor.ContinuousStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.ContinuousStateDatumImpl.getContinuousStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ContinuousStateDatum for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#ContinuousStateDatum
	 * @param model the Jena Model
	 * @return a List of ContinuousStateDatum
	 */
	public static java.util.List getAllContinuousStateDatum(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ContinuousStateDatum.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getContinuousStateDatum(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of UnrootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the UnrootedTree
	 * @param model the Jena Model.
	 */
	public static UnrootedTree createUnrootedTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.UnrootedTreeImpl.createUnrootedTree(resource,model);
	}
	
	/**
	 * Create a new instance of UnrootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the UnrootedTree
	 * @param model the Jena Model.
	 */
	public static UnrootedTree createUnrootedTree(String uri, Model model) throws JastorException {
		UnrootedTree obj = org.cdao.jastor.UnrootedTreeImpl.createUnrootedTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of UnrootedTree.  Leaves the model unchanged.
	 * @param uri The uri of the UnrootedTree
	 * @param model the Jena Model.
	 */
	public static UnrootedTree getUnrootedTree(String uri, Model model) throws JastorException {
		return getUnrootedTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of UnrootedTree.  Leaves the model unchanged.
	 * @param resource The resource of the UnrootedTree
	 * @param model the Jena Model.
	 */
	public static UnrootedTree getUnrootedTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.UnrootedTree.class.hashCode()) + resource.toString();
		org.cdao.jastor.UnrootedTreeImpl obj = (org.cdao.jastor.UnrootedTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.UnrootedTreeImpl.getUnrootedTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of UnrootedTree for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#UnrootedTree
	 * @param model the Jena Model
	 * @return a List of UnrootedTree
	 */
	public static java.util.List getAllUnrootedTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,UnrootedTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getUnrootedTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CharacterStateDataMatrix.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CharacterStateDataMatrix
	 * @param model the Jena Model.
	 */
	public static CharacterStateDataMatrix createCharacterStateDataMatrix(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CharacterStateDataMatrixImpl.createCharacterStateDataMatrix(resource,model);
	}
	
	/**
	 * Create a new instance of CharacterStateDataMatrix.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CharacterStateDataMatrix
	 * @param model the Jena Model.
	 */
	public static CharacterStateDataMatrix createCharacterStateDataMatrix(String uri, Model model) throws JastorException {
		CharacterStateDataMatrix obj = org.cdao.jastor.CharacterStateDataMatrixImpl.createCharacterStateDataMatrix(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CharacterStateDataMatrix.  Leaves the model unchanged.
	 * @param uri The uri of the CharacterStateDataMatrix
	 * @param model the Jena Model.
	 */
	public static CharacterStateDataMatrix getCharacterStateDataMatrix(String uri, Model model) throws JastorException {
		return getCharacterStateDataMatrix(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CharacterStateDataMatrix.  Leaves the model unchanged.
	 * @param resource The resource of the CharacterStateDataMatrix
	 * @param model the Jena Model.
	 */
	public static CharacterStateDataMatrix getCharacterStateDataMatrix(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.CharacterStateDataMatrix.class.hashCode()) + resource.toString();
		org.cdao.jastor.CharacterStateDataMatrixImpl obj = (org.cdao.jastor.CharacterStateDataMatrixImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CharacterStateDataMatrixImpl.getCharacterStateDataMatrix(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CharacterStateDataMatrix for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#CharacterStateDataMatrix
	 * @param model the Jena Model
	 * @return a List of CharacterStateDataMatrix
	 */
	public static java.util.List getAllCharacterStateDataMatrix(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CharacterStateDataMatrix.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCharacterStateDataMatrix(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CoordinateSystem.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CoordinateSystem
	 * @param model the Jena Model.
	 */
	public static CoordinateSystem createCoordinateSystem(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CoordinateSystemImpl.createCoordinateSystem(resource,model);
	}
	
	/**
	 * Create a new instance of CoordinateSystem.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CoordinateSystem
	 * @param model the Jena Model.
	 */
	public static CoordinateSystem createCoordinateSystem(String uri, Model model) throws JastorException {
		CoordinateSystem obj = org.cdao.jastor.CoordinateSystemImpl.createCoordinateSystem(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CoordinateSystem.  Leaves the model unchanged.
	 * @param uri The uri of the CoordinateSystem
	 * @param model the Jena Model.
	 */
	public static CoordinateSystem getCoordinateSystem(String uri, Model model) throws JastorException {
		return getCoordinateSystem(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CoordinateSystem.  Leaves the model unchanged.
	 * @param resource The resource of the CoordinateSystem
	 * @param model the Jena Model.
	 */
	public static CoordinateSystem getCoordinateSystem(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.CoordinateSystem.class.hashCode()) + resource.toString();
		org.cdao.jastor.CoordinateSystemImpl obj = (org.cdao.jastor.CoordinateSystemImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CoordinateSystemImpl.getCoordinateSystem(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CoordinateSystem for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#CoordinateSystem
	 * @param model the Jena Model
	 * @return a List of CoordinateSystem
	 */
	public static java.util.List getAllCoordinateSystem(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CoordinateSystem.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCoordinateSystem(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of TU.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TU
	 * @param model the Jena Model.
	 */
	public static TU createTU(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.TUImpl.createTU(resource,model);
	}
	
	/**
	 * Create a new instance of TU.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TU
	 * @param model the Jena Model.
	 */
	public static TU createTU(String uri, Model model) throws JastorException {
		TU obj = org.cdao.jastor.TUImpl.createTU(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of TU.  Leaves the model unchanged.
	 * @param uri The uri of the TU
	 * @param model the Jena Model.
	 */
	public static TU getTU(String uri, Model model) throws JastorException {
		return getTU(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of TU.  Leaves the model unchanged.
	 * @param resource The resource of the TU
	 * @param model the Jena Model.
	 */
	public static TU getTU(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.TU.class.hashCode()) + resource.toString();
		org.cdao.jastor.TUImpl obj = (org.cdao.jastor.TUImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.TUImpl.getTU(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TU for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#TU
	 * @param model the Jena Model
	 * @return a List of TU
	 */
	public static java.util.List getAllTU(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,TU.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getTU(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Node.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Node
	 * @param model the Jena Model.
	 */
	public static Node createNode(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.NodeImpl.createNode(resource,model);
	}
	
	/**
	 * Create a new instance of Node.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Node
	 * @param model the Jena Model.
	 */
	public static Node createNode(String uri, Model model) throws JastorException {
		Node obj = org.cdao.jastor.NodeImpl.createNode(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Node.  Leaves the model unchanged.
	 * @param uri The uri of the Node
	 * @param model the Jena Model.
	 */
	public static Node getNode(String uri, Model model) throws JastorException {
		return getNode(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Node.  Leaves the model unchanged.
	 * @param resource The resource of the Node
	 * @param model the Jena Model.
	 */
	public static Node getNode(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.Node.class.hashCode()) + resource.toString();
		org.cdao.jastor.NodeImpl obj = (org.cdao.jastor.NodeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.NodeImpl.getNode(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Node for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#Node
	 * @param model the Jena Model
	 * @return a List of Node
	 */
	public static java.util.List getAllNode(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Node.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getNode(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of StandardStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the StandardStateDatum
	 * @param model the Jena Model.
	 */
	public static StandardStateDatum createStandardStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.StandardStateDatumImpl.createStandardStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of StandardStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the StandardStateDatum
	 * @param model the Jena Model.
	 */
	public static StandardStateDatum createStandardStateDatum(String uri, Model model) throws JastorException {
		StandardStateDatum obj = org.cdao.jastor.StandardStateDatumImpl.createStandardStateDatum(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of StandardStateDatum.  Leaves the model unchanged.
	 * @param uri The uri of the StandardStateDatum
	 * @param model the Jena Model.
	 */
	public static StandardStateDatum getStandardStateDatum(String uri, Model model) throws JastorException {
		return getStandardStateDatum(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of StandardStateDatum.  Leaves the model unchanged.
	 * @param resource The resource of the StandardStateDatum
	 * @param model the Jena Model.
	 */
	public static StandardStateDatum getStandardStateDatum(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.StandardStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jastor.StandardStateDatumImpl obj = (org.cdao.jastor.StandardStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.StandardStateDatumImpl.getStandardStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of StandardStateDatum for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#StandardStateDatum
	 * @param model the Jena Model
	 * @return a List of StandardStateDatum
	 */
	public static java.util.List getAllStandardStateDatum(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,StandardStateDatum.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getStandardStateDatum(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of RibonucleotideResidueCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the RibonucleotideResidueCharacter
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidueCharacter createRibonucleotideResidueCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.RibonucleotideResidueCharacterImpl.createRibonucleotideResidueCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of RibonucleotideResidueCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the RibonucleotideResidueCharacter
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidueCharacter createRibonucleotideResidueCharacter(String uri, Model model) throws JastorException {
		RibonucleotideResidueCharacter obj = org.cdao.jastor.RibonucleotideResidueCharacterImpl.createRibonucleotideResidueCharacter(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of RibonucleotideResidueCharacter.  Leaves the model unchanged.
	 * @param uri The uri of the RibonucleotideResidueCharacter
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidueCharacter getRibonucleotideResidueCharacter(String uri, Model model) throws JastorException {
		return getRibonucleotideResidueCharacter(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of RibonucleotideResidueCharacter.  Leaves the model unchanged.
	 * @param resource The resource of the RibonucleotideResidueCharacter
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidueCharacter getRibonucleotideResidueCharacter(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.RibonucleotideResidueCharacter.class.hashCode()) + resource.toString();
		org.cdao.jastor.RibonucleotideResidueCharacterImpl obj = (org.cdao.jastor.RibonucleotideResidueCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.RibonucleotideResidueCharacterImpl.getRibonucleotideResidueCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of RibonucleotideResidueCharacter for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#RibonucleotideResidueCharacter
	 * @param model the Jena Model
	 * @return a List of RibonucleotideResidueCharacter
	 */
	public static java.util.List getAllRibonucleotideResidueCharacter(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,RibonucleotideResidueCharacter.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getRibonucleotideResidueCharacter(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CDAOAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CDAOAnnotation
	 * @param model the Jena Model.
	 */
	public static CDAOAnnotation createCDAOAnnotation(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CDAOAnnotationImpl.createCDAOAnnotation(resource,model);
	}
	
	/**
	 * Create a new instance of CDAOAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CDAOAnnotation
	 * @param model the Jena Model.
	 */
	public static CDAOAnnotation createCDAOAnnotation(String uri, Model model) throws JastorException {
		CDAOAnnotation obj = org.cdao.jastor.CDAOAnnotationImpl.createCDAOAnnotation(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CDAOAnnotation.  Leaves the model unchanged.
	 * @param uri The uri of the CDAOAnnotation
	 * @param model the Jena Model.
	 */
	public static CDAOAnnotation getCDAOAnnotation(String uri, Model model) throws JastorException {
		return getCDAOAnnotation(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CDAOAnnotation.  Leaves the model unchanged.
	 * @param resource The resource of the CDAOAnnotation
	 * @param model the Jena Model.
	 */
	public static CDAOAnnotation getCDAOAnnotation(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.CDAOAnnotation.class.hashCode()) + resource.toString();
		org.cdao.jastor.CDAOAnnotationImpl obj = (org.cdao.jastor.CDAOAnnotationImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CDAOAnnotationImpl.getCDAOAnnotation(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CDAOAnnotation for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#CDAOAnnotation
	 * @param model the Jena Model
	 * @return a List of CDAOAnnotation
	 */
	public static java.util.List getAllCDAOAnnotation(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CDAOAnnotation.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCDAOAnnotation(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of TerminalNode.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TerminalNode
	 * @param model the Jena Model.
	 */
	public static TerminalNode createTerminalNode(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.TerminalNodeImpl.createTerminalNode(resource,model);
	}
	
	/**
	 * Create a new instance of TerminalNode.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TerminalNode
	 * @param model the Jena Model.
	 */
	public static TerminalNode createTerminalNode(String uri, Model model) throws JastorException {
		TerminalNode obj = org.cdao.jastor.TerminalNodeImpl.createTerminalNode(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of TerminalNode.  Leaves the model unchanged.
	 * @param uri The uri of the TerminalNode
	 * @param model the Jena Model.
	 */
	public static TerminalNode getTerminalNode(String uri, Model model) throws JastorException {
		return getTerminalNode(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of TerminalNode.  Leaves the model unchanged.
	 * @param resource The resource of the TerminalNode
	 * @param model the Jena Model.
	 */
	public static TerminalNode getTerminalNode(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.TerminalNode.class.hashCode()) + resource.toString();
		org.cdao.jastor.TerminalNodeImpl obj = (org.cdao.jastor.TerminalNodeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.TerminalNodeImpl.getTerminalNode(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TerminalNode for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#TerminalNode
	 * @param model the Jena Model
	 * @return a List of TerminalNode
	 */
	public static java.util.List getAllTerminalNode(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,TerminalNode.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getTerminalNode(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CommonAncestralNode.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CommonAncestralNode
	 * @param model the Jena Model.
	 */
	public static CommonAncestralNode createCommonAncestralNode(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.CommonAncestralNodeImpl.createCommonAncestralNode(resource,model);
	}
	
	/**
	 * Create a new instance of CommonAncestralNode.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CommonAncestralNode
	 * @param model the Jena Model.
	 */
	public static CommonAncestralNode createCommonAncestralNode(String uri, Model model) throws JastorException {
		CommonAncestralNode obj = org.cdao.jastor.CommonAncestralNodeImpl.createCommonAncestralNode(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CommonAncestralNode.  Leaves the model unchanged.
	 * @param uri The uri of the CommonAncestralNode
	 * @param model the Jena Model.
	 */
	public static CommonAncestralNode getCommonAncestralNode(String uri, Model model) throws JastorException {
		return getCommonAncestralNode(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CommonAncestralNode.  Leaves the model unchanged.
	 * @param resource The resource of the CommonAncestralNode
	 * @param model the Jena Model.
	 */
	public static CommonAncestralNode getCommonAncestralNode(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.CommonAncestralNode.class.hashCode()) + resource.toString();
		org.cdao.jastor.CommonAncestralNodeImpl obj = (org.cdao.jastor.CommonAncestralNodeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.CommonAncestralNodeImpl.getCommonAncestralNode(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CommonAncestralNode for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#CommonAncestralNode
	 * @param model the Jena Model
	 * @return a List of CommonAncestralNode
	 */
	public static java.util.List getAllCommonAncestralNode(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CommonAncestralNode.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCommonAncestralNode(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of PolymorphicStateDomain.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the PolymorphicStateDomain
	 * @param model the Jena Model.
	 */
	public static PolymorphicStateDomain createPolymorphicStateDomain(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.PolymorphicStateDomainImpl.createPolymorphicStateDomain(resource,model);
	}
	
	/**
	 * Create a new instance of PolymorphicStateDomain.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the PolymorphicStateDomain
	 * @param model the Jena Model.
	 */
	public static PolymorphicStateDomain createPolymorphicStateDomain(String uri, Model model) throws JastorException {
		PolymorphicStateDomain obj = org.cdao.jastor.PolymorphicStateDomainImpl.createPolymorphicStateDomain(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of PolymorphicStateDomain.  Leaves the model unchanged.
	 * @param uri The uri of the PolymorphicStateDomain
	 * @param model the Jena Model.
	 */
	public static PolymorphicStateDomain getPolymorphicStateDomain(String uri, Model model) throws JastorException {
		return getPolymorphicStateDomain(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of PolymorphicStateDomain.  Leaves the model unchanged.
	 * @param resource The resource of the PolymorphicStateDomain
	 * @param model the Jena Model.
	 */
	public static PolymorphicStateDomain getPolymorphicStateDomain(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.PolymorphicStateDomain.class.hashCode()) + resource.toString();
		org.cdao.jastor.PolymorphicStateDomainImpl obj = (org.cdao.jastor.PolymorphicStateDomainImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.PolymorphicStateDomainImpl.getPolymorphicStateDomain(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of PolymorphicStateDomain for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#PolymorphicStateDomain
	 * @param model the Jena Model
	 * @return a List of PolymorphicStateDomain
	 */
	public static java.util.List getAllPolymorphicStateDomain(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,PolymorphicStateDomain.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPolymorphicStateDomain(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of AlignmentProcedure.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AlignmentProcedure
	 * @param model the Jena Model.
	 */
	public static AlignmentProcedure createAlignmentProcedure(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.AlignmentProcedureImpl.createAlignmentProcedure(resource,model);
	}
	
	/**
	 * Create a new instance of AlignmentProcedure.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AlignmentProcedure
	 * @param model the Jena Model.
	 */
	public static AlignmentProcedure createAlignmentProcedure(String uri, Model model) throws JastorException {
		AlignmentProcedure obj = org.cdao.jastor.AlignmentProcedureImpl.createAlignmentProcedure(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of AlignmentProcedure.  Leaves the model unchanged.
	 * @param uri The uri of the AlignmentProcedure
	 * @param model the Jena Model.
	 */
	public static AlignmentProcedure getAlignmentProcedure(String uri, Model model) throws JastorException {
		return getAlignmentProcedure(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of AlignmentProcedure.  Leaves the model unchanged.
	 * @param resource The resource of the AlignmentProcedure
	 * @param model the Jena Model.
	 */
	public static AlignmentProcedure getAlignmentProcedure(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.AlignmentProcedure.class.hashCode()) + resource.toString();
		org.cdao.jastor.AlignmentProcedureImpl obj = (org.cdao.jastor.AlignmentProcedureImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.AlignmentProcedureImpl.getAlignmentProcedure(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of AlignmentProcedure for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#AlignmentProcedure
	 * @param model the Jena Model
	 * @return a List of AlignmentProcedure
	 */
	public static java.util.List getAllAlignmentProcedure(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,AlignmentProcedure.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAlignmentProcedure(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of BayesianMethod.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the BayesianMethod
	 * @param model the Jena Model.
	 */
	public static BayesianMethod createBayesianMethod(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.BayesianMethodImpl.createBayesianMethod(resource,model);
	}
	
	/**
	 * Create a new instance of BayesianMethod.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the BayesianMethod
	 * @param model the Jena Model.
	 */
	public static BayesianMethod createBayesianMethod(String uri, Model model) throws JastorException {
		BayesianMethod obj = org.cdao.jastor.BayesianMethodImpl.createBayesianMethod(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of BayesianMethod.  Leaves the model unchanged.
	 * @param uri The uri of the BayesianMethod
	 * @param model the Jena Model.
	 */
	public static BayesianMethod getBayesianMethod(String uri, Model model) throws JastorException {
		return getBayesianMethod(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of BayesianMethod.  Leaves the model unchanged.
	 * @param resource The resource of the BayesianMethod
	 * @param model the Jena Model.
	 */
	public static BayesianMethod getBayesianMethod(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.BayesianMethod.class.hashCode()) + resource.toString();
		org.cdao.jastor.BayesianMethodImpl obj = (org.cdao.jastor.BayesianMethodImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.BayesianMethodImpl.getBayesianMethod(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of BayesianMethod for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#BayesianMethod
	 * @param model the Jena Model
	 * @return a List of BayesianMethod
	 */
	public static java.util.List getAllBayesianMethod(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,BayesianMethod.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getBayesianMethod(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of DesoxiRibonucleotideResidueStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DesoxiRibonucleotideResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidueStateDatum createDesoxiRibonucleotideResidueStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.DesoxiRibonucleotideResidueStateDatumImpl.createDesoxiRibonucleotideResidueStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of DesoxiRibonucleotideResidueStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DesoxiRibonucleotideResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidueStateDatum createDesoxiRibonucleotideResidueStateDatum(String uri, Model model) throws JastorException {
		DesoxiRibonucleotideResidueStateDatum obj = org.cdao.jastor.DesoxiRibonucleotideResidueStateDatumImpl.createDesoxiRibonucleotideResidueStateDatum(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of DesoxiRibonucleotideResidueStateDatum.  Leaves the model unchanged.
	 * @param uri The uri of the DesoxiRibonucleotideResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidueStateDatum getDesoxiRibonucleotideResidueStateDatum(String uri, Model model) throws JastorException {
		return getDesoxiRibonucleotideResidueStateDatum(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of DesoxiRibonucleotideResidueStateDatum.  Leaves the model unchanged.
	 * @param resource The resource of the DesoxiRibonucleotideResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidueStateDatum getDesoxiRibonucleotideResidueStateDatum(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.DesoxiRibonucleotideResidueStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jastor.DesoxiRibonucleotideResidueStateDatumImpl obj = (org.cdao.jastor.DesoxiRibonucleotideResidueStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.DesoxiRibonucleotideResidueStateDatumImpl.getDesoxiRibonucleotideResidueStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DesoxiRibonucleotideResidueStateDatum for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#DesoxiRibonucleotideResidueStateDatum
	 * @param model the Jena Model
	 * @return a List of DesoxiRibonucleotideResidueStateDatum
	 */
	public static java.util.List getAllDesoxiRibonucleotideResidueStateDatum(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,DesoxiRibonucleotideResidueStateDatum.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDesoxiRibonucleotideResidueStateDatum(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of JukesKantor.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the JukesKantor
	 * @param model the Jena Model.
	 */
	public static JukesKantor createJukesKantor(Resource resource, Model model) throws JastorException {
		return org.cdao.jastor.JukesKantorImpl.createJukesKantor(resource,model);
	}
	
	/**
	 * Create a new instance of JukesKantor.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the JukesKantor
	 * @param model the Jena Model.
	 */
	public static JukesKantor createJukesKantor(String uri, Model model) throws JastorException {
		JukesKantor obj = org.cdao.jastor.JukesKantorImpl.createJukesKantor(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of JukesKantor.  Leaves the model unchanged.
	 * @param uri The uri of the JukesKantor
	 * @param model the Jena Model.
	 */
	public static JukesKantor getJukesKantor(String uri, Model model) throws JastorException {
		return getJukesKantor(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of JukesKantor.  Leaves the model unchanged.
	 * @param resource The resource of the JukesKantor
	 * @param model the Jena Model.
	 */
	public static JukesKantor getJukesKantor(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jastor.JukesKantor.class.hashCode()) + resource.toString();
		org.cdao.jastor.JukesKantorImpl obj = (org.cdao.jastor.JukesKantorImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jastor.JukesKantorImpl.getJukesKantor(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of JukesKantor for every resource in the model with rdf:Type http://localhost/~vivek/cdao.owl#JukesKantor
	 * @param model the Jena Model
	 * @return a List of JukesKantor
	 */
	public static java.util.List getAllJukesKantor(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,JukesKantor.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getJukesKantor(stmt.getSubject(),model));
		}
		return list;
	}
	
	
	/**
	 * Returns an instance of an interface for the given Resource.  The return instance is guaranteed to 
	 * implement the most specific interface in *some* hierarchy in which the Resource participates.  The behavior
	 * is unspecified for resources with RDF types from different hierarchies.
	 * @return an instance of Thing
	 */
	public static Thing getThing(com.hp.hpl.jena.rdf.model.Resource res, com.hp.hpl.jena.rdf.model.Model model) throws JastorException {
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#JukesKantor"))) {
			return getJukesKantor(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#DesoxiRibonucleotideResidueStateDatum"))) {
			return getDesoxiRibonucleotideResidueStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#BayesianMethod"))) {
			return getBayesianMethod(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#AlignmentProcedure"))) {
			return getAlignmentProcedure(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#CharacterStateDataMatrixAnnotation"))) {
			return getCharacterStateDataMatrixAnnotation(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#PolymorphicStateDomain"))) {
			return getPolymorphicStateDomain(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#TerminalNode"))) {
			return getTerminalNode(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#RibonucleotideResidueCharacter"))) {
			return getRibonucleotideResidueCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#StandardStateDatum"))) {
			return getStandardStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#TU"))) {
			return getTU(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#CoordinateSystem"))) {
			return getCoordinateSystem(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#CharacterStateDataMatrix"))) {
			return getCharacterStateDataMatrix(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#UnrootedTree"))) {
			return getUnrootedTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#ContinuousStateDatum"))) {
			return getContinuousStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Standard"))) {
			return getStandard(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Branch"))) {
			return getBranch(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#TaxonomicLink"))) {
			return getTaxonomicLink(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#TUAnnotation"))) {
			return getTUAnnotation(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#StandardCharacter"))) {
			return getStandardCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.co-ode.org/ontologies/amino-acid/2005/10/11/amino-acid.owl#AminoAcid"))) {
			return getAminoAcid(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#CompoundCharacter"))) {
			return getCompoundCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Generic_State"))) {
			return getGeneric__State(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#CoordinateRange"))) {
			return getCoordinateRange(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#UncertainStateDomain"))) {
			return getUncertainStateDomain(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Compound"))) {
			return getCompound(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#ParsimonyMethod"))) {
			return getParsimonyMethod(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#DirectedEdge"))) {
			return getDirectedEdge(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Kimura2Parameters"))) {
			return getKimura2Parameters(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#SetOfCharacters"))) {
			return getSetOfCharacters(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#GammaDistribution"))) {
			return getGammaDistribution(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#SubstitutionModel"))) {
			return getSubstitutionModel(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#RibonucleotideResidueStateDatum"))) {
			return getRibonucleotideResidueStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#RibonucleotideResidue"))) {
			return getRibonucleotideResidue(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#ContinuousCharacter"))) {
			return getContinuousCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#DesoxiRibonucleotideResidueCharacter"))) {
			return getDesoxiRibonucleotideResidueCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#MRCANode"))) {
			return getMRCANode(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#CommonAncestralNode"))) {
			return getCommonAncestralNode(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#AncestralNode"))) {
			return getAncestralNode(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Node"))) {
			return getNode(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#SetOfNodes"))) {
			return getSetOfNodes(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#SetOfThings"))) {
			return getSetOfThings(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#AminoAcidResidue"))) {
			return getAminoAcidResidue(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Lineage"))) {
			return getLineage(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#MaximumLikelihoodMethod"))) {
			return getMaximumLikelihoodMethod(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#DistanceMatrixBasedMethod"))) {
			return getDistanceMatrixBasedMethod(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#TreeProcedure"))) {
			return getTreeProcedure(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#TreeAnnotation"))) {
			return getTreeAnnotation(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#AminoAcidResidueCharacter"))) {
			return getAminoAcidResidueCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#MolecularCharacter"))) {
			return getMolecularCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#CategoricalCharacter"))) {
			return getCategoricalCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Character"))) {
			return getCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#GapCost"))) {
			return getGapCost(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#ModelDescription"))) {
			return getModelDescription(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.w3.org/2002/07/owl#Thing"))) {
			return get_Thing(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#CoordinatePoint"))) {
			return getCoordinatePoint(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#EdgeTransformation"))) {
			return getEdgeTransformation(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#CompoundStateDatum"))) {
			return getCompoundStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Continuous"))) {
			return getContinuous(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Sequence"))) {
			return getSequence(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Edge"))) {
			return getEdge(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#DesoxiRibonucleotideResidue"))) {
			return getDesoxiRibonucleotideResidue(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Molecular"))) {
			return getMolecular(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Categorical"))) {
			return getCategorical(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#CharacterStateDomain"))) {
			return getCharacterStateDomain(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#RootedTree"))) {
			return getRootedTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Tree"))) {
			return getTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#Network"))) {
			return getNetwork(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#EdgeLength"))) {
			return getEdgeLength(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#EdgeAnnotation"))) {
			return getEdgeAnnotation(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#CDAOAnnotation"))) {
			return getCDAOAnnotation(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#AminoAcidResidueStateDatum"))) {
			return getAminoAcidResidueStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#MolecularStateDatum"))) {
			return getMolecularStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#CategoricalStateDatum"))) {
			return getCategoricalStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#CharacterStateDatum"))) {
			return getCharacterStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#CoordinateList"))) {
			return getCoordinateList(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://localhost/~vivek/cdao.owl#DatumCoordinate"))) {
			return getDatumCoordinate(res,model);
		}
		return new ThingImpl(res,model);
	}
	
	/**
	 * Returns an instance of an interface for the given Resource URI.  The return instance is guaranteed to 
	 * implement the most specific interface in *some* hierarchy in which the Resource participates.  The behavior
	 * is unspecified for resources with RDF types from different hierarchies.
	 * @return an instance of Thing
	 */
	public static Thing getThing(String uri, com.hp.hpl.jena.rdf.model.Model model) throws JastorException {
		return getThing(model.getResource(uri),model);
	}

	/**
	 * Return a list of compatible interfaces for the given type.  Searches through all ontology classes
	 * in the CDAO ontology.  The list is sorted according to the topological sort
	 * of the class hierarchy
	 * @return a List of type java.lang.Class
	 */
	public static java.util.List listCompatibleInterfaces (com.hp.hpl.jena.rdf.model.Resource type) {
		java.util.List types = new java.util.ArrayList();
		if (type.equals(org.cdao.jastor.JukesKantor.TYPE)) {
			types.add(org.cdao.jastor.JukesKantor.class);
		}
		if (type.equals(org.cdao.jastor.DesoxiRibonucleotideResidueStateDatum.TYPE)) {
			types.add(org.cdao.jastor.DesoxiRibonucleotideResidueStateDatum.class);
		}
		if (type.equals(org.cdao.jastor.BayesianMethod.TYPE)) {
			types.add(org.cdao.jastor.BayesianMethod.class);
		}
		if (type.equals(org.cdao.jastor.AlignmentProcedure.TYPE)) {
			types.add(org.cdao.jastor.AlignmentProcedure.class);
		}
		if (type.equals(org.cdao.jastor.CharacterStateDataMatrixAnnotation.TYPE)) {
			types.add(org.cdao.jastor.CharacterStateDataMatrixAnnotation.class);
		}
		if (type.equals(org.cdao.jastor.PolymorphicStateDomain.TYPE)) {
			types.add(org.cdao.jastor.PolymorphicStateDomain.class);
		}
		if (type.equals(org.cdao.jastor.TerminalNode.TYPE)) {
			types.add(org.cdao.jastor.TerminalNode.class);
		}
		if (type.equals(org.cdao.jastor.RibonucleotideResidueCharacter.TYPE)) {
			types.add(org.cdao.jastor.RibonucleotideResidueCharacter.class);
		}
		if (type.equals(org.cdao.jastor.StandardStateDatum.TYPE)) {
			types.add(org.cdao.jastor.StandardStateDatum.class);
		}
		if (type.equals(org.cdao.jastor.TU.TYPE)) {
			types.add(org.cdao.jastor.TU.class);
		}
		if (type.equals(org.cdao.jastor.CoordinateSystem.TYPE)) {
			types.add(org.cdao.jastor.CoordinateSystem.class);
		}
		if (type.equals(org.cdao.jastor.CharacterStateDataMatrix.TYPE)) {
			types.add(org.cdao.jastor.CharacterStateDataMatrix.class);
		}
		if (type.equals(org.cdao.jastor.UnrootedTree.TYPE)) {
			types.add(org.cdao.jastor.UnrootedTree.class);
		}
		if (type.equals(org.cdao.jastor.ContinuousStateDatum.TYPE)) {
			types.add(org.cdao.jastor.ContinuousStateDatum.class);
		}
		if (type.equals(org.cdao.jastor.Standard.TYPE)) {
			types.add(org.cdao.jastor.Standard.class);
		}
		if (type.equals(org.cdao.jastor.Branch.TYPE)) {
			types.add(org.cdao.jastor.Branch.class);
		}
		if (type.equals(org.cdao.jastor.TaxonomicLink.TYPE)) {
			types.add(org.cdao.jastor.TaxonomicLink.class);
		}
		if (type.equals(org.cdao.jastor.TUAnnotation.TYPE)) {
			types.add(org.cdao.jastor.TUAnnotation.class);
		}
		if (type.equals(org.cdao.jastor.StandardCharacter.TYPE)) {
			types.add(org.cdao.jastor.StandardCharacter.class);
		}
		if (type.equals(org.cdao.jastor.AminoAcid.TYPE)) {
			types.add(org.cdao.jastor.AminoAcid.class);
		}
		if (type.equals(org.cdao.jastor.CompoundCharacter.TYPE)) {
			types.add(org.cdao.jastor.CompoundCharacter.class);
		}
		if (type.equals(org.cdao.jastor.Generic__State.TYPE)) {
			types.add(org.cdao.jastor.Generic__State.class);
		}
		if (type.equals(org.cdao.jastor.CoordinateRange.TYPE)) {
			types.add(org.cdao.jastor.CoordinateRange.class);
		}
		if (type.equals(org.cdao.jastor.UncertainStateDomain.TYPE)) {
			types.add(org.cdao.jastor.UncertainStateDomain.class);
		}
		if (type.equals(org.cdao.jastor.Compound.TYPE)) {
			types.add(org.cdao.jastor.Compound.class);
		}
		if (type.equals(org.cdao.jastor.ParsimonyMethod.TYPE)) {
			types.add(org.cdao.jastor.ParsimonyMethod.class);
		}
		if (type.equals(org.cdao.jastor.DirectedEdge.TYPE)) {
			types.add(org.cdao.jastor.DirectedEdge.class);
		}
		if (type.equals(org.cdao.jastor.Kimura2Parameters.TYPE)) {
			types.add(org.cdao.jastor.Kimura2Parameters.class);
		}
		if (type.equals(org.cdao.jastor.SetOfCharacters.TYPE)) {
			types.add(org.cdao.jastor.SetOfCharacters.class);
		}
		if (type.equals(org.cdao.jastor.GammaDistribution.TYPE)) {
			types.add(org.cdao.jastor.GammaDistribution.class);
		}
		if (type.equals(org.cdao.jastor.SubstitutionModel.TYPE)) {
			types.add(org.cdao.jastor.SubstitutionModel.class);
		}
		if (type.equals(org.cdao.jastor.RibonucleotideResidueStateDatum.TYPE)) {
			types.add(org.cdao.jastor.RibonucleotideResidueStateDatum.class);
		}
		if (type.equals(org.cdao.jastor.RibonucleotideResidue.TYPE)) {
			types.add(org.cdao.jastor.RibonucleotideResidue.class);
		}
		if (type.equals(org.cdao.jastor.ContinuousCharacter.TYPE)) {
			types.add(org.cdao.jastor.ContinuousCharacter.class);
		}
		if (type.equals(org.cdao.jastor.DesoxiRibonucleotideResidueCharacter.TYPE)) {
			types.add(org.cdao.jastor.DesoxiRibonucleotideResidueCharacter.class);
		}
		if (type.equals(org.cdao.jastor.MRCANode.TYPE)) {
			types.add(org.cdao.jastor.MRCANode.class);
		}
		if (type.equals(org.cdao.jastor.CommonAncestralNode.TYPE)) {
			types.add(org.cdao.jastor.CommonAncestralNode.class);
		}
		if (type.equals(org.cdao.jastor.AncestralNode.TYPE)) {
			types.add(org.cdao.jastor.AncestralNode.class);
		}
		if (type.equals(org.cdao.jastor.Node.TYPE)) {
			types.add(org.cdao.jastor.Node.class);
		}
		if (type.equals(org.cdao.jastor.SetOfNodes.TYPE)) {
			types.add(org.cdao.jastor.SetOfNodes.class);
		}
		if (type.equals(org.cdao.jastor.SetOfThings.TYPE)) {
			types.add(org.cdao.jastor.SetOfThings.class);
		}
		if (type.equals(org.cdao.jastor.AminoAcidResidue.TYPE)) {
			types.add(org.cdao.jastor.AminoAcidResidue.class);
		}
		if (type.equals(org.cdao.jastor.Lineage.TYPE)) {
			types.add(org.cdao.jastor.Lineage.class);
		}
		if (type.equals(org.cdao.jastor.MaximumLikelihoodMethod.TYPE)) {
			types.add(org.cdao.jastor.MaximumLikelihoodMethod.class);
		}
		if (type.equals(org.cdao.jastor.DistanceMatrixBasedMethod.TYPE)) {
			types.add(org.cdao.jastor.DistanceMatrixBasedMethod.class);
		}
		if (type.equals(org.cdao.jastor.TreeProcedure.TYPE)) {
			types.add(org.cdao.jastor.TreeProcedure.class);
		}
		if (type.equals(org.cdao.jastor.TreeAnnotation.TYPE)) {
			types.add(org.cdao.jastor.TreeAnnotation.class);
		}
		if (type.equals(org.cdao.jastor.AminoAcidResidueCharacter.TYPE)) {
			types.add(org.cdao.jastor.AminoAcidResidueCharacter.class);
		}
		if (type.equals(org.cdao.jastor.MolecularCharacter.TYPE)) {
			types.add(org.cdao.jastor.MolecularCharacter.class);
		}
		if (type.equals(org.cdao.jastor.CategoricalCharacter.TYPE)) {
			types.add(org.cdao.jastor.CategoricalCharacter.class);
		}
		if (type.equals(org.cdao.jastor.Character.TYPE)) {
			types.add(org.cdao.jastor.Character.class);
		}
		if (type.equals(org.cdao.jastor.GapCost.TYPE)) {
			types.add(org.cdao.jastor.GapCost.class);
		}
		if (type.equals(org.cdao.jastor.ModelDescription.TYPE)) {
			types.add(org.cdao.jastor.ModelDescription.class);
		}
		if (type.equals(org.cdao.jastor._Thing.TYPE)) {
			types.add(org.cdao.jastor._Thing.class);
		}
		if (type.equals(org.cdao.jastor.CoordinatePoint.TYPE)) {
			types.add(org.cdao.jastor.CoordinatePoint.class);
		}
		if (type.equals(org.cdao.jastor.EdgeTransformation.TYPE)) {
			types.add(org.cdao.jastor.EdgeTransformation.class);
		}
		if (type.equals(org.cdao.jastor.CompoundStateDatum.TYPE)) {
			types.add(org.cdao.jastor.CompoundStateDatum.class);
		}
		if (type.equals(org.cdao.jastor.Continuous.TYPE)) {
			types.add(org.cdao.jastor.Continuous.class);
		}
		if (type.equals(org.cdao.jastor.Sequence.TYPE)) {
			types.add(org.cdao.jastor.Sequence.class);
		}
		if (type.equals(org.cdao.jastor.Edge.TYPE)) {
			types.add(org.cdao.jastor.Edge.class);
		}
		if (type.equals(org.cdao.jastor.DesoxiRibonucleotideResidue.TYPE)) {
			types.add(org.cdao.jastor.DesoxiRibonucleotideResidue.class);
		}
		if (type.equals(org.cdao.jastor.Molecular.TYPE)) {
			types.add(org.cdao.jastor.Molecular.class);
		}
		if (type.equals(org.cdao.jastor.Categorical.TYPE)) {
			types.add(org.cdao.jastor.Categorical.class);
		}
		if (type.equals(org.cdao.jastor.CharacterStateDomain.TYPE)) {
			types.add(org.cdao.jastor.CharacterStateDomain.class);
		}
		if (type.equals(org.cdao.jastor.RootedTree.TYPE)) {
			types.add(org.cdao.jastor.RootedTree.class);
		}
		if (type.equals(org.cdao.jastor.Tree.TYPE)) {
			types.add(org.cdao.jastor.Tree.class);
		}
		if (type.equals(org.cdao.jastor.Network.TYPE)) {
			types.add(org.cdao.jastor.Network.class);
		}
		if (type.equals(org.cdao.jastor.EdgeLength.TYPE)) {
			types.add(org.cdao.jastor.EdgeLength.class);
		}
		if (type.equals(org.cdao.jastor.EdgeAnnotation.TYPE)) {
			types.add(org.cdao.jastor.EdgeAnnotation.class);
		}
		if (type.equals(org.cdao.jastor.CDAOAnnotation.TYPE)) {
			types.add(org.cdao.jastor.CDAOAnnotation.class);
		}
		if (type.equals(org.cdao.jastor.AminoAcidResidueStateDatum.TYPE)) {
			types.add(org.cdao.jastor.AminoAcidResidueStateDatum.class);
		}
		if (type.equals(org.cdao.jastor.MolecularStateDatum.TYPE)) {
			types.add(org.cdao.jastor.MolecularStateDatum.class);
		}
		if (type.equals(org.cdao.jastor.CategoricalStateDatum.TYPE)) {
			types.add(org.cdao.jastor.CategoricalStateDatum.class);
		}
		if (type.equals(org.cdao.jastor.CharacterStateDatum.TYPE)) {
			types.add(org.cdao.jastor.CharacterStateDatum.class);
		}
		if (type.equals(org.cdao.jastor.CoordinateList.TYPE)) {
			types.add(org.cdao.jastor.CoordinateList.class);
		}
		if (type.equals(org.cdao.jastor.DatumCoordinate.TYPE)) {
			types.add(org.cdao.jastor.DatumCoordinate.class);
		}
		return types;
	}
}