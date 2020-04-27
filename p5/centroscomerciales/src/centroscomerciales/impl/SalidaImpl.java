/**
 */
package centroscomerciales.impl;

import centroscomerciales.CentroscomercialesPackage;
import centroscomerciales.Elemento;
import centroscomerciales.Objeto;
import centroscomerciales.Planta;
import centroscomerciales.Salida;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salida</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.impl.SalidaImpl#getPlanta <em>Planta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalidaImpl extends ObjetoImpl implements Salida {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalidaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CentroscomercialesPackage.Literals.SALIDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Planta getPlanta() {
		if (eContainerFeatureID() != CentroscomercialesPackage.SALIDA__PLANTA) return null;
		return (Planta)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanta(Planta newPlanta, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPlanta, CentroscomercialesPackage.SALIDA__PLANTA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanta(Planta newPlanta) {
		if (newPlanta != eInternalContainer() || (eContainerFeatureID() != CentroscomercialesPackage.SALIDA__PLANTA && newPlanta != null)) {
			if (EcoreUtil.isAncestor(this, newPlanta))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPlanta != null)
				msgs = ((InternalEObject)newPlanta).eInverseAdd(this, CentroscomercialesPackage.PLANTA__SALIDAS, Planta.class, msgs);
			msgs = basicSetPlanta(newPlanta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.SALIDA__PLANTA, newPlanta, newPlanta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CentroscomercialesPackage.SALIDA__PLANTA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPlanta((Planta)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CentroscomercialesPackage.SALIDA__PLANTA:
				return basicSetPlanta(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CentroscomercialesPackage.SALIDA__PLANTA:
				return eInternalContainer().eInverseRemove(this, CentroscomercialesPackage.PLANTA__SALIDAS, Planta.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CentroscomercialesPackage.SALIDA__PLANTA:
				return getPlanta();
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
			case CentroscomercialesPackage.SALIDA__PLANTA:
				setPlanta((Planta)newValue);
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
			case CentroscomercialesPackage.SALIDA__PLANTA:
				setPlanta((Planta)null);
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
			case CentroscomercialesPackage.SALIDA__PLANTA:
				return getPlanta() != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public List<Elemento> accesibles() {
		List<Elemento> accesibles = new ArrayList<>();
		if(checkAccesible(getNorte())) {
			accesibles.add((Elemento) getNorte()) ;
		}
		if(checkAccesible(getSur())) {
			accesibles.add((Elemento) getSur()) ;
		}
		if(checkAccesible(getEste())) {
			accesibles.add((Elemento) getEste()) ;
		}
		if(checkAccesible(getOeste())) {
			accesibles.add((Elemento) getOeste()) ;
		}
		return accesibles;
	}
	
	private boolean checkAccesible(Objeto o) {
		return o != null && o instanceof Elemento;
	}

} //SalidaImpl
