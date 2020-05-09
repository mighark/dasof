/**
 */
package wizard.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wizard.Boton;
import wizard.CampoTexto;
import wizard.CasillaVerif;
import wizard.Pagina;
import wizard.WizardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pagina</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.PaginaImpl#getCamposTexto <em>Campos Texto</em>}</li>
 *   <li>{@link wizard.impl.PaginaImpl#getCasillasVerif <em>Casillas Verif</em>}</li>
 *   <li>{@link wizard.impl.PaginaImpl#getBotones <em>Botones</em>}</li>
 *   <li>{@link wizard.impl.PaginaImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaginaImpl extends MinimalEObjectImpl.Container implements Pagina {
	/**
	 * The cached value of the '{@link #getCamposTexto() <em>Campos Texto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamposTexto()
	 * @generated
	 * @ordered
	 */
	protected EList<CampoTexto> camposTexto;

	/**
	 * The cached value of the '{@link #getCasillasVerif() <em>Casillas Verif</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasillasVerif()
	 * @generated
	 * @ordered
	 */
	protected EList<CasillaVerif> casillasVerif;

	/**
	 * The cached value of the '{@link #getBotones() <em>Botones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBotones()
	 * @generated
	 * @ordered
	 */
	protected EList<Boton> botones;

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
	protected PaginaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.PAGINA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CampoTexto> getCamposTexto() {
		if (camposTexto == null) {
			camposTexto = new EObjectContainmentWithInverseEList<CampoTexto>(CampoTexto.class, this, WizardPackage.PAGINA__CAMPOS_TEXTO, WizardPackage.CAMPO_TEXTO__PAGINA);
		}
		return camposTexto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CasillaVerif> getCasillasVerif() {
		if (casillasVerif == null) {
			casillasVerif = new EObjectContainmentWithInverseEList<CasillaVerif>(CasillaVerif.class, this, WizardPackage.PAGINA__CASILLAS_VERIF, WizardPackage.CASILLA_VERIF__PAGINA);
		}
		return casillasVerif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boton> getBotones() {
		if (botones == null) {
			botones = new EObjectContainmentWithInverseEList<Boton>(Boton.class, this, WizardPackage.PAGINA__BOTONES, WizardPackage.BOTON__PAGINA);
		}
		return botones;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.PAGINA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WizardPackage.PAGINA__CAMPOS_TEXTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCamposTexto()).basicAdd(otherEnd, msgs);
			case WizardPackage.PAGINA__CASILLAS_VERIF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCasillasVerif()).basicAdd(otherEnd, msgs);
			case WizardPackage.PAGINA__BOTONES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBotones()).basicAdd(otherEnd, msgs);
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
			case WizardPackage.PAGINA__CAMPOS_TEXTO:
				return ((InternalEList<?>)getCamposTexto()).basicRemove(otherEnd, msgs);
			case WizardPackage.PAGINA__CASILLAS_VERIF:
				return ((InternalEList<?>)getCasillasVerif()).basicRemove(otherEnd, msgs);
			case WizardPackage.PAGINA__BOTONES:
				return ((InternalEList<?>)getBotones()).basicRemove(otherEnd, msgs);
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
			case WizardPackage.PAGINA__CAMPOS_TEXTO:
				return getCamposTexto();
			case WizardPackage.PAGINA__CASILLAS_VERIF:
				return getCasillasVerif();
			case WizardPackage.PAGINA__BOTONES:
				return getBotones();
			case WizardPackage.PAGINA__NAME:
				return getName();
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
			case WizardPackage.PAGINA__CAMPOS_TEXTO:
				getCamposTexto().clear();
				getCamposTexto().addAll((Collection<? extends CampoTexto>)newValue);
				return;
			case WizardPackage.PAGINA__CASILLAS_VERIF:
				getCasillasVerif().clear();
				getCasillasVerif().addAll((Collection<? extends CasillaVerif>)newValue);
				return;
			case WizardPackage.PAGINA__BOTONES:
				getBotones().clear();
				getBotones().addAll((Collection<? extends Boton>)newValue);
				return;
			case WizardPackage.PAGINA__NAME:
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
			case WizardPackage.PAGINA__CAMPOS_TEXTO:
				getCamposTexto().clear();
				return;
			case WizardPackage.PAGINA__CASILLAS_VERIF:
				getCasillasVerif().clear();
				return;
			case WizardPackage.PAGINA__BOTONES:
				getBotones().clear();
				return;
			case WizardPackage.PAGINA__NAME:
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
			case WizardPackage.PAGINA__CAMPOS_TEXTO:
				return camposTexto != null && !camposTexto.isEmpty();
			case WizardPackage.PAGINA__CASILLAS_VERIF:
				return casillasVerif != null && !casillasVerif.isEmpty();
			case WizardPackage.PAGINA__BOTONES:
				return botones != null && !botones.isEmpty();
			case WizardPackage.PAGINA__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PaginaImpl
