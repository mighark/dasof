/**
 */
package centroscomerciales.impl;

import centroscomerciales.CentroComercial;
import centroscomerciales.CentroscomercialesPackage;
import centroscomerciales.Planta;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Centro Comercial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.impl.CentroComercialImpl#getAforo <em>Aforo</em>}</li>
 *   <li>{@link centroscomerciales.impl.CentroComercialImpl#getPlantas <em>Plantas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CentroComercialImpl extends MinimalEObjectImpl.Container implements CentroComercial {
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
	 * The cached value of the '{@link #getPlantas() <em>Plantas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantas()
	 * @generated
	 * @ordered
	 */
	protected EList<Planta> plantas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CentroComercialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CentroscomercialesPackage.Literals.CENTRO_COMERCIAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.CENTRO_COMERCIAL__AFORO, oldAforo, aforo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Planta> getPlantas() {
		if (plantas == null) {
			plantas = new EObjectContainmentEList<Planta>(Planta.class, this, CentroscomercialesPackage.CENTRO_COMERCIAL__PLANTAS);
		}
		return plantas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CentroscomercialesPackage.CENTRO_COMERCIAL__PLANTAS:
				return ((InternalEList<?>)getPlantas()).basicRemove(otherEnd, msgs);
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
			case CentroscomercialesPackage.CENTRO_COMERCIAL__AFORO:
				return getAforo();
			case CentroscomercialesPackage.CENTRO_COMERCIAL__PLANTAS:
				return getPlantas();
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
			case CentroscomercialesPackage.CENTRO_COMERCIAL__AFORO:
				setAforo((Integer)newValue);
				return;
			case CentroscomercialesPackage.CENTRO_COMERCIAL__PLANTAS:
				getPlantas().clear();
				getPlantas().addAll((Collection<? extends Planta>)newValue);
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
			case CentroscomercialesPackage.CENTRO_COMERCIAL__AFORO:
				setAforo(AFORO_EDEFAULT);
				return;
			case CentroscomercialesPackage.CENTRO_COMERCIAL__PLANTAS:
				getPlantas().clear();
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
			case CentroscomercialesPackage.CENTRO_COMERCIAL__AFORO:
				return aforo != AFORO_EDEFAULT;
			case CentroscomercialesPackage.CENTRO_COMERCIAL__PLANTAS:
				return plantas != null && !plantas.isEmpty();
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
		result.append(" (aforo: ");
		result.append(aforo);
		result.append(')');
		return result.toString();
	}

} //CentroComercialImpl
