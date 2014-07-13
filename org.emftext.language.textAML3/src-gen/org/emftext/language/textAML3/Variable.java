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
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.Variable#getVarname <em>Varname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Varname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varname</em>' attribute.
	 * @see #setVarname(String)
	 * @see org.emftext.language.textAML3.TextAML3Package#getVariable_Varname()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getVarname();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.Variable#getVarname <em>Varname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varname</em>' attribute.
	 * @see #getVarname()
	 * @generated
	 */
	void setVarname(String value);

} // Variable
