/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.TypeRule#getSource <em>Source</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeRule#getTarget <em>Target</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeRule#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeRule#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeRule#getContainments <em>Containments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRule()
 * @model
 * @generated
 */
public interface TypeRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(RuleElementExpression)
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRule_Source()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RuleElementExpression getSource();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.TypeRule#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(RuleElementExpression value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(RuleElementExpression)
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRule_Target()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RuleElementExpression getTarget();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.TypeRule#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(RuleElementExpression value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRule_Variables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRule_Conditions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Containments</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.ContainmentVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containments</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRule_Containments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainmentVariable> getContainments();

} // TypeRule
