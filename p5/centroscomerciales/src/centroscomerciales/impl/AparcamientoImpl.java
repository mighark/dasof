/**
 */
package centroscomerciales.impl;

import centroscomerciales.Aparcamiento;
import centroscomerciales.CentroscomercialesPackage;
import centroscomerciales.ZonaAparcamiento;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aparcamiento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.impl.AparcamientoImpl#getZonas <em>Zonas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AparcamientoImpl extends ElementoImpl implements Aparcamiento {
	/**
	 * The cached value of the '{@link #getZonas() <em>Zonas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonas()
	 * @generated
	 * @ordered
	 */
	protected EList<ZonaAparcamiento> zonas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AparcamientoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CentroscomercialesPackage.Literals.APARCAMIENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ZonaAparcamiento> getZonas() {
		if (zonas == null) {
			zonas = new EObjectContainmentEList<ZonaAparcamiento>(ZonaAparcamiento.class, this, CentroscomercialesPackage.APARCAMIENTO__ZONAS);
		}
		return zonas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CentroscomercialesPackage.APARCAMIENTO__ZONAS:
				return ((InternalEList<?>)getZonas()).basicRemove(otherEnd, msgs);
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
			case CentroscomercialesPackage.APARCAMIENTO__ZONAS:
				return getZonas();
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
			case CentroscomercialesPackage.APARCAMIENTO__ZONAS:
				getZonas().clear();
				getZonas().addAll((Collection<? extends ZonaAparcamiento>)newValue);
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
			case CentroscomercialesPackage.APARCAMIENTO__ZONAS:
				getZonas().clear();
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
			case CentroscomercialesPackage.APARCAMIENTO__ZONAS:
				return zonas != null && !zonas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AparcamientoImpl
