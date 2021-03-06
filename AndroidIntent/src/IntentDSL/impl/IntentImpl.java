/**
 */
package IntentDSL.impl;

import IntentDSL.ExtraData;
import IntentDSL.Intent;
import IntentDSL.IntentDSLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IntentDSL.impl.IntentImpl#getExtraData <em>Extra Data</em>}</li>
 *   <li>{@link IntentDSL.impl.IntentImpl#getAction <em>Action</em>}</li>
 *   <li>{@link IntentDSL.impl.IntentImpl#getDataURI <em>Data URI</em>}</li>
 *   <li>{@link IntentDSL.impl.IntentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link IntentDSL.impl.IntentImpl#getReturnData <em>Return Data</em>}</li>
 *   <li>{@link IntentDSL.impl.IntentImpl#getType <em>Type</em>}</li>
 *   <li>{@link IntentDSL.impl.IntentImpl#getMetaCategory <em>Meta Category</em>}</li>
 *   <li>{@link IntentDSL.impl.IntentImpl#getPermission <em>Permission</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IntentImpl extends NamedInstanceImpl implements Intent {
	/**
	 * The cached value of the '{@link #getExtraData() <em>Extra Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraData()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtraData> extraData;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataURI() <em>Data URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataURI()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataURI() <em>Data URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataURI()
	 * @generated
	 * @ordered
	 */
	protected String dataURI = DATA_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnData() <em>Return Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnData()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtraData> returnData;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaCategory() <em>Meta Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String META_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaCategory() <em>Meta Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaCategory()
	 * @generated
	 * @ordered
	 */
	protected String metaCategory = META_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPermission() <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected String permission = PERMISSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentDSLPackage.Literals.INTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtraData> getExtraData() {
		if (extraData == null) {
			extraData = new EObjectContainmentEList<ExtraData>(ExtraData.class, this, IntentDSLPackage.INTENT__EXTRA_DATA);
		}
		return extraData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentDSLPackage.INTENT__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataURI() {
		return dataURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataURI(String newDataURI) {
		String oldDataURI = dataURI;
		dataURI = newDataURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentDSLPackage.INTENT__DATA_URI, oldDataURI, dataURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentDSLPackage.INTENT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtraData> getReturnData() {
		if (returnData == null) {
			returnData = new EObjectContainmentEList<ExtraData>(ExtraData.class, this, IntentDSLPackage.INTENT__RETURN_DATA);
		}
		return returnData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentDSLPackage.INTENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaCategory() {
		return metaCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaCategory(String newMetaCategory) {
		String oldMetaCategory = metaCategory;
		metaCategory = newMetaCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentDSLPackage.INTENT__META_CATEGORY, oldMetaCategory, metaCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPermission() {
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermission(String newPermission) {
		String oldPermission = permission;
		permission = newPermission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentDSLPackage.INTENT__PERMISSION, oldPermission, permission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntentDSLPackage.INTENT__EXTRA_DATA:
				return ((InternalEList<?>)getExtraData()).basicRemove(otherEnd, msgs);
			case IntentDSLPackage.INTENT__RETURN_DATA:
				return ((InternalEList<?>)getReturnData()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntentDSLPackage.INTENT__EXTRA_DATA:
				return getExtraData();
			case IntentDSLPackage.INTENT__ACTION:
				return getAction();
			case IntentDSLPackage.INTENT__DATA_URI:
				return getDataURI();
			case IntentDSLPackage.INTENT__CATEGORY:
				return getCategory();
			case IntentDSLPackage.INTENT__RETURN_DATA:
				return getReturnData();
			case IntentDSLPackage.INTENT__TYPE:
				return getType();
			case IntentDSLPackage.INTENT__META_CATEGORY:
				return getMetaCategory();
			case IntentDSLPackage.INTENT__PERMISSION:
				return getPermission();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntentDSLPackage.INTENT__EXTRA_DATA:
				getExtraData().clear();
				getExtraData().addAll((Collection<? extends ExtraData>)newValue);
				return;
			case IntentDSLPackage.INTENT__ACTION:
				setAction((String)newValue);
				return;
			case IntentDSLPackage.INTENT__DATA_URI:
				setDataURI((String)newValue);
				return;
			case IntentDSLPackage.INTENT__CATEGORY:
				setCategory((String)newValue);
				return;
			case IntentDSLPackage.INTENT__RETURN_DATA:
				getReturnData().clear();
				getReturnData().addAll((Collection<? extends ExtraData>)newValue);
				return;
			case IntentDSLPackage.INTENT__TYPE:
				setType((String)newValue);
				return;
			case IntentDSLPackage.INTENT__META_CATEGORY:
				setMetaCategory((String)newValue);
				return;
			case IntentDSLPackage.INTENT__PERMISSION:
				setPermission((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IntentDSLPackage.INTENT__EXTRA_DATA:
				getExtraData().clear();
				return;
			case IntentDSLPackage.INTENT__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case IntentDSLPackage.INTENT__DATA_URI:
				setDataURI(DATA_URI_EDEFAULT);
				return;
			case IntentDSLPackage.INTENT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case IntentDSLPackage.INTENT__RETURN_DATA:
				getReturnData().clear();
				return;
			case IntentDSLPackage.INTENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IntentDSLPackage.INTENT__META_CATEGORY:
				setMetaCategory(META_CATEGORY_EDEFAULT);
				return;
			case IntentDSLPackage.INTENT__PERMISSION:
				setPermission(PERMISSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IntentDSLPackage.INTENT__EXTRA_DATA:
				return extraData != null && !extraData.isEmpty();
			case IntentDSLPackage.INTENT__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case IntentDSLPackage.INTENT__DATA_URI:
				return DATA_URI_EDEFAULT == null ? dataURI != null : !DATA_URI_EDEFAULT.equals(dataURI);
			case IntentDSLPackage.INTENT__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case IntentDSLPackage.INTENT__RETURN_DATA:
				return returnData != null && !returnData.isEmpty();
			case IntentDSLPackage.INTENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case IntentDSLPackage.INTENT__META_CATEGORY:
				return META_CATEGORY_EDEFAULT == null ? metaCategory != null : !META_CATEGORY_EDEFAULT.equals(metaCategory);
			case IntentDSLPackage.INTENT__PERMISSION:
				return PERMISSION_EDEFAULT == null ? permission != null : !PERMISSION_EDEFAULT.equals(permission);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (action: ");
		result.append(action);
		result.append(", dataURI: ");
		result.append(dataURI);
		result.append(", category: ");
		result.append(category);
		result.append(", type: ");
		result.append(type);
		result.append(", metaCategory: ");
		result.append(metaCategory);
		result.append(", permission: ");
		result.append(permission);
		result.append(')');
		return result.toString();
	}

} //IntentImpl
