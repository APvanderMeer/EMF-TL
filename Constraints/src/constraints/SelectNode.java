/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package constraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link constraints.SelectNode#getFeature <em>Feature</em>}</li>
 *   <li>{@link constraints.SelectNode#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see constraints.ConstraintsPackage#getSelectNode()
 * @model
 * @generated
 */
public interface SelectNode extends Node {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see constraints.ConstraintsPackage#getSelectNode_Feature()
	 * @model required="true"
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link constraints.SelectNode#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(Variable)
	 * @see constraints.ConstraintsPackage#getSelectNode_Object()
	 * @model required="true"
	 * @generated
	 */
	Variable getObject();

	/**
	 * Sets the value of the '{@link constraints.SelectNode#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Variable value);

} // SelectNode
