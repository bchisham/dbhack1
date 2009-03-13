package net.hyam.nexml.owltester;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.xml.sax.SAXParseException;

import com.hp.hpl.jena.db.DBConnection;
import com.hp.hpl.jena.db.IDBConnection;
import com.hp.hpl.jena.rdf.arp.DOM2Model;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.ModelMaker;

public class Loader {

	Properties props = null;
	
	public void setProperties(Properties props){
		this.props = props;
	}
	
	public void load(String nexmlFilePath){
		
		// load the the driver class
		try {
			Class.forName(props.getProperty("db.driver.class"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Couldn't find the db driver class - check your classpath!");
			e.printStackTrace();
		}


		// create a database connection
		IDBConnection conn = new DBConnection(
				props.getProperty("db.url"),
				props.getProperty("db.user"), 
				props.getProperty("db.password"),
				props.getProperty("db.type")
				);


		// create a model maker with the given connection parameters
		ModelMaker maker = ModelFactory.createModelRDBMaker(conn);
		
		Model model = maker.openModel("http://nexml-bucket.org");
		if (model == null){
			model = maker.createModel("http://nexml-bucket.org");
		}
		
		Model nexModel = getModelFromNexml(nexmlFilePath);
		
		model.add(nexModel);
		
		System.out.println("Loaded file " + nexmlFilePath);
	}
	
	public Model getModelFromNexml(String nexmlFileLocation){
		
		// lets make a transformer
		Transformer transformer = null;
		TransformerFactory tFactory = TransformerFactory.newInstance();
		StreamSource stylesource = new StreamSource(new File(props.getProperty("xslt.nexml.cdao")));
		try {
			transformer = tFactory.newTransformer(stylesource);
		} catch (TransformerConfigurationException e) {
			System.out.println("Trouble reading the XSLT file in: " + props.getProperty("xslt.nexml.cdao"));
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
		Document rdfXmlDom = (Document)domResult.getNode();
		
		System.out.println("Done transform to RDF/XML");
		
		Model newModel = ModelFactory.createDefaultModel();
		
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
		
		return newModel;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args.length != 2 ) {
			System.out.println("This will Load a nexml file into a tripple store according to the properties file");
			System.out
					.println("Usage: Loader <loader.properties>  <nexml_file.xml> ");
			System.exit(1);
		}
		
		Properties props = new Properties();
		try {
			props.load(new FileReader(args[0]));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Couldn't find the properties file: " + args[0]);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Bad things happened reading the properties file: " + args[0]); 
			e.printStackTrace();
		}
		
		Loader loader = new Loader();
		loader.setProperties(props);
		
		loader.load(args[1]);
		
		
	}

}
