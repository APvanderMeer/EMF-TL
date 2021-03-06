/**
 */
package textualmcrl2.tests;

import junit.textui.TestRunner;

import textualmcrl2.Projection;
import textualmcrl2.Textualmcrl2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Projection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectionTest extends NameableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProjectionTest.class);
	}

	/**
	 * Constructs a new Projection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Projection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Projection getFixture() {
		return (Projection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Textualmcrl2Factory.eINSTANCE.createProjection());
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

} //ProjectionTest
