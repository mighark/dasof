/**
 */
package centroscomerciales;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.Planta#getNumero <em>Numero</em>}</li>
 *   <li>{@link centroscomerciales.Planta#getElementos <em>Elementos</em>}</li>
 *   <li>{@link centroscomerciales.Planta#getPuertas <em>Puertas</em>}</li>
 *   <li>{@link centroscomerciales.Planta#getSalidas <em>Salidas</em>}</li>
 * </ul>
 *
 * @see centroscomerciales.CentroscomercialesPackage#getPlanta()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IHayEspacioAbierto IAparcamientosOTiendas'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IHayEspacioAbierto='elementos-&gt;exists(oclIsKindOf(EspacioAbierto))' IAparcamientosOTiendas='not(elementos-&gt;exists(oclIsKindOf(ElementoAforo)) and elementos-&gt;exists(oclIsKindOf(Aparcamiento)))'"
 * @generated
 */
public interface Planta extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(int)
	 * @see centroscomerciales.CentroscomercialesPackage#getPlanta_Numero()
	 * @model required="true"
	 * @generated
	 */
	int getNumero();

	/**
	 * Sets the value of the '{@link centroscomerciales.Planta#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(int value);

	/**
	 * Returns the value of the '<em><b>Elementos</b></em>' containment reference list.
	 * The list contents are of type {@link centroscomerciales.Elemento}.
	 * It is bidirectional and its opposite is '{@link centroscomerciales.Elemento#getPlanta <em>Planta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elementos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementos</em>' containment reference list.
	 * @see centroscomerciales.CentroscomercialesPackage#getPlanta_Elementos()
	 * @see centroscomerciales.Elemento#getPlanta
	 * @model opposite="planta" containment="true" required="true"
	 * @generated
	 */
	EList<Elemento> getElementos();

	/**
	 * Returns the value of the '<em><b>Puertas</b></em>' containment reference list.
	 * The list contents are of type {@link centroscomerciales.Puerta}.
	 * It is bidirectional and its opposite is '{@link centroscomerciales.Puerta#getPlanta <em>Planta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puertas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puertas</em>' containment reference list.
	 * @see centroscomerciales.CentroscomercialesPackage#getPlanta_Puertas()
	 * @see centroscomerciales.Puerta#getPlanta
	 * @model opposite="planta" containment="true"
	 * @generated
	 */
	EList<Puerta> getPuertas();

	/**
	 * Returns the value of the '<em><b>Salidas</b></em>' containment reference list.
	 * The list contents are of type {@link centroscomerciales.Salida}.
	 * It is bidirectional and its opposite is '{@link centroscomerciales.Salida#getPlanta <em>Planta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salidas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salidas</em>' containment reference list.
	 * @see centroscomerciales.CentroscomercialesPackage#getPlanta_Salidas()
	 * @see centroscomerciales.Salida#getPlanta
	 * @model opposite="planta" containment="true" required="true"
	 * @generated
	 */
	EList<Salida> getSalidas();

} // Planta
