/*
 * generated by Xtext 2.15.0
 */
package wizard.validation

import org.eclipse.xtext.validation.Check
import wizard.CampoTexto
import wizard.WizardPackage
import wizard.CasillaVerif
import wizard.Boton
import wizard.Pagina
import wizard.BotonCerrar
import wizard.BotonNavegar
import wizard.Destino

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class WizardValidator extends AbstractWizardValidator {

	@Check
	def checkLongitudEtiquetaCampoTexto(CampoTexto campo) {
		if (campo.tag.length() > 20) {
			error('La etiqueta de un campo de texto no puede superar los 20 caracteres',
				WizardPackage.Literals.CAMPO__TAG, 'campoTextoTagDemasiadoLarga')
		}
	}

	@Check
	def checkLongitudEtiquetaCasillaVerif(CasillaVerif casilla) {
		if (casilla.tag.length() > 20) {
			error('La etiqueta de una casilla de verificaci�n no puede superar los 20 caracteres',
				WizardPackage.Literals.CAMPO__TAG, 'casillaVerifTagDemasiadoLarga')
		}
	}

	@Check
	def checkLongitudEtiquetaBoton(Boton boton) {
		if (boton.tag.length() > 10) {
			error('La etiqueta de un bot�n no puede superar los 10 caracteres',
				WizardPackage.Literals.CAMPO__TAG, 'botonTagDemasiadoLarga')
		}
	}

	@Check
	def checkEtiquetasPagina(Pagina pagina) {
		pagina.camposTexto.forEach[elem, index | checkEtiquetaUnica(pagina, elem, index)]
		pagina.casillasVerif.forEach[elem, index | checkEtiquetaUnica(pagina, elem, index)]
		pagina.botones.forEach[elem, index | checkEtiquetaUnica(pagina, elem, index)]
	}

	def checkEtiquetaUnica(Pagina pagina, CampoTexto campo, Integer index) {
		// compruebo que la tag no sea igual a los campos de texto posteriores a el
		pagina.camposTexto.subList(index+1, pagina.camposTexto.size()).forEach [ elem |
			if (elem.tag.equals(campo.tag)) {
				error('Una p�gina no puede tener dos elementos distintos con la misma etiqueta',
					WizardPackage.Literals.PAGINA__CAMPOS_TEXTO, 'paginaEtiquetaNoUnica')
			}
		]
		// compruebo que la tag no sea igual a ninguna casilla
		pagina.casillasVerif.forEach [ elem |
			if (elem.tag.equals(campo.tag)) {
				error('Una p�gina no puede tener dos elementos distintos con la misma etiqueta',
					WizardPackage.Literals.PAGINA__CAMPOS_TEXTO, 'paginaEtiquetaNoUnica')
			}
		]
		// compruebo que la tag no sea igual a ningun boton
		pagina.botones.forEach [ elem |
			if (elem.tag.equals(campo.tag)) {
				error('Una p�gina no puede tener dos elementos distintos con la misma etiqueta',
					WizardPackage.Literals.PAGINA__CAMPOS_TEXTO, 'paginaEtiquetaNoUnica')
			}
		]
	}

	def checkEtiquetaUnica(Pagina pagina, CasillaVerif casilla, Integer index) {
		// ya he comprobado que la tag de los campos de texto es unica:
		// solo hace falta comprobar para lo demas
		// compruebo que la tag no sea igual a las casillas posteriores a ella
		pagina.casillasVerif.subList(index+1, pagina.casillasVerif.size()).forEach [ elem |
			if (elem.tag.equals(casilla.tag)) {
				error('Una p�gina no puede tener dos elementos distintos con la misma etiqueta',
					WizardPackage.Literals.PAGINA__CASILLAS_VERIF, 'paginaEtiquetaNoUnica')
			}
		]
		// compruebo que la tag no sea igual a ningun boton
		pagina.botones.forEach [ elem |
			if (elem.tag.equals(casilla.tag)) {
				error('Una p�gina no puede tener dos elementos distintos con la misma etiqueta',
					WizardPackage.Literals.PAGINA__CASILLAS_VERIF, 'paginaEtiquetaNoUnica')
			}
		]
	}

	def checkEtiquetaUnica(Pagina pagina, Boton boton, Integer index) {
		// ya he comprobado que la tag de los campos de texto y casillas de verif
		// es unica: solo hace falta comprobar para lo demas
		// compruebo que la tag no sea igual a los botones posteriores a el
		pagina.botones.subList(index+1, pagina.botones.size()).forEach [ elem |
			if (elem.tag.equals(boton.tag)) {
				error('Una p�gina no puede tener dos elementos distintos con la misma etiqueta',
					WizardPackage.Literals.PAGINA__BOTONES, 'paginaEtiquetaNoUnica')
			}
		]
	}

	@Check
	def checkPaginaBotonesNoSoloMensajes(Pagina pagina) {
		var result = false
		for(Boton boton: pagina.botones) {
			if(!result) {
				if (boton instanceof BotonCerrar || boton instanceof BotonNavegar) {
				result = true
				}
			}
		}
		
		if(!result) {
			error('Una p�gina debe tener al menos un bot�n de navegar o de cerrar',
				WizardPackage.Literals.PAGINA__BOTONES, 'paginaBotonesSoloMensajes')
		}
	}

	@Check
	def checkPaginaBotonesDestino(Pagina pagina) {
		pagina.botones.forEach [ elem |
			if (elem instanceof BotonNavegar) {
				(elem as BotonNavegar).destino.forEach [ elem2 |
					if (elem2.destino == pagina) {
						error('Un bot�n de navegar no puede tener como destino a la misma p�gina',
							WizardPackage.Literals.PAGINA__BOTONES, 'paginaBotonesDestinoInutil')
					}
				]
			}
		]
	}

	@Check
	def checkBotonDestinosBienDef(BotonNavegar boton) {
		boton.destino.forEach[elem, index|checkDestinoUnico(boton, elem, index)]
	}

	def checkDestinoUnico(BotonNavegar boton, Destino destino, Integer index) {
		boton.destino.subList(index+1, boton.destino.size()).forEach [ elem |
			if (elem.casilla == destino.casilla) {
				error('Un bot�n debe tener un �nico destino por defecto y por cada casilla',
					WizardPackage.Literals.BOTON_NAVEGAR__DESTINO, 'botonDestinoNoUnico')
			}

		]
	}

}
