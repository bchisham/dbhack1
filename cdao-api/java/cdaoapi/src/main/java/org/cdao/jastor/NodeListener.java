

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
 * Implementations of this listener may be registered with instances of org.cdao.jasper.Node to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface NodeListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of part__of has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void part__ofAdded(org.cdao.jastor.Node source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of part__of has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void part__ofRemoved(org.cdao.jastor.Node source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Ancestor has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void has__AncestorAdded(org.cdao.jastor.Node source, org.cdao.jastor.Node newValue);

	/**
	 * Called when a value of has__Ancestor has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void has__AncestorRemoved(org.cdao.jastor.Node source, org.cdao.jastor.Node oldValue);
		
	/**
	 * Called when a value of belongs__to__Edge__as__Parent has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void belongs__to__Edge__as__ParentAdded(org.cdao.jastor.Node source, org.cdao.jastor.DirectedEdge newValue);

	/**
	 * Called when a value of belongs__to__Edge__as__Parent has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void belongs__to__Edge__as__ParentRemoved(org.cdao.jastor.Node source, org.cdao.jastor.DirectedEdge oldValue);
		
	/**
	 * Called when a value of belongs__to__Tree__as__Root has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void belongs__to__Tree__as__RootAdded(org.cdao.jastor.Node source, org.cdao.jastor.Tree newValue);

	/**
	 * Called when a value of belongs__to__Tree__as__Root has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void belongs__to__Tree__as__RootRemoved(org.cdao.jastor.Node source, org.cdao.jastor.Tree oldValue);
		
	/**
	 * Called when a value of nca__node__of has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void nca__node__ofAdded(org.cdao.jastor.Node source, org.cdao.jastor.SetOfNodes newValue);

	/**
	 * Called when a value of nca__node__of has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void nca__node__ofRemoved(org.cdao.jastor.Node source, org.cdao.jastor.SetOfNodes oldValue);
		
	/**
	 * Called when a value of belongs__to__Edge has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void belongs__to__EdgeAdded(org.cdao.jastor.Node source, org.cdao.jastor.Edge newValue);

	/**
	 * Called when a value of belongs__to__Edge has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void belongs__to__EdgeRemoved(org.cdao.jastor.Node source, org.cdao.jastor.Edge oldValue);
		
	/**
	 * Called when represents__TU has changed
	 * @param source the affected instance of org.cdao.jasper.Node
	 */
	public void represents__TUChanged(org.cdao.jastor.Node source);

	/**
	 * Called when a value of has__Parent has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void has__ParentAdded(org.cdao.jastor.Node source, org.cdao.jastor.Node newValue);

	/**
	 * Called when a value of has__Parent has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void has__ParentRemoved(org.cdao.jastor.Node source, org.cdao.jastor.Node oldValue);
		
	/**
	 * Called when belongs__to__Edge__as__Child has changed
	 * @param source the affected instance of org.cdao.jasper.Node
	 */
	public void belongs__to__Edge__as__ChildChanged(org.cdao.jastor.Node source);

	/**
	 * Called when a value of has__Child has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void has__ChildAdded(org.cdao.jastor.Node source, org.cdao.jastor.Node newValue);

	/**
	 * Called when a value of has__Child has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void has__ChildRemoved(org.cdao.jastor.Node source, org.cdao.jastor.Node oldValue);
		
	/**
	 * Called when a value of has__Descendant has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void has__DescendantAdded(org.cdao.jastor.Node source, org.cdao.jastor.Node newValue);

	/**
	 * Called when a value of has__Descendant has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void has__DescendantRemoved(org.cdao.jastor.Node source, org.cdao.jastor.Node oldValue);
		
	/**
	 * Called when a value of belongs__to__Tree has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void belongs__to__TreeAdded(org.cdao.jastor.Node source, org.cdao.jastor.Tree newValue);

	/**
	 * Called when a value of belongs__to__Tree has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void belongs__to__TreeRemoved(org.cdao.jastor.Node source, org.cdao.jastor.Tree oldValue);
		
	/**
	 * Called when a value of belongs__to__Network has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void belongs__to__NetworkAdded(org.cdao.jastor.Node source, org.cdao.jastor.Network newValue);

	/**
	 * Called when a value of belongs__to__Network has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void belongs__to__NetworkRemoved(org.cdao.jastor.Node source, org.cdao.jastor.Network oldValue);
		
	/**
	 * Called when a value of has__Annotation has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void has__AnnotationAdded(org.cdao.jastor.Node source, org.cdao.jastor.CDAOAnnotation newValue);

	/**
	 * Called when a value of has__Annotation has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void has__AnnotationRemoved(org.cdao.jastor.Node source, org.cdao.jastor.CDAOAnnotation oldValue);
		
	/**
	 * Called when a value of belongs__to has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void belongs__toAdded(org.cdao.jastor.Node source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of belongs__to has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void belongs__toRemoved(org.cdao.jastor.Node source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has__Value has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void has__ValueAdded(org.cdao.jastor.Node source, java.lang.String newValue);

	/**
	 * Called when a value of has__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */	
	public void has__ValueRemoved(org.cdao.jastor.Node source, java.lang.String oldValue);

	/**
	 * Called when a value of has__Support__Value has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void has__Support__ValueAdded(org.cdao.jastor.Node source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Support__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Support__ValueRemoved(org.cdao.jastor.Node source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Float__Value has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void has__Float__ValueAdded(org.cdao.jastor.Node source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Float__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Float__ValueRemoved(org.cdao.jastor.Node source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Int__Value has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void has__Int__ValueAdded(org.cdao.jastor.Node source, java.lang.Integer newValue);

	/**
	 * Called when a value of has__Int__Value has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Int__ValueRemoved(org.cdao.jastor.Node source, java.lang.Integer oldValue);

	/**
	 * Called when a value of has__Uncertainty__Factor has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void has__Uncertainty__FactorAdded(org.cdao.jastor.Node source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Uncertainty__Factor has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */	
	public void has__Uncertainty__FactorRemoved(org.cdao.jastor.Node source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__Precision has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void has__PrecisionAdded(org.cdao.jastor.Node source, java.lang.Float newValue);

	/**
	 * Called when a value of has__Precision has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */	
	public void has__PrecisionRemoved(org.cdao.jastor.Node source, java.lang.Float oldValue);

	/**
	 * Called when a value of has__External__Reference has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void has__External__ReferenceAdded(org.cdao.jastor.Node source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of has__External__Reference has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */	
	public void has__External__ReferenceRemoved(org.cdao.jastor.Node source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when a value of connects__to has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void connects__toAdded(org.cdao.jastor.Node source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of connects__to has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void connects__toRemoved(org.cdao.jastor.Node source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of has has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void hasAdded(org.cdao.jastor.Node source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of has has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void hasRemoved(org.cdao.jastor.Node source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of precedes has been added
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param newValue the object representing the new value
	 */	
	public void precedesAdded(org.cdao.jastor.Node source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of precedes has been removed
	 * @param source the affected instance of org.cdao.jasper.Node
	 * @param oldValue the object representing the removed value
	 */
	public void precedesRemoved(org.cdao.jastor.Node source, com.ibm.adtech.jastor.Thing oldValue);
		
}