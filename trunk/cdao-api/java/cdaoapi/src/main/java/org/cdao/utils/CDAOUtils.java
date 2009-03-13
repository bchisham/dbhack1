package org.cdao.utils;

import java.util.Iterator;

import com.clarkparsia.pellet.sparqldl.model.QueryPredicate;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.vocabulary.DC;

public class CDAOUtils {
	
	//public static String CDAO_NS_PREFIX = "http://www.evolutionaryontology.org/cdao.owl";
	//public static String CDAO_NS_PREFIX = "http://evolutionaryontology-dev.nescent.org/cdao.owl";
	public static String CDAO_NS_PREFIX = "http://localhost/~vivek/cdao.owl";
	public static String queryPrefix = 
		"PREFIX cdao: <" + CDAOUtils.CDAO_NS_PREFIX + "#>" + " \n" +
		"PREFIX dc: <" + "http://purl.org/dc/elements/1.1/" +"> \n" +
		"PREFIX rdfs: <" + "http://www.w3.org/2000/01/rdf-schema#" +"> \n" +
		"PREFIX rdf: <" + "http://www.w3.org/1999/02/22-rdf-syntax-ns#" +"> \n" +
		"PREFIX owl: <" + "http://www.w3.org/2002/07/owl#" +"> \n" ;
	
	public static ResultSet executeQueryOnModel(String qs, Model m) {
		
		// Create a new query
		//System.out.println(queryPrefix + qs);
		Query query = QueryFactory.create(queryPrefix + qs);
		
		// Execute the query and obtain results
		QueryExecution qe = QueryExecutionFactory.create(query,m);
		
		ResultSet results;
		try {
			results = qe.execSelect();
		}
		finally {
			qe.close(); 
		}
		return results;
	}

	// Get the all the Tree resources in the instance RDF/OWL data
	public static ResultSet executeGetAllTreesQuery(Model m) {
		String getAllTreeTypeQueryString = 
			"SELECT ?treeResource \n" +
			"WHERE {\n" +
			" { ?treeResource rdf:type cdao:Network .} \n" +
			" } \n"; 
		
		return executeQueryOnModel(getAllTreeTypeQueryString, m);
	}

	public static ResultSet executeGetAllTreeLabelsQuery(Model m) {
		String getAllTreeLabelsString = 
			"SELECT ?treeLabel ?treeResource \n" +
			"WHERE {\n" +
			" OPTIONAL { ?treeResource dc:label ?treeLabel. } \n" +
			" { ?treeResource ?xx cdao:Network .} \n" +
			" } \n"; 
		return executeQueryOnModel(getAllTreeLabelsString, m);
	}

	public static void printSummary(Resource resource) {
		String getAllTreeLabelsString = 
			"SELECT ?property ?object \n" +
			"WHERE {\n" +
			" { <" + resource.getURI() +"> ?property ?object.} \n" +
			" } \n"; 
		
		ResultSet results= executeQueryOnModel(getAllTreeLabelsString, Singleton.Instance().getCDAOInstanceModel());
		
		System.out.println("\nPrinting summary for the resource :" + resource.getURI() );
		for ( ; results.hasNext() ; ) {
			QuerySolution soln = results.nextSolution() ;
			String r1 = RDFNodeToString(soln.get("property"));
			String r2 = RDFNodeToString(soln.get("object"));
			if (r1 !=null && r2 !=null) {
				System.out.println(" (" + RDFNodeToString(resource) + " " + r1  + " " + r2 + " ).");
			}
		}
		
		String getAllTreeLabelsString1 = 
			"SELECT ?subject ?property \n" +
			"WHERE {\n" +
			" {  ?subject ?property <"+ resource.getURI() + ">.} \n" +
			" } \n"; 
		
		ResultSet results1= executeQueryOnModel(getAllTreeLabelsString1, Singleton.Instance().getCDAOInstanceModel());
		
		for ( ; results1.hasNext() ; ) {
			QuerySolution soln1 = results1.nextSolution() ;
			String r1 = RDFNodeToString(soln1.get("subject"));
			String r2 = RDFNodeToString(soln1.get("property"));
			if (r1 !=null && r2 !=null) {
				System.out.println(" (" + r1  + " " + r2 + " " + RDFNodeToString(resource) + ").");
			}
		}
		System.out.println("End of summary");
		
		
	}
	/**
	 * Convert the content of the RDFNode (Literal or Resource) to String.
	 * returns URI for empty RDFNode
	 */
	public static String RDFNodeToString(RDFNode n) {
		if ( n.isLiteral() )
			return ((Literal)n).getLexicalForm() ;
		if ( n.isResource() ) {
			Resource r = (Resource)n ;
			if ( ! r.isAnon() ) {
				return "<" + r.getLocalName() + ">";
			}
			return r.getLocalName();
		}
		
		return null;
		
	}
	public static String getLabelPropertyOfResource(Resource r, Model m) {
		String out = "";
		Property p = m.getProperty(DC.getURI() + "label");
		Statement pr = r.getProperty(p);
		if (pr !=null) {
			out = pr.getString();
		}
		//System.out.println(resource.getProperty(p));
		return out;
		
	}

	/**
	 * Query to get the children for a Node in a Tree
	 * 
	 * The simple logic is
	 * 
	 * 1. Restrict the results only to the selected Tree
	 * 2. Get all the child node in the Edge, where input node is the parent node
	 * 
	 * @param node
	 * @param tree
	 * @param m
	 * @return
	 */
	public static ResultSet executeGetAllDescendentsInTreeFor(
			Resource node, Resource tree, Model m) {
		
	String getAllSubNodesQueryString = 
		"SELECT ?childNode \n" +
		"WHERE { " +
        "{ ?edgeResource cdao:belongs_to_Tree <" + tree.getURI() + ">.} \n" +
        "{ ?edgeResource cdao:has_Parent_Node <" + node.getURI() + ">.} \n" +
        "{ ?edgeResource cdao:has_Child_Node ?childNode .} \n" +                           
        "}" ; 
	
  //System.out.println(getAllSubNodesQueryString);
  //       "{ ?nodeResource dc:label ?parentName.}"+                                          
 //       "{ ?nodeResource1  dc:label ?childName.}" +
	
		return executeQueryOnModel(getAllSubNodesQueryString, m);
	}
	
	public static boolean isEqual(Resource r1, Resource r2) {
		if (r1.getURI().equals(r2.getURI())) 
			return true;
		else
			return false;
	}

}
