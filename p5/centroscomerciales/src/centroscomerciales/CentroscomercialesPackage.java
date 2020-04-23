/**
 */
package centroscomerciales;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see centroscomerciales.CentroscomercialesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface CentroscomercialesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "centroscomerciales";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CentroscomercialesPackage eINSTANCE = centroscomerciales.impl.CentroscomercialesPackageImpl.init();

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.CentroComercialImpl <em>Centro Comercial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.CentroComercialImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getCentroComercial()
	 * @generated
	 */
	int CENTRO_COMERCIAL = 0;

	/**
	 * The feature id for the '<em><b>Aforo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_COMERCIAL__AFORO = 0;

	/**
	 * The feature id for the '<em><b>Plantas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_COMERCIAL__PLANTAS = 1;

	/**
	 * The number of structural features of the '<em>Centro Comercial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_COMERCIAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Centro Comercial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_COMERCIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.PlantaImpl <em>Planta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.PlantaImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getPlanta()
	 * @generated
	 */
	int PLANTA = 1;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTA__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Elementos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTA__ELEMENTOS = 1;

	/**
	 * The feature id for the '<em><b>Puertas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTA__PUERTAS = 2;

	/**
	 * The feature id for the '<em><b>Salidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTA__SALIDAS = 3;

	/**
	 * The number of structural features of the '<em>Planta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Planta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.ObjetoImpl <em>Objeto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.ObjetoImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getObjeto()
	 * @generated
	 */
	int OBJETO = 2;

	/**
	 * The feature id for the '<em><b>Norte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO__NORTE = 0;

	/**
	 * The feature id for the '<em><b>Sur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO__SUR = 1;

	/**
	 * The feature id for the '<em><b>Este</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO__ESTE = 2;

	/**
	 * The feature id for the '<em><b>Oeste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO__OESTE = 3;

	/**
	 * The number of structural features of the '<em>Objeto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Objeto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.ElementoImpl <em>Elemento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.ElementoImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getElemento()
	 * @generated
	 */
	int ELEMENTO = 3;

	/**
	 * The feature id for the '<em><b>Norte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__NORTE = OBJETO__NORTE;

	/**
	 * The feature id for the '<em><b>Sur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__SUR = OBJETO__SUR;

	/**
	 * The feature id for the '<em><b>Este</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__ESTE = OBJETO__ESTE;

	/**
	 * The feature id for the '<em><b>Oeste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__OESTE = OBJETO__OESTE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__IDENTIFIER = OBJETO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Planta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__PLANTA = OBJETO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_FEATURE_COUNT = OBJETO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_OPERATION_COUNT = OBJETO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.ElementoAforoImpl <em>Elemento Aforo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.ElementoAforoImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getElementoAforo()
	 * @generated
	 */
	int ELEMENTO_AFORO = 4;

	/**
	 * The feature id for the '<em><b>Norte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_AFORO__NORTE = ELEMENTO__NORTE;

	/**
	 * The feature id for the '<em><b>Sur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_AFORO__SUR = ELEMENTO__SUR;

	/**
	 * The feature id for the '<em><b>Este</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_AFORO__ESTE = ELEMENTO__ESTE;

	/**
	 * The feature id for the '<em><b>Oeste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_AFORO__OESTE = ELEMENTO__OESTE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_AFORO__IDENTIFIER = ELEMENTO__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Planta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_AFORO__PLANTA = ELEMENTO__PLANTA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_AFORO__NOMBRE = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aforo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_AFORO__AFORO = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elemento Aforo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_AFORO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Elemento Aforo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_AFORO_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.TiendaImpl <em>Tienda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.TiendaImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getTienda()
	 * @generated
	 */
	int TIENDA = 5;

	/**
	 * The feature id for the '<em><b>Norte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__NORTE = ELEMENTO_AFORO__NORTE;

	/**
	 * The feature id for the '<em><b>Sur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__SUR = ELEMENTO_AFORO__SUR;

	/**
	 * The feature id for the '<em><b>Este</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__ESTE = ELEMENTO_AFORO__ESTE;

	/**
	 * The feature id for the '<em><b>Oeste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__OESTE = ELEMENTO_AFORO__OESTE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__IDENTIFIER = ELEMENTO_AFORO__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Planta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__PLANTA = ELEMENTO_AFORO__PLANTA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__NOMBRE = ELEMENTO_AFORO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Aforo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__AFORO = ELEMENTO_AFORO__AFORO;

	/**
	 * The number of structural features of the '<em>Tienda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA_FEATURE_COUNT = ELEMENTO_AFORO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tienda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA_OPERATION_COUNT = ELEMENTO_AFORO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.RestauranteImpl <em>Restaurante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.RestauranteImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getRestaurante()
	 * @generated
	 */
	int RESTAURANTE = 6;

	/**
	 * The feature id for the '<em><b>Norte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTE__NORTE = ELEMENTO_AFORO__NORTE;

	/**
	 * The feature id for the '<em><b>Sur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTE__SUR = ELEMENTO_AFORO__SUR;

	/**
	 * The feature id for the '<em><b>Este</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTE__ESTE = ELEMENTO_AFORO__ESTE;

	/**
	 * The feature id for the '<em><b>Oeste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTE__OESTE = ELEMENTO_AFORO__OESTE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTE__IDENTIFIER = ELEMENTO_AFORO__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Planta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTE__PLANTA = ELEMENTO_AFORO__PLANTA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTE__NOMBRE = ELEMENTO_AFORO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Aforo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTE__AFORO = ELEMENTO_AFORO__AFORO;

	/**
	 * The number of structural features of the '<em>Restaurante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTE_FEATURE_COUNT = ELEMENTO_AFORO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Restaurante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTE_OPERATION_COUNT = ELEMENTO_AFORO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.ElementoCambioPlantaImpl <em>Elemento Cambio Planta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.ElementoCambioPlantaImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getElementoCambioPlanta()
	 * @generated
	 */
	int ELEMENTO_CAMBIO_PLANTA = 7;

	/**
	 * The feature id for the '<em><b>Norte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CAMBIO_PLANTA__NORTE = ELEMENTO__NORTE;

	/**
	 * The feature id for the '<em><b>Sur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CAMBIO_PLANTA__SUR = ELEMENTO__SUR;

	/**
	 * The feature id for the '<em><b>Este</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CAMBIO_PLANTA__ESTE = ELEMENTO__ESTE;

	/**
	 * The feature id for the '<em><b>Oeste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CAMBIO_PLANTA__OESTE = ELEMENTO__OESTE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CAMBIO_PLANTA__IDENTIFIER = ELEMENTO__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Planta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CAMBIO_PLANTA__PLANTA = ELEMENTO__PLANTA;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CAMBIO_PLANTA__DESTINO = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elemento Cambio Planta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CAMBIO_PLANTA_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Elemento Cambio Planta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CAMBIO_PLANTA_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.EscaleraImpl <em>Escalera</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.EscaleraImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getEscalera()
	 * @generated
	 */
	int ESCALERA = 8;

	/**
	 * The feature id for the '<em><b>Norte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALERA__NORTE = ELEMENTO_CAMBIO_PLANTA__NORTE;

	/**
	 * The feature id for the '<em><b>Sur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALERA__SUR = ELEMENTO_CAMBIO_PLANTA__SUR;

	/**
	 * The feature id for the '<em><b>Este</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALERA__ESTE = ELEMENTO_CAMBIO_PLANTA__ESTE;

	/**
	 * The feature id for the '<em><b>Oeste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALERA__OESTE = ELEMENTO_CAMBIO_PLANTA__OESTE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALERA__IDENTIFIER = ELEMENTO_CAMBIO_PLANTA__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Planta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALERA__PLANTA = ELEMENTO_CAMBIO_PLANTA__PLANTA;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALERA__DESTINO = ELEMENTO_CAMBIO_PLANTA__DESTINO;

	/**
	 * The number of structural features of the '<em>Escalera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALERA_FEATURE_COUNT = ELEMENTO_CAMBIO_PLANTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Escalera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALERA_OPERATION_COUNT = ELEMENTO_CAMBIO_PLANTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.AscensorImpl <em>Ascensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.AscensorImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getAscensor()
	 * @generated
	 */
	int ASCENSOR = 9;

	/**
	 * The feature id for the '<em><b>Norte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCENSOR__NORTE = ELEMENTO_CAMBIO_PLANTA__NORTE;

	/**
	 * The feature id for the '<em><b>Sur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCENSOR__SUR = ELEMENTO_CAMBIO_PLANTA__SUR;

	/**
	 * The feature id for the '<em><b>Este</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCENSOR__ESTE = ELEMENTO_CAMBIO_PLANTA__ESTE;

	/**
	 * The feature id for the '<em><b>Oeste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCENSOR__OESTE = ELEMENTO_CAMBIO_PLANTA__OESTE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCENSOR__IDENTIFIER = ELEMENTO_CAMBIO_PLANTA__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Planta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCENSOR__PLANTA = ELEMENTO_CAMBIO_PLANTA__PLANTA;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCENSOR__DESTINO = ELEMENTO_CAMBIO_PLANTA__DESTINO;

	/**
	 * The number of structural features of the '<em>Ascensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCENSOR_FEATURE_COUNT = ELEMENTO_CAMBIO_PLANTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ascensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCENSOR_OPERATION_COUNT = ELEMENTO_CAMBIO_PLANTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.AseoImpl <em>Aseo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.AseoImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getAseo()
	 * @generated
	 */
	int ASEO = 10;

	/**
	 * The feature id for the '<em><b>Norte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEO__NORTE = ELEMENTO__NORTE;

	/**
	 * The feature id for the '<em><b>Sur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEO__SUR = ELEMENTO__SUR;

	/**
	 * The feature id for the '<em><b>Este</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEO__ESTE = ELEMENTO__ESTE;

	/**
	 * The feature id for the '<em><b>Oeste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEO__OESTE = ELEMENTO__OESTE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEO__IDENTIFIER = ELEMENTO__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Planta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEO__PLANTA = ELEMENTO__PLANTA;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEO__TIPO = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aseo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aseo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEO_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.EspacioAbiertoImpl <em>Espacio Abierto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.EspacioAbiertoImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getEspacioAbierto()
	 * @generated
	 */
	int ESPACIO_ABIERTO = 11;

	/**
	 * The feature id for the '<em><b>Norte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPACIO_ABIERTO__NORTE = ELEMENTO__NORTE;

	/**
	 * The feature id for the '<em><b>Sur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPACIO_ABIERTO__SUR = ELEMENTO__SUR;

	/**
	 * The feature id for the '<em><b>Este</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPACIO_ABIERTO__ESTE = ELEMENTO__ESTE;

	/**
	 * The feature id for the '<em><b>Oeste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPACIO_ABIERTO__OESTE = ELEMENTO__OESTE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPACIO_ABIERTO__IDENTIFIER = ELEMENTO__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Planta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPACIO_ABIERTO__PLANTA = ELEMENTO__PLANTA;

	/**
	 * The number of structural features of the '<em>Espacio Abierto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPACIO_ABIERTO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Espacio Abierto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPACIO_ABIERTO_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.AparcamientoImpl <em>Aparcamiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.AparcamientoImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getAparcamiento()
	 * @generated
	 */
	int APARCAMIENTO = 12;

	/**
	 * The feature id for the '<em><b>Norte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARCAMIENTO__NORTE = ELEMENTO__NORTE;

	/**
	 * The feature id for the '<em><b>Sur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARCAMIENTO__SUR = ELEMENTO__SUR;

	/**
	 * The feature id for the '<em><b>Este</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARCAMIENTO__ESTE = ELEMENTO__ESTE;

	/**
	 * The feature id for the '<em><b>Oeste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARCAMIENTO__OESTE = ELEMENTO__OESTE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARCAMIENTO__IDENTIFIER = ELEMENTO__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Planta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARCAMIENTO__PLANTA = ELEMENTO__PLANTA;

	/**
	 * The feature id for the '<em><b>Zonas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARCAMIENTO__ZONAS = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aparcamiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARCAMIENTO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aparcamiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARCAMIENTO_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.ZonaAparcamientoImpl <em>Zona Aparcamiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.ZonaAparcamientoImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getZonaAparcamiento()
	 * @generated
	 */
	int ZONA_APARCAMIENTO = 13;

	/**
	 * The feature id for the '<em><b>Plazas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_APARCAMIENTO__PLAZAS = 0;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_APARCAMIENTO__PRECIO = 1;

	/**
	 * The feature id for the '<em><b>Uso Reservado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_APARCAMIENTO__USO_RESERVADO = 2;

	/**
	 * The number of structural features of the '<em>Zona Aparcamiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_APARCAMIENTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Zona Aparcamiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_APARCAMIENTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.PuertaImpl <em>Puerta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.PuertaImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getPuerta()
	 * @generated
	 */
	int PUERTA = 14;

	/**
	 * The feature id for the '<em><b>Norte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUERTA__NORTE = OBJETO__NORTE;

	/**
	 * The feature id for the '<em><b>Sur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUERTA__SUR = OBJETO__SUR;

	/**
	 * The feature id for the '<em><b>Este</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUERTA__ESTE = OBJETO__ESTE;

	/**
	 * The feature id for the '<em><b>Oeste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUERTA__OESTE = OBJETO__OESTE;

	/**
	 * The feature id for the '<em><b>Planta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUERTA__PLANTA = OBJETO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Puerta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUERTA_FEATURE_COUNT = OBJETO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Puerta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUERTA_OPERATION_COUNT = OBJETO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.impl.SalidaImpl <em>Salida</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.impl.SalidaImpl
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getSalida()
	 * @generated
	 */
	int SALIDA = 15;

	/**
	 * The feature id for the '<em><b>Norte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__NORTE = OBJETO__NORTE;

	/**
	 * The feature id for the '<em><b>Sur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__SUR = OBJETO__SUR;

	/**
	 * The feature id for the '<em><b>Este</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__ESTE = OBJETO__ESTE;

	/**
	 * The feature id for the '<em><b>Oeste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__OESTE = OBJETO__OESTE;

	/**
	 * The feature id for the '<em><b>Planta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__PLANTA = OBJETO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Salida</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_FEATURE_COUNT = OBJETO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Salida</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_OPERATION_COUNT = OBJETO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link centroscomerciales.TipoAseo <em>Tipo Aseo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.TipoAseo
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getTipoAseo()
	 * @generated
	 */
	int TIPO_ASEO = 16;

	/**
	 * The meta object id for the '{@link centroscomerciales.Direccion <em>Direccion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see centroscomerciales.Direccion
	 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getDireccion()
	 * @generated
	 */
	int DIRECCION = 17;


	/**
	 * Returns the meta object for class '{@link centroscomerciales.CentroComercial <em>Centro Comercial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Centro Comercial</em>'.
	 * @see centroscomerciales.CentroComercial
	 * @generated
	 */
	EClass getCentroComercial();

	/**
	 * Returns the meta object for the attribute '{@link centroscomerciales.CentroComercial#getAforo <em>Aforo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aforo</em>'.
	 * @see centroscomerciales.CentroComercial#getAforo()
	 * @see #getCentroComercial()
	 * @generated
	 */
	EAttribute getCentroComercial_Aforo();

	/**
	 * Returns the meta object for the containment reference list '{@link centroscomerciales.CentroComercial#getPlantas <em>Plantas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plantas</em>'.
	 * @see centroscomerciales.CentroComercial#getPlantas()
	 * @see #getCentroComercial()
	 * @generated
	 */
	EReference getCentroComercial_Plantas();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.Planta <em>Planta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planta</em>'.
	 * @see centroscomerciales.Planta
	 * @generated
	 */
	EClass getPlanta();

	/**
	 * Returns the meta object for the attribute '{@link centroscomerciales.Planta#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see centroscomerciales.Planta#getNumero()
	 * @see #getPlanta()
	 * @generated
	 */
	EAttribute getPlanta_Numero();

	/**
	 * Returns the meta object for the containment reference list '{@link centroscomerciales.Planta#getElementos <em>Elementos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementos</em>'.
	 * @see centroscomerciales.Planta#getElementos()
	 * @see #getPlanta()
	 * @generated
	 */
	EReference getPlanta_Elementos();

	/**
	 * Returns the meta object for the containment reference list '{@link centroscomerciales.Planta#getPuertas <em>Puertas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Puertas</em>'.
	 * @see centroscomerciales.Planta#getPuertas()
	 * @see #getPlanta()
	 * @generated
	 */
	EReference getPlanta_Puertas();

	/**
	 * Returns the meta object for the containment reference list '{@link centroscomerciales.Planta#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Salidas</em>'.
	 * @see centroscomerciales.Planta#getSalidas()
	 * @see #getPlanta()
	 * @generated
	 */
	EReference getPlanta_Salidas();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.Objeto <em>Objeto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objeto</em>'.
	 * @see centroscomerciales.Objeto
	 * @generated
	 */
	EClass getObjeto();

	/**
	 * Returns the meta object for the reference '{@link centroscomerciales.Objeto#getNorte <em>Norte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Norte</em>'.
	 * @see centroscomerciales.Objeto#getNorte()
	 * @see #getObjeto()
	 * @generated
	 */
	EReference getObjeto_Norte();

	/**
	 * Returns the meta object for the reference '{@link centroscomerciales.Objeto#getSur <em>Sur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sur</em>'.
	 * @see centroscomerciales.Objeto#getSur()
	 * @see #getObjeto()
	 * @generated
	 */
	EReference getObjeto_Sur();

	/**
	 * Returns the meta object for the reference '{@link centroscomerciales.Objeto#getEste <em>Este</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Este</em>'.
	 * @see centroscomerciales.Objeto#getEste()
	 * @see #getObjeto()
	 * @generated
	 */
	EReference getObjeto_Este();

	/**
	 * Returns the meta object for the reference '{@link centroscomerciales.Objeto#getOeste <em>Oeste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Oeste</em>'.
	 * @see centroscomerciales.Objeto#getOeste()
	 * @see #getObjeto()
	 * @generated
	 */
	EReference getObjeto_Oeste();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento</em>'.
	 * @see centroscomerciales.Elemento
	 * @generated
	 */
	EClass getElemento();

	/**
	 * Returns the meta object for the attribute '{@link centroscomerciales.Elemento#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see centroscomerciales.Elemento#getIdentifier()
	 * @see #getElemento()
	 * @generated
	 */
	EAttribute getElemento_Identifier();

	/**
	 * Returns the meta object for the container reference '{@link centroscomerciales.Elemento#getPlanta <em>Planta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Planta</em>'.
	 * @see centroscomerciales.Elemento#getPlanta()
	 * @see #getElemento()
	 * @generated
	 */
	EReference getElemento_Planta();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.ElementoAforo <em>Elemento Aforo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento Aforo</em>'.
	 * @see centroscomerciales.ElementoAforo
	 * @generated
	 */
	EClass getElementoAforo();

	/**
	 * Returns the meta object for the attribute '{@link centroscomerciales.ElementoAforo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see centroscomerciales.ElementoAforo#getNombre()
	 * @see #getElementoAforo()
	 * @generated
	 */
	EAttribute getElementoAforo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link centroscomerciales.ElementoAforo#getAforo <em>Aforo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aforo</em>'.
	 * @see centroscomerciales.ElementoAforo#getAforo()
	 * @see #getElementoAforo()
	 * @generated
	 */
	EAttribute getElementoAforo_Aforo();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.Tienda <em>Tienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tienda</em>'.
	 * @see centroscomerciales.Tienda
	 * @generated
	 */
	EClass getTienda();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.Restaurante <em>Restaurante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restaurante</em>'.
	 * @see centroscomerciales.Restaurante
	 * @generated
	 */
	EClass getRestaurante();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.ElementoCambioPlanta <em>Elemento Cambio Planta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento Cambio Planta</em>'.
	 * @see centroscomerciales.ElementoCambioPlanta
	 * @generated
	 */
	EClass getElementoCambioPlanta();

	/**
	 * Returns the meta object for the reference list '{@link centroscomerciales.ElementoCambioPlanta#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Destino</em>'.
	 * @see centroscomerciales.ElementoCambioPlanta#getDestino()
	 * @see #getElementoCambioPlanta()
	 * @generated
	 */
	EReference getElementoCambioPlanta_Destino();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.Escalera <em>Escalera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Escalera</em>'.
	 * @see centroscomerciales.Escalera
	 * @generated
	 */
	EClass getEscalera();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.Ascensor <em>Ascensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ascensor</em>'.
	 * @see centroscomerciales.Ascensor
	 * @generated
	 */
	EClass getAscensor();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.Aseo <em>Aseo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aseo</em>'.
	 * @see centroscomerciales.Aseo
	 * @generated
	 */
	EClass getAseo();

	/**
	 * Returns the meta object for the attribute '{@link centroscomerciales.Aseo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see centroscomerciales.Aseo#getTipo()
	 * @see #getAseo()
	 * @generated
	 */
	EAttribute getAseo_Tipo();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.EspacioAbierto <em>Espacio Abierto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Espacio Abierto</em>'.
	 * @see centroscomerciales.EspacioAbierto
	 * @generated
	 */
	EClass getEspacioAbierto();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.Aparcamiento <em>Aparcamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aparcamiento</em>'.
	 * @see centroscomerciales.Aparcamiento
	 * @generated
	 */
	EClass getAparcamiento();

	/**
	 * Returns the meta object for the containment reference list '{@link centroscomerciales.Aparcamiento#getZonas <em>Zonas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zonas</em>'.
	 * @see centroscomerciales.Aparcamiento#getZonas()
	 * @see #getAparcamiento()
	 * @generated
	 */
	EReference getAparcamiento_Zonas();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.ZonaAparcamiento <em>Zona Aparcamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zona Aparcamiento</em>'.
	 * @see centroscomerciales.ZonaAparcamiento
	 * @generated
	 */
	EClass getZonaAparcamiento();

	/**
	 * Returns the meta object for the attribute '{@link centroscomerciales.ZonaAparcamiento#getPlazas <em>Plazas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plazas</em>'.
	 * @see centroscomerciales.ZonaAparcamiento#getPlazas()
	 * @see #getZonaAparcamiento()
	 * @generated
	 */
	EAttribute getZonaAparcamiento_Plazas();

	/**
	 * Returns the meta object for the attribute '{@link centroscomerciales.ZonaAparcamiento#getPrecio <em>Precio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio</em>'.
	 * @see centroscomerciales.ZonaAparcamiento#getPrecio()
	 * @see #getZonaAparcamiento()
	 * @generated
	 */
	EAttribute getZonaAparcamiento_Precio();

	/**
	 * Returns the meta object for the attribute '{@link centroscomerciales.ZonaAparcamiento#isUsoReservado <em>Uso Reservado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uso Reservado</em>'.
	 * @see centroscomerciales.ZonaAparcamiento#isUsoReservado()
	 * @see #getZonaAparcamiento()
	 * @generated
	 */
	EAttribute getZonaAparcamiento_UsoReservado();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.Puerta <em>Puerta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puerta</em>'.
	 * @see centroscomerciales.Puerta
	 * @generated
	 */
	EClass getPuerta();

	/**
	 * Returns the meta object for the container reference '{@link centroscomerciales.Puerta#getPlanta <em>Planta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Planta</em>'.
	 * @see centroscomerciales.Puerta#getPlanta()
	 * @see #getPuerta()
	 * @generated
	 */
	EReference getPuerta_Planta();

	/**
	 * Returns the meta object for class '{@link centroscomerciales.Salida <em>Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salida</em>'.
	 * @see centroscomerciales.Salida
	 * @generated
	 */
	EClass getSalida();

	/**
	 * Returns the meta object for the container reference '{@link centroscomerciales.Salida#getPlanta <em>Planta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Planta</em>'.
	 * @see centroscomerciales.Salida#getPlanta()
	 * @see #getSalida()
	 * @generated
	 */
	EReference getSalida_Planta();

	/**
	 * Returns the meta object for enum '{@link centroscomerciales.TipoAseo <em>Tipo Aseo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Aseo</em>'.
	 * @see centroscomerciales.TipoAseo
	 * @generated
	 */
	EEnum getTipoAseo();

	/**
	 * Returns the meta object for enum '{@link centroscomerciales.Direccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direccion</em>'.
	 * @see centroscomerciales.Direccion
	 * @generated
	 */
	EEnum getDireccion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CentroscomercialesFactory getCentroscomercialesFactory();

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
		 * The meta object literal for the '{@link centroscomerciales.impl.CentroComercialImpl <em>Centro Comercial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.CentroComercialImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getCentroComercial()
		 * @generated
		 */
		EClass CENTRO_COMERCIAL = eINSTANCE.getCentroComercial();

		/**
		 * The meta object literal for the '<em><b>Aforo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENTRO_COMERCIAL__AFORO = eINSTANCE.getCentroComercial_Aforo();

		/**
		 * The meta object literal for the '<em><b>Plantas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTRO_COMERCIAL__PLANTAS = eINSTANCE.getCentroComercial_Plantas();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.PlantaImpl <em>Planta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.PlantaImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getPlanta()
		 * @generated
		 */
		EClass PLANTA = eINSTANCE.getPlanta();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANTA__NUMERO = eINSTANCE.getPlanta_Numero();

		/**
		 * The meta object literal for the '<em><b>Elementos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTA__ELEMENTOS = eINSTANCE.getPlanta_Elementos();

		/**
		 * The meta object literal for the '<em><b>Puertas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTA__PUERTAS = eINSTANCE.getPlanta_Puertas();

		/**
		 * The meta object literal for the '<em><b>Salidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTA__SALIDAS = eINSTANCE.getPlanta_Salidas();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.ObjetoImpl <em>Objeto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.ObjetoImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getObjeto()
		 * @generated
		 */
		EClass OBJETO = eINSTANCE.getObjeto();

		/**
		 * The meta object literal for the '<em><b>Norte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJETO__NORTE = eINSTANCE.getObjeto_Norte();

		/**
		 * The meta object literal for the '<em><b>Sur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJETO__SUR = eINSTANCE.getObjeto_Sur();

		/**
		 * The meta object literal for the '<em><b>Este</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJETO__ESTE = eINSTANCE.getObjeto_Este();

		/**
		 * The meta object literal for the '<em><b>Oeste</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJETO__OESTE = eINSTANCE.getObjeto_Oeste();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.ElementoImpl <em>Elemento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.ElementoImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getElemento()
		 * @generated
		 */
		EClass ELEMENTO = eINSTANCE.getElemento();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO__IDENTIFIER = eINSTANCE.getElemento_Identifier();

		/**
		 * The meta object literal for the '<em><b>Planta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO__PLANTA = eINSTANCE.getElemento_Planta();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.ElementoAforoImpl <em>Elemento Aforo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.ElementoAforoImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getElementoAforo()
		 * @generated
		 */
		EClass ELEMENTO_AFORO = eINSTANCE.getElementoAforo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO_AFORO__NOMBRE = eINSTANCE.getElementoAforo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Aforo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO_AFORO__AFORO = eINSTANCE.getElementoAforo_Aforo();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.TiendaImpl <em>Tienda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.TiendaImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getTienda()
		 * @generated
		 */
		EClass TIENDA = eINSTANCE.getTienda();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.RestauranteImpl <em>Restaurante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.RestauranteImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getRestaurante()
		 * @generated
		 */
		EClass RESTAURANTE = eINSTANCE.getRestaurante();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.ElementoCambioPlantaImpl <em>Elemento Cambio Planta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.ElementoCambioPlantaImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getElementoCambioPlanta()
		 * @generated
		 */
		EClass ELEMENTO_CAMBIO_PLANTA = eINSTANCE.getElementoCambioPlanta();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_CAMBIO_PLANTA__DESTINO = eINSTANCE.getElementoCambioPlanta_Destino();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.EscaleraImpl <em>Escalera</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.EscaleraImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getEscalera()
		 * @generated
		 */
		EClass ESCALERA = eINSTANCE.getEscalera();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.AscensorImpl <em>Ascensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.AscensorImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getAscensor()
		 * @generated
		 */
		EClass ASCENSOR = eINSTANCE.getAscensor();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.AseoImpl <em>Aseo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.AseoImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getAseo()
		 * @generated
		 */
		EClass ASEO = eINSTANCE.getAseo();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASEO__TIPO = eINSTANCE.getAseo_Tipo();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.EspacioAbiertoImpl <em>Espacio Abierto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.EspacioAbiertoImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getEspacioAbierto()
		 * @generated
		 */
		EClass ESPACIO_ABIERTO = eINSTANCE.getEspacioAbierto();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.AparcamientoImpl <em>Aparcamiento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.AparcamientoImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getAparcamiento()
		 * @generated
		 */
		EClass APARCAMIENTO = eINSTANCE.getAparcamiento();

		/**
		 * The meta object literal for the '<em><b>Zonas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APARCAMIENTO__ZONAS = eINSTANCE.getAparcamiento_Zonas();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.ZonaAparcamientoImpl <em>Zona Aparcamiento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.ZonaAparcamientoImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getZonaAparcamiento()
		 * @generated
		 */
		EClass ZONA_APARCAMIENTO = eINSTANCE.getZonaAparcamiento();

		/**
		 * The meta object literal for the '<em><b>Plazas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONA_APARCAMIENTO__PLAZAS = eINSTANCE.getZonaAparcamiento_Plazas();

		/**
		 * The meta object literal for the '<em><b>Precio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONA_APARCAMIENTO__PRECIO = eINSTANCE.getZonaAparcamiento_Precio();

		/**
		 * The meta object literal for the '<em><b>Uso Reservado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONA_APARCAMIENTO__USO_RESERVADO = eINSTANCE.getZonaAparcamiento_UsoReservado();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.PuertaImpl <em>Puerta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.PuertaImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getPuerta()
		 * @generated
		 */
		EClass PUERTA = eINSTANCE.getPuerta();

		/**
		 * The meta object literal for the '<em><b>Planta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUERTA__PLANTA = eINSTANCE.getPuerta_Planta();

		/**
		 * The meta object literal for the '{@link centroscomerciales.impl.SalidaImpl <em>Salida</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.impl.SalidaImpl
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getSalida()
		 * @generated
		 */
		EClass SALIDA = eINSTANCE.getSalida();

		/**
		 * The meta object literal for the '<em><b>Planta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALIDA__PLANTA = eINSTANCE.getSalida_Planta();

		/**
		 * The meta object literal for the '{@link centroscomerciales.TipoAseo <em>Tipo Aseo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.TipoAseo
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getTipoAseo()
		 * @generated
		 */
		EEnum TIPO_ASEO = eINSTANCE.getTipoAseo();

		/**
		 * The meta object literal for the '{@link centroscomerciales.Direccion <em>Direccion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see centroscomerciales.Direccion
		 * @see centroscomerciales.impl.CentroscomercialesPackageImpl#getDireccion()
		 * @generated
		 */
		EEnum DIRECCION = eINSTANCE.getDireccion();

	}

} //CentroscomercialesPackage
