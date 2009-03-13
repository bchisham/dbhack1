package org.cdao.wrapper;

import java.util.Iterator;
import java.util.Vector;

import org.cdao.utils.CDAOUtils;
import org.cdao.utils.Singleton;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.ResIterator;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * 
 * This  wrapper class handles methods pertaining to one or more trees in the CDAO instance file.
 * A vector of Tree objects (containing only resource of the trees in the CDAO instance model) is also created when the class in instantiated.
 * This vector is then used for other methods used for browsing the trees or extracting other tree-related features.
 * 
 * @author vivekgopalan@gmail.com
 *
 */

public class Trees extends CDAOBase {
	
	Vector<Tree> treesVector = new Vector<Tree>();
	
	/**
	 * Initialize the class and extract all the available tree from the input RDF/OWL instance
	 */
	public Trees() {
	}
	
	
	// This method will be removed later. Currently it is kept for testing and understanding the 
	// reasoning options given to Pellet.
	public Vector<String> getAllTreeLabelsUsingReasoning() {
		Vector<String> out = new Vector<String>();
		
		ResultSet results = CDAOUtils.executeGetAllTreeLabelsQuery(instanceModel);
		//ResultSetFormatter.out(System.out, results, query);
		
		for ( ; results.hasNext() ; ) {
			QuerySolution soln = results.nextSolution() ;
			String treeLabel = soln.getLiteral("treeLabel").getString();
			out.add(treeLabel);
			//System.out.println("Tree label :  " + treeLabel);
		}
		return out;
	}
	
	/**
	 * Returns the {@link Tree} object with specific label attribute
	 * 
	 * @param treeLabel
	 * @return {@link Tree} or null
	 */
	public Tree getTree(String treeLabel) {
		for (Iterator<Tree> iter = treesVector.iterator(); iter.hasNext();) {
			Tree t = iter.next();
			if (t.getName().equals(treeLabel)) return t;
		}
		return null;
	}
	
	/**
	 * Returns a vector containing tree names obtained from the {@link Tree} class.
	 * 
	 * @return Vector<String>
	 */
	public Vector<String> getAllTreeLabels() {
		Vector<String> out = new Vector<String>();
		for (Iterator<Tree> iter = treesVector.iterator(); iter.hasNext();) {
			Tree t = iter.next();
			out.add(t.getName());
		}
		return out;
	}
	
	
	

	public Vector getTreesAsVector() {
		return treesVector;
	}


	public void addTree(Tree t) {
		treesVector.add(t);
		
	}
}