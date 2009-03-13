

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
 * Implementations of this listener may be registered with instances of org.cdao.jasper.ContinuousStateDatum to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface ContinuousStateDatumListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of has__Coordinate has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void has__CoordinateAdded(org.cdao.jastor.ContinuousStateDatum source, org.cdao.jastor.DatumCoordinate newValue);

	/**
	 * Called when a value of has__Coordinate has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */
	public void has__CoordinateRemoved(org.cdao.jastor.ContinuousStateDatum source, org.cdao.jastor.DatumCoordinate oldValue);
		
	/**
	 * Called when belongs__to__TU has changed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 */
	public void belongs__to__TUChanged(org.cdao.jastor.ContinuousStateDatum source);

	/**
	 * Called when a value of has__State has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void has__StateAdded(org.cdao.jastor.ContinuousStateDatum source, org.cdao.jastor.CharacterStateDomain newValue);

	/**
	 * Called when a value of has__State has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */
	public void has__StateRemoved(org.cdao.jastor.ContinuousStateDatum source, org.cdao.jastor.CharacterStateDomain oldValue);
		
	/**
	 * Called when belongs__to__Character has changed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 */
	public void belongs__to__CharacterChanged(org.cdao.jastor.ContinuousStateDatum source);

	/**
	 * Called when a value of homologous__to has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void homologous__toAdded(org.cdao.jastor.ContinuousStateDatum source, org.cdao.jastor.CharacterStateDatum newValue);

	/**
	 * Called when a value of homologous__to has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */
	public void homologous__toRemoved(org.cdao.jastor.ContinuousStateDatum source, org.cdao.jastor.CharacterStateDatum oldValue);
		
	/**
	 * Called when a value of has__Annotation has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void has__AnnotationAdded(org.cdao.jastor.ContinuousStateDatum source, org.cdao.jastor.CDAOAnnotation newValue);

	/**
	 * Called when a value of has__Annotation has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */
	public void has__AnnotationRemoved(org.cdao.jastor.ContinuousStateDatum source, org.cdao.jastor.CDAOAnnotation oldValue);
		
	/**
	 * Called when a value of belongs__to has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void belongs__toAdded(org.cdao.jastor.ContinuousStateDatum source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of belongs__to has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */
	public void belongs__toRemoved(org.cdao.jastor.ContinuousStateDatum source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Value has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void has__ValueAdded(org.cdao.jastor.ContinuousStateDatum source, java.lang.String newValue);

	/**
	 * Called when a value of has__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */	
	public void has__ValueRemoved(org.cdao.jastor.ContinuousStateDatum source, java.lang.String oldValue);

	/**
	 * Called when a value of has__Support__Value has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void has__Support__ValueAdded(org.cdao.jastor.ContinuousStateDatum source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Support__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Support__ValueRemoved(org.cdao.jastor.ContinuousStateDatum source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Float__Value has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void has__Float__ValueAdded(org.cdao.jastor.ContinuousStateDatum source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Float__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Float__ValueRemoved(org.cdao.jastor.ContinuousStateDatum source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Int__Value has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void has__Int__ValueAdded(org.cdao.jastor.ContinuousStateDatum source, java.lang.Integer newValue);

	/**
	 * Called when a value of has__Int__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Int__ValueRemoved(org.cdao.jastor.ContinuousStateDatum source, java.lang.Integer oldValue);

	/**
	 * Called when a value of has__Uncertainty__Factor has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void has__Uncertainty__FactorAdded(org.cdao.jastor.ContinuousStateDatum source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Uncertainty__Factor has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Uncertainty__FactorRemoved(org.cdao.jastor.ContinuousStateDatum source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Precision has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void has__PrecisionAdded(org.cdao.jastor.ContinuousStateDatum source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Precision has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */	
	public void has__PrecisionRemoved(org.cdao.jastor.ContinuousStateDatum source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__External__Reference has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void has__External__ReferenceAdded(org.cdao.jastor.ContinuousStateDatum source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of has__External__Reference has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */	
	public void has__External__ReferenceRemoved(org.cdao.jastor.ContinuousStateDatum source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of connects__to has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void connects__toAdded(org.cdao.jastor.ContinuousStateDatum source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of connects__to has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */
	public void connects__toRemoved(org.cdao.jastor.ContinuousStateDatum source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void hasAdded(org.cdao.jastor.ContinuousStateDatum source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */
	public void hasRemoved(org.cdao.jastor.ContinuousStateDatum source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of part__of has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void part__ofAdded(org.cdao.jastor.ContinuousStateDatum source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of part__of has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */
	public void part__ofRemoved(org.cdao.jastor.ContinuousStateDatum source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of precedes has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void precedesAdded(org.cdao.jastor.ContinuousStateDatum source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of precedes has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */
	public void precedesRemoved(org.cdao.jastor.ContinuousStateDatum source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Continuous__State has been added
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param newValue the object representing the new value
	 */	
	public void has__Continuous__StateAdded(org.cdao.jastor.ContinuousStateDatum source, org.cdao.jastor.Continuous newValue);

	/**
	 * Called when a value of has__Continuous__State has been removed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 * @param oldValue the object representing the removed value
	 */
	public void has__Continuous__StateRemoved(org.cdao.jastor.ContinuousStateDatum source, org.cdao.jastor.Continuous oldValue);
		
	/**
	 * Called when belongs__to__Continuous__Character has changed
	 * @param source the affected instance of org.cdao.jasper.ContinuousStateDatum
	 */
	public void belongs__to__Continuous__CharacterChanged(org.cdao.jastor.ContinuousStateDatum source);

}