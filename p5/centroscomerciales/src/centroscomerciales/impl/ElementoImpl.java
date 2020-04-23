/**
 */
package centroscomerciales.impl;

import centroscomerciales.CentroscomercialesPackage;
import centroscomerciales.Elemento;

import centroscomerciales.Planta;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elemento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.impl.ElementoImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link centroscomerciales.impl.ElementoImpl#getPlanta <em>Planta</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementoImpl extends ObjetoImpl implements Elemento {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CentroscomercialesPackage.Literals.ELEMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.ELEMENTO__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Planta getPlanta() {
		if (eContainerFeatureID() != CentroscomercialesPackage.ELEMENTO__PLANTA) return null;
		return (Planta)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanta(Planta newPlanta, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPlanta, CentroscomercialesPackage.ELEMENTO__PLANTA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanta(Planta newPlanta) {
		if (newPlanta != eInternalContainer() || (eContainerFeatureID() != CentroscomercialesPackage.ELEMENTO__PLANTA && newPlanta != null)) {
			if (EcoreUtil.isAncestor(this, newPlanta))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPlanta != null)
				msgs = ((InternalEObject)newPlanta).eInverseAdd(this, CentroscomercialesPackage.PLANTA__ELEMENTOS, Planta.class, msgs);
			msgs = basicSetPlanta(newPlanta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.ELEMENTO__PLANTA, newPlanta, newPlanta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CentroscomercialesPackage.ELEMENTO__PLANTA:
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
			case CentroscomercialesPackage.ELEMENTO__PLANTA:
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
			case CentroscomercialesPackage.ELEMENTO__PLANTA:
				return eInternalContainer().eInverseRemove(this, CentroscomercialesPackage.PLANTA__ELEMENTOS, Planta.class, msgs);
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
			case CentroscomercialesPackage.ELEMENTO__IDENTIFIER:
				return getIdentifier();
			case CentroscomercialesPackage.ELEMENTO__PLANTA:
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
			case CentroscomercialesPackage.ELEMENTO__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case CentroscomercialesPackage.ELEMENTO__PLANTA:
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
			case CentroscomercialesPackage.ELEMENTO__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case CentroscomercialesPackage.ELEMENTO__PLANTA:
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
			case CentroscomercialesPackage.ELEMENTO__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case CentroscomercialesPackage.ELEMENTO__PLANTA:
				return getPlanta() != null;
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //ElementoImpl
