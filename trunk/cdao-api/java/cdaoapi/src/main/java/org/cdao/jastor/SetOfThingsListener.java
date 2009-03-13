

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
 * Implementations of this listener may be registered with instances of org.cdao.jasper.SetOfThings to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface SetOfThingsListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of has__Element has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void has__ElementAdded(org.cdao.jastor.SetOfThings source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has__Element has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */
	public void has__ElementRemoved(org.cdao.jastor.SetOfThings source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Element has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void has__ElementAdded(org.cdao.jastor.SetOfThings source, org.cdao.jastor.Character newValue);

	/**
	 * Called when a value of has__Element has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */
	public void has__ElementRemoved(org.cdao.jastor.SetOfThings source, org.cdao.jastor.Character oldValue);
		
	/**
	 * Called when a value of has__Element has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void has__ElementAdded(org.cdao.jastor.SetOfThings source, org.cdao.jastor.SetOfCharacters newValue);

	/**
	 * Called when a value of has__Element has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */
	public void has__ElementRemoved(org.cdao.jastor.SetOfThings source, org.cdao.jastor.SetOfCharacters oldValue);
		
	/**
	 * Called when a value of has__Annotation has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void has__AnnotationAdded(org.cdao.jastor.SetOfThings source, org.cdao.jastor.CDAOAnnotation newValue);

	/**
	 * Called when a value of has__Annotation has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */
	public void has__AnnotationRemoved(org.cdao.jastor.SetOfThings source, org.cdao.jastor.CDAOAnnotation oldValue);
		
	/**
	 * Called when a value of belongs__to has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void belongs__toAdded(org.cdao.jastor.SetOfThings source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of belongs__to has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */
	public void belongs__toRemoved(org.cdao.jastor.SetOfThings source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Value has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void has__ValueAdded(org.cdao.jastor.SetOfThings source, java.lang.String newValue);

	/**
	 * Called when a value of has__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */	
	public void has__ValueRemoved(org.cdao.jastor.SetOfThings source, java.lang.String oldValue);

	/**
	 * Called when a value of has__Support__Value has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void has__Support__ValueAdded(org.cdao.jastor.SetOfThings source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Support__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Support__ValueRemoved(org.cdao.jastor.SetOfThings source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Float__Value has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void has__Float__ValueAdded(org.cdao.jastor.SetOfThings source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Float__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Float__ValueRemoved(org.cdao.jastor.SetOfThings source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Int__Value has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void has__Int__ValueAdded(org.cdao.jastor.SetOfThings source, java.lang.Integer newValue);

	/**
	 * Called when a value of has__Int__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Int__ValueRemoved(org.cdao.jastor.SetOfThings source, java.lang.Integer oldValue);

	/**
	 * Called when a value of has__Uncertainty__Factor has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void has__Uncertainty__FactorAdded(org.cdao.jastor.SetOfThings source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Uncertainty__Factor has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Uncertainty__FactorRemoved(org.cdao.jastor.SetOfThings source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Precision has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void has__PrecisionAdded(org.cdao.jastor.SetOfThings source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Precision has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */	
	public void has__PrecisionRemoved(org.cdao.jastor.SetOfThings source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__External__Reference has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void has__External__ReferenceAdded(org.cdao.jastor.SetOfThings source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of has__External__Reference has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */	
	public void has__External__ReferenceRemoved(org.cdao.jastor.SetOfThings source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of connects__to has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void connects__toAdded(org.cdao.jastor.SetOfThings source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of connects__to has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */
	public void connects__toRemoved(org.cdao.jastor.SetOfThings source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void hasAdded(org.cdao.jastor.SetOfThings source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */
	public void hasRemoved(org.cdao.jastor.SetOfThings source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of part__of has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void part__ofAdded(org.cdao.jastor.SetOfThings source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of part__of has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */
	public void part__ofRemoved(org.cdao.jastor.SetOfThings source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of precedes has been added
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param newValue the object representing the new value
	 */	
	public void precedesAdded(org.cdao.jastor.SetOfThings source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of precedes has been removed
	 * @param source the affected instance of org.cdao.jasper.SetOfThings
	 * @param oldValue the object representing the removed value
	 */
	public void precedesRemoved(org.cdao.jastor.SetOfThings source, com.ibm.adtech.jastor.Thing oldValue);
		
}