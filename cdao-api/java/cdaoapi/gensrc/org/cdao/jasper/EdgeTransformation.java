

package org.cdao.jasper;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for EdgeTransformation ontology class<br>
 * Use the org.cdao.CDAOFactory to create instances of this interface.
 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#EdgeTransformation)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	comment : If left state is same as left node, then transformation will imply correct direction. <br>
 * <br>
 * Dublin Core Standard Properties <br>
 * 	description : A transformation (in states of a character) associated with an edge (branch) of a Tree or Network. <br>
 * <br>
 */
public interface EdgeTransformation extends org.cdao.jasper.EdgeAnnotation, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#EdgeTransformation");
	

	/**
	 * The Jena Property for has__Left__Node 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Left_Node)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates a transformation to a 'left' node (the node that has the 'left' state).^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Left__NodeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Left_Node");


	/**
	 * The Jena Property for has__Right__Node 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Right_Node)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates a transformation to a 'right' node (the node that has the 'right' state).^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Right__NodeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Right_Node");


	/**
	 * The Jena Property for transformation__of 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#transformation_of)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates a type of evolutionary change (an Edge_Transformation) to the character that undergoes the change.  The change is a transformation_of the affected character.^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property transformation__ofProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#transformation_of");


	/**
	 * The Jena Property for has__Right__State 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Right_State)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates a transformation to a 'right' state (the state associated with the 'right' node).^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Right__StateProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Right_State");


	/**
	 * The Jena Property for has__Left__State 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Left_State)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates a transformation to a 'left' state (the state associated with the 'left' node).^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Left__StateProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Left_State");


	/**
	 * The Jena Property for has__Transformation__Component 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Transformation_Component)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates a transformation to the components that compose it.^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Transformation__ComponentProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Transformation_Component");


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
	 * Get an Iterator the 'has__Left__Node' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.Node}
	 * @see			#has__Left__NodeProperty
	 */
	public java.util.Iterator getHas__Left__Node() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Left__Node' property
	 * @param		The {@link org.cdao.jasper.Node} to add
	 * @see			#has__Left__NodeProperty
	 */
	public void addHas__Left__Node(org.cdao.jasper.Node has__Left__Node) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Left__Node' property
	 * @return		The anoymous {@link org.cdao.jasper.Node} created
	 * @see			#has__Left__NodeProperty
	 */
	public org.cdao.jasper.Node addHas__Left__Node() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Node.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Left__NodeProperty
	 */
	public org.cdao.jasper.Node addHas__Left__Node(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Left__Node' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.Node} to remove
	 * @see			#has__Left__NodeProperty
	 */
	public void removeHas__Left__Node(org.cdao.jasper.Node has__Left__Node) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Right__Node' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.Node}
	 * @see			#has__Right__NodeProperty
	 */
	public java.util.Iterator getHas__Right__Node() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Right__Node' property
	 * @param		The {@link org.cdao.jasper.Node} to add
	 * @see			#has__Right__NodeProperty
	 */
	public void addHas__Right__Node(org.cdao.jasper.Node has__Right__Node) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Right__Node' property
	 * @return		The anoymous {@link org.cdao.jasper.Node} created
	 * @see			#has__Right__NodeProperty
	 */
	public org.cdao.jasper.Node addHas__Right__Node() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Node.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Right__NodeProperty
	 */
	public org.cdao.jasper.Node addHas__Right__Node(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Right__Node' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.Node} to remove
	 * @see			#has__Right__NodeProperty
	 */
	public void removeHas__Right__Node(org.cdao.jasper.Node has__Right__Node) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Gets the 'transformation__of' property value
	 * @return		{@link org.cdao.jasper.Character}
	 * @see			#transformation__ofProperty
	 */
	public org.cdao.jasper.Character getTransformation__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'transformation__of' property value
	 * @param		{@link org.cdao.jasper.Character}
	 * @see			#transformation__ofProperty
	 */
	public void setTransformation__of(org.cdao.jasper.Character transformation__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'transformation__of' property value to an anonymous node
	 * @return		{@link org.cdao.jasper.Character}, the created value
	 * @see			#transformation__ofProperty
	 */	
	public org.cdao.jasper.Character setTransformation__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'transformation__of' property value to the given resource
	 * The resource argument should have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Character.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Resource} must not be be null.
	 * @return		{@link org.cdao.jasper.Character}, the newly created value
	 * @see			#transformation__ofProperty
	 */
	public org.cdao.jasper.Character setTransformation__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Gets the 'has__Right__State' property value
	 * @return		{@link org.cdao.jasper.CharacterStateDomain}
	 * @see			#has__Right__StateProperty
	 */
	public org.cdao.jasper.CharacterStateDomain getHas__Right__State() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'has__Right__State' property value
	 * @param		{@link org.cdao.jasper.CharacterStateDomain}
	 * @see			#has__Right__StateProperty
	 */
	public void setHas__Right__State(org.cdao.jasper.CharacterStateDomain has__Right__State) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'has__Right__State' property value to an anonymous node
	 * @return		{@link org.cdao.jasper.CharacterStateDomain}, the created value
	 * @see			#has__Right__StateProperty
	 */	
	public org.cdao.jasper.CharacterStateDomain setHas__Right__State() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'has__Right__State' property value to the given resource
	 * The resource argument should have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDomain.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Resource} must not be be null.
	 * @return		{@link org.cdao.jasper.CharacterStateDomain}, the newly created value
	 * @see			#has__Right__StateProperty
	 */
	public org.cdao.jasper.CharacterStateDomain setHas__Right__State(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Gets the 'has__Left__State' property value
	 * @return		{@link org.cdao.jasper.CharacterStateDomain}
	 * @see			#has__Left__StateProperty
	 */
	public org.cdao.jasper.CharacterStateDomain getHas__Left__State() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'has__Left__State' property value
	 * @param		{@link org.cdao.jasper.CharacterStateDomain}
	 * @see			#has__Left__StateProperty
	 */
	public void setHas__Left__State(org.cdao.jasper.CharacterStateDomain has__Left__State) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'has__Left__State' property value to an anonymous node
	 * @return		{@link org.cdao.jasper.CharacterStateDomain}, the created value
	 * @see			#has__Left__StateProperty
	 */	
	public org.cdao.jasper.CharacterStateDomain setHas__Left__State() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'has__Left__State' property value to the given resource
	 * The resource argument should have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDomain.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Resource} must not be be null.
	 * @return		{@link org.cdao.jasper.CharacterStateDomain}, the newly created value
	 * @see			#has__Left__StateProperty
	 */
	public org.cdao.jasper.CharacterStateDomain setHas__Left__State(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Get an Iterator the 'has__Transformation__Component' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#has__Transformation__ComponentProperty
	 */
	public java.util.Iterator getHas__Transformation__Component() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Transformation__Component' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#has__Transformation__ComponentProperty
	 */
	public void addHas__Transformation__Component(com.ibm.adtech.jastor.Thing has__Transformation__Component) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Transformation__Component' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#has__Transformation__ComponentProperty
	 */
	public com.ibm.adtech.jastor.Thing addHas__Transformation__Component() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Transformation__ComponentProperty
	 */
	public com.ibm.adtech.jastor.Thing addHas__Transformation__Component(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Transformation__Component' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#has__Transformation__ComponentProperty
	 */
	public void removeHas__Transformation__Component(com.ibm.adtech.jastor.Thing has__Transformation__Component) throws com.ibm.adtech.jastor.JastorException;
		
}