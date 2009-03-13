

package org.cdao.jastor;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for CoordinateList ontology class<br>
 * Use the org.cdao.jasper.CDAOFactory to create instances of this interface.
 * <p>(URI: http://localhost/~vivek/cdao.owl#CoordinateList)</p>
 * <br>
 * <br>
 * <br>
 */
public interface CoordinateList extends org.cdao.jastor.DatumCoordinate, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://localhost/~vivek/cdao.owl#CoordinateList");
	

	/**
	 * The Jena Property for has__Remaining__Coordinate__List 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_Remaining_Coordinate_List)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : The property that relates a coordinate list to the item in the list beyond the first item.^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Remaining__Coordinate__ListProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_Remaining_Coordinate_List");


	/**
	 * The Jena Property for has__First__Coordinate__Item 
	 * <p>(URI: http://localhost/~vivek/cdao.owl#has_First_Coordinate_Item)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : The property that relates a coordinate list to the first item in the list.^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__First__Coordinate__ItemProperty = ResourceFactory.createProperty("http://localhost/~vivek/cdao.owl#has_First_Coordinate_Item");


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
	 * Get an Iterator the 'has__Remaining__Coordinate__List' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.CoordinateList}
	 * @see			#has__Remaining__Coordinate__ListProperty
	 */
	public java.util.Iterator getHas__Remaining__Coordinate__List() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Remaining__Coordinate__List' property
	 * @param		The {@link org.cdao.jastor.CoordinateList} to add
	 * @see			#has__Remaining__Coordinate__ListProperty
	 */
	public void addHas__Remaining__Coordinate__List(org.cdao.jastor.CoordinateList has__Remaining__Coordinate__List) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Remaining__Coordinate__List' property
	 * @return		The anoymous {@link org.cdao.jastor.CoordinateList} created
	 * @see			#has__Remaining__Coordinate__ListProperty
	 */
	public org.cdao.jastor.CoordinateList addHas__Remaining__Coordinate__List() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#CoordinateList.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Remaining__Coordinate__ListProperty
	 */
	public org.cdao.jastor.CoordinateList addHas__Remaining__Coordinate__List(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Remaining__Coordinate__List' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.CoordinateList} to remove
	 * @see			#has__Remaining__Coordinate__ListProperty
	 */
	public void removeHas__Remaining__Coordinate__List(org.cdao.jastor.CoordinateList has__Remaining__Coordinate__List) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__First__Coordinate__Item' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.CoordinatePoint}
	 * @see			#has__First__Coordinate__ItemProperty
	 */
	public java.util.Iterator getHas__First__Coordinate__Item_asCoordinatePoint() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__First__Coordinate__Item' property
	 * @param		The {@link org.cdao.jastor.CoordinatePoint} to add
	 * @see			#has__First__Coordinate__ItemProperty
	 */
	public void addHas__First__Coordinate__Item(org.cdao.jastor.CoordinatePoint has__First__Coordinate__Item) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__First__Coordinate__Item' property
	 * @return		The anoymous {@link org.cdao.jastor.CoordinatePoint} created
	 * @see			#has__First__Coordinate__ItemProperty
	 */
	public org.cdao.jastor.CoordinatePoint addHas__First__Coordinate__Item_asCoordinatePoint() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#CoordinatePoint.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__First__Coordinate__ItemProperty
	 */
	public org.cdao.jastor.CoordinatePoint addHas__First__Coordinate__Item_asCoordinatePoint(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__First__Coordinate__Item' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.CoordinatePoint} to remove
	 * @see			#has__First__Coordinate__ItemProperty
	 */
	public void removeHas__First__Coordinate__Item(org.cdao.jastor.CoordinatePoint has__First__Coordinate__Item) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__First__Coordinate__Item' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jastor.CoordinateRange}
	 * @see			#has__First__Coordinate__ItemProperty
	 */
	public java.util.Iterator getHas__First__Coordinate__Item_asCoordinateRange() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__First__Coordinate__Item' property
	 * @param		The {@link org.cdao.jastor.CoordinateRange} to add
	 * @see			#has__First__Coordinate__ItemProperty
	 */
	public void addHas__First__Coordinate__Item(org.cdao.jastor.CoordinateRange has__First__Coordinate__Item) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__First__Coordinate__Item' property
	 * @return		The anoymous {@link org.cdao.jastor.CoordinateRange} created
	 * @see			#has__First__Coordinate__ItemProperty
	 */
	public org.cdao.jastor.CoordinateRange addHas__First__Coordinate__Item_asCoordinateRange() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://localhost/~vivek/cdao.owl#CoordinateRange.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__First__Coordinate__ItemProperty
	 */
	public org.cdao.jastor.CoordinateRange addHas__First__Coordinate__Item_asCoordinateRange(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__First__Coordinate__Item' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jastor.CoordinateRange} to remove
	 * @see			#has__First__Coordinate__ItemProperty
	 */
	public void removeHas__First__Coordinate__Item(org.cdao.jastor.CoordinateRange has__First__Coordinate__Item) throws com.ibm.adtech.jastor.JastorException;
		
}