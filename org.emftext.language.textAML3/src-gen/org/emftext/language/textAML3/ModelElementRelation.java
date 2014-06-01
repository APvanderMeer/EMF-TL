/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.ModelElementRelation#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.ModelElementRelation#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getModelElementRelation()
 * @model
 * @generated
 */
public interface ModelElementRelation extends Relation {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(RuleElementExpression)
	 * @see org.emftext.language.textAML3.TextAML3Package#getModelElementRelation_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RuleElementExpression getLhs();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.ModelElementRelation#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(RuleElementExpression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(RuleElementExpression)
	 * @see org.emftext.language.textAML3.TextAML3Package#getModelElementRelation_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RuleElementExpression getRhs();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.ModelElementRelation#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(RuleElementExpression value);

} // ModelElementRelation
