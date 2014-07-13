/**
 */
package textualmcrl2.tests;

import junit.textui.TestRunner;

import textualmcrl2.BoundedInitialisation;
import textualmcrl2.Textualmcrl2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bounded Initialisation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoundedInitialisationTest extends CompositeActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoundedInitialisationTest.class);
	}

	/**
	 * Constructs a new Bounded Initialisation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedInitialisationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bounded Initialisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BoundedInitialisation getFixture() {
		return (BoundedInitialisation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Textualmcrl2Factory.eINSTANCE.createBoundedInitialisation());
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

} //BoundedInitialisationTest
