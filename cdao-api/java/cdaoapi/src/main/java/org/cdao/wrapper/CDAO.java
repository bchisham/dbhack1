package org.cdao.wrapper;

import java.io.FileNotFoundException;
import java.util.Vector;

import org.cdao.utils.CDAOUtils;
import org.cdao.utils.Singleton;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * 
 * Class provides all top level methods on the CDAO instance model.
 * 
 * @author vivekgopalan@gmail.com
 */

public class CDAO extends CDAOBase {
	
	private OntModel model;
	private Trees trees;
	
	/**
	 * Constructor
	 * The {@link Singleton} Class should be instantiated before calling this constructor.
	 * @throws FileNotFoundException
	 */
	public CDAO() {
		trees = new Trees();
		extractAllTrees();
	}
	
	public void setTrees() {
	}
	
	public Trees getTrees() {
		return trees;
	}
	
	/**
	 * Private methods that finds all the tree resources in the data using reasoning
	 * 
	 */
	private void extractAllTrees(){
		
		Vector<Tree> out = new Vector<Tree>();
		ResultSet results = CDAOUtils.executeGetAllTreesQuery(schemaModel.add(instanceModel));
		//ResultSetFormatter.out(System.out, results, query);
		
		for ( ; results.hasNext() ; ) {
			QuerySolution soln = results.nextSolution() ;
			Resource r= soln.getResource("treeResource");
			Tree t = new Tree(r);
			trees.addTree(t);
			System.out.println("Tree resource :  " + t.getResource());
		}
	}
	
	
	
}
