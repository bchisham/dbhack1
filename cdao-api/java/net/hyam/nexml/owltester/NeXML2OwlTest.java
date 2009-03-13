package net.hyam.nexml.owltester;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stream.StreamSource;


import org.w3c.dom.Document;
import org.xml.sax.SAXParseException;

import com.hp.hpl.jena.rdf.arp.DOM2Model;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;

public class NeXML2OwlTest {

	protected Document rdfXmlDom = null;
	protected Model newModel = null;
	protected Model expectedModel = null;
	
	public void transformNexml(String nexmlFileLocation, String xsltLocation){
		
		// lets make a transformer
		Transformer transformer = null;
		TransformerFactory tFactory = TransformerFactory.newInstance();
		StreamSource stylesource = new StreamSource(new File(xsltLocation));
		try {
			transformer = tFactory.newTransformer(stylesource);
		} catch (TransformerConfigurationException e) {
			System.out.println("Trouble reading the XSLT file in: " + xsltLocation);
			e.printStackTrace();
			System.exit(1);
		}
		
		// create an XML Source for transformation
		StreamSource xmlSource = new StreamSource(nexmlFileLocation);
		
		// create a target to put this in
		DOMResult domResult = new DOMResult();
		
		try {
			transformer.transform(xmlSource, domResult);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			System.out.println("Bad things happened when we did the tranformation");
			e.printStackTrace();
		}
		
		// write out the DOM ?
		rdfXmlDom = (Document)domResult.getNode();
		
		System.out.println("Done transform to RDF/XML");
		
	}
	
	
	public void generateRdfModel(){
		
		newModel = ModelFactory.createDefaultModel();
		
		// FIXME - We need to work out a base URI for the page
		DOM2Model d2m = null;
		try {
			d2m = DOM2Model.createD2M("http://example.com/ontology#", newModel);
		} catch (SAXParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d2m.load(rdfXmlDom);
		
		System.out.println("Generated RDF model from RDF/XML. Total statements: " + newModel.size());
		
	}
	
	
	
	public void writeRdfModelTo(String outFileName){
		try {
			newModel.write(new FileOutputStream(outFileName));
		} catch (FileNotFoundException e) {
			System.out.println("Failed writing new RDF Model to outfile: " + outFileName);
			e.printStackTrace();
			System.exit(1);
		}
		
		System.out.println("Written RDF Model to: " + outFileName);
		
	}
	
	public void loadExpectedModel(String expectedModFileName){
		
		expectedModel = ModelFactory.createDefaultModel();
		
		InputStream in = null;
		try {
			in = new FileInputStream( expectedModFileName );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to open expected model file");
			e.printStackTrace();
		}

		// read the RDF/XML file
		expectedModel.read(in, "");
		
		System.out.println("Loaded RDF for expected model. Total statements: " + expectedModel.size());

	}
	
	public void compareModels(){
		
		Model newModelExtras = newModel.difference(expectedModel);
		if (newModelExtras.size() > 0){
			System.out.println("************ New Model Has "  + newModelExtras.size()  + " Extra Assertions ***********");
			writeOutTriples(newModelExtras);
		}
		Model newModelMissing = expectedModel.difference(newModel);
		if (newModelMissing.size() > 0){
			System.out.println("************ New Model Has "  + newModelMissing.size()  + " Missing Assertions ***********");
			writeOutTriples(newModelExtras);
		}
		
	}
	
	protected void writeOutTriples(Model model){
		
		// list the statements in the Model
		StmtIterator iter = model.listStatements();

		while (iter.hasNext()) {
		    Statement stmt      = iter.nextStatement();  // get next statement
		    Resource  subject   = stmt.getSubject();     // get the subject
		    Property  predicate = stmt.getPredicate();   // get the predicate
		    RDFNode   object    = stmt.getObject();      // get the object

		    System.out.print(subject.toString());
		    System.out.print(" " + predicate.toString() + " ");
		    if (object instanceof Resource) {
		       System.out.print(object.toString());
		    } else {
		        // object is a literal
		        System.out.print(" \"" + object.toString() + "\"");
		    }

		    System.out.println(" .");
		} 
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args.length < 3 || args.length > 4) {
			System.out
					.println("Usage: NeXML2OwlTest <nexml_file.xml> <transform.xslt> <expected_model.rdf> [outputmodel.rdf]");
			System.exit(1);
		}
		
		// create an instance of the tester
		NeXML2OwlTest tester = new NeXML2OwlTest();
		
		tester.transformNexml(args[0], args[1]);
		tester.generateRdfModel();
		
		// if they give us a file to write the model to
		if (args.length == 4){
			tester.writeRdfModelTo(args[3]);
		}
		
		// load the expected model
		tester.loadExpectedModel(args[2]);
		
		// compare models
		tester.compareModels();
		
	}

}
