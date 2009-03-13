package org.cdao.wrapper;

import org.cdao.utils.CDAOUtils;
import org.cdao.utils.Singleton;

import com.hp.hpl.jena.ontology.OntModel;

/**
 * The base class for datamodel classes
 * Contains the Jena model obtained from the CDAO OWL schema and CDAO instance resource
 * 
 * @author vivekgopalan@gmail.com
 */
public abstract class CDAOBase {
	
	OntModel schemaModel = (OntModel) Singleton.Instance().getCDAOSchemaModel();
	OntModel instanceModel = (OntModel) Singleton.Instance().getCDAOInstanceModel();
	
}
