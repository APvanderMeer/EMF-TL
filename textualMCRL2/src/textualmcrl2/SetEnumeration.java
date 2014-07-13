/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.SetEnumeration#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getSetEnumeration()
 * @model
 * @generated
 */
public interface SetEnumeration extends Collection {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.DataExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getSetEnumeration_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataExpression> getElements();

} // SetEnumeration
