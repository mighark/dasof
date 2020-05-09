/*
 * generated by Xtext 2.15.0
 */
grammar InternalWizard;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package wizard.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package wizard.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import wizard.services.WizardGrammarAccess;

}

@parser::members {

 	private WizardGrammarAccess grammarAccess;

    public InternalWizardParser(TokenStream input, WizardGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Wizard";
   	}

   	@Override
   	protected WizardGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleWizard
entryRuleWizard returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWizardRule()); }
	iv_ruleWizard=ruleWizard
	{ $current=$iv_ruleWizard.current; }
	EOF;

// Rule Wizard
ruleWizard returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Wizard'
		{
			newLeafNode(otherlv_0, grammarAccess.getWizardAccess().getWizardKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWizardAccess().getTituloEStringParserRuleCall_1_0());
				}
				lv_titulo_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWizardRule());
					}
					set(
						$current,
						"titulo",
						lv_titulo_1_0,
						"wizard.Wizard.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='Paginas:'
		{
			newLeafNode(otherlv_3, grammarAccess.getWizardAccess().getPaginasKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWizardAccess().getPaginasPaginaParserRuleCall_4_0());
				}
				lv_paginas_4_0=rulePagina
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWizardRule());
					}
					add(
						$current,
						"paginas",
						lv_paginas_4_0,
						"wizard.Wizard.Pagina");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='inicial'
		{
			newLeafNode(otherlv_5, grammarAccess.getWizardAccess().getInicialKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWizardRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getWizardAccess().getPagIniPaginaCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getWizardAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleBoton
entryRuleBoton returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBotonRule()); }
	iv_ruleBoton=ruleBoton
	{ $current=$iv_ruleBoton.current; }
	EOF;

// Rule Boton
ruleBoton returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Boton'
			{
				newLeafNode(otherlv_0, grammarAccess.getBotonAccess().getBotonKeyword_0_0());
			}
			otherlv_1='navegar'
			{
				newLeafNode(otherlv_1, grammarAccess.getBotonAccess().getNavegarKeyword_0_1());
			}
			{
				newCompositeNode(grammarAccess.getBotonAccess().getBotonNavegarParserRuleCall_0_2());
			}
			this_BotonNavegar_2=ruleBotonNavegar
			{
				$current = $this_BotonNavegar_2.current;
				afterParserOrEnumRuleCall();
			}
		)
		    |
		(
			otherlv_3='Boton'
			{
				newLeafNode(otherlv_3, grammarAccess.getBotonAccess().getBotonKeyword_1_0());
			}
			otherlv_4='mensaje'
			{
				newLeafNode(otherlv_4, grammarAccess.getBotonAccess().getMensajeKeyword_1_1());
			}
			{
				newCompositeNode(grammarAccess.getBotonAccess().getBotonMensajeParserRuleCall_1_2());
			}
			this_BotonMensaje_5=ruleBotonMensaje
			{
				$current = $this_BotonMensaje_5.current;
				afterParserOrEnumRuleCall();
			}
		)
		    |
		(
			otherlv_6='Boton'
			{
				newLeafNode(otherlv_6, grammarAccess.getBotonAccess().getBotonKeyword_2_0());
			}
			otherlv_7='cerrar'
			{
				newLeafNode(otherlv_7, grammarAccess.getBotonAccess().getCerrarKeyword_2_1());
			}
			{
				newCompositeNode(grammarAccess.getBotonAccess().getBotonCerrarParserRuleCall_2_2());
			}
			this_BotonCerrar_8=ruleBotonCerrar
			{
				$current = $this_BotonCerrar_8.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRulePagina
entryRulePagina returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPaginaRule()); }
	iv_rulePagina=rulePagina
	{ $current=$iv_rulePagina.current; }
	EOF;

