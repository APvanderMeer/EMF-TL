/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Rename#getChild <em>Child</em>}</li>
 *   <li>{@link textualmcrl2.Rename#getRenamings <em>Renamings</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getRename()
 * @model
 * @generated
 */
public interface Rename extends ProcessExpr {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(ProcessExpr)
	 * @see textualmcrl2.Textualmcrl2Package#getRename_Child()
	 * @model containment="true"
	 * @generated
	 */
	ProcessExpr getChild();

	/**
	 * Sets the value of the '{@link textualmcrl2.Rename#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(ProcessExpr value);

	/**
	 * Returns the value of the '<em><b>Renamings</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.Renaming}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renamings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renamings</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getRename_Renamings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Renaming> getRenamings();

} // Rename
