/**
 */
package IntentDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IntentDSL.Intent#getExtraData <em>Extra Data</em>}</li>
 *   <li>{@link IntentDSL.Intent#getAction <em>Action</em>}</li>
 *   <li>{@link IntentDSL.Intent#getDataURI <em>Data URI</em>}</li>
 *   <li>{@link IntentDSL.Intent#getCategory <em>Category</em>}</li>
 *   <li>{@link IntentDSL.Intent#getReturnData <em>Return Data</em>}</li>
 *   <li>{@link IntentDSL.Intent#getType <em>Type</em>}</li>
 *   <li>{@link IntentDSL.Intent#getMetaCategory <em>Meta Category</em>}</li>
 *   <li>{@link IntentDSL.Intent#getPermission <em>Permission</em>}</li>
 * </ul>
 * </p>
 *
 * @see IntentDSL.IntentDSLPackage#getIntent()
 * @model abstract="true"
 * @generated
 */
public interface Intent extends NamedInstance {
	/**
	 * Returns the value of the '<em><b>Extra Data</b></em>' containment reference list.
	 * The list contents are of type {@link IntentDSL.ExtraData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Data</em>' containment reference list.
	 * @see IntentDSL.IntentDSLPackage#getIntent_ExtraData()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtraData> getExtraData();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see IntentDSL.IntentDSLPackage#getIntent_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link IntentDSL.Intent#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Data URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data URI</em>' attribute.
	 * @see #setDataURI(String)
	 * @see IntentDSL.IntentDSLPackage#getIntent_DataURI()
	 * @model
	 * @generated
	 */
	String getDataURI();

	/**
	 * Sets the value of the '{@link IntentDSL.Intent#getDataURI <em>Data URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data URI</em>' attribute.
	 * @see #getDataURI()
	 * @generated
	 */
	void setDataURI(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see IntentDSL.IntentDSLPackage#getIntent_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link IntentDSL.Intent#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Return Data</b></em>' containment reference list.
	 * The list contents are of type {@link IntentDSL.ExtraData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Data</em>' containment reference list.
	 * @see IntentDSL.IntentDSLPackage#getIntent_ReturnData()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtraData> getReturnData();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see IntentDSL.IntentDSLPackage#getIntent_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link IntentDSL.Intent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Meta Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Category</em>' attribute.
	 * @see #setMetaCategory(String)
	 * @see IntentDSL.IntentDSLPackage#getIntent_MetaCategory()
	 * @model
	 * @generated
	 */
	String getMetaCategory();

	/**
	 * Sets the value of the '{@link IntentDSL.Intent#getMetaCategory <em>Meta Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Category</em>' attribute.
	 * @see #getMetaCategory()
	 * @generated
	 */
	void setMetaCategory(String value);

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' attribute.
	 * @see #setPermission(String)
	 * @see IntentDSL.IntentDSLPackage#getIntent_Permission()
	 * @model
	 * @generated
	 */
	String getPermission();

	/**
	 * Sets the value of the '{@link IntentDSL.Intent#getPermission <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' attribute.
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(String value);

} // Intent
