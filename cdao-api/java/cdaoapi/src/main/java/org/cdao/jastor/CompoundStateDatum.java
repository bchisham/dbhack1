

package org.cdao.jastor;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for CompoundStateDatum ontology class<br>
 * Use the org.cdao.jasper.CDAOFactory to create instances of this interface.
 * <p>(URI: http://localhost/~vivek/cdao.owl#CompoundStateDatum)</p>
 * <br>
 * <br>
 * Dublin Core Standard Properties <br>
 * 	description : Instance of a character for a given TU, in the case of a compound type of character <br>
 * <br>
 */
public interface CompoundStateDatum extends org.cdao.jastor.CategoricalStateDatum, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://localhost/~vivek/cdao.owl#CompoundStateDatum");
	

	/**
	 * The Jena Property for has__Compound__State 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Compound_State)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property associates a compound character-state instance with its compound state value.^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Compound__StateProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Compound_State");


	/**
	 * The Jena Property for belongs__to__Compound__Character 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#belongs_to_Compound_Character)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__to__Compound__CharacterProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to_Compound_Character");


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
	 * Get an Iterator the 'has__Compound__State' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.Compound}
	 * @see			#has__Compound__StateProperty
	 */
	public java.util.Iterator getHas__Compound__State_asCompound() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Compound__State' property
	 * @param		The {@link org.cdao.jastor.Compound} to add
	 * @see			#has__Compound__StateProperty
	 */
	public void addHas__Compound__State(org.cdao.jastor.Compound has__Compound__State) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Compound__State' property
	 * @return		The anoymous {@link org.cdao.jastor.Compound} created
	 * @see			#has__Compound__StateProperty
	 */
	public org.cdao.jastor.Compound addHas__Compound__State_asCompound() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#Compound.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Compound__StateProperty
	 */
	public org.cdao.jastor.Compound addHas__Compound__State_asCompound(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Compound__State' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.Compound} to remove
	 * @see			#has__Compound__StateProperty
	 */
	public void removeHas__Compound__State(org.cdao.jastor.Compound has__Compound__State) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Compound__State' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.Generic__State}
	 * @see			#has__Compound__StateProperty
	 */
	public java.util.Iterator getHas__Compound__State_asGeneric__State() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Compound__State' property
	 * @param		The {@link org.cdao.jastor.Generic__State} to add
	 * @see			#has__Compound__StateProperty
	 */
	public void addHas__Compound__State(org.cdao.jastor.Generic__State has__Compound__State) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Compound__State' property
	 * @return		The anoymous {@link org.cdao.jastor.Generic__State} created
	 * @see			#has__Compound__StateProperty
	 */
	public org.cdao.jastor.Generic__State addHas__Compound__State_asGeneric__State() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#Generic_State.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Compound__StateProperty
	 */
	public org.cdao.jastor.Generic__State addHas__Compound__State_asGeneric__State(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Compound__State' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.Generic__State} to remove
	 * @see			#has__Compound__StateProperty
	 */
	public void removeHas__Compound__State(org.cdao.jastor.Generic__State has__Compound__State) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'belongs__to__Compound__Character' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.CompoundCharacter}
	 * @see			#belongs__to__Compound__CharacterProperty
	 */
	public java.util.Iterator getBelongs__to__Compound__Character() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'belongs__to__Compound__Character' property
	 * @param		The {@link org.cdao.jastor.CompoundCharacter} to add
	 * @see			#belongs__to__Compound__CharacterProperty
	 */
	public void addBelongs__to__Compound__Character(org.cdao.jastor.CompoundCharacter belongs__to__Compound__Character) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'belongs__to__Compound__Character' property
	 * @return		The anoymous {@link org.cdao.jastor.CompoundCharacter} created
	 * @see			#belongs__to__Compound__CharacterProperty
	 */
	public org.cdao.jastor.CompoundCharacter addBelongs__to__Compound__Character() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#CompoundCharacter.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#belongs__to__Compound__CharacterProperty
	 */
	public org.cdao.jastor.CompoundCharacter addBelongs__to__Compound__Character(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'belongs__to__Compound__Character' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.CompoundCharacter} to remove
	 * @see			#belongs__to__Compound__CharacterProperty
	 */
	public void removeBelongs__to__Compound__Character(org.cdao.jastor.CompoundCharacter belongs__to__Compound__Character) throws com.ibm.adtech.jastor.JastorException;
		
}