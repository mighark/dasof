/**
 */
package centroscomerciales.impl;

import centroscomerciales.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CentroscomercialesFactoryImpl extends EFactoryImpl implements CentroscomercialesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CentroscomercialesFactory init() {
		try {
			CentroscomercialesFactory theCentroscomercialesFactory = (CentroscomercialesFactory)EPackage.Registry.INSTANCE.getEFactory(CentroscomercialesPackage.eNS_URI);
			if (theCentroscomercialesFactory != null) {
				return theCentroscomercialesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CentroscomercialesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentroscomercialesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CentroscomercialesPackage.CENTRO_COMERCIAL: return createCentroComercial();
			case CentroscomercialesPackage.PLANTA: return createPlanta();
			case CentroscomercialesPackage.TIENDA: return createTienda();
			case CentroscomercialesPackage.RESTAURANTE: return createRestaurante();
			case CentroscomercialesPackage.ESCALERA: return createEscalera();
			case CentroscomercialesPackage.ASCENSOR: return createAscensor();
			case CentroscomercialesPackage.ASEO: return createAseo();
			case CentroscomercialesPackage.ESPACIO_ABIERTO: return createEspacioAbierto();
			case CentroscomercialesPackage.APARCAMIENTO: return createAparcamiento();
			case CentroscomercialesPackage.ZONA_APARCAMIENTO: return createZonaAparcamiento();
			case CentroscomercialesPackage.PUERTA: return createPuerta();
			case CentroscomercialesPackage.SALIDA: return createSalida();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CentroscomercialesPackage.TIPO_ASEO:
				return createTipoAseoFromString(eDataType, initialValue);
			case CentroscomercialesPackage.DIRECCION:
				return createDireccionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CentroscomercialesPackage.TIPO_ASEO:
				return convertTipoAseoToString(eDataType, instanceValue);
			case CentroscomercialesPackage.DIRECCION:
				return convertDireccionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentroComercial createCentroComercial() {
		CentroComercialImpl centroComercial = new CentroComercialImpl();
		return centroComercial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Planta createPlanta() {
		PlantaImpl planta = new PlantaImpl();
		return planta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tienda createTienda() {
		TiendaImpl tienda = new TiendaImpl();
		return tienda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restaurante createRestaurante() {
		RestauranteImpl restaurante = new RestauranteImpl();
		return restaurante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escalera createEscalera() {
		EscaleraImpl escalera = new EscaleraImpl();
		return escalera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ascensor createAscensor() {
		AscensorImpl ascensor = new AscensorImpl();
		return ascensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aseo createAseo() {
		AseoImpl aseo = new AseoImpl();
		return aseo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EspacioAbierto createEspacioAbierto() {
		EspacioAbiertoImpl espacioAbierto = new EspacioAbiertoImpl();
		return espacioAbierto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aparcamiento createAparcamiento() {
		AparcamientoImpl aparcamiento = new AparcamientoImpl();
		return aparcamiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonaAparcamiento createZonaAparcamiento() {
		ZonaAparcamientoImpl zonaAparcamiento = new ZonaAparcamientoImpl();
		return zonaAparcamiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Puerta createPuerta() {
		PuertaImpl puerta = new PuertaImpl();
		return puerta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Salida createSalida() {
		SalidaImpl salida = new SalidaImpl();
		return salida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAseo createTipoAseoFromString(EDataType eDataType, String initialValue) {
		TipoAseo result = TipoAseo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoAseoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direccion createDireccionFromString(EDataType eDataType, String initialValue) {
		Direccion result = Direccion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDireccionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentroscomercialesPackage getCentroscomercialesPackage() {
		return (CentroscomercialesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CentroscomercialesPackage getPackage() {
		return CentroscomercialesPackage.eINSTANCE;
	}

} //CentroscomercialesFactoryImpl
