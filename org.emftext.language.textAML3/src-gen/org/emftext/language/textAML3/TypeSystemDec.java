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
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type System Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.TypeSystemDec#getTypevalues <em>Typevalues</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeSystemDec#getRulesystem <em>Rulesystem</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeSystemDec#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeSystemDec#getWidening <em>Widening</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeSystemDec#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeSystemDec#getBaseclass <em>Baseclass</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeSystemDec#getStrategytarget <em>Strategytarget</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.TypeSystemDec#getErrorrules <em>Errorrules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getTypeSystemDec()
 * @model
 * @generated
 */
public interface TypeSystemDec extends EObject {
	/**
	 * Returns the value of the '<em><b>Typevalues</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.TypeDec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typevalues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typevalues</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeSystemDec_Typevalues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TypeDec> getTypevalues();

	/**
	 * Returns the value of the '<em><b>Rulesystem</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.TypeRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rulesystem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rulesystem</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeSystemDec_Rulesystem()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TypeRule> getRulesystem();

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeSystemDec_Strategy()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Relation> getStrategy();

	/**
	 * Returns the value of the '<em><b>Widening</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widening</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widening</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeSystemDec_Widening()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Relation> getWidening();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.PackageElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeSystemDec_Packages()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageElement> getPackages();

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
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeSystemDec_Baseclass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EClass getBaseclass();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.TypeSystemDec#getBaseclass <em>Baseclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baseclass</em>' reference.
	 * @see #getBaseclass()
	 * @generated
	 */
	void setBaseclass(EClass value);

	/**
	 * Returns the value of the '<em><b>Strategytarget</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategytarget</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategytarget</em>' reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeSystemDec_Strategytarget()
	 * @model
	 * @generated
	 */
	EList<EStructuralFeature> getStrategytarget();

	/**
	 * Returns the value of the '<em><b>Errorrules</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.ErrorRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errorrules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errorrules</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getTypeSystemDec_Errorrules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorRule> getErrorrules();

} // TypeSystemDec
