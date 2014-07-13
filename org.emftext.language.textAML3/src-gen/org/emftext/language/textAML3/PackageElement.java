/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.PackageElement#getTargetpackage <em>Targetpackage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getPackageElement()
 * @model
 * @generated
 */
public interface PackageElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Targetpackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetpackage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetpackage</em>' reference.
	 * @see #setTargetpackage(EPackage)
	 * @see org.emftext.language.textAML3.TextAML3Package#getPackageElement_Targetpackage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EPackage getTargetpackage();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.PackageElement#getTargetpackage <em>Targetpackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetpackage</em>' reference.
	 * @see #getTargetpackage()
	 * @generated
	 */
	void setTargetpackage(EPackage value);

} // PackageElement
