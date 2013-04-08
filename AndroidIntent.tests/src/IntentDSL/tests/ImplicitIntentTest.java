/**
 */
package IntentDSL.tests;

import IntentDSL.ImplicitIntent;
import IntentDSL.IntentDSLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Implicit Intent</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplicitIntentTest extends IntentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImplicitIntentTest.class);
	}

	/**
	 * Constructs a new Implicit Intent test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitIntentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Implicit Intent test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImplicitIntent getFixture() {
		return (ImplicitIntent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IntentDSLFactory.eINSTANCE.createImplicitIntent());
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

} //ImplicitIntentTest
