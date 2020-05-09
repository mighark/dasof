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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wizard.Pagina;
import wizard.Wizard;
import wizard.WizardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wizard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.WizardImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getPaginas <em>Paginas</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getPagIni <em>Pag Ini</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WizardImpl extends MinimalEObjectImpl.Container implements Wizard {
	/**
	 * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected String titulo = TITULO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaginas() <em>Paginas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginas()
	 * @generated
	 * @ordered
	 */
	protected EList<Pagina> paginas;

	/**
	 * The cached value of the '{@link #getPagIni() <em>Pag Ini</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagIni()
	 * @generated
	 * @ordered
	 */
	protected Pagina pagIni;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WizardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.WIZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitulo(String newTitulo) {
		String oldTitulo = titulo;
		titulo = newTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.WIZARD__TITULO, oldTitulo, titulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pagina> getPaginas() {
		if (paginas == null) {
			paginas = new EObjectContainmentEList<Pagina>(Pagina.class, this, WizardPackage.WIZARD__PAGINAS);
		}
		return paginas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pagina getPagIni() {
		if (pagIni != null && pagIni.eIsProxy()) {
			InternalEObject oldPagIni = (InternalEObject)pagIni;
			pagIni = (Pagina)eResolveProxy(oldPagIni);
			if (pagIni != oldPagIni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WizardPackage.WIZARD__PAG_INI, oldPagIni, pagIni));
			}
		}
		return pagIni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pagina basicGetPagIni() {
		return pagIni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPagIni(Pagina newPagIni) {
		Pagina oldPagIni = pagIni;
		pagIni = newPagIni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.WIZARD__PAG_INI, oldPagIni, pagIni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WizardPackage.WIZARD__PAGINAS:
				return ((InternalEList<?>)getPaginas()).basicRemove(otherEnd, msgs);
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
			case WizardPackage.WIZARD__TITULO:
				return getTitulo();
			case WizardPackage.WIZARD__PAGINAS:
				return getPaginas();
			case WizardPackage.WIZARD__PAG_INI:
				if (resolve) return getPagIni();
				return basicGetPagIni();
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
			case WizardPackage.WIZARD__TITULO:
				setTitulo((String)newValue);
				return;
			case WizardPackage.WIZARD__PAGINAS:
				getPaginas().clear();
				getPaginas().addAll((Collection<? extends Pagina>)newValue);
				return;
			case WizardPackage.WIZARD__PAG_INI:
				setPagIni((Pagina)newValue);
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
			case WizardPackage.WIZARD__TITULO:
				setTitulo(TITULO_EDEFAULT);
				return;
			case WizardPackage.WIZARD__PAGINAS:
				getPaginas().clear();
				return;
			case WizardPackage.WIZARD__PAG_INI:
				setPagIni((Pagina)null);
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
			case WizardPackage.WIZARD__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
			case WizardPackage.WIZARD__PAGINAS:
				return paginas != null && !paginas.isEmpty();
			case WizardPackage.WIZARD__PAG_INI:
				return pagIni != null;
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
		result.append(" (titulo: ");
		result.append(titulo);
		result.append(')');
		return result.toString();
	}

} //WizardImpl
