/**
 */
package wizard;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see wizard.WizardFactory
 * @model kind="package"
 * @generated
 */
public interface WizardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wizard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "wiz";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wiz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WizardPackage eINSTANCE = wizard.impl.WizardPackageImpl.init();

	/**
	 * The meta object id for the '{@link wizard.impl.WizardImpl <em>Wizard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.WizardImpl
	 * @see wizard.impl.WizardPackageImpl#getWizard()
	 * @generated
	 */
	int WIZARD = 0;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__TITULO = 0;

	/**
	 * The feature id for the '<em><b>Paginas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__PAGINAS = 1;

	/**
	 * The feature id for the '<em><b>Pag Ini</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__PAG_INI = 2;

	/**
	 * The number of structural features of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wizard.impl.PaginaImpl <em>Pagina</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.PaginaImpl
	 * @see wizard.impl.WizardPackageImpl#getPagina()
	 * @generated
	 */
	int PAGINA = 1;

	/**
	 * The feature id for the '<em><b>Campos Texto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__CAMPOS_TEXTO = 0;

	/**
	 * The feature id for the '<em><b>Casillas Verif</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__CASILLAS_VERIF = 1;

	/**
	 * The feature id for the '<em><b>Botones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__BOTONES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__NAME = 3;

	/**
	 * The number of structural features of the '<em>Pagina</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pagina</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wizard.impl.CampoImpl <em>Campo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.CampoImpl
	 * @see wizard.impl.WizardPackageImpl#getCampo()
	 * @generated
	 */
	int CAMPO = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO__TAG = 0;

	/**
	 * The number of structural features of the '<em>Campo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Campo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wizard.impl.CampoTextoImpl <em>Campo Texto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.CampoTextoImpl
	 * @see wizard.impl.WizardPackageImpl#getCampoTexto()
	 * @generated
	 */
	int CAMPO_TEXTO = 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_TEXTO__TAG = CAMPO__TAG;

	/**
	 * The feature id for the '<em><b>Opcional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_TEXTO__OPCIONAL = CAMPO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pagina</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_TEXTO__PAGINA = CAMPO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Campo Texto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_TEXTO_FEATURE_COUNT = CAMPO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Campo Texto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_TEXTO_OPERATION_COUNT = CAMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wizard.impl.CasillaVerifImpl <em>Casilla Verif</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.CasillaVerifImpl
	 * @see wizard.impl.WizardPackageImpl#getCasillaVerif()
	 * @generated
	 */
	int CASILLA_VERIF = 4;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASILLA_VERIF__TAG = CAMPO__TAG;

	/**
	 * The feature id for the '<em><b>Por Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASILLA_VERIF__POR_DEF = CAMPO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pagina</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASILLA_VERIF__PAGINA = CAMPO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASILLA_VERIF__NAME = CAMPO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Casilla Verif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASILLA_VERIF_FEATURE_COUNT = CAMPO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Casilla Verif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASILLA_VERIF_OPERATION_COUNT = CAMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wizard.impl.BotonImpl <em>Boton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.BotonImpl
	 * @see wizard.impl.WizardPackageImpl#getBoton()
	 * @generated
	 */
	int BOTON = 5;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON__TAG = CAMPO__TAG;

	/**
	 * The feature id for the '<em><b>Pagina</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON__PAGINA = CAMPO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_FEATURE_COUNT = CAMPO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_OPERATION_COUNT = CAMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wizard.impl.BotonNavegarImpl <em>Boton Navegar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.BotonNavegarImpl
	 * @see wizard.impl.WizardPackageImpl#getBotonNavegar()
	 * @generated
	 */
	int BOTON_NAVEGAR = 6;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_NAVEGAR__TAG = BOTON__TAG;

	/**
	 * The feature id for the '<em><b>Pagina</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_NAVEGAR__PAGINA = BOTON__PAGINA;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_NAVEGAR__DESTINO = BOTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boton Navegar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_NAVEGAR_FEATURE_COUNT = BOTON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boton Navegar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_NAVEGAR_OPERATION_COUNT = BOTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wizard.impl.BotonMensajeImpl <em>Boton Mensaje</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.BotonMensajeImpl
	 * @see wizard.impl.WizardPackageImpl#getBotonMensaje()
	 * @generated
	 */
	int BOTON_MENSAJE = 7;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_MENSAJE__TAG = BOTON__TAG;

	/**
	 * The feature id for the '<em><b>Pagina</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_MENSAJE__PAGINA = BOTON__PAGINA;

	/**
	 * The feature id for the '<em><b>Mensaje</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_MENSAJE__MENSAJE = BOTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boton Mensaje</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_MENSAJE_FEATURE_COUNT = BOTON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boton Mensaje</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_MENSAJE_OPERATION_COUNT = BOTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wizard.impl.BotonCerrarImpl <em>Boton Cerrar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.BotonCerrarImpl
	 * @see wizard.impl.WizardPackageImpl#getBotonCerrar()
	 * @generated
	 */
	int BOTON_CERRAR = 8;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CERRAR__TAG = BOTON__TAG;

	/**
	 * The feature id for the '<em><b>Pagina</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CERRAR__PAGINA = BOTON__PAGINA;

	/**
	 * The number of structural features of the '<em>Boton Cerrar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CERRAR_FEATURE_COUNT = BOTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boton Cerrar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CERRAR_OPERATION_COUNT = BOTON_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link wizard.impl.DestinoImpl <em>Destino</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.DestinoImpl
	 * @see wizard.impl.WizardPackageImpl#getDestino()
	 * @generated
	 */
	int DESTINO = 9;

	/**
	 * The feature id for the '<em><b>Casilla</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINO__CASILLA = 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINO__DESTINO = 1;

	/**
	 * The feature id for the '<em><b>Boton</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINO__BOTON = 2;

	/**
	 * The number of structural features of the '<em>Destino</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Destino</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link wizard.Wizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard</em>'.
	 * @see wizard.Wizard
	 * @generated
	 */
	EClass getWizard();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Wizard#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see wizard.Wizard#getTitulo()
	 * @see #getWizard()
	 * @generated
	 */
	EAttribute getWizard_Titulo();

	/**
	 * Returns the meta object for the containment reference list '{@link wizard.Wizard#getPaginas <em>Paginas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paginas</em>'.
	 * @see wizard.Wizard#getPaginas()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_Paginas();

	/**
	 * Returns the meta object for the reference '{@link wizard.Wizard#getPagIni <em>Pag Ini</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pag Ini</em>'.
	 * @see wizard.Wizard#getPagIni()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_PagIni();

	/**
	 * Returns the meta object for class '{@link wizard.Pagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagina</em>'.
	 * @see wizard.Pagina
	 * @generated
	 */
	EClass getPagina();

	/**
	 * Returns the meta object for the containment reference list '{@link wizard.Pagina#getCamposTexto <em>Campos Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campos Texto</em>'.
	 * @see wizard.Pagina#getCamposTexto()
	 * @see #getPagina()
	 * @generated
	 */
	EReference getPagina_CamposTexto();

	/**
	 * Returns the meta object for the containment reference list '{@link wizard.Pagina#getCasillasVerif <em>Casillas Verif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Casillas Verif</em>'.
	 * @see wizard.Pagina#getCasillasVerif()
	 * @see #getPagina()
	 * @generated
	 */
	EReference getPagina_CasillasVerif();

	/**
	 * Returns the meta object for the containment reference list '{@link wizard.Pagina#getBotones <em>Botones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Botones</em>'.
	 * @see wizard.Pagina#getBotones()
	 * @see #getPagina()
	 * @generated
	 */
	EReference getPagina_Botones();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Pagina#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wizard.Pagina#getName()
	 * @see #getPagina()
	 * @generated
	 */
	EAttribute getPagina_Name();

	/**
	 * Returns the meta object for class '{@link wizard.Campo <em>Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campo</em>'.
	 * @see wizard.Campo
	 * @generated
	 */
	EClass getCampo();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Campo#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see wizard.Campo#getTag()
	 * @see #getCampo()
	 * @generated
	 */
	EAttribute getCampo_Tag();

	/**
	 * Returns the meta object for class '{@link wizard.CampoTexto <em>Campo Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campo Texto</em>'.
	 * @see wizard.CampoTexto
	 * @generated
	 */
	EClass getCampoTexto();

	/**
	 * Returns the meta object for the attribute '{@link wizard.CampoTexto#isOpcional <em>Opcional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opcional</em>'.
	 * @see wizard.CampoTexto#isOpcional()
	 * @see #getCampoTexto()
	 * @generated
	 */
	EAttribute getCampoTexto_Opcional();

	/**
	 * Returns the meta object for the container reference '{@link wizard.CampoTexto#getPagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pagina</em>'.
	 * @see wizard.CampoTexto#getPagina()
	 * @see #getCampoTexto()
	 * @generated
	 */
	EReference getCampoTexto_Pagina();

	/**
	 * Returns the meta object for class '{@link wizard.CasillaVerif <em>Casilla Verif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Casilla Verif</em>'.
	 * @see wizard.CasillaVerif
	 * @generated
	 */
	EClass getCasillaVerif();

	/**
	 * Returns the meta object for the attribute '{@link wizard.CasillaVerif#isPorDef <em>Por Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Por Def</em>'.
	 * @see wizard.CasillaVerif#isPorDef()
	 * @see #getCasillaVerif()
	 * @generated
	 */
	EAttribute getCasillaVerif_PorDef();

	/**
	 * Returns the meta object for the container reference '{@link wizard.CasillaVerif#getPagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pagina</em>'.
	 * @see wizard.CasillaVerif#getPagina()
	 * @see #getCasillaVerif()
	 * @generated
	 */
	EReference getCasillaVerif_Pagina();

	/**
	 * Returns the meta object for the attribute '{@link wizard.CasillaVerif#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wizard.CasillaVerif#getName()
	 * @see #getCasillaVerif()
	 * @generated
	 */
	EAttribute getCasillaVerif_Name();

	/**
	 * Returns the meta object for class '{@link wizard.Boton <em>Boton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boton</em>'.
	 * @see wizard.Boton
	 * @generated
	 */
	EClass getBoton();

	/**
	 * Returns the meta object for the container reference '{@link wizard.Boton#getPagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pagina</em>'.
	 * @see wizard.Boton#getPagina()
	 * @see #getBoton()
	 * @generated
	 */
	EReference getBoton_Pagina();

	/**
	 * Returns the meta object for class '{@link wizard.BotonNavegar <em>Boton Navegar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boton Navegar</em>'.
	 * @see wizard.BotonNavegar
	 * @generated
	 */
	EClass getBotonNavegar();

	/**
	 * Returns the meta object for the containment reference list '{@link wizard.BotonNavegar#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Destino</em>'.
	 * @see wizard.BotonNavegar#getDestino()
	 * @see #getBotonNavegar()
	 * @generated
	 */
	EReference getBotonNavegar_Destino();

	/**
	 * Returns the meta object for class '{@link wizard.BotonMensaje <em>Boton Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boton Mensaje</em>'.
	 * @see wizard.BotonMensaje
	 * @generated
	 */
	EClass getBotonMensaje();

	/**
	 * Returns the meta object for the attribute '{@link wizard.BotonMensaje#getMensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mensaje</em>'.
	 * @see wizard.BotonMensaje#getMensaje()
	 * @see #getBotonMensaje()
	 * @generated
	 */
	EAttribute getBotonMensaje_Mensaje();

	/**
	 * Returns the meta object for class '{@link wizard.BotonCerrar <em>Boton Cerrar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boton Cerrar</em>'.
	 * @see wizard.BotonCerrar
	 * @generated
	 */
	EClass getBotonCerrar();

	/**
	 * Returns the meta object for class '{@link wizard.Destino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destino</em>'.
	 * @see wizard.Destino
	 * @generated
	 */
	EClass getDestino();

	/**
	 * Returns the meta object for the reference '{@link wizard.Destino#getCasilla <em>Casilla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Casilla</em>'.
	 * @see wizard.Destino#getCasilla()
	 * @see #getDestino()
	 * @generated
	 */
	EReference getDestino_Casilla();

	/**
	 * Returns the meta object for the reference '{@link wizard.Destino#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see wizard.Destino#getDestino()
	 * @see #getDestino()
	 * @generated
	 */
	EReference getDestino_Destino();

	/**
	 * Returns the meta object for the container reference '{@link wizard.Destino#getBoton <em>Boton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Boton</em>'.
	 * @see wizard.Destino#getBoton()
	 * @see #getDestino()
	 * @generated
	 */
	EReference getDestino_Boton();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WizardFactory getWizardFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link wizard.impl.WizardImpl <em>Wizard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.WizardImpl
		 * @see wizard.impl.WizardPackageImpl#getWizard()
		 * @generated
		 */
		EClass WIZARD = eINSTANCE.getWizard();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD__TITULO = eINSTANCE.getWizard_Titulo();

		/**
		 * The meta object literal for the '<em><b>Paginas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__PAGINAS = eINSTANCE.getWizard_Paginas();

		/**
		 * The meta object literal for the '<em><b>Pag Ini</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__PAG_INI = eINSTANCE.getWizard_PagIni();

		/**
		 * The meta object literal for the '{@link wizard.impl.PaginaImpl <em>Pagina</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.PaginaImpl
		 * @see wizard.impl.WizardPackageImpl#getPagina()
		 * @generated
		 */
		EClass PAGINA = eINSTANCE.getPagina();

		/**
		 * The meta object literal for the '<em><b>Campos Texto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA__CAMPOS_TEXTO = eINSTANCE.getPagina_CamposTexto();

		/**
		 * The meta object literal for the '<em><b>Casillas Verif</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA__CASILLAS_VERIF = eINSTANCE.getPagina_CasillasVerif();

		/**
		 * The meta object literal for the '<em><b>Botones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA__BOTONES = eINSTANCE.getPagina_Botones();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINA__NAME = eINSTANCE.getPagina_Name();

		/**
		 * The meta object literal for the '{@link wizard.impl.CampoImpl <em>Campo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.CampoImpl
		 * @see wizard.impl.WizardPackageImpl#getCampo()
		 * @generated
		 */
		EClass CAMPO = eINSTANCE.getCampo();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO__TAG = eINSTANCE.getCampo_Tag();

		/**
		 * The meta object literal for the '{@link wizard.impl.CampoTextoImpl <em>Campo Texto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.CampoTextoImpl
		 * @see wizard.impl.WizardPackageImpl#getCampoTexto()
		 * @generated
		 */
		EClass CAMPO_TEXTO = eINSTANCE.getCampoTexto();

		/**
		 * The meta object literal for the '<em><b>Opcional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_TEXTO__OPCIONAL = eINSTANCE.getCampoTexto_Opcional();

		/**
		 * The meta object literal for the '<em><b>Pagina</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPO_TEXTO__PAGINA = eINSTANCE.getCampoTexto_Pagina();

		/**
		 * The meta object literal for the '{@link wizard.impl.CasillaVerifImpl <em>Casilla Verif</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.CasillaVerifImpl
		 * @see wizard.impl.WizardPackageImpl#getCasillaVerif()
		 * @generated
		 */
		EClass CASILLA_VERIF = eINSTANCE.getCasillaVerif();

		/**
		 * The meta object literal for the '<em><b>Por Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASILLA_VERIF__POR_DEF = eINSTANCE.getCasillaVerif_PorDef();

		/**
		 * The meta object literal for the '<em><b>Pagina</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASILLA_VERIF__PAGINA = eINSTANCE.getCasillaVerif_Pagina();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASILLA_VERIF__NAME = eINSTANCE.getCasillaVerif_Name();

		/**
		 * The meta object literal for the '{@link wizard.impl.BotonImpl <em>Boton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.BotonImpl
		 * @see wizard.impl.WizardPackageImpl#getBoton()
		 * @generated
		 */
		EClass BOTON = eINSTANCE.getBoton();

		/**
		 * The meta object literal for the '<em><b>Pagina</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTON__PAGINA = eINSTANCE.getBoton_Pagina();

		/**
		 * The meta object literal for the '{@link wizard.impl.BotonNavegarImpl <em>Boton Navegar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.BotonNavegarImpl
		 * @see wizard.impl.WizardPackageImpl#getBotonNavegar()
		 * @generated
		 */
		EClass BOTON_NAVEGAR = eINSTANCE.getBotonNavegar();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTON_NAVEGAR__DESTINO = eINSTANCE.getBotonNavegar_Destino();

		/**
		 * The meta object literal for the '{@link wizard.impl.BotonMensajeImpl <em>Boton Mensaje</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.BotonMensajeImpl
		 * @see wizard.impl.WizardPackageImpl#getBotonMensaje()
		 * @generated
		 */
		EClass BOTON_MENSAJE = eINSTANCE.getBotonMensaje();

		/**
		 * The meta object literal for the '<em><b>Mensaje</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOTON_MENSAJE__MENSAJE = eINSTANCE.getBotonMensaje_Mensaje();

		/**
		 * The meta object literal for the '{@link wizard.impl.BotonCerrarImpl <em>Boton Cerrar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.BotonCerrarImpl
		 * @see wizard.impl.WizardPackageImpl#getBotonCerrar()
		 * @generated
		 */
		EClass BOTON_CERRAR = eINSTANCE.getBotonCerrar();

		/**
		 * The meta object literal for the '{@link wizard.impl.DestinoImpl <em>Destino</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.DestinoImpl
		 * @see wizard.impl.WizardPackageImpl#getDestino()
		 * @generated
		 */
		EClass DESTINO = eINSTANCE.getDestino();

		/**
		 * The meta object literal for the '<em><b>Casilla</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTINO__CASILLA = eINSTANCE.getDestino_Casilla();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTINO__DESTINO = eINSTANCE.getDestino_Destino();

		/**
		 * The meta object literal for the '<em><b>Boton</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTINO__BOTON = eINSTANCE.getDestino_Boton();

	}

} //WizardPackage
