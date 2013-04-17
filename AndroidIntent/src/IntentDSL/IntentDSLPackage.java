/**
 */
package IntentDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see IntentDSL.IntentDSLFactory
 * @model kind="package"
 * @generated
 */
public interface IntentDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IntentDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/AndroidIntent/model/Intent.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntentDSLPackage eINSTANCE = IntentDSL.impl.IntentDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link IntentDSL.impl.NamedInstanceImpl <em>Named Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IntentDSL.impl.NamedInstanceImpl
	 * @see IntentDSL.impl.IntentDSLPackageImpl#getNamedInstance()
	 * @generated
	 */
	int NAMED_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INSTANCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link IntentDSL.impl.IntentModelImpl <em>Intent Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IntentDSL.impl.IntentModelImpl
	 * @see IntentDSL.impl.IntentDSLPackageImpl#getIntentModel()
	 * @generated
	 */
	int INTENT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_MODEL__NAME = NAMED_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Intents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_MODEL__INTENTS = NAMED_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intent Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_MODEL_FEATURE_COUNT = NAMED_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link IntentDSL.impl.IntentImpl <em>Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IntentDSL.impl.IntentImpl
	 * @see IntentDSL.impl.IntentDSLPackageImpl#getIntent()
	 * @generated
	 */
	int INTENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__NAME = NAMED_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Extra Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__EXTRA_DATA = NAMED_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__ACTION = NAMED_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__DATA_URI = NAMED_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__CATEGORY = NAMED_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__RETURN_DATA = NAMED_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__TYPE = NAMED_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Meta Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__META_CATEGORY = NAMED_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_FEATURE_COUNT = NAMED_INSTANCE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link IntentDSL.impl.ExtraDataImpl <em>Extra Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IntentDSL.impl.ExtraDataImpl
	 * @see IntentDSL.impl.IntentDSLPackageImpl#getExtraData()
	 * @generated
	 */
	int EXTRA_DATA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_DATA__NAME = NAMED_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_DATA__TYPE = NAMED_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extra Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_DATA_FEATURE_COUNT = NAMED_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link IntentDSL.impl.ImplicitIntentImpl <em>Implicit Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IntentDSL.impl.ImplicitIntentImpl
	 * @see IntentDSL.impl.IntentDSLPackageImpl#getImplicitIntent()
	 * @generated
	 */
	int IMPLICIT_INTENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__NAME = INTENT__NAME;

	/**
	 * The feature id for the '<em><b>Extra Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__EXTRA_DATA = INTENT__EXTRA_DATA;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__ACTION = INTENT__ACTION;

	/**
	 * The feature id for the '<em><b>Data URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__DATA_URI = INTENT__DATA_URI;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__CATEGORY = INTENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Return Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__RETURN_DATA = INTENT__RETURN_DATA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__TYPE = INTENT__TYPE;

	/**
	 * The feature id for the '<em><b>Meta Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT__META_CATEGORY = INTENT__META_CATEGORY;

	/**
	 * The number of structural features of the '<em>Implicit Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_INTENT_FEATURE_COUNT = INTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link IntentDSL.impl.BroadCastIntentImpl <em>Broad Cast Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IntentDSL.impl.BroadCastIntentImpl
	 * @see IntentDSL.impl.IntentDSLPackageImpl#getBroadCastIntent()
	 * @generated
	 */
	int BROAD_CAST_INTENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROAD_CAST_INTENT__NAME = INTENT__NAME;

	/**
	 * The feature id for the '<em><b>Extra Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROAD_CAST_INTENT__EXTRA_DATA = INTENT__EXTRA_DATA;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROAD_CAST_INTENT__ACTION = INTENT__ACTION;

	/**
	 * The feature id for the '<em><b>Data URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROAD_CAST_INTENT__DATA_URI = INTENT__DATA_URI;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROAD_CAST_INTENT__CATEGORY = INTENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Return Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROAD_CAST_INTENT__RETURN_DATA = INTENT__RETURN_DATA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROAD_CAST_INTENT__TYPE = INTENT__TYPE;

	/**
	 * The feature id for the '<em><b>Meta Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROAD_CAST_INTENT__META_CATEGORY = INTENT__META_CATEGORY;

	/**
	 * The number of structural features of the '<em>Broad Cast Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROAD_CAST_INTENT_FEATURE_COUNT = INTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link IntentDSL.impl.ExplicitIntentImpl <em>Explicit Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IntentDSL.impl.ExplicitIntentImpl
	 * @see IntentDSL.impl.IntentDSLPackageImpl#getExplicitIntent()
	 * @generated
	 */
	int EXPLICIT_INTENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__NAME = INTENT__NAME;

	/**
	 * The feature id for the '<em><b>Extra Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__EXTRA_DATA = INTENT__EXTRA_DATA;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__ACTION = INTENT__ACTION;

	/**
	 * The feature id for the '<em><b>Data URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__DATA_URI = INTENT__DATA_URI;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__CATEGORY = INTENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Return Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__RETURN_DATA = INTENT__RETURN_DATA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__TYPE = INTENT__TYPE;

	/**
	 * The feature id for the '<em><b>Meta Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT__META_CATEGORY = INTENT__META_CATEGORY;

	/**
	 * The number of structural features of the '<em>Explicit Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_INTENT_FEATURE_COUNT = INTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link IntentDSL.impl.ServiceIntentImpl <em>Service Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IntentDSL.impl.ServiceIntentImpl
	 * @see IntentDSL.impl.IntentDSLPackageImpl#getServiceIntent()
	 * @generated
	 */
	int SERVICE_INTENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTENT__NAME = INTENT__NAME;

	/**
	 * The feature id for the '<em><b>Extra Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTENT__EXTRA_DATA = INTENT__EXTRA_DATA;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTENT__ACTION = INTENT__ACTION;

	/**
	 * The feature id for the '<em><b>Data URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTENT__DATA_URI = INTENT__DATA_URI;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTENT__CATEGORY = INTENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Return Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTENT__RETURN_DATA = INTENT__RETURN_DATA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTENT__TYPE = INTENT__TYPE;

	/**
	 * The feature id for the '<em><b>Meta Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTENT__META_CATEGORY = INTENT__META_CATEGORY;

	/**
	 * The number of structural features of the '<em>Service Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTENT_FEATURE_COUNT = INTENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link IntentDSL.SimpleTypeEnum <em>Simple Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IntentDSL.SimpleTypeEnum
	 * @see IntentDSL.impl.IntentDSLPackageImpl#getSimpleTypeEnum()
	 * @generated
	 */
	int SIMPLE_TYPE_ENUM = 8;

	/**
	 * Returns the meta object for class '{@link IntentDSL.IntentModel <em>Intent Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Model</em>'.
	 * @see IntentDSL.IntentModel
	 * @generated
	 */
	EClass getIntentModel();

	/**
	 * Returns the meta object for the containment reference list '{@link IntentDSL.IntentModel#getIntents <em>Intents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intents</em>'.
	 * @see IntentDSL.IntentModel#getIntents()
	 * @see #getIntentModel()
	 * @generated
	 */
	EReference getIntentModel_Intents();

	/**
	 * Returns the meta object for class '{@link IntentDSL.Intent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent</em>'.
	 * @see IntentDSL.Intent
	 * @generated
	 */
	EClass getIntent();

	/**
	 * Returns the meta object for the containment reference list '{@link IntentDSL.Intent#getExtraData <em>Extra Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extra Data</em>'.
	 * @see IntentDSL.Intent#getExtraData()
	 * @see #getIntent()
	 * @generated
	 */
	EReference getIntent_ExtraData();

	/**
	 * Returns the meta object for the attribute '{@link IntentDSL.Intent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see IntentDSL.Intent#getAction()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_Action();

	/**
	 * Returns the meta object for the attribute '{@link IntentDSL.Intent#getDataURI <em>Data URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data URI</em>'.
	 * @see IntentDSL.Intent#getDataURI()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_DataURI();

	/**
	 * Returns the meta object for the attribute '{@link IntentDSL.Intent#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see IntentDSL.Intent#getCategory()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link IntentDSL.Intent#getReturnData <em>Return Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Data</em>'.
	 * @see IntentDSL.Intent#getReturnData()
	 * @see #getIntent()
	 * @generated
	 */
	EReference getIntent_ReturnData();

	/**
	 * Returns the meta object for the attribute '{@link IntentDSL.Intent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see IntentDSL.Intent#getType()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_Type();

	/**
	 * Returns the meta object for the attribute '{@link IntentDSL.Intent#getMetaCategory <em>Meta Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Category</em>'.
	 * @see IntentDSL.Intent#getMetaCategory()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_MetaCategory();

	/**
	 * Returns the meta object for class '{@link IntentDSL.ExtraData <em>Extra Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra Data</em>'.
	 * @see IntentDSL.ExtraData
	 * @generated
	 */
	EClass getExtraData();

	/**
	 * Returns the meta object for the attribute '{@link IntentDSL.ExtraData#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see IntentDSL.ExtraData#getType()
	 * @see #getExtraData()
	 * @generated
	 */
	EAttribute getExtraData_Type();

	/**
	 * Returns the meta object for class '{@link IntentDSL.ImplicitIntent <em>Implicit Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Intent</em>'.
	 * @see IntentDSL.ImplicitIntent
	 * @generated
	 */
	EClass getImplicitIntent();

	/**
	 * Returns the meta object for class '{@link IntentDSL.BroadCastIntent <em>Broad Cast Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broad Cast Intent</em>'.
	 * @see IntentDSL.BroadCastIntent
	 * @generated
	 */
	EClass getBroadCastIntent();

	/**
	 * Returns the meta object for class '{@link IntentDSL.ExplicitIntent <em>Explicit Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explicit Intent</em>'.
	 * @see IntentDSL.ExplicitIntent
	 * @generated
	 */
	EClass getExplicitIntent();

	/**
	 * Returns the meta object for class '{@link IntentDSL.ServiceIntent <em>Service Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Intent</em>'.
	 * @see IntentDSL.ServiceIntent
	 * @generated
	 */
	EClass getServiceIntent();

	/**
	 * Returns the meta object for class '{@link IntentDSL.NamedInstance <em>Named Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Instance</em>'.
	 * @see IntentDSL.NamedInstance
	 * @generated
	 */
	EClass getNamedInstance();

	/**
	 * Returns the meta object for the attribute '{@link IntentDSL.NamedInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see IntentDSL.NamedInstance#getName()
	 * @see #getNamedInstance()
	 * @generated
	 */
	EAttribute getNamedInstance_Name();

	/**
	 * Returns the meta object for enum '{@link IntentDSL.SimpleTypeEnum <em>Simple Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Type Enum</em>'.
	 * @see IntentDSL.SimpleTypeEnum
	 * @generated
	 */
	EEnum getSimpleTypeEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntentDSLFactory getIntentDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link IntentDSL.impl.IntentModelImpl <em>Intent Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IntentDSL.impl.IntentModelImpl
		 * @see IntentDSL.impl.IntentDSLPackageImpl#getIntentModel()
		 * @generated
		 */
		EClass INTENT_MODEL = eINSTANCE.getIntentModel();

		/**
		 * The meta object literal for the '<em><b>Intents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_MODEL__INTENTS = eINSTANCE.getIntentModel_Intents();

		/**
		 * The meta object literal for the '{@link IntentDSL.impl.IntentImpl <em>Intent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IntentDSL.impl.IntentImpl
		 * @see IntentDSL.impl.IntentDSLPackageImpl#getIntent()
		 * @generated
		 */
		EClass INTENT = eINSTANCE.getIntent();

		/**
		 * The meta object literal for the '<em><b>Extra Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT__EXTRA_DATA = eINSTANCE.getIntent_ExtraData();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__ACTION = eINSTANCE.getIntent_Action();

		/**
		 * The meta object literal for the '<em><b>Data URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__DATA_URI = eINSTANCE.getIntent_DataURI();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__CATEGORY = eINSTANCE.getIntent_Category();

		/**
		 * The meta object literal for the '<em><b>Return Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT__RETURN_DATA = eINSTANCE.getIntent_ReturnData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__TYPE = eINSTANCE.getIntent_Type();

		/**
		 * The meta object literal for the '<em><b>Meta Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__META_CATEGORY = eINSTANCE.getIntent_MetaCategory();

		/**
		 * The meta object literal for the '{@link IntentDSL.impl.ExtraDataImpl <em>Extra Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IntentDSL.impl.ExtraDataImpl
		 * @see IntentDSL.impl.IntentDSLPackageImpl#getExtraData()
		 * @generated
		 */
		EClass EXTRA_DATA = eINSTANCE.getExtraData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_DATA__TYPE = eINSTANCE.getExtraData_Type();

		/**
		 * The meta object literal for the '{@link IntentDSL.impl.ImplicitIntentImpl <em>Implicit Intent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IntentDSL.impl.ImplicitIntentImpl
		 * @see IntentDSL.impl.IntentDSLPackageImpl#getImplicitIntent()
		 * @generated
		 */
		EClass IMPLICIT_INTENT = eINSTANCE.getImplicitIntent();

		/**
		 * The meta object literal for the '{@link IntentDSL.impl.BroadCastIntentImpl <em>Broad Cast Intent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IntentDSL.impl.BroadCastIntentImpl
		 * @see IntentDSL.impl.IntentDSLPackageImpl#getBroadCastIntent()
		 * @generated
		 */
		EClass BROAD_CAST_INTENT = eINSTANCE.getBroadCastIntent();

		/**
		 * The meta object literal for the '{@link IntentDSL.impl.ExplicitIntentImpl <em>Explicit Intent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IntentDSL.impl.ExplicitIntentImpl
		 * @see IntentDSL.impl.IntentDSLPackageImpl#getExplicitIntent()
		 * @generated
		 */
		EClass EXPLICIT_INTENT = eINSTANCE.getExplicitIntent();

		/**
		 * The meta object literal for the '{@link IntentDSL.impl.ServiceIntentImpl <em>Service Intent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IntentDSL.impl.ServiceIntentImpl
		 * @see IntentDSL.impl.IntentDSLPackageImpl#getServiceIntent()
		 * @generated
		 */
		EClass SERVICE_INTENT = eINSTANCE.getServiceIntent();

		/**
		 * The meta object literal for the '{@link IntentDSL.impl.NamedInstanceImpl <em>Named Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IntentDSL.impl.NamedInstanceImpl
		 * @see IntentDSL.impl.IntentDSLPackageImpl#getNamedInstance()
		 * @generated
		 */
		EClass NAMED_INSTANCE = eINSTANCE.getNamedInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_INSTANCE__NAME = eINSTANCE.getNamedInstance_Name();

		/**
		 * The meta object literal for the '{@link IntentDSL.SimpleTypeEnum <em>Simple Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IntentDSL.SimpleTypeEnum
		 * @see IntentDSL.impl.IntentDSLPackageImpl#getSimpleTypeEnum()
		 * @generated
		 */
		EEnum SIMPLE_TYPE_ENUM = eINSTANCE.getSimpleTypeEnum();

	}

} //IntentDSLPackage
