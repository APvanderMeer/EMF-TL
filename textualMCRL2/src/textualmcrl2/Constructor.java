/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Constructor#getProjections <em>Projections</em>}</li>
 *   <li>{@link textualmcrl2.Constructor#getDiscriminator <em>Discriminator</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getConstructor()
 * @model
 * @generated
 */
public interface Constructor extends Nameable {
	/**
	 * Returns the value of the '<em><b>Projections</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.Projection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projections</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getConstructor_Projections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Projection> getProjections();

	/**
	 * Returns the value of the '<em><b>Discriminator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator</em>' attribute.
	 * @see #setDiscriminator(String)
	 * @see textualmcrl2.Textualmcrl2Package#getConstructor_Discriminator()
	 * @model
	 * @generated
	 */
	String getDiscriminator();

	/**
	 * Sets the value of the '{@link textualmcrl2.Constructor#getDiscriminator <em>Discriminator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator</em>' attribute.
	 * @see #getDiscriminator()
	 * @generated
	 */
	void setDiscriminator(String value);

} // Constructor
