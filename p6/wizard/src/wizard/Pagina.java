/**
 */
package wizard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pagina</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Pagina#getCamposTexto <em>Campos Texto</em>}</li>
 *   <li>{@link wizard.Pagina#getCasillasVerif <em>Casillas Verif</em>}</li>
 *   <li>{@link wizard.Pagina#getBotones <em>Botones</em>}</li>
 *   <li>{@link wizard.Pagina#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getPagina()
 * @model
 * @generated
 */
public interface Pagina extends EObject {
	/**
	 * Returns the value of the '<em><b>Campos Texto</b></em>' containment reference list.
	 * The list contents are of type {@link wizard.CampoTexto}.
	 * It is bidirectional and its opposite is '{@link wizard.CampoTexto#getPagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campos Texto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campos Texto</em>' containment reference list.
	 * @see wizard.WizardPackage#getPagina_CamposTexto()
	 * @see wizard.CampoTexto#getPagina
	 * @model opposite="pagina" containment="true"
	 * @generated
	 */
	EList<CampoTexto> getCamposTexto();

	/**
	 * Returns the value of the '<em><b>Casillas Verif</b></em>' containment reference list.
	 * The list contents are of type {@link wizard.CasillaVerif}.
	 * It is bidirectional and its opposite is '{@link wizard.CasillaVerif#getPagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Casillas Verif</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Casillas Verif</em>' containment reference list.
	 * @see wizard.WizardPackage#getPagina_CasillasVerif()
	 * @see wizard.CasillaVerif#getPagina
	 * @model opposite="pagina" containment="true"
	 * @generated
	 */
	EList<CasillaVerif> getCasillasVerif();

	/**
	 * Returns the value of the '<em><b>Botones</b></em>' containment reference list.
	 * The list contents are of type {@link wizard.Boton}.
	 * It is bidirectional and its opposite is '{@link wizard.Boton#getPagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Botones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Botones</em>' containment reference list.
	 * @see wizard.WizardPackage#getPagina_Botones()
	 * @see wizard.Boton#getPagina
	 * @model opposite="pagina" containment="true" required="true"
	 * @generated
	 */
	EList<Boton> getBotones();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wizard.WizardPackage#getPagina_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wizard.Pagina#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Pagina
