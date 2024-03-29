

package org.cdao.jastor;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Node ontology class<br>
 * Use the org.cdao.jasper.CDAOFactory to create instances of this interface.
 * <p>(URI: http://localhost/~vivek/cdao.owl#Node)</p>
 * <br>
 * <br>
 * Dublin Core Standard Properties <br>
 * 	description : Class describing a node in a tree <br>
 * <br>
 */
public interface Node extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://localhost/~vivek/cdao.owl#Node");
	

	/**
	 * The Jena Property for part__of 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#part_of)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property part__ofProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#part_of");


	/**
	 * The Jena Property for has__Ancestor 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Ancestor)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : The property links a node to any of the other nodes that are its ancestors in a rooted tree. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__AncestorProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Ancestor");


	/**
	 * The Jena Property for belongs__to__Edge__as__Parent 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#belongs_to_Edge_as_Parent)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : The property links a Node to one of the Edges where the node appears in the parent position (i.e., closer to the root). <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__to__Edge__as__ParentProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to_Edge_as_Parent");


	/**
	 * The Jena Property for belongs__to__Tree__as__Root 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#belongs_to_Tree_as_Root)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__to__Tree__as__RootProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to_Tree_as_Root");


	/**
	 * The Jena Property for nca__node__of 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#nca_node_of)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property nca__node__ofProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#nca_node_of");


	/**
	 * The Jena Property for belongs__to__Edge 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#belongs_to_Edge)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : The property links a Node to one of the edges that are incident on such node. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__to__EdgeProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to_Edge");


	/**
	 * The Jena Property for represents__TU 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#represents_TU)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates a TU or taxonomic unit (typically associated with character data) to a phylogenetic history (Tree).^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property represents__TUProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#represents_TU");


	/**
	 * The Jena Property for has__Parent 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Parent)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : The property that links a node to its unique parent in a rooted tree. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__ParentProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Parent");


	/**
	 * The Jena Property for belongs__to__Edge__as__Child 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#belongs_to_Edge_as_Child)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : The property links a Node to the Edge it belongs to in the child position. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__to__Edge__as__ChildProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to_Edge_as_Child");


	/**
	 * The Jena Property for has__Child 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Child)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : The property links a node to a node that is an immediate descendant in the tree. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__ChildProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Child");


	/**
	 * The Jena Property for has__Descendant 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Descendant)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : A property that links a node to any of its descendants in a rooted tree. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__DescendantProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Descendant");


	/**
	 * The Jena Property for belongs__to__Tree 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#belongs_to_Tree)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__to__TreeProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to_Tree");


	/**
	 * The Jena Property for belongs__to__Network 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#belongs_to_Network)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__to__NetworkProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#belongs_to_Network");


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
	 * The Jena Property for precedes 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#precedes)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property precedesProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#precedes");




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
	 * Get an Iterator the 'has__Ancestor' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.Node}
	 * @see			#has__AncestorProperty
	 */
	public java.util.Iterator getHas__Ancestor() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Ancestor' property
	 * @param		The {@link org.cdao.jastor.Node} to add
	 * @see			#has__AncestorProperty
	 */
	public void addHas__Ancestor(org.cdao.jastor.Node has__Ancestor) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Ancestor' property
	 * @return		The anoymous {@link org.cdao.jastor.Node} created
	 * @see			#has__AncestorProperty
	 */
	public org.cdao.jastor.Node addHas__Ancestor() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#Node.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__AncestorProperty
	 */
	public org.cdao.jastor.Node addHas__Ancestor(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Ancestor' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.Node} to remove
	 * @see			#has__AncestorProperty
	 */
	public void removeHas__Ancestor(org.cdao.jastor.Node has__Ancestor) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'belongs__to__Edge__as__Parent' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.DirectedEdge}
	 * @see			#belongs__to__Edge__as__ParentProperty
	 */
	public java.util.Iterator getBelongs__to__Edge__as__Parent() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'belongs__to__Edge__as__Parent' property
	 * @param		The {@link org.cdao.jastor.DirectedEdge} to add
	 * @see			#belongs__to__Edge__as__ParentProperty
	 */
	public void addBelongs__to__Edge__as__Parent(org.cdao.jastor.DirectedEdge belongs__to__Edge__as__Parent) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'belongs__to__Edge__as__Parent' property
	 * @return		The anoymous {@link org.cdao.jastor.DirectedEdge} created
	 * @see			#belongs__to__Edge__as__ParentProperty
	 */
	public org.cdao.jastor.DirectedEdge addBelongs__to__Edge__as__Parent() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#DirectedEdge.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#belongs__to__Edge__as__ParentProperty
	 */
	public org.cdao.jastor.DirectedEdge addBelongs__to__Edge__as__Parent(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'belongs__to__Edge__as__Parent' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.DirectedEdge} to remove
	 * @see			#belongs__to__Edge__as__ParentProperty
	 */
	public void removeBelongs__to__Edge__as__Parent(org.cdao.jastor.DirectedEdge belongs__to__Edge__as__Parent) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'belongs__to__Tree__as__Root' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.Tree}
	 * @see			#belongs__to__Tree__as__RootProperty
	 */
	public java.util.Iterator getBelongs__to__Tree__as__Root() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'belongs__to__Tree__as__Root' property
	 * @param		The {@link org.cdao.jastor.Tree} to add
	 * @see			#belongs__to__Tree__as__RootProperty
	 */
	public void addBelongs__to__Tree__as__Root(org.cdao.jastor.Tree belongs__to__Tree__as__Root) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'belongs__to__Tree__as__Root' property
	 * @return		The anoymous {@link org.cdao.jastor.Tree} created
	 * @see			#belongs__to__Tree__as__RootProperty
	 */
	public org.cdao.jastor.Tree addBelongs__to__Tree__as__Root() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#Tree.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#belongs__to__Tree__as__RootProperty
	 */
	public org.cdao.jastor.Tree addBelongs__to__Tree__as__Root(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'belongs__to__Tree__as__Root' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.Tree} to remove
	 * @see			#belongs__to__Tree__as__RootProperty
	 */
	public void removeBelongs__to__Tree__as__Root(org.cdao.jastor.Tree belongs__to__Tree__as__Root) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'nca__node__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.SetOfNodes}
	 * @see			#nca__node__ofProperty
	 */
	public java.util.Iterator getNca__node__of() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'nca__node__of' property
	 * @param		The {@link org.cdao.jastor.SetOfNodes} to add
	 * @see			#nca__node__ofProperty
	 */
	public void addNca__node__of(org.cdao.jastor.SetOfNodes nca__node__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'nca__node__of' property
	 * @return		The anoymous {@link org.cdao.jastor.SetOfNodes} created
	 * @see			#nca__node__ofProperty
	 */
	public org.cdao.jastor.SetOfNodes addNca__node__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#SetOfNodes.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#nca__node__ofProperty
	 */
	public org.cdao.jastor.SetOfNodes addNca__node__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'nca__node__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.SetOfNodes} to remove
	 * @see			#nca__node__ofProperty
	 */
	public void removeNca__node__of(org.cdao.jastor.SetOfNodes nca__node__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'belongs__to__Edge' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.Edge}
	 * @see			#belongs__to__EdgeProperty
	 */
	public java.util.Iterator getBelongs__to__Edge() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'belongs__to__Edge' property
	 * @param		The {@link org.cdao.jastor.Edge} to add
	 * @see			#belongs__to__EdgeProperty
	 */
	public void addBelongs__to__Edge(org.cdao.jastor.Edge belongs__to__Edge) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'belongs__to__Edge' property
	 * @return		The anoymous {@link org.cdao.jastor.Edge} created
	 * @see			#belongs__to__EdgeProperty
	 */
	public org.cdao.jastor.Edge addBelongs__to__Edge() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#Edge.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#belongs__to__EdgeProperty
	 */
	public org.cdao.jastor.Edge addBelongs__to__Edge(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'belongs__to__Edge' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.Edge} to remove
	 * @see			#belongs__to__EdgeProperty
	 */
	public void removeBelongs__to__Edge(org.cdao.jastor.Edge belongs__to__Edge) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Gets the 'represents__TU' property value
	 * @return		{@link org.cdao.jastor.TU}
	 * @see			#represents__TUProperty
	 */
	public org.cdao.jastor.TU getRepresents__TU() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'represents__TU' property value
	 * @param		{@link org.cdao.jastor.TU}
	 * @see			#represents__TUProperty
	 */
	public void setRepresents__TU(org.cdao.jastor.TU represents__TU) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'represents__TU' property value to an anonymous node
	 * @return		{@link org.cdao.jastor.TU}, the created value
	 * @see			#represents__TUProperty
	 */	
	public org.cdao.jastor.TU setRepresents__TU() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'represents__TU' property value to the given resource
	 * The resource argument should have rdf:type http://localhost/~vivek/cdao.owl#TU.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Resource} must not be be null.
	 * @return		{@link org.cdao.jastor.TU}, the newly created value
	 * @see			#represents__TUProperty
	 */
	public org.cdao.jastor.TU setRepresents__TU(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Get an Iterator the 'has__Parent' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.Node}
	 * @see			#has__ParentProperty
	 */
	public java.util.Iterator getHas__Parent() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Parent' property
	 * @param		The {@link org.cdao.jastor.Node} to add
	 * @see			#has__ParentProperty
	 */
	public void addHas__Parent(org.cdao.jastor.Node has__Parent) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Parent' property
	 * @return		The anoymous {@link org.cdao.jastor.Node} created
	 * @see			#has__ParentProperty
	 */
	public org.cdao.jastor.Node addHas__Parent() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#Node.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__ParentProperty
	 */
	public org.cdao.jastor.Node addHas__Parent(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Parent' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.Node} to remove
	 * @see			#has__ParentProperty
	 */
	public void removeHas__Parent(org.cdao.jastor.Node has__Parent) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Gets the 'belongs__to__Edge__as__Child' property value
	 * @return		{@link org.cdao.jastor.DirectedEdge}
	 * @see			#belongs__to__Edge__as__ChildProperty
	 */
	public org.cdao.jastor.DirectedEdge getBelongs__to__Edge__as__Child() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__Edge__as__Child' property value
	 * @param		{@link org.cdao.jastor.DirectedEdge}
	 * @see			#belongs__to__Edge__as__ChildProperty
	 */
	public void setBelongs__to__Edge__as__Child(org.cdao.jastor.DirectedEdge belongs__to__Edge__as__Child) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__Edge__as__Child' property value to an anonymous node
	 * @return		{@link org.cdao.jastor.DirectedEdge}, the created value
	 * @see			#belongs__to__Edge__as__ChildProperty
	 */	
	public org.cdao.jastor.DirectedEdge setBelongs__to__Edge__as__Child() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'belongs__to__Edge__as__Child' property value to the given resource
	 * The resource argument should have rdf:type http://localhost/~vivek/cdao.owl#DirectedEdge.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Resource} must not be be null.
	 * @return		{@link org.cdao.jastor.DirectedEdge}, the newly created value
	 * @see			#belongs__to__Edge__as__ChildProperty
	 */
	public org.cdao.jastor.DirectedEdge setBelongs__to__Edge__as__Child(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Get an Iterator the 'has__Child' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.Node}
	 * @see			#has__ChildProperty
	 */
	public java.util.Iterator getHas__Child() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Child' property
	 * @param		The {@link org.cdao.jastor.Node} to add
	 * @see			#has__ChildProperty
	 */
	public void addHas__Child(org.cdao.jastor.Node has__Child) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Child' property
	 * @return		The anoymous {@link org.cdao.jastor.Node} created
	 * @see			#has__ChildProperty
	 */
	public org.cdao.jastor.Node addHas__Child() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#Node.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__ChildProperty
	 */
	public org.cdao.jastor.Node addHas__Child(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Child' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.Node} to remove
	 * @see			#has__ChildProperty
	 */
	public void removeHas__Child(org.cdao.jastor.Node has__Child) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Descendant' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.Node}
	 * @see			#has__DescendantProperty
	 */
	public java.util.Iterator getHas__Descendant() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Descendant' property
	 * @param		The {@link org.cdao.jastor.Node} to add
	 * @see			#has__DescendantProperty
	 */
	public void addHas__Descendant(org.cdao.jastor.Node has__Descendant) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Descendant' property
	 * @return		The anoymous {@link org.cdao.jastor.Node} created
	 * @see			#has__DescendantProperty
	 */
	public org.cdao.jastor.Node addHas__Descendant() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#Node.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__DescendantProperty
	 */
	public org.cdao.jastor.Node addHas__Descendant(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Descendant' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.Node} to remove
	 * @see			#has__DescendantProperty
	 */
	public void removeHas__Descendant(org.cdao.jastor.Node has__Descendant) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'belongs__to__Tree' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.Tree}
	 * @see			#belongs__to__TreeProperty
	 */
	public java.util.Iterator getBelongs__to__Tree() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'belongs__to__Tree' property
	 * @param		The {@link org.cdao.jastor.Tree} to add
	 * @see			#belongs__to__TreeProperty
	 */
	public void addBelongs__to__Tree(org.cdao.jastor.Tree belongs__to__Tree) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'belongs__to__Tree' property
	 * @return		The anoymous {@link org.cdao.jastor.Tree} created
	 * @see			#belongs__to__TreeProperty
	 */
	public org.cdao.jastor.Tree addBelongs__to__Tree() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#Tree.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#belongs__to__TreeProperty
	 */
	public org.cdao.jastor.Tree addBelongs__to__Tree(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'belongs__to__Tree' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.Tree} to remove
	 * @see			#belongs__to__TreeProperty
	 */
	public void removeBelongs__to__Tree(org.cdao.jastor.Tree belongs__to__Tree) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'belongs__to__Network' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.Network}
	 * @see			#belongs__to__NetworkProperty
	 */
	public java.util.Iterator getBelongs__to__Network() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'belongs__to__Network' property
	 * @param		The {@link org.cdao.jastor.Network} to add
	 * @see			#belongs__to__NetworkProperty
	 */
	public void addBelongs__to__Network(org.cdao.jastor.Network belongs__to__Network) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'belongs__to__Network' property
	 * @return		The anoymous {@link org.cdao.jastor.Network} created
	 * @see			#belongs__to__NetworkProperty
	 */
	public org.cdao.jastor.Network addBelongs__to__Network() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#Network.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#belongs__to__NetworkProperty
	 */
	public org.cdao.jastor.Network addBelongs__to__Network(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'belongs__to__Network' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.Network} to remove
	 * @see			#belongs__to__NetworkProperty
	 */
	public void removeBelongs__to__Network(org.cdao.jastor.Network belongs__to__Network) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Annotation' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.CDAOAnnotation}
	 * @see			#has__AnnotationProperty
	 */
	public java.util.Iterator getHas__Annotation() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Annotation' property
	 * @param		The {@link org.cdao.jastor.CDAOAnnotation} to add
	 * @see			#has__AnnotationProperty
	 */
	public void addHas__Annotation(org.cdao.jastor.CDAOAnnotation has__Annotation) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Annotation' property
	 * @return		The anoymous {@link org.cdao.jastor.CDAOAnnotation} created
	 * @see			#has__AnnotationProperty
	 */
	public org.cdao.jastor.CDAOAnnotation addHas__Annotation() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#CDAOAnnotation.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__AnnotationProperty
	 */
	public org.cdao.jastor.CDAOAnnotation addHas__Annotation(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Annotation' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.CDAOAnnotation} to remove
	 * @see			#has__AnnotationProperty
	 */
	public void removeHas__Annotation(org.cdao.jastor.CDAOAnnotation has__Annotation) throws com.ibm.adtech.jastor.JastorException;
		
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
		
}