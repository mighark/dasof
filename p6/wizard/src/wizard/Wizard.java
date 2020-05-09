/**
 */
package wizard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wizard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Wizard#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link wizard.Wizard#getPaginas <em>Paginas</em>}</li>
 *   <li>{@link wizard.Wizard#getPagIni <em>Pag Ini</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getWizard()
 * @model
 * @generated
 */
public interface Wizard extends EObject {
	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see wizard.WizardPackage#getWizard_Titulo()
	 * @model required="true"
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link wizard.Wizard#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Paginas</b></em>' containment reference list.
	 * The list contents are of type {@link wizard.Pagina}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paginas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paginas</em>' containment reference list.
	 * @see wizard.WizardPackage#getWizard_Paginas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Pagina> getPaginas();

	/**
	 * Returns the value of the '<em><b>Pag Ini</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pag Ini</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pag Ini</em>' reference.
	 * @see #setPagIni(Pagina)
	 * @see wizard.WizardPackage#getWizard_PagIni()
	 * @model required="true"
	 * @generated
	 */
	Pagina getPagIni();

	/**
	 * Sets the value of the '{@link wizard.Wizard#getPagIni <em>Pag Ini</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pag Ini</em>' reference.
	 * @see #getPagIni()
	 * @generated
	 */
	void setPagIni(Pagina value);

} // Wizard
