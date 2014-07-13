/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package constraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link constraints.UnaryNode#getLeft <em>Left</em>}</li>
 *   <li>{@link constraints.UnaryNode#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see constraints.ConstraintsPackage#getUnaryNode()
 * @model
 * @generated
 */
public interface UnaryNode extends Node {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Element)
	 * @see constraints.ConstraintsPackage#getUnaryNode_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Element getLeft();

	/**
	 * Sets the value of the '{@link constraints.UnaryNode#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Element value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link constraints.UnOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see constraints.UnOp
	 * @see #setOperator(UnOp)
	 * @see constraints.ConstraintsPackage#getUnaryNode_Operator()
	 * @model required="true"
	 * @generated
	 */
	UnOp getOperator();

	/**
	 * Sets the value of the '{@link constraints.UnaryNode#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see constraints.UnOp
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnOp value);

} // UnaryNode
