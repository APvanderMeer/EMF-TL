/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.ENamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.ModelElementExpression#getBaseclass <em>Baseclass</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.ModelElementExpression#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getModelElementExpression()
 * @model
 * @generated
 */
public interface ModelElementExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Baseclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baseclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseclass</em>' reference.
	 * @see #setBaseclass(ENamedElement)
	 * @see org.emftext.language.textAML3.TextAML3Package#getModelElementExpression_Baseclass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ENamedElement getBaseclass();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.ModelElementExpression#getBaseclass <em>Baseclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baseclass</em>' reference.
	 * @see #getBaseclass()
	 * @generated
	 */
	void setBaseclass(ENamedElement value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.AttributeExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getModelElementExpression_Attributes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AttributeExpression> getAttributes();

} // ModelElementExpression
