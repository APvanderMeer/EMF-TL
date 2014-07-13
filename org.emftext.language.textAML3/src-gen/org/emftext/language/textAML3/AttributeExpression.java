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
 * A representation of the model object '<em><b>Attribute Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.AttributeExpression#getMyattribute <em>Myattribute</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.AttributeExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getAttributeExpression()
 * @model
 * @generated
 */
public interface AttributeExpression extends EObject {
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
	 * @see org.emftext.language.textAML3.TextAML3Package#getAttributeExpression_Myattribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EStructuralFeature getMyattribute();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.AttributeExpression#getMyattribute <em>Myattribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Myattribute</em>' reference.
	 * @see #getMyattribute()
	 * @generated
	 */
	void setMyattribute(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see org.emftext.language.textAML3.TextAML3Package#getAttributeExpression_Value()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.AttributeExpression#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // AttributeExpression
