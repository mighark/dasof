/**
 */
package centroscomerciales.impl;

import centroscomerciales.CentroscomercialesPackage;
import centroscomerciales.Objeto;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objeto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.impl.ObjetoImpl#getNorte <em>Norte</em>}</li>
 *   <li>{@link centroscomerciales.impl.ObjetoImpl#getSur <em>Sur</em>}</li>
 *   <li>{@link centroscomerciales.impl.ObjetoImpl#getEste <em>Este</em>}</li>
 *   <li>{@link centroscomerciales.impl.ObjetoImpl#getOeste <em>Oeste</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ObjetoImpl extends MinimalEObjectImpl.Container implements Objeto {
	/**
	 * The cached value of the '{@link #getNorte() <em>Norte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorte()
	 * @generated
	 * @ordered
	 */
	protected Objeto norte;
	/**
	 * The cached value of the '{@link #getSur() <em>Sur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSur()
	 * @generated
	 * @ordered
	 */
	protected Objeto sur;
	/**
	 * The cached value of the '{@link #getEste() <em>Este</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEste()
	 * @generated
	 * @ordered
	 */
	protected Objeto este;
	/**
	 * The cached value of the '{@link #getOeste() <em>Oeste</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOeste()
	 * @generated
	 * @ordered
	 */
	protected Objeto oeste;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjetoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CentroscomercialesPackage.Literals.OBJETO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objeto getNorte() {
		if (norte != null && norte.eIsProxy()) {
			InternalEObject oldNorte = (InternalEObject)norte;
			norte = (Objeto)eResolveProxy(oldNorte);
			if (norte != oldNorte) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CentroscomercialesPackage.OBJETO__NORTE, oldNorte, norte));
			}
		}
		return norte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objeto basicGetNorte() {
		return norte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNorte(Objeto newNorte, NotificationChain msgs) {
		Objeto oldNorte = norte;
		norte = newNorte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.OBJETO__NORTE, oldNorte, newNorte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNorte(Objeto newNorte) {
		if (newNorte != norte) {
			NotificationChain msgs = null;
			if (norte != null)
				msgs = ((InternalEObject)norte).eInverseRemove(this, CentroscomercialesPackage.OBJETO__SUR, Objeto.class, msgs);
			if (newNorte != null)
				msgs = ((InternalEObject)newNorte).eInverseAdd(this, CentroscomercialesPackage.OBJETO__SUR, Objeto.class, msgs);
			msgs = basicSetNorte(newNorte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.OBJETO__NORTE, newNorte, newNorte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objeto getSur() {
		if (sur != null && sur.eIsProxy()) {
			InternalEObject oldSur = (InternalEObject)sur;
			sur = (Objeto)eResolveProxy(oldSur);
			if (sur != oldSur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CentroscomercialesPackage.OBJETO__SUR, oldSur, sur));
			}
		}
		return sur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objeto basicGetSur() {
		return sur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSur(Objeto newSur, NotificationChain msgs) {
		Objeto oldSur = sur;
		sur = newSur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.OBJETO__SUR, oldSur, newSur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSur(Objeto newSur) {
		if (newSur != sur) {
			NotificationChain msgs = null;
			if (sur != null)
				msgs = ((InternalEObject)sur).eInverseRemove(this, CentroscomercialesPackage.OBJETO__NORTE, Objeto.class, msgs);
			if (newSur != null)
				msgs = ((InternalEObject)newSur).eInverseAdd(this, CentroscomercialesPackage.OBJETO__NORTE, Objeto.class, msgs);
			msgs = basicSetSur(newSur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.OBJETO__SUR, newSur, newSur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objeto getEste() {
		if (este != null && este.eIsProxy()) {
			InternalEObject oldEste = (InternalEObject)este;
			este = (Objeto)eResolveProxy(oldEste);
			if (este != oldEste) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CentroscomercialesPackage.OBJETO__ESTE, oldEste, este));
			}
		}
		return este;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objeto basicGetEste() {
		return este;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEste(Objeto newEste, NotificationChain msgs) {
		Objeto oldEste = este;
		este = newEste;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.OBJETO__ESTE, oldEste, newEste);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEste(Objeto newEste) {
		if (newEste != este) {
			NotificationChain msgs = null;
			if (este != null)
				msgs = ((InternalEObject)este).eInverseRemove(this, CentroscomercialesPackage.OBJETO__OESTE, Objeto.class, msgs);
			if (newEste != null)
				msgs = ((InternalEObject)newEste).eInverseAdd(this, CentroscomercialesPackage.OBJETO__OESTE, Objeto.class, msgs);
			msgs = basicSetEste(newEste, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.OBJETO__ESTE, newEste, newEste));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objeto getOeste() {
		if (oeste != null && oeste.eIsProxy()) {
			InternalEObject oldOeste = (InternalEObject)oeste;
			oeste = (Objeto)eResolveProxy(oldOeste);
			if (oeste != oldOeste) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CentroscomercialesPackage.OBJETO__OESTE, oldOeste, oeste));
			}
		}
		return oeste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objeto basicGetOeste() {
		return oeste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOeste(Objeto newOeste, NotificationChain msgs) {
		Objeto oldOeste = oeste;
		oeste = newOeste;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.OBJETO__OESTE, oldOeste, newOeste);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOeste(Objeto newOeste) {
		if (newOeste != oeste) {
			NotificationChain msgs = null;
			if (oeste != null)
				msgs = ((InternalEObject)oeste).eInverseRemove(this, CentroscomercialesPackage.OBJETO__ESTE, Objeto.class, msgs);
			if (newOeste != null)
				msgs = ((InternalEObject)newOeste).eInverseAdd(this, CentroscomercialesPackage.OBJETO__ESTE, Objeto.class, msgs);
			msgs = basicSetOeste(newOeste, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.OBJETO__OESTE, newOeste, newOeste));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CentroscomercialesPackage.OBJETO__NORTE:
				if (norte != null)
					msgs = ((InternalEObject)norte).eInverseRemove(this, CentroscomercialesPackage.OBJETO__SUR, Objeto.class, msgs);
				return basicSetNorte((Objeto)otherEnd, msgs);
			case CentroscomercialesPackage.OBJETO__SUR:
				if (sur != null)
					msgs = ((InternalEObject)sur).eInverseRemove(this, CentroscomercialesPackage.OBJETO__NORTE, Objeto.class, msgs);
				return basicSetSur((Objeto)otherEnd, msgs);
			case CentroscomercialesPackage.OBJETO__ESTE:
				if (este != null)
					msgs = ((InternalEObject)este).eInverseRemove(this, CentroscomercialesPackage.OBJETO__OESTE, Objeto.class, msgs);
				return basicSetEste((Objeto)otherEnd, msgs);
			case CentroscomercialesPackage.OBJETO__OESTE:
				if (oeste != null)
					msgs = ((InternalEObject)oeste).eInverseRemove(this, CentroscomercialesPackage.OBJETO__ESTE, Objeto.class, msgs);
				return basicSetOeste((Objeto)otherEnd, msgs);
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
			case CentroscomercialesPackage.OBJETO__NORTE:
				return basicSetNorte(null, msgs);
			case CentroscomercialesPackage.OBJETO__SUR:
				return basicSetSur(null, msgs);
			case CentroscomercialesPackage.OBJETO__ESTE:
				return basicSetEste(null, msgs);
			case CentroscomercialesPackage.OBJETO__OESTE:
				return basicSetOeste(null, msgs);
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
			case CentroscomercialesPackage.OBJETO__NORTE:
				if (resolve) return getNorte();
				return basicGetNorte();
			case CentroscomercialesPackage.OBJETO__SUR:
				if (resolve) return getSur();
				return basicGetSur();
			case CentroscomercialesPackage.OBJETO__ESTE:
				if (resolve) return getEste();
				return basicGetEste();
			case CentroscomercialesPackage.OBJETO__OESTE:
				if (resolve) return getOeste();
				return basicGetOeste();
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
			case CentroscomercialesPackage.OBJETO__NORTE:
				setNorte((Objeto)newValue);
				return;
			case CentroscomercialesPackage.OBJETO__SUR:
				setSur((Objeto)newValue);
				return;
			case CentroscomercialesPackage.OBJETO__ESTE:
				setEste((Objeto)newValue);
				return;
			case CentroscomercialesPackage.OBJETO__OESTE:
				setOeste((Objeto)newValue);
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
			case CentroscomercialesPackage.OBJETO__NORTE:
				setNorte((Objeto)null);
				return;
			case CentroscomercialesPackage.OBJETO__SUR:
				setSur((Objeto)null);
				return;
			case CentroscomercialesPackage.OBJETO__ESTE:
				setEste((Objeto)null);
				return;
			case CentroscomercialesPackage.OBJETO__OESTE:
				setOeste((Objeto)null);
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
			case CentroscomercialesPackage.OBJETO__NORTE:
				return norte != null;
			case CentroscomercialesPackage.OBJETO__SUR:
				return sur != null;
			case CentroscomercialesPackage.OBJETO__ESTE:
				return este != null;
			case CentroscomercialesPackage.OBJETO__OESTE:
				return oeste != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjetoImpl
