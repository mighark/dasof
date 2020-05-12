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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWizardParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Wizard'", "'{'", "'Paginas:'", "'inicial'", "'}'", "'Boton'", "'navegar'", "'mensaje'", "'cerrar'", "'Pagina'", "':'", "'campos'", "','", "'casillas'", "'botones'", "';'", "'CampoTexto'", "'opcional'", "'CasillaVerif'", "'selected'", "'destinos'", "'('", "')'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWizardParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWizardParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWizardParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWizard.g"; }



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




    // $ANTLR start "entryRuleWizard"
    // InternalWizard.g:64:1: entryRuleWizard returns [EObject current=null] : iv_ruleWizard= ruleWizard EOF ;
    public final EObject entryRuleWizard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWizard = null;


        try {
            // InternalWizard.g:64:47: (iv_ruleWizard= ruleWizard EOF )
            // InternalWizard.g:65:2: iv_ruleWizard= ruleWizard EOF
            {
             newCompositeNode(grammarAccess.getWizardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWizard=ruleWizard();

            state._fsp--;

             current =iv_ruleWizard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWizard"


    // $ANTLR start "ruleWizard"
    // InternalWizard.g:71:1: ruleWizard returns [EObject current=null] : (otherlv_0= 'Wizard' ( (lv_titulo_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Paginas:' ( (lv_paginas_4_0= rulePagina ) )+ otherlv_5= 'inicial' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleWizard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_titulo_1_0 = null;

        EObject lv_paginas_4_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:77:2: ( (otherlv_0= 'Wizard' ( (lv_titulo_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Paginas:' ( (lv_paginas_4_0= rulePagina ) )+ otherlv_5= 'inicial' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalWizard.g:78:2: (otherlv_0= 'Wizard' ( (lv_titulo_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Paginas:' ( (lv_paginas_4_0= rulePagina ) )+ otherlv_5= 'inicial' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalWizard.g:78:2: (otherlv_0= 'Wizard' ( (lv_titulo_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Paginas:' ( (lv_paginas_4_0= rulePagina ) )+ otherlv_5= 'inicial' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalWizard.g:79:3: otherlv_0= 'Wizard' ( (lv_titulo_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Paginas:' ( (lv_paginas_4_0= rulePagina ) )+ otherlv_5= 'inicial' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWizardAccess().getWizardKeyword_0());
            		
            // InternalWizard.g:83:3: ( (lv_titulo_1_0= ruleEString ) )
            // InternalWizard.g:84:4: (lv_titulo_1_0= ruleEString )
            {
            // InternalWizard.g:84:4: (lv_titulo_1_0= ruleEString )
            // InternalWizard.g:85:5: lv_titulo_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWizardAccess().getTituloEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_titulo_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWizardRule());
            					}
            					set(
            						current,
            						"titulo",
            						lv_titulo_1_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getWizardAccess().getPaginasKeyword_3());
            		
            // InternalWizard.g:110:3: ( (lv_paginas_4_0= rulePagina ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWizard.g:111:4: (lv_paginas_4_0= rulePagina )
            	    {
            	    // InternalWizard.g:111:4: (lv_paginas_4_0= rulePagina )
            	    // InternalWizard.g:112:5: lv_paginas_4_0= rulePagina
            	    {

            	    					newCompositeNode(grammarAccess.getWizardAccess().getPaginasPaginaParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_paginas_4_0=rulePagina();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWizardRule());
            	    					}
            	    					add(
            	    						current,
            	    						"paginas",
            	    						lv_paginas_4_0,
            	    						"wizard.Wizard.Pagina");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getWizardAccess().getInicialKeyword_5());
            		
            // InternalWizard.g:133:3: ( ( ruleEString ) )
            // InternalWizard.g:134:4: ( ruleEString )
            {
            // InternalWizard.g:134:4: ( ruleEString )
            // InternalWizard.g:135:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWizardRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWizardAccess().getPagIniPaginaCrossReference_6_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getWizardAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWizard"


    // $ANTLR start "entryRuleBoton"
    // InternalWizard.g:157:1: entryRuleBoton returns [EObject current=null] : iv_ruleBoton= ruleBoton EOF ;
    public final EObject entryRuleBoton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoton = null;


        try {
            // InternalWizard.g:157:46: (iv_ruleBoton= ruleBoton EOF )
            // InternalWizard.g:158:2: iv_ruleBoton= ruleBoton EOF
            {
             newCompositeNode(grammarAccess.getBotonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoton=ruleBoton();

            state._fsp--;

             current =iv_ruleBoton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoton"


    // $ANTLR start "ruleBoton"
    // InternalWizard.g:164:1: ruleBoton returns [EObject current=null] : ( (otherlv_0= 'Boton' otherlv_1= 'navegar' this_BotonNavegar_2= ruleBotonNavegar ) | (otherlv_3= 'Boton' otherlv_4= 'mensaje' this_BotonMensaje_5= ruleBotonMensaje ) | (otherlv_6= 'Boton' otherlv_7= 'cerrar' this_BotonCerrar_8= ruleBotonCerrar ) ) ;
    public final EObject ruleBoton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject this_BotonNavegar_2 = null;

        EObject this_BotonMensaje_5 = null;

        EObject this_BotonCerrar_8 = null;



        	enterRule();

        try {
            // InternalWizard.g:170:2: ( ( (otherlv_0= 'Boton' otherlv_1= 'navegar' this_BotonNavegar_2= ruleBotonNavegar ) | (otherlv_3= 'Boton' otherlv_4= 'mensaje' this_BotonMensaje_5= ruleBotonMensaje ) | (otherlv_6= 'Boton' otherlv_7= 'cerrar' this_BotonCerrar_8= ruleBotonCerrar ) ) )
            // InternalWizard.g:171:2: ( (otherlv_0= 'Boton' otherlv_1= 'navegar' this_BotonNavegar_2= ruleBotonNavegar ) | (otherlv_3= 'Boton' otherlv_4= 'mensaje' this_BotonMensaje_5= ruleBotonMensaje ) | (otherlv_6= 'Boton' otherlv_7= 'cerrar' this_BotonCerrar_8= ruleBotonCerrar ) )
            {
            // InternalWizard.g:171:2: ( (otherlv_0= 'Boton' otherlv_1= 'navegar' this_BotonNavegar_2= ruleBotonNavegar ) | (otherlv_3= 'Boton' otherlv_4= 'mensaje' this_BotonMensaje_5= ruleBotonMensaje ) | (otherlv_6= 'Boton' otherlv_7= 'cerrar' this_BotonCerrar_8= ruleBotonCerrar ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt2=1;
                    }
                    break;
                case 18:
                    {
                    alt2=2;
                    }
                    break;
                case 19:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWizard.g:172:3: (otherlv_0= 'Boton' otherlv_1= 'navegar' this_BotonNavegar_2= ruleBotonNavegar )
                    {
                    // InternalWizard.g:172:3: (otherlv_0= 'Boton' otherlv_1= 'navegar' this_BotonNavegar_2= ruleBotonNavegar )
                    // InternalWizard.g:173:4: otherlv_0= 'Boton' otherlv_1= 'navegar' this_BotonNavegar_2= ruleBotonNavegar
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getBotonAccess().getBotonKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getBotonAccess().getNavegarKeyword_0_1());
                    			

                    				newCompositeNode(grammarAccess.getBotonAccess().getBotonNavegarParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_BotonNavegar_2=ruleBotonNavegar();

                    state._fsp--;


                    				current = this_BotonNavegar_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWizard.g:191:3: (otherlv_3= 'Boton' otherlv_4= 'mensaje' this_BotonMensaje_5= ruleBotonMensaje )
                    {
                    // InternalWizard.g:191:3: (otherlv_3= 'Boton' otherlv_4= 'mensaje' this_BotonMensaje_5= ruleBotonMensaje )
                    // InternalWizard.g:192:4: otherlv_3= 'Boton' otherlv_4= 'mensaje' this_BotonMensaje_5= ruleBotonMensaje
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getBotonAccess().getBotonKeyword_1_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBotonAccess().getMensajeKeyword_1_1());
                    			

                    				newCompositeNode(grammarAccess.getBotonAccess().getBotonMensajeParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_BotonMensaje_5=ruleBotonMensaje();

                    state._fsp--;


                    				current = this_BotonMensaje_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWizard.g:210:3: (otherlv_6= 'Boton' otherlv_7= 'cerrar' this_BotonCerrar_8= ruleBotonCerrar )
                    {
                    // InternalWizard.g:210:3: (otherlv_6= 'Boton' otherlv_7= 'cerrar' this_BotonCerrar_8= ruleBotonCerrar )
                    // InternalWizard.g:211:4: otherlv_6= 'Boton' otherlv_7= 'cerrar' this_BotonCerrar_8= ruleBotonCerrar
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getBotonAccess().getBotonKeyword_2_0());
                    			
                    otherlv_7=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getBotonAccess().getCerrarKeyword_2_1());
                    			

                    				newCompositeNode(grammarAccess.getBotonAccess().getBotonCerrarParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_BotonCerrar_8=ruleBotonCerrar();

                    state._fsp--;


                    				current = this_BotonCerrar_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoton"


    // $ANTLR start "entryRuleEString"
    // InternalWizard.g:232:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalWizard.g:232:47: (iv_ruleEString= ruleEString EOF )
            // InternalWizard.g:233:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalWizard.g:239:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalWizard.g:245:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalWizard.g:246:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalWizard.g:246:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalWizard.g:247:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalWizard.g:255:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePagina"
    // InternalWizard.g:266:1: entryRulePagina returns [EObject current=null] : iv_rulePagina= rulePagina EOF ;
    public final EObject entryRulePagina() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePagina = null;


        try {
            // InternalWizard.g:266:47: (iv_rulePagina= rulePagina EOF )
            // InternalWizard.g:267:2: iv_rulePagina= rulePagina EOF
            {
             newCompositeNode(grammarAccess.getPaginaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePagina=rulePagina();

            state._fsp--;

             current =iv_rulePagina; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePagina"


    // $ANTLR start "rulePagina"
    // InternalWizard.g:273:1: rulePagina returns [EObject current=null] : (otherlv_0= 'Pagina' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'campos' otherlv_4= '{' ( (lv_camposTexto_5_0= ruleCampoTexto ) ) (otherlv_6= ',' ( (lv_camposTexto_7_0= ruleCampoTexto ) ) )* otherlv_8= '}' )? (otherlv_9= 'casillas' otherlv_10= '{' ( (lv_casillasVerif_11_0= ruleCasillaVerif ) ) (otherlv_12= ',' ( (lv_casillasVerif_13_0= ruleCasillaVerif ) ) )* otherlv_14= '}' )? otherlv_15= 'botones' otherlv_16= '{' ( (lv_botones_17_0= ruleBoton ) ) (otherlv_18= ',' ( (lv_botones_19_0= ruleBoton ) ) )* otherlv_20= '}' otherlv_21= ';' ) ;
    public final EObject rulePagina() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_camposTexto_5_0 = null;

        EObject lv_camposTexto_7_0 = null;

        EObject lv_casillasVerif_11_0 = null;

        EObject lv_casillasVerif_13_0 = null;

        EObject lv_botones_17_0 = null;

        EObject lv_botones_19_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:279:2: ( (otherlv_0= 'Pagina' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'campos' otherlv_4= '{' ( (lv_camposTexto_5_0= ruleCampoTexto ) ) (otherlv_6= ',' ( (lv_camposTexto_7_0= ruleCampoTexto ) ) )* otherlv_8= '}' )? (otherlv_9= 'casillas' otherlv_10= '{' ( (lv_casillasVerif_11_0= ruleCasillaVerif ) ) (otherlv_12= ',' ( (lv_casillasVerif_13_0= ruleCasillaVerif ) ) )* otherlv_14= '}' )? otherlv_15= 'botones' otherlv_16= '{' ( (lv_botones_17_0= ruleBoton ) ) (otherlv_18= ',' ( (lv_botones_19_0= ruleBoton ) ) )* otherlv_20= '}' otherlv_21= ';' ) )
            // InternalWizard.g:280:2: (otherlv_0= 'Pagina' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'campos' otherlv_4= '{' ( (lv_camposTexto_5_0= ruleCampoTexto ) ) (otherlv_6= ',' ( (lv_camposTexto_7_0= ruleCampoTexto ) ) )* otherlv_8= '}' )? (otherlv_9= 'casillas' otherlv_10= '{' ( (lv_casillasVerif_11_0= ruleCasillaVerif ) ) (otherlv_12= ',' ( (lv_casillasVerif_13_0= ruleCasillaVerif ) ) )* otherlv_14= '}' )? otherlv_15= 'botones' otherlv_16= '{' ( (lv_botones_17_0= ruleBoton ) ) (otherlv_18= ',' ( (lv_botones_19_0= ruleBoton ) ) )* otherlv_20= '}' otherlv_21= ';' )
            {
            // InternalWizard.g:280:2: (otherlv_0= 'Pagina' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'campos' otherlv_4= '{' ( (lv_camposTexto_5_0= ruleCampoTexto ) ) (otherlv_6= ',' ( (lv_camposTexto_7_0= ruleCampoTexto ) ) )* otherlv_8= '}' )? (otherlv_9= 'casillas' otherlv_10= '{' ( (lv_casillasVerif_11_0= ruleCasillaVerif ) ) (otherlv_12= ',' ( (lv_casillasVerif_13_0= ruleCasillaVerif ) ) )* otherlv_14= '}' )? otherlv_15= 'botones' otherlv_16= '{' ( (lv_botones_17_0= ruleBoton ) ) (otherlv_18= ',' ( (lv_botones_19_0= ruleBoton ) ) )* otherlv_20= '}' otherlv_21= ';' )
            // InternalWizard.g:281:3: otherlv_0= 'Pagina' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'campos' otherlv_4= '{' ( (lv_camposTexto_5_0= ruleCampoTexto ) ) (otherlv_6= ',' ( (lv_camposTexto_7_0= ruleCampoTexto ) ) )* otherlv_8= '}' )? (otherlv_9= 'casillas' otherlv_10= '{' ( (lv_casillasVerif_11_0= ruleCasillaVerif ) ) (otherlv_12= ',' ( (lv_casillasVerif_13_0= ruleCasillaVerif ) ) )* otherlv_14= '}' )? otherlv_15= 'botones' otherlv_16= '{' ( (lv_botones_17_0= ruleBoton ) ) (otherlv_18= ',' ( (lv_botones_19_0= ruleBoton ) ) )* otherlv_20= '}' otherlv_21= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPaginaAccess().getPaginaKeyword_0());
            		
            // InternalWizard.g:285:3: ( (lv_name_1_0= ruleEString ) )
            // InternalWizard.g:286:4: (lv_name_1_0= ruleEString )
            {
            // InternalWizard.g:286:4: (lv_name_1_0= ruleEString )
            // InternalWizard.g:287:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPaginaAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPaginaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPaginaAccess().getColonKeyword_2());
            		
            // InternalWizard.g:308:3: (otherlv_3= 'campos' otherlv_4= '{' ( (lv_camposTexto_5_0= ruleCampoTexto ) ) (otherlv_6= ',' ( (lv_camposTexto_7_0= ruleCampoTexto ) ) )* otherlv_8= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWizard.g:309:4: otherlv_3= 'campos' otherlv_4= '{' ( (lv_camposTexto_5_0= ruleCampoTexto ) ) (otherlv_6= ',' ( (lv_camposTexto_7_0= ruleCampoTexto ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPaginaAccess().getCamposKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalWizard.g:317:4: ( (lv_camposTexto_5_0= ruleCampoTexto ) )
                    // InternalWizard.g:318:5: (lv_camposTexto_5_0= ruleCampoTexto )
                    {
                    // InternalWizard.g:318:5: (lv_camposTexto_5_0= ruleCampoTexto )
                    // InternalWizard.g:319:6: lv_camposTexto_5_0= ruleCampoTexto
                    {

                    						newCompositeNode(grammarAccess.getPaginaAccess().getCamposTextoCampoTextoParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_camposTexto_5_0=ruleCampoTexto();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPaginaRule());
                    						}
                    						add(
                    							current,
                    							"camposTexto",
                    							lv_camposTexto_5_0,
                    							"wizard.Wizard.CampoTexto");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWizard.g:336:4: (otherlv_6= ',' ( (lv_camposTexto_7_0= ruleCampoTexto ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==23) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalWizard.g:337:5: otherlv_6= ',' ( (lv_camposTexto_7_0= ruleCampoTexto ) )
                    	    {
                    	    otherlv_6=(Token)match(input,23,FOLLOW_14); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPaginaAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalWizard.g:341:5: ( (lv_camposTexto_7_0= ruleCampoTexto ) )
                    	    // InternalWizard.g:342:6: (lv_camposTexto_7_0= ruleCampoTexto )
                    	    {
                    	    // InternalWizard.g:342:6: (lv_camposTexto_7_0= ruleCampoTexto )
                    	    // InternalWizard.g:343:7: lv_camposTexto_7_0= ruleCampoTexto
                    	    {

                    	    							newCompositeNode(grammarAccess.getPaginaAccess().getCamposTextoCampoTextoParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_camposTexto_7_0=ruleCampoTexto();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPaginaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"camposTexto",
                    	    								lv_camposTexto_7_0,
                    	    								"wizard.Wizard.CampoTexto");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalWizard.g:366:3: (otherlv_9= 'casillas' otherlv_10= '{' ( (lv_casillasVerif_11_0= ruleCasillaVerif ) ) (otherlv_12= ',' ( (lv_casillasVerif_13_0= ruleCasillaVerif ) ) )* otherlv_14= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalWizard.g:367:4: otherlv_9= 'casillas' otherlv_10= '{' ( (lv_casillasVerif_11_0= ruleCasillaVerif ) ) (otherlv_12= ',' ( (lv_casillasVerif_13_0= ruleCasillaVerif ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getPaginaAccess().getCasillasKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalWizard.g:375:4: ( (lv_casillasVerif_11_0= ruleCasillaVerif ) )
                    // InternalWizard.g:376:5: (lv_casillasVerif_11_0= ruleCasillaVerif )
                    {
                    // InternalWizard.g:376:5: (lv_casillasVerif_11_0= ruleCasillaVerif )
                    // InternalWizard.g:377:6: lv_casillasVerif_11_0= ruleCasillaVerif
                    {

                    						newCompositeNode(grammarAccess.getPaginaAccess().getCasillasVerifCasillaVerifParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_casillasVerif_11_0=ruleCasillaVerif();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPaginaRule());
                    						}
                    						add(
                    							current,
                    							"casillasVerif",
                    							lv_casillasVerif_11_0,
                    							"wizard.Wizard.CasillaVerif");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWizard.g:394:4: (otherlv_12= ',' ( (lv_casillasVerif_13_0= ruleCasillaVerif ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==23) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalWizard.g:395:5: otherlv_12= ',' ( (lv_casillasVerif_13_0= ruleCasillaVerif ) )
                    	    {
                    	    otherlv_12=(Token)match(input,23,FOLLOW_17); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPaginaAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalWizard.g:399:5: ( (lv_casillasVerif_13_0= ruleCasillaVerif ) )
                    	    // InternalWizard.g:400:6: (lv_casillasVerif_13_0= ruleCasillaVerif )
                    	    {
                    	    // InternalWizard.g:400:6: (lv_casillasVerif_13_0= ruleCasillaVerif )
                    	    // InternalWizard.g:401:7: lv_casillasVerif_13_0= ruleCasillaVerif
                    	    {

                    	    							newCompositeNode(grammarAccess.getPaginaAccess().getCasillasVerifCasillaVerifParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_casillasVerif_13_0=ruleCasillaVerif();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPaginaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"casillasVerif",
                    	    								lv_casillasVerif_13_0,
                    	    								"wizard.Wizard.CasillaVerif");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_14, grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_15, grammarAccess.getPaginaAccess().getBotonesKeyword_5());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_16, grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalWizard.g:432:3: ( (lv_botones_17_0= ruleBoton ) )
            // InternalWizard.g:433:4: (lv_botones_17_0= ruleBoton )
            {
            // InternalWizard.g:433:4: (lv_botones_17_0= ruleBoton )
            // InternalWizard.g:434:5: lv_botones_17_0= ruleBoton
            {

            					newCompositeNode(grammarAccess.getPaginaAccess().getBotonesBotonParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_15);
            lv_botones_17_0=ruleBoton();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPaginaRule());
            					}
            					add(
            						current,
            						"botones",
            						lv_botones_17_0,
            						"wizard.Wizard.Boton");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:451:3: (otherlv_18= ',' ( (lv_botones_19_0= ruleBoton ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWizard.g:452:4: otherlv_18= ',' ( (lv_botones_19_0= ruleBoton ) )
            	    {
            	    otherlv_18=(Token)match(input,23,FOLLOW_19); 

            	    				newLeafNode(otherlv_18, grammarAccess.getPaginaAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalWizard.g:456:4: ( (lv_botones_19_0= ruleBoton ) )
            	    // InternalWizard.g:457:5: (lv_botones_19_0= ruleBoton )
            	    {
            	    // InternalWizard.g:457:5: (lv_botones_19_0= ruleBoton )
            	    // InternalWizard.g:458:6: lv_botones_19_0= ruleBoton
            	    {

            	    						newCompositeNode(grammarAccess.getPaginaAccess().getBotonesBotonParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_botones_19_0=ruleBoton();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPaginaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"botones",
            	    							lv_botones_19_0,
            	    							"wizard.Wizard.Boton");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_20=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_20, grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_21=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getPaginaAccess().getSemicolonKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePagina"


    // $ANTLR start "entryRuleCampoTexto"
    // InternalWizard.g:488:1: entryRuleCampoTexto returns [EObject current=null] : iv_ruleCampoTexto= ruleCampoTexto EOF ;
    public final EObject entryRuleCampoTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampoTexto = null;


        try {
            // InternalWizard.g:488:51: (iv_ruleCampoTexto= ruleCampoTexto EOF )
            // InternalWizard.g:489:2: iv_ruleCampoTexto= ruleCampoTexto EOF
            {
             newCompositeNode(grammarAccess.getCampoTextoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCampoTexto=ruleCampoTexto();

            state._fsp--;

             current =iv_ruleCampoTexto; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCampoTexto"


    // $ANTLR start "ruleCampoTexto"
    // InternalWizard.g:495:1: ruleCampoTexto returns [EObject current=null] : (otherlv_0= 'CampoTexto' ( (lv_tag_1_0= ruleEString ) ) ( (lv_opcional_2_0= 'opcional' ) )? ) ;
    public final EObject ruleCampoTexto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_opcional_2_0=null;
        AntlrDatatypeRuleToken lv_tag_1_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:501:2: ( (otherlv_0= 'CampoTexto' ( (lv_tag_1_0= ruleEString ) ) ( (lv_opcional_2_0= 'opcional' ) )? ) )
            // InternalWizard.g:502:2: (otherlv_0= 'CampoTexto' ( (lv_tag_1_0= ruleEString ) ) ( (lv_opcional_2_0= 'opcional' ) )? )
            {
            // InternalWizard.g:502:2: (otherlv_0= 'CampoTexto' ( (lv_tag_1_0= ruleEString ) ) ( (lv_opcional_2_0= 'opcional' ) )? )
            // InternalWizard.g:503:3: otherlv_0= 'CampoTexto' ( (lv_tag_1_0= ruleEString ) ) ( (lv_opcional_2_0= 'opcional' ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCampoTextoAccess().getCampoTextoKeyword_0());
            		
            // InternalWizard.g:507:3: ( (lv_tag_1_0= ruleEString ) )
            // InternalWizard.g:508:4: (lv_tag_1_0= ruleEString )
            {
            // InternalWizard.g:508:4: (lv_tag_1_0= ruleEString )
            // InternalWizard.g:509:5: lv_tag_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCampoTextoAccess().getTagEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_tag_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCampoTextoRule());
            					}
            					set(
            						current,
            						"tag",
            						lv_tag_1_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:526:3: ( (lv_opcional_2_0= 'opcional' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalWizard.g:527:4: (lv_opcional_2_0= 'opcional' )
                    {
                    // InternalWizard.g:527:4: (lv_opcional_2_0= 'opcional' )
                    // InternalWizard.g:528:5: lv_opcional_2_0= 'opcional'
                    {
                    lv_opcional_2_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_opcional_2_0, grammarAccess.getCampoTextoAccess().getOpcionalOpcionalKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCampoTextoRule());
                    					}
                    					setWithLastConsumed(current, "opcional", true, "opcional");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCampoTexto"


    // $ANTLR start "entryRuleCasillaVerif"
    // InternalWizard.g:544:1: entryRuleCasillaVerif returns [EObject current=null] : iv_ruleCasillaVerif= ruleCasillaVerif EOF ;
    public final EObject entryRuleCasillaVerif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCasillaVerif = null;


        try {
            // InternalWizard.g:544:53: (iv_ruleCasillaVerif= ruleCasillaVerif EOF )
            // InternalWizard.g:545:2: iv_ruleCasillaVerif= ruleCasillaVerif EOF
            {
             newCompositeNode(grammarAccess.getCasillaVerifRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCasillaVerif=ruleCasillaVerif();

            state._fsp--;

             current =iv_ruleCasillaVerif; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCasillaVerif"


    // $ANTLR start "ruleCasillaVerif"
    // InternalWizard.g:551:1: ruleCasillaVerif returns [EObject current=null] : (otherlv_0= 'CasillaVerif' ( (lv_name_1_0= ruleEString ) ) ( (lv_tag_2_0= ruleEString ) ) ( (lv_porDef_3_0= 'selected' ) )? ) ;
    public final EObject ruleCasillaVerif() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_porDef_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_tag_2_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:557:2: ( (otherlv_0= 'CasillaVerif' ( (lv_name_1_0= ruleEString ) ) ( (lv_tag_2_0= ruleEString ) ) ( (lv_porDef_3_0= 'selected' ) )? ) )
            // InternalWizard.g:558:2: (otherlv_0= 'CasillaVerif' ( (lv_name_1_0= ruleEString ) ) ( (lv_tag_2_0= ruleEString ) ) ( (lv_porDef_3_0= 'selected' ) )? )
            {
            // InternalWizard.g:558:2: (otherlv_0= 'CasillaVerif' ( (lv_name_1_0= ruleEString ) ) ( (lv_tag_2_0= ruleEString ) ) ( (lv_porDef_3_0= 'selected' ) )? )
            // InternalWizard.g:559:3: otherlv_0= 'CasillaVerif' ( (lv_name_1_0= ruleEString ) ) ( (lv_tag_2_0= ruleEString ) ) ( (lv_porDef_3_0= 'selected' ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCasillaVerifAccess().getCasillaVerifKeyword_0());
            		
            // InternalWizard.g:563:3: ( (lv_name_1_0= ruleEString ) )
            // InternalWizard.g:564:4: (lv_name_1_0= ruleEString )
            {
            // InternalWizard.g:564:4: (lv_name_1_0= ruleEString )
            // InternalWizard.g:565:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCasillaVerifAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCasillaVerifRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:582:3: ( (lv_tag_2_0= ruleEString ) )
            // InternalWizard.g:583:4: (lv_tag_2_0= ruleEString )
            {
            // InternalWizard.g:583:4: (lv_tag_2_0= ruleEString )
            // InternalWizard.g:584:5: lv_tag_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCasillaVerifAccess().getTagEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_tag_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCasillaVerifRule());
            					}
            					set(
            						current,
            						"tag",
            						lv_tag_2_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:601:3: ( (lv_porDef_3_0= 'selected' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalWizard.g:602:4: (lv_porDef_3_0= 'selected' )
                    {
                    // InternalWizard.g:602:4: (lv_porDef_3_0= 'selected' )
                    // InternalWizard.g:603:5: lv_porDef_3_0= 'selected'
                    {
                    lv_porDef_3_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_porDef_3_0, grammarAccess.getCasillaVerifAccess().getPorDefSelectedKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCasillaVerifRule());
                    					}
                    					setWithLastConsumed(current, "porDef", true, "selected");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCasillaVerif"


    // $ANTLR start "entryRuleBotonNavegar"
    // InternalWizard.g:619:1: entryRuleBotonNavegar returns [EObject current=null] : iv_ruleBotonNavegar= ruleBotonNavegar EOF ;
    public final EObject entryRuleBotonNavegar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonNavegar = null;


        try {
            // InternalWizard.g:619:53: (iv_ruleBotonNavegar= ruleBotonNavegar EOF )
            // InternalWizard.g:620:2: iv_ruleBotonNavegar= ruleBotonNavegar EOF
            {
             newCompositeNode(grammarAccess.getBotonNavegarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBotonNavegar=ruleBotonNavegar();

            state._fsp--;

             current =iv_ruleBotonNavegar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBotonNavegar"


    // $ANTLR start "ruleBotonNavegar"
    // InternalWizard.g:626:1: ruleBotonNavegar returns [EObject current=null] : ( ( (lv_tag_0_0= ruleEString ) ) otherlv_1= 'destinos' otherlv_2= ':' ( (lv_destino_3_0= ruleDestino ) ) (otherlv_4= ',' ( (lv_destino_5_0= ruleDestino ) ) )* ) ;
    public final EObject ruleBotonNavegar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_tag_0_0 = null;

        EObject lv_destino_3_0 = null;

        EObject lv_destino_5_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:632:2: ( ( ( (lv_tag_0_0= ruleEString ) ) otherlv_1= 'destinos' otherlv_2= ':' ( (lv_destino_3_0= ruleDestino ) ) (otherlv_4= ',' ( (lv_destino_5_0= ruleDestino ) ) )* ) )
            // InternalWizard.g:633:2: ( ( (lv_tag_0_0= ruleEString ) ) otherlv_1= 'destinos' otherlv_2= ':' ( (lv_destino_3_0= ruleDestino ) ) (otherlv_4= ',' ( (lv_destino_5_0= ruleDestino ) ) )* )
            {
            // InternalWizard.g:633:2: ( ( (lv_tag_0_0= ruleEString ) ) otherlv_1= 'destinos' otherlv_2= ':' ( (lv_destino_3_0= ruleDestino ) ) (otherlv_4= ',' ( (lv_destino_5_0= ruleDestino ) ) )* )
            // InternalWizard.g:634:3: ( (lv_tag_0_0= ruleEString ) ) otherlv_1= 'destinos' otherlv_2= ':' ( (lv_destino_3_0= ruleDestino ) ) (otherlv_4= ',' ( (lv_destino_5_0= ruleDestino ) ) )*
            {
            // InternalWizard.g:634:3: ( (lv_tag_0_0= ruleEString ) )
            // InternalWizard.g:635:4: (lv_tag_0_0= ruleEString )
            {
            // InternalWizard.g:635:4: (lv_tag_0_0= ruleEString )
            // InternalWizard.g:636:5: lv_tag_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBotonNavegarAccess().getTagEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_tag_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBotonNavegarRule());
            					}
            					set(
            						current,
            						"tag",
            						lv_tag_0_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getBotonNavegarAccess().getDestinosKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getBotonNavegarAccess().getColonKeyword_2());
            		
            // InternalWizard.g:661:3: ( (lv_destino_3_0= ruleDestino ) )
            // InternalWizard.g:662:4: (lv_destino_3_0= ruleDestino )
            {
            // InternalWizard.g:662:4: (lv_destino_3_0= ruleDestino )
            // InternalWizard.g:663:5: lv_destino_3_0= ruleDestino
            {

            					newCompositeNode(grammarAccess.getBotonNavegarAccess().getDestinoDestinoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_destino_3_0=ruleDestino();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBotonNavegarRule());
            					}
            					add(
            						current,
            						"destino",
            						lv_destino_3_0,
            						"wizard.Wizard.Destino");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:680:3: (otherlv_4= ',' ( (lv_destino_5_0= ruleDestino ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==32) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalWizard.g:681:4: otherlv_4= ',' ( (lv_destino_5_0= ruleDestino ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_24); 

            	    				newLeafNode(otherlv_4, grammarAccess.getBotonNavegarAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalWizard.g:685:4: ( (lv_destino_5_0= ruleDestino ) )
            	    // InternalWizard.g:686:5: (lv_destino_5_0= ruleDestino )
            	    {
            	    // InternalWizard.g:686:5: (lv_destino_5_0= ruleDestino )
            	    // InternalWizard.g:687:6: lv_destino_5_0= ruleDestino
            	    {

            	    						newCompositeNode(grammarAccess.getBotonNavegarAccess().getDestinoDestinoParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_destino_5_0=ruleDestino();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBotonNavegarRule());
            	    						}
            	    						add(
            	    							current,
            	    							"destino",
            	    							lv_destino_5_0,
            	    							"wizard.Wizard.Destino");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBotonNavegar"


    // $ANTLR start "entryRuleBotonMensaje"
    // InternalWizard.g:709:1: entryRuleBotonMensaje returns [EObject current=null] : iv_ruleBotonMensaje= ruleBotonMensaje EOF ;
    public final EObject entryRuleBotonMensaje() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonMensaje = null;


        try {
            // InternalWizard.g:709:53: (iv_ruleBotonMensaje= ruleBotonMensaje EOF )
            // InternalWizard.g:710:2: iv_ruleBotonMensaje= ruleBotonMensaje EOF
            {
             newCompositeNode(grammarAccess.getBotonMensajeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBotonMensaje=ruleBotonMensaje();

            state._fsp--;

             current =iv_ruleBotonMensaje; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBotonMensaje"


    // $ANTLR start "ruleBotonMensaje"
    // InternalWizard.g:716:1: ruleBotonMensaje returns [EObject current=null] : ( ( (lv_tag_0_0= ruleEString ) ) otherlv_1= 'mensaje' otherlv_2= ':' ( (lv_mensaje_3_0= ruleEString ) ) ) ;
    public final EObject ruleBotonMensaje() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_tag_0_0 = null;

        AntlrDatatypeRuleToken lv_mensaje_3_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:722:2: ( ( ( (lv_tag_0_0= ruleEString ) ) otherlv_1= 'mensaje' otherlv_2= ':' ( (lv_mensaje_3_0= ruleEString ) ) ) )
            // InternalWizard.g:723:2: ( ( (lv_tag_0_0= ruleEString ) ) otherlv_1= 'mensaje' otherlv_2= ':' ( (lv_mensaje_3_0= ruleEString ) ) )
            {
            // InternalWizard.g:723:2: ( ( (lv_tag_0_0= ruleEString ) ) otherlv_1= 'mensaje' otherlv_2= ':' ( (lv_mensaje_3_0= ruleEString ) ) )
            // InternalWizard.g:724:3: ( (lv_tag_0_0= ruleEString ) ) otherlv_1= 'mensaje' otherlv_2= ':' ( (lv_mensaje_3_0= ruleEString ) )
            {
            // InternalWizard.g:724:3: ( (lv_tag_0_0= ruleEString ) )
            // InternalWizard.g:725:4: (lv_tag_0_0= ruleEString )
            {
            // InternalWizard.g:725:4: (lv_tag_0_0= ruleEString )
            // InternalWizard.g:726:5: lv_tag_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBotonMensajeAccess().getTagEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_tag_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBotonMensajeRule());
            					}
            					set(
            						current,
            						"tag",
            						lv_tag_0_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getBotonMensajeAccess().getMensajeKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBotonMensajeAccess().getColonKeyword_2());
            		
            // InternalWizard.g:751:3: ( (lv_mensaje_3_0= ruleEString ) )
            // InternalWizard.g:752:4: (lv_mensaje_3_0= ruleEString )
            {
            // InternalWizard.g:752:4: (lv_mensaje_3_0= ruleEString )
            // InternalWizard.g:753:5: lv_mensaje_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBotonMensajeAccess().getMensajeEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_mensaje_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBotonMensajeRule());
            					}
            					set(
            						current,
            						"mensaje",
            						lv_mensaje_3_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBotonMensaje"


    // $ANTLR start "entryRuleBotonCerrar"
    // InternalWizard.g:774:1: entryRuleBotonCerrar returns [EObject current=null] : iv_ruleBotonCerrar= ruleBotonCerrar EOF ;
    public final EObject entryRuleBotonCerrar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonCerrar = null;


        try {
            // InternalWizard.g:774:52: (iv_ruleBotonCerrar= ruleBotonCerrar EOF )
            // InternalWizard.g:775:2: iv_ruleBotonCerrar= ruleBotonCerrar EOF
            {
             newCompositeNode(grammarAccess.getBotonCerrarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBotonCerrar=ruleBotonCerrar();

            state._fsp--;

             current =iv_ruleBotonCerrar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBotonCerrar"


    // $ANTLR start "ruleBotonCerrar"
    // InternalWizard.g:781:1: ruleBotonCerrar returns [EObject current=null] : ( () ( (lv_tag_1_0= ruleEString ) ) ) ;
    public final EObject ruleBotonCerrar() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tag_1_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:787:2: ( ( () ( (lv_tag_1_0= ruleEString ) ) ) )
            // InternalWizard.g:788:2: ( () ( (lv_tag_1_0= ruleEString ) ) )
            {
            // InternalWizard.g:788:2: ( () ( (lv_tag_1_0= ruleEString ) ) )
            // InternalWizard.g:789:3: () ( (lv_tag_1_0= ruleEString ) )
            {
            // InternalWizard.g:789:3: ()
            // InternalWizard.g:790:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBotonCerrarAccess().getBotonCerrarAction_0(),
            					current);
            			

            }

            // InternalWizard.g:796:3: ( (lv_tag_1_0= ruleEString ) )
            // InternalWizard.g:797:4: (lv_tag_1_0= ruleEString )
            {
            // InternalWizard.g:797:4: (lv_tag_1_0= ruleEString )
            // InternalWizard.g:798:5: lv_tag_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBotonCerrarAccess().getTagEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_tag_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBotonCerrarRule());
            					}
            					set(
            						current,
            						"tag",
            						lv_tag_1_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBotonCerrar"


    // $ANTLR start "entryRuleDestino"
    // InternalWizard.g:819:1: entryRuleDestino returns [EObject current=null] : iv_ruleDestino= ruleDestino EOF ;
    public final EObject entryRuleDestino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestino = null;


        try {
            // InternalWizard.g:819:48: (iv_ruleDestino= ruleDestino EOF )
            // InternalWizard.g:820:2: iv_ruleDestino= ruleDestino EOF
            {
             newCompositeNode(grammarAccess.getDestinoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestino=ruleDestino();

            state._fsp--;

             current =iv_ruleDestino; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestino"


    // $ANTLR start "ruleDestino"
    // InternalWizard.g:826:1: ruleDestino returns [EObject current=null] : (otherlv_0= '(' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )? otherlv_4= ')' ) ;
    public final EObject ruleDestino() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalWizard.g:832:2: ( (otherlv_0= '(' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )? otherlv_4= ')' ) )
            // InternalWizard.g:833:2: (otherlv_0= '(' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )? otherlv_4= ')' )
            {
            // InternalWizard.g:833:2: (otherlv_0= '(' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )? otherlv_4= ')' )
            // InternalWizard.g:834:3: otherlv_0= '(' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDestinoAccess().getLeftParenthesisKeyword_0());
            		
            // InternalWizard.g:838:3: ( ( ruleEString ) )
            // InternalWizard.g:839:4: ( ruleEString )
            {
            // InternalWizard.g:839:4: ( ruleEString )
            // InternalWizard.g:840:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestinoRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDestinoAccess().getDestinoPaginaCrossReference_1_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:854:3: (otherlv_2= ',' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalWizard.g:855:4: otherlv_2= ',' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDestinoAccess().getCommaKeyword_2_0());
                    			
                    // InternalWizard.g:859:4: ( ( ruleEString ) )
                    // InternalWizard.g:860:5: ( ruleEString )
                    {
                    // InternalWizard.g:860:5: ( ruleEString )
                    // InternalWizard.g:861:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDestinoRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDestinoAccess().getCasillaCasillaVerifCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDestinoAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestino"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});

}