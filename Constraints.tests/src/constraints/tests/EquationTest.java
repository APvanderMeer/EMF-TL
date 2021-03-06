/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package constraints.tests;

import constraints.ConstraintsFactory;
import constraints.Equation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Equation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EquationTest extends PositionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EquationTest.class);
	}

	/**
	 * Constructs a new Equation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Equation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Equation getFixture() {
		return (Equation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConstraintsFactory.eINSTANCE.createEquation());
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

} //EquationTest
