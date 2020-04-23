/**
 */
package centroscomerciales.util;

import centroscomerciales.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see centroscomerciales.CentroscomercialesPackage
 * @generated
 */
public class CentroscomercialesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CentroscomercialesValidator INSTANCE = new CentroscomercialesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "centroscomerciales";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentroscomercialesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CentroscomercialesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CentroscomercialesPackage.CENTRO_COMERCIAL:
				return validateCentroComercial((CentroComercial)value, diagnostics, context);
			case CentroscomercialesPackage.PLANTA:
				return validatePlanta((Planta)value, diagnostics, context);
			case CentroscomercialesPackage.OBJETO:
				return validateObjeto((Objeto)value, diagnostics, context);
			case CentroscomercialesPackage.ELEMENTO:
				return validateElemento((Elemento)value, diagnostics, context);
			case CentroscomercialesPackage.ELEMENTO_AFORO:
				return validateElementoAforo((ElementoAforo)value, diagnostics, context);
			case CentroscomercialesPackage.TIENDA:
				return validateTienda((Tienda)value, diagnostics, context);
			case CentroscomercialesPackage.RESTAURANTE:
				return validateRestaurante((Restaurante)value, diagnostics, context);
			case CentroscomercialesPackage.ELEMENTO_CAMBIO_PLANTA:
				return validateElementoCambioPlanta((ElementoCambioPlanta)value, diagnostics, context);
			case CentroscomercialesPackage.ESCALERA:
				return validateEscalera((Escalera)value, diagnostics, context);
			case CentroscomercialesPackage.ASCENSOR:
				return validateAscensor((Ascensor)value, diagnostics, context);
			case CentroscomercialesPackage.ASEO:
				return validateAseo((Aseo)value, diagnostics, context);
			case CentroscomercialesPackage.ESPACIO_ABIERTO:
				return validateEspacioAbierto((EspacioAbierto)value, diagnostics, context);
			case CentroscomercialesPackage.APARCAMIENTO:
				return validateAparcamiento((Aparcamiento)value, diagnostics, context);
			case CentroscomercialesPackage.ZONA_APARCAMIENTO:
				return validateZonaAparcamiento((ZonaAparcamiento)value, diagnostics, context);
			case CentroscomercialesPackage.PUERTA:
				return validatePuerta((Puerta)value, diagnostics, context);
			case CentroscomercialesPackage.SALIDA:
				return validateSalida((Salida)value, diagnostics, context);
			case CentroscomercialesPackage.TIPO_ASEO:
				return validateTipoAseo((TipoAseo)value, diagnostics, context);
			case CentroscomercialesPackage.DIRECCION:
				return validateDireccion((Direccion)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCentroComercial(CentroComercial centroComercial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(centroComercial, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(centroComercial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(centroComercial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(centroComercial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(centroComercial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(centroComercial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(centroComercial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(centroComercial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(centroComercial, diagnostics, context);
		if (result || diagnostics != null) result &= validateCentroComercial_IAforoCentro(centroComercial, diagnostics, context);
		if (result || diagnostics != null) result &= validateCentroComercial_IAseosIguales(centroComercial, diagnostics, context);
		if (result || diagnostics != null) result &= validateCentroComercial_IPlantasNumeros(centroComercial, diagnostics, context);
		if (result || diagnostics != null) result &= validateCentroComercial_IHayTienda(centroComercial, diagnostics, context);
		if (result || diagnostics != null) result &= validateCentroComercial_IAparcamientosPlanta(centroComercial, diagnostics, context);
		if (result || diagnostics != null) result &= validateCentroComercial_IHayPuerta(centroComercial, diagnostics, context);
		if (result || diagnostics != null) result &= validateCentroComercial_IEscalerasPorPlanta(centroComercial, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IAforoCentro constraint of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CENTRO_COMERCIAL__IAFORO_CENTRO__EEXPRESSION = "aforo <= plantas->collect(elementos->select(e| e.oclIsKindOf(ElementoAforo))->collect(e | e.oclAsType(ElementoAforo).aforo)->sum())->sum()";

	/**
	 * Validates the IAforoCentro constraint of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCentroComercial_IAforoCentro(CentroComercial centroComercial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CentroscomercialesPackage.Literals.CENTRO_COMERCIAL,
				 centroComercial,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IAforoCentro",
				 CENTRO_COMERCIAL__IAFORO_CENTRO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IAseosIguales constraint of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CENTRO_COMERCIAL__IASEOS_IGUALES__EEXPRESSION = "plantas->collect(elementos->select(e| e.oclIsKindOf(Aseo))->select(e| e.oclAsType(Aseo).tipo = TipoAseo::masculino)->size())->sum()\n" +
		"\t\t= plantas->collect(elementos->select(e| e.oclIsKindOf(Aseo))->select(e| e.oclAsType(Aseo).tipo = TipoAseo::femenino)->size())->sum()";

	/**
	 * Validates the IAseosIguales constraint of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCentroComercial_IAseosIguales(CentroComercial centroComercial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CentroscomercialesPackage.Literals.CENTRO_COMERCIAL,
				 centroComercial,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IAseosIguales",
				 CENTRO_COMERCIAL__IASEOS_IGUALES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IPlantasNumeros constraint of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CENTRO_COMERCIAL__IPLANTAS_NUMEROS__EEXPRESSION = "plantas->isUnique(numero) and plantas->forAll((numero >= 0) and numero < plantas->size())";

	/**
	 * Validates the IPlantasNumeros constraint of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCentroComercial_IPlantasNumeros(CentroComercial centroComercial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CentroscomercialesPackage.Literals.CENTRO_COMERCIAL,
				 centroComercial,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IPlantasNumeros",
				 CENTRO_COMERCIAL__IPLANTAS_NUMEROS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IHayTienda constraint of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CENTRO_COMERCIAL__IHAY_TIENDA__EEXPRESSION = "plantas->exists(elementos->select(e| e.oclIsKindOf(Tienda))->notEmpty())";

	/**
	 * Validates the IHayTienda constraint of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCentroComercial_IHayTienda(CentroComercial centroComercial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CentroscomercialesPackage.Literals.CENTRO_COMERCIAL,
				 centroComercial,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IHayTienda",
				 CENTRO_COMERCIAL__IHAY_TIENDA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IAparcamientosPlanta constraint of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CENTRO_COMERCIAL__IAPARCAMIENTOS_PLANTA__EEXPRESSION = "plantas->select(elementos->exists(e| e.oclIsKindOf(Aparcamiento)))->forAll(numero = 0) or plantas->select(elementos->exists(e| e.oclIsKindOf(Aparcamiento)))->forAll(numero = plantas->size() - 1)";

	/**
	 * Validates the IAparcamientosPlanta constraint of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCentroComercial_IAparcamientosPlanta(CentroComercial centroComercial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CentroscomercialesPackage.Literals.CENTRO_COMERCIAL,
				 centroComercial,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IAparcamientosPlanta",
				 CENTRO_COMERCIAL__IAPARCAMIENTOS_PLANTA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IHayPuerta constraint of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CENTRO_COMERCIAL__IHAY_PUERTA__EEXPRESSION = "plantas->exists(v| v.puertas->notEmpty())";

	/**
	 * Validates the IHayPuerta constraint of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCentroComercial_IHayPuerta(CentroComercial centroComercial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CentroscomercialesPackage.Literals.CENTRO_COMERCIAL,
				 centroComercial,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IHayPuerta",
				 CENTRO_COMERCIAL__IHAY_PUERTA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IEscalerasPorPlanta constraint of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CENTRO_COMERCIAL__IESCALERAS_POR_PLANTA__EEXPRESSION = "(plantas->size() = 1) or (plantas->forAll(p | p.elementos->exists(oclIsKindOf(ElementoCambioPlanta))))";

	/**
	 * Validates the IEscalerasPorPlanta constraint of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCentroComercial_IEscalerasPorPlanta(CentroComercial centroComercial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CentroscomercialesPackage.Literals.CENTRO_COMERCIAL,
				 centroComercial,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IEscalerasPorPlanta",
				 CENTRO_COMERCIAL__IESCALERAS_POR_PLANTA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanta(Planta planta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planta, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(planta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(planta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planta, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanta_IHayEspacioAbierto(planta, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanta_IAparcamientosOTiendas(planta, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IHayEspacioAbierto constraint of '<em>Planta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLANTA__IHAY_ESPACIO_ABIERTO__EEXPRESSION = "elementos->exists(oclIsKindOf(EspacioAbierto))";

	/**
	 * Validates the IHayEspacioAbierto constraint of '<em>Planta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanta_IHayEspacioAbierto(Planta planta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CentroscomercialesPackage.Literals.PLANTA,
				 planta,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IHayEspacioAbierto",
				 PLANTA__IHAY_ESPACIO_ABIERTO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IAparcamientosOTiendas constraint of '<em>Planta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLANTA__IAPARCAMIENTOS_OTIENDAS__EEXPRESSION = "not(elementos->exists(oclIsKindOf(ElementoAforo)) and elementos->exists(oclIsKindOf(Aparcamiento)))";

	/**
	 * Validates the IAparcamientosOTiendas constraint of '<em>Planta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanta_IAparcamientosOTiendas(Planta planta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CentroscomercialesPackage.Literals.PLANTA,
				 planta,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IAparcamientosOTiendas",
				 PLANTA__IAPARCAMIENTOS_OTIENDAS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjeto(Objeto objeto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objeto, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElemento(Elemento elemento, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elemento, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementoAforo(ElementoAforo elementoAforo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementoAforo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTienda(Tienda tienda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tienda, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestaurante(Restaurante restaurante, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restaurante, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementoCambioPlanta(ElementoCambioPlanta elementoCambioPlanta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elementoCambioPlanta, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(elementoCambioPlanta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elementoCambioPlanta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elementoCambioPlanta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(elementoCambioPlanta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elementoCambioPlanta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(elementoCambioPlanta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(elementoCambioPlanta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elementoCambioPlanta, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementoCambioPlanta_escaleras(elementoCambioPlanta, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the escaleras constraint of '<em>Elemento Cambio Planta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ELEMENTO_CAMBIO_PLANTA__ESCALERAS__EEXPRESSION = "destino->forAll(d | (self.planta.numero = d.planta.numero + 1) or (self.planta.numero = d.planta.numero - 1))";

	/**
	 * Validates the escaleras constraint of '<em>Elemento Cambio Planta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementoCambioPlanta_escaleras(ElementoCambioPlanta elementoCambioPlanta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CentroscomercialesPackage.Literals.ELEMENTO_CAMBIO_PLANTA,
				 elementoCambioPlanta,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "escaleras",
				 ELEMENTO_CAMBIO_PLANTA__ESCALERAS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEscalera(Escalera escalera, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(escalera, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(escalera, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(escalera, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(escalera, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(escalera, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(escalera, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(escalera, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(escalera, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(escalera, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementoCambioPlanta_escaleras(escalera, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAscensor(Ascensor ascensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ascensor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ascensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ascensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ascensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ascensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ascensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ascensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ascensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ascensor, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementoCambioPlanta_escaleras(ascensor, diagnostics, context);
		if (result || diagnostics != null) result &= validateAscensor_Iascensores(ascensor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Iascensores constraint of '<em>Ascensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASCENSOR__IASCENSORES__EEXPRESSION = "destino->forAll(oclIsKindOf(Ascensor))";

	/**
	 * Validates the Iascensores constraint of '<em>Ascensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAscensor_Iascensores(Ascensor ascensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CentroscomercialesPackage.Literals.ASCENSOR,
				 ascensor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Iascensores",
				 ASCENSOR__IASCENSORES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAseo(Aseo aseo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aseo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEspacioAbierto(EspacioAbierto espacioAbierto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(espacioAbierto, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAparcamiento(Aparcamiento aparcamiento, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aparcamiento, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZonaAparcamiento(ZonaAparcamiento zonaAparcamiento, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zonaAparcamiento, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePuerta(Puerta puerta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(puerta, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalida(Salida salida, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(salida, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTipoAseo(TipoAseo tipoAseo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDireccion(Direccion direccion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CentroscomercialesValidator
