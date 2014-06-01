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
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.ModelElement#getTargetclass <em>Targetclass</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.ModelElement#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.ModelElement#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getModelElement()
 * @model
 * @generated
 */
public interface ModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Targetclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetclass</em>' reference.
	 * @see #setTargetclass(EClass)
	 * @see org.emftext.language.textAML3.TextAML3Package#getModelElement_Targetclass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EClass getTargetclass();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.ModelElement#getTargetclass <em>Targetclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetclass</em>' reference.
	 * @see #getTargetclass()
	 * @generated
	 */
	void setTargetclass(EClass value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getModelElement_Attributes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EStructuralFeature> getAttributes();

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftext.language.textAML3.ModelElementConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' attribute.
	 * @see org.emftext.language.textAML3.ModelElementConnection
	 * @see #setRelation(ModelElementConnection)
	 * @see org.emftext.language.textAML3.TextAML3Package#getModelElement_Relation()
	 * @model required="true"
	 * @generated
	 */
	ModelElementConnection getRelation();

	/**
	 * Sets the value of the '{@link org.emftext.language.textAML3.ModelElement#getRelation <em>Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' attribute.
	 * @see org.emftext.language.textAML3.ModelElementConnection
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(ModelElementConnection value);

} // ModelElement
