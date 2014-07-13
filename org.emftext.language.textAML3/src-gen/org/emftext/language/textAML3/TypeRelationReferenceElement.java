/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Relation Reference Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.TypeRelationReferenceElement#getTypeattribute <em>Typeattribute</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeRelationReferenceElement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRelationReferenceElement()
 * @model
 * @generated
 */
public interface TypeRelationReferenceElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Typeattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typeattribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typeattribute</em>' reference.
	 * @see #setTypeattribute(TypeAttribute)
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRelationReferenceElement_Typeattribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TypeAttribute getTypeattribute();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.TypeRelationReferenceElement#getTypeattribute <em>Typeattribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeattribute</em>' reference.
	 * @see #getTypeattribute()
	 * @generated
	 */
	void setTypeattribute(TypeAttribute value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Variable)
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRelationReferenceElement_Value()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Variable getValue();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.TypeRelationReferenceElement#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Variable value);

} // TypeRelationReferenceElement
