/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package constraints;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link constraints.ObjectNode#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see constraints.ConstraintsPackage#getObjectNode()
 * @model
 * @generated
 */
public interface ObjectNode extends Node {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link constraints.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see constraints.ConstraintsPackage#getObjectNode_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // ObjectNode
