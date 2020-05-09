/**
 */
package wizard.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wizard.BotonMensaje;
import wizard.WizardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boton Mensaje</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.BotonMensajeImpl#getMensaje <em>Mensaje</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BotonMensajeImpl extends BotonImpl implements BotonMensaje {
	/**
	 * The default value of the '{@link #getMensaje() <em>Mensaje</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMensaje()
	 * @generated
	 * @ordered
	 */
	protected static final String MENSAJE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMensaje() <em>Mensaje</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMensaje()
	 * @generated
	 * @ordered
	 */
	protected String mensaje = MENSAJE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BotonMensajeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.BOTON_MENSAJE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMensaje(String newMensaje) {
		String oldMensaje = mensaje;
		mensaje = newMensaje;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.BOTON_MENSAJE__MENSAJE, oldMensaje, mensaje));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WizardPackage.BOTON_MENSAJE__MENSAJE:
				return getMensaje();
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
			case WizardPackage.BOTON_MENSAJE__MENSAJE:
				setMensaje((String)newValue);
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
			case WizardPackage.BOTON_MENSAJE__MENSAJE:
				setMensaje(MENSAJE_EDEFAULT);
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
			case WizardPackage.BOTON_MENSAJE__MENSAJE:
				return MENSAJE_EDEFAULT == null ? mensaje != null : !MENSAJE_EDEFAULT.equals(mensaje);
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
		result.append(" (mensaje: ");
		result.append(mensaje);
		result.append(')');
		return result.toString();
	}

} //BotonMensajeImpl
