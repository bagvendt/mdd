/**
 */
package IntentDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IntentDSL.IntentModel#getIntents <em>Intents</em>}</li>
 * </ul>
 * </p>
 *
 * @see IntentDSL.IntentDSLPackage#getIntentModel()
 * @model
 * @generated
 */
public interface IntentModel extends NamedInstance {
	/**
	 * Returns the value of the '<em><b>Intents</b></em>' containment reference list.
	 * The list contents are of type {@link IntentDSL.Intent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intents</em>' containment reference list.
	 * @see IntentDSL.IntentDSLPackage#getIntentModel_Intents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Intent> getIntents();

} // IntentModel
