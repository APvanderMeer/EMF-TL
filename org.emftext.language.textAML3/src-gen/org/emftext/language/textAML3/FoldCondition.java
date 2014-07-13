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
 * A representation of the model object '<em><b>Fold Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.FoldCondition#getGenerator <em>Generator</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.FoldCondition#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.textAML3.TextAML3Package#getFoldCondition()
 * @model
 * @generated
 */
public interface FoldCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Generator</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.Generator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getFoldCondition_Generator()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Generator> getGenerator();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.textAML3.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.emftext.language.textAML3.TextAML3Package#getFoldCondition_Condition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Condition> getCondition();

} // FoldCondition
