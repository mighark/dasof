/**
 */
package centroscomerciales;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Direccion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see centroscomerciales.CentroscomercialesPackage#getDireccion()
 * @model
 * @generated
 */
public enum Direccion implements Enumerator {
	/**
	 * The '<em><b>Norte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTE_VALUE
	 * @generated
	 * @ordered
	 */
	NORTE(0, "norte", "norte"),

	/**
	 * The '<em><b>Sur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUR_VALUE
	 * @generated
	 * @ordered
	 */
	SUR(1, "sur", "sur"),

	/**
	 * The '<em><b>Este</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTE_VALUE
	 * @generated
	 * @ordered
	 */
	ESTE(2, "este", "este"),

	/**
	 * The '<em><b>Oeste</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OESTE_VALUE
	 * @generated
	 * @ordered
	 */
	OESTE(3, "oeste", "oeste");

	/**
	 * The '<em><b>Norte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Norte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTE
	 * @model name="norte"
	 * @generated
	 * @ordered
	 */
	public static final int NORTE_VALUE = 0;

	/**
	 * The '<em><b>Sur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sur</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUR
	 * @model name="sur"
	 * @generated
	 * @ordered
	 */
	public static final int SUR_VALUE = 1;

	/**
	 * The '<em><b>Este</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Este</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESTE
	 * @model name="este"
	 * @generated
	 * @ordered
	 */
	public static final int ESTE_VALUE = 2;

	/**
	 * The '<em><b>Oeste</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oeste</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OESTE
	 * @model name="oeste"
	 * @generated
	 * @ordered
	 */
	public static final int OESTE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Direccion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Direccion[] VALUES_ARRAY =
		new Direccion[] {
			NORTE,
			SUR,
			ESTE,
			OESTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Direccion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Direccion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Direccion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Direccion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Direccion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direccion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Direccion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Direccion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direccion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Direccion get(int value) {
		switch (value) {
			case NORTE_VALUE: return NORTE;
			case SUR_VALUE: return SUR;
			case ESTE_VALUE: return ESTE;
			case OESTE_VALUE: return OESTE;
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
	private Direccion(int value, String name, String literal) {
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
	
} //Direccion
