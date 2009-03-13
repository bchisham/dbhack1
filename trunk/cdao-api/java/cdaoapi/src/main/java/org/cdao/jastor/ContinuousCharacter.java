

package org.cdao.jastor;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for ContinuousCharacter ontology class<br>
 * Use the org.cdao.jasper.CDAOFactory to create instances of this interface.
 * <p>(URI: http://localhost/~vivek/cdao.owl#ContinuousCharacter)</p>
 * <br>
 * <br>
 * Dublin Core Standard Properties <br>
 * 	description : A character described by a continuous value <br>
 * <br>
 */
public interface ContinuousCharacter extends org.cdao.jastor.Character, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://localhost/~vivek/cdao.owl#ContinuousCharacter");
	

	/**
	 * The Jena Property for has__Continuous__Datum 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Continuous_Datum)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates a continuous character to a state datum for the character.^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Continuous__DatumProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Continuous_Datum");


	/**
	 * The Jena Property for has__Annotation 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Annotation)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__AnnotationProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Annotation");


	/**
	 * The Jena Property for belongs__to 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#belongs_to)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : Generic property that links a concept to another concept it is a constituent of. The property is a synonym of part_of. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__toProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to");


	/**
	 * The Jena Property for has__Value 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Value)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__ValueProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Value");


	/**
	 * The Jena Property for has__Support__Value 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Support_Value)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Support__ValueProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Support_Value");


	/**
	 * The Jena Property for has__Float__Value 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Float_Value)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Float__ValueProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Float_Value");


	/**
	 * The Jena Property for has__Int__Value 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Int_Value)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Int__ValueProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Int_Value");


	/**
	 * The Jena Property for has__Uncertainty__Factor 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Uncertainty_Factor)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Uncertainty__FactorProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Uncertainty_Factor");


	/**
	 * The Jena Property for has__Precision 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Precision)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__PrecisionProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Precision");


	/**
	 * The Jena Property for has__External__Reference 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_External_Reference)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__External__ReferenceProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_External_Reference");


	/**
	 * The Jena Property for connects__to 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#connects_to)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property connects__toProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#connects_to");


	/**
	 * The Jena Property for has 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : Generic 'has' property. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has");


	/**
	 * The Jena Property for part__of 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#part_of)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property part__ofProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#part_of");


	/**
	 * The Jena Property for precedes 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#precedes)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property precedesProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#precedes");




	/**
	 * Get an Iterator the 'has__Datum' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.ContinuousStateDatum}
	 * @see			#has__DatumProperty
	 */
	public java.util.Iterator getHas__Datum_asContinuousStateDatum() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Datum' property
	 * @param		The {@link org.cdao.jastor.ContinuousStateDatum} to add
	 * @see			#has__DatumProperty
	 */
	public void addHas__Datum(org.cdao.jastor.ContinuousStateDatum has__Datum) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Datum' property
	 * @return		The anoymous {@link org.cdao.jastor.ContinuousStateDatum} created
	 * @see			#has__DatumProperty
	 */
	public org.cdao.jastor.ContinuousStateDatum addHas__Datum_asContinuousStateDatum() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#ContinuousStateDatum.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__DatumProperty
	 */
	public org.cdao.jastor.ContinuousStateDatum addHas__Datum_asContinuousStateDatum(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Datum' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.ContinuousStateDatum} to remove
	 * @see			#has__DatumProperty
	 */
	public void removeHas__Datum(org.cdao.jastor.ContinuousStateDatum has__Datum) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Continuous__Datum' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.ContinuousStateDatum}
	 * @see			#has__Continuous__DatumProperty
	 */
	public java.util.Iterator getHas__Continuous__Datum() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Continuous__Datum' property
	 * @param		The {@link org.cdao.jastor.ContinuousStateDatum} to add
	 * @see			#has__Continuous__DatumProperty
	 */
	public void addHas__Continuous__Datum(org.cdao.jastor.ContinuousStateDatum has__Continuous__Datum) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Continuous__Datum' property
	 * @return		The anoymous {@link org.cdao.jastor.ContinuousStateDatum} created
	 * @see			#has__Continuous__DatumProperty
	 */
	public org.cdao.jastor.ContinuousStateDatum addHas__Continuous__Datum() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#ContinuousStateDatum.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Continuous__DatumProperty
	 */
	public org.cdao.jastor.ContinuousStateDatum addHas__Continuous__Datum(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Continuous__Datum' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.ContinuousStateDatum} to remove
	 * @see			#has__Continuous__DatumProperty
	 */
	public void removeHas__Continuous__Datum(org.cdao.jastor.ContinuousStateDatum has__Continuous__Datum) throws com.ibm.adtech.jastor.JastorException;
		
}