/**
 */
package centroscomerciales.impl;

import centroscomerciales.CentroscomercialesPackage;
import centroscomerciales.Elemento;
import centroscomerciales.Planta;
import centroscomerciales.Puerta;
import centroscomerciales.Salida;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.impl.PlantaImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link centroscomerciales.impl.PlantaImpl#getElementos <em>Elementos</em>}</li>
 *   <li>{@link centroscomerciales.impl.PlantaImpl#getPuertas <em>Puertas</em>}</li>
 *   <li>{@link centroscomerciales.impl.PlantaImpl#getSalidas <em>Salidas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlantaImpl extends MinimalEObjectImpl.Container implements Planta {
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected int numero = NUMERO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementos() <em>Elementos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementos()
	 * @generated
	 * @ordered
	 */
	protected EList<Elemento> elementos;

	/**
	 * The cached value of the '{@link #getPuertas() <em>Puertas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuertas()
	 * @generated
	 * @ordered
	 */
	protected EList<Puerta> puertas;

	/**
	 * The cached value of the '{@link #getSalidas() <em>Salidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalidas()
	 * @generated
	 * @ordered
	 */
	protected EList<Salida> salidas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CentroscomercialesPackage.Literals.PLANTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(int newNumero) {
		int oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CentroscomercialesPackage.PLANTA__NUMERO, oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Elemento> getElementos() {
		if (elementos == null) {
			elementos = new EObjectContainmentWithInverseEList<Elemento>(Elemento.class, this, CentroscomercialesPackage.PLANTA__ELEMENTOS, CentroscomercialesPackage.ELEMENTO__PLANTA);
		}
		return elementos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Puerta> getPuertas() {
		if (puertas == null) {
			puertas = new EObjectContainmentWithInverseEList<Puerta>(Puerta.class, this, CentroscomercialesPackage.PLANTA__PUERTAS, CentroscomercialesPackage.PUERTA__PLANTA);
		}
		return puertas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Salida> getSalidas() {
		if (salidas == null) {
			salidas = new EObjectContainmentWithInverseEList<Salida>(Salida.class, this, CentroscomercialesPackage.PLANTA__SALIDAS, CentroscomercialesPackage.SALIDA__PLANTA);
		}
		return salidas;
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
			case CentroscomercialesPackage.PLANTA__ELEMENTOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementos()).basicAdd(otherEnd, msgs);
			case CentroscomercialesPackage.PLANTA__PUERTAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPuertas()).basicAdd(otherEnd, msgs);
			case CentroscomercialesPackage.PLANTA__SALIDAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSalidas()).basicAdd(otherEnd, msgs);
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
			case CentroscomercialesPackage.PLANTA__ELEMENTOS:
				return ((InternalEList<?>)getElementos()).basicRemove(otherEnd, msgs);
			case CentroscomercialesPackage.PLANTA__PUERTAS:
				return ((InternalEList<?>)getPuertas()).basicRemove(otherEnd, msgs);
			case CentroscomercialesPackage.PLANTA__SALIDAS:
				return ((InternalEList<?>)getSalidas()).basicRemove(otherEnd, msgs);
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
			case CentroscomercialesPackage.PLANTA__NUMERO:
				return getNumero();
			case CentroscomercialesPackage.PLANTA__ELEMENTOS:
				return getElementos();
			case CentroscomercialesPackage.PLANTA__PUERTAS:
				return getPuertas();
			case CentroscomercialesPackage.PLANTA__SALIDAS:
				return getSalidas();
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
			case CentroscomercialesPackage.PLANTA__NUMERO:
				setNumero((Integer)newValue);
				return;
			case CentroscomercialesPackage.PLANTA__ELEMENTOS:
				getElementos().clear();
				getElementos().addAll((Collection<? extends Elemento>)newValue);
				return;
			case CentroscomercialesPackage.PLANTA__PUERTAS:
				getPuertas().clear();
				getPuertas().addAll((Collection<? extends Puerta>)newValue);
				return;
			case CentroscomercialesPackage.PLANTA__SALIDAS:
				getSalidas().clear();
				getSalidas().addAll((Collection<? extends Salida>)newValue);
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
			case CentroscomercialesPackage.PLANTA__NUMERO:
				setNumero(NUMERO_EDEFAULT);
				return;
			case CentroscomercialesPackage.PLANTA__ELEMENTOS:
				getElementos().clear();
				return;
			case CentroscomercialesPackage.PLANTA__PUERTAS:
				getPuertas().clear();
				return;
			case CentroscomercialesPackage.PLANTA__SALIDAS:
				getSalidas().clear();
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
			case CentroscomercialesPackage.PLANTA__NUMERO:
				return numero != NUMERO_EDEFAULT;
			case CentroscomercialesPackage.PLANTA__ELEMENTOS:
				return elementos != null && !elementos.isEmpty();
			case CentroscomercialesPackage.PLANTA__PUERTAS:
				return puertas != null && !puertas.isEmpty();
			case CentroscomercialesPackage.PLANTA__SALIDAS:
				return salidas != null && !salidas.isEmpty();
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
		result.append(" (numero: ");
		result.append(numero);
		result.append(')');
		return result.toString();
	}

} //PlantaImpl
