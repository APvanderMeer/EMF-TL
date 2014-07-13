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
 * A representation of the model object '<em><b>Type Relation Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.TypeRelationReference#getTarget <em>Target</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeRelationReference#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRelationReference()
 * @model
 * @generated
 */
public interface TypeRelationReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TypeDec)
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRelationReference_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TypeDec getTarget();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.TypeRelationReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TypeDec value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.TypeRelationReferenceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeRelationReference_Arguments()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TypeRelationReferenceElement> getArguments();

} // TypeRelationReference
