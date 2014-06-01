/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.TypeReference#getTarget <em>Target</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeReference#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends Expression {
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
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeReference_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TypeDec getTarget();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.TypeReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TypeDec value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.TypeReferenceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeReference_Arguments()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TypeReferenceElement> getArguments();

} // TypeReference
