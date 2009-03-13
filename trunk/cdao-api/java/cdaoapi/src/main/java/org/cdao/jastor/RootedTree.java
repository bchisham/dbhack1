

package org.cdao.jastor;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for RootedTree ontology class<br>
 * Use the org.cdao.jasper.CDAOFactory to create instances of this interface.
 * <p>(URI: http://localhost/~vivek/cdao.owl#RootedTree)</p>
 * <br>
 * <br>
 * Dublin Core Standard Properties <br>
 * 	description : A tree where the root is known <br>
 * <br>
 */
public interface RootedTree extends org.cdao.jastor.Tree, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://localhost/~vivek/cdao.owl#RootedTree");
	

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
	 * The Jena Property for has__Root 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Root)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : The property links a rooted tree to the specific node that represents the unique root of the tree. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__RootProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Root");


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
	 * Get an Iterator the 'has' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.DirectedEdge}
	 * @see			#hasProperty
	 */
	public java.util.Iterator getHas_asDirectedEdge() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has' property
	 * @param		The {@link org.cdao.jastor.DirectedEdge} to add
	 * @see			#hasProperty
	 */
	public void addHas(org.cdao.jastor.DirectedEdge has) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has' property
	 * @return		The anoymous {@link org.cdao.jastor.DirectedEdge} created
	 * @see			#hasProperty
	 */
	public org.cdao.jastor.DirectedEdge addHas_asDirectedEdge() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#DirectedEdge.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasProperty
	 */
	public org.cdao.jastor.DirectedEdge addHas_asDirectedEdge(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.DirectedEdge} to remove
	 * @see			#hasProperty
	 */
	public void removeHas(org.cdao.jastor.DirectedEdge has) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.Node}
	 * @see			#hasProperty
	 */
	public java.util.Iterator getHas_asNode() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has' property
	 * @param		The {@link org.cdao.jastor.Node} to add
	 * @see			#hasProperty
	 */
	public void addHas(org.cdao.jastor.Node has) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has' property
	 * @return		The anoymous {@link org.cdao.jastor.Node} created
	 * @see			#hasProperty
	 */
	public org.cdao.jastor.Node addHas_asNode() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#Node.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasProperty
	 */
	public org.cdao.jastor.Node addHas_asNode(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.Node} to remove
	 * @see			#hasProperty
	 */
	public void removeHas(org.cdao.jastor.Node has) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'subtree__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.RootedTree}
	 * @see			#subtree__ofProperty
	 */
	public java.util.Iterator getSubtree__of_asRootedTree() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'subtree__of' property
	 * @param		The {@link org.cdao.jastor.RootedTree} to add
	 * @see			#subtree__ofProperty
	 */
	public void addSubtree__of(org.cdao.jastor.RootedTree subtree__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'subtree__of' property
	 * @return		The anoymous {@link org.cdao.jastor.RootedTree} created
	 * @see			#subtree__ofProperty
	 */
	public org.cdao.jastor.RootedTree addSubtree__of_asRootedTree() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#RootedTree.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#subtree__ofProperty
	 */
	public org.cdao.jastor.RootedTree addSubtree__of_asRootedTree(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'subtree__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.RootedTree} to remove
	 * @see			#subtree__ofProperty
	 */
	public void removeSubtree__of(org.cdao.jastor.RootedTree subtree__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Gets the 'has__Root' property value
	 * @return		{@link org.cdao.jastor.Node}
	 * @see			#has__RootProperty
	 */
	public org.cdao.jastor.Node getHas__Root() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'has__Root' property value
	 * @param		{@link org.cdao.jastor.Node}
	 * @see			#has__RootProperty
	 */
	public void setHas__Root(org.cdao.jastor.Node has__Root) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'has__Root' property value to an anonymous node
	 * @return		{@link org.cdao.jastor.Node}, the created value
	 * @see			#has__RootProperty
	 */	
	public org.cdao.jastor.Node setHas__Root() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'has__Root' property value to the given resource
	 * The resource argument should have rdf:type http://localhost/~vivek/cdao.owl#Node.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Resource} must not be be null.
	 * @return		{@link org.cdao.jastor.Node}, the newly created value
	 * @see			#has__RootProperty
	 */
	public org.cdao.jastor.Node setHas__Root(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
}