// Rule Pagina
rulePagina returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Pagina'
		{
			newLeafNode(otherlv_0, grammarAccess.getPaginaAccess().getPaginaKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPaginaAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPaginaRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"wizard.Wizard.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getPaginaAccess().getColonKeyword_2());
		}
		(
			otherlv_3='campos'
			{
				newLeafNode(otherlv_3, grammarAccess.getPaginaAccess().getCamposKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPaginaAccess().getCamposTextoCampoTextoParserRuleCall_3_2_0());
					}
					lv_camposTexto_5_0=ruleCampoTexto
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPaginaRule());
						}
						add(
							$current,
							"camposTexto",
							lv_camposTexto_5_0,
							"wizard.Wizard.CampoTexto");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getPaginaAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getPaginaAccess().getCamposTextoCampoTextoParserRuleCall_3_3_1_0());
						}
						lv_camposTexto_7_0=ruleCampoTexto
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPaginaRule());
							}
							add(
								$current,
								"camposTexto",
								lv_camposTexto_7_0,
								"wizard.Wizard.CampoTexto");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		(
			otherlv_9='casillas'
			{
				newLeafNode(otherlv_9, grammarAccess.getPaginaAccess().getCasillasKeyword_4_0());
			}
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPaginaAccess().getCasillasVerifCasillaVerifParserRuleCall_4_2_0());
					}
					lv_casillasVerif_11_0=ruleCasillaVerif
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPaginaRule());
						}
						add(
							$current,
							"casillasVerif",
							lv_casillasVerif_11_0,
							"wizard.Wizard.CasillaVerif");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getPaginaAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getPaginaAccess().getCasillasVerifCasillaVerifParserRuleCall_4_3_1_0());
						}
						lv_casillasVerif_13_0=ruleCasillaVerif
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPaginaRule());
							}
							add(
								$current,
								"casillasVerif",
								lv_casillasVerif_13_0,
								"wizard.Wizard.CasillaVerif");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_15='botones'
		{
			newLeafNode(otherlv_15, grammarAccess.getPaginaAccess().getBotonesKeyword_5());
		}
		otherlv_16='{'
		{
			newLeafNode(otherlv_16, grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPaginaAccess().getBotonesBotonParserRuleCall_7_0());
				}
				lv_botones_17_0=ruleBoton
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPaginaRule());
					}
					add(
						$current,
						"botones",
						lv_botones_17_0,
						"wizard.Wizard.Boton");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_18=','
			{
				newLeafNode(otherlv_18, grammarAccess.getPaginaAccess().getCommaKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPaginaAccess().getBotonesBotonParserRuleCall_8_1_0());
					}
					lv_botones_19_0=ruleBoton
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPaginaRule());
						}
						add(
							$current,
							"botones",
							lv_botones_19_0,
							"wizard.Wizard.Boton");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_20='}'
		{
			newLeafNode(otherlv_20, grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleCampoTexto
entryRuleCampoTexto returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCampoTextoRule()); }
	iv_ruleCampoTexto=ruleCampoTexto
	{ $current=$iv_ruleCampoTexto.current; }
	EOF;

// Rule CampoTexto
ruleCampoTexto returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CampoTexto'
		{
			newLeafNode(otherlv_0, grammarAccess.getCampoTextoAccess().getCampoTextoKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCampoTextoAccess().getTagEStringParserRuleCall_1_0());
				}
				lv_tag_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCampoTextoRule());
					}
					set(
						$current,
						"tag",
						lv_tag_1_0,
						"wizard.Wizard.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_opcional_2_0='opcional'
				{
					newLeafNode(lv_opcional_2_0, grammarAccess.getCampoTextoAccess().getOpcionalOpcionalKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCampoTextoRule());
					}
					setWithLastConsumed($current, "opcional", true, "opcional");
				}
			)
		)?
	)
;

// Entry rule entryRuleCasillaVerif
entryRuleCasillaVerif returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCasillaVerifRule()); }
	iv_ruleCasillaVerif=ruleCasillaVerif
	{ $current=$iv_ruleCasillaVerif.current; }
	EOF;

