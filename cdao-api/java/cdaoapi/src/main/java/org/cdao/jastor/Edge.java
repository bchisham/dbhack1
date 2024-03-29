

package org.cdao.jastor;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Edge ontology class<br>
 * Use the org.cdao.jasper.CDAOFactory to create instances of this interface.
 * <p>(URI: http://localhost/~vivek/cdao.owl#Edge)</p>
 * <br>
 * <br>
 * Dublin Core Standard Properties <br>
 * 	description : An edge connecting two nodes in a (Phylogenetic) Tree or Network, also known as a 'branch'.  Edges may have attributes such as length, degree of support, and direction.  An edge can be a surrogate for a 'split' or bipartition, since each edge in a tree divides the terminal nodes into two sets. <br>
 * <br>
 */
public interface Edge extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://localhost/~vivek/cdao.owl#Edge");
	

	/**
	 * The Jena Property for has__Node 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Node)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : Property that associates to each Edge the Nodes it connects. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__NodeProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Node");


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
	 * Get an Iterator the 'has__Node' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.Node}
	 * @see			#has__NodeProperty
	 */
	public java.util.Iterator getHas__Node() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Node' property
	 * @param		The {@link org.cdao.jastor.Node} to add
	 * @see			#has__NodeProperty
	 */
	public void addHas__Node(org.cdao.jastor.Node has__Node) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Node' property
	 * @return		The anoymous {@link org.cdao.jastor.Node} created
	 * @see			#has__NodeProperty
	 */
	public org.cdao.jastor.Node addHas__Node() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#Node.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__NodeProperty
	 */
	public org.cdao.jastor.Node addHas__Node(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Node' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.Node} to remove
	 * @see			#has__NodeProperty
	 */
	public void removeHas__Node(org.cdao.jastor.Node has__Node) throws com.ibm.adtech.jastor.JastorException;
		
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