/**
 */
package wizard.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import wizard.CasillaVerif;
import wizard.Pagina;
import wizard.WizardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Casilla Verif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.CasillaVerifImpl#isPorDef <em>Por Def</em>}</li>
 *   <li>{@link wizard.impl.CasillaVerifImpl#getPagina <em>Pagina</em>}</li>
 *   <li>{@link wizard.impl.CasillaVerifImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CasillaVerifImpl extends CampoImpl implements CasillaVerif {
	/**
	 * The default value of the '{@link #isPorDef() <em>Por Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPorDef()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POR_DEF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPorDef() <em>Por Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPorDef()
	 * @generated
	 * @ordered
	 */
	protected boolean porDef = POR_DEF_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasillaVerifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.CASILLA_VERIF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPorDef() {
		return porDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorDef(boolean newPorDef) {
		boolean oldPorDef = porDef;
		porDef = newPorDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.CASILLA_VERIF__POR_DEF, oldPorDef, porDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pagina getPagina() {
		if (eContainerFeatureID() != WizardPackage.CASILLA_VERIF__PAGINA) return null;
		return (Pagina)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPagina(Pagina newPagina, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPagina, WizardPackage.CASILLA_VERIF__PAGINA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPagina(Pagina newPagina) {
		if (newPagina != eInternalContainer() || (eContainerFeatureID() != WizardPackage.CASILLA_VERIF__PAGINA && newPagina != null)) {
			if (EcoreUtil.isAncestor(this, newPagina))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPagina != null)
				msgs = ((InternalEObject)newPagina).eInverseAdd(this, WizardPackage.PAGINA__CASILLAS_VERIF, Pagina.class, msgs);
			msgs = basicSetPagina(newPagina, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.CASILLA_VERIF__PAGINA, newPagina, newPagina));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.CASILLA_VERIF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WizardPackage.CASILLA_VERIF__PAGINA:
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
			case WizardPackage.CASILLA_VERIF__PAGINA:
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
			case WizardPackage.CASILLA_VERIF__PAGINA:
				return eInternalContainer().eInverseRemove(this, WizardPackage.PAGINA__CASILLAS_VERIF, Pagina.class, msgs);
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
			case WizardPackage.CASILLA_VERIF__POR_DEF:
				return isPorDef();
			case WizardPackage.CASILLA_VERIF__PAGINA:
				return getPagina();
			case WizardPackage.CASILLA_VERIF__NAME:
				return getName();
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
			case WizardPackage.CASILLA_VERIF__POR_DEF:
				setPorDef((Boolean)newValue);
				return;
			case WizardPackage.CASILLA_VERIF__PAGINA:
				setPagina((Pagina)newValue);
				return;
			case WizardPackage.CASILLA_VERIF__NAME:
				setName((String)newValue);
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
			case WizardPackage.CASILLA_VERIF__POR_DEF:
				setPorDef(POR_DEF_EDEFAULT);
				return;
			case WizardPackage.CASILLA_VERIF__PAGINA:
				setPagina((Pagina)null);
				return;
			case WizardPackage.CASILLA_VERIF__NAME:
				setName(NAME_EDEFAULT);
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
			case WizardPackage.CASILLA_VERIF__POR_DEF:
				return porDef != POR_DEF_EDEFAULT;
			case WizardPackage.CASILLA_VERIF__PAGINA:
				return getPagina() != null;
			case WizardPackage.CASILLA_VERIF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (porDef: ");
		result.append(porDef);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CasillaVerifImpl
