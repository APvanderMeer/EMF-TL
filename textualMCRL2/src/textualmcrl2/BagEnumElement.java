/**
 */
package textualmcrl2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bag Enum Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.BagEnumElement#getElement <em>Element</em>}</li>
 *   <li>{@link textualmcrl2.BagEnumElement#getQuantity <em>Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getBagEnumElement()
 * @model
 * @generated
 */
public interface BagEnumElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(DataExpression)
	 * @see textualmcrl2.Textualmcrl2Package#getBagEnumElement_Element()
	 * @model containment="true"
	 * @generated
	 */
	DataExpression getElement();

	/**
	 * Sets the value of the '{@link textualmcrl2.BagEnumElement#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(DataExpression value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(DataExpression)
	 * @see textualmcrl2.Textualmcrl2Package#getBagEnumElement_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	DataExpression getQuantity();

	/**
	 * Sets the value of the '{@link textualmcrl2.BagEnumElement#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(DataExpression value);

} // BagEnumElement
