/**
 */
package IntentDSL.tests;

import IntentDSL.IntentDSLFactory;
import IntentDSL.IntentModel;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intent Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentModelTest extends NamedInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntentModelTest.class);
	}

	/**
	 * Constructs a new Intent Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Intent Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntentModel getFixture() {
		return (IntentModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IntentDSLFactory.eINSTANCE.createIntentModel());
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

} //IntentModelTest
