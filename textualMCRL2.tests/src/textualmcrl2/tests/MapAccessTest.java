/**
 */
package textualmcrl2.tests;

import junit.textui.TestRunner;

import textualmcrl2.MapAccess;
import textualmcrl2.Textualmcrl2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Map Access</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapAccessTest extends DataExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MapAccessTest.class);
	}

	/**
	 * Constructs a new Map Access test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapAccessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Map Access test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MapAccess getFixture() {
		return (MapAccess)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Textualmcrl2Factory.eINSTANCE.createMapAccess());
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

} //MapAccessTest
