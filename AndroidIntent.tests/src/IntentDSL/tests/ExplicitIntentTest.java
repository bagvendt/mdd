/**
 */
package IntentDSL.tests;

import IntentDSL.ExplicitIntent;
import IntentDSL.IntentDSLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Explicit Intent</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExplicitIntentTest extends IntentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExplicitIntentTest.class);
	}

	/**
	 * Constructs a new Explicit Intent test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitIntentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Explicit Intent test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExplicitIntent getFixture() {
		return (ExplicitIntent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IntentDSLFactory.eINSTANCE.createExplicitIntent());
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

} //ExplicitIntentTest
