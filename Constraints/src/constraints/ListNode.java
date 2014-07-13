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
 * A representation of the model object '<em><b>List Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link constraints.ListNode#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see constraints.ConstraintsPackage#getListNode()
 * @model
 * @generated
 */
public interface ListNode extends Node {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link constraints.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see constraints.ConstraintsPackage#getListNode_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getValues();

} // ListNode
