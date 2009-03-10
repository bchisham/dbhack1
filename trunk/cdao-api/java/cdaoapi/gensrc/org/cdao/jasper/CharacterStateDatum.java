

package org.cdao.jasper;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for CharacterStateDatum ontology class<br>
 * Use the org.cdao.CDAOFactory to create instances of this interface.
 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDatum)</p>
 * <br>
 * <br>
 * Dublin Core Standard Properties <br>
 * 	description : The instance of a given character for a given TU.  Its state is an object property drawn from a particular character state domain, e.g., the state of an Amino_Acid_State_Datum is an object property drawn from the domain Amino_Acid. <br>
 * <br>
 */
public interface CharacterStateDatum extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDatum");
	

	/**
	 * The Jena Property for belongs__to__Character 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to_Character)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__to__CharacterProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to_Character");


	/**
	 * The Jena Property for homologous__to 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#homologous_to)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This propery relates different instances of the same character, including the case when the states of the character differ (e.g., large_beak of beak_size_character of TU A is homologous_to small_beak of beak_size_character of TU B).^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property homologous__toProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#homologous_to");


	/**
	 * The Jena Property for has__State 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_State)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property associates a character-state instance with its state value, e.g., a state value expressed in terms of an imported domain ontology.^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__StateProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_State");


	/**
	 * The Jena Property for has__Coordinate 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Coordinate)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__CoordinateProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Coordinate");


	/**
	 * The Jena Property for belongs__to__TU 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to_TU)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates a character-state datum to its TU.^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__to__TUProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to_TU");


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
	 * Gets the 'belongs__to__Character' property value
	 * @return		{@link org.cdao.jasper.Character}
	 * @see			#belongs__to__CharacterProperty
	 */
	public org.cdao.jasper.Character getBelongs__to__Character() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__Character' property value
	 * @param		{@link org.cdao.jasper.Character}
	 * @see			#belongs__to__CharacterProperty
	 */
	public void setBelongs__to__Character(org.cdao.jasper.Character belongs__to__Character) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__Character' property value to an anonymous node
	 * @return		{@link org.cdao.jasper.Character}, the created value
	 * @see			#belongs__to__CharacterProperty
	 */	
	public org.cdao.jasper.Character setBelongs__to__Character() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__Character' property value to the given resource
	 * The resource argument should have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Character.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Resource} must not be be null.
	 * @return		{@link org.cdao.jasper.Character}, the newly created value
	 * @see			#belongs__to__CharacterProperty
	 */
	public org.cdao.jasper.Character setBelongs__to__Character(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Get an Iterator the 'homologous__to' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.CharacterStateDatum}
	 * @see			#homologous__toProperty
	 */
	public java.util.Iterator getHomologous__to() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'homologous__to' property
	 * @param		The {@link org.cdao.jasper.CharacterStateDatum} to add
	 * @see			#homologous__toProperty
	 */
	public void addHomologous__to(org.cdao.jasper.CharacterStateDatum homologous__to) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'homologous__to' property
	 * @return		The anoymous {@link org.cdao.jasper.CharacterStateDatum} created
	 * @see			#homologous__toProperty
	 */
	public org.cdao.jasper.CharacterStateDatum addHomologous__to() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDatum.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#homologous__toProperty
	 */
	public org.cdao.jasper.CharacterStateDatum addHomologous__to(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'homologous__to' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.CharacterStateDatum} to remove
	 * @see			#homologous__toProperty
	 */
	public void removeHomologous__to(org.cdao.jasper.CharacterStateDatum homologous__to) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__State' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.CharacterStateDomain}
	 * @see			#has__StateProperty
	 */
	public java.util.Iterator getHas__State() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__State' property
	 * @param		The {@link org.cdao.jasper.CharacterStateDomain} to add
	 * @see			#has__StateProperty
	 */
	public void addHas__State(org.cdao.jasper.CharacterStateDomain has__State) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__State' property
	 * @return		The anoymous {@link org.cdao.jasper.CharacterStateDomain} created
	 * @see			#has__StateProperty
	 */
	public org.cdao.jasper.CharacterStateDomain addHas__State() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDomain.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__StateProperty
	 */
	public org.cdao.jasper.CharacterStateDomain addHas__State(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__State' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.CharacterStateDomain} to remove
	 * @see			#has__StateProperty
	 */
	public void removeHas__State(org.cdao.jasper.CharacterStateDomain has__State) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Coordinate' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.DatumCoordinate}
	 * @see			#has__CoordinateProperty
	 */
	public java.util.Iterator getHas__Coordinate() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Coordinate' property
	 * @param		The {@link org.cdao.jasper.DatumCoordinate} to add
	 * @see			#has__CoordinateProperty
	 */
	public void addHas__Coordinate(org.cdao.jasper.DatumCoordinate has__Coordinate) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Coordinate' property
	 * @return		The anoymous {@link org.cdao.jasper.DatumCoordinate} created
	 * @see			#has__CoordinateProperty
	 */
	public org.cdao.jasper.DatumCoordinate addHas__Coordinate() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DatumCoordinate.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__CoordinateProperty
	 */
	public org.cdao.jasper.DatumCoordinate addHas__Coordinate(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Coordinate' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.DatumCoordinate} to remove
	 * @see			#has__CoordinateProperty
	 */
	public void removeHas__Coordinate(org.cdao.jasper.DatumCoordinate has__Coordinate) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Gets the 'belongs__to__TU' property value
	 * @return		{@link org.cdao.jasper.TU}
	 * @see			#belongs__to__TUProperty
	 */
	public org.cdao.jasper.TU getBelongs__to__TU() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__TU' property value
	 * @param		{@link org.cdao.jasper.TU}
	 * @see			#belongs__to__TUProperty
	 */
	public void setBelongs__to__TU(org.cdao.jasper.TU belongs__to__TU) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__TU' property value to an anonymous node
	 * @return		{@link org.cdao.jasper.TU}, the created value
	 * @see			#belongs__to__TUProperty
	 */	
	public org.cdao.jasper.TU setBelongs__to__TU() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__TU' property value to the given resource
	 * The resource argument should have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TU.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Resource} must not be be null.
	 * @return		{@link org.cdao.jasper.TU}, the newly created value
	 * @see			#belongs__to__TUProperty
	 */
	public org.cdao.jasper.TU setBelongs__to__TU(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Get an Iterator the 'belongs__to' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#belongs__toProperty
	 */
	public java.util.Iterator getBelongs__to() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'belongs__to' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#belongs__toProperty
	 */
	public void addBelongs__to(com.ibm.adtech.jastor.Thing belongs__to) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'belongs__to' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#belongs__toProperty
	 */
	public com.ibm.adtech.jastor.Thing addBelongs__to() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#belongs__toProperty
	 */
	public com.ibm.adtech.jastor.Thing addBelongs__to(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'belongs__to' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#belongs__toProperty
	 */
	public void removeBelongs__to(com.ibm.adtech.jastor.Thing belongs__to) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Annotation' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.CDAOAnnotation}
	 * @see			#has__AnnotationProperty
	 */
	public java.util.Iterator getHas__Annotation() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Annotation' property
	 * @param		The {@link org.cdao.jasper.CDAOAnnotation} to add
	 * @see			#has__AnnotationProperty
	 */
	public void addHas__Annotation(org.cdao.jasper.CDAOAnnotation has__Annotation) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Annotation' property
	 * @return		The anoymous {@link org.cdao.jasper.CDAOAnnotation} created
	 * @see			#has__AnnotationProperty
	 */
	public org.cdao.jasper.CDAOAnnotation addHas__Annotation() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CDAOAnnotation.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__AnnotationProperty
	 */
	public org.cdao.jasper.CDAOAnnotation addHas__Annotation(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Annotation' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.CDAOAnnotation} to remove
	 * @see			#has__AnnotationProperty
	 */
	public void removeHas__Annotation(org.cdao.jasper.CDAOAnnotation has__Annotation) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'has__External__Reference' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#has__External__ReferenceProperty
	 */
	public java.util.Iterator getHas__External__Reference() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'has__External__Reference' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#has__External__ReferenceProperty
	 */
	public void addHas__External__Reference(com.hp.hpl.jena.rdf.model.Literal has__External__Reference) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'has__External__Reference' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#has__External__ReferenceProperty
	 */
	public void removeHas__External__Reference(com.hp.hpl.jena.rdf.model.Literal has__External__Reference) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'has__Precision' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Float}
	 * @see			#has__PrecisionProperty
	 */
	public java.util.Iterator getHas__Precision() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'has__Precision' property value
	 * @param		{@link java.lang.Float}, the value to add
	 * @see			#has__PrecisionProperty
	 */
	public void addHas__Precision(java.lang.Float has__Precision) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'has__Precision' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Float}, the value to remove
	 * @see			#has__PrecisionProperty
	 */
	public void removeHas__Precision(java.lang.Float has__Precision) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'has__Uncertainty__Factor' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Float}
	 * @see			#has__Uncertainty__FactorProperty
	 */
	public java.util.Iterator getHas__Uncertainty__Factor() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'has__Uncertainty__Factor' property value
	 * @param		{@link java.lang.Float}, the value to add
	 * @see			#has__Uncertainty__FactorProperty
	 */
	public void addHas__Uncertainty__Factor(java.lang.Float has__Uncertainty__Factor) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'has__Uncertainty__Factor' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Float}, the value to remove
	 * @see			#has__Uncertainty__FactorProperty
	 */
	public void removeHas__Uncertainty__Factor(java.lang.Float has__Uncertainty__Factor) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'has__Float__Value' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Float}
	 * @see			#has__Float__ValueProperty
	 */
	public java.util.Iterator getHas__Float__Value() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'has__Float__Value' property value
	 * @param		{@link java.lang.Float}, the value to add
	 * @see			#has__Float__ValueProperty
	 */
	public void addHas__Float__Value(java.lang.Float has__Float__Value) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'has__Float__Value' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Float}, the value to remove
	 * @see			#has__Float__ValueProperty
	 */
	public void removeHas__Float__Value(java.lang.Float has__Float__Value) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'has__Int__Value' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Integer}
	 * @see			#has__Int__ValueProperty
	 */
	public java.util.Iterator getHas__Int__Value() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'has__Int__Value' property value
	 * @param		{@link java.lang.Integer}, the value to add
	 * @see			#has__Int__ValueProperty
	 */
	public void addHas__Int__Value(java.lang.Integer has__Int__Value) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'has__Int__Value' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Integer}, the value to remove
	 * @see			#has__Int__ValueProperty
	 */
	public void removeHas__Int__Value(java.lang.Integer has__Int__Value) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'has__Value' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#has__ValueProperty
	 */
	public java.util.Iterator getHas__Value() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'has__Value' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#has__ValueProperty
	 */
	public void addHas__Value(java.lang.String has__Value) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'has__Value' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#has__ValueProperty
	 */
	public void removeHas__Value(java.lang.String has__Value) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'has__Support__Value' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Float}
	 * @see			#has__Support__ValueProperty
	 */
	public java.util.Iterator getHas__Support__Value() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'has__Support__Value' property value
	 * @param		{@link java.lang.Float}, the value to add
	 * @see			#has__Support__ValueProperty
	 */
	public void addHas__Support__Value(java.lang.Float has__Support__Value) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'has__Support__Value' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Float}, the value to remove
	 * @see			#has__Support__ValueProperty
	 */
	public void removeHas__Support__Value(java.lang.Float has__Support__Value) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'has' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#hasProperty
	 */
	public java.util.Iterator getHas() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#hasProperty
	 */
	public void addHas(com.ibm.adtech.jastor.Thing has) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#hasProperty
	 */
	public com.ibm.adtech.jastor.Thing addHas() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasProperty
	 */
	public com.ibm.adtech.jastor.Thing addHas(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#hasProperty
	 */
	public void removeHas(com.ibm.adtech.jastor.Thing has) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'connects__to' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#connects__toProperty
	 */
	public java.util.Iterator getConnects__to() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'connects__to' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#connects__toProperty
	 */
	public void addConnects__to(com.ibm.adtech.jastor.Thing connects__to) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'connects__to' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#connects__toProperty
	 */
	public com.ibm.adtech.jastor.Thing addConnects__to() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#connects__toProperty
	 */
	public com.ibm.adtech.jastor.Thing addConnects__to(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'connects__to' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#connects__toProperty
	 */
	public void removeConnects__to(com.ibm.adtech.jastor.Thing connects__to) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'exclude__Subtree' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.Subtree}
	 * @see			#exclude__SubtreeProperty
	 */
	public java.util.Iterator getExclude__Subtree() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'exclude__Subtree' property
	 * @param		The {@link org.cdao.jasper.Subtree} to add
	 * @see			#exclude__SubtreeProperty
	 */
	public void addExclude__Subtree(org.cdao.jasper.Subtree exclude__Subtree) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'exclude__Subtree' property
	 * @return		The anoymous {@link org.cdao.jasper.Subtree} created
	 * @see			#exclude__SubtreeProperty
	 */
	public org.cdao.jasper.Subtree addExclude__Subtree() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Subtree.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#exclude__SubtreeProperty
	 */
	public org.cdao.jasper.Subtree addExclude__Subtree(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'exclude__Subtree' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.Subtree} to remove
	 * @see			#exclude__SubtreeProperty
	 */
	public void removeExclude__Subtree(org.cdao.jasper.Subtree exclude__Subtree) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'part__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#part__ofProperty
	 */
	public java.util.Iterator getPart__of() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'part__of' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#part__ofProperty
	 */
	public void addPart__of(com.ibm.adtech.jastor.Thing part__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'part__of' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#part__ofProperty
	 */
	public com.ibm.adtech.jastor.Thing addPart__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#part__ofProperty
	 */
	public com.ibm.adtech.jastor.Thing addPart__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'part__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#part__ofProperty
	 */
	public void removePart__of(com.ibm.adtech.jastor.Thing part__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Type' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#has__TypeProperty
	 */
	public java.util.Iterator getHas__Type() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Type' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#has__TypeProperty
	 */
	public void addHas__Type(com.ibm.adtech.jastor.Thing has__Type) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Type' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#has__TypeProperty
	 */
	public com.ibm.adtech.jastor.Thing addHas__Type() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__TypeProperty
	 */
	public com.ibm.adtech.jastor.Thing addHas__Type(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Type' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#has__TypeProperty
	 */
	public void removeHas__Type(com.ibm.adtech.jastor.Thing has__Type) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'exclude__Node' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.Node}
	 * @see			#exclude__NodeProperty
	 */
	public java.util.Iterator getExclude__Node() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'exclude__Node' property
	 * @param		The {@link org.cdao.jasper.Node} to add
	 * @see			#exclude__NodeProperty
	 */
	public void addExclude__Node(org.cdao.jasper.Node exclude__Node) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'exclude__Node' property
	 * @return		The anoymous {@link org.cdao.jasper.Node} created
	 * @see			#exclude__NodeProperty
	 */
	public org.cdao.jasper.Node addExclude__Node() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Node.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#exclude__NodeProperty
	 */
	public org.cdao.jasper.Node addExclude__Node(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'exclude__Node' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.Node} to remove
	 * @see			#exclude__NodeProperty
	 */
	public void removeExclude__Node(org.cdao.jasper.Node exclude__Node) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'precedes' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#precedesProperty
	 */
	public java.util.Iterator getPrecedes() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'precedes' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#precedesProperty
	 */
	public void addPrecedes(com.ibm.adtech.jastor.Thing precedes) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'precedes' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#precedesProperty
	 */
	public com.ibm.adtech.jastor.Thing addPrecedes() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#precedesProperty
	 */
	public com.ibm.adtech.jastor.Thing addPrecedes(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'precedes' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#precedesProperty
	 */
	public void removePrecedes(com.ibm.adtech.jastor.Thing precedes) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'exclude' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#excludeProperty
	 */
	public java.util.Iterator getExclude() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'exclude' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#excludeProperty
	 */
	public void addExclude(com.ibm.adtech.jastor.Thing exclude) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'exclude' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#excludeProperty
	 */
	public com.ibm.adtech.jastor.Thing addExclude() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#excludeProperty
	 */
	public com.ibm.adtech.jastor.Thing addExclude(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'exclude' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#excludeProperty
	 */
	public void removeExclude(com.ibm.adtech.jastor.Thing exclude) throws com.ibm.adtech.jastor.JastorException;
		
}