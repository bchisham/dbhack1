

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
 * Implementations of this listener may be registered with instances of org.cdao.jasper.TU to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface TUListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of has__Support__Value has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__Support__ValueAdded(org.cdao.jastor.TU source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Support__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Support__ValueRemoved(org.cdao.jastor.TU source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Uncertainty__Factor has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__Uncertainty__FactorAdded(org.cdao.jastor.TU source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Uncertainty__Factor has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Uncertainty__FactorRemoved(org.cdao.jastor.TU source, java.lang.Float oldValue);

	/**
	 * Called when a value of connects__to has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void connects__toAdded(org.cdao.jastor.TU source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of connects__to has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void connects__toRemoved(org.cdao.jastor.TU source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Float__Value has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__Float__ValueAdded(org.cdao.jastor.TU source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Float__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Float__ValueRemoved(org.cdao.jastor.TU source, java.lang.Float oldValue);

	/**
	 * Called when a value of part__of has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void part__ofAdded(org.cdao.jastor.TU source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of part__of has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void part__ofRemoved(org.cdao.jastor.TU source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Precision has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__PrecisionAdded(org.cdao.jastor.TU source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Precision has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */	
	public void has__PrecisionRemoved(org.cdao.jastor.TU source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Annotation has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__AnnotationAdded(org.cdao.jastor.TU source, org.cdao.jastor.CDAOAnnotation newValue);

	/**
	 * Called when a value of has__Annotation has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void has__AnnotationRemoved(org.cdao.jastor.TU source, org.cdao.jastor.CDAOAnnotation oldValue);
		
	/**
	 * Called when a value of belongs__to has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void belongs__toAdded(org.cdao.jastor.TU source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of belongs__to has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void belongs__toRemoved(org.cdao.jastor.TU source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of represented__by__Node has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void represented__by__NodeAdded(org.cdao.jastor.TU source, org.cdao.jastor.Node newValue);

	/**
	 * Called when a value of represented__by__Node has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void represented__by__NodeRemoved(org.cdao.jastor.TU source, org.cdao.jastor.Node oldValue);
		
	/**
	 * Called when a value of has__Int__Value has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__Int__ValueAdded(org.cdao.jastor.TU source, java.lang.Integer newValue);

	/**
	 * Called when a value of has__Int__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Int__ValueRemoved(org.cdao.jastor.TU source, java.lang.Integer oldValue);

	/**
	 * Called when a value of has has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void hasAdded(org.cdao.jastor.TU source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void hasRemoved(org.cdao.jastor.TU source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Value has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__ValueAdded(org.cdao.jastor.TU source, java.lang.String newValue);

	/**
	 * Called when a value of has__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */	
	public void has__ValueRemoved(org.cdao.jastor.TU source, java.lang.String oldValue);

	/**
	 * Called when a value of precedes has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void precedesAdded(org.cdao.jastor.TU source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of precedes has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void precedesRemoved(org.cdao.jastor.TU source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__External__Reference has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__External__ReferenceAdded(org.cdao.jastor.TU source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of has__External__Reference has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */	
	public void has__External__ReferenceRemoved(org.cdao.jastor.TU source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of has__Datum has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__DatumAdded(org.cdao.jastor.TU source, org.cdao.jastor.CharacterStateDatum newValue);

	/**
	 * Called when a value of has__Datum has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void has__DatumRemoved(org.cdao.jastor.TU source, org.cdao.jastor.CharacterStateDatum oldValue);
		
	/**
	 * Called when a value of has__Molecular__Datum has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__Molecular__DatumAdded(org.cdao.jastor.TU source, org.cdao.jastor.MolecularStateDatum newValue);

	/**
	 * Called when a value of has__Molecular__Datum has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void has__Molecular__DatumRemoved(org.cdao.jastor.TU source, org.cdao.jastor.MolecularStateDatum oldValue);
		
	/**
	 * Called when a value of has__Nucleotide__Datum has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__Nucleotide__DatumAdded(org.cdao.jastor.TU source, org.cdao.jastor.DesoxiRibonucleotideResidueStateDatum newValue);

	/**
	 * Called when a value of has__Nucleotide__Datum has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void has__Nucleotide__DatumRemoved(org.cdao.jastor.TU source, org.cdao.jastor.DesoxiRibonucleotideResidueStateDatum oldValue);
		
	/**
	 * Called when a value of has__Continuous__Datum has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__Continuous__DatumAdded(org.cdao.jastor.TU source, org.cdao.jastor.ContinuousStateDatum newValue);

	/**
	 * Called when a value of has__Continuous__Datum has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void has__Continuous__DatumRemoved(org.cdao.jastor.TU source, org.cdao.jastor.ContinuousStateDatum oldValue);
		
	/**
	 * Called when a value of has__Standard__Datum has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__Standard__DatumAdded(org.cdao.jastor.TU source, org.cdao.jastor.StandardStateDatum newValue);

	/**
	 * Called when a value of has__Standard__Datum has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void has__Standard__DatumRemoved(org.cdao.jastor.TU source, org.cdao.jastor.StandardStateDatum oldValue);
		
	/**
	 * Called when a value of has__Amino__Acid__Datum has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__Amino__Acid__DatumAdded(org.cdao.jastor.TU source, org.cdao.jastor.AminoAcidResidueStateDatum newValue);

	/**
	 * Called when a value of has__Amino__Acid__Datum has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void has__Amino__Acid__DatumRemoved(org.cdao.jastor.TU source, org.cdao.jastor.AminoAcidResidueStateDatum oldValue);
		
	/**
	 * Called when a value of belongs__to__Character__State__Data__Matrix has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void belongs__to__Character__State__Data__MatrixAdded(org.cdao.jastor.TU source, org.cdao.jastor.CharacterStateDataMatrix newValue);

	/**
	 * Called when a value of belongs__to__Character__State__Data__Matrix has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void belongs__to__Character__State__Data__MatrixRemoved(org.cdao.jastor.TU source, org.cdao.jastor.CharacterStateDataMatrix oldValue);
		
	/**
	 * Called when a value of has__Compound__Datum has been added
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param newValue the object representing the new value
	 */	
	public void has__Compound__DatumAdded(org.cdao.jastor.TU source, org.cdao.jastor.CompoundStateDatum newValue);

	/**
	 * Called when a value of has__Compound__Datum has been removed
	 * @param source the affected instance of org.cdao.jasper.TU
	 * @param oldValue the object representing the removed value
	 */
	public void has__Compound__DatumRemoved(org.cdao.jastor.TU source, org.cdao.jastor.CompoundStateDatum oldValue);
		
}