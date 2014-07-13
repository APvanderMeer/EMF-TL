/**
 */
package textualmcrl2.tests;

import junit.textui.TestRunner;

import textualmcrl2.MultiAction;
import textualmcrl2.Textualmcrl2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multi Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiActionTest extends ConstraintElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultiActionTest.class);
	}

	/**
	 * Constructs a new Multi Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multi Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MultiAction getFixture() {
		return (MultiAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Textualmcrl2Factory.eINSTANCE.createMultiAction());
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

} //MultiActionTest
