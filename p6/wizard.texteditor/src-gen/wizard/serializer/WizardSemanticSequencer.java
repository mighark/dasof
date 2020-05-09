/*
 * generated by Xtext 2.15.0
 */
package wizard.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import wizard.BotonCerrar;
import wizard.BotonMensaje;
import wizard.BotonNavegar;
import wizard.CampoTexto;
import wizard.CasillaVerif;
import wizard.Destino;
import wizard.Pagina;
import wizard.Wizard;
import wizard.WizardPackage;
import wizard.services.WizardGrammarAccess;

@SuppressWarnings("all")
public class WizardSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WizardGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == WizardPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case WizardPackage.BOTON_CERRAR:
				sequence_BotonCerrar(context, (BotonCerrar) semanticObject); 
				return; 
			case WizardPackage.BOTON_MENSAJE:
				sequence_BotonMensaje(context, (BotonMensaje) semanticObject); 
				return; 
			case WizardPackage.BOTON_NAVEGAR:
				sequence_BotonNavegar(context, (BotonNavegar) semanticObject); 
				return; 
			case WizardPackage.CAMPO_TEXTO:
				sequence_CampoTexto(context, (CampoTexto) semanticObject); 
				return; 
			case WizardPackage.CASILLA_VERIF:
				sequence_CasillaVerif(context, (CasillaVerif) semanticObject); 
				return; 
			case WizardPackage.DESTINO:
				sequence_Destino(context, (Destino) semanticObject); 
				return; 
			case WizardPackage.PAGINA:
				sequence_Pagina(context, (Pagina) semanticObject); 
				return; 
			case WizardPackage.WIZARD:
				sequence_Wizard(context, (Wizard) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Boton returns BotonCerrar
	 *     BotonCerrar returns BotonCerrar
	 *
	 * Constraint:
	 *     tag=EString
	 */
	protected void sequence_BotonCerrar(ISerializationContext context, BotonCerrar semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WizardPackage.Literals.CAMPO__TAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WizardPackage.Literals.CAMPO__TAG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBotonCerrarAccess().getTagEStringParserRuleCall_1_0(), semanticObject.getTag());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Boton returns BotonMensaje
	 *     BotonMensaje returns BotonMensaje
	 *
	 * Constraint:
	 *     (tag=EString mensaje=EString)
	 */
	protected void sequence_BotonMensaje(ISerializationContext context, BotonMensaje semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WizardPackage.Literals.CAMPO__TAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WizardPackage.Literals.CAMPO__TAG));
			if (transientValues.isValueTransient(semanticObject, WizardPackage.Literals.BOTON_MENSAJE__MENSAJE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WizardPackage.Literals.BOTON_MENSAJE__MENSAJE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBotonMensajeAccess().getTagEStringParserRuleCall_0_0(), semanticObject.getTag());
		feeder.accept(grammarAccess.getBotonMensajeAccess().getMensajeEStringParserRuleCall_2_0(), semanticObject.getMensaje());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Boton returns BotonNavegar
	 *     BotonNavegar returns BotonNavegar
	 *
	 * Constraint:
	 *     (tag=EString destino+=Destino destino+=Destino*)
	 */
	protected void sequence_BotonNavegar(ISerializationContext context, BotonNavegar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CampoTexto returns CampoTexto
	 *
	 * Constraint:
	 *     (tag=EString opcional?='opcional'?)
	 */
	protected void sequence_CampoTexto(ISerializationContext context, CampoTexto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CasillaVerif returns CasillaVerif
	 *
	 * Constraint:
	 *     (name=EString tag=EString porDef?='selected'?)
	 */
	protected void sequence_CasillaVerif(ISerializationContext context, CasillaVerif semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Destino returns Destino
	 *
	 * Constraint:
	 *     (destino=[Pagina|EString] casilla=[CasillaVerif|EString]?)
	 */
	protected void sequence_Destino(ISerializationContext context, Destino semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pagina returns Pagina
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (camposTexto+=CampoTexto camposTexto+=CampoTexto*)? 
	 *         (casillasVerif+=CasillaVerif casillasVerif+=CasillaVerif*)? 
	 *         botones+=Boton 
	 *         botones+=Boton*
	 *     )
	 */
	protected void sequence_Pagina(ISerializationContext context, Pagina semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Wizard returns Wizard
	 *
	 * Constraint:
	 *     (titulo=EString paginas+=Pagina+ pagIni=[Pagina|EString])
	 */
	protected void sequence_Wizard(ISerializationContext context, Wizard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
