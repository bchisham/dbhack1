

package org.cdao.jasper;

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
	 * Create a new instance of SetOfCharacters.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SetOfCharacters
	 * @param model the Jena Model.
	 */
	public static SetOfCharacters createSetOfCharacters(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.SetOfCharactersImpl.createSetOfCharacters(resource,model);
	}
	
	/**
	 * Create a new instance of SetOfCharacters.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SetOfCharacters
	 * @param model the Jena Model.
	 */
	public static SetOfCharacters createSetOfCharacters(String uri, Model model) throws JastorException {
		SetOfCharacters obj = org.cdao.jasper.SetOfCharactersImpl.createSetOfCharacters(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.SetOfCharacters.class.hashCode()) + resource.toString();
		org.cdao.jasper.SetOfCharactersImpl obj = (org.cdao.jasper.SetOfCharactersImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.SetOfCharactersImpl.getSetOfCharacters(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SetOfCharacters for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#SetOfCharacters
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
	 * Create a new instance of JukesKantor.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the JukesKantor
	 * @param model the Jena Model.
	 */
	public static JukesKantor createJukesKantor(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.JukesKantorImpl.createJukesKantor(resource,model);
	}
	
	/**
	 * Create a new instance of JukesKantor.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the JukesKantor
	 * @param model the Jena Model.
	 */
	public static JukesKantor createJukesKantor(String uri, Model model) throws JastorException {
		JukesKantor obj = org.cdao.jasper.JukesKantorImpl.createJukesKantor(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.JukesKantor.class.hashCode()) + resource.toString();
		org.cdao.jasper.JukesKantorImpl obj = (org.cdao.jasper.JukesKantorImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.JukesKantorImpl.getJukesKantor(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of JukesKantor for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#JukesKantor
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
	 * Create a new instance of phylogenetic__algorithm.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the phylogenetic__algorithm
	 * @param model the Jena Model.
	 */
	public static phylogenetic__algorithm createphylogenetic__algorithm(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.phylogenetic__algorithmImpl.createphylogenetic__algorithm(resource,model);
	}
	
	/**
	 * Create a new instance of phylogenetic__algorithm.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the phylogenetic__algorithm
	 * @param model the Jena Model.
	 */
	public static phylogenetic__algorithm createphylogenetic__algorithm(String uri, Model model) throws JastorException {
		phylogenetic__algorithm obj = org.cdao.jasper.phylogenetic__algorithmImpl.createphylogenetic__algorithm(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of phylogenetic__algorithm.  Leaves the model unchanged.
	 * @param uri The uri of the phylogenetic__algorithm
	 * @param model the Jena Model.
	 */
	public static phylogenetic__algorithm getphylogenetic__algorithm(String uri, Model model) throws JastorException {
		return getphylogenetic__algorithm(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of phylogenetic__algorithm.  Leaves the model unchanged.
	 * @param resource The resource of the phylogenetic__algorithm
	 * @param model the Jena Model.
	 */
	public static phylogenetic__algorithm getphylogenetic__algorithm(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.phylogenetic__algorithm.class.hashCode()) + resource.toString();
		org.cdao.jasper.phylogenetic__algorithmImpl obj = (org.cdao.jasper.phylogenetic__algorithmImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.phylogenetic__algorithmImpl.getphylogenetic__algorithm(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of phylogenetic__algorithm for every resource in the model with rdf:Type http://www.mygrid.org.uk/ontology#phylogenetic_algorithm
	 * @param model the Jena Model
	 * @return a List of phylogenetic__algorithm
	 */
	public static java.util.List getAllphylogenetic__algorithm(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,phylogenetic__algorithm.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getphylogenetic__algorithm(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of GrafenLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the GrafenLengthType
	 * @param model the Jena Model.
	 */
	public static GrafenLengthType createGrafenLengthType(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.GrafenLengthTypeImpl.createGrafenLengthType(resource,model);
	}
	
	/**
	 * Create a new instance of GrafenLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the GrafenLengthType
	 * @param model the Jena Model.
	 */
	public static GrafenLengthType createGrafenLengthType(String uri, Model model) throws JastorException {
		GrafenLengthType obj = org.cdao.jasper.GrafenLengthTypeImpl.createGrafenLengthType(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of GrafenLengthType.  Leaves the model unchanged.
	 * @param uri The uri of the GrafenLengthType
	 * @param model the Jena Model.
	 */
	public static GrafenLengthType getGrafenLengthType(String uri, Model model) throws JastorException {
		return getGrafenLengthType(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of GrafenLengthType.  Leaves the model unchanged.
	 * @param resource The resource of the GrafenLengthType
	 * @param model the Jena Model.
	 */
	public static GrafenLengthType getGrafenLengthType(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.GrafenLengthType.class.hashCode()) + resource.toString();
		org.cdao.jasper.GrafenLengthTypeImpl obj = (org.cdao.jasper.GrafenLengthTypeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.GrafenLengthTypeImpl.getGrafenLengthType(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of GrafenLengthType for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#GrafenLengthType
	 * @param model the Jena Model
	 * @return a List of GrafenLengthType
	 */
	public static java.util.List getAllGrafenLengthType(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,GrafenLengthType.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getGrafenLengthType(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of TreeFormat.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TreeFormat
	 * @param model the Jena Model.
	 */
	public static TreeFormat createTreeFormat(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.TreeFormatImpl.createTreeFormat(resource,model);
	}
	
	/**
	 * Create a new instance of TreeFormat.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TreeFormat
	 * @param model the Jena Model.
	 */
	public static TreeFormat createTreeFormat(String uri, Model model) throws JastorException {
		TreeFormat obj = org.cdao.jasper.TreeFormatImpl.createTreeFormat(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of TreeFormat.  Leaves the model unchanged.
	 * @param uri The uri of the TreeFormat
	 * @param model the Jena Model.
	 */
	public static TreeFormat getTreeFormat(String uri, Model model) throws JastorException {
		return getTreeFormat(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of TreeFormat.  Leaves the model unchanged.
	 * @param resource The resource of the TreeFormat
	 * @param model the Jena Model.
	 */
	public static TreeFormat getTreeFormat(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.TreeFormat.class.hashCode()) + resource.toString();
		org.cdao.jasper.TreeFormatImpl obj = (org.cdao.jasper.TreeFormatImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.TreeFormatImpl.getTreeFormat(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TreeFormat for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TreeFormat
	 * @param model the Jena Model
	 * @return a List of TreeFormat
	 */
	public static java.util.List getAllTreeFormat(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,TreeFormat.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getTreeFormat(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Standard.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Standard
	 * @param model the Jena Model.
	 */
	public static Standard createStandard(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.StandardImpl.createStandard(resource,model);
	}
	
	/**
	 * Create a new instance of Standard.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Standard
	 * @param model the Jena Model.
	 */
	public static Standard createStandard(String uri, Model model) throws JastorException {
		Standard obj = org.cdao.jasper.StandardImpl.createStandard(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Standard.class.hashCode()) + resource.toString();
		org.cdao.jasper.StandardImpl obj = (org.cdao.jasper.StandardImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.StandardImpl.getStandard(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Standard for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Standard
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
	 * Create a new instance of PhyloTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the PhyloTree
	 * @param model the Jena Model.
	 */
	public static PhyloTree createPhyloTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.PhyloTreeImpl.createPhyloTree(resource,model);
	}
	
	/**
	 * Create a new instance of PhyloTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the PhyloTree
	 * @param model the Jena Model.
	 */
	public static PhyloTree createPhyloTree(String uri, Model model) throws JastorException {
		PhyloTree obj = org.cdao.jasper.PhyloTreeImpl.createPhyloTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of PhyloTree.  Leaves the model unchanged.
	 * @param uri The uri of the PhyloTree
	 * @param model the Jena Model.
	 */
	public static PhyloTree getPhyloTree(String uri, Model model) throws JastorException {
		return getPhyloTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of PhyloTree.  Leaves the model unchanged.
	 * @param resource The resource of the PhyloTree
	 * @param model the Jena Model.
	 */
	public static PhyloTree getPhyloTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.PhyloTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.PhyloTreeImpl obj = (org.cdao.jasper.PhyloTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.PhyloTreeImpl.getPhyloTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of PhyloTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#PhyloTree
	 * @param model the Jena Model
	 * @return a List of PhyloTree
	 */
	public static java.util.List getAllPhyloTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,PhyloTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPhyloTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Clade.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Clade
	 * @param model the Jena Model.
	 */
	public static Clade createClade(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CladeImpl.createClade(resource,model);
	}
	
	/**
	 * Create a new instance of Clade.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Clade
	 * @param model the Jena Model.
	 */
	public static Clade createClade(String uri, Model model) throws JastorException {
		Clade obj = org.cdao.jasper.CladeImpl.createClade(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Clade.  Leaves the model unchanged.
	 * @param uri The uri of the Clade
	 * @param model the Jena Model.
	 */
	public static Clade getClade(String uri, Model model) throws JastorException {
		return getClade(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Clade.  Leaves the model unchanged.
	 * @param resource The resource of the Clade
	 * @param model the Jena Model.
	 */
	public static Clade getClade(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.Clade.class.hashCode()) + resource.toString();
		org.cdao.jasper.CladeImpl obj = (org.cdao.jasper.CladeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CladeImpl.getClade(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Clade for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Clade
	 * @param model the Jena Model
	 * @return a List of Clade
	 */
	public static java.util.List getAllClade(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Clade.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getClade(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of AncestralNode.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AncestralNode
	 * @param model the Jena Model.
	 */
	public static AncestralNode createAncestralNode(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.AncestralNodeImpl.createAncestralNode(resource,model);
	}
	
	/**
	 * Create a new instance of AncestralNode.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AncestralNode
	 * @param model the Jena Model.
	 */
	public static AncestralNode createAncestralNode(String uri, Model model) throws JastorException {
		AncestralNode obj = org.cdao.jasper.AncestralNodeImpl.createAncestralNode(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.AncestralNode.class.hashCode()) + resource.toString();
		org.cdao.jasper.AncestralNodeImpl obj = (org.cdao.jasper.AncestralNodeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.AncestralNodeImpl.getAncestralNode(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of AncestralNode for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#AncestralNode
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
	 * Create a new instance of ContinuousCharDistanceLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ContinuousCharDistanceLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharDistanceLengthType createContinuousCharDistanceLengthType(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.ContinuousCharDistanceLengthTypeImpl.createContinuousCharDistanceLengthType(resource,model);
	}
	
	/**
	 * Create a new instance of ContinuousCharDistanceLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ContinuousCharDistanceLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharDistanceLengthType createContinuousCharDistanceLengthType(String uri, Model model) throws JastorException {
		ContinuousCharDistanceLengthType obj = org.cdao.jasper.ContinuousCharDistanceLengthTypeImpl.createContinuousCharDistanceLengthType(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ContinuousCharDistanceLengthType.  Leaves the model unchanged.
	 * @param uri The uri of the ContinuousCharDistanceLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharDistanceLengthType getContinuousCharDistanceLengthType(String uri, Model model) throws JastorException {
		return getContinuousCharDistanceLengthType(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ContinuousCharDistanceLengthType.  Leaves the model unchanged.
	 * @param resource The resource of the ContinuousCharDistanceLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharDistanceLengthType getContinuousCharDistanceLengthType(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.ContinuousCharDistanceLengthType.class.hashCode()) + resource.toString();
		org.cdao.jasper.ContinuousCharDistanceLengthTypeImpl obj = (org.cdao.jasper.ContinuousCharDistanceLengthTypeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.ContinuousCharDistanceLengthTypeImpl.getContinuousCharDistanceLengthType(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ContinuousCharDistanceLengthType for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousCharDistanceLengthType
	 * @param model the Jena Model
	 * @return a List of ContinuousCharDistanceLengthType
	 */
	public static java.util.List getAllContinuousCharDistanceLengthType(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ContinuousCharDistanceLengthType.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getContinuousCharDistanceLengthType(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CoordinateSystem.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CoordinateSystem
	 * @param model the Jena Model.
	 */
	public static CoordinateSystem createCoordinateSystem(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CoordinateSystemImpl.createCoordinateSystem(resource,model);
	}
	
	/**
	 * Create a new instance of CoordinateSystem.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CoordinateSystem
	 * @param model the Jena Model.
	 */
	public static CoordinateSystem createCoordinateSystem(String uri, Model model) throws JastorException {
		CoordinateSystem obj = org.cdao.jasper.CoordinateSystemImpl.createCoordinateSystem(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.CoordinateSystem.class.hashCode()) + resource.toString();
		org.cdao.jasper.CoordinateSystemImpl obj = (org.cdao.jasper.CoordinateSystemImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CoordinateSystemImpl.getCoordinateSystem(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CoordinateSystem for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CoordinateSystem
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
	 * Create a new instance of GalledTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the GalledTree
	 * @param model the Jena Model.
	 */
	public static GalledTree createGalledTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.GalledTreeImpl.createGalledTree(resource,model);
	}
	
	/**
	 * Create a new instance of GalledTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the GalledTree
	 * @param model the Jena Model.
	 */
	public static GalledTree createGalledTree(String uri, Model model) throws JastorException {
		GalledTree obj = org.cdao.jasper.GalledTreeImpl.createGalledTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of GalledTree.  Leaves the model unchanged.
	 * @param uri The uri of the GalledTree
	 * @param model the Jena Model.
	 */
	public static GalledTree getGalledTree(String uri, Model model) throws JastorException {
		return getGalledTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of GalledTree.  Leaves the model unchanged.
	 * @param resource The resource of the GalledTree
	 * @param model the Jena Model.
	 */
	public static GalledTree getGalledTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.GalledTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.GalledTreeImpl obj = (org.cdao.jasper.GalledTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.GalledTreeImpl.getGalledTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of GalledTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#GalledTree
	 * @param model the Jena Model
	 * @return a List of GalledTree
	 */
	public static java.util.List getAllGalledTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,GalledTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getGalledTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of UnrootedSubtree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the UnrootedSubtree
	 * @param model the Jena Model.
	 */
	public static UnrootedSubtree createUnrootedSubtree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.UnrootedSubtreeImpl.createUnrootedSubtree(resource,model);
	}
	
	/**
	 * Create a new instance of UnrootedSubtree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the UnrootedSubtree
	 * @param model the Jena Model.
	 */
	public static UnrootedSubtree createUnrootedSubtree(String uri, Model model) throws JastorException {
		UnrootedSubtree obj = org.cdao.jasper.UnrootedSubtreeImpl.createUnrootedSubtree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of UnrootedSubtree.  Leaves the model unchanged.
	 * @param uri The uri of the UnrootedSubtree
	 * @param model the Jena Model.
	 */
	public static UnrootedSubtree getUnrootedSubtree(String uri, Model model) throws JastorException {
		return getUnrootedSubtree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of UnrootedSubtree.  Leaves the model unchanged.
	 * @param resource The resource of the UnrootedSubtree
	 * @param model the Jena Model.
	 */
	public static UnrootedSubtree getUnrootedSubtree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.UnrootedSubtree.class.hashCode()) + resource.toString();
		org.cdao.jasper.UnrootedSubtreeImpl obj = (org.cdao.jasper.UnrootedSubtreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.UnrootedSubtreeImpl.getUnrootedSubtree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of UnrootedSubtree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#UnrootedSubtree
	 * @param model the Jena Model
	 * @return a List of UnrootedSubtree
	 */
	public static java.util.List getAllUnrootedSubtree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,UnrootedSubtree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getUnrootedSubtree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Subtree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Subtree
	 * @param model the Jena Model.
	 */
	public static Subtree createSubtree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.SubtreeImpl.createSubtree(resource,model);
	}
	
	/**
	 * Create a new instance of Subtree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Subtree
	 * @param model the Jena Model.
	 */
	public static Subtree createSubtree(String uri, Model model) throws JastorException {
		Subtree obj = org.cdao.jasper.SubtreeImpl.createSubtree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Subtree.  Leaves the model unchanged.
	 * @param uri The uri of the Subtree
	 * @param model the Jena Model.
	 */
	public static Subtree getSubtree(String uri, Model model) throws JastorException {
		return getSubtree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Subtree.  Leaves the model unchanged.
	 * @param resource The resource of the Subtree
	 * @param model the Jena Model.
	 */
	public static Subtree getSubtree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.Subtree.class.hashCode()) + resource.toString();
		org.cdao.jasper.SubtreeImpl obj = (org.cdao.jasper.SubtreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.SubtreeImpl.getSubtree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Subtree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Subtree
	 * @param model the Jena Model
	 * @return a List of Subtree
	 */
	public static java.util.List getAllSubtree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Subtree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getSubtree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of DiscreteCharDistanceLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DiscreteCharDistanceLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharDistanceLengthType createDiscreteCharDistanceLengthType(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.DiscreteCharDistanceLengthTypeImpl.createDiscreteCharDistanceLengthType(resource,model);
	}
	
	/**
	 * Create a new instance of DiscreteCharDistanceLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DiscreteCharDistanceLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharDistanceLengthType createDiscreteCharDistanceLengthType(String uri, Model model) throws JastorException {
		DiscreteCharDistanceLengthType obj = org.cdao.jasper.DiscreteCharDistanceLengthTypeImpl.createDiscreteCharDistanceLengthType(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of DiscreteCharDistanceLengthType.  Leaves the model unchanged.
	 * @param uri The uri of the DiscreteCharDistanceLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharDistanceLengthType getDiscreteCharDistanceLengthType(String uri, Model model) throws JastorException {
		return getDiscreteCharDistanceLengthType(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of DiscreteCharDistanceLengthType.  Leaves the model unchanged.
	 * @param resource The resource of the DiscreteCharDistanceLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharDistanceLengthType getDiscreteCharDistanceLengthType(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.DiscreteCharDistanceLengthType.class.hashCode()) + resource.toString();
		org.cdao.jasper.DiscreteCharDistanceLengthTypeImpl obj = (org.cdao.jasper.DiscreteCharDistanceLengthTypeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.DiscreteCharDistanceLengthTypeImpl.getDiscreteCharDistanceLengthType(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DiscreteCharDistanceLengthType for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DiscreteCharDistanceLengthType
	 * @param model the Jena Model
	 * @return a List of DiscreteCharDistanceLengthType
	 */
	public static java.util.List getAllDiscreteCharDistanceLengthType(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,DiscreteCharDistanceLengthType.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDiscreteCharDistanceLengthType(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CoordinateRange.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CoordinateRange
	 * @param model the Jena Model.
	 */
	public static CoordinateRange createCoordinateRange(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CoordinateRangeImpl.createCoordinateRange(resource,model);
	}
	
	/**
	 * Create a new instance of CoordinateRange.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CoordinateRange
	 * @param model the Jena Model.
	 */
	public static CoordinateRange createCoordinateRange(String uri, Model model) throws JastorException {
		CoordinateRange obj = org.cdao.jasper.CoordinateRangeImpl.createCoordinateRange(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.CoordinateRange.class.hashCode()) + resource.toString();
		org.cdao.jasper.CoordinateRangeImpl obj = (org.cdao.jasper.CoordinateRangeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CoordinateRangeImpl.getCoordinateRange(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CoordinateRange for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CoordinateRange
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
	 * Create a new instance of CDAOAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CDAOAnnotation
	 * @param model the Jena Model.
	 */
	public static CDAOAnnotation createCDAOAnnotation(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CDAOAnnotationImpl.createCDAOAnnotation(resource,model);
	}
	
	/**
	 * Create a new instance of CDAOAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CDAOAnnotation
	 * @param model the Jena Model.
	 */
	public static CDAOAnnotation createCDAOAnnotation(String uri, Model model) throws JastorException {
		CDAOAnnotation obj = org.cdao.jasper.CDAOAnnotationImpl.createCDAOAnnotation(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.CDAOAnnotation.class.hashCode()) + resource.toString();
		org.cdao.jasper.CDAOAnnotationImpl obj = (org.cdao.jasper.CDAOAnnotationImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CDAOAnnotationImpl.getCDAOAnnotation(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CDAOAnnotation for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CDAOAnnotation
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
	 * Create a new instance of Sequence.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Sequence
	 * @param model the Jena Model.
	 */
	public static Sequence createSequence(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.SequenceImpl.createSequence(resource,model);
	}
	
	/**
	 * Create a new instance of Sequence.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Sequence
	 * @param model the Jena Model.
	 */
	public static Sequence createSequence(String uri, Model model) throws JastorException {
		Sequence obj = org.cdao.jasper.SequenceImpl.createSequence(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Sequence.class.hashCode()) + resource.toString();
		org.cdao.jasper.SequenceImpl obj = (org.cdao.jasper.SequenceImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.SequenceImpl.getSequence(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Sequence for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Sequence
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
	 * Create a new instance of Polytomy.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Polytomy
	 * @param model the Jena Model.
	 */
	public static Polytomy createPolytomy(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.PolytomyImpl.createPolytomy(resource,model);
	}
	
	/**
	 * Create a new instance of Polytomy.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Polytomy
	 * @param model the Jena Model.
	 */
	public static Polytomy createPolytomy(String uri, Model model) throws JastorException {
		Polytomy obj = org.cdao.jasper.PolytomyImpl.createPolytomy(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Polytomy.  Leaves the model unchanged.
	 * @param uri The uri of the Polytomy
	 * @param model the Jena Model.
	 */
	public static Polytomy getPolytomy(String uri, Model model) throws JastorException {
		return getPolytomy(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Polytomy.  Leaves the model unchanged.
	 * @param resource The resource of the Polytomy
	 * @param model the Jena Model.
	 */
	public static Polytomy getPolytomy(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.Polytomy.class.hashCode()) + resource.toString();
		org.cdao.jasper.PolytomyImpl obj = (org.cdao.jasper.PolytomyImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.PolytomyImpl.getPolytomy(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Polytomy for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Polytomy
	 * @param model the Jena Model
	 * @return a List of Polytomy
	 */
	public static java.util.List getAllPolytomy(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Polytomy.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPolytomy(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ContinuousCharacterLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ContinuousCharacterLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharacterLengthType createContinuousCharacterLengthType(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.ContinuousCharacterLengthTypeImpl.createContinuousCharacterLengthType(resource,model);
	}
	
	/**
	 * Create a new instance of ContinuousCharacterLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ContinuousCharacterLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharacterLengthType createContinuousCharacterLengthType(String uri, Model model) throws JastorException {
		ContinuousCharacterLengthType obj = org.cdao.jasper.ContinuousCharacterLengthTypeImpl.createContinuousCharacterLengthType(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ContinuousCharacterLengthType.  Leaves the model unchanged.
	 * @param uri The uri of the ContinuousCharacterLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharacterLengthType getContinuousCharacterLengthType(String uri, Model model) throws JastorException {
		return getContinuousCharacterLengthType(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ContinuousCharacterLengthType.  Leaves the model unchanged.
	 * @param resource The resource of the ContinuousCharacterLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharacterLengthType getContinuousCharacterLengthType(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.ContinuousCharacterLengthType.class.hashCode()) + resource.toString();
		org.cdao.jasper.ContinuousCharacterLengthTypeImpl obj = (org.cdao.jasper.ContinuousCharacterLengthTypeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.ContinuousCharacterLengthTypeImpl.getContinuousCharacterLengthType(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ContinuousCharacterLengthType for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousCharacterLengthType
	 * @param model the Jena Model
	 * @return a List of ContinuousCharacterLengthType
	 */
	public static java.util.List getAllContinuousCharacterLengthType(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ContinuousCharacterLengthType.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getContinuousCharacterLengthType(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of SetOfNodes.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SetOfNodes
	 * @param model the Jena Model.
	 */
	public static SetOfNodes createSetOfNodes(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.SetOfNodesImpl.createSetOfNodes(resource,model);
	}
	
	/**
	 * Create a new instance of SetOfNodes.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SetOfNodes
	 * @param model the Jena Model.
	 */
	public static SetOfNodes createSetOfNodes(String uri, Model model) throws JastorException {
		SetOfNodes obj = org.cdao.jasper.SetOfNodesImpl.createSetOfNodes(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.SetOfNodes.class.hashCode()) + resource.toString();
		org.cdao.jasper.SetOfNodesImpl obj = (org.cdao.jasper.SetOfNodesImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.SetOfNodesImpl.getSetOfNodes(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SetOfNodes for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#SetOfNodes
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
	 * Create a new instance of Branch.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Branch
	 * @param model the Jena Model.
	 */
	public static Branch createBranch(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.BranchImpl.createBranch(resource,model);
	}
	
	/**
	 * Create a new instance of Branch.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Branch
	 * @param model the Jena Model.
	 */
	public static Branch createBranch(String uri, Model model) throws JastorException {
		Branch obj = org.cdao.jasper.BranchImpl.createBranch(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Branch.class.hashCode()) + resource.toString();
		org.cdao.jasper.BranchImpl obj = (org.cdao.jasper.BranchImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.BranchImpl.getBranch(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Branch for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Branch
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
	 * Create a new instance of UnrootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the UnrootedTree
	 * @param model the Jena Model.
	 */
	public static UnrootedTree createUnrootedTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.UnrootedTreeImpl.createUnrootedTree(resource,model);
	}
	
	/**
	 * Create a new instance of UnrootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the UnrootedTree
	 * @param model the Jena Model.
	 */
	public static UnrootedTree createUnrootedTree(String uri, Model model) throws JastorException {
		UnrootedTree obj = org.cdao.jasper.UnrootedTreeImpl.createUnrootedTree(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.UnrootedTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.UnrootedTreeImpl obj = (org.cdao.jasper.UnrootedTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.UnrootedTreeImpl.getUnrootedTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of UnrootedTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#UnrootedTree
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
	 * Create a new instance of RibonucleotideResidueStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the RibonucleotideResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidueStateDatum createRibonucleotideResidueStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.RibonucleotideResidueStateDatumImpl.createRibonucleotideResidueStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of RibonucleotideResidueStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the RibonucleotideResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidueStateDatum createRibonucleotideResidueStateDatum(String uri, Model model) throws JastorException {
		RibonucleotideResidueStateDatum obj = org.cdao.jasper.RibonucleotideResidueStateDatumImpl.createRibonucleotideResidueStateDatum(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.RibonucleotideResidueStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jasper.RibonucleotideResidueStateDatumImpl obj = (org.cdao.jasper.RibonucleotideResidueStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.RibonucleotideResidueStateDatumImpl.getRibonucleotideResidueStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of RibonucleotideResidueStateDatum for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#RibonucleotideResidueStateDatum
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
	 * Create a new instance of DataMatrixFormat.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DataMatrixFormat
	 * @param model the Jena Model.
	 */
	public static DataMatrixFormat createDataMatrixFormat(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.DataMatrixFormatImpl.createDataMatrixFormat(resource,model);
	}
	
	/**
	 * Create a new instance of DataMatrixFormat.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DataMatrixFormat
	 * @param model the Jena Model.
	 */
	public static DataMatrixFormat createDataMatrixFormat(String uri, Model model) throws JastorException {
		DataMatrixFormat obj = org.cdao.jasper.DataMatrixFormatImpl.createDataMatrixFormat(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of DataMatrixFormat.  Leaves the model unchanged.
	 * @param uri The uri of the DataMatrixFormat
	 * @param model the Jena Model.
	 */
	public static DataMatrixFormat getDataMatrixFormat(String uri, Model model) throws JastorException {
		return getDataMatrixFormat(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of DataMatrixFormat.  Leaves the model unchanged.
	 * @param resource The resource of the DataMatrixFormat
	 * @param model the Jena Model.
	 */
	public static DataMatrixFormat getDataMatrixFormat(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.DataMatrixFormat.class.hashCode()) + resource.toString();
		org.cdao.jasper.DataMatrixFormatImpl obj = (org.cdao.jasper.DataMatrixFormatImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.DataMatrixFormatImpl.getDataMatrixFormat(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DataMatrixFormat for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DataMatrixFormat
	 * @param model the Jena Model
	 * @return a List of DataMatrixFormat
	 */
	public static java.util.List getAllDataMatrixFormat(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,DataMatrixFormat.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDataMatrixFormat(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of TaxonomicLink.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TaxonomicLink
	 * @param model the Jena Model.
	 */
	public static TaxonomicLink createTaxonomicLink(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.TaxonomicLinkImpl.createTaxonomicLink(resource,model);
	}
	
	/**
	 * Create a new instance of TaxonomicLink.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TaxonomicLink
	 * @param model the Jena Model.
	 */
	public static TaxonomicLink createTaxonomicLink(String uri, Model model) throws JastorException {
		TaxonomicLink obj = org.cdao.jasper.TaxonomicLinkImpl.createTaxonomicLink(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.TaxonomicLink.class.hashCode()) + resource.toString();
		org.cdao.jasper.TaxonomicLinkImpl obj = (org.cdao.jasper.TaxonomicLinkImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.TaxonomicLinkImpl.getTaxonomicLink(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TaxonomicLink for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TaxonomicLink
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
	 * Create a new instance of EdgeTransformation.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the EdgeTransformation
	 * @param model the Jena Model.
	 */
	public static EdgeTransformation createEdgeTransformation(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.EdgeTransformationImpl.createEdgeTransformation(resource,model);
	}
	
	/**
	 * Create a new instance of EdgeTransformation.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the EdgeTransformation
	 * @param model the Jena Model.
	 */
	public static EdgeTransformation createEdgeTransformation(String uri, Model model) throws JastorException {
		EdgeTransformation obj = org.cdao.jasper.EdgeTransformationImpl.createEdgeTransformation(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.EdgeTransformation.class.hashCode()) + resource.toString();
		org.cdao.jasper.EdgeTransformationImpl obj = (org.cdao.jasper.EdgeTransformationImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.EdgeTransformationImpl.getEdgeTransformation(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of EdgeTransformation for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#EdgeTransformation
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
	 * Create a new instance of Edge.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Edge
	 * @param model the Jena Model.
	 */
	public static Edge createEdge(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.EdgeImpl.createEdge(resource,model);
	}
	
	/**
	 * Create a new instance of Edge.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Edge
	 * @param model the Jena Model.
	 */
	public static Edge createEdge(String uri, Model model) throws JastorException {
		Edge obj = org.cdao.jasper.EdgeImpl.createEdge(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Edge.class.hashCode()) + resource.toString();
		org.cdao.jasper.EdgeImpl obj = (org.cdao.jasper.EdgeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.EdgeImpl.getEdge(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Edge for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Edge
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
	 * Create a new instance of DirectedEdge.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DirectedEdge
	 * @param model the Jena Model.
	 */
	public static DirectedEdge createDirectedEdge(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.DirectedEdgeImpl.createDirectedEdge(resource,model);
	}
	
	/**
	 * Create a new instance of DirectedEdge.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DirectedEdge
	 * @param model the Jena Model.
	 */
	public static DirectedEdge createDirectedEdge(String uri, Model model) throws JastorException {
		DirectedEdge obj = org.cdao.jasper.DirectedEdgeImpl.createDirectedEdge(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.DirectedEdge.class.hashCode()) + resource.toString();
		org.cdao.jasper.DirectedEdgeImpl obj = (org.cdao.jasper.DirectedEdgeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.DirectedEdgeImpl.getDirectedEdge(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DirectedEdge for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DirectedEdge
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
	 * Create a new instance of HolophyleticGroup.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the HolophyleticGroup
	 * @param model the Jena Model.
	 */
	public static HolophyleticGroup createHolophyleticGroup(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.HolophyleticGroupImpl.createHolophyleticGroup(resource,model);
	}
	
	/**
	 * Create a new instance of HolophyleticGroup.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the HolophyleticGroup
	 * @param model the Jena Model.
	 */
	public static HolophyleticGroup createHolophyleticGroup(String uri, Model model) throws JastorException {
		HolophyleticGroup obj = org.cdao.jasper.HolophyleticGroupImpl.createHolophyleticGroup(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of HolophyleticGroup.  Leaves the model unchanged.
	 * @param uri The uri of the HolophyleticGroup
	 * @param model the Jena Model.
	 */
	public static HolophyleticGroup getHolophyleticGroup(String uri, Model model) throws JastorException {
		return getHolophyleticGroup(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of HolophyleticGroup.  Leaves the model unchanged.
	 * @param resource The resource of the HolophyleticGroup
	 * @param model the Jena Model.
	 */
	public static HolophyleticGroup getHolophyleticGroup(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.HolophyleticGroup.class.hashCode()) + resource.toString();
		org.cdao.jasper.HolophyleticGroupImpl obj = (org.cdao.jasper.HolophyleticGroupImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.HolophyleticGroupImpl.getHolophyleticGroup(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of HolophyleticGroup for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#HolophyleticGroup
	 * @param model the Jena Model
	 * @return a List of HolophyleticGroup
	 */
	public static java.util.List getAllHolophyleticGroup(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,HolophyleticGroup.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getHolophyleticGroup(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of TU.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TU
	 * @param model the Jena Model.
	 */
	public static TU createTU(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.TUImpl.createTU(resource,model);
	}
	
	/**
	 * Create a new instance of TU.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TU
	 * @param model the Jena Model.
	 */
	public static TU createTU(String uri, Model model) throws JastorException {
		TU obj = org.cdao.jasper.TUImpl.createTU(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.TU.class.hashCode()) + resource.toString();
		org.cdao.jasper.TUImpl obj = (org.cdao.jasper.TUImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.TUImpl.getTU(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TU for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TU
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
	 * Create a new instance of TerminalNode.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TerminalNode
	 * @param model the Jena Model.
	 */
	public static TerminalNode createTerminalNode(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.TerminalNodeImpl.createTerminalNode(resource,model);
	}
	
	/**
	 * Create a new instance of TerminalNode.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TerminalNode
	 * @param model the Jena Model.
	 */
	public static TerminalNode createTerminalNode(String uri, Model model) throws JastorException {
		TerminalNode obj = org.cdao.jasper.TerminalNodeImpl.createTerminalNode(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.TerminalNode.class.hashCode()) + resource.toString();
		org.cdao.jasper.TerminalNodeImpl obj = (org.cdao.jasper.TerminalNodeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.TerminalNodeImpl.getTerminalNode(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TerminalNode for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TerminalNode
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
	 * Create a new instance of _Thing.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the _Thing
	 * @param model the Jena Model.
	 */
	public static _Thing create_Thing(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper._ThingImpl.create_Thing(resource,model);
	}
	
	/**
	 * Create a new instance of _Thing.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the _Thing
	 * @param model the Jena Model.
	 */
	public static _Thing create_Thing(String uri, Model model) throws JastorException {
		_Thing obj = org.cdao.jasper._ThingImpl.create_Thing(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper._Thing.class.hashCode()) + resource.toString();
		org.cdao.jasper._ThingImpl obj = (org.cdao.jasper._ThingImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper._ThingImpl.get_Thing(resource, model);
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
	 * Create a new instance of ContinuousCharBayesianLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ContinuousCharBayesianLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharBayesianLengthType createContinuousCharBayesianLengthType(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.ContinuousCharBayesianLengthTypeImpl.createContinuousCharBayesianLengthType(resource,model);
	}
	
	/**
	 * Create a new instance of ContinuousCharBayesianLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ContinuousCharBayesianLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharBayesianLengthType createContinuousCharBayesianLengthType(String uri, Model model) throws JastorException {
		ContinuousCharBayesianLengthType obj = org.cdao.jasper.ContinuousCharBayesianLengthTypeImpl.createContinuousCharBayesianLengthType(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ContinuousCharBayesianLengthType.  Leaves the model unchanged.
	 * @param uri The uri of the ContinuousCharBayesianLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharBayesianLengthType getContinuousCharBayesianLengthType(String uri, Model model) throws JastorException {
		return getContinuousCharBayesianLengthType(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ContinuousCharBayesianLengthType.  Leaves the model unchanged.
	 * @param resource The resource of the ContinuousCharBayesianLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharBayesianLengthType getContinuousCharBayesianLengthType(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.ContinuousCharBayesianLengthType.class.hashCode()) + resource.toString();
		org.cdao.jasper.ContinuousCharBayesianLengthTypeImpl obj = (org.cdao.jasper.ContinuousCharBayesianLengthTypeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.ContinuousCharBayesianLengthTypeImpl.getContinuousCharBayesianLengthType(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ContinuousCharBayesianLengthType for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousCharBayesianLengthType
	 * @param model the Jena Model
	 * @return a List of ContinuousCharBayesianLengthType
	 */
	public static java.util.List getAllContinuousCharBayesianLengthType(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ContinuousCharBayesianLengthType.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getContinuousCharBayesianLengthType(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of AminoAcidResidue.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AminoAcidResidue
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidue createAminoAcidResidue(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.AminoAcidResidueImpl.createAminoAcidResidue(resource,model);
	}
	
	/**
	 * Create a new instance of AminoAcidResidue.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AminoAcidResidue
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidue createAminoAcidResidue(String uri, Model model) throws JastorException {
		AminoAcidResidue obj = org.cdao.jasper.AminoAcidResidueImpl.createAminoAcidResidue(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.AminoAcidResidue.class.hashCode()) + resource.toString();
		org.cdao.jasper.AminoAcidResidueImpl obj = (org.cdao.jasper.AminoAcidResidueImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.AminoAcidResidueImpl.getAminoAcidResidue(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of AminoAcidResidue for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#AminoAcidResidue
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
	 * Create a new instance of Bifurcation.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Bifurcation
	 * @param model the Jena Model.
	 */
	public static Bifurcation createBifurcation(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.BifurcationImpl.createBifurcation(resource,model);
	}
	
	/**
	 * Create a new instance of Bifurcation.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Bifurcation
	 * @param model the Jena Model.
	 */
	public static Bifurcation createBifurcation(String uri, Model model) throws JastorException {
		Bifurcation obj = org.cdao.jasper.BifurcationImpl.createBifurcation(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Bifurcation.  Leaves the model unchanged.
	 * @param uri The uri of the Bifurcation
	 * @param model the Jena Model.
	 */
	public static Bifurcation getBifurcation(String uri, Model model) throws JastorException {
		return getBifurcation(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Bifurcation.  Leaves the model unchanged.
	 * @param resource The resource of the Bifurcation
	 * @param model the Jena Model.
	 */
	public static Bifurcation getBifurcation(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.Bifurcation.class.hashCode()) + resource.toString();
		org.cdao.jasper.BifurcationImpl obj = (org.cdao.jasper.BifurcationImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.BifurcationImpl.getBifurcation(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Bifurcation for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Bifurcation
	 * @param model the Jena Model
	 * @return a List of Bifurcation
	 */
	public static java.util.List getAllBifurcation(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Bifurcation.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getBifurcation(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ReconcileTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ReconcileTree
	 * @param model the Jena Model.
	 */
	public static ReconcileTree createReconcileTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.ReconcileTreeImpl.createReconcileTree(resource,model);
	}
	
	/**
	 * Create a new instance of ReconcileTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ReconcileTree
	 * @param model the Jena Model.
	 */
	public static ReconcileTree createReconcileTree(String uri, Model model) throws JastorException {
		ReconcileTree obj = org.cdao.jasper.ReconcileTreeImpl.createReconcileTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ReconcileTree.  Leaves the model unchanged.
	 * @param uri The uri of the ReconcileTree
	 * @param model the Jena Model.
	 */
	public static ReconcileTree getReconcileTree(String uri, Model model) throws JastorException {
		return getReconcileTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ReconcileTree.  Leaves the model unchanged.
	 * @param resource The resource of the ReconcileTree
	 * @param model the Jena Model.
	 */
	public static ReconcileTree getReconcileTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.ReconcileTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.ReconcileTreeImpl obj = (org.cdao.jasper.ReconcileTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.ReconcileTreeImpl.getReconcileTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ReconcileTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ReconcileTree
	 * @param model the Jena Model
	 * @return a List of ReconcileTree
	 */
	public static java.util.List getAllReconcileTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ReconcileTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getReconcileTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Continuous.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Continuous
	 * @param model the Jena Model.
	 */
	public static Continuous createContinuous(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.ContinuousImpl.createContinuous(resource,model);
	}
	
	/**
	 * Create a new instance of Continuous.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Continuous
	 * @param model the Jena Model.
	 */
	public static Continuous createContinuous(String uri, Model model) throws JastorException {
		Continuous obj = org.cdao.jasper.ContinuousImpl.createContinuous(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Continuous.class.hashCode()) + resource.toString();
		org.cdao.jasper.ContinuousImpl obj = (org.cdao.jasper.ContinuousImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.ContinuousImpl.getContinuous(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Continuous for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Continuous
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
	 * Create a new instance of TimeProportionalLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TimeProportionalLengthType
	 * @param model the Jena Model.
	 */
	public static TimeProportionalLengthType createTimeProportionalLengthType(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.TimeProportionalLengthTypeImpl.createTimeProportionalLengthType(resource,model);
	}
	
	/**
	 * Create a new instance of TimeProportionalLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TimeProportionalLengthType
	 * @param model the Jena Model.
	 */
	public static TimeProportionalLengthType createTimeProportionalLengthType(String uri, Model model) throws JastorException {
		TimeProportionalLengthType obj = org.cdao.jasper.TimeProportionalLengthTypeImpl.createTimeProportionalLengthType(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of TimeProportionalLengthType.  Leaves the model unchanged.
	 * @param uri The uri of the TimeProportionalLengthType
	 * @param model the Jena Model.
	 */
	public static TimeProportionalLengthType getTimeProportionalLengthType(String uri, Model model) throws JastorException {
		return getTimeProportionalLengthType(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of TimeProportionalLengthType.  Leaves the model unchanged.
	 * @param resource The resource of the TimeProportionalLengthType
	 * @param model the Jena Model.
	 */
	public static TimeProportionalLengthType getTimeProportionalLengthType(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.TimeProportionalLengthType.class.hashCode()) + resource.toString();
		org.cdao.jasper.TimeProportionalLengthTypeImpl obj = (org.cdao.jasper.TimeProportionalLengthTypeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.TimeProportionalLengthTypeImpl.getTimeProportionalLengthType(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TimeProportionalLengthType for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TimeProportionalLengthType
	 * @param model the Jena Model
	 * @return a List of TimeProportionalLengthType
	 */
	public static java.util.List getAllTimeProportionalLengthType(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,TimeProportionalLengthType.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getTimeProportionalLengthType(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of DesoxiRibonucleotideResidue.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DesoxiRibonucleotideResidue
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidue createDesoxiRibonucleotideResidue(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.DesoxiRibonucleotideResidueImpl.createDesoxiRibonucleotideResidue(resource,model);
	}
	
	/**
	 * Create a new instance of DesoxiRibonucleotideResidue.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DesoxiRibonucleotideResidue
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidue createDesoxiRibonucleotideResidue(String uri, Model model) throws JastorException {
		DesoxiRibonucleotideResidue obj = org.cdao.jasper.DesoxiRibonucleotideResidueImpl.createDesoxiRibonucleotideResidue(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.DesoxiRibonucleotideResidue.class.hashCode()) + resource.toString();
		org.cdao.jasper.DesoxiRibonucleotideResidueImpl obj = (org.cdao.jasper.DesoxiRibonucleotideResidueImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.DesoxiRibonucleotideResidueImpl.getDesoxiRibonucleotideResidue(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DesoxiRibonucleotideResidue for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DesoxiRibonucleotideResidue
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
	 * Create a new instance of GenBankDataMatrix.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the GenBankDataMatrix
	 * @param model the Jena Model.
	 */
	public static GenBankDataMatrix createGenBankDataMatrix(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.GenBankDataMatrixImpl.createGenBankDataMatrix(resource,model);
	}
	
	/**
	 * Create a new instance of GenBankDataMatrix.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the GenBankDataMatrix
	 * @param model the Jena Model.
	 */
	public static GenBankDataMatrix createGenBankDataMatrix(String uri, Model model) throws JastorException {
		GenBankDataMatrix obj = org.cdao.jasper.GenBankDataMatrixImpl.createGenBankDataMatrix(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of GenBankDataMatrix.  Leaves the model unchanged.
	 * @param uri The uri of the GenBankDataMatrix
	 * @param model the Jena Model.
	 */
	public static GenBankDataMatrix getGenBankDataMatrix(String uri, Model model) throws JastorException {
		return getGenBankDataMatrix(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of GenBankDataMatrix.  Leaves the model unchanged.
	 * @param resource The resource of the GenBankDataMatrix
	 * @param model the Jena Model.
	 */
	public static GenBankDataMatrix getGenBankDataMatrix(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.GenBankDataMatrix.class.hashCode()) + resource.toString();
		org.cdao.jasper.GenBankDataMatrixImpl obj = (org.cdao.jasper.GenBankDataMatrixImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.GenBankDataMatrixImpl.getGenBankDataMatrix(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of GenBankDataMatrix for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#GenBankDataMatrix
	 * @param model the Jena Model
	 * @return a List of GenBankDataMatrix
	 */
	public static java.util.List getAllGenBankDataMatrix(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,GenBankDataMatrix.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getGenBankDataMatrix(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CoordinatePoint.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CoordinatePoint
	 * @param model the Jena Model.
	 */
	public static CoordinatePoint createCoordinatePoint(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CoordinatePointImpl.createCoordinatePoint(resource,model);
	}
	
	/**
	 * Create a new instance of CoordinatePoint.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CoordinatePoint
	 * @param model the Jena Model.
	 */
	public static CoordinatePoint createCoordinatePoint(String uri, Model model) throws JastorException {
		CoordinatePoint obj = org.cdao.jasper.CoordinatePointImpl.createCoordinatePoint(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.CoordinatePoint.class.hashCode()) + resource.toString();
		org.cdao.jasper.CoordinatePointImpl obj = (org.cdao.jasper.CoordinatePointImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CoordinatePointImpl.getCoordinatePoint(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CoordinatePoint for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CoordinatePoint
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
	 * Create a new instance of FullyResolvedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the FullyResolvedTree
	 * @param model the Jena Model.
	 */
	public static FullyResolvedTree createFullyResolvedTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.FullyResolvedTreeImpl.createFullyResolvedTree(resource,model);
	}
	
	/**
	 * Create a new instance of FullyResolvedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the FullyResolvedTree
	 * @param model the Jena Model.
	 */
	public static FullyResolvedTree createFullyResolvedTree(String uri, Model model) throws JastorException {
		FullyResolvedTree obj = org.cdao.jasper.FullyResolvedTreeImpl.createFullyResolvedTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of FullyResolvedTree.  Leaves the model unchanged.
	 * @param uri The uri of the FullyResolvedTree
	 * @param model the Jena Model.
	 */
	public static FullyResolvedTree getFullyResolvedTree(String uri, Model model) throws JastorException {
		return getFullyResolvedTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of FullyResolvedTree.  Leaves the model unchanged.
	 * @param resource The resource of the FullyResolvedTree
	 * @param model the Jena Model.
	 */
	public static FullyResolvedTree getFullyResolvedTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.FullyResolvedTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.FullyResolvedTreeImpl obj = (org.cdao.jasper.FullyResolvedTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.FullyResolvedTreeImpl.getFullyResolvedTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of FullyResolvedTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#FullyResolvedTree
	 * @param model the Jena Model
	 * @return a List of FullyResolvedTree
	 */
	public static java.util.List getAllFullyResolvedTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,FullyResolvedTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getFullyResolvedTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of DesoxiRibonucleotideResidueCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DesoxiRibonucleotideResidueCharacter
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidueCharacter createDesoxiRibonucleotideResidueCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.DesoxiRibonucleotideResidueCharacterImpl.createDesoxiRibonucleotideResidueCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of DesoxiRibonucleotideResidueCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DesoxiRibonucleotideResidueCharacter
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidueCharacter createDesoxiRibonucleotideResidueCharacter(String uri, Model model) throws JastorException {
		DesoxiRibonucleotideResidueCharacter obj = org.cdao.jasper.DesoxiRibonucleotideResidueCharacterImpl.createDesoxiRibonucleotideResidueCharacter(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.DesoxiRibonucleotideResidueCharacter.class.hashCode()) + resource.toString();
		org.cdao.jasper.DesoxiRibonucleotideResidueCharacterImpl obj = (org.cdao.jasper.DesoxiRibonucleotideResidueCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.DesoxiRibonucleotideResidueCharacterImpl.getDesoxiRibonucleotideResidueCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DesoxiRibonucleotideResidueCharacter for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DesoxiRibonucleotideResidueCharacter
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
	 * Create a new instance of Lineage.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Lineage
	 * @param model the Jena Model.
	 */
	public static Lineage createLineage(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.LineageImpl.createLineage(resource,model);
	}
	
	/**
	 * Create a new instance of Lineage.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Lineage
	 * @param model the Jena Model.
	 */
	public static Lineage createLineage(String uri, Model model) throws JastorException {
		Lineage obj = org.cdao.jasper.LineageImpl.createLineage(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Lineage.class.hashCode()) + resource.toString();
		org.cdao.jasper.LineageImpl obj = (org.cdao.jasper.LineageImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.LineageImpl.getLineage(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Lineage for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Lineage
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
	 * Create a new instance of Dichotomy.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Dichotomy
	 * @param model the Jena Model.
	 */
	public static Dichotomy createDichotomy(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.DichotomyImpl.createDichotomy(resource,model);
	}
	
	/**
	 * Create a new instance of Dichotomy.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Dichotomy
	 * @param model the Jena Model.
	 */
	public static Dichotomy createDichotomy(String uri, Model model) throws JastorException {
		Dichotomy obj = org.cdao.jasper.DichotomyImpl.createDichotomy(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Dichotomy.  Leaves the model unchanged.
	 * @param uri The uri of the Dichotomy
	 * @param model the Jena Model.
	 */
	public static Dichotomy getDichotomy(String uri, Model model) throws JastorException {
		return getDichotomy(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Dichotomy.  Leaves the model unchanged.
	 * @param resource The resource of the Dichotomy
	 * @param model the Jena Model.
	 */
	public static Dichotomy getDichotomy(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.Dichotomy.class.hashCode()) + resource.toString();
		org.cdao.jasper.DichotomyImpl obj = (org.cdao.jasper.DichotomyImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.DichotomyImpl.getDichotomy(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Dichotomy for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Dichotomy
	 * @param model the Jena Model
	 * @return a List of Dichotomy
	 */
	public static java.util.List getAllDichotomy(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Dichotomy.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDichotomy(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of NewickTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the NewickTree
	 * @param model the Jena Model.
	 */
	public static NewickTree createNewickTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.NewickTreeImpl.createNewickTree(resource,model);
	}
	
	/**
	 * Create a new instance of NewickTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the NewickTree
	 * @param model the Jena Model.
	 */
	public static NewickTree createNewickTree(String uri, Model model) throws JastorException {
		NewickTree obj = org.cdao.jasper.NewickTreeImpl.createNewickTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of NewickTree.  Leaves the model unchanged.
	 * @param uri The uri of the NewickTree
	 * @param model the Jena Model.
	 */
	public static NewickTree getNewickTree(String uri, Model model) throws JastorException {
		return getNewickTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of NewickTree.  Leaves the model unchanged.
	 * @param resource The resource of the NewickTree
	 * @param model the Jena Model.
	 */
	public static NewickTree getNewickTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.NewickTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.NewickTreeImpl obj = (org.cdao.jasper.NewickTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.NewickTreeImpl.getNewickTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of NewickTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#NewickTree
	 * @param model the Jena Model
	 * @return a List of NewickTree
	 */
	public static java.util.List getAllNewickTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,NewickTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getNewickTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CommonAncestralNode.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CommonAncestralNode
	 * @param model the Jena Model.
	 */
	public static CommonAncestralNode createCommonAncestralNode(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CommonAncestralNodeImpl.createCommonAncestralNode(resource,model);
	}
	
	/**
	 * Create a new instance of CommonAncestralNode.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CommonAncestralNode
	 * @param model the Jena Model.
	 */
	public static CommonAncestralNode createCommonAncestralNode(String uri, Model model) throws JastorException {
		CommonAncestralNode obj = org.cdao.jasper.CommonAncestralNodeImpl.createCommonAncestralNode(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.CommonAncestralNode.class.hashCode()) + resource.toString();
		org.cdao.jasper.CommonAncestralNodeImpl obj = (org.cdao.jasper.CommonAncestralNodeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CommonAncestralNodeImpl.getCommonAncestralNode(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CommonAncestralNode for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CommonAncestralNode
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
	 * Create a new instance of PHYLIPTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the PHYLIPTree
	 * @param model the Jena Model.
	 */
	public static PHYLIPTree createPHYLIPTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.PHYLIPTreeImpl.createPHYLIPTree(resource,model);
	}
	
	/**
	 * Create a new instance of PHYLIPTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the PHYLIPTree
	 * @param model the Jena Model.
	 */
	public static PHYLIPTree createPHYLIPTree(String uri, Model model) throws JastorException {
		PHYLIPTree obj = org.cdao.jasper.PHYLIPTreeImpl.createPHYLIPTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of PHYLIPTree.  Leaves the model unchanged.
	 * @param uri The uri of the PHYLIPTree
	 * @param model the Jena Model.
	 */
	public static PHYLIPTree getPHYLIPTree(String uri, Model model) throws JastorException {
		return getPHYLIPTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of PHYLIPTree.  Leaves the model unchanged.
	 * @param resource The resource of the PHYLIPTree
	 * @param model the Jena Model.
	 */
	public static PHYLIPTree getPHYLIPTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.PHYLIPTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.PHYLIPTreeImpl obj = (org.cdao.jasper.PHYLIPTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.PHYLIPTreeImpl.getPHYLIPTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of PHYLIPTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#PHYLIPTree
	 * @param model the Jena Model
	 * @return a List of PHYLIPTree
	 */
	public static java.util.List getAllPHYLIPTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,PHYLIPTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPHYLIPTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of NEXUSTreeBlock.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the NEXUSTreeBlock
	 * @param model the Jena Model.
	 */
	public static NEXUSTreeBlock createNEXUSTreeBlock(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.NEXUSTreeBlockImpl.createNEXUSTreeBlock(resource,model);
	}
	
	/**
	 * Create a new instance of NEXUSTreeBlock.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the NEXUSTreeBlock
	 * @param model the Jena Model.
	 */
	public static NEXUSTreeBlock createNEXUSTreeBlock(String uri, Model model) throws JastorException {
		NEXUSTreeBlock obj = org.cdao.jasper.NEXUSTreeBlockImpl.createNEXUSTreeBlock(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of NEXUSTreeBlock.  Leaves the model unchanged.
	 * @param uri The uri of the NEXUSTreeBlock
	 * @param model the Jena Model.
	 */
	public static NEXUSTreeBlock getNEXUSTreeBlock(String uri, Model model) throws JastorException {
		return getNEXUSTreeBlock(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of NEXUSTreeBlock.  Leaves the model unchanged.
	 * @param resource The resource of the NEXUSTreeBlock
	 * @param model the Jena Model.
	 */
	public static NEXUSTreeBlock getNEXUSTreeBlock(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.NEXUSTreeBlock.class.hashCode()) + resource.toString();
		org.cdao.jasper.NEXUSTreeBlockImpl obj = (org.cdao.jasper.NEXUSTreeBlockImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.NEXUSTreeBlockImpl.getNEXUSTreeBlock(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of NEXUSTreeBlock for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#NEXUSTreeBlock
	 * @param model the Jena Model
	 * @return a List of NEXUSTreeBlock
	 */
	public static java.util.List getAllNEXUSTreeBlock(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,NEXUSTreeBlock.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getNEXUSTreeBlock(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Character.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Character
	 * @param model the Jena Model.
	 */
	public static Character createCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CharacterImpl.createCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of Character.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Character
	 * @param model the Jena Model.
	 */
	public static Character createCharacter(String uri, Model model) throws JastorException {
		Character obj = org.cdao.jasper.CharacterImpl.createCharacter(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Character.class.hashCode()) + resource.toString();
		org.cdao.jasper.CharacterImpl obj = (org.cdao.jasper.CharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CharacterImpl.getCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Character for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Character
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
	 * Create a new instance of UncertainStateDomain.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the UncertainStateDomain
	 * @param model the Jena Model.
	 */
	public static UncertainStateDomain createUncertainStateDomain(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.UncertainStateDomainImpl.createUncertainStateDomain(resource,model);
	}
	
	/**
	 * Create a new instance of UncertainStateDomain.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the UncertainStateDomain
	 * @param model the Jena Model.
	 */
	public static UncertainStateDomain createUncertainStateDomain(String uri, Model model) throws JastorException {
		UncertainStateDomain obj = org.cdao.jasper.UncertainStateDomainImpl.createUncertainStateDomain(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.UncertainStateDomain.class.hashCode()) + resource.toString();
		org.cdao.jasper.UncertainStateDomainImpl obj = (org.cdao.jasper.UncertainStateDomainImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.UncertainStateDomainImpl.getUncertainStateDomain(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of UncertainStateDomain for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#UncertainStateDomain
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
	 * Create a new instance of EdgeLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the EdgeLengthType
	 * @param model the Jena Model.
	 */
	public static EdgeLengthType createEdgeLengthType(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.EdgeLengthTypeImpl.createEdgeLengthType(resource,model);
	}
	
	/**
	 * Create a new instance of EdgeLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the EdgeLengthType
	 * @param model the Jena Model.
	 */
	public static EdgeLengthType createEdgeLengthType(String uri, Model model) throws JastorException {
		EdgeLengthType obj = org.cdao.jasper.EdgeLengthTypeImpl.createEdgeLengthType(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of EdgeLengthType.  Leaves the model unchanged.
	 * @param uri The uri of the EdgeLengthType
	 * @param model the Jena Model.
	 */
	public static EdgeLengthType getEdgeLengthType(String uri, Model model) throws JastorException {
		return getEdgeLengthType(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of EdgeLengthType.  Leaves the model unchanged.
	 * @param resource The resource of the EdgeLengthType
	 * @param model the Jena Model.
	 */
	public static EdgeLengthType getEdgeLengthType(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.EdgeLengthType.class.hashCode()) + resource.toString();
		org.cdao.jasper.EdgeLengthTypeImpl obj = (org.cdao.jasper.EdgeLengthTypeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.EdgeLengthTypeImpl.getEdgeLengthType(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of EdgeLengthType for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#EdgeLengthType
	 * @param model the Jena Model
	 * @return a List of EdgeLengthType
	 */
	public static java.util.List getAllEdgeLengthType(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,EdgeLengthType.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getEdgeLengthType(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of DesoxiRibonucleotideResidueStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DesoxiRibonucleotideResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidueStateDatum createDesoxiRibonucleotideResidueStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.createDesoxiRibonucleotideResidueStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of DesoxiRibonucleotideResidueStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DesoxiRibonucleotideResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static DesoxiRibonucleotideResidueStateDatum createDesoxiRibonucleotideResidueStateDatum(String uri, Model model) throws JastorException {
		DesoxiRibonucleotideResidueStateDatum obj = org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.createDesoxiRibonucleotideResidueStateDatum(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.DesoxiRibonucleotideResidueStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl obj = (org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.DesoxiRibonucleotideResidueStateDatumImpl.getDesoxiRibonucleotideResidueStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DesoxiRibonucleotideResidueStateDatum for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DesoxiRibonucleotideResidueStateDatum
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
	 * Create a new instance of StandardStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the StandardStateDatum
	 * @param model the Jena Model.
	 */
	public static StandardStateDatum createStandardStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.StandardStateDatumImpl.createStandardStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of StandardStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the StandardStateDatum
	 * @param model the Jena Model.
	 */
	public static StandardStateDatum createStandardStateDatum(String uri, Model model) throws JastorException {
		StandardStateDatum obj = org.cdao.jasper.StandardStateDatumImpl.createStandardStateDatum(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.StandardStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jasper.StandardStateDatumImpl obj = (org.cdao.jasper.StandardStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.StandardStateDatumImpl.getStandardStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of StandardStateDatum for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#StandardStateDatum
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
	 * Create a new instance of ReticulateEvolution.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ReticulateEvolution
	 * @param model the Jena Model.
	 */
	public static ReticulateEvolution createReticulateEvolution(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.ReticulateEvolutionImpl.createReticulateEvolution(resource,model);
	}
	
	/**
	 * Create a new instance of ReticulateEvolution.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ReticulateEvolution
	 * @param model the Jena Model.
	 */
	public static ReticulateEvolution createReticulateEvolution(String uri, Model model) throws JastorException {
		ReticulateEvolution obj = org.cdao.jasper.ReticulateEvolutionImpl.createReticulateEvolution(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ReticulateEvolution.  Leaves the model unchanged.
	 * @param uri The uri of the ReticulateEvolution
	 * @param model the Jena Model.
	 */
	public static ReticulateEvolution getReticulateEvolution(String uri, Model model) throws JastorException {
		return getReticulateEvolution(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ReticulateEvolution.  Leaves the model unchanged.
	 * @param resource The resource of the ReticulateEvolution
	 * @param model the Jena Model.
	 */
	public static ReticulateEvolution getReticulateEvolution(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.ReticulateEvolution.class.hashCode()) + resource.toString();
		org.cdao.jasper.ReticulateEvolutionImpl obj = (org.cdao.jasper.ReticulateEvolutionImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.ReticulateEvolutionImpl.getReticulateEvolution(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ReticulateEvolution for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ReticulateEvolution
	 * @param model the Jena Model
	 * @return a List of ReticulateEvolution
	 */
	public static java.util.List getAllReticulateEvolution(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ReticulateEvolution.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getReticulateEvolution(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of MonophyleticGroup.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MonophyleticGroup
	 * @param model the Jena Model.
	 */
	public static MonophyleticGroup createMonophyleticGroup(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.MonophyleticGroupImpl.createMonophyleticGroup(resource,model);
	}
	
	/**
	 * Create a new instance of MonophyleticGroup.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MonophyleticGroup
	 * @param model the Jena Model.
	 */
	public static MonophyleticGroup createMonophyleticGroup(String uri, Model model) throws JastorException {
		MonophyleticGroup obj = org.cdao.jasper.MonophyleticGroupImpl.createMonophyleticGroup(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of MonophyleticGroup.  Leaves the model unchanged.
	 * @param uri The uri of the MonophyleticGroup
	 * @param model the Jena Model.
	 */
	public static MonophyleticGroup getMonophyleticGroup(String uri, Model model) throws JastorException {
		return getMonophyleticGroup(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of MonophyleticGroup.  Leaves the model unchanged.
	 * @param resource The resource of the MonophyleticGroup
	 * @param model the Jena Model.
	 */
	public static MonophyleticGroup getMonophyleticGroup(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.MonophyleticGroup.class.hashCode()) + resource.toString();
		org.cdao.jasper.MonophyleticGroupImpl obj = (org.cdao.jasper.MonophyleticGroupImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.MonophyleticGroupImpl.getMonophyleticGroup(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MonophyleticGroup for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#MonophyleticGroup
	 * @param model the Jena Model
	 * @return a List of MonophyleticGroup
	 */
	public static java.util.List getAllMonophyleticGroup(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,MonophyleticGroup.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMonophyleticGroup(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Generic__State.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Generic__State
	 * @param model the Jena Model.
	 */
	public static Generic__State createGeneric__State(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.Generic__StateImpl.createGeneric__State(resource,model);
	}
	
	/**
	 * Create a new instance of Generic__State.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Generic__State
	 * @param model the Jena Model.
	 */
	public static Generic__State createGeneric__State(String uri, Model model) throws JastorException {
		Generic__State obj = org.cdao.jasper.Generic__StateImpl.createGeneric__State(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Generic__State.class.hashCode()) + resource.toString();
		org.cdao.jasper.Generic__StateImpl obj = (org.cdao.jasper.Generic__StateImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.Generic__StateImpl.getGeneric__State(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Generic__State for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Generic_State
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
	 * Create a new instance of DiscreteCharacterLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DiscreteCharacterLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharacterLengthType createDiscreteCharacterLengthType(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.DiscreteCharacterLengthTypeImpl.createDiscreteCharacterLengthType(resource,model);
	}
	
	/**
	 * Create a new instance of DiscreteCharacterLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DiscreteCharacterLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharacterLengthType createDiscreteCharacterLengthType(String uri, Model model) throws JastorException {
		DiscreteCharacterLengthType obj = org.cdao.jasper.DiscreteCharacterLengthTypeImpl.createDiscreteCharacterLengthType(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of DiscreteCharacterLengthType.  Leaves the model unchanged.
	 * @param uri The uri of the DiscreteCharacterLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharacterLengthType getDiscreteCharacterLengthType(String uri, Model model) throws JastorException {
		return getDiscreteCharacterLengthType(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of DiscreteCharacterLengthType.  Leaves the model unchanged.
	 * @param resource The resource of the DiscreteCharacterLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharacterLengthType getDiscreteCharacterLengthType(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.DiscreteCharacterLengthType.class.hashCode()) + resource.toString();
		org.cdao.jasper.DiscreteCharacterLengthTypeImpl obj = (org.cdao.jasper.DiscreteCharacterLengthTypeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.DiscreteCharacterLengthTypeImpl.getDiscreteCharacterLengthType(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DiscreteCharacterLengthType for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DiscreteCharacterLengthType
	 * @param model the Jena Model
	 * @return a List of DiscreteCharacterLengthType
	 */
	public static java.util.List getAllDiscreteCharacterLengthType(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,DiscreteCharacterLengthType.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDiscreteCharacterLengthType(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of DiscreteCharLikelihoodLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DiscreteCharLikelihoodLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharLikelihoodLengthType createDiscreteCharLikelihoodLengthType(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.DiscreteCharLikelihoodLengthTypeImpl.createDiscreteCharLikelihoodLengthType(resource,model);
	}
	
	/**
	 * Create a new instance of DiscreteCharLikelihoodLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DiscreteCharLikelihoodLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharLikelihoodLengthType createDiscreteCharLikelihoodLengthType(String uri, Model model) throws JastorException {
		DiscreteCharLikelihoodLengthType obj = org.cdao.jasper.DiscreteCharLikelihoodLengthTypeImpl.createDiscreteCharLikelihoodLengthType(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of DiscreteCharLikelihoodLengthType.  Leaves the model unchanged.
	 * @param uri The uri of the DiscreteCharLikelihoodLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharLikelihoodLengthType getDiscreteCharLikelihoodLengthType(String uri, Model model) throws JastorException {
		return getDiscreteCharLikelihoodLengthType(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of DiscreteCharLikelihoodLengthType.  Leaves the model unchanged.
	 * @param resource The resource of the DiscreteCharLikelihoodLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharLikelihoodLengthType getDiscreteCharLikelihoodLengthType(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.DiscreteCharLikelihoodLengthType.class.hashCode()) + resource.toString();
		org.cdao.jasper.DiscreteCharLikelihoodLengthTypeImpl obj = (org.cdao.jasper.DiscreteCharLikelihoodLengthTypeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.DiscreteCharLikelihoodLengthTypeImpl.getDiscreteCharLikelihoodLengthType(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DiscreteCharLikelihoodLengthType for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DiscreteCharLikelihoodLengthType
	 * @param model the Jena Model
	 * @return a List of DiscreteCharLikelihoodLengthType
	 */
	public static java.util.List getAllDiscreteCharLikelihoodLengthType(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,DiscreteCharLikelihoodLengthType.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDiscreteCharLikelihoodLengthType(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of SetOfThings.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SetOfThings
	 * @param model the Jena Model.
	 */
	public static SetOfThings createSetOfThings(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.SetOfThingsImpl.createSetOfThings(resource,model);
	}
	
	/**
	 * Create a new instance of SetOfThings.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SetOfThings
	 * @param model the Jena Model.
	 */
	public static SetOfThings createSetOfThings(String uri, Model model) throws JastorException {
		SetOfThings obj = org.cdao.jasper.SetOfThingsImpl.createSetOfThings(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.SetOfThings.class.hashCode()) + resource.toString();
		org.cdao.jasper.SetOfThingsImpl obj = (org.cdao.jasper.SetOfThingsImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.SetOfThingsImpl.getSetOfThings(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SetOfThings for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#SetOfThings
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
	 * Create a new instance of CoordinateList.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CoordinateList
	 * @param model the Jena Model.
	 */
	public static CoordinateList createCoordinateList(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CoordinateListImpl.createCoordinateList(resource,model);
	}
	
	/**
	 * Create a new instance of CoordinateList.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CoordinateList
	 * @param model the Jena Model.
	 */
	public static CoordinateList createCoordinateList(String uri, Model model) throws JastorException {
		CoordinateList obj = org.cdao.jasper.CoordinateListImpl.createCoordinateList(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.CoordinateList.class.hashCode()) + resource.toString();
		org.cdao.jasper.CoordinateListImpl obj = (org.cdao.jasper.CoordinateListImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CoordinateListImpl.getCoordinateList(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CoordinateList for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CoordinateList
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
	 * Create a new instance of CharacterStateDataMatrix.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CharacterStateDataMatrix
	 * @param model the Jena Model.
	 */
	public static CharacterStateDataMatrix createCharacterStateDataMatrix(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CharacterStateDataMatrixImpl.createCharacterStateDataMatrix(resource,model);
	}
	
	/**
	 * Create a new instance of CharacterStateDataMatrix.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CharacterStateDataMatrix
	 * @param model the Jena Model.
	 */
	public static CharacterStateDataMatrix createCharacterStateDataMatrix(String uri, Model model) throws JastorException {
		CharacterStateDataMatrix obj = org.cdao.jasper.CharacterStateDataMatrixImpl.createCharacterStateDataMatrix(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.CharacterStateDataMatrix.class.hashCode()) + resource.toString();
		org.cdao.jasper.CharacterStateDataMatrixImpl obj = (org.cdao.jasper.CharacterStateDataMatrixImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CharacterStateDataMatrixImpl.getCharacterStateDataMatrix(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CharacterStateDataMatrix for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDataMatrix
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
	 * Create a new instance of SpeciesTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SpeciesTree
	 * @param model the Jena Model.
	 */
	public static SpeciesTree createSpeciesTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.SpeciesTreeImpl.createSpeciesTree(resource,model);
	}
	
	/**
	 * Create a new instance of SpeciesTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SpeciesTree
	 * @param model the Jena Model.
	 */
	public static SpeciesTree createSpeciesTree(String uri, Model model) throws JastorException {
		SpeciesTree obj = org.cdao.jasper.SpeciesTreeImpl.createSpeciesTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of SpeciesTree.  Leaves the model unchanged.
	 * @param uri The uri of the SpeciesTree
	 * @param model the Jena Model.
	 */
	public static SpeciesTree getSpeciesTree(String uri, Model model) throws JastorException {
		return getSpeciesTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of SpeciesTree.  Leaves the model unchanged.
	 * @param resource The resource of the SpeciesTree
	 * @param model the Jena Model.
	 */
	public static SpeciesTree getSpeciesTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.SpeciesTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.SpeciesTreeImpl obj = (org.cdao.jasper.SpeciesTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.SpeciesTreeImpl.getSpeciesTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SpeciesTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#SpeciesTree
	 * @param model the Jena Model
	 * @return a List of SpeciesTree
	 */
	public static java.util.List getAllSpeciesTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,SpeciesTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getSpeciesTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Network.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Network
	 * @param model the Jena Model.
	 */
	public static Network createNetwork(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.NetworkImpl.createNetwork(resource,model);
	}
	
	/**
	 * Create a new instance of Network.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Network
	 * @param model the Jena Model.
	 */
	public static Network createNetwork(String uri, Model model) throws JastorException {
		Network obj = org.cdao.jasper.NetworkImpl.createNetwork(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Network.class.hashCode()) + resource.toString();
		org.cdao.jasper.NetworkImpl obj = (org.cdao.jasper.NetworkImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.NetworkImpl.getNetwork(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Network for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Network
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
	 * Create a new instance of UnresolvedUnrootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the UnresolvedUnrootedTree
	 * @param model the Jena Model.
	 */
	public static UnresolvedUnrootedTree createUnresolvedUnrootedTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.UnresolvedUnrootedTreeImpl.createUnresolvedUnrootedTree(resource,model);
	}
	
	/**
	 * Create a new instance of UnresolvedUnrootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the UnresolvedUnrootedTree
	 * @param model the Jena Model.
	 */
	public static UnresolvedUnrootedTree createUnresolvedUnrootedTree(String uri, Model model) throws JastorException {
		UnresolvedUnrootedTree obj = org.cdao.jasper.UnresolvedUnrootedTreeImpl.createUnresolvedUnrootedTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of UnresolvedUnrootedTree.  Leaves the model unchanged.
	 * @param uri The uri of the UnresolvedUnrootedTree
	 * @param model the Jena Model.
	 */
	public static UnresolvedUnrootedTree getUnresolvedUnrootedTree(String uri, Model model) throws JastorException {
		return getUnresolvedUnrootedTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of UnresolvedUnrootedTree.  Leaves the model unchanged.
	 * @param resource The resource of the UnresolvedUnrootedTree
	 * @param model the Jena Model.
	 */
	public static UnresolvedUnrootedTree getUnresolvedUnrootedTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.UnresolvedUnrootedTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.UnresolvedUnrootedTreeImpl obj = (org.cdao.jasper.UnresolvedUnrootedTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.UnresolvedUnrootedTreeImpl.getUnresolvedUnrootedTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of UnresolvedUnrootedTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#UnresolvedUnrootedTree
	 * @param model the Jena Model
	 * @return a List of UnresolvedUnrootedTree
	 */
	public static java.util.List getAllUnresolvedUnrootedTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,UnresolvedUnrootedTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getUnresolvedUnrootedTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CategoricalCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CategoricalCharacter
	 * @param model the Jena Model.
	 */
	public static CategoricalCharacter createCategoricalCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CategoricalCharacterImpl.createCategoricalCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of CategoricalCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CategoricalCharacter
	 * @param model the Jena Model.
	 */
	public static CategoricalCharacter createCategoricalCharacter(String uri, Model model) throws JastorException {
		CategoricalCharacter obj = org.cdao.jasper.CategoricalCharacterImpl.createCategoricalCharacter(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.CategoricalCharacter.class.hashCode()) + resource.toString();
		org.cdao.jasper.CategoricalCharacterImpl obj = (org.cdao.jasper.CategoricalCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CategoricalCharacterImpl.getCategoricalCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CategoricalCharacter for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CategoricalCharacter
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
	 * Create a new instance of AminoAcidResidueStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AminoAcidResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidueStateDatum createAminoAcidResidueStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.AminoAcidResidueStateDatumImpl.createAminoAcidResidueStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of AminoAcidResidueStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AminoAcidResidueStateDatum
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidueStateDatum createAminoAcidResidueStateDatum(String uri, Model model) throws JastorException {
		AminoAcidResidueStateDatum obj = org.cdao.jasper.AminoAcidResidueStateDatumImpl.createAminoAcidResidueStateDatum(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.AminoAcidResidueStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jasper.AminoAcidResidueStateDatumImpl obj = (org.cdao.jasper.AminoAcidResidueStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.AminoAcidResidueStateDatumImpl.getAminoAcidResidueStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of AminoAcidResidueStateDatum for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#AminoAcidResidueStateDatum
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
	 * Create a new instance of CompoundStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CompoundStateDatum
	 * @param model the Jena Model.
	 */
	public static CompoundStateDatum createCompoundStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CompoundStateDatumImpl.createCompoundStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of CompoundStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CompoundStateDatum
	 * @param model the Jena Model.
	 */
	public static CompoundStateDatum createCompoundStateDatum(String uri, Model model) throws JastorException {
		CompoundStateDatum obj = org.cdao.jasper.CompoundStateDatumImpl.createCompoundStateDatum(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.CompoundStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jasper.CompoundStateDatumImpl obj = (org.cdao.jasper.CompoundStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CompoundStateDatumImpl.getCompoundStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CompoundStateDatum for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CompoundStateDatum
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
	 * Create a new instance of CharacterStateDomain.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CharacterStateDomain
	 * @param model the Jena Model.
	 */
	public static CharacterStateDomain createCharacterStateDomain(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CharacterStateDomainImpl.createCharacterStateDomain(resource,model);
	}
	
	/**
	 * Create a new instance of CharacterStateDomain.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CharacterStateDomain
	 * @param model the Jena Model.
	 */
	public static CharacterStateDomain createCharacterStateDomain(String uri, Model model) throws JastorException {
		CharacterStateDomain obj = org.cdao.jasper.CharacterStateDomainImpl.createCharacterStateDomain(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.CharacterStateDomain.class.hashCode()) + resource.toString();
		org.cdao.jasper.CharacterStateDomainImpl obj = (org.cdao.jasper.CharacterStateDomainImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CharacterStateDomainImpl.getCharacterStateDomain(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CharacterStateDomain for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDomain
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
	 * Create a new instance of PolyphyleticGroup.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the PolyphyleticGroup
	 * @param model the Jena Model.
	 */
	public static PolyphyleticGroup createPolyphyleticGroup(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.PolyphyleticGroupImpl.createPolyphyleticGroup(resource,model);
	}
	
	/**
	 * Create a new instance of PolyphyleticGroup.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the PolyphyleticGroup
	 * @param model the Jena Model.
	 */
	public static PolyphyleticGroup createPolyphyleticGroup(String uri, Model model) throws JastorException {
		PolyphyleticGroup obj = org.cdao.jasper.PolyphyleticGroupImpl.createPolyphyleticGroup(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of PolyphyleticGroup.  Leaves the model unchanged.
	 * @param uri The uri of the PolyphyleticGroup
	 * @param model the Jena Model.
	 */
	public static PolyphyleticGroup getPolyphyleticGroup(String uri, Model model) throws JastorException {
		return getPolyphyleticGroup(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of PolyphyleticGroup.  Leaves the model unchanged.
	 * @param resource The resource of the PolyphyleticGroup
	 * @param model the Jena Model.
	 */
	public static PolyphyleticGroup getPolyphyleticGroup(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.PolyphyleticGroup.class.hashCode()) + resource.toString();
		org.cdao.jasper.PolyphyleticGroupImpl obj = (org.cdao.jasper.PolyphyleticGroupImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.PolyphyleticGroupImpl.getPolyphyleticGroup(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of PolyphyleticGroup for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#PolyphyleticGroup
	 * @param model the Jena Model
	 * @return a List of PolyphyleticGroup
	 */
	public static java.util.List getAllPolyphyleticGroup(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,PolyphyleticGroup.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPolyphyleticGroup(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of FASTADataMatrix.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the FASTADataMatrix
	 * @param model the Jena Model.
	 */
	public static FASTADataMatrix createFASTADataMatrix(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.FASTADataMatrixImpl.createFASTADataMatrix(resource,model);
	}
	
	/**
	 * Create a new instance of FASTADataMatrix.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the FASTADataMatrix
	 * @param model the Jena Model.
	 */
	public static FASTADataMatrix createFASTADataMatrix(String uri, Model model) throws JastorException {
		FASTADataMatrix obj = org.cdao.jasper.FASTADataMatrixImpl.createFASTADataMatrix(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of FASTADataMatrix.  Leaves the model unchanged.
	 * @param uri The uri of the FASTADataMatrix
	 * @param model the Jena Model.
	 */
	public static FASTADataMatrix getFASTADataMatrix(String uri, Model model) throws JastorException {
		return getFASTADataMatrix(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of FASTADataMatrix.  Leaves the model unchanged.
	 * @param resource The resource of the FASTADataMatrix
	 * @param model the Jena Model.
	 */
	public static FASTADataMatrix getFASTADataMatrix(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.FASTADataMatrix.class.hashCode()) + resource.toString();
		org.cdao.jasper.FASTADataMatrixImpl obj = (org.cdao.jasper.FASTADataMatrixImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.FASTADataMatrixImpl.getFASTADataMatrix(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of FASTADataMatrix for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#FASTADataMatrix
	 * @param model the Jena Model
	 * @return a List of FASTADataMatrix
	 */
	public static java.util.List getAllFASTADataMatrix(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,FASTADataMatrix.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getFASTADataMatrix(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of RootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the RootedTree
	 * @param model the Jena Model.
	 */
	public static RootedTree createRootedTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.RootedTreeImpl.createRootedTree(resource,model);
	}
	
	/**
	 * Create a new instance of RootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the RootedTree
	 * @param model the Jena Model.
	 */
	public static RootedTree createRootedTree(String uri, Model model) throws JastorException {
		RootedTree obj = org.cdao.jasper.RootedTreeImpl.createRootedTree(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.RootedTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.RootedTreeImpl obj = (org.cdao.jasper.RootedTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.RootedTreeImpl.getRootedTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of RootedTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#RootedTree
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
	 * Create a new instance of Compound.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Compound
	 * @param model the Jena Model.
	 */
	public static Compound createCompound(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CompoundImpl.createCompound(resource,model);
	}
	
	/**
	 * Create a new instance of Compound.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Compound
	 * @param model the Jena Model.
	 */
	public static Compound createCompound(String uri, Model model) throws JastorException {
		Compound obj = org.cdao.jasper.CompoundImpl.createCompound(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Compound.class.hashCode()) + resource.toString();
		org.cdao.jasper.CompoundImpl obj = (org.cdao.jasper.CompoundImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CompoundImpl.getCompound(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Compound for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Compound
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
	 * Create a new instance of Categorical.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Categorical
	 * @param model the Jena Model.
	 */
	public static Categorical createCategorical(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CategoricalImpl.createCategorical(resource,model);
	}
	
	/**
	 * Create a new instance of Categorical.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Categorical
	 * @param model the Jena Model.
	 */
	public static Categorical createCategorical(String uri, Model model) throws JastorException {
		Categorical obj = org.cdao.jasper.CategoricalImpl.createCategorical(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Categorical.class.hashCode()) + resource.toString();
		org.cdao.jasper.CategoricalImpl obj = (org.cdao.jasper.CategoricalImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CategoricalImpl.getCategorical(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Categorical for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Categorical
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
	 * Create a new instance of StandardCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the StandardCharacter
	 * @param model the Jena Model.
	 */
	public static StandardCharacter createStandardCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.StandardCharacterImpl.createStandardCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of StandardCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the StandardCharacter
	 * @param model the Jena Model.
	 */
	public static StandardCharacter createStandardCharacter(String uri, Model model) throws JastorException {
		StandardCharacter obj = org.cdao.jasper.StandardCharacterImpl.createStandardCharacter(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.StandardCharacter.class.hashCode()) + resource.toString();
		org.cdao.jasper.StandardCharacterImpl obj = (org.cdao.jasper.StandardCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.StandardCharacterImpl.getStandardCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of StandardCharacter for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#StandardCharacter
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
	 * Create a new instance of UnresolvedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the UnresolvedTree
	 * @param model the Jena Model.
	 */
	public static UnresolvedTree createUnresolvedTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.UnresolvedTreeImpl.createUnresolvedTree(resource,model);
	}
	
	/**
	 * Create a new instance of UnresolvedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the UnresolvedTree
	 * @param model the Jena Model.
	 */
	public static UnresolvedTree createUnresolvedTree(String uri, Model model) throws JastorException {
		UnresolvedTree obj = org.cdao.jasper.UnresolvedTreeImpl.createUnresolvedTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of UnresolvedTree.  Leaves the model unchanged.
	 * @param uri The uri of the UnresolvedTree
	 * @param model the Jena Model.
	 */
	public static UnresolvedTree getUnresolvedTree(String uri, Model model) throws JastorException {
		return getUnresolvedTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of UnresolvedTree.  Leaves the model unchanged.
	 * @param resource The resource of the UnresolvedTree
	 * @param model the Jena Model.
	 */
	public static UnresolvedTree getUnresolvedTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.UnresolvedTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.UnresolvedTreeImpl obj = (org.cdao.jasper.UnresolvedTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.UnresolvedTreeImpl.getUnresolvedTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of UnresolvedTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#UnresolvedTree
	 * @param model the Jena Model
	 * @return a List of UnresolvedTree
	 */
	public static java.util.List getAllUnresolvedTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,UnresolvedTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getUnresolvedTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of TUAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TUAnnotation
	 * @param model the Jena Model.
	 */
	public static TUAnnotation createTUAnnotation(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.TUAnnotationImpl.createTUAnnotation(resource,model);
	}
	
	/**
	 * Create a new instance of TUAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TUAnnotation
	 * @param model the Jena Model.
	 */
	public static TUAnnotation createTUAnnotation(String uri, Model model) throws JastorException {
		TUAnnotation obj = org.cdao.jasper.TUAnnotationImpl.createTUAnnotation(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.TUAnnotation.class.hashCode()) + resource.toString();
		org.cdao.jasper.TUAnnotationImpl obj = (org.cdao.jasper.TUAnnotationImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.TUAnnotationImpl.getTUAnnotation(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TUAnnotation for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TUAnnotation
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
	 * Create a new instance of TreeAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TreeAnnotation
	 * @param model the Jena Model.
	 */
	public static TreeAnnotation createTreeAnnotation(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.TreeAnnotationImpl.createTreeAnnotation(resource,model);
	}
	
	/**
	 * Create a new instance of TreeAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TreeAnnotation
	 * @param model the Jena Model.
	 */
	public static TreeAnnotation createTreeAnnotation(String uri, Model model) throws JastorException {
		TreeAnnotation obj = org.cdao.jasper.TreeAnnotationImpl.createTreeAnnotation(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.TreeAnnotation.class.hashCode()) + resource.toString();
		org.cdao.jasper.TreeAnnotationImpl obj = (org.cdao.jasper.TreeAnnotationImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.TreeAnnotationImpl.getTreeAnnotation(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TreeAnnotation for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TreeAnnotation
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
	 * Create a new instance of TreeProcedure.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TreeProcedure
	 * @param model the Jena Model.
	 */
	public static TreeProcedure createTreeProcedure(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.TreeProcedureImpl.createTreeProcedure(resource,model);
	}
	
	/**
	 * Create a new instance of TreeProcedure.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TreeProcedure
	 * @param model the Jena Model.
	 */
	public static TreeProcedure createTreeProcedure(String uri, Model model) throws JastorException {
		TreeProcedure obj = org.cdao.jasper.TreeProcedureImpl.createTreeProcedure(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.TreeProcedure.class.hashCode()) + resource.toString();
		org.cdao.jasper.TreeProcedureImpl obj = (org.cdao.jasper.TreeProcedureImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.TreeProcedureImpl.getTreeProcedure(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TreeProcedure for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TreeProcedure
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
	 * Create a new instance of FullyResolvedUnrootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the FullyResolvedUnrootedTree
	 * @param model the Jena Model.
	 */
	public static FullyResolvedUnrootedTree createFullyResolvedUnrootedTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.FullyResolvedUnrootedTreeImpl.createFullyResolvedUnrootedTree(resource,model);
	}
	
	/**
	 * Create a new instance of FullyResolvedUnrootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the FullyResolvedUnrootedTree
	 * @param model the Jena Model.
	 */
	public static FullyResolvedUnrootedTree createFullyResolvedUnrootedTree(String uri, Model model) throws JastorException {
		FullyResolvedUnrootedTree obj = org.cdao.jasper.FullyResolvedUnrootedTreeImpl.createFullyResolvedUnrootedTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of FullyResolvedUnrootedTree.  Leaves the model unchanged.
	 * @param uri The uri of the FullyResolvedUnrootedTree
	 * @param model the Jena Model.
	 */
	public static FullyResolvedUnrootedTree getFullyResolvedUnrootedTree(String uri, Model model) throws JastorException {
		return getFullyResolvedUnrootedTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of FullyResolvedUnrootedTree.  Leaves the model unchanged.
	 * @param resource The resource of the FullyResolvedUnrootedTree
	 * @param model the Jena Model.
	 */
	public static FullyResolvedUnrootedTree getFullyResolvedUnrootedTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.FullyResolvedUnrootedTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.FullyResolvedUnrootedTreeImpl obj = (org.cdao.jasper.FullyResolvedUnrootedTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.FullyResolvedUnrootedTreeImpl.getFullyResolvedUnrootedTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of FullyResolvedUnrootedTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#FullyResolvedUnrootedTree
	 * @param model the Jena Model
	 * @return a List of FullyResolvedUnrootedTree
	 */
	public static java.util.List getAllFullyResolvedUnrootedTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,FullyResolvedUnrootedTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getFullyResolvedUnrootedTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ParaphyleticGroup.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ParaphyleticGroup
	 * @param model the Jena Model.
	 */
	public static ParaphyleticGroup createParaphyleticGroup(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.ParaphyleticGroupImpl.createParaphyleticGroup(resource,model);
	}
	
	/**
	 * Create a new instance of ParaphyleticGroup.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ParaphyleticGroup
	 * @param model the Jena Model.
	 */
	public static ParaphyleticGroup createParaphyleticGroup(String uri, Model model) throws JastorException {
		ParaphyleticGroup obj = org.cdao.jasper.ParaphyleticGroupImpl.createParaphyleticGroup(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ParaphyleticGroup.  Leaves the model unchanged.
	 * @param uri The uri of the ParaphyleticGroup
	 * @param model the Jena Model.
	 */
	public static ParaphyleticGroup getParaphyleticGroup(String uri, Model model) throws JastorException {
		return getParaphyleticGroup(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ParaphyleticGroup.  Leaves the model unchanged.
	 * @param resource The resource of the ParaphyleticGroup
	 * @param model the Jena Model.
	 */
	public static ParaphyleticGroup getParaphyleticGroup(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.ParaphyleticGroup.class.hashCode()) + resource.toString();
		org.cdao.jasper.ParaphyleticGroupImpl obj = (org.cdao.jasper.ParaphyleticGroupImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.ParaphyleticGroupImpl.getParaphyleticGroup(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ParaphyleticGroup for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ParaphyleticGroup
	 * @param model the Jena Model
	 * @return a List of ParaphyleticGroup
	 */
	public static java.util.List getAllParaphyleticGroup(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ParaphyleticGroup.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getParaphyleticGroup(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of DatumCoordinate.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DatumCoordinate
	 * @param model the Jena Model.
	 */
	public static DatumCoordinate createDatumCoordinate(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.DatumCoordinateImpl.createDatumCoordinate(resource,model);
	}
	
	/**
	 * Create a new instance of DatumCoordinate.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DatumCoordinate
	 * @param model the Jena Model.
	 */
	public static DatumCoordinate createDatumCoordinate(String uri, Model model) throws JastorException {
		DatumCoordinate obj = org.cdao.jasper.DatumCoordinateImpl.createDatumCoordinate(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.DatumCoordinate.class.hashCode()) + resource.toString();
		org.cdao.jasper.DatumCoordinateImpl obj = (org.cdao.jasper.DatumCoordinateImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.DatumCoordinateImpl.getDatumCoordinate(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DatumCoordinate for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DatumCoordinate
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
	 * Create a new instance of RibonucleotideResidue.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the RibonucleotideResidue
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidue createRibonucleotideResidue(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.RibonucleotideResidueImpl.createRibonucleotideResidue(resource,model);
	}
	
	/**
	 * Create a new instance of RibonucleotideResidue.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the RibonucleotideResidue
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidue createRibonucleotideResidue(String uri, Model model) throws JastorException {
		RibonucleotideResidue obj = org.cdao.jasper.RibonucleotideResidueImpl.createRibonucleotideResidue(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.RibonucleotideResidue.class.hashCode()) + resource.toString();
		org.cdao.jasper.RibonucleotideResidueImpl obj = (org.cdao.jasper.RibonucleotideResidueImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.RibonucleotideResidueImpl.getRibonucleotideResidue(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of RibonucleotideResidue for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#RibonucleotideResidue
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
	 * Create a new instance of ContinuousCharLikelihoodLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ContinuousCharLikelihoodLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharLikelihoodLengthType createContinuousCharLikelihoodLengthType(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.ContinuousCharLikelihoodLengthTypeImpl.createContinuousCharLikelihoodLengthType(resource,model);
	}
	
	/**
	 * Create a new instance of ContinuousCharLikelihoodLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ContinuousCharLikelihoodLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharLikelihoodLengthType createContinuousCharLikelihoodLengthType(String uri, Model model) throws JastorException {
		ContinuousCharLikelihoodLengthType obj = org.cdao.jasper.ContinuousCharLikelihoodLengthTypeImpl.createContinuousCharLikelihoodLengthType(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ContinuousCharLikelihoodLengthType.  Leaves the model unchanged.
	 * @param uri The uri of the ContinuousCharLikelihoodLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharLikelihoodLengthType getContinuousCharLikelihoodLengthType(String uri, Model model) throws JastorException {
		return getContinuousCharLikelihoodLengthType(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ContinuousCharLikelihoodLengthType.  Leaves the model unchanged.
	 * @param resource The resource of the ContinuousCharLikelihoodLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharLikelihoodLengthType getContinuousCharLikelihoodLengthType(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.ContinuousCharLikelihoodLengthType.class.hashCode()) + resource.toString();
		org.cdao.jasper.ContinuousCharLikelihoodLengthTypeImpl obj = (org.cdao.jasper.ContinuousCharLikelihoodLengthTypeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.ContinuousCharLikelihoodLengthTypeImpl.getContinuousCharLikelihoodLengthType(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ContinuousCharLikelihoodLengthType for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousCharLikelihoodLengthType
	 * @param model the Jena Model
	 * @return a List of ContinuousCharLikelihoodLengthType
	 */
	public static java.util.List getAllContinuousCharLikelihoodLengthType(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ContinuousCharLikelihoodLengthType.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getContinuousCharLikelihoodLengthType(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Molecular.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Molecular
	 * @param model the Jena Model.
	 */
	public static Molecular createMolecular(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.MolecularImpl.createMolecular(resource,model);
	}
	
	/**
	 * Create a new instance of Molecular.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Molecular
	 * @param model the Jena Model.
	 */
	public static Molecular createMolecular(String uri, Model model) throws JastorException {
		Molecular obj = org.cdao.jasper.MolecularImpl.createMolecular(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Molecular.class.hashCode()) + resource.toString();
		org.cdao.jasper.MolecularImpl obj = (org.cdao.jasper.MolecularImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.MolecularImpl.getMolecular(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Molecular for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Molecular
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
	 * Create a new instance of RibonucleotideResidueCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the RibonucleotideResidueCharacter
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidueCharacter createRibonucleotideResidueCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.RibonucleotideResidueCharacterImpl.createRibonucleotideResidueCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of RibonucleotideResidueCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the RibonucleotideResidueCharacter
	 * @param model the Jena Model.
	 */
	public static RibonucleotideResidueCharacter createRibonucleotideResidueCharacter(String uri, Model model) throws JastorException {
		RibonucleotideResidueCharacter obj = org.cdao.jasper.RibonucleotideResidueCharacterImpl.createRibonucleotideResidueCharacter(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.RibonucleotideResidueCharacter.class.hashCode()) + resource.toString();
		org.cdao.jasper.RibonucleotideResidueCharacterImpl obj = (org.cdao.jasper.RibonucleotideResidueCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.RibonucleotideResidueCharacterImpl.getRibonucleotideResidueCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of RibonucleotideResidueCharacter for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#RibonucleotideResidueCharacter
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
	 * Create a new instance of CategoricalStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CategoricalStateDatum
	 * @param model the Jena Model.
	 */
	public static CategoricalStateDatum createCategoricalStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CategoricalStateDatumImpl.createCategoricalStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of CategoricalStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CategoricalStateDatum
	 * @param model the Jena Model.
	 */
	public static CategoricalStateDatum createCategoricalStateDatum(String uri, Model model) throws JastorException {
		CategoricalStateDatum obj = org.cdao.jasper.CategoricalStateDatumImpl.createCategoricalStateDatum(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.CategoricalStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jasper.CategoricalStateDatumImpl obj = (org.cdao.jasper.CategoricalStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CategoricalStateDatumImpl.getCategoricalStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CategoricalStateDatum for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CategoricalStateDatum
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
	 * Create a new instance of RootedSubtree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the RootedSubtree
	 * @param model the Jena Model.
	 */
	public static RootedSubtree createRootedSubtree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.RootedSubtreeImpl.createRootedSubtree(resource,model);
	}
	
	/**
	 * Create a new instance of RootedSubtree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the RootedSubtree
	 * @param model the Jena Model.
	 */
	public static RootedSubtree createRootedSubtree(String uri, Model model) throws JastorException {
		RootedSubtree obj = org.cdao.jasper.RootedSubtreeImpl.createRootedSubtree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of RootedSubtree.  Leaves the model unchanged.
	 * @param uri The uri of the RootedSubtree
	 * @param model the Jena Model.
	 */
	public static RootedSubtree getRootedSubtree(String uri, Model model) throws JastorException {
		return getRootedSubtree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of RootedSubtree.  Leaves the model unchanged.
	 * @param resource The resource of the RootedSubtree
	 * @param model the Jena Model.
	 */
	public static RootedSubtree getRootedSubtree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.RootedSubtree.class.hashCode()) + resource.toString();
		org.cdao.jasper.RootedSubtreeImpl obj = (org.cdao.jasper.RootedSubtreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.RootedSubtreeImpl.getRootedSubtree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of RootedSubtree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#RootedSubtree
	 * @param model the Jena Model
	 * @return a List of RootedSubtree
	 */
	public static java.util.List getAllRootedSubtree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,RootedSubtree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getRootedSubtree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Tree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Tree
	 * @param model the Jena Model.
	 */
	public static Tree createTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.TreeImpl.createTree(resource,model);
	}
	
	/**
	 * Create a new instance of Tree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Tree
	 * @param model the Jena Model.
	 */
	public static Tree createTree(String uri, Model model) throws JastorException {
		Tree obj = org.cdao.jasper.TreeImpl.createTree(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Tree.class.hashCode()) + resource.toString();
		org.cdao.jasper.TreeImpl obj = (org.cdao.jasper.TreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.TreeImpl.getTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Tree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Tree
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
	 * Create a new instance of MRCANode.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MRCANode
	 * @param model the Jena Model.
	 */
	public static MRCANode createMRCANode(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.MRCANodeImpl.createMRCANode(resource,model);
	}
	
	/**
	 * Create a new instance of MRCANode.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MRCANode
	 * @param model the Jena Model.
	 */
	public static MRCANode createMRCANode(String uri, Model model) throws JastorException {
		MRCANode obj = org.cdao.jasper.MRCANodeImpl.createMRCANode(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.MRCANode.class.hashCode()) + resource.toString();
		org.cdao.jasper.MRCANodeImpl obj = (org.cdao.jasper.MRCANodeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.MRCANodeImpl.getMRCANode(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MRCANode for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#MRCANode
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
	 * Create a new instance of MolecularCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MolecularCharacter
	 * @param model the Jena Model.
	 */
	public static MolecularCharacter createMolecularCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.MolecularCharacterImpl.createMolecularCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of MolecularCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MolecularCharacter
	 * @param model the Jena Model.
	 */
	public static MolecularCharacter createMolecularCharacter(String uri, Model model) throws JastorException {
		MolecularCharacter obj = org.cdao.jasper.MolecularCharacterImpl.createMolecularCharacter(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.MolecularCharacter.class.hashCode()) + resource.toString();
		org.cdao.jasper.MolecularCharacterImpl obj = (org.cdao.jasper.MolecularCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.MolecularCharacterImpl.getMolecularCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MolecularCharacter for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#MolecularCharacter
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
	 * Create a new instance of PolymorphicStateDomain.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the PolymorphicStateDomain
	 * @param model the Jena Model.
	 */
	public static PolymorphicStateDomain createPolymorphicStateDomain(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.PolymorphicStateDomainImpl.createPolymorphicStateDomain(resource,model);
	}
	
	/**
	 * Create a new instance of PolymorphicStateDomain.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the PolymorphicStateDomain
	 * @param model the Jena Model.
	 */
	public static PolymorphicStateDomain createPolymorphicStateDomain(String uri, Model model) throws JastorException {
		PolymorphicStateDomain obj = org.cdao.jasper.PolymorphicStateDomainImpl.createPolymorphicStateDomain(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.PolymorphicStateDomain.class.hashCode()) + resource.toString();
		org.cdao.jasper.PolymorphicStateDomainImpl obj = (org.cdao.jasper.PolymorphicStateDomainImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.PolymorphicStateDomainImpl.getPolymorphicStateDomain(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of PolymorphicStateDomain for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#PolymorphicStateDomain
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
	 * Create a new instance of NexusDataBlock.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the NexusDataBlock
	 * @param model the Jena Model.
	 */
	public static NexusDataBlock createNexusDataBlock(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.NexusDataBlockImpl.createNexusDataBlock(resource,model);
	}
	
	/**
	 * Create a new instance of NexusDataBlock.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the NexusDataBlock
	 * @param model the Jena Model.
	 */
	public static NexusDataBlock createNexusDataBlock(String uri, Model model) throws JastorException {
		NexusDataBlock obj = org.cdao.jasper.NexusDataBlockImpl.createNexusDataBlock(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of NexusDataBlock.  Leaves the model unchanged.
	 * @param uri The uri of the NexusDataBlock
	 * @param model the Jena Model.
	 */
	public static NexusDataBlock getNexusDataBlock(String uri, Model model) throws JastorException {
		return getNexusDataBlock(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of NexusDataBlock.  Leaves the model unchanged.
	 * @param resource The resource of the NexusDataBlock
	 * @param model the Jena Model.
	 */
	public static NexusDataBlock getNexusDataBlock(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.NexusDataBlock.class.hashCode()) + resource.toString();
		org.cdao.jasper.NexusDataBlockImpl obj = (org.cdao.jasper.NexusDataBlockImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.NexusDataBlockImpl.getNexusDataBlock(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of NexusDataBlock for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#NexusDataBlock
	 * @param model the Jena Model
	 * @return a List of NexusDataBlock
	 */
	public static java.util.List getAllNexusDataBlock(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,NexusDataBlock.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getNexusDataBlock(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of SIMMAPTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SIMMAPTree
	 * @param model the Jena Model.
	 */
	public static SIMMAPTree createSIMMAPTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.SIMMAPTreeImpl.createSIMMAPTree(resource,model);
	}
	
	/**
	 * Create a new instance of SIMMAPTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SIMMAPTree
	 * @param model the Jena Model.
	 */
	public static SIMMAPTree createSIMMAPTree(String uri, Model model) throws JastorException {
		SIMMAPTree obj = org.cdao.jasper.SIMMAPTreeImpl.createSIMMAPTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of SIMMAPTree.  Leaves the model unchanged.
	 * @param uri The uri of the SIMMAPTree
	 * @param model the Jena Model.
	 */
	public static SIMMAPTree getSIMMAPTree(String uri, Model model) throws JastorException {
		return getSIMMAPTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of SIMMAPTree.  Leaves the model unchanged.
	 * @param resource The resource of the SIMMAPTree
	 * @param model the Jena Model.
	 */
	public static SIMMAPTree getSIMMAPTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.SIMMAPTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.SIMMAPTreeImpl obj = (org.cdao.jasper.SIMMAPTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.SIMMAPTreeImpl.getSIMMAPTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SIMMAPTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#SIMMAPTree
	 * @param model the Jena Model
	 * @return a List of SIMMAPTree
	 */
	public static java.util.List getAllSIMMAPTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,SIMMAPTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getSIMMAPTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ContinuousStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ContinuousStateDatum
	 * @param model the Jena Model.
	 */
	public static ContinuousStateDatum createContinuousStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.ContinuousStateDatumImpl.createContinuousStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of ContinuousStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ContinuousStateDatum
	 * @param model the Jena Model.
	 */
	public static ContinuousStateDatum createContinuousStateDatum(String uri, Model model) throws JastorException {
		ContinuousStateDatum obj = org.cdao.jasper.ContinuousStateDatumImpl.createContinuousStateDatum(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.ContinuousStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jasper.ContinuousStateDatumImpl obj = (org.cdao.jasper.ContinuousStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.ContinuousStateDatumImpl.getContinuousStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ContinuousStateDatum for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousStateDatum
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
	 * Create a new instance of UnresolvedRootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the UnresolvedRootedTree
	 * @param model the Jena Model.
	 */
	public static UnresolvedRootedTree createUnresolvedRootedTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.UnresolvedRootedTreeImpl.createUnresolvedRootedTree(resource,model);
	}
	
	/**
	 * Create a new instance of UnresolvedRootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the UnresolvedRootedTree
	 * @param model the Jena Model.
	 */
	public static UnresolvedRootedTree createUnresolvedRootedTree(String uri, Model model) throws JastorException {
		UnresolvedRootedTree obj = org.cdao.jasper.UnresolvedRootedTreeImpl.createUnresolvedRootedTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of UnresolvedRootedTree.  Leaves the model unchanged.
	 * @param uri The uri of the UnresolvedRootedTree
	 * @param model the Jena Model.
	 */
	public static UnresolvedRootedTree getUnresolvedRootedTree(String uri, Model model) throws JastorException {
		return getUnresolvedRootedTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of UnresolvedRootedTree.  Leaves the model unchanged.
	 * @param resource The resource of the UnresolvedRootedTree
	 * @param model the Jena Model.
	 */
	public static UnresolvedRootedTree getUnresolvedRootedTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.UnresolvedRootedTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.UnresolvedRootedTreeImpl obj = (org.cdao.jasper.UnresolvedRootedTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.UnresolvedRootedTreeImpl.getUnresolvedRootedTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of UnresolvedRootedTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#UnresolvedRootedTree
	 * @param model the Jena Model
	 * @return a List of UnresolvedRootedTree
	 */
	public static java.util.List getAllUnresolvedRootedTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,UnresolvedRootedTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getUnresolvedRootedTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of AminoAcid.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AminoAcid
	 * @param model the Jena Model.
	 */
	public static AminoAcid createAminoAcid(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.AminoAcidImpl.createAminoAcid(resource,model);
	}
	
	/**
	 * Create a new instance of AminoAcid.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AminoAcid
	 * @param model the Jena Model.
	 */
	public static AminoAcid createAminoAcid(String uri, Model model) throws JastorException {
		AminoAcid obj = org.cdao.jasper.AminoAcidImpl.createAminoAcid(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.AminoAcid.class.hashCode()) + resource.toString();
		org.cdao.jasper.AminoAcidImpl obj = (org.cdao.jasper.AminoAcidImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.AminoAcidImpl.getAminoAcid(resource, model);
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
	 * Create a new instance of CharacterStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CharacterStateDatum
	 * @param model the Jena Model.
	 */
	public static CharacterStateDatum createCharacterStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CharacterStateDatumImpl.createCharacterStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of CharacterStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CharacterStateDatum
	 * @param model the Jena Model.
	 */
	public static CharacterStateDatum createCharacterStateDatum(String uri, Model model) throws JastorException {
		CharacterStateDatum obj = org.cdao.jasper.CharacterStateDatumImpl.createCharacterStateDatum(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.CharacterStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jasper.CharacterStateDatumImpl obj = (org.cdao.jasper.CharacterStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CharacterStateDatumImpl.getCharacterStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CharacterStateDatum for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDatum
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
	 * Create a new instance of Phylo4Tree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Phylo4Tree
	 * @param model the Jena Model.
	 */
	public static Phylo4Tree createPhylo4Tree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.Phylo4TreeImpl.createPhylo4Tree(resource,model);
	}
	
	/**
	 * Create a new instance of Phylo4Tree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Phylo4Tree
	 * @param model the Jena Model.
	 */
	public static Phylo4Tree createPhylo4Tree(String uri, Model model) throws JastorException {
		Phylo4Tree obj = org.cdao.jasper.Phylo4TreeImpl.createPhylo4Tree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Phylo4Tree.  Leaves the model unchanged.
	 * @param uri The uri of the Phylo4Tree
	 * @param model the Jena Model.
	 */
	public static Phylo4Tree getPhylo4Tree(String uri, Model model) throws JastorException {
		return getPhylo4Tree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Phylo4Tree.  Leaves the model unchanged.
	 * @param resource The resource of the Phylo4Tree
	 * @param model the Jena Model.
	 */
	public static Phylo4Tree getPhylo4Tree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.Phylo4Tree.class.hashCode()) + resource.toString();
		org.cdao.jasper.Phylo4TreeImpl obj = (org.cdao.jasper.Phylo4TreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.Phylo4TreeImpl.getPhylo4Tree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Phylo4Tree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Phylo4Tree
	 * @param model the Jena Model
	 * @return a List of Phylo4Tree
	 */
	public static java.util.List getAllPhylo4Tree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Phylo4Tree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPhylo4Tree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of MolecularStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MolecularStateDatum
	 * @param model the Jena Model.
	 */
	public static MolecularStateDatum createMolecularStateDatum(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.MolecularStateDatumImpl.createMolecularStateDatum(resource,model);
	}
	
	/**
	 * Create a new instance of MolecularStateDatum.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MolecularStateDatum
	 * @param model the Jena Model.
	 */
	public static MolecularStateDatum createMolecularStateDatum(String uri, Model model) throws JastorException {
		MolecularStateDatum obj = org.cdao.jasper.MolecularStateDatumImpl.createMolecularStateDatum(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.MolecularStateDatum.class.hashCode()) + resource.toString();
		org.cdao.jasper.MolecularStateDatumImpl obj = (org.cdao.jasper.MolecularStateDatumImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.MolecularStateDatumImpl.getMolecularStateDatum(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MolecularStateDatum for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#MolecularStateDatum
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
	 * Create a new instance of ContinuousCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ContinuousCharacter
	 * @param model the Jena Model.
	 */
	public static ContinuousCharacter createContinuousCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.ContinuousCharacterImpl.createContinuousCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of ContinuousCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ContinuousCharacter
	 * @param model the Jena Model.
	 */
	public static ContinuousCharacter createContinuousCharacter(String uri, Model model) throws JastorException {
		ContinuousCharacter obj = org.cdao.jasper.ContinuousCharacterImpl.createContinuousCharacter(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.ContinuousCharacter.class.hashCode()) + resource.toString();
		org.cdao.jasper.ContinuousCharacterImpl obj = (org.cdao.jasper.ContinuousCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.ContinuousCharacterImpl.getContinuousCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ContinuousCharacter for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousCharacter
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
	 * Create a new instance of Node.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Node
	 * @param model the Jena Model.
	 */
	public static Node createNode(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.NodeImpl.createNode(resource,model);
	}
	
	/**
	 * Create a new instance of Node.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Node
	 * @param model the Jena Model.
	 */
	public static Node createNode(String uri, Model model) throws JastorException {
		Node obj = org.cdao.jasper.NodeImpl.createNode(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Node.class.hashCode()) + resource.toString();
		org.cdao.jasper.NodeImpl obj = (org.cdao.jasper.NodeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.NodeImpl.getNode(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Node for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Node
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
	 * Create a new instance of Kimura2Parameters.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Kimura2Parameters
	 * @param model the Jena Model.
	 */
	public static Kimura2Parameters createKimura2Parameters(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.Kimura2ParametersImpl.createKimura2Parameters(resource,model);
	}
	
	/**
	 * Create a new instance of Kimura2Parameters.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Kimura2Parameters
	 * @param model the Jena Model.
	 */
	public static Kimura2Parameters createKimura2Parameters(String uri, Model model) throws JastorException {
		Kimura2Parameters obj = org.cdao.jasper.Kimura2ParametersImpl.createKimura2Parameters(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.Kimura2Parameters.class.hashCode()) + resource.toString();
		org.cdao.jasper.Kimura2ParametersImpl obj = (org.cdao.jasper.Kimura2ParametersImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.Kimura2ParametersImpl.getKimura2Parameters(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Kimura2Parameters for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Kimura2Parameters
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
	 * Create a new instance of SubstitutionModel.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SubstitutionModel
	 * @param model the Jena Model.
	 */
	public static SubstitutionModel createSubstitutionModel(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.SubstitutionModelImpl.createSubstitutionModel(resource,model);
	}
	
	/**
	 * Create a new instance of SubstitutionModel.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SubstitutionModel
	 * @param model the Jena Model.
	 */
	public static SubstitutionModel createSubstitutionModel(String uri, Model model) throws JastorException {
		SubstitutionModel obj = org.cdao.jasper.SubstitutionModelImpl.createSubstitutionModel(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.SubstitutionModel.class.hashCode()) + resource.toString();
		org.cdao.jasper.SubstitutionModelImpl obj = (org.cdao.jasper.SubstitutionModelImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.SubstitutionModelImpl.getSubstitutionModel(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SubstitutionModel for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#SubstitutionModel
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
	 * Create a new instance of AminoAcidResidueCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AminoAcidResidueCharacter
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidueCharacter createAminoAcidResidueCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.AminoAcidResidueCharacterImpl.createAminoAcidResidueCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of AminoAcidResidueCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AminoAcidResidueCharacter
	 * @param model the Jena Model.
	 */
	public static AminoAcidResidueCharacter createAminoAcidResidueCharacter(String uri, Model model) throws JastorException {
		AminoAcidResidueCharacter obj = org.cdao.jasper.AminoAcidResidueCharacterImpl.createAminoAcidResidueCharacter(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.AminoAcidResidueCharacter.class.hashCode()) + resource.toString();
		org.cdao.jasper.AminoAcidResidueCharacterImpl obj = (org.cdao.jasper.AminoAcidResidueCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.AminoAcidResidueCharacterImpl.getAminoAcidResidueCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of AminoAcidResidueCharacter for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#AminoAcidResidueCharacter
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
	 * Create a new instance of StarTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the StarTree
	 * @param model the Jena Model.
	 */
	public static StarTree createStarTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.StarTreeImpl.createStarTree(resource,model);
	}
	
	/**
	 * Create a new instance of StarTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the StarTree
	 * @param model the Jena Model.
	 */
	public static StarTree createStarTree(String uri, Model model) throws JastorException {
		StarTree obj = org.cdao.jasper.StarTreeImpl.createStarTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of StarTree.  Leaves the model unchanged.
	 * @param uri The uri of the StarTree
	 * @param model the Jena Model.
	 */
	public static StarTree getStarTree(String uri, Model model) throws JastorException {
		return getStarTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of StarTree.  Leaves the model unchanged.
	 * @param resource The resource of the StarTree
	 * @param model the Jena Model.
	 */
	public static StarTree getStarTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.StarTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.StarTreeImpl obj = (org.cdao.jasper.StarTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.StarTreeImpl.getStarTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of StarTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#StarTree
	 * @param model the Jena Model
	 * @return a List of StarTree
	 */
	public static java.util.List getAllStarTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,StarTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getStarTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of TimeCalibratedLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the TimeCalibratedLengthType
	 * @param model the Jena Model.
	 */
	public static TimeCalibratedLengthType createTimeCalibratedLengthType(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.TimeCalibratedLengthTypeImpl.createTimeCalibratedLengthType(resource,model);
	}
	
	/**
	 * Create a new instance of TimeCalibratedLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the TimeCalibratedLengthType
	 * @param model the Jena Model.
	 */
	public static TimeCalibratedLengthType createTimeCalibratedLengthType(String uri, Model model) throws JastorException {
		TimeCalibratedLengthType obj = org.cdao.jasper.TimeCalibratedLengthTypeImpl.createTimeCalibratedLengthType(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of TimeCalibratedLengthType.  Leaves the model unchanged.
	 * @param uri The uri of the TimeCalibratedLengthType
	 * @param model the Jena Model.
	 */
	public static TimeCalibratedLengthType getTimeCalibratedLengthType(String uri, Model model) throws JastorException {
		return getTimeCalibratedLengthType(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of TimeCalibratedLengthType.  Leaves the model unchanged.
	 * @param resource The resource of the TimeCalibratedLengthType
	 * @param model the Jena Model.
	 */
	public static TimeCalibratedLengthType getTimeCalibratedLengthType(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.TimeCalibratedLengthType.class.hashCode()) + resource.toString();
		org.cdao.jasper.TimeCalibratedLengthTypeImpl obj = (org.cdao.jasper.TimeCalibratedLengthTypeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.TimeCalibratedLengthTypeImpl.getTimeCalibratedLengthType(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of TimeCalibratedLengthType for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TimeCalibratedLengthType
	 * @param model the Jena Model
	 * @return a List of TimeCalibratedLengthType
	 */
	public static java.util.List getAllTimeCalibratedLengthType(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,TimeCalibratedLengthType.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getTimeCalibratedLengthType(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of AlignmentProcedure.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the AlignmentProcedure
	 * @param model the Jena Model.
	 */
	public static AlignmentProcedure createAlignmentProcedure(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.AlignmentProcedureImpl.createAlignmentProcedure(resource,model);
	}
	
	/**
	 * Create a new instance of AlignmentProcedure.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the AlignmentProcedure
	 * @param model the Jena Model.
	 */
	public static AlignmentProcedure createAlignmentProcedure(String uri, Model model) throws JastorException {
		AlignmentProcedure obj = org.cdao.jasper.AlignmentProcedureImpl.createAlignmentProcedure(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.AlignmentProcedure.class.hashCode()) + resource.toString();
		org.cdao.jasper.AlignmentProcedureImpl obj = (org.cdao.jasper.AlignmentProcedureImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.AlignmentProcedureImpl.getAlignmentProcedure(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of AlignmentProcedure for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#AlignmentProcedure
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
	 * Create a new instance of PHYLIPDataMatrix.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the PHYLIPDataMatrix
	 * @param model the Jena Model.
	 */
	public static PHYLIPDataMatrix createPHYLIPDataMatrix(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.PHYLIPDataMatrixImpl.createPHYLIPDataMatrix(resource,model);
	}
	
	/**
	 * Create a new instance of PHYLIPDataMatrix.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the PHYLIPDataMatrix
	 * @param model the Jena Model.
	 */
	public static PHYLIPDataMatrix createPHYLIPDataMatrix(String uri, Model model) throws JastorException {
		PHYLIPDataMatrix obj = org.cdao.jasper.PHYLIPDataMatrixImpl.createPHYLIPDataMatrix(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of PHYLIPDataMatrix.  Leaves the model unchanged.
	 * @param uri The uri of the PHYLIPDataMatrix
	 * @param model the Jena Model.
	 */
	public static PHYLIPDataMatrix getPHYLIPDataMatrix(String uri, Model model) throws JastorException {
		return getPHYLIPDataMatrix(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of PHYLIPDataMatrix.  Leaves the model unchanged.
	 * @param resource The resource of the PHYLIPDataMatrix
	 * @param model the Jena Model.
	 */
	public static PHYLIPDataMatrix getPHYLIPDataMatrix(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.PHYLIPDataMatrix.class.hashCode()) + resource.toString();
		org.cdao.jasper.PHYLIPDataMatrixImpl obj = (org.cdao.jasper.PHYLIPDataMatrixImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.PHYLIPDataMatrixImpl.getPHYLIPDataMatrix(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of PHYLIPDataMatrix for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#PHYLIPDataMatrix
	 * @param model the Jena Model
	 * @return a List of PHYLIPDataMatrix
	 */
	public static java.util.List getAllPHYLIPDataMatrix(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,PHYLIPDataMatrix.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPHYLIPDataMatrix(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of EdgeLength.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the EdgeLength
	 * @param model the Jena Model.
	 */
	public static EdgeLength createEdgeLength(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.EdgeLengthImpl.createEdgeLength(resource,model);
	}
	
	/**
	 * Create a new instance of EdgeLength.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the EdgeLength
	 * @param model the Jena Model.
	 */
	public static EdgeLength createEdgeLength(String uri, Model model) throws JastorException {
		EdgeLength obj = org.cdao.jasper.EdgeLengthImpl.createEdgeLength(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.EdgeLength.class.hashCode()) + resource.toString();
		org.cdao.jasper.EdgeLengthImpl obj = (org.cdao.jasper.EdgeLengthImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.EdgeLengthImpl.getEdgeLength(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of EdgeLength for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#EdgeLength
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
	 * Create a new instance of DiscreteCharParsimonyLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DiscreteCharParsimonyLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharParsimonyLengthType createDiscreteCharParsimonyLengthType(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.DiscreteCharParsimonyLengthTypeImpl.createDiscreteCharParsimonyLengthType(resource,model);
	}
	
	/**
	 * Create a new instance of DiscreteCharParsimonyLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DiscreteCharParsimonyLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharParsimonyLengthType createDiscreteCharParsimonyLengthType(String uri, Model model) throws JastorException {
		DiscreteCharParsimonyLengthType obj = org.cdao.jasper.DiscreteCharParsimonyLengthTypeImpl.createDiscreteCharParsimonyLengthType(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of DiscreteCharParsimonyLengthType.  Leaves the model unchanged.
	 * @param uri The uri of the DiscreteCharParsimonyLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharParsimonyLengthType getDiscreteCharParsimonyLengthType(String uri, Model model) throws JastorException {
		return getDiscreteCharParsimonyLengthType(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of DiscreteCharParsimonyLengthType.  Leaves the model unchanged.
	 * @param resource The resource of the DiscreteCharParsimonyLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharParsimonyLengthType getDiscreteCharParsimonyLengthType(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.DiscreteCharParsimonyLengthType.class.hashCode()) + resource.toString();
		org.cdao.jasper.DiscreteCharParsimonyLengthTypeImpl obj = (org.cdao.jasper.DiscreteCharParsimonyLengthTypeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.DiscreteCharParsimonyLengthTypeImpl.getDiscreteCharParsimonyLengthType(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DiscreteCharParsimonyLengthType for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DiscreteCharParsimonyLengthType
	 * @param model the Jena Model
	 * @return a List of DiscreteCharParsimonyLengthType
	 */
	public static java.util.List getAllDiscreteCharParsimonyLengthType(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,DiscreteCharParsimonyLengthType.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDiscreteCharParsimonyLengthType(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of FullyResolvedRootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the FullyResolvedRootedTree
	 * @param model the Jena Model.
	 */
	public static FullyResolvedRootedTree createFullyResolvedRootedTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.FullyResolvedRootedTreeImpl.createFullyResolvedRootedTree(resource,model);
	}
	
	/**
	 * Create a new instance of FullyResolvedRootedTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the FullyResolvedRootedTree
	 * @param model the Jena Model.
	 */
	public static FullyResolvedRootedTree createFullyResolvedRootedTree(String uri, Model model) throws JastorException {
		FullyResolvedRootedTree obj = org.cdao.jasper.FullyResolvedRootedTreeImpl.createFullyResolvedRootedTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of FullyResolvedRootedTree.  Leaves the model unchanged.
	 * @param uri The uri of the FullyResolvedRootedTree
	 * @param model the Jena Model.
	 */
	public static FullyResolvedRootedTree getFullyResolvedRootedTree(String uri, Model model) throws JastorException {
		return getFullyResolvedRootedTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of FullyResolvedRootedTree.  Leaves the model unchanged.
	 * @param resource The resource of the FullyResolvedRootedTree
	 * @param model the Jena Model.
	 */
	public static FullyResolvedRootedTree getFullyResolvedRootedTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.FullyResolvedRootedTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.FullyResolvedRootedTreeImpl obj = (org.cdao.jasper.FullyResolvedRootedTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.FullyResolvedRootedTreeImpl.getFullyResolvedRootedTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of FullyResolvedRootedTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#FullyResolvedRootedTree
	 * @param model the Jena Model
	 * @return a List of FullyResolvedRootedTree
	 */
	public static java.util.List getAllFullyResolvedRootedTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,FullyResolvedRootedTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getFullyResolvedRootedTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of GapCost.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the GapCost
	 * @param model the Jena Model.
	 */
	public static GapCost createGapCost(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.GapCostImpl.createGapCost(resource,model);
	}
	
	/**
	 * Create a new instance of GapCost.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the GapCost
	 * @param model the Jena Model.
	 */
	public static GapCost createGapCost(String uri, Model model) throws JastorException {
		GapCost obj = org.cdao.jasper.GapCostImpl.createGapCost(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.GapCost.class.hashCode()) + resource.toString();
		org.cdao.jasper.GapCostImpl obj = (org.cdao.jasper.GapCostImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.GapCostImpl.getGapCost(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of GapCost for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#GapCost
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
	 * Create a new instance of CompoundCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CompoundCharacter
	 * @param model the Jena Model.
	 */
	public static CompoundCharacter createCompoundCharacter(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CompoundCharacterImpl.createCompoundCharacter(resource,model);
	}
	
	/**
	 * Create a new instance of CompoundCharacter.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CompoundCharacter
	 * @param model the Jena Model.
	 */
	public static CompoundCharacter createCompoundCharacter(String uri, Model model) throws JastorException {
		CompoundCharacter obj = org.cdao.jasper.CompoundCharacterImpl.createCompoundCharacter(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.CompoundCharacter.class.hashCode()) + resource.toString();
		org.cdao.jasper.CompoundCharacterImpl obj = (org.cdao.jasper.CompoundCharacterImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CompoundCharacterImpl.getCompoundCharacter(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CompoundCharacter for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CompoundCharacter
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
	 * Create a new instance of DiscreteCharBayesianLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DiscreteCharBayesianLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharBayesianLengthType createDiscreteCharBayesianLengthType(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.DiscreteCharBayesianLengthTypeImpl.createDiscreteCharBayesianLengthType(resource,model);
	}
	
	/**
	 * Create a new instance of DiscreteCharBayesianLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DiscreteCharBayesianLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharBayesianLengthType createDiscreteCharBayesianLengthType(String uri, Model model) throws JastorException {
		DiscreteCharBayesianLengthType obj = org.cdao.jasper.DiscreteCharBayesianLengthTypeImpl.createDiscreteCharBayesianLengthType(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of DiscreteCharBayesianLengthType.  Leaves the model unchanged.
	 * @param uri The uri of the DiscreteCharBayesianLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharBayesianLengthType getDiscreteCharBayesianLengthType(String uri, Model model) throws JastorException {
		return getDiscreteCharBayesianLengthType(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of DiscreteCharBayesianLengthType.  Leaves the model unchanged.
	 * @param resource The resource of the DiscreteCharBayesianLengthType
	 * @param model the Jena Model.
	 */
	public static DiscreteCharBayesianLengthType getDiscreteCharBayesianLengthType(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.DiscreteCharBayesianLengthType.class.hashCode()) + resource.toString();
		org.cdao.jasper.DiscreteCharBayesianLengthTypeImpl obj = (org.cdao.jasper.DiscreteCharBayesianLengthTypeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.DiscreteCharBayesianLengthTypeImpl.getDiscreteCharBayesianLengthType(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DiscreteCharBayesianLengthType for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DiscreteCharBayesianLengthType
	 * @param model the Jena Model
	 * @return a List of DiscreteCharBayesianLengthType
	 */
	public static java.util.List getAllDiscreteCharBayesianLengthType(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,DiscreteCharBayesianLengthType.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDiscreteCharBayesianLengthType(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of EdgeAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the EdgeAnnotation
	 * @param model the Jena Model.
	 */
	public static EdgeAnnotation createEdgeAnnotation(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.EdgeAnnotationImpl.createEdgeAnnotation(resource,model);
	}
	
	/**
	 * Create a new instance of EdgeAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the EdgeAnnotation
	 * @param model the Jena Model.
	 */
	public static EdgeAnnotation createEdgeAnnotation(String uri, Model model) throws JastorException {
		EdgeAnnotation obj = org.cdao.jasper.EdgeAnnotationImpl.createEdgeAnnotation(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.EdgeAnnotation.class.hashCode()) + resource.toString();
		org.cdao.jasper.EdgeAnnotationImpl obj = (org.cdao.jasper.EdgeAnnotationImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.EdgeAnnotationImpl.getEdgeAnnotation(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of EdgeAnnotation for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#EdgeAnnotation
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
	 * Create a new instance of BifurcatingTree.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the BifurcatingTree
	 * @param model the Jena Model.
	 */
	public static BifurcatingTree createBifurcatingTree(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.BifurcatingTreeImpl.createBifurcatingTree(resource,model);
	}
	
	/**
	 * Create a new instance of BifurcatingTree.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the BifurcatingTree
	 * @param model the Jena Model.
	 */
	public static BifurcatingTree createBifurcatingTree(String uri, Model model) throws JastorException {
		BifurcatingTree obj = org.cdao.jasper.BifurcatingTreeImpl.createBifurcatingTree(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of BifurcatingTree.  Leaves the model unchanged.
	 * @param uri The uri of the BifurcatingTree
	 * @param model the Jena Model.
	 */
	public static BifurcatingTree getBifurcatingTree(String uri, Model model) throws JastorException {
		return getBifurcatingTree(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of BifurcatingTree.  Leaves the model unchanged.
	 * @param resource The resource of the BifurcatingTree
	 * @param model the Jena Model.
	 */
	public static BifurcatingTree getBifurcatingTree(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.BifurcatingTree.class.hashCode()) + resource.toString();
		org.cdao.jasper.BifurcatingTreeImpl obj = (org.cdao.jasper.BifurcatingTreeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.BifurcatingTreeImpl.getBifurcatingTree(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of BifurcatingTree for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#BifurcatingTree
	 * @param model the Jena Model
	 * @return a List of BifurcatingTree
	 */
	public static java.util.List getAllBifurcatingTree(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,BifurcatingTree.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getBifurcatingTree(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ContinuousCharParsimonyLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ContinuousCharParsimonyLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharParsimonyLengthType createContinuousCharParsimonyLengthType(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.ContinuousCharParsimonyLengthTypeImpl.createContinuousCharParsimonyLengthType(resource,model);
	}
	
	/**
	 * Create a new instance of ContinuousCharParsimonyLengthType.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ContinuousCharParsimonyLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharParsimonyLengthType createContinuousCharParsimonyLengthType(String uri, Model model) throws JastorException {
		ContinuousCharParsimonyLengthType obj = org.cdao.jasper.ContinuousCharParsimonyLengthTypeImpl.createContinuousCharParsimonyLengthType(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ContinuousCharParsimonyLengthType.  Leaves the model unchanged.
	 * @param uri The uri of the ContinuousCharParsimonyLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharParsimonyLengthType getContinuousCharParsimonyLengthType(String uri, Model model) throws JastorException {
		return getContinuousCharParsimonyLengthType(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ContinuousCharParsimonyLengthType.  Leaves the model unchanged.
	 * @param resource The resource of the ContinuousCharParsimonyLengthType
	 * @param model the Jena Model.
	 */
	public static ContinuousCharParsimonyLengthType getContinuousCharParsimonyLengthType(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + org.cdao.jasper.ContinuousCharParsimonyLengthType.class.hashCode()) + resource.toString();
		org.cdao.jasper.ContinuousCharParsimonyLengthTypeImpl obj = (org.cdao.jasper.ContinuousCharParsimonyLengthTypeImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.ContinuousCharParsimonyLengthTypeImpl.getContinuousCharParsimonyLengthType(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ContinuousCharParsimonyLengthType for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousCharParsimonyLengthType
	 * @param model the Jena Model
	 * @return a List of ContinuousCharParsimonyLengthType
	 */
	public static java.util.List getAllContinuousCharParsimonyLengthType(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ContinuousCharParsimonyLengthType.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getContinuousCharParsimonyLengthType(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CharacterStateDataMatrixAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CharacterStateDataMatrixAnnotation
	 * @param model the Jena Model.
	 */
	public static CharacterStateDataMatrixAnnotation createCharacterStateDataMatrixAnnotation(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.CharacterStateDataMatrixAnnotationImpl.createCharacterStateDataMatrixAnnotation(resource,model);
	}
	
	/**
	 * Create a new instance of CharacterStateDataMatrixAnnotation.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CharacterStateDataMatrixAnnotation
	 * @param model the Jena Model.
	 */
	public static CharacterStateDataMatrixAnnotation createCharacterStateDataMatrixAnnotation(String uri, Model model) throws JastorException {
		CharacterStateDataMatrixAnnotation obj = org.cdao.jasper.CharacterStateDataMatrixAnnotationImpl.createCharacterStateDataMatrixAnnotation(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.CharacterStateDataMatrixAnnotation.class.hashCode()) + resource.toString();
		org.cdao.jasper.CharacterStateDataMatrixAnnotationImpl obj = (org.cdao.jasper.CharacterStateDataMatrixAnnotationImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.CharacterStateDataMatrixAnnotationImpl.getCharacterStateDataMatrixAnnotation(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CharacterStateDataMatrixAnnotation for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDataMatrixAnnotation
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
	 * Create a new instance of ModelDescription.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ModelDescription
	 * @param model the Jena Model.
	 */
	public static ModelDescription createModelDescription(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.ModelDescriptionImpl.createModelDescription(resource,model);
	}
	
	/**
	 * Create a new instance of ModelDescription.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ModelDescription
	 * @param model the Jena Model.
	 */
	public static ModelDescription createModelDescription(String uri, Model model) throws JastorException {
		ModelDescription obj = org.cdao.jasper.ModelDescriptionImpl.createModelDescription(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.ModelDescription.class.hashCode()) + resource.toString();
		org.cdao.jasper.ModelDescriptionImpl obj = (org.cdao.jasper.ModelDescriptionImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.ModelDescriptionImpl.getModelDescription(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ModelDescription for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ModelDescription
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
	 * Create a new instance of GammaDistribution.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the GammaDistribution
	 * @param model the Jena Model.
	 */
	public static GammaDistribution createGammaDistribution(Resource resource, Model model) throws JastorException {
		return org.cdao.jasper.GammaDistributionImpl.createGammaDistribution(resource,model);
	}
	
	/**
	 * Create a new instance of GammaDistribution.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the GammaDistribution
	 * @param model the Jena Model.
	 */
	public static GammaDistribution createGammaDistribution(String uri, Model model) throws JastorException {
		GammaDistribution obj = org.cdao.jasper.GammaDistributionImpl.createGammaDistribution(model.createResource(uri), model);
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
		String code = (model.hashCode()*17 + org.cdao.jasper.GammaDistribution.class.hashCode()) + resource.toString();
		org.cdao.jasper.GammaDistributionImpl obj = (org.cdao.jasper.GammaDistributionImpl)objects.get(code);
		if (obj == null) {
			obj = org.cdao.jasper.GammaDistributionImpl.getGammaDistribution(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of GammaDistribution for every resource in the model with rdf:Type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#GammaDistribution
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
	 * Returns an instance of an interface for the given Resource.  The return instance is guaranteed to 
	 * implement the most specific interface in *some* hierarchy in which the Resource participates.  The behavior
	 * is unspecified for resources with RDF types from different hierarchies.
	 * @return an instance of Thing
	 */
	public static Thing getThing(com.hp.hpl.jena.rdf.model.Resource res, com.hp.hpl.jena.rdf.model.Model model) throws JastorException {
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#GammaDistribution"))) {
			return getGammaDistribution(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousCharParsimonyLengthType"))) {
			return getContinuousCharParsimonyLengthType(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DiscreteCharBayesianLengthType"))) {
			return getDiscreteCharBayesianLengthType(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CompoundCharacter"))) {
			return getCompoundCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#GapCost"))) {
			return getGapCost(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#FullyResolvedRootedTree"))) {
			return getFullyResolvedRootedTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DiscreteCharParsimonyLengthType"))) {
			return getDiscreteCharParsimonyLengthType(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#EdgeLength"))) {
			return getEdgeLength(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#PHYLIPDataMatrix"))) {
			return getPHYLIPDataMatrix(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#AlignmentProcedure"))) {
			return getAlignmentProcedure(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TimeCalibratedLengthType"))) {
			return getTimeCalibratedLengthType(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#StarTree"))) {
			return getStarTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#AminoAcidResidueCharacter"))) {
			return getAminoAcidResidueCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Kimura2Parameters"))) {
			return getKimura2Parameters(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousCharacter"))) {
			return getContinuousCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Phylo4Tree"))) {
			return getPhylo4Tree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.co-ode.org/ontologies/amino-acid/2005/10/11/amino-acid.owl#AminoAcid"))) {
			return getAminoAcid(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#UnresolvedRootedTree"))) {
			return getUnresolvedRootedTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousStateDatum"))) {
			return getContinuousStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#SIMMAPTree"))) {
			return getSIMMAPTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#NexusDataBlock"))) {
			return getNexusDataBlock(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#PolymorphicStateDomain"))) {
			return getPolymorphicStateDomain(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#MRCANode"))) {
			return getMRCANode(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CommonAncestralNode"))) {
			return getCommonAncestralNode(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#RootedSubtree"))) {
			return getRootedSubtree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#RibonucleotideResidueCharacter"))) {
			return getRibonucleotideResidueCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousCharLikelihoodLengthType"))) {
			return getContinuousCharLikelihoodLengthType(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#RibonucleotideResidue"))) {
			return getRibonucleotideResidue(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ParaphyleticGroup"))) {
			return getParaphyleticGroup(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#FullyResolvedUnrootedTree"))) {
			return getFullyResolvedUnrootedTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#BifurcatingTree"))) {
			return getBifurcatingTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TreeProcedure"))) {
			return getTreeProcedure(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#StandardCharacter"))) {
			return getStandardCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Compound"))) {
			return getCompound(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#FASTADataMatrix"))) {
			return getFASTADataMatrix(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#PolyphyleticGroup"))) {
			return getPolyphyleticGroup(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CompoundStateDatum"))) {
			return getCompoundStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#AminoAcidResidueStateDatum"))) {
			return getAminoAcidResidueStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#UnresolvedUnrootedTree"))) {
			return getUnresolvedUnrootedTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#UnrootedTree"))) {
			return getUnrootedTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#UnresolvedTree"))) {
			return getUnresolvedTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#SpeciesTree"))) {
			return getSpeciesTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDataMatrix"))) {
			return getCharacterStateDataMatrix(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CoordinateList"))) {
			return getCoordinateList(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DiscreteCharLikelihoodLengthType"))) {
			return getDiscreteCharLikelihoodLengthType(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Generic_State"))) {
			return getGeneric__State(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ReticulateEvolution"))) {
			return getReticulateEvolution(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#StandardStateDatum"))) {
			return getStandardStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DesoxiRibonucleotideResidueStateDatum"))) {
			return getDesoxiRibonucleotideResidueStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#UncertainStateDomain"))) {
			return getUncertainStateDomain(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#NEXUSTreeBlock"))) {
			return getNEXUSTreeBlock(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#PHYLIPTree"))) {
			return getPHYLIPTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#NewickTree"))) {
			return getNewickTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Dichotomy"))) {
			return getDichotomy(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Lineage"))) {
			return getLineage(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#RootedTree"))) {
			return getRootedTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DesoxiRibonucleotideResidueCharacter"))) {
			return getDesoxiRibonucleotideResidueCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#MolecularCharacter"))) {
			return getMolecularCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CategoricalCharacter"))) {
			return getCategoricalCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Character"))) {
			return getCharacter(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#FullyResolvedTree"))) {
			return getFullyResolvedTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CoordinatePoint"))) {
			return getCoordinatePoint(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#GenBankDataMatrix"))) {
			return getGenBankDataMatrix(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DataMatrixFormat"))) {
			return getDataMatrixFormat(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDataMatrixAnnotation"))) {
			return getCharacterStateDataMatrixAnnotation(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DesoxiRibonucleotideResidue"))) {
			return getDesoxiRibonucleotideResidue(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TimeProportionalLengthType"))) {
			return getTimeProportionalLengthType(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Continuous"))) {
			return getContinuous(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ReconcileTree"))) {
			return getReconcileTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Bifurcation"))) {
			return getBifurcation(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#AminoAcidResidue"))) {
			return getAminoAcidResidue(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Molecular"))) {
			return getMolecular(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousCharBayesianLengthType"))) {
			return getContinuousCharBayesianLengthType(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.w3.org/2002/07/owl#Thing"))) {
			return get_Thing(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TerminalNode"))) {
			return getTerminalNode(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TU"))) {
			return getTU(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#HolophyleticGroup"))) {
			return getHolophyleticGroup(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#MonophyleticGroup"))) {
			return getMonophyleticGroup(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DirectedEdge"))) {
			return getDirectedEdge(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Edge"))) {
			return getEdge(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#EdgeTransformation"))) {
			return getEdgeTransformation(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#EdgeAnnotation"))) {
			return getEdgeAnnotation(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TaxonomicLink"))) {
			return getTaxonomicLink(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TUAnnotation"))) {
			return getTUAnnotation(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#RibonucleotideResidueStateDatum"))) {
			return getRibonucleotideResidueStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#MolecularStateDatum"))) {
			return getMolecularStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CategoricalStateDatum"))) {
			return getCategoricalStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDatum"))) {
			return getCharacterStateDatum(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Branch"))) {
			return getBranch(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#SetOfNodes"))) {
			return getSetOfNodes(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Polytomy"))) {
			return getPolytomy(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#AncestralNode"))) {
			return getAncestralNode(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Node"))) {
			return getNode(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Sequence"))) {
			return getSequence(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CoordinateRange"))) {
			return getCoordinateRange(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DatumCoordinate"))) {
			return getDatumCoordinate(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DiscreteCharDistanceLengthType"))) {
			return getDiscreteCharDistanceLengthType(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DiscreteCharacterLengthType"))) {
			return getDiscreteCharacterLengthType(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#UnrootedSubtree"))) {
			return getUnrootedSubtree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Subtree"))) {
			return getSubtree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#GalledTree"))) {
			return getGalledTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CoordinateSystem"))) {
			return getCoordinateSystem(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousCharDistanceLengthType"))) {
			return getContinuousCharDistanceLengthType(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousCharacterLengthType"))) {
			return getContinuousCharacterLengthType(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Clade"))) {
			return getClade(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Tree"))) {
			return getTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Network"))) {
			return getNetwork(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#PhyloTree"))) {
			return getPhyloTree(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TreeFormat"))) {
			return getTreeFormat(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TreeAnnotation"))) {
			return getTreeAnnotation(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Standard"))) {
			return getStandard(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Categorical"))) {
			return getCategorical(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDomain"))) {
			return getCharacterStateDomain(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#GrafenLengthType"))) {
			return getGrafenLengthType(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#EdgeLengthType"))) {
			return getEdgeLengthType(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.mygrid.org.uk/ontology#phylogenetic_algorithm"))) {
			return getphylogenetic__algorithm(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#JukesKantor"))) {
			return getJukesKantor(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#SubstitutionModel"))) {
			return getSubstitutionModel(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ModelDescription"))) {
			return getModelDescription(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CDAOAnnotation"))) {
			return getCDAOAnnotation(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#SetOfCharacters"))) {
			return getSetOfCharacters(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#SetOfThings"))) {
			return getSetOfThings(res,model);
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
		if (type.equals(org.cdao.jasper.GammaDistribution.TYPE)) {
			types.add(org.cdao.jasper.GammaDistribution.class);
		}
		if (type.equals(org.cdao.jasper.ContinuousCharParsimonyLengthType.TYPE)) {
			types.add(org.cdao.jasper.ContinuousCharParsimonyLengthType.class);
		}
		if (type.equals(org.cdao.jasper.DiscreteCharBayesianLengthType.TYPE)) {
			types.add(org.cdao.jasper.DiscreteCharBayesianLengthType.class);
		}
		if (type.equals(org.cdao.jasper.CompoundCharacter.TYPE)) {
			types.add(org.cdao.jasper.CompoundCharacter.class);
		}
		if (type.equals(org.cdao.jasper.GapCost.TYPE)) {
			types.add(org.cdao.jasper.GapCost.class);
		}
		if (type.equals(org.cdao.jasper.FullyResolvedRootedTree.TYPE)) {
			types.add(org.cdao.jasper.FullyResolvedRootedTree.class);
		}
		if (type.equals(org.cdao.jasper.DiscreteCharParsimonyLengthType.TYPE)) {
			types.add(org.cdao.jasper.DiscreteCharParsimonyLengthType.class);
		}
		if (type.equals(org.cdao.jasper.EdgeLength.TYPE)) {
			types.add(org.cdao.jasper.EdgeLength.class);
		}
		if (type.equals(org.cdao.jasper.PHYLIPDataMatrix.TYPE)) {
			types.add(org.cdao.jasper.PHYLIPDataMatrix.class);
		}
		if (type.equals(org.cdao.jasper.AlignmentProcedure.TYPE)) {
			types.add(org.cdao.jasper.AlignmentProcedure.class);
		}
		if (type.equals(org.cdao.jasper.TimeCalibratedLengthType.TYPE)) {
			types.add(org.cdao.jasper.TimeCalibratedLengthType.class);
		}
		if (type.equals(org.cdao.jasper.StarTree.TYPE)) {
			types.add(org.cdao.jasper.StarTree.class);
		}
		if (type.equals(org.cdao.jasper.AminoAcidResidueCharacter.TYPE)) {
			types.add(org.cdao.jasper.AminoAcidResidueCharacter.class);
		}
		if (type.equals(org.cdao.jasper.Kimura2Parameters.TYPE)) {
			types.add(org.cdao.jasper.Kimura2Parameters.class);
		}
		if (type.equals(org.cdao.jasper.ContinuousCharacter.TYPE)) {
			types.add(org.cdao.jasper.ContinuousCharacter.class);
		}
		if (type.equals(org.cdao.jasper.Phylo4Tree.TYPE)) {
			types.add(org.cdao.jasper.Phylo4Tree.class);
		}
		if (type.equals(org.cdao.jasper.AminoAcid.TYPE)) {
			types.add(org.cdao.jasper.AminoAcid.class);
		}
		if (type.equals(org.cdao.jasper.UnresolvedRootedTree.TYPE)) {
			types.add(org.cdao.jasper.UnresolvedRootedTree.class);
		}
		if (type.equals(org.cdao.jasper.ContinuousStateDatum.TYPE)) {
			types.add(org.cdao.jasper.ContinuousStateDatum.class);
		}
		if (type.equals(org.cdao.jasper.SIMMAPTree.TYPE)) {
			types.add(org.cdao.jasper.SIMMAPTree.class);
		}
		if (type.equals(org.cdao.jasper.NexusDataBlock.TYPE)) {
			types.add(org.cdao.jasper.NexusDataBlock.class);
		}
		if (type.equals(org.cdao.jasper.PolymorphicStateDomain.TYPE)) {
			types.add(org.cdao.jasper.PolymorphicStateDomain.class);
		}
		if (type.equals(org.cdao.jasper.MRCANode.TYPE)) {
			types.add(org.cdao.jasper.MRCANode.class);
		}
		if (type.equals(org.cdao.jasper.CommonAncestralNode.TYPE)) {
			types.add(org.cdao.jasper.CommonAncestralNode.class);
		}
		if (type.equals(org.cdao.jasper.RootedSubtree.TYPE)) {
			types.add(org.cdao.jasper.RootedSubtree.class);
		}
		if (type.equals(org.cdao.jasper.RibonucleotideResidueCharacter.TYPE)) {
			types.add(org.cdao.jasper.RibonucleotideResidueCharacter.class);
		}
		if (type.equals(org.cdao.jasper.ContinuousCharLikelihoodLengthType.TYPE)) {
			types.add(org.cdao.jasper.ContinuousCharLikelihoodLengthType.class);
		}
		if (type.equals(org.cdao.jasper.RibonucleotideResidue.TYPE)) {
			types.add(org.cdao.jasper.RibonucleotideResidue.class);
		}
		if (type.equals(org.cdao.jasper.ParaphyleticGroup.TYPE)) {
			types.add(org.cdao.jasper.ParaphyleticGroup.class);
		}
		if (type.equals(org.cdao.jasper.FullyResolvedUnrootedTree.TYPE)) {
			types.add(org.cdao.jasper.FullyResolvedUnrootedTree.class);
		}
		if (type.equals(org.cdao.jasper.BifurcatingTree.TYPE)) {
			types.add(org.cdao.jasper.BifurcatingTree.class);
		}
		if (type.equals(org.cdao.jasper.TreeProcedure.TYPE)) {
			types.add(org.cdao.jasper.TreeProcedure.class);
		}
		if (type.equals(org.cdao.jasper.StandardCharacter.TYPE)) {
			types.add(org.cdao.jasper.StandardCharacter.class);
		}
		if (type.equals(org.cdao.jasper.Compound.TYPE)) {
			types.add(org.cdao.jasper.Compound.class);
		}
		if (type.equals(org.cdao.jasper.FASTADataMatrix.TYPE)) {
			types.add(org.cdao.jasper.FASTADataMatrix.class);
		}
		if (type.equals(org.cdao.jasper.PolyphyleticGroup.TYPE)) {
			types.add(org.cdao.jasper.PolyphyleticGroup.class);
		}
		if (type.equals(org.cdao.jasper.CompoundStateDatum.TYPE)) {
			types.add(org.cdao.jasper.CompoundStateDatum.class);
		}
		if (type.equals(org.cdao.jasper.AminoAcidResidueStateDatum.TYPE)) {
			types.add(org.cdao.jasper.AminoAcidResidueStateDatum.class);
		}
		if (type.equals(org.cdao.jasper.UnresolvedUnrootedTree.TYPE)) {
			types.add(org.cdao.jasper.UnresolvedUnrootedTree.class);
		}
		if (type.equals(org.cdao.jasper.UnrootedTree.TYPE)) {
			types.add(org.cdao.jasper.UnrootedTree.class);
		}
		if (type.equals(org.cdao.jasper.UnresolvedTree.TYPE)) {
			types.add(org.cdao.jasper.UnresolvedTree.class);
		}
		if (type.equals(org.cdao.jasper.SpeciesTree.TYPE)) {
			types.add(org.cdao.jasper.SpeciesTree.class);
		}
		if (type.equals(org.cdao.jasper.CharacterStateDataMatrix.TYPE)) {
			types.add(org.cdao.jasper.CharacterStateDataMatrix.class);
		}
		if (type.equals(org.cdao.jasper.CoordinateList.TYPE)) {
			types.add(org.cdao.jasper.CoordinateList.class);
		}
		if (type.equals(org.cdao.jasper.DiscreteCharLikelihoodLengthType.TYPE)) {
			types.add(org.cdao.jasper.DiscreteCharLikelihoodLengthType.class);
		}
		if (type.equals(org.cdao.jasper.Generic__State.TYPE)) {
			types.add(org.cdao.jasper.Generic__State.class);
		}
		if (type.equals(org.cdao.jasper.ReticulateEvolution.TYPE)) {
			types.add(org.cdao.jasper.ReticulateEvolution.class);
		}
		if (type.equals(org.cdao.jasper.StandardStateDatum.TYPE)) {
			types.add(org.cdao.jasper.StandardStateDatum.class);
		}
		if (type.equals(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatum.TYPE)) {
			types.add(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatum.class);
		}
		if (type.equals(org.cdao.jasper.UncertainStateDomain.TYPE)) {
			types.add(org.cdao.jasper.UncertainStateDomain.class);
		}
		if (type.equals(org.cdao.jasper.NEXUSTreeBlock.TYPE)) {
			types.add(org.cdao.jasper.NEXUSTreeBlock.class);
		}
		if (type.equals(org.cdao.jasper.PHYLIPTree.TYPE)) {
			types.add(org.cdao.jasper.PHYLIPTree.class);
		}
		if (type.equals(org.cdao.jasper.NewickTree.TYPE)) {
			types.add(org.cdao.jasper.NewickTree.class);
		}
		if (type.equals(org.cdao.jasper.Dichotomy.TYPE)) {
			types.add(org.cdao.jasper.Dichotomy.class);
		}
		if (type.equals(org.cdao.jasper.Lineage.TYPE)) {
			types.add(org.cdao.jasper.Lineage.class);
		}
		if (type.equals(org.cdao.jasper.RootedTree.TYPE)) {
			types.add(org.cdao.jasper.RootedTree.class);
		}
		if (type.equals(org.cdao.jasper.DesoxiRibonucleotideResidueCharacter.TYPE)) {
			types.add(org.cdao.jasper.DesoxiRibonucleotideResidueCharacter.class);
		}
		if (type.equals(org.cdao.jasper.MolecularCharacter.TYPE)) {
			types.add(org.cdao.jasper.MolecularCharacter.class);
		}
		if (type.equals(org.cdao.jasper.CategoricalCharacter.TYPE)) {
			types.add(org.cdao.jasper.CategoricalCharacter.class);
		}
		if (type.equals(org.cdao.jasper.Character.TYPE)) {
			types.add(org.cdao.jasper.Character.class);
		}
		if (type.equals(org.cdao.jasper.FullyResolvedTree.TYPE)) {
			types.add(org.cdao.jasper.FullyResolvedTree.class);
		}
		if (type.equals(org.cdao.jasper.CoordinatePoint.TYPE)) {
			types.add(org.cdao.jasper.CoordinatePoint.class);
		}
		if (type.equals(org.cdao.jasper.GenBankDataMatrix.TYPE)) {
			types.add(org.cdao.jasper.GenBankDataMatrix.class);
		}
		if (type.equals(org.cdao.jasper.DataMatrixFormat.TYPE)) {
			types.add(org.cdao.jasper.DataMatrixFormat.class);
		}
		if (type.equals(org.cdao.jasper.CharacterStateDataMatrixAnnotation.TYPE)) {
			types.add(org.cdao.jasper.CharacterStateDataMatrixAnnotation.class);
		}
		if (type.equals(org.cdao.jasper.DesoxiRibonucleotideResidue.TYPE)) {
			types.add(org.cdao.jasper.DesoxiRibonucleotideResidue.class);
		}
		if (type.equals(org.cdao.jasper.TimeProportionalLengthType.TYPE)) {
			types.add(org.cdao.jasper.TimeProportionalLengthType.class);
		}
		if (type.equals(org.cdao.jasper.Continuous.TYPE)) {
			types.add(org.cdao.jasper.Continuous.class);
		}
		if (type.equals(org.cdao.jasper.ReconcileTree.TYPE)) {
			types.add(org.cdao.jasper.ReconcileTree.class);
		}
		if (type.equals(org.cdao.jasper.Bifurcation.TYPE)) {
			types.add(org.cdao.jasper.Bifurcation.class);
		}
		if (type.equals(org.cdao.jasper.AminoAcidResidue.TYPE)) {
			types.add(org.cdao.jasper.AminoAcidResidue.class);
		}
		if (type.equals(org.cdao.jasper.Molecular.TYPE)) {
			types.add(org.cdao.jasper.Molecular.class);
		}
		if (type.equals(org.cdao.jasper.ContinuousCharBayesianLengthType.TYPE)) {
			types.add(org.cdao.jasper.ContinuousCharBayesianLengthType.class);
		}
		if (type.equals(org.cdao.jasper._Thing.TYPE)) {
			types.add(org.cdao.jasper._Thing.class);
		}
		if (type.equals(org.cdao.jasper.TerminalNode.TYPE)) {
			types.add(org.cdao.jasper.TerminalNode.class);
		}
		if (type.equals(org.cdao.jasper.TU.TYPE)) {
			types.add(org.cdao.jasper.TU.class);
		}
		if (type.equals(org.cdao.jasper.HolophyleticGroup.TYPE)) {
			types.add(org.cdao.jasper.HolophyleticGroup.class);
		}
		if (type.equals(org.cdao.jasper.MonophyleticGroup.TYPE)) {
			types.add(org.cdao.jasper.MonophyleticGroup.class);
		}
		if (type.equals(org.cdao.jasper.DirectedEdge.TYPE)) {
			types.add(org.cdao.jasper.DirectedEdge.class);
		}
		if (type.equals(org.cdao.jasper.Edge.TYPE)) {
			types.add(org.cdao.jasper.Edge.class);
		}
		if (type.equals(org.cdao.jasper.EdgeTransformation.TYPE)) {
			types.add(org.cdao.jasper.EdgeTransformation.class);
		}
		if (type.equals(org.cdao.jasper.EdgeAnnotation.TYPE)) {
			types.add(org.cdao.jasper.EdgeAnnotation.class);
		}
		if (type.equals(org.cdao.jasper.TaxonomicLink.TYPE)) {
			types.add(org.cdao.jasper.TaxonomicLink.class);
		}
		if (type.equals(org.cdao.jasper.TUAnnotation.TYPE)) {
			types.add(org.cdao.jasper.TUAnnotation.class);
		}
		if (type.equals(org.cdao.jasper.RibonucleotideResidueStateDatum.TYPE)) {
			types.add(org.cdao.jasper.RibonucleotideResidueStateDatum.class);
		}
		if (type.equals(org.cdao.jasper.MolecularStateDatum.TYPE)) {
			types.add(org.cdao.jasper.MolecularStateDatum.class);
		}
		if (type.equals(org.cdao.jasper.CategoricalStateDatum.TYPE)) {
			types.add(org.cdao.jasper.CategoricalStateDatum.class);
		}
		if (type.equals(org.cdao.jasper.CharacterStateDatum.TYPE)) {
			types.add(org.cdao.jasper.CharacterStateDatum.class);
		}
		if (type.equals(org.cdao.jasper.Branch.TYPE)) {
			types.add(org.cdao.jasper.Branch.class);
		}
		if (type.equals(org.cdao.jasper.SetOfNodes.TYPE)) {
			types.add(org.cdao.jasper.SetOfNodes.class);
		}
		if (type.equals(org.cdao.jasper.Polytomy.TYPE)) {
			types.add(org.cdao.jasper.Polytomy.class);
		}
		if (type.equals(org.cdao.jasper.AncestralNode.TYPE)) {
			types.add(org.cdao.jasper.AncestralNode.class);
		}
		if (type.equals(org.cdao.jasper.Node.TYPE)) {
			types.add(org.cdao.jasper.Node.class);
		}
		if (type.equals(org.cdao.jasper.Sequence.TYPE)) {
			types.add(org.cdao.jasper.Sequence.class);
		}
		if (type.equals(org.cdao.jasper.CoordinateRange.TYPE)) {
			types.add(org.cdao.jasper.CoordinateRange.class);
		}
		if (type.equals(org.cdao.jasper.DatumCoordinate.TYPE)) {
			types.add(org.cdao.jasper.DatumCoordinate.class);
		}
		if (type.equals(org.cdao.jasper.DiscreteCharDistanceLengthType.TYPE)) {
			types.add(org.cdao.jasper.DiscreteCharDistanceLengthType.class);
		}
		if (type.equals(org.cdao.jasper.DiscreteCharacterLengthType.TYPE)) {
			types.add(org.cdao.jasper.DiscreteCharacterLengthType.class);
		}
		if (type.equals(org.cdao.jasper.UnrootedSubtree.TYPE)) {
			types.add(org.cdao.jasper.UnrootedSubtree.class);
		}
		if (type.equals(org.cdao.jasper.Subtree.TYPE)) {
			types.add(org.cdao.jasper.Subtree.class);
		}
		if (type.equals(org.cdao.jasper.GalledTree.TYPE)) {
			types.add(org.cdao.jasper.GalledTree.class);
		}
		if (type.equals(org.cdao.jasper.CoordinateSystem.TYPE)) {
			types.add(org.cdao.jasper.CoordinateSystem.class);
		}
		if (type.equals(org.cdao.jasper.ContinuousCharDistanceLengthType.TYPE)) {
			types.add(org.cdao.jasper.ContinuousCharDistanceLengthType.class);
		}
		if (type.equals(org.cdao.jasper.ContinuousCharacterLengthType.TYPE)) {
			types.add(org.cdao.jasper.ContinuousCharacterLengthType.class);
		}
		if (type.equals(org.cdao.jasper.Clade.TYPE)) {
			types.add(org.cdao.jasper.Clade.class);
		}
		if (type.equals(org.cdao.jasper.Tree.TYPE)) {
			types.add(org.cdao.jasper.Tree.class);
		}
		if (type.equals(org.cdao.jasper.Network.TYPE)) {
			types.add(org.cdao.jasper.Network.class);
		}
		if (type.equals(org.cdao.jasper.PhyloTree.TYPE)) {
			types.add(org.cdao.jasper.PhyloTree.class);
		}
		if (type.equals(org.cdao.jasper.TreeFormat.TYPE)) {
			types.add(org.cdao.jasper.TreeFormat.class);
		}
		if (type.equals(org.cdao.jasper.TreeAnnotation.TYPE)) {
			types.add(org.cdao.jasper.TreeAnnotation.class);
		}
		if (type.equals(org.cdao.jasper.Standard.TYPE)) {
			types.add(org.cdao.jasper.Standard.class);
		}
		if (type.equals(org.cdao.jasper.Categorical.TYPE)) {
			types.add(org.cdao.jasper.Categorical.class);
		}
		if (type.equals(org.cdao.jasper.CharacterStateDomain.TYPE)) {
			types.add(org.cdao.jasper.CharacterStateDomain.class);
		}
		if (type.equals(org.cdao.jasper.GrafenLengthType.TYPE)) {
			types.add(org.cdao.jasper.GrafenLengthType.class);
		}
		if (type.equals(org.cdao.jasper.EdgeLengthType.TYPE)) {
			types.add(org.cdao.jasper.EdgeLengthType.class);
		}
		if (type.equals(org.cdao.jasper.phylogenetic__algorithm.TYPE)) {
			types.add(org.cdao.jasper.phylogenetic__algorithm.class);
		}
		if (type.equals(org.cdao.jasper.JukesKantor.TYPE)) {
			types.add(org.cdao.jasper.JukesKantor.class);
		}
		if (type.equals(org.cdao.jasper.SubstitutionModel.TYPE)) {
			types.add(org.cdao.jasper.SubstitutionModel.class);
		}
		if (type.equals(org.cdao.jasper.ModelDescription.TYPE)) {
			types.add(org.cdao.jasper.ModelDescription.class);
		}
		if (type.equals(org.cdao.jasper.CDAOAnnotation.TYPE)) {
			types.add(org.cdao.jasper.CDAOAnnotation.class);
		}
		if (type.equals(org.cdao.jasper.SetOfCharacters.TYPE)) {
			types.add(org.cdao.jasper.SetOfCharacters.class);
		}
		if (type.equals(org.cdao.jasper.SetOfThings.TYPE)) {
			types.add(org.cdao.jasper.SetOfThings.class);
		}
		return types;
	}
}