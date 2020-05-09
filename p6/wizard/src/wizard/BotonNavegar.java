/**
 */
package wizard;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boton Navegar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.BotonNavegar#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getBotonNavegar()
 * @model
 * @generated
 */
public interface BotonNavegar extends Boton {
	/**
	 * Returns the value of the '<em><b>Destino</b></em>' containment reference list.
	 * The list contents are of type {@link wizard.Destino}.
	 * It is bidirectional and its opposite is '{@link wizard.Destino#getBoton <em>Boton</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' containment reference list.
	 * @see wizard.WizardPackage#getBotonNavegar_Destino()
	 * @see wizard.Destino#getBoton
	 * @model opposite="boton" containment="true" required="true"
	 * @generated
	 */
	EList<Destino> getDestino();

} // BotonNavegar
