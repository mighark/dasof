/**
 */
package centroscomerciales;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento Cambio Planta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.ElementoCambioPlanta#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @see centroscomerciales.CentroscomercialesPackage#getElementoCambioPlanta()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='escaleras'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot escaleras='destino-&gt;forAll(d | (self.planta.numero = d.planta.numero + 1) or (self.planta.numero = d.planta.numero - 1))'"
 * @generated
 */
public interface ElementoCambioPlanta extends Elemento {
	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference list.
	 * The list contents are of type {@link centroscomerciales.Elemento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference list.
	 * @see centroscomerciales.CentroscomercialesPackage#getElementoCambioPlanta_Destino()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Elemento> getDestino();

} // ElementoCambioPlanta
