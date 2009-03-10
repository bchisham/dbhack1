

package org.cdao.jasper;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of org.cdao.UncertainStateDomain to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface UncertainStateDomainListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of has__External__Reference has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void has__External__ReferenceAdded(org.cdao.jasper.UncertainStateDomain source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of has__External__Reference has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */	
	public void has__External__ReferenceRemoved(org.cdao.jasper.UncertainStateDomain source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of has__Float__Value has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void has__Float__ValueAdded(org.cdao.jasper.UncertainStateDomain source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Float__Value has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Float__ValueRemoved(org.cdao.jasper.UncertainStateDomain source, java.lang.Float oldValue);

	/**
	 * Called when a value of part__of has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void part__ofAdded(org.cdao.jasper.UncertainStateDomain source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of part__of has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */
	public void part__ofRemoved(org.cdao.jasper.UncertainStateDomain source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Uncertainty__Factor has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void has__Uncertainty__FactorAdded(org.cdao.jasper.UncertainStateDomain source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Uncertainty__Factor has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Uncertainty__FactorRemoved(org.cdao.jasper.UncertainStateDomain source, java.lang.Float oldValue);

	/**
	 * Called when a value of exclude has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void excludeAdded(org.cdao.jasper.UncertainStateDomain source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of exclude has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */
	public void excludeRemoved(org.cdao.jasper.UncertainStateDomain source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Int__Value has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void has__Int__ValueAdded(org.cdao.jasper.UncertainStateDomain source, java.lang.Integer newValue);

	/**
	 * Called when a value of has__Int__Value has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Int__ValueRemoved(org.cdao.jasper.UncertainStateDomain source, java.lang.Integer oldValue);

	/**
	 * Called when a value of has__Precision has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void has__PrecisionAdded(org.cdao.jasper.UncertainStateDomain source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Precision has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */	
	public void has__PrecisionRemoved(org.cdao.jasper.UncertainStateDomain source, java.lang.Float oldValue);

	/**
	 * Called when a value of connects__to has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void connects__toAdded(org.cdao.jasper.UncertainStateDomain source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of connects__to has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */
	public void connects__toRemoved(org.cdao.jasper.UncertainStateDomain source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of belongs__to has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void belongs__toAdded(org.cdao.jasper.UncertainStateDomain source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of belongs__to has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */
	public void belongs__toRemoved(org.cdao.jasper.UncertainStateDomain source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of exclude__Subtree has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void exclude__SubtreeAdded(org.cdao.jasper.UncertainStateDomain source, org.cdao.jasper.Subtree newValue);

	/**
	 * Called when a value of exclude__Subtree has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */
	public void exclude__SubtreeRemoved(org.cdao.jasper.UncertainStateDomain source, org.cdao.jasper.Subtree oldValue);
		
	/**
	 * Called when a value of has has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void hasAdded(org.cdao.jasper.UncertainStateDomain source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */
	public void hasRemoved(org.cdao.jasper.UncertainStateDomain source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Support__Value has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void has__Support__ValueAdded(org.cdao.jasper.UncertainStateDomain source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Support__Value has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Support__ValueRemoved(org.cdao.jasper.UncertainStateDomain source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Annotation has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void has__AnnotationAdded(org.cdao.jasper.UncertainStateDomain source, org.cdao.jasper.CDAOAnnotation newValue);

	/**
	 * Called when a value of has__Annotation has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */
	public void has__AnnotationRemoved(org.cdao.jasper.UncertainStateDomain source, org.cdao.jasper.CDAOAnnotation oldValue);
		
	/**
	 * Called when a value of precedes has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void precedesAdded(org.cdao.jasper.UncertainStateDomain source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of precedes has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */
	public void precedesRemoved(org.cdao.jasper.UncertainStateDomain source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Type has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void has__TypeAdded(org.cdao.jasper.UncertainStateDomain source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has__Type has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */
	public void has__TypeRemoved(org.cdao.jasper.UncertainStateDomain source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when has__Value has changed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 */
	public void has__ValueChanged(org.cdao.jasper.UncertainStateDomain source);

	/**
	 * Called when a value of exclude__Node has been added
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param newValue the object representing the new value
	 */	
	public void exclude__NodeAdded(org.cdao.jasper.UncertainStateDomain source, org.cdao.jasper.Node newValue);

	/**
	 * Called when a value of exclude__Node has been removed
	 * @param source the affected instance of org.cdao.UncertainStateDomain
	 * @param oldValue the object representing the removed value
	 */
	public void exclude__NodeRemoved(org.cdao.jasper.UncertainStateDomain source, org.cdao.jasper.Node oldValue);
		
}