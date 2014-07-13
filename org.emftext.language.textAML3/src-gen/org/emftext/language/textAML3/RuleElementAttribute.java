/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Element Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.RuleElementAttribute#getMyattribute <em>Myattribute</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.RuleElementAttribute#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getRuleElementAttribute()
 * @model
 * @generated
 */
public interface RuleElementAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Myattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Myattribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Myattribute</em>' reference.
	 * @see #setMyattribute(EStructuralFeature)
	 * @see org.emftext.language.textAML3.TextAML3Package#getRuleElementAttribute_Myattribute()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getMyattribute();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.RuleElementAttribute#getMyattribute <em>Myattribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Myattribute</em>' reference.
	 * @see #getMyattribute()
	 * @generated
	 */
	void setMyattribute(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see org.emftext.language.textAML3.TextAML3Package#getRuleElementAttribute_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.RuleElementAttribute#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // RuleElementAttribute
