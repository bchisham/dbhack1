

package org.cdao.jastor;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of org.cdao.jasper.EdgeTransformation to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface EdgeTransformationListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of is__annotation__of has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void is__annotation__ofAdded(org.cdao.jastor.EdgeTransformation source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of is__annotation__of has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */
	public void is__annotation__ofRemoved(org.cdao.jastor.EdgeTransformation source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Support__Value has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void has__Support__ValueAdded(org.cdao.jastor.EdgeTransformation source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Support__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Support__ValueRemoved(org.cdao.jastor.EdgeTransformation source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Uncertainty__Factor has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void has__Uncertainty__FactorAdded(org.cdao.jastor.EdgeTransformation source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Uncertainty__Factor has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Uncertainty__FactorRemoved(org.cdao.jastor.EdgeTransformation source, java.lang.Float oldValue);

	/**
	 * Called when a value of connects__to has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void connects__toAdded(org.cdao.jastor.EdgeTransformation source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of connects__to has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */
	public void connects__toRemoved(org.cdao.jastor.EdgeTransformation source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Float__Value has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void has__Float__ValueAdded(org.cdao.jastor.EdgeTransformation source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Float__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Float__ValueRemoved(org.cdao.jastor.EdgeTransformation source, java.lang.Float oldValue);

	/**
	 * Called when a value of part__of has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void part__ofAdded(org.cdao.jastor.EdgeTransformation source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of part__of has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */
	public void part__ofRemoved(org.cdao.jastor.EdgeTransformation source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Precision has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void has__PrecisionAdded(org.cdao.jastor.EdgeTransformation source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Precision has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */	
	public void has__PrecisionRemoved(org.cdao.jastor.EdgeTransformation source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Annotation has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void has__AnnotationAdded(org.cdao.jastor.EdgeTransformation source, org.cdao.jastor.CDAOAnnotation newValue);

	/**
	 * Called when a value of has__Annotation has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */
	public void has__AnnotationRemoved(org.cdao.jastor.EdgeTransformation source, org.cdao.jastor.CDAOAnnotation oldValue);
		
	/**
	 * Called when a value of belongs__to has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void belongs__toAdded(org.cdao.jastor.EdgeTransformation source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of belongs__to has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */
	public void belongs__toRemoved(org.cdao.jastor.EdgeTransformation source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Int__Value has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void has__Int__ValueAdded(org.cdao.jastor.EdgeTransformation source, java.lang.Integer newValue);

	/**
	 * Called when a value of has__Int__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Int__ValueRemoved(org.cdao.jastor.EdgeTransformation source, java.lang.Integer oldValue);

	/**
	 * Called when a value of has has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void hasAdded(org.cdao.jastor.EdgeTransformation source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */
	public void hasRemoved(org.cdao.jastor.EdgeTransformation source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Value has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void has__ValueAdded(org.cdao.jastor.EdgeTransformation source, java.lang.String newValue);

	/**
	 * Called when a value of has__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */	
	public void has__ValueRemoved(org.cdao.jastor.EdgeTransformation source, java.lang.String oldValue);

	/**
	 * Called when a value of precedes has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void precedesAdded(org.cdao.jastor.EdgeTransformation source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of precedes has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */
	public void precedesRemoved(org.cdao.jastor.EdgeTransformation source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__External__Reference has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void has__External__ReferenceAdded(org.cdao.jastor.EdgeTransformation source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of has__External__Reference has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */	
	public void has__External__ReferenceRemoved(org.cdao.jastor.EdgeTransformation source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when has__Left__State has changed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 */
	public void has__Left__StateChanged(org.cdao.jastor.EdgeTransformation source);

	/**
	 * Called when a value of has__Left__Node has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void has__Left__NodeAdded(org.cdao.jastor.EdgeTransformation source, org.cdao.jastor.Node newValue);

	/**
	 * Called when a value of has__Left__Node has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */
	public void has__Left__NodeRemoved(org.cdao.jastor.EdgeTransformation source, org.cdao.jastor.Node oldValue);
		
	/**
	 * Called when a value of has__Transformation__Component has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void has__Transformation__ComponentAdded(org.cdao.jastor.EdgeTransformation source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has__Transformation__Component has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */
	public void has__Transformation__ComponentRemoved(org.cdao.jastor.EdgeTransformation source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when has__Right__State has changed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 */
	public void has__Right__StateChanged(org.cdao.jastor.EdgeTransformation source);

	/**
	 * Called when transformation__of has changed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 */
	public void transformation__ofChanged(org.cdao.jastor.EdgeTransformation source);

	/**
	 * Called when a value of has__Right__Node has been added
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param newValue the object representing the new value
	 */	
	public void has__Right__NodeAdded(org.cdao.jastor.EdgeTransformation source, org.cdao.jastor.Node newValue);

	/**
	 * Called when a value of has__Right__Node has been removed
	 * @param source the affected instance of org.cdao.jasper.EdgeTransformation
	 * @param oldValue the object representing the removed value
	 */
	public void has__Right__NodeRemoved(org.cdao.jastor.EdgeTransformation source, org.cdao.jastor.Node oldValue);
		
}