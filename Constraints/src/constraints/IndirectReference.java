/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package constraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indirect Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link constraints.IndirectReference#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see constraints.ConstraintsPackage#getIndirectReference()
 * @model
 * @generated
 */
public interface IndirectReference extends Node {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Element)
	 * @see constraints.ConstraintsPackage#getIndirectReference_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Element getExpression();

	/**
	 * Sets the value of the '{@link constraints.IndirectReference#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Element value);

} // IndirectReference
