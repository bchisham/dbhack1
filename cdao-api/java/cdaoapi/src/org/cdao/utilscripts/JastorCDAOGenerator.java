package org.cdao.utilscripts;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.ibm.adtech.jastor.JastorContext;
import com.ibm.adtech.jastor.JastorGenerator;


public class JastorCDAOGenerator {

	/**
	 * Creates all the Java source files based on the CDAO ontology using Jasper library (http://jastor.sourceforge.net/)
	 * Jasper (version 1.0.4) which relies on Jena (version 2.4) is used for the current build (10MAR2009).
	 * 
	 * Important note : It should be used only when the CDAO ontology is changed. Appropriate changes have to made in the API whenever
	 * this script is run on new Ontology schema file
	 * 
	 * @param args
	 */
	//static String CDAO_FILE_PATH = "cdaov2.owl";
	static String CDAO_URL ="http://cdao.cvs.sourceforge.net/viewvc/*checkout*/cdao/cdao/OWL/cdaov2.owl?revision=1.1";
	
	public static void main(String[] args) {
		JastorContext ctx = new JastorContext();
		try {
			URL cdaoUrl = new URL(CDAO_URL);
			InputStream is =   cdaoUrl.openStream();
			//InputStream is = new FileInputStream(CDAO_FILE_PATH);
			
			ctx.addOntologyToGenerate(is, "http://www.cdao.org/CDAO", "org.cdao.jasper"); 
			JastorGenerator gen = null;
			gen = new JastorGenerator( new File("gensrc").getCanonicalFile(), ctx);
			gen.run();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
