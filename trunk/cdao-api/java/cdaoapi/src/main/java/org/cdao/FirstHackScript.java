package org.cdao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import org.cdao.utils.Singleton;
import org.cdao.wrapper.CDAO;
import org.cdao.wrapper.Node;
import org.cdao.wrapper.Tree;
import org.cdao.wrapper.Trees;

/**
 * 
 * The script is the master script is written to show the basic functionality of the API.
 * The aim is to create a CDAO object from the specified RDF file and do perform few Tree based
 * tasks on the object.
 * 
 * Note: Requires Pellet reasoner
 * 
 * 1. Create a cdao object from the RDF file : Write all the API methods required for this task
 *     a. Read RDF/OWL instance file in the src/main/java/data/ folder
 *     b. Create new org.cdao object
 *     c. Analyse and create add all the methods that should come in the org.cdao.CDAO java class
 *     d. similarly provide API methods to create, delete and manipulate Tree and Node class
 * 
 * @author vivekgopalan@gmail.com
 *
 */
public class FirstHackScript {
	
	// Check the URI for the cdao Qname in the file and make sure it is referring to the current location.
	//static String cdaoInstanceFileString = "src/main/data/Fang_2003.xml.rdf";
	//static String cdaoInstanceFileString = "src/main/data/Tree000642.nexml.rdf";
	static String cdaoInstanceFileString = "src/main/data/trees_original-local.rdf";
	//static String cdaoInstanceFileString = "src/main/data/02_mackerel_rdfa_tdwg_lsid_taxrefs.xml.rdf";
	static File cdaoInstanceFile = new File(cdaoInstanceFileString);
	
	public FirstHackScript() {
	}
	
	public static void main(String[] args) {
		FirstHackScript fh = new FirstHackScript();
		if (!cdaoInstanceFile.exists()) System.err.println("File Absent Error: Input RDF file: " + cdaoInstanceFileString + " not present." );
		
			
			// Initialize the Singleton object
			// This creates the Jena Ontology model from the CDAO instance file with Pellet reasoner
			Singleton singleton = new Singleton(cdaoInstanceFile.getAbsolutePath());
			
			
			// Create an CDAO object
			// Has top level functions
			CDAO cdao = new CDAO();
			
			// Get all the trees
			Trees trees = cdao.getTrees();
			Vector<String> treeLabels = trees.getAllTreeLabels();
			
			//Let's print all the tree labels
			System.out.print("Tree labels are : ");
			for (Iterator<String> iter = treeLabels.iterator(); iter.hasNext();) 
				System.out.print(iter.next()+ ",");
			System.out.println();
			
			//Let's explore all the trees
			Vector<Tree> treesVector = trees.getTreesAsVector();
			for (Iterator<Tree> iter = treesVector.iterator(); iter.hasNext();)  {
				Tree t = iter.next();
				t.printSummary();
				continue; //skipping : print details of the first tree only
			}
			
			// Get a specific tree from the Trees
			// Again, the Tree class is a light-weight class that has methods for tree manipulation
			// based on the tree URI. The Node objects (basically node URI's) of the tree are stored
			// as an Vector.
			
			//Tree tree = trees.getTree("tree1");
			Tree tree = null;
			
			if (treesVector.size() > 0 )
				tree = treesVector.elementAt(0);
			
			if (tree !=null && tree.isRooted()) {
				System.out.println(tree.getName() + " is a Rooted tree");
				
				//Get the root node 
				Node rootNode = tree.getRootNode();
				rootNode.printSummary();
				//System.out.println(rootNode.toNewick());
				
				// Print the Newick formatted Tree string
				System.out.println(tree.toNewick());
				//Done.
			}
			
			
	}
	
}
