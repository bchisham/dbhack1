package org.cdao.utils;

import java.io.InputStream;

import org.mindswap.pellet.jena.PelletReasonerFactory;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.InfModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;


public class Singleton {
	
	private static Singleton me;
	private OntModel schemaModel;
	private OntModel instanceModel;

	public Singleton(String cdaoInstanceFileName) {
		me = this;
		
		
		  // ontology that will be used
        //String ont = "http://protege.cim3.net/file/pub/ontologies/koala/koala.owl#";
        
		schemaModel = ModelFactory.createOntologyModel();
		//instanceModel = ModelFactory.createOntologyModel();
		instanceModel = ModelFactory.createOntologyModel(PelletReasonerFactory.THE_SPEC);

		readOWLFile(cdaoInstanceFileName, instanceModel, CDAOUtils.CDAO_NS_PREFIX + "#");
		readOWLFile(CDAOUtils.CDAO_NS_PREFIX, schemaModel, CDAOUtils.CDAO_NS_PREFIX + "#");
		instanceModel = (OntModel) schemaModel.add(instanceModel);
		
		//schemaModel.write(System.out);
	}
	
	public Model getCDAOSchemaModel(){
		return schemaModel;
	}
	public Model getCDAOInstanceModel() {
		return instanceModel;
	}
	
	static public Singleton Instance()  { 
		return me;
	}
	
	public void readOWLFile(String fileName, Model model, String nameSpace) {
		InputStream in = FileManager.get().open(fileName);
		// check unavailability
		if (in == null) {
			throw new IllegalArgumentException( "File: " + fileName + " not found");
		}
		// read the RDF/XML file
		model.read(in, nameSpace);
	}

}
