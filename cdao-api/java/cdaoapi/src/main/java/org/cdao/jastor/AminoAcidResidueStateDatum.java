

package org.cdao.jastor;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for AminoAcidResidueStateDatum ontology class<br>
 * Use the org.cdao.jasper.CDAOFactory to create instances of this interface.
 * <p>(URI: http://localhost/~vivek/cdao.owl#AminoAcidResidueStateDatum)</p>
 * <br>
 * <br>
 * <br>
 */
public interface AminoAcidResidueStateDatum extends org.cdao.jastor.MolecularStateDatum, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://localhost/~vivek/cdao.owl#AminoAcidResidueStateDatum");
	

	/**
	 * The Jena Property for belongs__to__Amino__Acid__Character 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#belongs_to_Amino_Acid_Character)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__to__Amino__Acid__CharacterProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to_Amino_Acid_Character");


	/**
	 * The Jena Property for has__Amino__Acid__State 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Amino_Acid_State)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property associates a amino acid character-state instance with a state value from the domain of amino acid states.^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Amino__Acid__StateProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Amino_Acid_State");


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
	 * Gets the 'belongs__to__Amino__Acid__Character' property value
	 * @return		{@link org.cdao.jastor.AminoAcidResidueCharacter}
	 * @see			#belongs__to__Amino__Acid__CharacterProperty
	 */
	public org.cdao.jastor.AminoAcidResidueCharacter getBelongs__to__Amino__Acid__Character() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__Amino__Acid__Character' property value
	 * @param		{@link org.cdao.jastor.AminoAcidResidueCharacter}
	 * @see			#belongs__to__Amino__Acid__CharacterProperty
	 */
	public void setBelongs__to__Amino__Acid__Character(org.cdao.jastor.AminoAcidResidueCharacter belongs__to__Amino__Acid__Character) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__Amino__Acid__Character' property value to an anonymous node
	 * @return		{@link org.cdao.jastor.AminoAcidResidueCharacter}, the created value
	 * @see			#belongs__to__Amino__Acid__CharacterProperty
	 */	
	public org.cdao.jastor.AminoAcidResidueCharacter setBelongs__to__Amino__Acid__Character() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__Amino__Acid__Character' property value to the given resource
	 * The resource argument should have rdf:type http://localhost/~vivek/cdao.owl#AminoAcidResidueCharacter.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Resource} must not be be null.
	 * @return		{@link org.cdao.jastor.AminoAcidResidueCharacter}, the newly created value
	 * @see			#belongs__to__Amino__Acid__CharacterProperty
	 */
	public org.cdao.jastor.AminoAcidResidueCharacter setBelongs__to__Amino__Acid__Character(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Get an Iterator the 'has__Amino__Acid__State' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.AminoAcidResidue}
	 * @see			#has__Amino__Acid__StateProperty
	 */
	public java.util.Iterator getHas__Amino__Acid__State_asAminoAcidResidue() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Amino__Acid__State' property
	 * @param		The {@link org.cdao.jastor.AminoAcidResidue} to add
	 * @see			#has__Amino__Acid__StateProperty
	 */
	public void addHas__Amino__Acid__State(org.cdao.jastor.AminoAcidResidue has__Amino__Acid__State) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Amino__Acid__State' property
	 * @return		The anoymous {@link org.cdao.jastor.AminoAcidResidue} created
	 * @see			#has__Amino__Acid__StateProperty
	 */
	public org.cdao.jastor.AminoAcidResidue addHas__Amino__Acid__State_asAminoAcidResidue() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#AminoAcidResidue.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Amino__Acid__StateProperty
	 */
	public org.cdao.jastor.AminoAcidResidue addHas__Amino__Acid__State_asAminoAcidResidue(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Amino__Acid__State' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.AminoAcidResidue} to remove
	 * @see			#has__Amino__Acid__StateProperty
	 */
	public void removeHas__Amino__Acid__State(org.cdao.jastor.AminoAcidResidue has__Amino__Acid__State) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Amino__Acid__State' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.Generic__State}
	 * @see			#has__Amino__Acid__StateProperty
	 */
	public java.util.Iterator getHas__Amino__Acid__State_asGeneric__State() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Amino__Acid__State' property
	 * @param		The {@link org.cdao.jastor.Generic__State} to add
	 * @see			#has__Amino__Acid__StateProperty
	 */
	public void addHas__Amino__Acid__State(org.cdao.jastor.Generic__State has__Amino__Acid__State) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Amino__Acid__State' property
	 * @return		The anoymous {@link org.cdao.jastor.Generic__State} created
	 * @see			#has__Amino__Acid__StateProperty
	 */
	public org.cdao.jastor.Generic__State addHas__Amino__Acid__State_asGeneric__State() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#Generic_State.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Amino__Acid__StateProperty
	 */
	public org.cdao.jastor.Generic__State addHas__Amino__Acid__State_asGeneric__State(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Amino__Acid__State' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.Generic__State} to remove
	 * @see			#has__Amino__Acid__StateProperty
	 */
	public void removeHas__Amino__Acid__State(org.cdao.jastor.Generic__State has__Amino__Acid__State) throws com.ibm.adtech.jastor.JastorException;
		
}