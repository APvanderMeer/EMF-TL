/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Element Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.RuleElementExpression#getBaseclass <em>Baseclass</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.RuleElementExpression#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getRuleElementExpression()
 * @model
 * @generated
 */
public interface RuleElementExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Baseclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baseclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseclass</em>' reference.
	 * @see #setBaseclass(EClass)
	 * @see org.emftext.language.textAML3.TextAML3Package#getRuleElementExpression_Baseclass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EClass getBaseclass();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.RuleElementExpression#getBaseclass <em>Baseclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baseclass</em>' reference.
	 * @see #getBaseclass()
	 * @generated
	 */
	void setBaseclass(EClass value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.RuleElementAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getRuleElementExpression_Attributes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RuleElementAttribute> getAttributes();

} // RuleElementExpression
