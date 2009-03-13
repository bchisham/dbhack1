package org.cdao.wrapper;


import java.util.Vector;

import org.cdao.utils.CDAOUtils;

import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.vocabulary.DC;

public class Node extends CDAOBase {

	
	private String name = "";
	private Resource resource;
	private Tree tree;

	public Node(Resource r, Tree tree) {
		this.resource = r;
		this.tree     = tree;
		Property p = instanceModel.getProperty(DC.getURI() + "label");
		if (r.hasProperty(p)) {
			name = r.getProperty(p).getString();
			//System.out.println(r.getProperty(p));
		}
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isRoot() {
		// if the node resource is the object and has property has_Root
		// (tree has_Root node)
		Property p = ResourceFactory.createProperty(CDAOUtils.CDAO_NS_PREFIX + "#has_Root");
		if (instanceModel.contains(null , p, resource)) 
			return true;
		else 
			return false;
	}
	
	public boolean isTerminal() {
		// if the node resource is the object and has property has_Child_Node
		// (tree has_Child_Node node)
		Property p = ResourceFactory.createProperty(CDAOUtils.CDAO_NS_PREFIX + "#has_Child_Node");
		if (instanceModel.contains(null , p, resource)) 
			return true;
		else 
			return false;
	}
	
	/**
	 * Returns the parent Node of this node.
	 * The parent node is inferred from Jena model
	 * 
	 * @return
	 */
	public Node getParent() {
		// if the node resource is the object and has property has_Child_Node
		// (directedEdge has_Child_Node node)
		Property p = ResourceFactory.createProperty(CDAOUtils.CDAO_NS_PREFIX + "#has_Child_Node");
		StmtIterator stm = instanceModel.listStatements(tree.getResource(), p, (RDFNode)null);
		while(stm.hasNext()) {
			Statement s =  stm.nextStatement();
			RDFNode r = s.getObject();
			if (instanceModel.containsResource(r)) {
				return  tree.getNodebyResource((Resource)r);
			}
		}
		return null;
	}
	
	/**
	 * Get all the children or immediate descendants of the input {@link Node}.
	 * The descents are obtained using SPARQL query. Refer to {@link CDAOUtils} for 
	 * the query string passed to the Pellet reasoner
	 * 
	 * @param node
	 * @return
	 */
	public Vector<Node> getChildren() {
		
		Vector<Node> out = new Vector<Node>();
		ResultSet results = CDAOUtils.executeGetAllDescendentsInTreeFor(resource,tree.getResource(),instanceModel);
		//ResultSetFormatter.out(System.out, results, query);
		
		for ( ; results.hasNext() ; ) {
			QuerySolution soln = results.nextSolution() ;
			Resource r1 = soln.getResource("childNode");
			out.add(tree.getNodebyResource(r1));
		}
		return out;
	}
	
	
	/**
	 * returns the Resource of this node
	 * @return
	 */
	public Resource getResource() {
		return resource;
	}
	
	
	/**
	 * Prints the Triples related to this Node resource
	 */
	public void printSummary() {
		CDAOUtils.printSummary(resource);
	}
	
	public String toNewick() {
		return toString();
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		toString(this, sb);
		return sb.toString();
	}
	
	// toString method provided for testing purposes
	public void toString(Node n, StringBuffer sb) {
		Vector<Node> children = n.getChildren();
		if (children.size() == 0) {
			sb.append(n.getName());
			//sb.append(":");
			//sb.append(n.getName());
		} else {
			sb.append("(");
			toString(children.elementAt(0), sb);
			for (int i = 1; i < children.size(); i++) {
				sb.append(",");
				toString(children.elementAt(i), sb);
			}
			sb.append("):");
			sb.append(n.getName());
		}
	}
	
	
	
}
