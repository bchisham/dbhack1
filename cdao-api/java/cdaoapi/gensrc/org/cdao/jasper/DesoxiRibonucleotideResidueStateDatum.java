

package org.cdao.jasper;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for DesoxiRibonucleotideResidueStateDatum ontology class<br>
 * Use the org.cdao.CDAOFactory to create instances of this interface.
 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DesoxiRibonucleotideResidueStateDatum)</p>
 * <br>
 * <br>
 * <br>
 */
public interface DesoxiRibonucleotideResidueStateDatum extends org.cdao.jasper.MolecularStateDatum, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DesoxiRibonucleotideResidueStateDatum");
	

	/**
	 * The Jena Property for has__Nucleotide__State 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Nucleotide_State)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property associates a nucleotide character-state instance with a state value from the domain of nucleotide states.^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Nucleotide__StateProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Nucleotide_State");


	/**
	 * The Jena Property for belongs__to__Nucleotide__Character 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to_Nucleotide_Character)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__to__Nucleotide__CharacterProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to_Nucleotide_Character");


	/**
	 * The Jena Property for belongs__to 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : Generic property that links a concept to another concept it is a constituent of. The property is a synonym of part_of. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__toProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to");


	/**
	 * The Jena Property for has__Annotation 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Annotation)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__AnnotationProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Annotation");


	/**
	 * The Jena Property for has__External__Reference 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_External_Reference)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__External__ReferenceProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_External_Reference");


	/**
	 * The Jena Property for has__Precision 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Precision)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__PrecisionProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Precision");


	/**
	 * The Jena Property for has__Uncertainty__Factor 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Uncertainty_Factor)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Uncertainty__FactorProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Uncertainty_Factor");


	/**
	 * The Jena Property for has__Float__Value 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Float_Value)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Float__ValueProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Float_Value");


	/**
	 * The Jena Property for has__Int__Value 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Int_Value)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Int__ValueProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Int_Value");


	/**
	 * The Jena Property for has__Value 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Value)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__ValueProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Value");


	/**
	 * The Jena Property for has__Support__Value 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Support_Value)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Support__ValueProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Support_Value");


	/**
	 * The Jena Property for has 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : Generic 'has' property. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has");


	/**
	 * The Jena Property for connects__to 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#connects_to)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property connects__toProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#connects_to");


	/**
	 * The Jena Property for exclude__Subtree 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude_Subtree)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property exclude__SubtreeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude_Subtree");


	/**
	 * The Jena Property for part__of 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#part_of)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property part__ofProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#part_of");


	/**
	 * The Jena Property for has__Type 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Type)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__TypeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Type");


	/**
	 * The Jena Property for exclude__Node 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude_Node)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property exclude__NodeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude_Node");


	/**
	 * The Jena Property for precedes 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#precedes)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property precedesProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#precedes");


	/**
	 * The Jena Property for exclude 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property excludeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude");




	/**
	 * Get an Iterator the 'has__Nucleotide__State' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.DesoxiRibonucleotideResidue}
	 * @see			#has__Nucleotide__StateProperty
	 */
	public java.util.Iterator getHas__Nucleotide__State_asDesoxiRibonucleotideResidue() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Nucleotide__State' property
	 * @param		The {@link org.cdao.jasper.DesoxiRibonucleotideResidue} to add
	 * @see			#has__Nucleotide__StateProperty
	 */
	public void addHas__Nucleotide__State(org.cdao.jasper.DesoxiRibonucleotideResidue has__Nucleotide__State) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Nucleotide__State' property
	 * @return		The anoymous {@link org.cdao.jasper.DesoxiRibonucleotideResidue} created
	 * @see			#has__Nucleotide__StateProperty
	 */
	public org.cdao.jasper.DesoxiRibonucleotideResidue addHas__Nucleotide__State_asDesoxiRibonucleotideResidue() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DesoxiRibonucleotideResidue.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Nucleotide__StateProperty
	 */
	public org.cdao.jasper.DesoxiRibonucleotideResidue addHas__Nucleotide__State_asDesoxiRibonucleotideResidue(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Nucleotide__State' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.DesoxiRibonucleotideResidue} to remove
	 * @see			#has__Nucleotide__StateProperty
	 */
	public void removeHas__Nucleotide__State(org.cdao.jasper.DesoxiRibonucleotideResidue has__Nucleotide__State) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Nucleotide__State' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.Generic__State}
	 * @see			#has__Nucleotide__StateProperty
	 */
	public java.util.Iterator getHas__Nucleotide__State_asGeneric__State() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Nucleotide__State' property
	 * @param		The {@link org.cdao.jasper.Generic__State} to add
	 * @see			#has__Nucleotide__StateProperty
	 */
	public void addHas__Nucleotide__State(org.cdao.jasper.Generic__State has__Nucleotide__State) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Nucleotide__State' property
	 * @return		The anoymous {@link org.cdao.jasper.Generic__State} created
	 * @see			#has__Nucleotide__StateProperty
	 */
	public org.cdao.jasper.Generic__State addHas__Nucleotide__State_asGeneric__State() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Generic_State.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Nucleotide__StateProperty
	 */
	public org.cdao.jasper.Generic__State addHas__Nucleotide__State_asGeneric__State(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Nucleotide__State' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.Generic__State} to remove
	 * @see			#has__Nucleotide__StateProperty
	 */
	public void removeHas__Nucleotide__State(org.cdao.jasper.Generic__State has__Nucleotide__State) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Gets the 'belongs__to__Nucleotide__Character' property value
	 * @return		{@link org.cdao.jasper.DesoxiRibonucleotideResidueCharacter}
	 * @see			#belongs__to__Nucleotide__CharacterProperty
	 */
	public org.cdao.jasper.DesoxiRibonucleotideResidueCharacter getBelongs__to__Nucleotide__Character() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__Nucleotide__Character' property value
	 * @param		{@link org.cdao.jasper.DesoxiRibonucleotideResidueCharacter}
	 * @see			#belongs__to__Nucleotide__CharacterProperty
	 */
	public void setBelongs__to__Nucleotide__Character(org.cdao.jasper.DesoxiRibonucleotideResidueCharacter belongs__to__Nucleotide__Character) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__Nucleotide__Character' property value to an anonymous node
	 * @return		{@link org.cdao.jasper.DesoxiRibonucleotideResidueCharacter}, the created value
	 * @see			#belongs__to__Nucleotide__CharacterProperty
	 */	
	public org.cdao.jasper.DesoxiRibonucleotideResidueCharacter setBelongs__to__Nucleotide__Character() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__Nucleotide__Character' property value to the given resource
	 * The resource argument should have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DesoxiRibonucleotideResidueCharacter.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Resource} must not be be null.
	 * @return		{@link org.cdao.jasper.DesoxiRibonucleotideResidueCharacter}, the newly created value
	 * @see			#belongs__to__Nucleotide__CharacterProperty
	 */
	public org.cdao.jasper.DesoxiRibonucleotideResidueCharacter setBelongs__to__Nucleotide__Character(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
}