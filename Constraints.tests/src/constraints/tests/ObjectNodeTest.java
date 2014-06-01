/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package constraints.tests;

import constraints.ConstraintsFactory;
import constraints.ObjectNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectNodeTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectNodeTest.class);
	}

	/**
	 * Constructs a new Object Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Object Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ObjectNode getFixture() {
		return (ObjectNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConstraintsFactory.eINSTANCE.createObjectNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ObjectNodeTest
