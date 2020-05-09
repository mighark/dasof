/*
 * generated by Xtext 2.15.0
 */
package wizard.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import wizard.ide.contentassist.antlr.internal.InternalWizardParser;
import wizard.services.WizardGrammarAccess;

public class WizardParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(WizardGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, WizardGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getBotonAccess().getAlternatives(), "rule__Boton__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getWizardAccess().getGroup(), "rule__Wizard__Group__0");
			builder.put(grammarAccess.getBotonAccess().getGroup_0(), "rule__Boton__Group_0__0");
			builder.put(grammarAccess.getBotonAccess().getGroup_1(), "rule__Boton__Group_1__0");
			builder.put(grammarAccess.getBotonAccess().getGroup_2(), "rule__Boton__Group_2__0");
			builder.put(grammarAccess.getPaginaAccess().getGroup(), "rule__Pagina__Group__0");
			builder.put(grammarAccess.getPaginaAccess().getGroup_3(), "rule__Pagina__Group_3__0");
			builder.put(grammarAccess.getPaginaAccess().getGroup_3_3(), "rule__Pagina__Group_3_3__0");
			builder.put(grammarAccess.getPaginaAccess().getGroup_4(), "rule__Pagina__Group_4__0");
			builder.put(grammarAccess.getPaginaAccess().getGroup_4_3(), "rule__Pagina__Group_4_3__0");
			builder.put(grammarAccess.getPaginaAccess().getGroup_8(), "rule__Pagina__Group_8__0");
			builder.put(grammarAccess.getCampoTextoAccess().getGroup(), "rule__CampoTexto__Group__0");
			builder.put(grammarAccess.getCasillaVerifAccess().getGroup(), "rule__CasillaVerif__Group__0");
			builder.put(grammarAccess.getBotonNavegarAccess().getGroup(), "rule__BotonNavegar__Group__0");
			builder.put(grammarAccess.getBotonNavegarAccess().getGroup_4(), "rule__BotonNavegar__Group_4__0");
			builder.put(grammarAccess.getBotonMensajeAccess().getGroup(), "rule__BotonMensaje__Group__0");
			builder.put(grammarAccess.getBotonCerrarAccess().getGroup(), "rule__BotonCerrar__Group__0");
			builder.put(grammarAccess.getDestinoAccess().getGroup(), "rule__Destino__Group__0");
			builder.put(grammarAccess.getDestinoAccess().getGroup_2(), "rule__Destino__Group_2__0");
			builder.put(grammarAccess.getWizardAccess().getTituloAssignment_1(), "rule__Wizard__TituloAssignment_1");
			builder.put(grammarAccess.getWizardAccess().getPaginasAssignment_4(), "rule__Wizard__PaginasAssignment_4");
			builder.put(grammarAccess.getWizardAccess().getPagIniAssignment_6(), "rule__Wizard__PagIniAssignment_6");
			builder.put(grammarAccess.getPaginaAccess().getNameAssignment_1(), "rule__Pagina__NameAssignment_1");
			builder.put(grammarAccess.getPaginaAccess().getCamposTextoAssignment_3_2(), "rule__Pagina__CamposTextoAssignment_3_2");
			builder.put(grammarAccess.getPaginaAccess().getCamposTextoAssignment_3_3_1(), "rule__Pagina__CamposTextoAssignment_3_3_1");
			builder.put(grammarAccess.getPaginaAccess().getCasillasVerifAssignment_4_2(), "rule__Pagina__CasillasVerifAssignment_4_2");
			builder.put(grammarAccess.getPaginaAccess().getCasillasVerifAssignment_4_3_1(), "rule__Pagina__CasillasVerifAssignment_4_3_1");
			builder.put(grammarAccess.getPaginaAccess().getBotonesAssignment_7(), "rule__Pagina__BotonesAssignment_7");
			builder.put(grammarAccess.getPaginaAccess().getBotonesAssignment_8_1(), "rule__Pagina__BotonesAssignment_8_1");
			builder.put(grammarAccess.getCampoTextoAccess().getTagAssignment_1(), "rule__CampoTexto__TagAssignment_1");
			builder.put(grammarAccess.getCampoTextoAccess().getOpcionalAssignment_2(), "rule__CampoTexto__OpcionalAssignment_2");
			builder.put(grammarAccess.getCasillaVerifAccess().getNameAssignment_1(), "rule__CasillaVerif__NameAssignment_1");
			builder.put(grammarAccess.getCasillaVerifAccess().getTagAssignment_2(), "rule__CasillaVerif__TagAssignment_2");
			builder.put(grammarAccess.getCasillaVerifAccess().getPorDefAssignment_3(), "rule__CasillaVerif__PorDefAssignment_3");
			builder.put(grammarAccess.getBotonNavegarAccess().getTagAssignment_0(), "rule__BotonNavegar__TagAssignment_0");
			builder.put(grammarAccess.getBotonNavegarAccess().getDestinoAssignment_3(), "rule__BotonNavegar__DestinoAssignment_3");
			builder.put(grammarAccess.getBotonNavegarAccess().getDestinoAssignment_4_1(), "rule__BotonNavegar__DestinoAssignment_4_1");
			builder.put(grammarAccess.getBotonMensajeAccess().getTagAssignment_0(), "rule__BotonMensaje__TagAssignment_0");
			builder.put(grammarAccess.getBotonMensajeAccess().getMensajeAssignment_2(), "rule__BotonMensaje__MensajeAssignment_2");
			builder.put(grammarAccess.getBotonCerrarAccess().getTagAssignment_1(), "rule__BotonCerrar__TagAssignment_1");
			builder.put(grammarAccess.getDestinoAccess().getDestinoAssignment_1(), "rule__Destino__DestinoAssignment_1");
			builder.put(grammarAccess.getDestinoAccess().getCasillaAssignment_2_1(), "rule__Destino__CasillaAssignment_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private WizardGrammarAccess grammarAccess;

	@Override
	protected InternalWizardParser createParser() {
		InternalWizardParser result = new InternalWizardParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public WizardGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WizardGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
