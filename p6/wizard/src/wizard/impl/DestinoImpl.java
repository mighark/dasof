/**
 */
package wizard.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import wizard.BotonNavegar;
import wizard.CasillaVerif;
import wizard.Destino;
import wizard.Pagina;
import wizard.WizardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destino</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.DestinoImpl#getCasilla <em>Casilla</em>}</li>
 *   <li>{@link wizard.impl.DestinoImpl#getDestino <em>Destino</em>}</li>
 *   <li>{@link wizard.impl.DestinoImpl#getBoton <em>Boton</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DestinoImpl extends MinimalEObjectImpl.Container implements Destino {
	/**
	 * The cached value of the '{@link #getCasilla() <em>Casilla</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasilla()
	 * @generated
	 * @ordered
	 */
	protected CasillaVerif casilla;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected Pagina destino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.DESTINO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasillaVerif getCasilla() {
		if (casilla != null && casilla.eIsProxy()) {
			InternalEObject oldCasilla = (InternalEObject)casilla;
			casilla = (CasillaVerif)eResolveProxy(oldCasilla);
			if (casilla != oldCasilla) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WizardPackage.DESTINO__CASILLA, oldCasilla, casilla));
			}
		}
		return casilla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasillaVerif basicGetCasilla() {
		return casilla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCasilla(CasillaVerif newCasilla) {
		CasillaVerif oldCasilla = casilla;
		casilla = newCasilla;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.DESTINO__CASILLA, oldCasilla, casilla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pagina getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject)destino;
			destino = (Pagina)eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WizardPackage.DESTINO__DESTINO, oldDestino, destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pagina basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestino(Pagina newDestino) {
		Pagina oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.DESTINO__DESTINO, oldDestino, destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BotonNavegar getBoton() {
		if (eContainerFeatureID() != WizardPackage.DESTINO__BOTON) return null;
		return (BotonNavegar)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoton(BotonNavegar newBoton, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBoton, WizardPackage.DESTINO__BOTON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoton(BotonNavegar newBoton) {
		if (newBoton != eInternalContainer() || (eContainerFeatureID() != WizardPackage.DESTINO__BOTON && newBoton != null)) {
			if (EcoreUtil.isAncestor(this, newBoton))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBoton != null)
				msgs = ((InternalEObject)newBoton).eInverseAdd(this, WizardPackage.BOTON_NAVEGAR__DESTINO, BotonNavegar.class, msgs);
			msgs = basicSetBoton(newBoton, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.DESTINO__BOTON, newBoton, newBoton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WizardPackage.DESTINO__BOTON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBoton((BotonNavegar)otherEnd, msgs);
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
			case WizardPackage.DESTINO__BOTON:
				return basicSetBoton(null, msgs);
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
			case WizardPackage.DESTINO__BOTON:
				return eInternalContainer().eInverseRemove(this, WizardPackage.BOTON_NAVEGAR__DESTINO, BotonNavegar.class, msgs);
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
			case WizardPackage.DESTINO__CASILLA:
				if (resolve) return getCasilla();
				return basicGetCasilla();
			case WizardPackage.DESTINO__DESTINO:
				if (resolve) return getDestino();
				return basicGetDestino();
			case WizardPackage.DESTINO__BOTON:
				return getBoton();
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
			case WizardPackage.DESTINO__CASILLA:
				setCasilla((CasillaVerif)newValue);
				return;
			case WizardPackage.DESTINO__DESTINO:
				setDestino((Pagina)newValue);
				return;
			case WizardPackage.DESTINO__BOTON:
				setBoton((BotonNavegar)newValue);
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
			case WizardPackage.DESTINO__CASILLA:
				setCasilla((CasillaVerif)null);
				return;
			case WizardPackage.DESTINO__DESTINO:
				setDestino((Pagina)null);
				return;
			case WizardPackage.DESTINO__BOTON:
				setBoton((BotonNavegar)null);
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
			case WizardPackage.DESTINO__CASILLA:
				return casilla != null;
			case WizardPackage.DESTINO__DESTINO:
				return destino != null;
			case WizardPackage.DESTINO__BOTON:
				return getBoton() != null;
		}
		return super.eIsSet(featureID);
	}

} //DestinoImpl