// Rule CasillaVerif
ruleCasillaVerif returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CasillaVerif'
		{
			newLeafNode(otherlv_0, grammarAccess.getCasillaVerifAccess().getCasillaVerifKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCasillaVerifAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCasillaVerifRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"wizard.Wizard.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCasillaVerifAccess().getTagEStringParserRuleCall_2_0());
				}
				lv_tag_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCasillaVerifRule());
					}
					set(
						$current,
						"tag",
						lv_tag_2_0,
						"wizard.Wizard.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_porDef_3_0='selected'
				{
					newLeafNode(lv_porDef_3_0, grammarAccess.getCasillaVerifAccess().getPorDefSelectedKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCasillaVerifRule());
					}
					setWithLastConsumed($current, "porDef", true, "selected");
				}
			)
		)?
	)
;

// Entry rule entryRuleBotonNavegar
entryRuleBotonNavegar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBotonNavegarRule()); }
	iv_ruleBotonNavegar=ruleBotonNavegar
	{ $current=$iv_ruleBotonNavegar.current; }
	EOF;

// Rule BotonNavegar
ruleBotonNavegar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBotonNavegarAccess().getTagEStringParserRuleCall_0_0());
				}
				lv_tag_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBotonNavegarRule());
					}
					set(
						$current,
						"tag",
						lv_tag_0_0,
						"wizard.Wizard.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='destinos'
		{
			newLeafNode(otherlv_1, grammarAccess.getBotonNavegarAccess().getDestinosKeyword_1());
		}
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getBotonNavegarAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBotonNavegarAccess().getDestinoDestinoParserRuleCall_3_0());
				}
				lv_destino_3_0=ruleDestino
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBotonNavegarRule());
					}
					add(
						$current,
						"destino",
						lv_destino_3_0,
						"wizard.Wizard.Destino");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getBotonNavegarAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBotonNavegarAccess().getDestinoDestinoParserRuleCall_4_1_0());
					}
					lv_destino_5_0=ruleDestino
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBotonNavegarRule());
						}
						add(
							$current,
							"destino",
							lv_destino_5_0,
							"wizard.Wizard.Destino");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleBotonMensaje
entryRuleBotonMensaje returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBotonMensajeRule()); }
	iv_ruleBotonMensaje=ruleBotonMensaje
	{ $current=$iv_ruleBotonMensaje.current; }
	EOF;

// Rule BotonMensaje
ruleBotonMensaje returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBotonMensajeAccess().getTagEStringParserRuleCall_0_0());
				}
				lv_tag_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBotonMensajeRule());
					}
					set(
						$current,
						"tag",
						lv_tag_0_0,
						"wizard.Wizard.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='mensaje'
		{
			newLeafNode(otherlv_1, grammarAccess.getBotonMensajeAccess().getMensajeKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBotonMensajeAccess().getMensajeEStringParserRuleCall_2_0());
				}
				lv_mensaje_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBotonMensajeRule());
					}
					set(
						$current,
						"mensaje",
						lv_mensaje_2_0,
						"wizard.Wizard.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBotonCerrar
entryRuleBotonCerrar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBotonCerrarRule()); }
	iv_ruleBotonCerrar=ruleBotonCerrar
	{ $current=$iv_ruleBotonCerrar.current; }
	EOF;

// Rule BotonCerrar
ruleBotonCerrar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBotonCerrarAccess().getBotonCerrarAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBotonCerrarAccess().getTagEStringParserRuleCall_1_0());
				}
				lv_tag_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBotonCerrarRule());
					}
					set(
						$current,
						"tag",
						lv_tag_1_0,
						"wizard.Wizard.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDestino
entryRuleDestino returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDestinoRule()); }
	iv_ruleDestino=ruleDestino
	{ $current=$iv_ruleDestino.current; }
	EOF;

// Rule Destino
ruleDestino returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getDestinoAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDestinoRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDestinoAccess().getDestinoPaginaCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getDestinoAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDestinoRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getDestinoAccess().getCasillaCasillaVerifCrossReference_2_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getDestinoAccess().getRightParenthesisKeyword_3());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
