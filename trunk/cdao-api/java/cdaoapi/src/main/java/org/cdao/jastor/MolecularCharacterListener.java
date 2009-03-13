

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
 * Implementations of this listener may be registered with instances of org.cdao.jasper.MolecularCharacter to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface MolecularCharacterListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of has__Datum has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void has__DatumAdded(org.cdao.jastor.MolecularCharacter source, org.cdao.jastor.CharacterStateDatum newValue);

	/**
	 * Called when a value of has__Datum has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */
	public void has__DatumRemoved(org.cdao.jastor.MolecularCharacter source, org.cdao.jastor.CharacterStateDatum oldValue);
		
	/**
	 * Called when a value of belongs__to__Character__State__Data__Matrix has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void belongs__to__Character__State__Data__MatrixAdded(org.cdao.jastor.MolecularCharacter source, org.cdao.jastor.CharacterStateDataMatrix newValue);

	/**
	 * Called when a value of belongs__to__Character__State__Data__Matrix has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */
	public void belongs__to__Character__State__Data__MatrixRemoved(org.cdao.jastor.MolecularCharacter source, org.cdao.jastor.CharacterStateDataMatrix oldValue);
		
	/**
	 * Called when a value of has__Annotation has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void has__AnnotationAdded(org.cdao.jastor.MolecularCharacter source, org.cdao.jastor.CDAOAnnotation newValue);

	/**
	 * Called when a value of has__Annotation has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */
	public void has__AnnotationRemoved(org.cdao.jastor.MolecularCharacter source, org.cdao.jastor.CDAOAnnotation oldValue);
		
	/**
	 * Called when a value of belongs__to has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void belongs__toAdded(org.cdao.jastor.MolecularCharacter source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of belongs__to has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */
	public void belongs__toRemoved(org.cdao.jastor.MolecularCharacter source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Value has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void has__ValueAdded(org.cdao.jastor.MolecularCharacter source, java.lang.String newValue);

	/**
	 * Called when a value of has__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */	
	public void has__ValueRemoved(org.cdao.jastor.MolecularCharacter source, java.lang.String oldValue);

	/**
	 * Called when a value of has__Support__Value has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void has__Support__ValueAdded(org.cdao.jastor.MolecularCharacter source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Support__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Support__ValueRemoved(org.cdao.jastor.MolecularCharacter source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Float__Value has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void has__Float__ValueAdded(org.cdao.jastor.MolecularCharacter source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Float__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Float__ValueRemoved(org.cdao.jastor.MolecularCharacter source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Int__Value has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void has__Int__ValueAdded(org.cdao.jastor.MolecularCharacter source, java.lang.Integer newValue);

	/**
	 * Called when a value of has__Int__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Int__ValueRemoved(org.cdao.jastor.MolecularCharacter source, java.lang.Integer oldValue);

	/**
	 * Called when a value of has__Uncertainty__Factor has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void has__Uncertainty__FactorAdded(org.cdao.jastor.MolecularCharacter source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Uncertainty__Factor has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Uncertainty__FactorRemoved(org.cdao.jastor.MolecularCharacter source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Precision has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void has__PrecisionAdded(org.cdao.jastor.MolecularCharacter source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Precision has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */	
	public void has__PrecisionRemoved(org.cdao.jastor.MolecularCharacter source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__External__Reference has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void has__External__ReferenceAdded(org.cdao.jastor.MolecularCharacter source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of has__External__Reference has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */	
	public void has__External__ReferenceRemoved(org.cdao.jastor.MolecularCharacter source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of connects__to has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void connects__toAdded(org.cdao.jastor.MolecularCharacter source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of connects__to has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */
	public void connects__toRemoved(org.cdao.jastor.MolecularCharacter source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void hasAdded(org.cdao.jastor.MolecularCharacter source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */
	public void hasRemoved(org.cdao.jastor.MolecularCharacter source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of part__of has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void part__ofAdded(org.cdao.jastor.MolecularCharacter source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of part__of has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */
	public void part__ofRemoved(org.cdao.jastor.MolecularCharacter source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of precedes has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void precedesAdded(org.cdao.jastor.MolecularCharacter source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of precedes has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */
	public void precedesRemoved(org.cdao.jastor.MolecularCharacter source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Molecular__Datum has been added
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param newValue the object representing the new value
	 */	
	public void has__Molecular__DatumAdded(org.cdao.jastor.MolecularCharacter source, org.cdao.jastor.MolecularStateDatum newValue);

	/**
	 * Called when a value of has__Molecular__Datum has been removed
	 * @param source the affected instance of org.cdao.jasper.MolecularCharacter
	 * @param oldValue the object representing the removed value
	 */
	public void has__Molecular__DatumRemoved(org.cdao.jastor.MolecularCharacter source, org.cdao.jastor.MolecularStateDatum oldValue);
		
}