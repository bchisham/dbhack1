package org.cdao.wrapper;

import java.util.Iterator;
import java.util.Vector;

import org.cdao.utils.CDAOUtils;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.ResIterator;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.vocabulary.DC;

public class Tree extends CDAOBase {

	private Resource resource;
	Vector<Node> nodesVector = new Vector<Node>();
	
	public Tree(Resource r) {
		this.resource = r;
		extractAllNodes();
	}
	
	public String toNewick() {
		Node  rootNode = getRootNode();
		if (rootNode != null) {
			return rootNode.toNewick();
		}else {
			System.out.println("** Only rooted nodes are processed now.");
			
		}
		return null;
	}
	
	/**
	 * Gets the name of the tree
	 * @return
	 */
	public String getName() {
		// (node dc:label name).
		return CDAOUtils.getLabelPropertyOfResource(resource, instanceModel);
	}
	
	/**
	 * Extracts all the Node resource of this tree
	 * @return
	 */
	public void extractAllNodes() {
		
		// (node belongs_to_Tree tree)
		Property p =instanceModel.getProperty(CDAOUtils.CDAO_NS_PREFIX+"#belongs_to_Tree");
		
		StmtIterator iter = instanceModel.listStatements( null , p, resource);
		while (iter.hasNext()) {
			Resource nodeResource = iter.nextStatement().getSubject();
			Node n = new Node(nodeResource, this);
			nodesVector.add(n);
			//System.out.println("    " + nodeResource.getURI());
		}
	}
	
	public Vector<Node> getAllTerminalNodes() {
		Vector<Node> out = new Vector<Node>();
		for (Iterator iterator = nodesVector.iterator(); iterator.hasNext();) {
			Node n = (Node) iterator.next();
			if (n.isTerminal()) {
				out.add(n);
			}
		}
		return out;
	}
	
	public Vector<Node> getAllInternalNodes() {
		Vector<Node> out = new Vector<Node>();
		for (Iterator iterator = nodesVector.iterator(); iterator.hasNext();) {
			Node n = (Node) iterator.next();
			if (!n.isTerminal()) {
				out.add(n);
			}
		}
		return out;
	}
	
	public Node getRootNode() {
		// if tree is the subject and has property has_Child_Node
		// (tree has_Root node)
		Property p = ResourceFactory.createProperty(CDAOUtils.CDAO_NS_PREFIX + "#has_Root");
		StmtIterator stm = instanceModel.listStatements(resource , p, (RDFNode)null);
		while(stm.hasNext()) {
			Statement s =  stm.nextStatement();
			RDFNode r = s.getObject();
			if (instanceModel.containsResource(r)) {
				return  getNodebyResource((Resource)r);
			}
		}
		return null;
	}
	
	/**
	 * Get nodes by Resource 
	 * @param r
	 * @return
	 */
	public Node getNodebyResource(Resource r) {
		for (Iterator iterator = nodesVector.iterator(); iterator.hasNext();) {
			Node n = (Node) iterator.next();
			if (CDAOUtils.isEqual(r, n.getResource())) {
				return n;
			}
		}
		return null;
	}
	
	public Node getNodebyName(String nodeName) {
		for (Iterator iterator = nodesVector.iterator(); iterator.hasNext();) {
			Node n = (Node) iterator.next();
			if (n.getName().equals(nodeName)) {
				return n;
			}
		}
		return null;
	}

	public boolean getParent(Node child) {
		// if the node resource is the object and has property has_Child_Node
		// (directedEdge has_Child_Node node)
		Property p = ResourceFactory.createProperty(CDAOUtils.CDAO_NS_PREFIX + "#has_Child_Node");
		if (instanceModel.contains(null , p, resource)) 
			return true;
		else 
			return false;
	}
	
	
	/**
	 * Returns the Resource element associated with this tree
	 * @return
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * Dumps triples associated with this tree
	 */
	public void printSummary() {
		CDAOUtils.printSummary(resource);
		
	}

	/**
	 * Infer the whether rooted based on inference from the Node property has_Root
	 * @return
	 */
	public boolean isRooted() {
			// if the node resource is the object and has property has_Child_Node
			// (tree has_Child_Node node)
			Property p = ResourceFactory.createProperty(CDAOUtils.CDAO_NS_PREFIX + "#has_Root");
			if (instanceModel.contains(resource, p, (RDFNode)null)) 
				return true;
			else 
				return false;
	}

}