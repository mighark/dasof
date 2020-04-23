/**
 */
package centroscomerciales.impl;

import centroscomerciales.CentroscomercialesPackage;
import centroscomerciales.ElementoAforo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elemento Aforo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.impl.ElementoAforoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link centroscomerciales.impl.ElementoAforoImpl#getAforo <em>Aforo</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementoAforoImpl extends ElementoImpl implements ElementoAforo {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAforo() <em>Aforo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAforo()
	 * @generated
	 * @ordered
	 */
	protected static final int AFORO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAforo() <em>Aforo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAforo()
	 * @generated
	 * @ordered
	 */
	protected int aforo = AFORO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementoAforoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CentroscomercialesPackage.Literals.ELEMENTO_AFORO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.ELEMENTO_AFORO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAforo() {
		return aforo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAforo(int newAforo) {
		int oldAforo = aforo;
		aforo = newAforo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.ELEMENTO_AFORO__AFORO, oldAforo, aforo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CentroscomercialesPackage.ELEMENTO_AFORO__NOMBRE:
				return getNombre();
			case CentroscomercialesPackage.ELEMENTO_AFORO__AFORO:
				return getAforo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CentroscomercialesPackage.ELEMENTO_AFORO__NOMBRE:
				setNombre((String)newValue);
				return;
			case CentroscomercialesPackage.ELEMENTO_AFORO__AFORO:
				setAforo((Integer)newValue);
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
			case CentroscomercialesPackage.ELEMENTO_AFORO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CentroscomercialesPackage.ELEMENTO_AFORO__AFORO:
				setAforo(AFORO_EDEFAULT);
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
			case CentroscomercialesPackage.ELEMENTO_AFORO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CentroscomercialesPackage.ELEMENTO_AFORO__AFORO:
				return aforo != AFORO_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", aforo: ");
		result.append(aforo);
		result.append(')');
		return result.toString();
	}

} //ElementoAforoImpl
