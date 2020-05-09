/**
 */
package wizard.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import wizard.CampoTexto;
import wizard.Pagina;
import wizard.WizardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Campo Texto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.CampoTextoImpl#isOpcional <em>Opcional</em>}</li>
 *   <li>{@link wizard.impl.CampoTextoImpl#getPagina <em>Pagina</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CampoTextoImpl extends CampoImpl implements CampoTexto {
	/**
	 * The default value of the '{@link #isOpcional() <em>Opcional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpcional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPCIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOpcional() <em>Opcional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpcional()
	 * @generated
	 * @ordered
	 */
	protected boolean opcional = OPCIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CampoTextoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.CAMPO_TEXTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpcional() {
		return opcional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpcional(boolean newOpcional) {
		boolean oldOpcional = opcional;
		opcional = newOpcional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.CAMPO_TEXTO__OPCIONAL, oldOpcional, opcional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pagina getPagina() {
		if (eContainerFeatureID() != WizardPackage.CAMPO_TEXTO__PAGINA) return null;
		return (Pagina)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPagina(Pagina newPagina, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPagina, WizardPackage.CAMPO_TEXTO__PAGINA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPagina(Pagina newPagina) {
		if (newPagina != eInternalContainer() || (eContainerFeatureID() != WizardPackage.CAMPO_TEXTO__PAGINA && newPagina != null)) {
			if (EcoreUtil.isAncestor(this, newPagina))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPagina != null)
				msgs = ((InternalEObject)newPagina).eInverseAdd(this, WizardPackage.PAGINA__CAMPOS_TEXTO, Pagina.class, msgs);
			msgs = basicSetPagina(newPagina, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.CAMPO_TEXTO__PAGINA, newPagina, newPagina));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WizardPackage.CAMPO_TEXTO__PAGINA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPagina((Pagina)otherEnd, msgs);
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
			case WizardPackage.CAMPO_TEXTO__PAGINA:
				return basicSetPagina(null, msgs);
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
			case WizardPackage.CAMPO_TEXTO__PAGINA:
				return eInternalContainer().eInverseRemove(this, WizardPackage.PAGINA__CAMPOS_TEXTO, Pagina.class, msgs);
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
			case WizardPackage.CAMPO_TEXTO__OPCIONAL:
				return isOpcional();
			case WizardPackage.CAMPO_TEXTO__PAGINA:
				return getPagina();
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
			case WizardPackage.CAMPO_TEXTO__OPCIONAL:
				setOpcional((Boolean)newValue);
				return;
			case WizardPackage.CAMPO_TEXTO__PAGINA:
				setPagina((Pagina)newValue);
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
			case WizardPackage.CAMPO_TEXTO__OPCIONAL:
				setOpcional(OPCIONAL_EDEFAULT);
				return;
			case WizardPackage.CAMPO_TEXTO__PAGINA:
				setPagina((Pagina)null);
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
			case WizardPackage.CAMPO_TEXTO__OPCIONAL:
				return opcional != OPCIONAL_EDEFAULT;
			case WizardPackage.CAMPO_TEXTO__PAGINA:
				return getPagina() != null;
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
		result.append(" (opcional: ");
		result.append(opcional);
		result.append(')');
		return result.toString();
	}

} //CampoTextoImpl
