/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.TypeRelation#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeRelation#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRelation()
 * @model
 * @generated
 */
public interface TypeRelation extends Relation {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(TypeRelationReference)
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRelation_Lhs()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TypeRelationReference getLhs();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.TypeRelation#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(TypeRelationReference value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(TypeRelationReference)
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRelation_Rhs()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TypeRelationReference getRhs();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.TypeRelation#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(TypeRelationReference value);

} // TypeRelation
