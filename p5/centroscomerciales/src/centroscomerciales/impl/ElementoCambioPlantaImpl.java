/**
 */
package centroscomerciales.impl;

import centroscomerciales.CentroscomercialesPackage;
import centroscomerciales.Elemento;
import centroscomerciales.ElementoCambioPlanta;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elemento Cambio Planta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.impl.ElementoCambioPlantaImpl#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementoCambioPlantaImpl extends ElementoImpl implements ElementoCambioPlanta {
	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected EList<Elemento> destino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementoCambioPlantaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CentroscomercialesPackage.Literals.ELEMENTO_CAMBIO_PLANTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Elemento> getDestino() {
		if (destino == null) {
			destino = new EObjectResolvingEList<Elemento>(Elemento.class, this, CentroscomercialesPackage.ELEMENTO_CAMBIO_PLANTA__DESTINO);
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CentroscomercialesPackage.ELEMENTO_CAMBIO_PLANTA__DESTINO:
				return getDestino();
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
			case CentroscomercialesPackage.ELEMENTO_CAMBIO_PLANTA__DESTINO:
				getDestino().clear();
				getDestino().addAll((Collection<? extends Elemento>)newValue);
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
			case CentroscomercialesPackage.ELEMENTO_CAMBIO_PLANTA__DESTINO:
				getDestino().clear();
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
			case CentroscomercialesPackage.ELEMENTO_CAMBIO_PLANTA__DESTINO:
				return destino != null && !destino.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementoCambioPlantaImpl
