/**
 */
package centroscomerciales.impl;

import centroscomerciales.CentroscomercialesPackage;
import centroscomerciales.ZonaAparcamiento;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zona Aparcamiento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.impl.ZonaAparcamientoImpl#getPlazas <em>Plazas</em>}</li>
 *   <li>{@link centroscomerciales.impl.ZonaAparcamientoImpl#getPrecio <em>Precio</em>}</li>
 *   <li>{@link centroscomerciales.impl.ZonaAparcamientoImpl#isUsoReservado <em>Uso Reservado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZonaAparcamientoImpl extends MinimalEObjectImpl.Container implements ZonaAparcamiento {
	/**
	 * The default value of the '{@link #getPlazas() <em>Plazas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlazas()
	 * @generated
	 * @ordered
	 */
	protected static final int PLAZAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlazas() <em>Plazas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlazas()
	 * @generated
	 * @ordered
	 */
	protected int plazas = PLAZAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected static final float PRECIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected float precio = PRECIO_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsoReservado() <em>Uso Reservado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsoReservado()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USO_RESERVADO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsoReservado() <em>Uso Reservado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsoReservado()
	 * @generated
	 * @ordered
	 */
	protected boolean usoReservado = USO_RESERVADO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZonaAparcamientoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CentroscomercialesPackage.Literals.ZONA_APARCAMIENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPlazas() {
		return plazas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlazas(int newPlazas) {
		int oldPlazas = plazas;
		plazas = newPlazas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.ZONA_APARCAMIENTO__PLAZAS, oldPlazas, plazas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecio(float newPrecio) {
		float oldPrecio = precio;
		precio = newPrecio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.ZONA_APARCAMIENTO__PRECIO, oldPrecio, precio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsoReservado() {
		return usoReservado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsoReservado(boolean newUsoReservado) {
		boolean oldUsoReservado = usoReservado;
		usoReservado = newUsoReservado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.ZONA_APARCAMIENTO__USO_RESERVADO, oldUsoReservado, usoReservado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CentroscomercialesPackage.ZONA_APARCAMIENTO__PLAZAS:
				return getPlazas();
			case CentroscomercialesPackage.ZONA_APARCAMIENTO__PRECIO:
				return getPrecio();
			case CentroscomercialesPackage.ZONA_APARCAMIENTO__USO_RESERVADO:
				return isUsoReservado();
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
			case CentroscomercialesPackage.ZONA_APARCAMIENTO__PLAZAS:
				setPlazas((Integer)newValue);
				return;
			case CentroscomercialesPackage.ZONA_APARCAMIENTO__PRECIO:
				setPrecio((Float)newValue);
				return;
			case CentroscomercialesPackage.ZONA_APARCAMIENTO__USO_RESERVADO:
				setUsoReservado((Boolean)newValue);
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
			case CentroscomercialesPackage.ZONA_APARCAMIENTO__PLAZAS:
				setPlazas(PLAZAS_EDEFAULT);
				return;
			case CentroscomercialesPackage.ZONA_APARCAMIENTO__PRECIO:
				setPrecio(PRECIO_EDEFAULT);
				return;
			case CentroscomercialesPackage.ZONA_APARCAMIENTO__USO_RESERVADO:
				setUsoReservado(USO_RESERVADO_EDEFAULT);
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
			case CentroscomercialesPackage.ZONA_APARCAMIENTO__PLAZAS:
				return plazas != PLAZAS_EDEFAULT;
			case CentroscomercialesPackage.ZONA_APARCAMIENTO__PRECIO:
				return precio != PRECIO_EDEFAULT;
			case CentroscomercialesPackage.ZONA_APARCAMIENTO__USO_RESERVADO:
				return usoReservado != USO_RESERVADO_EDEFAULT;
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
		result.append(" (plazas: ");
		result.append(plazas);
		result.append(", precio: ");
		result.append(precio);
		result.append(", usoReservado: ");
		result.append(usoReservado);
		result.append(')');
		return result.toString();
	}

} //ZonaAparcamientoImpl
