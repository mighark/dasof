/**
 */
package centroscomerciales;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Aseo</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see centroscomerciales.CentroscomercialesPackage#getTipoAseo()
 * @model
 * @generated
 */
public enum TipoAseo implements Enumerator {
	/**
	 * The '<em><b>Masculino</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASCULINO_VALUE
	 * @generated
	 * @ordered
	 */
	MASCULINO(-1, "masculino", "masculino"),

	/**
	 * The '<em><b>Mixto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXTO_VALUE
	 * @generated
	 * @ordered
	 */
	MIXTO(0, "mixto", "mixto"),

	/**
	 * The '<em><b>Femenino</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMENINO_VALUE
	 * @generated
	 * @ordered
	 */
	FEMENINO(1, "femenino", "femenino");

	/**
	 * The '<em><b>Masculino</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Masculino</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASCULINO
	 * @model name="masculino"
	 * @generated
	 * @ordered
	 */
	public static final int MASCULINO_VALUE = -1;

	/**
	 * The '<em><b>Mixto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mixto</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIXTO
	 * @model name="mixto"
	 * @generated
	 * @ordered
	 */
	public static final int MIXTO_VALUE = 0;

	/**
	 * The '<em><b>Femenino</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Femenino</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEMENINO
	 * @model name="femenino"
	 * @generated
	 * @ordered
	 */
	public static final int FEMENINO_VALUE = 1;

	/**
	 * An array of all the '<em><b>Tipo Aseo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoAseo[] VALUES_ARRAY =
		new TipoAseo[] {
			MASCULINO,
			MIXTO,
			FEMENINO,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Aseo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoAseo> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Aseo</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoAseo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoAseo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Aseo</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoAseo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoAseo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Aseo</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoAseo get(int value) {
		switch (value) {
			case MASCULINO_VALUE: return MASCULINO;
			case MIXTO_VALUE: return MIXTO;
			case FEMENINO_VALUE: return FEMENINO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoAseo(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TipoAseo
