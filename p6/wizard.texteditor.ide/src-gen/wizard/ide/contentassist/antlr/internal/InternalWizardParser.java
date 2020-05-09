package wizard.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import wizard.services.WizardGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWizardParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Wizard'", "'{'", "'Paginas:'", "'inicial'", "'}'", "'Boton'", "'navegar'", "'mensaje'", "'cerrar'", "'Pagina'", "':'", "'botones'", "'campos'", "','", "'casillas'", "'CampoTexto'", "'CasillaVerif'", "'destinos'", "'('", "')'", "'opcional'", "'selected'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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

    	public void setGrammarAccess(WizardGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleWizard"
    // InternalWizard.g:53:1: entryRuleWizard : ruleWizard EOF ;
    public final void entryRuleWizard() throws RecognitionException {
        try {
            // InternalWizard.g:54:1: ( ruleWizard EOF )
            // InternalWizard.g:55:1: ruleWizard EOF
            {
             before(grammarAccess.getWizardRule()); 
            pushFollow(FOLLOW_1);
            ruleWizard();

            state._fsp--;

             after(grammarAccess.getWizardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWizard"


    // $ANTLR start "ruleWizard"
    // InternalWizard.g:62:1: ruleWizard : ( ( rule__Wizard__Group__0 ) ) ;
    public final void ruleWizard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:66:2: ( ( ( rule__Wizard__Group__0 ) ) )
            // InternalWizard.g:67:2: ( ( rule__Wizard__Group__0 ) )
            {
            // InternalWizard.g:67:2: ( ( rule__Wizard__Group__0 ) )
            // InternalWizard.g:68:3: ( rule__Wizard__Group__0 )
            {
             before(grammarAccess.getWizardAccess().getGroup()); 
            // InternalWizard.g:69:3: ( rule__Wizard__Group__0 )
            // InternalWizard.g:69:4: rule__Wizard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wizard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWizard"


    // $ANTLR start "entryRuleBoton"
    // InternalWizard.g:78:1: entryRuleBoton : ruleBoton EOF ;
    public final void entryRuleBoton() throws RecognitionException {
        try {
            // InternalWizard.g:79:1: ( ruleBoton EOF )
            // InternalWizard.g:80:1: ruleBoton EOF
            {
             before(grammarAccess.getBotonRule()); 
            pushFollow(FOLLOW_1);
            ruleBoton();

            state._fsp--;

             after(grammarAccess.getBotonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoton"


    // $ANTLR start "ruleBoton"
    // InternalWizard.g:87:1: ruleBoton : ( ( rule__Boton__Alternatives ) ) ;
    public final void ruleBoton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:91:2: ( ( ( rule__Boton__Alternatives ) ) )
            // InternalWizard.g:92:2: ( ( rule__Boton__Alternatives ) )
            {
            // InternalWizard.g:92:2: ( ( rule__Boton__Alternatives ) )
            // InternalWizard.g:93:3: ( rule__Boton__Alternatives )
            {
             before(grammarAccess.getBotonAccess().getAlternatives()); 
            // InternalWizard.g:94:3: ( rule__Boton__Alternatives )
            // InternalWizard.g:94:4: rule__Boton__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boton__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBotonAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoton"


    // $ANTLR start "entryRuleEString"
    // InternalWizard.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalWizard.g:104:1: ( ruleEString EOF )
            // InternalWizard.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalWizard.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalWizard.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalWizard.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalWizard.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalWizard.g:119:3: ( rule__EString__Alternatives )
            // InternalWizard.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePagina"
    // InternalWizard.g:128:1: entryRulePagina : rulePagina EOF ;
    public final void entryRulePagina() throws RecognitionException {
        try {
            // InternalWizard.g:129:1: ( rulePagina EOF )
            // InternalWizard.g:130:1: rulePagina EOF
            {
             before(grammarAccess.getPaginaRule()); 
            pushFollow(FOLLOW_1);
            rulePagina();

            state._fsp--;

             after(grammarAccess.getPaginaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePagina"


    // $ANTLR start "rulePagina"
    // InternalWizard.g:137:1: rulePagina : ( ( rule__Pagina__Group__0 ) ) ;
    public final void rulePagina() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:141:2: ( ( ( rule__Pagina__Group__0 ) ) )
            // InternalWizard.g:142:2: ( ( rule__Pagina__Group__0 ) )
            {
            // InternalWizard.g:142:2: ( ( rule__Pagina__Group__0 ) )
            // InternalWizard.g:143:3: ( rule__Pagina__Group__0 )
            {
             before(grammarAccess.getPaginaAccess().getGroup()); 
            // InternalWizard.g:144:3: ( rule__Pagina__Group__0 )
            // InternalWizard.g:144:4: rule__Pagina__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePagina"


    // $ANTLR start "entryRuleCampoTexto"
    // InternalWizard.g:153:1: entryRuleCampoTexto : ruleCampoTexto EOF ;
    public final void entryRuleCampoTexto() throws RecognitionException {
        try {
            // InternalWizard.g:154:1: ( ruleCampoTexto EOF )
            // InternalWizard.g:155:1: ruleCampoTexto EOF
            {
             before(grammarAccess.getCampoTextoRule()); 
            pushFollow(FOLLOW_1);
            ruleCampoTexto();

            state._fsp--;

             after(grammarAccess.getCampoTextoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCampoTexto"


    // $ANTLR start "ruleCampoTexto"
    // InternalWizard.g:162:1: ruleCampoTexto : ( ( rule__CampoTexto__Group__0 ) ) ;
    public final void ruleCampoTexto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:166:2: ( ( ( rule__CampoTexto__Group__0 ) ) )
            // InternalWizard.g:167:2: ( ( rule__CampoTexto__Group__0 ) )
            {
            // InternalWizard.g:167:2: ( ( rule__CampoTexto__Group__0 ) )
            // InternalWizard.g:168:3: ( rule__CampoTexto__Group__0 )
            {
             before(grammarAccess.getCampoTextoAccess().getGroup()); 
            // InternalWizard.g:169:3: ( rule__CampoTexto__Group__0 )
            // InternalWizard.g:169:4: rule__CampoTexto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CampoTexto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCampoTextoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCampoTexto"


    // $ANTLR start "entryRuleCasillaVerif"
    // InternalWizard.g:178:1: entryRuleCasillaVerif : ruleCasillaVerif EOF ;
    public final void entryRuleCasillaVerif() throws RecognitionException {
        try {
            // InternalWizard.g:179:1: ( ruleCasillaVerif EOF )
            // InternalWizard.g:180:1: ruleCasillaVerif EOF
            {
             before(grammarAccess.getCasillaVerifRule()); 
            pushFollow(FOLLOW_1);
            ruleCasillaVerif();

            state._fsp--;

             after(grammarAccess.getCasillaVerifRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCasillaVerif"


    // $ANTLR start "ruleCasillaVerif"
    // InternalWizard.g:187:1: ruleCasillaVerif : ( ( rule__CasillaVerif__Group__0 ) ) ;
    public final void ruleCasillaVerif() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:191:2: ( ( ( rule__CasillaVerif__Group__0 ) ) )
            // InternalWizard.g:192:2: ( ( rule__CasillaVerif__Group__0 ) )
            {
            // InternalWizard.g:192:2: ( ( rule__CasillaVerif__Group__0 ) )
            // InternalWizard.g:193:3: ( rule__CasillaVerif__Group__0 )
            {
             before(grammarAccess.getCasillaVerifAccess().getGroup()); 
            // InternalWizard.g:194:3: ( rule__CasillaVerif__Group__0 )
            // InternalWizard.g:194:4: rule__CasillaVerif__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CasillaVerif__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCasillaVerifAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCasillaVerif"


    // $ANTLR start "entryRuleBotonNavegar"
    // InternalWizard.g:203:1: entryRuleBotonNavegar : ruleBotonNavegar EOF ;
    public final void entryRuleBotonNavegar() throws RecognitionException {
        try {
            // InternalWizard.g:204:1: ( ruleBotonNavegar EOF )
            // InternalWizard.g:205:1: ruleBotonNavegar EOF
            {
             before(grammarAccess.getBotonNavegarRule()); 
            pushFollow(FOLLOW_1);
            ruleBotonNavegar();

            state._fsp--;

             after(grammarAccess.getBotonNavegarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBotonNavegar"


    // $ANTLR start "ruleBotonNavegar"
    // InternalWizard.g:212:1: ruleBotonNavegar : ( ( rule__BotonNavegar__Group__0 ) ) ;
    public final void ruleBotonNavegar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:216:2: ( ( ( rule__BotonNavegar__Group__0 ) ) )
            // InternalWizard.g:217:2: ( ( rule__BotonNavegar__Group__0 ) )
            {
            // InternalWizard.g:217:2: ( ( rule__BotonNavegar__Group__0 ) )
            // InternalWizard.g:218:3: ( rule__BotonNavegar__Group__0 )
            {
             before(grammarAccess.getBotonNavegarAccess().getGroup()); 
            // InternalWizard.g:219:3: ( rule__BotonNavegar__Group__0 )
            // InternalWizard.g:219:4: rule__BotonNavegar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BotonNavegar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBotonNavegarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBotonNavegar"


    // $ANTLR start "entryRuleBotonMensaje"
    // InternalWizard.g:228:1: entryRuleBotonMensaje : ruleBotonMensaje EOF ;
    public final void entryRuleBotonMensaje() throws RecognitionException {
        try {
            // InternalWizard.g:229:1: ( ruleBotonMensaje EOF )
            // InternalWizard.g:230:1: ruleBotonMensaje EOF
            {
             before(grammarAccess.getBotonMensajeRule()); 
            pushFollow(FOLLOW_1);
            ruleBotonMensaje();

            state._fsp--;

             after(grammarAccess.getBotonMensajeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBotonMensaje"


    // $ANTLR start "ruleBotonMensaje"
    // InternalWizard.g:237:1: ruleBotonMensaje : ( ( rule__BotonMensaje__Group__0 ) ) ;
    public final void ruleBotonMensaje() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:241:2: ( ( ( rule__BotonMensaje__Group__0 ) ) )
            // InternalWizard.g:242:2: ( ( rule__BotonMensaje__Group__0 ) )
            {
            // InternalWizard.g:242:2: ( ( rule__BotonMensaje__Group__0 ) )
            // InternalWizard.g:243:3: ( rule__BotonMensaje__Group__0 )
            {
             before(grammarAccess.getBotonMensajeAccess().getGroup()); 
            // InternalWizard.g:244:3: ( rule__BotonMensaje__Group__0 )
            // InternalWizard.g:244:4: rule__BotonMensaje__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BotonMensaje__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBotonMensajeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBotonMensaje"


    // $ANTLR start "entryRuleBotonCerrar"
    // InternalWizard.g:253:1: entryRuleBotonCerrar : ruleBotonCerrar EOF ;
    public final void entryRuleBotonCerrar() throws RecognitionException {
        try {
            // InternalWizard.g:254:1: ( ruleBotonCerrar EOF )
            // InternalWizard.g:255:1: ruleBotonCerrar EOF
            {
             before(grammarAccess.getBotonCerrarRule()); 
            pushFollow(FOLLOW_1);
            ruleBotonCerrar();

            state._fsp--;

             after(grammarAccess.getBotonCerrarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBotonCerrar"


    // $ANTLR start "ruleBotonCerrar"
    // InternalWizard.g:262:1: ruleBotonCerrar : ( ( rule__BotonCerrar__Group__0 ) ) ;
    public final void ruleBotonCerrar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:266:2: ( ( ( rule__BotonCerrar__Group__0 ) ) )
            // InternalWizard.g:267:2: ( ( rule__BotonCerrar__Group__0 ) )
            {
            // InternalWizard.g:267:2: ( ( rule__BotonCerrar__Group__0 ) )
            // InternalWizard.g:268:3: ( rule__BotonCerrar__Group__0 )
            {
             before(grammarAccess.getBotonCerrarAccess().getGroup()); 
            // InternalWizard.g:269:3: ( rule__BotonCerrar__Group__0 )
            // InternalWizard.g:269:4: rule__BotonCerrar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BotonCerrar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBotonCerrarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBotonCerrar"


    // $ANTLR start "entryRuleDestino"
    // InternalWizard.g:278:1: entryRuleDestino : ruleDestino EOF ;
    public final void entryRuleDestino() throws RecognitionException {
        try {
            // InternalWizard.g:279:1: ( ruleDestino EOF )
            // InternalWizard.g:280:1: ruleDestino EOF
            {
             before(grammarAccess.getDestinoRule()); 
            pushFollow(FOLLOW_1);
            ruleDestino();

            state._fsp--;

             after(grammarAccess.getDestinoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDestino"


    // $ANTLR start "ruleDestino"
    // InternalWizard.g:287:1: ruleDestino : ( ( rule__Destino__Group__0 ) ) ;
    public final void ruleDestino() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:291:2: ( ( ( rule__Destino__Group__0 ) ) )
            // InternalWizard.g:292:2: ( ( rule__Destino__Group__0 ) )
            {
            // InternalWizard.g:292:2: ( ( rule__Destino__Group__0 ) )
            // InternalWizard.g:293:3: ( rule__Destino__Group__0 )
            {
             before(grammarAccess.getDestinoAccess().getGroup()); 
            // InternalWizard.g:294:3: ( rule__Destino__Group__0 )
            // InternalWizard.g:294:4: rule__Destino__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Destino__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestinoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestino"


    // $ANTLR start "rule__Boton__Alternatives"
    // InternalWizard.g:302:1: rule__Boton__Alternatives : ( ( ( rule__Boton__Group_0__0 ) ) | ( ( rule__Boton__Group_1__0 ) ) | ( ( rule__Boton__Group_2__0 ) ) );
    public final void rule__Boton__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:306:1: ( ( ( rule__Boton__Group_0__0 ) ) | ( ( rule__Boton__Group_1__0 ) ) | ( ( rule__Boton__Group_2__0 ) ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    alt1=3;
                    }
                    break;
                case 17:
                    {
                    alt1=1;
                    }
                    break;
                case 18:
                    {
                    alt1=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalWizard.g:307:2: ( ( rule__Boton__Group_0__0 ) )
                    {
                    // InternalWizard.g:307:2: ( ( rule__Boton__Group_0__0 ) )
                    // InternalWizard.g:308:3: ( rule__Boton__Group_0__0 )
                    {
                     before(grammarAccess.getBotonAccess().getGroup_0()); 
                    // InternalWizard.g:309:3: ( rule__Boton__Group_0__0 )
                    // InternalWizard.g:309:4: rule__Boton__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Boton__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBotonAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWizard.g:313:2: ( ( rule__Boton__Group_1__0 ) )
                    {
                    // InternalWizard.g:313:2: ( ( rule__Boton__Group_1__0 ) )
                    // InternalWizard.g:314:3: ( rule__Boton__Group_1__0 )
                    {
                     before(grammarAccess.getBotonAccess().getGroup_1()); 
                    // InternalWizard.g:315:3: ( rule__Boton__Group_1__0 )
                    // InternalWizard.g:315:4: rule__Boton__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Boton__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBotonAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWizard.g:319:2: ( ( rule__Boton__Group_2__0 ) )
                    {
                    // InternalWizard.g:319:2: ( ( rule__Boton__Group_2__0 ) )
                    // InternalWizard.g:320:3: ( rule__Boton__Group_2__0 )
                    {
                     before(grammarAccess.getBotonAccess().getGroup_2()); 
                    // InternalWizard.g:321:3: ( rule__Boton__Group_2__0 )
                    // InternalWizard.g:321:4: rule__Boton__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Boton__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBotonAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalWizard.g:329:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:333:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWizard.g:334:2: ( RULE_STRING )
                    {
                    // InternalWizard.g:334:2: ( RULE_STRING )
                    // InternalWizard.g:335:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWizard.g:340:2: ( RULE_ID )
                    {
                    // InternalWizard.g:340:2: ( RULE_ID )
                    // InternalWizard.g:341:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Wizard__Group__0"
    // InternalWizard.g:350:1: rule__Wizard__Group__0 : rule__Wizard__Group__0__Impl rule__Wizard__Group__1 ;
    public final void rule__Wizard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:354:1: ( rule__Wizard__Group__0__Impl rule__Wizard__Group__1 )
            // InternalWizard.g:355:2: rule__Wizard__Group__0__Impl rule__Wizard__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Wizard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__0"


    // $ANTLR start "rule__Wizard__Group__0__Impl"
    // InternalWizard.g:362:1: rule__Wizard__Group__0__Impl : ( 'Wizard' ) ;
    public final void rule__Wizard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:366:1: ( ( 'Wizard' ) )
            // InternalWizard.g:367:1: ( 'Wizard' )
            {
            // InternalWizard.g:367:1: ( 'Wizard' )
            // InternalWizard.g:368:2: 'Wizard'
            {
             before(grammarAccess.getWizardAccess().getWizardKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getWizardAccess().getWizardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__0__Impl"


    // $ANTLR start "rule__Wizard__Group__1"
    // InternalWizard.g:377:1: rule__Wizard__Group__1 : rule__Wizard__Group__1__Impl rule__Wizard__Group__2 ;
    public final void rule__Wizard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:381:1: ( rule__Wizard__Group__1__Impl rule__Wizard__Group__2 )
            // InternalWizard.g:382:2: rule__Wizard__Group__1__Impl rule__Wizard__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Wizard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__1"


    // $ANTLR start "rule__Wizard__Group__1__Impl"
    // InternalWizard.g:389:1: rule__Wizard__Group__1__Impl : ( ( rule__Wizard__TituloAssignment_1 ) ) ;
    public final void rule__Wizard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:393:1: ( ( ( rule__Wizard__TituloAssignment_1 ) ) )
            // InternalWizard.g:394:1: ( ( rule__Wizard__TituloAssignment_1 ) )
            {
            // InternalWizard.g:394:1: ( ( rule__Wizard__TituloAssignment_1 ) )
            // InternalWizard.g:395:2: ( rule__Wizard__TituloAssignment_1 )
            {
             before(grammarAccess.getWizardAccess().getTituloAssignment_1()); 
            // InternalWizard.g:396:2: ( rule__Wizard__TituloAssignment_1 )
            // InternalWizard.g:396:3: rule__Wizard__TituloAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Wizard__TituloAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getTituloAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__1__Impl"


    // $ANTLR start "rule__Wizard__Group__2"
    // InternalWizard.g:404:1: rule__Wizard__Group__2 : rule__Wizard__Group__2__Impl rule__Wizard__Group__3 ;
    public final void rule__Wizard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:408:1: ( rule__Wizard__Group__2__Impl rule__Wizard__Group__3 )
            // InternalWizard.g:409:2: rule__Wizard__Group__2__Impl rule__Wizard__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Wizard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__2"


    // $ANTLR start "rule__Wizard__Group__2__Impl"
    // InternalWizard.g:416:1: rule__Wizard__Group__2__Impl : ( '{' ) ;
    public final void rule__Wizard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:420:1: ( ( '{' ) )
            // InternalWizard.g:421:1: ( '{' )
            {
            // InternalWizard.g:421:1: ( '{' )
            // InternalWizard.g:422:2: '{'
            {
             before(grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__2__Impl"


    // $ANTLR start "rule__Wizard__Group__3"
    // InternalWizard.g:431:1: rule__Wizard__Group__3 : rule__Wizard__Group__3__Impl rule__Wizard__Group__4 ;
    public final void rule__Wizard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:435:1: ( rule__Wizard__Group__3__Impl rule__Wizard__Group__4 )
            // InternalWizard.g:436:2: rule__Wizard__Group__3__Impl rule__Wizard__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Wizard__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__3"


    // $ANTLR start "rule__Wizard__Group__3__Impl"
    // InternalWizard.g:443:1: rule__Wizard__Group__3__Impl : ( 'Paginas:' ) ;
    public final void rule__Wizard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:447:1: ( ( 'Paginas:' ) )
            // InternalWizard.g:448:1: ( 'Paginas:' )
            {
            // InternalWizard.g:448:1: ( 'Paginas:' )
            // InternalWizard.g:449:2: 'Paginas:'
            {
             before(grammarAccess.getWizardAccess().getPaginasKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWizardAccess().getPaginasKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__3__Impl"


    // $ANTLR start "rule__Wizard__Group__4"
    // InternalWizard.g:458:1: rule__Wizard__Group__4 : rule__Wizard__Group__4__Impl rule__Wizard__Group__5 ;
    public final void rule__Wizard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:462:1: ( rule__Wizard__Group__4__Impl rule__Wizard__Group__5 )
            // InternalWizard.g:463:2: rule__Wizard__Group__4__Impl rule__Wizard__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Wizard__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__4"


    // $ANTLR start "rule__Wizard__Group__4__Impl"
    // InternalWizard.g:470:1: rule__Wizard__Group__4__Impl : ( ( ( rule__Wizard__PaginasAssignment_4 ) ) ( ( rule__Wizard__PaginasAssignment_4 )* ) ) ;
    public final void rule__Wizard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:474:1: ( ( ( ( rule__Wizard__PaginasAssignment_4 ) ) ( ( rule__Wizard__PaginasAssignment_4 )* ) ) )
            // InternalWizard.g:475:1: ( ( ( rule__Wizard__PaginasAssignment_4 ) ) ( ( rule__Wizard__PaginasAssignment_4 )* ) )
            {
            // InternalWizard.g:475:1: ( ( ( rule__Wizard__PaginasAssignment_4 ) ) ( ( rule__Wizard__PaginasAssignment_4 )* ) )
            // InternalWizard.g:476:2: ( ( rule__Wizard__PaginasAssignment_4 ) ) ( ( rule__Wizard__PaginasAssignment_4 )* )
            {
            // InternalWizard.g:476:2: ( ( rule__Wizard__PaginasAssignment_4 ) )
            // InternalWizard.g:477:3: ( rule__Wizard__PaginasAssignment_4 )
            {
             before(grammarAccess.getWizardAccess().getPaginasAssignment_4()); 
            // InternalWizard.g:478:3: ( rule__Wizard__PaginasAssignment_4 )
            // InternalWizard.g:478:4: rule__Wizard__PaginasAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__Wizard__PaginasAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getPaginasAssignment_4()); 

            }

            // InternalWizard.g:481:2: ( ( rule__Wizard__PaginasAssignment_4 )* )
            // InternalWizard.g:482:3: ( rule__Wizard__PaginasAssignment_4 )*
            {
             before(grammarAccess.getWizardAccess().getPaginasAssignment_4()); 
            // InternalWizard.g:483:3: ( rule__Wizard__PaginasAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWizard.g:483:4: rule__Wizard__PaginasAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Wizard__PaginasAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getWizardAccess().getPaginasAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__4__Impl"


    // $ANTLR start "rule__Wizard__Group__5"
    // InternalWizard.g:492:1: rule__Wizard__Group__5 : rule__Wizard__Group__5__Impl rule__Wizard__Group__6 ;
    public final void rule__Wizard__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:496:1: ( rule__Wizard__Group__5__Impl rule__Wizard__Group__6 )
            // InternalWizard.g:497:2: rule__Wizard__Group__5__Impl rule__Wizard__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Wizard__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__5"


    // $ANTLR start "rule__Wizard__Group__5__Impl"
    // InternalWizard.g:504:1: rule__Wizard__Group__5__Impl : ( 'inicial' ) ;
    public final void rule__Wizard__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:508:1: ( ( 'inicial' ) )
            // InternalWizard.g:509:1: ( 'inicial' )
            {
            // InternalWizard.g:509:1: ( 'inicial' )
            // InternalWizard.g:510:2: 'inicial'
            {
             before(grammarAccess.getWizardAccess().getInicialKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWizardAccess().getInicialKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__5__Impl"


    // $ANTLR start "rule__Wizard__Group__6"
    // InternalWizard.g:519:1: rule__Wizard__Group__6 : rule__Wizard__Group__6__Impl rule__Wizard__Group__7 ;
    public final void rule__Wizard__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:523:1: ( rule__Wizard__Group__6__Impl rule__Wizard__Group__7 )
            // InternalWizard.g:524:2: rule__Wizard__Group__6__Impl rule__Wizard__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Wizard__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__6"


    // $ANTLR start "rule__Wizard__Group__6__Impl"
    // InternalWizard.g:531:1: rule__Wizard__Group__6__Impl : ( ( rule__Wizard__PagIniAssignment_6 ) ) ;
    public final void rule__Wizard__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:535:1: ( ( ( rule__Wizard__PagIniAssignment_6 ) ) )
            // InternalWizard.g:536:1: ( ( rule__Wizard__PagIniAssignment_6 ) )
            {
            // InternalWizard.g:536:1: ( ( rule__Wizard__PagIniAssignment_6 ) )
            // InternalWizard.g:537:2: ( rule__Wizard__PagIniAssignment_6 )
            {
             before(grammarAccess.getWizardAccess().getPagIniAssignment_6()); 
            // InternalWizard.g:538:2: ( rule__Wizard__PagIniAssignment_6 )
            // InternalWizard.g:538:3: rule__Wizard__PagIniAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Wizard__PagIniAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getPagIniAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__6__Impl"


    // $ANTLR start "rule__Wizard__Group__7"
    // InternalWizard.g:546:1: rule__Wizard__Group__7 : rule__Wizard__Group__7__Impl ;
    public final void rule__Wizard__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:550:1: ( rule__Wizard__Group__7__Impl )
            // InternalWizard.g:551:2: rule__Wizard__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wizard__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__7"


    // $ANTLR start "rule__Wizard__Group__7__Impl"
    // InternalWizard.g:557:1: rule__Wizard__Group__7__Impl : ( '}' ) ;
    public final void rule__Wizard__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:561:1: ( ( '}' ) )
            // InternalWizard.g:562:1: ( '}' )
            {
            // InternalWizard.g:562:1: ( '}' )
            // InternalWizard.g:563:2: '}'
            {
             before(grammarAccess.getWizardAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWizardAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__7__Impl"


    // $ANTLR start "rule__Boton__Group_0__0"
    // InternalWizard.g:573:1: rule__Boton__Group_0__0 : rule__Boton__Group_0__0__Impl rule__Boton__Group_0__1 ;
    public final void rule__Boton__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:577:1: ( rule__Boton__Group_0__0__Impl rule__Boton__Group_0__1 )
            // InternalWizard.g:578:2: rule__Boton__Group_0__0__Impl rule__Boton__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Boton__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boton__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_0__0"


    // $ANTLR start "rule__Boton__Group_0__0__Impl"
    // InternalWizard.g:585:1: rule__Boton__Group_0__0__Impl : ( 'Boton' ) ;
    public final void rule__Boton__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:589:1: ( ( 'Boton' ) )
            // InternalWizard.g:590:1: ( 'Boton' )
            {
            // InternalWizard.g:590:1: ( 'Boton' )
            // InternalWizard.g:591:2: 'Boton'
            {
             before(grammarAccess.getBotonAccess().getBotonKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBotonAccess().getBotonKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_0__0__Impl"


    // $ANTLR start "rule__Boton__Group_0__1"
    // InternalWizard.g:600:1: rule__Boton__Group_0__1 : rule__Boton__Group_0__1__Impl rule__Boton__Group_0__2 ;
    public final void rule__Boton__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:604:1: ( rule__Boton__Group_0__1__Impl rule__Boton__Group_0__2 )
            // InternalWizard.g:605:2: rule__Boton__Group_0__1__Impl rule__Boton__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Boton__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boton__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_0__1"


    // $ANTLR start "rule__Boton__Group_0__1__Impl"
    // InternalWizard.g:612:1: rule__Boton__Group_0__1__Impl : ( 'navegar' ) ;
    public final void rule__Boton__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:616:1: ( ( 'navegar' ) )
            // InternalWizard.g:617:1: ( 'navegar' )
            {
            // InternalWizard.g:617:1: ( 'navegar' )
            // InternalWizard.g:618:2: 'navegar'
            {
             before(grammarAccess.getBotonAccess().getNavegarKeyword_0_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBotonAccess().getNavegarKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_0__1__Impl"


    // $ANTLR start "rule__Boton__Group_0__2"
    // InternalWizard.g:627:1: rule__Boton__Group_0__2 : rule__Boton__Group_0__2__Impl ;
    public final void rule__Boton__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:631:1: ( rule__Boton__Group_0__2__Impl )
            // InternalWizard.g:632:2: rule__Boton__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boton__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_0__2"


    // $ANTLR start "rule__Boton__Group_0__2__Impl"
    // InternalWizard.g:638:1: rule__Boton__Group_0__2__Impl : ( ruleBotonNavegar ) ;
    public final void rule__Boton__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:642:1: ( ( ruleBotonNavegar ) )
            // InternalWizard.g:643:1: ( ruleBotonNavegar )
            {
            // InternalWizard.g:643:1: ( ruleBotonNavegar )
            // InternalWizard.g:644:2: ruleBotonNavegar
            {
             before(grammarAccess.getBotonAccess().getBotonNavegarParserRuleCall_0_2()); 
            pushFollow(FOLLOW_2);
            ruleBotonNavegar();

            state._fsp--;

             after(grammarAccess.getBotonAccess().getBotonNavegarParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_0__2__Impl"


    // $ANTLR start "rule__Boton__Group_1__0"
    // InternalWizard.g:654:1: rule__Boton__Group_1__0 : rule__Boton__Group_1__0__Impl rule__Boton__Group_1__1 ;
    public final void rule__Boton__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:658:1: ( rule__Boton__Group_1__0__Impl rule__Boton__Group_1__1 )
            // InternalWizard.g:659:2: rule__Boton__Group_1__0__Impl rule__Boton__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Boton__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boton__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_1__0"


    // $ANTLR start "rule__Boton__Group_1__0__Impl"
    // InternalWizard.g:666:1: rule__Boton__Group_1__0__Impl : ( 'Boton' ) ;
    public final void rule__Boton__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:670:1: ( ( 'Boton' ) )
            // InternalWizard.g:671:1: ( 'Boton' )
            {
            // InternalWizard.g:671:1: ( 'Boton' )
            // InternalWizard.g:672:2: 'Boton'
            {
             before(grammarAccess.getBotonAccess().getBotonKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBotonAccess().getBotonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_1__0__Impl"


    // $ANTLR start "rule__Boton__Group_1__1"
    // InternalWizard.g:681:1: rule__Boton__Group_1__1 : rule__Boton__Group_1__1__Impl rule__Boton__Group_1__2 ;
    public final void rule__Boton__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:685:1: ( rule__Boton__Group_1__1__Impl rule__Boton__Group_1__2 )
            // InternalWizard.g:686:2: rule__Boton__Group_1__1__Impl rule__Boton__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Boton__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boton__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_1__1"


    // $ANTLR start "rule__Boton__Group_1__1__Impl"
    // InternalWizard.g:693:1: rule__Boton__Group_1__1__Impl : ( 'mensaje' ) ;
    public final void rule__Boton__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:697:1: ( ( 'mensaje' ) )
            // InternalWizard.g:698:1: ( 'mensaje' )
            {
            // InternalWizard.g:698:1: ( 'mensaje' )
            // InternalWizard.g:699:2: 'mensaje'
            {
             before(grammarAccess.getBotonAccess().getMensajeKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBotonAccess().getMensajeKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_1__1__Impl"


    // $ANTLR start "rule__Boton__Group_1__2"
    // InternalWizard.g:708:1: rule__Boton__Group_1__2 : rule__Boton__Group_1__2__Impl ;
    public final void rule__Boton__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:712:1: ( rule__Boton__Group_1__2__Impl )
            // InternalWizard.g:713:2: rule__Boton__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boton__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_1__2"


    // $ANTLR start "rule__Boton__Group_1__2__Impl"
    // InternalWizard.g:719:1: rule__Boton__Group_1__2__Impl : ( ruleBotonMensaje ) ;
    public final void rule__Boton__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:723:1: ( ( ruleBotonMensaje ) )
            // InternalWizard.g:724:1: ( ruleBotonMensaje )
            {
            // InternalWizard.g:724:1: ( ruleBotonMensaje )
            // InternalWizard.g:725:2: ruleBotonMensaje
            {
             before(grammarAccess.getBotonAccess().getBotonMensajeParserRuleCall_1_2()); 
            pushFollow(FOLLOW_2);
            ruleBotonMensaje();

            state._fsp--;

             after(grammarAccess.getBotonAccess().getBotonMensajeParserRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_1__2__Impl"


    // $ANTLR start "rule__Boton__Group_2__0"
    // InternalWizard.g:735:1: rule__Boton__Group_2__0 : rule__Boton__Group_2__0__Impl rule__Boton__Group_2__1 ;
    public final void rule__Boton__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:739:1: ( rule__Boton__Group_2__0__Impl rule__Boton__Group_2__1 )
            // InternalWizard.g:740:2: rule__Boton__Group_2__0__Impl rule__Boton__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Boton__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boton__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_2__0"


    // $ANTLR start "rule__Boton__Group_2__0__Impl"
    // InternalWizard.g:747:1: rule__Boton__Group_2__0__Impl : ( 'Boton' ) ;
    public final void rule__Boton__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:751:1: ( ( 'Boton' ) )
            // InternalWizard.g:752:1: ( 'Boton' )
            {
            // InternalWizard.g:752:1: ( 'Boton' )
            // InternalWizard.g:753:2: 'Boton'
            {
             before(grammarAccess.getBotonAccess().getBotonKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBotonAccess().getBotonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_2__0__Impl"


    // $ANTLR start "rule__Boton__Group_2__1"
    // InternalWizard.g:762:1: rule__Boton__Group_2__1 : rule__Boton__Group_2__1__Impl rule__Boton__Group_2__2 ;
    public final void rule__Boton__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:766:1: ( rule__Boton__Group_2__1__Impl rule__Boton__Group_2__2 )
            // InternalWizard.g:767:2: rule__Boton__Group_2__1__Impl rule__Boton__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Boton__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boton__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_2__1"


    // $ANTLR start "rule__Boton__Group_2__1__Impl"
    // InternalWizard.g:774:1: rule__Boton__Group_2__1__Impl : ( 'cerrar' ) ;
    public final void rule__Boton__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:778:1: ( ( 'cerrar' ) )
            // InternalWizard.g:779:1: ( 'cerrar' )
            {
            // InternalWizard.g:779:1: ( 'cerrar' )
            // InternalWizard.g:780:2: 'cerrar'
            {
             before(grammarAccess.getBotonAccess().getCerrarKeyword_2_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBotonAccess().getCerrarKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_2__1__Impl"


    // $ANTLR start "rule__Boton__Group_2__2"
    // InternalWizard.g:789:1: rule__Boton__Group_2__2 : rule__Boton__Group_2__2__Impl ;
    public final void rule__Boton__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:793:1: ( rule__Boton__Group_2__2__Impl )
            // InternalWizard.g:794:2: rule__Boton__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boton__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_2__2"


    // $ANTLR start "rule__Boton__Group_2__2__Impl"
    // InternalWizard.g:800:1: rule__Boton__Group_2__2__Impl : ( ruleBotonCerrar ) ;
    public final void rule__Boton__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:804:1: ( ( ruleBotonCerrar ) )
            // InternalWizard.g:805:1: ( ruleBotonCerrar )
            {
            // InternalWizard.g:805:1: ( ruleBotonCerrar )
            // InternalWizard.g:806:2: ruleBotonCerrar
            {
             before(grammarAccess.getBotonAccess().getBotonCerrarParserRuleCall_2_2()); 
            pushFollow(FOLLOW_2);
            ruleBotonCerrar();

            state._fsp--;

             after(grammarAccess.getBotonAccess().getBotonCerrarParserRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Group_2__2__Impl"


    // $ANTLR start "rule__Pagina__Group__0"
    // InternalWizard.g:816:1: rule__Pagina__Group__0 : rule__Pagina__Group__0__Impl rule__Pagina__Group__1 ;
    public final void rule__Pagina__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:820:1: ( rule__Pagina__Group__0__Impl rule__Pagina__Group__1 )
            // InternalWizard.g:821:2: rule__Pagina__Group__0__Impl rule__Pagina__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Pagina__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__0"


    // $ANTLR start "rule__Pagina__Group__0__Impl"
    // InternalWizard.g:828:1: rule__Pagina__Group__0__Impl : ( 'Pagina' ) ;
    public final void rule__Pagina__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:832:1: ( ( 'Pagina' ) )
            // InternalWizard.g:833:1: ( 'Pagina' )
            {
            // InternalWizard.g:833:1: ( 'Pagina' )
            // InternalWizard.g:834:2: 'Pagina'
            {
             before(grammarAccess.getPaginaAccess().getPaginaKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getPaginaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__0__Impl"


    // $ANTLR start "rule__Pagina__Group__1"
    // InternalWizard.g:843:1: rule__Pagina__Group__1 : rule__Pagina__Group__1__Impl rule__Pagina__Group__2 ;
    public final void rule__Pagina__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:847:1: ( rule__Pagina__Group__1__Impl rule__Pagina__Group__2 )
            // InternalWizard.g:848:2: rule__Pagina__Group__1__Impl rule__Pagina__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Pagina__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__1"


    // $ANTLR start "rule__Pagina__Group__1__Impl"
    // InternalWizard.g:855:1: rule__Pagina__Group__1__Impl : ( ( rule__Pagina__NameAssignment_1 ) ) ;
    public final void rule__Pagina__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:859:1: ( ( ( rule__Pagina__NameAssignment_1 ) ) )
            // InternalWizard.g:860:1: ( ( rule__Pagina__NameAssignment_1 ) )
            {
            // InternalWizard.g:860:1: ( ( rule__Pagina__NameAssignment_1 ) )
            // InternalWizard.g:861:2: ( rule__Pagina__NameAssignment_1 )
            {
             before(grammarAccess.getPaginaAccess().getNameAssignment_1()); 
            // InternalWizard.g:862:2: ( rule__Pagina__NameAssignment_1 )
            // InternalWizard.g:862:3: rule__Pagina__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__1__Impl"


    // $ANTLR start "rule__Pagina__Group__2"
    // InternalWizard.g:870:1: rule__Pagina__Group__2 : rule__Pagina__Group__2__Impl rule__Pagina__Group__3 ;
    public final void rule__Pagina__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:874:1: ( rule__Pagina__Group__2__Impl rule__Pagina__Group__3 )
            // InternalWizard.g:875:2: rule__Pagina__Group__2__Impl rule__Pagina__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Pagina__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__2"


    // $ANTLR start "rule__Pagina__Group__2__Impl"
    // InternalWizard.g:882:1: rule__Pagina__Group__2__Impl : ( ':' ) ;
    public final void rule__Pagina__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:886:1: ( ( ':' ) )
            // InternalWizard.g:887:1: ( ':' )
            {
            // InternalWizard.g:887:1: ( ':' )
            // InternalWizard.g:888:2: ':'
            {
             before(grammarAccess.getPaginaAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__2__Impl"


    // $ANTLR start "rule__Pagina__Group__3"
    // InternalWizard.g:897:1: rule__Pagina__Group__3 : rule__Pagina__Group__3__Impl rule__Pagina__Group__4 ;
    public final void rule__Pagina__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:901:1: ( rule__Pagina__Group__3__Impl rule__Pagina__Group__4 )
            // InternalWizard.g:902:2: rule__Pagina__Group__3__Impl rule__Pagina__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Pagina__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__3"


    // $ANTLR start "rule__Pagina__Group__3__Impl"
    // InternalWizard.g:909:1: rule__Pagina__Group__3__Impl : ( ( rule__Pagina__Group_3__0 )? ) ;
    public final void rule__Pagina__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:913:1: ( ( ( rule__Pagina__Group_3__0 )? ) )
            // InternalWizard.g:914:1: ( ( rule__Pagina__Group_3__0 )? )
            {
            // InternalWizard.g:914:1: ( ( rule__Pagina__Group_3__0 )? )
            // InternalWizard.g:915:2: ( rule__Pagina__Group_3__0 )?
            {
             before(grammarAccess.getPaginaAccess().getGroup_3()); 
            // InternalWizard.g:916:2: ( rule__Pagina__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalWizard.g:916:3: rule__Pagina__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pagina__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPaginaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__3__Impl"


    // $ANTLR start "rule__Pagina__Group__4"
    // InternalWizard.g:924:1: rule__Pagina__Group__4 : rule__Pagina__Group__4__Impl rule__Pagina__Group__5 ;
    public final void rule__Pagina__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:928:1: ( rule__Pagina__Group__4__Impl rule__Pagina__Group__5 )
            // InternalWizard.g:929:2: rule__Pagina__Group__4__Impl rule__Pagina__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Pagina__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__4"


    // $ANTLR start "rule__Pagina__Group__4__Impl"
    // InternalWizard.g:936:1: rule__Pagina__Group__4__Impl : ( ( rule__Pagina__Group_4__0 )? ) ;
    public final void rule__Pagina__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:940:1: ( ( ( rule__Pagina__Group_4__0 )? ) )
            // InternalWizard.g:941:1: ( ( rule__Pagina__Group_4__0 )? )
            {
            // InternalWizard.g:941:1: ( ( rule__Pagina__Group_4__0 )? )
            // InternalWizard.g:942:2: ( rule__Pagina__Group_4__0 )?
            {
             before(grammarAccess.getPaginaAccess().getGroup_4()); 
            // InternalWizard.g:943:2: ( rule__Pagina__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWizard.g:943:3: rule__Pagina__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pagina__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPaginaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__4__Impl"


    // $ANTLR start "rule__Pagina__Group__5"
    // InternalWizard.g:951:1: rule__Pagina__Group__5 : rule__Pagina__Group__5__Impl rule__Pagina__Group__6 ;
    public final void rule__Pagina__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:955:1: ( rule__Pagina__Group__5__Impl rule__Pagina__Group__6 )
            // InternalWizard.g:956:2: rule__Pagina__Group__5__Impl rule__Pagina__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Pagina__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__5"


    // $ANTLR start "rule__Pagina__Group__5__Impl"
    // InternalWizard.g:963:1: rule__Pagina__Group__5__Impl : ( 'botones' ) ;
    public final void rule__Pagina__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:967:1: ( ( 'botones' ) )
            // InternalWizard.g:968:1: ( 'botones' )
            {
            // InternalWizard.g:968:1: ( 'botones' )
            // InternalWizard.g:969:2: 'botones'
            {
             before(grammarAccess.getPaginaAccess().getBotonesKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getBotonesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__5__Impl"


    // $ANTLR start "rule__Pagina__Group__6"
    // InternalWizard.g:978:1: rule__Pagina__Group__6 : rule__Pagina__Group__6__Impl rule__Pagina__Group__7 ;
    public final void rule__Pagina__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:982:1: ( rule__Pagina__Group__6__Impl rule__Pagina__Group__7 )
            // InternalWizard.g:983:2: rule__Pagina__Group__6__Impl rule__Pagina__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Pagina__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__6"


    // $ANTLR start "rule__Pagina__Group__6__Impl"
    // InternalWizard.g:990:1: rule__Pagina__Group__6__Impl : ( '{' ) ;
    public final void rule__Pagina__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:994:1: ( ( '{' ) )
            // InternalWizard.g:995:1: ( '{' )
            {
            // InternalWizard.g:995:1: ( '{' )
            // InternalWizard.g:996:2: '{'
            {
             before(grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__6__Impl"


    // $ANTLR start "rule__Pagina__Group__7"
    // InternalWizard.g:1005:1: rule__Pagina__Group__7 : rule__Pagina__Group__7__Impl rule__Pagina__Group__8 ;
    public final void rule__Pagina__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1009:1: ( rule__Pagina__Group__7__Impl rule__Pagina__Group__8 )
            // InternalWizard.g:1010:2: rule__Pagina__Group__7__Impl rule__Pagina__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Pagina__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__7"


    // $ANTLR start "rule__Pagina__Group__7__Impl"
    // InternalWizard.g:1017:1: rule__Pagina__Group__7__Impl : ( ( rule__Pagina__BotonesAssignment_7 ) ) ;
    public final void rule__Pagina__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1021:1: ( ( ( rule__Pagina__BotonesAssignment_7 ) ) )
            // InternalWizard.g:1022:1: ( ( rule__Pagina__BotonesAssignment_7 ) )
            {
            // InternalWizard.g:1022:1: ( ( rule__Pagina__BotonesAssignment_7 ) )
            // InternalWizard.g:1023:2: ( rule__Pagina__BotonesAssignment_7 )
            {
             before(grammarAccess.getPaginaAccess().getBotonesAssignment_7()); 
            // InternalWizard.g:1024:2: ( rule__Pagina__BotonesAssignment_7 )
            // InternalWizard.g:1024:3: rule__Pagina__BotonesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__BotonesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getBotonesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__7__Impl"


    // $ANTLR start "rule__Pagina__Group__8"
    // InternalWizard.g:1032:1: rule__Pagina__Group__8 : rule__Pagina__Group__8__Impl rule__Pagina__Group__9 ;
    public final void rule__Pagina__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1036:1: ( rule__Pagina__Group__8__Impl rule__Pagina__Group__9 )
            // InternalWizard.g:1037:2: rule__Pagina__Group__8__Impl rule__Pagina__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Pagina__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__8"


    // $ANTLR start "rule__Pagina__Group__8__Impl"
    // InternalWizard.g:1044:1: rule__Pagina__Group__8__Impl : ( ( rule__Pagina__Group_8__0 )* ) ;
    public final void rule__Pagina__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1048:1: ( ( ( rule__Pagina__Group_8__0 )* ) )
            // InternalWizard.g:1049:1: ( ( rule__Pagina__Group_8__0 )* )
            {
            // InternalWizard.g:1049:1: ( ( rule__Pagina__Group_8__0 )* )
            // InternalWizard.g:1050:2: ( rule__Pagina__Group_8__0 )*
            {
             before(grammarAccess.getPaginaAccess().getGroup_8()); 
            // InternalWizard.g:1051:2: ( rule__Pagina__Group_8__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWizard.g:1051:3: rule__Pagina__Group_8__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Pagina__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPaginaAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__8__Impl"


    // $ANTLR start "rule__Pagina__Group__9"
    // InternalWizard.g:1059:1: rule__Pagina__Group__9 : rule__Pagina__Group__9__Impl ;
    public final void rule__Pagina__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1063:1: ( rule__Pagina__Group__9__Impl )
            // InternalWizard.g:1064:2: rule__Pagina__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__9"


    // $ANTLR start "rule__Pagina__Group__9__Impl"
    // InternalWizard.g:1070:1: rule__Pagina__Group__9__Impl : ( '}' ) ;
    public final void rule__Pagina__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1074:1: ( ( '}' ) )
            // InternalWizard.g:1075:1: ( '}' )
            {
            // InternalWizard.g:1075:1: ( '}' )
            // InternalWizard.g:1076:2: '}'
            {
             before(grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__9__Impl"


    // $ANTLR start "rule__Pagina__Group_3__0"
    // InternalWizard.g:1086:1: rule__Pagina__Group_3__0 : rule__Pagina__Group_3__0__Impl rule__Pagina__Group_3__1 ;
    public final void rule__Pagina__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1090:1: ( rule__Pagina__Group_3__0__Impl rule__Pagina__Group_3__1 )
            // InternalWizard.g:1091:2: rule__Pagina__Group_3__0__Impl rule__Pagina__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Pagina__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__0"


    // $ANTLR start "rule__Pagina__Group_3__0__Impl"
    // InternalWizard.g:1098:1: rule__Pagina__Group_3__0__Impl : ( 'campos' ) ;
    public final void rule__Pagina__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1102:1: ( ( 'campos' ) )
            // InternalWizard.g:1103:1: ( 'campos' )
            {
            // InternalWizard.g:1103:1: ( 'campos' )
            // InternalWizard.g:1104:2: 'campos'
            {
             before(grammarAccess.getPaginaAccess().getCamposKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getCamposKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__0__Impl"


    // $ANTLR start "rule__Pagina__Group_3__1"
    // InternalWizard.g:1113:1: rule__Pagina__Group_3__1 : rule__Pagina__Group_3__1__Impl rule__Pagina__Group_3__2 ;
    public final void rule__Pagina__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1117:1: ( rule__Pagina__Group_3__1__Impl rule__Pagina__Group_3__2 )
            // InternalWizard.g:1118:2: rule__Pagina__Group_3__1__Impl rule__Pagina__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__Pagina__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__1"


    // $ANTLR start "rule__Pagina__Group_3__1__Impl"
    // InternalWizard.g:1125:1: rule__Pagina__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Pagina__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1129:1: ( ( '{' ) )
            // InternalWizard.g:1130:1: ( '{' )
            {
            // InternalWizard.g:1130:1: ( '{' )
            // InternalWizard.g:1131:2: '{'
            {
             before(grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__1__Impl"


    // $ANTLR start "rule__Pagina__Group_3__2"
    // InternalWizard.g:1140:1: rule__Pagina__Group_3__2 : rule__Pagina__Group_3__2__Impl rule__Pagina__Group_3__3 ;
    public final void rule__Pagina__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1144:1: ( rule__Pagina__Group_3__2__Impl rule__Pagina__Group_3__3 )
            // InternalWizard.g:1145:2: rule__Pagina__Group_3__2__Impl rule__Pagina__Group_3__3
            {
            pushFollow(FOLLOW_16);
            rule__Pagina__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__2"


    // $ANTLR start "rule__Pagina__Group_3__2__Impl"
    // InternalWizard.g:1152:1: rule__Pagina__Group_3__2__Impl : ( ( rule__Pagina__CamposTextoAssignment_3_2 ) ) ;
    public final void rule__Pagina__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1156:1: ( ( ( rule__Pagina__CamposTextoAssignment_3_2 ) ) )
            // InternalWizard.g:1157:1: ( ( rule__Pagina__CamposTextoAssignment_3_2 ) )
            {
            // InternalWizard.g:1157:1: ( ( rule__Pagina__CamposTextoAssignment_3_2 ) )
            // InternalWizard.g:1158:2: ( rule__Pagina__CamposTextoAssignment_3_2 )
            {
             before(grammarAccess.getPaginaAccess().getCamposTextoAssignment_3_2()); 
            // InternalWizard.g:1159:2: ( rule__Pagina__CamposTextoAssignment_3_2 )
            // InternalWizard.g:1159:3: rule__Pagina__CamposTextoAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__CamposTextoAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getCamposTextoAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__2__Impl"


    // $ANTLR start "rule__Pagina__Group_3__3"
    // InternalWizard.g:1167:1: rule__Pagina__Group_3__3 : rule__Pagina__Group_3__3__Impl rule__Pagina__Group_3__4 ;
    public final void rule__Pagina__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1171:1: ( rule__Pagina__Group_3__3__Impl rule__Pagina__Group_3__4 )
            // InternalWizard.g:1172:2: rule__Pagina__Group_3__3__Impl rule__Pagina__Group_3__4
            {
            pushFollow(FOLLOW_16);
            rule__Pagina__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__3"


    // $ANTLR start "rule__Pagina__Group_3__3__Impl"
    // InternalWizard.g:1179:1: rule__Pagina__Group_3__3__Impl : ( ( rule__Pagina__Group_3_3__0 )* ) ;
    public final void rule__Pagina__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1183:1: ( ( ( rule__Pagina__Group_3_3__0 )* ) )
            // InternalWizard.g:1184:1: ( ( rule__Pagina__Group_3_3__0 )* )
            {
            // InternalWizard.g:1184:1: ( ( rule__Pagina__Group_3_3__0 )* )
            // InternalWizard.g:1185:2: ( rule__Pagina__Group_3_3__0 )*
            {
             before(grammarAccess.getPaginaAccess().getGroup_3_3()); 
            // InternalWizard.g:1186:2: ( rule__Pagina__Group_3_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWizard.g:1186:3: rule__Pagina__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Pagina__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPaginaAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__3__Impl"


    // $ANTLR start "rule__Pagina__Group_3__4"
    // InternalWizard.g:1194:1: rule__Pagina__Group_3__4 : rule__Pagina__Group_3__4__Impl ;
    public final void rule__Pagina__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1198:1: ( rule__Pagina__Group_3__4__Impl )
            // InternalWizard.g:1199:2: rule__Pagina__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__4"


    // $ANTLR start "rule__Pagina__Group_3__4__Impl"
    // InternalWizard.g:1205:1: rule__Pagina__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Pagina__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1209:1: ( ( '}' ) )
            // InternalWizard.g:1210:1: ( '}' )
            {
            // InternalWizard.g:1210:1: ( '}' )
            // InternalWizard.g:1211:2: '}'
            {
             before(grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__4__Impl"


    // $ANTLR start "rule__Pagina__Group_3_3__0"
    // InternalWizard.g:1221:1: rule__Pagina__Group_3_3__0 : rule__Pagina__Group_3_3__0__Impl rule__Pagina__Group_3_3__1 ;
    public final void rule__Pagina__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1225:1: ( rule__Pagina__Group_3_3__0__Impl rule__Pagina__Group_3_3__1 )
            // InternalWizard.g:1226:2: rule__Pagina__Group_3_3__0__Impl rule__Pagina__Group_3_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Pagina__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3_3__0"


    // $ANTLR start "rule__Pagina__Group_3_3__0__Impl"
    // InternalWizard.g:1233:1: rule__Pagina__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Pagina__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1237:1: ( ( ',' ) )
            // InternalWizard.g:1238:1: ( ',' )
            {
            // InternalWizard.g:1238:1: ( ',' )
            // InternalWizard.g:1239:2: ','
            {
             before(grammarAccess.getPaginaAccess().getCommaKeyword_3_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3_3__0__Impl"


    // $ANTLR start "rule__Pagina__Group_3_3__1"
    // InternalWizard.g:1248:1: rule__Pagina__Group_3_3__1 : rule__Pagina__Group_3_3__1__Impl ;
    public final void rule__Pagina__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1252:1: ( rule__Pagina__Group_3_3__1__Impl )
            // InternalWizard.g:1253:2: rule__Pagina__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3_3__1"


    // $ANTLR start "rule__Pagina__Group_3_3__1__Impl"
    // InternalWizard.g:1259:1: rule__Pagina__Group_3_3__1__Impl : ( ( rule__Pagina__CamposTextoAssignment_3_3_1 ) ) ;
    public final void rule__Pagina__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1263:1: ( ( ( rule__Pagina__CamposTextoAssignment_3_3_1 ) ) )
            // InternalWizard.g:1264:1: ( ( rule__Pagina__CamposTextoAssignment_3_3_1 ) )
            {
            // InternalWizard.g:1264:1: ( ( rule__Pagina__CamposTextoAssignment_3_3_1 ) )
            // InternalWizard.g:1265:2: ( rule__Pagina__CamposTextoAssignment_3_3_1 )
            {
             before(grammarAccess.getPaginaAccess().getCamposTextoAssignment_3_3_1()); 
            // InternalWizard.g:1266:2: ( rule__Pagina__CamposTextoAssignment_3_3_1 )
            // InternalWizard.g:1266:3: rule__Pagina__CamposTextoAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__CamposTextoAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getCamposTextoAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3_3__1__Impl"


    // $ANTLR start "rule__Pagina__Group_4__0"
    // InternalWizard.g:1275:1: rule__Pagina__Group_4__0 : rule__Pagina__Group_4__0__Impl rule__Pagina__Group_4__1 ;
    public final void rule__Pagina__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1279:1: ( rule__Pagina__Group_4__0__Impl rule__Pagina__Group_4__1 )
            // InternalWizard.g:1280:2: rule__Pagina__Group_4__0__Impl rule__Pagina__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Pagina__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_4__0"


    // $ANTLR start "rule__Pagina__Group_4__0__Impl"
    // InternalWizard.g:1287:1: rule__Pagina__Group_4__0__Impl : ( 'casillas' ) ;
    public final void rule__Pagina__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1291:1: ( ( 'casillas' ) )
            // InternalWizard.g:1292:1: ( 'casillas' )
            {
            // InternalWizard.g:1292:1: ( 'casillas' )
            // InternalWizard.g:1293:2: 'casillas'
            {
             before(grammarAccess.getPaginaAccess().getCasillasKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getCasillasKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_4__0__Impl"


    // $ANTLR start "rule__Pagina__Group_4__1"
    // InternalWizard.g:1302:1: rule__Pagina__Group_4__1 : rule__Pagina__Group_4__1__Impl rule__Pagina__Group_4__2 ;
    public final void rule__Pagina__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1306:1: ( rule__Pagina__Group_4__1__Impl rule__Pagina__Group_4__2 )
            // InternalWizard.g:1307:2: rule__Pagina__Group_4__1__Impl rule__Pagina__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__Pagina__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_4__1"


    // $ANTLR start "rule__Pagina__Group_4__1__Impl"
    // InternalWizard.g:1314:1: rule__Pagina__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Pagina__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1318:1: ( ( '{' ) )
            // InternalWizard.g:1319:1: ( '{' )
            {
            // InternalWizard.g:1319:1: ( '{' )
            // InternalWizard.g:1320:2: '{'
            {
             before(grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_4__1__Impl"


    // $ANTLR start "rule__Pagina__Group_4__2"
    // InternalWizard.g:1329:1: rule__Pagina__Group_4__2 : rule__Pagina__Group_4__2__Impl rule__Pagina__Group_4__3 ;
    public final void rule__Pagina__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1333:1: ( rule__Pagina__Group_4__2__Impl rule__Pagina__Group_4__3 )
            // InternalWizard.g:1334:2: rule__Pagina__Group_4__2__Impl rule__Pagina__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__Pagina__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_4__2"


    // $ANTLR start "rule__Pagina__Group_4__2__Impl"
    // InternalWizard.g:1341:1: rule__Pagina__Group_4__2__Impl : ( ( rule__Pagina__CasillasVerifAssignment_4_2 ) ) ;
    public final void rule__Pagina__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1345:1: ( ( ( rule__Pagina__CasillasVerifAssignment_4_2 ) ) )
            // InternalWizard.g:1346:1: ( ( rule__Pagina__CasillasVerifAssignment_4_2 ) )
            {
            // InternalWizard.g:1346:1: ( ( rule__Pagina__CasillasVerifAssignment_4_2 ) )
            // InternalWizard.g:1347:2: ( rule__Pagina__CasillasVerifAssignment_4_2 )
            {
             before(grammarAccess.getPaginaAccess().getCasillasVerifAssignment_4_2()); 
            // InternalWizard.g:1348:2: ( rule__Pagina__CasillasVerifAssignment_4_2 )
            // InternalWizard.g:1348:3: rule__Pagina__CasillasVerifAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__CasillasVerifAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getCasillasVerifAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_4__2__Impl"


    // $ANTLR start "rule__Pagina__Group_4__3"
    // InternalWizard.g:1356:1: rule__Pagina__Group_4__3 : rule__Pagina__Group_4__3__Impl rule__Pagina__Group_4__4 ;
    public final void rule__Pagina__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1360:1: ( rule__Pagina__Group_4__3__Impl rule__Pagina__Group_4__4 )
            // InternalWizard.g:1361:2: rule__Pagina__Group_4__3__Impl rule__Pagina__Group_4__4
            {
            pushFollow(FOLLOW_16);
            rule__Pagina__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_4__3"


    // $ANTLR start "rule__Pagina__Group_4__3__Impl"
    // InternalWizard.g:1368:1: rule__Pagina__Group_4__3__Impl : ( ( rule__Pagina__Group_4_3__0 )* ) ;
    public final void rule__Pagina__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1372:1: ( ( ( rule__Pagina__Group_4_3__0 )* ) )
            // InternalWizard.g:1373:1: ( ( rule__Pagina__Group_4_3__0 )* )
            {
            // InternalWizard.g:1373:1: ( ( rule__Pagina__Group_4_3__0 )* )
            // InternalWizard.g:1374:2: ( rule__Pagina__Group_4_3__0 )*
            {
             before(grammarAccess.getPaginaAccess().getGroup_4_3()); 
            // InternalWizard.g:1375:2: ( rule__Pagina__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWizard.g:1375:3: rule__Pagina__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Pagina__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPaginaAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_4__3__Impl"


    // $ANTLR start "rule__Pagina__Group_4__4"
    // InternalWizard.g:1383:1: rule__Pagina__Group_4__4 : rule__Pagina__Group_4__4__Impl ;
    public final void rule__Pagina__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1387:1: ( rule__Pagina__Group_4__4__Impl )
            // InternalWizard.g:1388:2: rule__Pagina__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_4__4"


    // $ANTLR start "rule__Pagina__Group_4__4__Impl"
    // InternalWizard.g:1394:1: rule__Pagina__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Pagina__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1398:1: ( ( '}' ) )
            // InternalWizard.g:1399:1: ( '}' )
            {
            // InternalWizard.g:1399:1: ( '}' )
            // InternalWizard.g:1400:2: '}'
            {
             before(grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_4__4__Impl"


    // $ANTLR start "rule__Pagina__Group_4_3__0"
    // InternalWizard.g:1410:1: rule__Pagina__Group_4_3__0 : rule__Pagina__Group_4_3__0__Impl rule__Pagina__Group_4_3__1 ;
    public final void rule__Pagina__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1414:1: ( rule__Pagina__Group_4_3__0__Impl rule__Pagina__Group_4_3__1 )
            // InternalWizard.g:1415:2: rule__Pagina__Group_4_3__0__Impl rule__Pagina__Group_4_3__1
            {
            pushFollow(FOLLOW_19);
            rule__Pagina__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_4_3__0"


    // $ANTLR start "rule__Pagina__Group_4_3__0__Impl"
    // InternalWizard.g:1422:1: rule__Pagina__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Pagina__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1426:1: ( ( ',' ) )
            // InternalWizard.g:1427:1: ( ',' )
            {
            // InternalWizard.g:1427:1: ( ',' )
            // InternalWizard.g:1428:2: ','
            {
             before(grammarAccess.getPaginaAccess().getCommaKeyword_4_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_4_3__0__Impl"


    // $ANTLR start "rule__Pagina__Group_4_3__1"
    // InternalWizard.g:1437:1: rule__Pagina__Group_4_3__1 : rule__Pagina__Group_4_3__1__Impl ;
    public final void rule__Pagina__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1441:1: ( rule__Pagina__Group_4_3__1__Impl )
            // InternalWizard.g:1442:2: rule__Pagina__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_4_3__1"


    // $ANTLR start "rule__Pagina__Group_4_3__1__Impl"
    // InternalWizard.g:1448:1: rule__Pagina__Group_4_3__1__Impl : ( ( rule__Pagina__CasillasVerifAssignment_4_3_1 ) ) ;
    public final void rule__Pagina__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1452:1: ( ( ( rule__Pagina__CasillasVerifAssignment_4_3_1 ) ) )
            // InternalWizard.g:1453:1: ( ( rule__Pagina__CasillasVerifAssignment_4_3_1 ) )
            {
            // InternalWizard.g:1453:1: ( ( rule__Pagina__CasillasVerifAssignment_4_3_1 ) )
            // InternalWizard.g:1454:2: ( rule__Pagina__CasillasVerifAssignment_4_3_1 )
            {
             before(grammarAccess.getPaginaAccess().getCasillasVerifAssignment_4_3_1()); 
            // InternalWizard.g:1455:2: ( rule__Pagina__CasillasVerifAssignment_4_3_1 )
            // InternalWizard.g:1455:3: rule__Pagina__CasillasVerifAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__CasillasVerifAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getCasillasVerifAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_4_3__1__Impl"


    // $ANTLR start "rule__Pagina__Group_8__0"
    // InternalWizard.g:1464:1: rule__Pagina__Group_8__0 : rule__Pagina__Group_8__0__Impl rule__Pagina__Group_8__1 ;
    public final void rule__Pagina__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1468:1: ( rule__Pagina__Group_8__0__Impl rule__Pagina__Group_8__1 )
            // InternalWizard.g:1469:2: rule__Pagina__Group_8__0__Impl rule__Pagina__Group_8__1
            {
            pushFollow(FOLLOW_15);
            rule__Pagina__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_8__0"


    // $ANTLR start "rule__Pagina__Group_8__0__Impl"
    // InternalWizard.g:1476:1: rule__Pagina__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Pagina__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1480:1: ( ( ',' ) )
            // InternalWizard.g:1481:1: ( ',' )
            {
            // InternalWizard.g:1481:1: ( ',' )
            // InternalWizard.g:1482:2: ','
            {
             before(grammarAccess.getPaginaAccess().getCommaKeyword_8_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_8__0__Impl"


    // $ANTLR start "rule__Pagina__Group_8__1"
    // InternalWizard.g:1491:1: rule__Pagina__Group_8__1 : rule__Pagina__Group_8__1__Impl ;
    public final void rule__Pagina__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1495:1: ( rule__Pagina__Group_8__1__Impl )
            // InternalWizard.g:1496:2: rule__Pagina__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_8__1"


    // $ANTLR start "rule__Pagina__Group_8__1__Impl"
    // InternalWizard.g:1502:1: rule__Pagina__Group_8__1__Impl : ( ( rule__Pagina__BotonesAssignment_8_1 ) ) ;
    public final void rule__Pagina__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1506:1: ( ( ( rule__Pagina__BotonesAssignment_8_1 ) ) )
            // InternalWizard.g:1507:1: ( ( rule__Pagina__BotonesAssignment_8_1 ) )
            {
            // InternalWizard.g:1507:1: ( ( rule__Pagina__BotonesAssignment_8_1 ) )
            // InternalWizard.g:1508:2: ( rule__Pagina__BotonesAssignment_8_1 )
            {
             before(grammarAccess.getPaginaAccess().getBotonesAssignment_8_1()); 
            // InternalWizard.g:1509:2: ( rule__Pagina__BotonesAssignment_8_1 )
            // InternalWizard.g:1509:3: rule__Pagina__BotonesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__BotonesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getBotonesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_8__1__Impl"


    // $ANTLR start "rule__CampoTexto__Group__0"
    // InternalWizard.g:1518:1: rule__CampoTexto__Group__0 : rule__CampoTexto__Group__0__Impl rule__CampoTexto__Group__1 ;
    public final void rule__CampoTexto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1522:1: ( rule__CampoTexto__Group__0__Impl rule__CampoTexto__Group__1 )
            // InternalWizard.g:1523:2: rule__CampoTexto__Group__0__Impl rule__CampoTexto__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CampoTexto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CampoTexto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CampoTexto__Group__0"


    // $ANTLR start "rule__CampoTexto__Group__0__Impl"
    // InternalWizard.g:1530:1: rule__CampoTexto__Group__0__Impl : ( 'CampoTexto' ) ;
    public final void rule__CampoTexto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1534:1: ( ( 'CampoTexto' ) )
            // InternalWizard.g:1535:1: ( 'CampoTexto' )
            {
            // InternalWizard.g:1535:1: ( 'CampoTexto' )
            // InternalWizard.g:1536:2: 'CampoTexto'
            {
             before(grammarAccess.getCampoTextoAccess().getCampoTextoKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCampoTextoAccess().getCampoTextoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CampoTexto__Group__0__Impl"


    // $ANTLR start "rule__CampoTexto__Group__1"
    // InternalWizard.g:1545:1: rule__CampoTexto__Group__1 : rule__CampoTexto__Group__1__Impl rule__CampoTexto__Group__2 ;
    public final void rule__CampoTexto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1549:1: ( rule__CampoTexto__Group__1__Impl rule__CampoTexto__Group__2 )
            // InternalWizard.g:1550:2: rule__CampoTexto__Group__1__Impl rule__CampoTexto__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__CampoTexto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CampoTexto__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CampoTexto__Group__1"


    // $ANTLR start "rule__CampoTexto__Group__1__Impl"
    // InternalWizard.g:1557:1: rule__CampoTexto__Group__1__Impl : ( ( rule__CampoTexto__TagAssignment_1 ) ) ;
    public final void rule__CampoTexto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1561:1: ( ( ( rule__CampoTexto__TagAssignment_1 ) ) )
            // InternalWizard.g:1562:1: ( ( rule__CampoTexto__TagAssignment_1 ) )
            {
            // InternalWizard.g:1562:1: ( ( rule__CampoTexto__TagAssignment_1 ) )
            // InternalWizard.g:1563:2: ( rule__CampoTexto__TagAssignment_1 )
            {
             before(grammarAccess.getCampoTextoAccess().getTagAssignment_1()); 
            // InternalWizard.g:1564:2: ( rule__CampoTexto__TagAssignment_1 )
            // InternalWizard.g:1564:3: rule__CampoTexto__TagAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CampoTexto__TagAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCampoTextoAccess().getTagAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CampoTexto__Group__1__Impl"


    // $ANTLR start "rule__CampoTexto__Group__2"
    // InternalWizard.g:1572:1: rule__CampoTexto__Group__2 : rule__CampoTexto__Group__2__Impl ;
    public final void rule__CampoTexto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1576:1: ( rule__CampoTexto__Group__2__Impl )
            // InternalWizard.g:1577:2: rule__CampoTexto__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CampoTexto__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CampoTexto__Group__2"


    // $ANTLR start "rule__CampoTexto__Group__2__Impl"
    // InternalWizard.g:1583:1: rule__CampoTexto__Group__2__Impl : ( ( rule__CampoTexto__OpcionalAssignment_2 )? ) ;
    public final void rule__CampoTexto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1587:1: ( ( ( rule__CampoTexto__OpcionalAssignment_2 )? ) )
            // InternalWizard.g:1588:1: ( ( rule__CampoTexto__OpcionalAssignment_2 )? )
            {
            // InternalWizard.g:1588:1: ( ( rule__CampoTexto__OpcionalAssignment_2 )? )
            // InternalWizard.g:1589:2: ( rule__CampoTexto__OpcionalAssignment_2 )?
            {
             before(grammarAccess.getCampoTextoAccess().getOpcionalAssignment_2()); 
            // InternalWizard.g:1590:2: ( rule__CampoTexto__OpcionalAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalWizard.g:1590:3: rule__CampoTexto__OpcionalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CampoTexto__OpcionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCampoTextoAccess().getOpcionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CampoTexto__Group__2__Impl"


    // $ANTLR start "rule__CasillaVerif__Group__0"
    // InternalWizard.g:1599:1: rule__CasillaVerif__Group__0 : rule__CasillaVerif__Group__0__Impl rule__CasillaVerif__Group__1 ;
    public final void rule__CasillaVerif__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1603:1: ( rule__CasillaVerif__Group__0__Impl rule__CasillaVerif__Group__1 )
            // InternalWizard.g:1604:2: rule__CasillaVerif__Group__0__Impl rule__CasillaVerif__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CasillaVerif__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CasillaVerif__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasillaVerif__Group__0"


    // $ANTLR start "rule__CasillaVerif__Group__0__Impl"
    // InternalWizard.g:1611:1: rule__CasillaVerif__Group__0__Impl : ( 'CasillaVerif' ) ;
    public final void rule__CasillaVerif__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1615:1: ( ( 'CasillaVerif' ) )
            // InternalWizard.g:1616:1: ( 'CasillaVerif' )
            {
            // InternalWizard.g:1616:1: ( 'CasillaVerif' )
            // InternalWizard.g:1617:2: 'CasillaVerif'
            {
             before(grammarAccess.getCasillaVerifAccess().getCasillaVerifKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCasillaVerifAccess().getCasillaVerifKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasillaVerif__Group__0__Impl"


    // $ANTLR start "rule__CasillaVerif__Group__1"
    // InternalWizard.g:1626:1: rule__CasillaVerif__Group__1 : rule__CasillaVerif__Group__1__Impl rule__CasillaVerif__Group__2 ;
    public final void rule__CasillaVerif__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1630:1: ( rule__CasillaVerif__Group__1__Impl rule__CasillaVerif__Group__2 )
            // InternalWizard.g:1631:2: rule__CasillaVerif__Group__1__Impl rule__CasillaVerif__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__CasillaVerif__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CasillaVerif__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasillaVerif__Group__1"


    // $ANTLR start "rule__CasillaVerif__Group__1__Impl"
    // InternalWizard.g:1638:1: rule__CasillaVerif__Group__1__Impl : ( ( rule__CasillaVerif__NameAssignment_1 ) ) ;
    public final void rule__CasillaVerif__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1642:1: ( ( ( rule__CasillaVerif__NameAssignment_1 ) ) )
            // InternalWizard.g:1643:1: ( ( rule__CasillaVerif__NameAssignment_1 ) )
            {
            // InternalWizard.g:1643:1: ( ( rule__CasillaVerif__NameAssignment_1 ) )
            // InternalWizard.g:1644:2: ( rule__CasillaVerif__NameAssignment_1 )
            {
             before(grammarAccess.getCasillaVerifAccess().getNameAssignment_1()); 
            // InternalWizard.g:1645:2: ( rule__CasillaVerif__NameAssignment_1 )
            // InternalWizard.g:1645:3: rule__CasillaVerif__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CasillaVerif__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCasillaVerifAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasillaVerif__Group__1__Impl"


    // $ANTLR start "rule__CasillaVerif__Group__2"
    // InternalWizard.g:1653:1: rule__CasillaVerif__Group__2 : rule__CasillaVerif__Group__2__Impl rule__CasillaVerif__Group__3 ;
    public final void rule__CasillaVerif__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1657:1: ( rule__CasillaVerif__Group__2__Impl rule__CasillaVerif__Group__3 )
            // InternalWizard.g:1658:2: rule__CasillaVerif__Group__2__Impl rule__CasillaVerif__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__CasillaVerif__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CasillaVerif__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasillaVerif__Group__2"


    // $ANTLR start "rule__CasillaVerif__Group__2__Impl"
    // InternalWizard.g:1665:1: rule__CasillaVerif__Group__2__Impl : ( ( rule__CasillaVerif__TagAssignment_2 ) ) ;
    public final void rule__CasillaVerif__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1669:1: ( ( ( rule__CasillaVerif__TagAssignment_2 ) ) )
            // InternalWizard.g:1670:1: ( ( rule__CasillaVerif__TagAssignment_2 ) )
            {
            // InternalWizard.g:1670:1: ( ( rule__CasillaVerif__TagAssignment_2 ) )
            // InternalWizard.g:1671:2: ( rule__CasillaVerif__TagAssignment_2 )
            {
             before(grammarAccess.getCasillaVerifAccess().getTagAssignment_2()); 
            // InternalWizard.g:1672:2: ( rule__CasillaVerif__TagAssignment_2 )
            // InternalWizard.g:1672:3: rule__CasillaVerif__TagAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CasillaVerif__TagAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCasillaVerifAccess().getTagAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasillaVerif__Group__2__Impl"


    // $ANTLR start "rule__CasillaVerif__Group__3"
    // InternalWizard.g:1680:1: rule__CasillaVerif__Group__3 : rule__CasillaVerif__Group__3__Impl ;
    public final void rule__CasillaVerif__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1684:1: ( rule__CasillaVerif__Group__3__Impl )
            // InternalWizard.g:1685:2: rule__CasillaVerif__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CasillaVerif__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasillaVerif__Group__3"


    // $ANTLR start "rule__CasillaVerif__Group__3__Impl"
    // InternalWizard.g:1691:1: rule__CasillaVerif__Group__3__Impl : ( ( rule__CasillaVerif__PorDefAssignment_3 )? ) ;
    public final void rule__CasillaVerif__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1695:1: ( ( ( rule__CasillaVerif__PorDefAssignment_3 )? ) )
            // InternalWizard.g:1696:1: ( ( rule__CasillaVerif__PorDefAssignment_3 )? )
            {
            // InternalWizard.g:1696:1: ( ( rule__CasillaVerif__PorDefAssignment_3 )? )
            // InternalWizard.g:1697:2: ( rule__CasillaVerif__PorDefAssignment_3 )?
            {
             before(grammarAccess.getCasillaVerifAccess().getPorDefAssignment_3()); 
            // InternalWizard.g:1698:2: ( rule__CasillaVerif__PorDefAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalWizard.g:1698:3: rule__CasillaVerif__PorDefAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CasillaVerif__PorDefAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCasillaVerifAccess().getPorDefAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasillaVerif__Group__3__Impl"


    // $ANTLR start "rule__BotonNavegar__Group__0"
    // InternalWizard.g:1707:1: rule__BotonNavegar__Group__0 : rule__BotonNavegar__Group__0__Impl rule__BotonNavegar__Group__1 ;
    public final void rule__BotonNavegar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1711:1: ( rule__BotonNavegar__Group__0__Impl rule__BotonNavegar__Group__1 )
            // InternalWizard.g:1712:2: rule__BotonNavegar__Group__0__Impl rule__BotonNavegar__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__BotonNavegar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BotonNavegar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__Group__0"


    // $ANTLR start "rule__BotonNavegar__Group__0__Impl"
    // InternalWizard.g:1719:1: rule__BotonNavegar__Group__0__Impl : ( ( rule__BotonNavegar__TagAssignment_0 ) ) ;
    public final void rule__BotonNavegar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1723:1: ( ( ( rule__BotonNavegar__TagAssignment_0 ) ) )
            // InternalWizard.g:1724:1: ( ( rule__BotonNavegar__TagAssignment_0 ) )
            {
            // InternalWizard.g:1724:1: ( ( rule__BotonNavegar__TagAssignment_0 ) )
            // InternalWizard.g:1725:2: ( rule__BotonNavegar__TagAssignment_0 )
            {
             before(grammarAccess.getBotonNavegarAccess().getTagAssignment_0()); 
            // InternalWizard.g:1726:2: ( rule__BotonNavegar__TagAssignment_0 )
            // InternalWizard.g:1726:3: rule__BotonNavegar__TagAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BotonNavegar__TagAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBotonNavegarAccess().getTagAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__Group__0__Impl"


    // $ANTLR start "rule__BotonNavegar__Group__1"
    // InternalWizard.g:1734:1: rule__BotonNavegar__Group__1 : rule__BotonNavegar__Group__1__Impl rule__BotonNavegar__Group__2 ;
    public final void rule__BotonNavegar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1738:1: ( rule__BotonNavegar__Group__1__Impl rule__BotonNavegar__Group__2 )
            // InternalWizard.g:1739:2: rule__BotonNavegar__Group__1__Impl rule__BotonNavegar__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__BotonNavegar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BotonNavegar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__Group__1"


    // $ANTLR start "rule__BotonNavegar__Group__1__Impl"
    // InternalWizard.g:1746:1: rule__BotonNavegar__Group__1__Impl : ( 'destinos' ) ;
    public final void rule__BotonNavegar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1750:1: ( ( 'destinos' ) )
            // InternalWizard.g:1751:1: ( 'destinos' )
            {
            // InternalWizard.g:1751:1: ( 'destinos' )
            // InternalWizard.g:1752:2: 'destinos'
            {
             before(grammarAccess.getBotonNavegarAccess().getDestinosKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBotonNavegarAccess().getDestinosKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__Group__1__Impl"


    // $ANTLR start "rule__BotonNavegar__Group__2"
    // InternalWizard.g:1761:1: rule__BotonNavegar__Group__2 : rule__BotonNavegar__Group__2__Impl rule__BotonNavegar__Group__3 ;
    public final void rule__BotonNavegar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1765:1: ( rule__BotonNavegar__Group__2__Impl rule__BotonNavegar__Group__3 )
            // InternalWizard.g:1766:2: rule__BotonNavegar__Group__2__Impl rule__BotonNavegar__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__BotonNavegar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BotonNavegar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__Group__2"


    // $ANTLR start "rule__BotonNavegar__Group__2__Impl"
    // InternalWizard.g:1773:1: rule__BotonNavegar__Group__2__Impl : ( ':' ) ;
    public final void rule__BotonNavegar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1777:1: ( ( ':' ) )
            // InternalWizard.g:1778:1: ( ':' )
            {
            // InternalWizard.g:1778:1: ( ':' )
            // InternalWizard.g:1779:2: ':'
            {
             before(grammarAccess.getBotonNavegarAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBotonNavegarAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__Group__2__Impl"


    // $ANTLR start "rule__BotonNavegar__Group__3"
    // InternalWizard.g:1788:1: rule__BotonNavegar__Group__3 : rule__BotonNavegar__Group__3__Impl rule__BotonNavegar__Group__4 ;
    public final void rule__BotonNavegar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1792:1: ( rule__BotonNavegar__Group__3__Impl rule__BotonNavegar__Group__4 )
            // InternalWizard.g:1793:2: rule__BotonNavegar__Group__3__Impl rule__BotonNavegar__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__BotonNavegar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BotonNavegar__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__Group__3"


    // $ANTLR start "rule__BotonNavegar__Group__3__Impl"
    // InternalWizard.g:1800:1: rule__BotonNavegar__Group__3__Impl : ( ( rule__BotonNavegar__DestinoAssignment_3 ) ) ;
    public final void rule__BotonNavegar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1804:1: ( ( ( rule__BotonNavegar__DestinoAssignment_3 ) ) )
            // InternalWizard.g:1805:1: ( ( rule__BotonNavegar__DestinoAssignment_3 ) )
            {
            // InternalWizard.g:1805:1: ( ( rule__BotonNavegar__DestinoAssignment_3 ) )
            // InternalWizard.g:1806:2: ( rule__BotonNavegar__DestinoAssignment_3 )
            {
             before(grammarAccess.getBotonNavegarAccess().getDestinoAssignment_3()); 
            // InternalWizard.g:1807:2: ( rule__BotonNavegar__DestinoAssignment_3 )
            // InternalWizard.g:1807:3: rule__BotonNavegar__DestinoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BotonNavegar__DestinoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBotonNavegarAccess().getDestinoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__Group__3__Impl"


    // $ANTLR start "rule__BotonNavegar__Group__4"
    // InternalWizard.g:1815:1: rule__BotonNavegar__Group__4 : rule__BotonNavegar__Group__4__Impl ;
    public final void rule__BotonNavegar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1819:1: ( rule__BotonNavegar__Group__4__Impl )
            // InternalWizard.g:1820:2: rule__BotonNavegar__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BotonNavegar__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__Group__4"


    // $ANTLR start "rule__BotonNavegar__Group__4__Impl"
    // InternalWizard.g:1826:1: rule__BotonNavegar__Group__4__Impl : ( ( rule__BotonNavegar__Group_4__0 )* ) ;
    public final void rule__BotonNavegar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1830:1: ( ( ( rule__BotonNavegar__Group_4__0 )* ) )
            // InternalWizard.g:1831:1: ( ( rule__BotonNavegar__Group_4__0 )* )
            {
            // InternalWizard.g:1831:1: ( ( rule__BotonNavegar__Group_4__0 )* )
            // InternalWizard.g:1832:2: ( rule__BotonNavegar__Group_4__0 )*
            {
             before(grammarAccess.getBotonNavegarAccess().getGroup_4()); 
            // InternalWizard.g:1833:2: ( rule__BotonNavegar__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==29) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalWizard.g:1833:3: rule__BotonNavegar__Group_4__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__BotonNavegar__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBotonNavegarAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__Group__4__Impl"


    // $ANTLR start "rule__BotonNavegar__Group_4__0"
    // InternalWizard.g:1842:1: rule__BotonNavegar__Group_4__0 : rule__BotonNavegar__Group_4__0__Impl rule__BotonNavegar__Group_4__1 ;
    public final void rule__BotonNavegar__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1846:1: ( rule__BotonNavegar__Group_4__0__Impl rule__BotonNavegar__Group_4__1 )
            // InternalWizard.g:1847:2: rule__BotonNavegar__Group_4__0__Impl rule__BotonNavegar__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__BotonNavegar__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BotonNavegar__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__Group_4__0"


    // $ANTLR start "rule__BotonNavegar__Group_4__0__Impl"
    // InternalWizard.g:1854:1: rule__BotonNavegar__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BotonNavegar__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1858:1: ( ( ',' ) )
            // InternalWizard.g:1859:1: ( ',' )
            {
            // InternalWizard.g:1859:1: ( ',' )
            // InternalWizard.g:1860:2: ','
            {
             before(grammarAccess.getBotonNavegarAccess().getCommaKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBotonNavegarAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__Group_4__0__Impl"


    // $ANTLR start "rule__BotonNavegar__Group_4__1"
    // InternalWizard.g:1869:1: rule__BotonNavegar__Group_4__1 : rule__BotonNavegar__Group_4__1__Impl ;
    public final void rule__BotonNavegar__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1873:1: ( rule__BotonNavegar__Group_4__1__Impl )
            // InternalWizard.g:1874:2: rule__BotonNavegar__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BotonNavegar__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__Group_4__1"


    // $ANTLR start "rule__BotonNavegar__Group_4__1__Impl"
    // InternalWizard.g:1880:1: rule__BotonNavegar__Group_4__1__Impl : ( ( rule__BotonNavegar__DestinoAssignment_4_1 ) ) ;
    public final void rule__BotonNavegar__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1884:1: ( ( ( rule__BotonNavegar__DestinoAssignment_4_1 ) ) )
            // InternalWizard.g:1885:1: ( ( rule__BotonNavegar__DestinoAssignment_4_1 ) )
            {
            // InternalWizard.g:1885:1: ( ( rule__BotonNavegar__DestinoAssignment_4_1 ) )
            // InternalWizard.g:1886:2: ( rule__BotonNavegar__DestinoAssignment_4_1 )
            {
             before(grammarAccess.getBotonNavegarAccess().getDestinoAssignment_4_1()); 
            // InternalWizard.g:1887:2: ( rule__BotonNavegar__DestinoAssignment_4_1 )
            // InternalWizard.g:1887:3: rule__BotonNavegar__DestinoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BotonNavegar__DestinoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBotonNavegarAccess().getDestinoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__Group_4__1__Impl"


    // $ANTLR start "rule__BotonMensaje__Group__0"
    // InternalWizard.g:1896:1: rule__BotonMensaje__Group__0 : rule__BotonMensaje__Group__0__Impl rule__BotonMensaje__Group__1 ;
    public final void rule__BotonMensaje__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1900:1: ( rule__BotonMensaje__Group__0__Impl rule__BotonMensaje__Group__1 )
            // InternalWizard.g:1901:2: rule__BotonMensaje__Group__0__Impl rule__BotonMensaje__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__BotonMensaje__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BotonMensaje__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonMensaje__Group__0"


    // $ANTLR start "rule__BotonMensaje__Group__0__Impl"
    // InternalWizard.g:1908:1: rule__BotonMensaje__Group__0__Impl : ( ( rule__BotonMensaje__TagAssignment_0 ) ) ;
    public final void rule__BotonMensaje__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1912:1: ( ( ( rule__BotonMensaje__TagAssignment_0 ) ) )
            // InternalWizard.g:1913:1: ( ( rule__BotonMensaje__TagAssignment_0 ) )
            {
            // InternalWizard.g:1913:1: ( ( rule__BotonMensaje__TagAssignment_0 ) )
            // InternalWizard.g:1914:2: ( rule__BotonMensaje__TagAssignment_0 )
            {
             before(grammarAccess.getBotonMensajeAccess().getTagAssignment_0()); 
            // InternalWizard.g:1915:2: ( rule__BotonMensaje__TagAssignment_0 )
            // InternalWizard.g:1915:3: rule__BotonMensaje__TagAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BotonMensaje__TagAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBotonMensajeAccess().getTagAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonMensaje__Group__0__Impl"


    // $ANTLR start "rule__BotonMensaje__Group__1"
    // InternalWizard.g:1923:1: rule__BotonMensaje__Group__1 : rule__BotonMensaje__Group__1__Impl rule__BotonMensaje__Group__2 ;
    public final void rule__BotonMensaje__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1927:1: ( rule__BotonMensaje__Group__1__Impl rule__BotonMensaje__Group__2 )
            // InternalWizard.g:1928:2: rule__BotonMensaje__Group__1__Impl rule__BotonMensaje__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BotonMensaje__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BotonMensaje__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonMensaje__Group__1"


    // $ANTLR start "rule__BotonMensaje__Group__1__Impl"
    // InternalWizard.g:1935:1: rule__BotonMensaje__Group__1__Impl : ( 'mensaje' ) ;
    public final void rule__BotonMensaje__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1939:1: ( ( 'mensaje' ) )
            // InternalWizard.g:1940:1: ( 'mensaje' )
            {
            // InternalWizard.g:1940:1: ( 'mensaje' )
            // InternalWizard.g:1941:2: 'mensaje'
            {
             before(grammarAccess.getBotonMensajeAccess().getMensajeKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBotonMensajeAccess().getMensajeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonMensaje__Group__1__Impl"


    // $ANTLR start "rule__BotonMensaje__Group__2"
    // InternalWizard.g:1950:1: rule__BotonMensaje__Group__2 : rule__BotonMensaje__Group__2__Impl ;
    public final void rule__BotonMensaje__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1954:1: ( rule__BotonMensaje__Group__2__Impl )
            // InternalWizard.g:1955:2: rule__BotonMensaje__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BotonMensaje__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonMensaje__Group__2"


    // $ANTLR start "rule__BotonMensaje__Group__2__Impl"
    // InternalWizard.g:1961:1: rule__BotonMensaje__Group__2__Impl : ( ( rule__BotonMensaje__MensajeAssignment_2 ) ) ;
    public final void rule__BotonMensaje__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1965:1: ( ( ( rule__BotonMensaje__MensajeAssignment_2 ) ) )
            // InternalWizard.g:1966:1: ( ( rule__BotonMensaje__MensajeAssignment_2 ) )
            {
            // InternalWizard.g:1966:1: ( ( rule__BotonMensaje__MensajeAssignment_2 ) )
            // InternalWizard.g:1967:2: ( rule__BotonMensaje__MensajeAssignment_2 )
            {
             before(grammarAccess.getBotonMensajeAccess().getMensajeAssignment_2()); 
            // InternalWizard.g:1968:2: ( rule__BotonMensaje__MensajeAssignment_2 )
            // InternalWizard.g:1968:3: rule__BotonMensaje__MensajeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BotonMensaje__MensajeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBotonMensajeAccess().getMensajeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonMensaje__Group__2__Impl"


    // $ANTLR start "rule__BotonCerrar__Group__0"
    // InternalWizard.g:1977:1: rule__BotonCerrar__Group__0 : rule__BotonCerrar__Group__0__Impl rule__BotonCerrar__Group__1 ;
    public final void rule__BotonCerrar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1981:1: ( rule__BotonCerrar__Group__0__Impl rule__BotonCerrar__Group__1 )
            // InternalWizard.g:1982:2: rule__BotonCerrar__Group__0__Impl rule__BotonCerrar__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BotonCerrar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BotonCerrar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCerrar__Group__0"


    // $ANTLR start "rule__BotonCerrar__Group__0__Impl"
    // InternalWizard.g:1989:1: rule__BotonCerrar__Group__0__Impl : ( () ) ;
    public final void rule__BotonCerrar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1993:1: ( ( () ) )
            // InternalWizard.g:1994:1: ( () )
            {
            // InternalWizard.g:1994:1: ( () )
            // InternalWizard.g:1995:2: ()
            {
             before(grammarAccess.getBotonCerrarAccess().getBotonCerrarAction_0()); 
            // InternalWizard.g:1996:2: ()
            // InternalWizard.g:1996:3: 
            {
            }

             after(grammarAccess.getBotonCerrarAccess().getBotonCerrarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCerrar__Group__0__Impl"


    // $ANTLR start "rule__BotonCerrar__Group__1"
    // InternalWizard.g:2004:1: rule__BotonCerrar__Group__1 : rule__BotonCerrar__Group__1__Impl ;
    public final void rule__BotonCerrar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2008:1: ( rule__BotonCerrar__Group__1__Impl )
            // InternalWizard.g:2009:2: rule__BotonCerrar__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BotonCerrar__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCerrar__Group__1"


    // $ANTLR start "rule__BotonCerrar__Group__1__Impl"
    // InternalWizard.g:2015:1: rule__BotonCerrar__Group__1__Impl : ( ( rule__BotonCerrar__TagAssignment_1 ) ) ;
    public final void rule__BotonCerrar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2019:1: ( ( ( rule__BotonCerrar__TagAssignment_1 ) ) )
            // InternalWizard.g:2020:1: ( ( rule__BotonCerrar__TagAssignment_1 ) )
            {
            // InternalWizard.g:2020:1: ( ( rule__BotonCerrar__TagAssignment_1 ) )
            // InternalWizard.g:2021:2: ( rule__BotonCerrar__TagAssignment_1 )
            {
             before(grammarAccess.getBotonCerrarAccess().getTagAssignment_1()); 
            // InternalWizard.g:2022:2: ( rule__BotonCerrar__TagAssignment_1 )
            // InternalWizard.g:2022:3: rule__BotonCerrar__TagAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BotonCerrar__TagAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBotonCerrarAccess().getTagAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCerrar__Group__1__Impl"


    // $ANTLR start "rule__Destino__Group__0"
    // InternalWizard.g:2031:1: rule__Destino__Group__0 : rule__Destino__Group__0__Impl rule__Destino__Group__1 ;
    public final void rule__Destino__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2035:1: ( rule__Destino__Group__0__Impl rule__Destino__Group__1 )
            // InternalWizard.g:2036:2: rule__Destino__Group__0__Impl rule__Destino__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Destino__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destino__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destino__Group__0"


    // $ANTLR start "rule__Destino__Group__0__Impl"
    // InternalWizard.g:2043:1: rule__Destino__Group__0__Impl : ( '(' ) ;
    public final void rule__Destino__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2047:1: ( ( '(' ) )
            // InternalWizard.g:2048:1: ( '(' )
            {
            // InternalWizard.g:2048:1: ( '(' )
            // InternalWizard.g:2049:2: '('
            {
             before(grammarAccess.getDestinoAccess().getLeftParenthesisKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDestinoAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destino__Group__0__Impl"


    // $ANTLR start "rule__Destino__Group__1"
    // InternalWizard.g:2058:1: rule__Destino__Group__1 : rule__Destino__Group__1__Impl rule__Destino__Group__2 ;
    public final void rule__Destino__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2062:1: ( rule__Destino__Group__1__Impl rule__Destino__Group__2 )
            // InternalWizard.g:2063:2: rule__Destino__Group__1__Impl rule__Destino__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Destino__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destino__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destino__Group__1"


    // $ANTLR start "rule__Destino__Group__1__Impl"
    // InternalWizard.g:2070:1: rule__Destino__Group__1__Impl : ( ( rule__Destino__DestinoAssignment_1 ) ) ;
    public final void rule__Destino__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2074:1: ( ( ( rule__Destino__DestinoAssignment_1 ) ) )
            // InternalWizard.g:2075:1: ( ( rule__Destino__DestinoAssignment_1 ) )
            {
            // InternalWizard.g:2075:1: ( ( rule__Destino__DestinoAssignment_1 ) )
            // InternalWizard.g:2076:2: ( rule__Destino__DestinoAssignment_1 )
            {
             before(grammarAccess.getDestinoAccess().getDestinoAssignment_1()); 
            // InternalWizard.g:2077:2: ( rule__Destino__DestinoAssignment_1 )
            // InternalWizard.g:2077:3: rule__Destino__DestinoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Destino__DestinoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDestinoAccess().getDestinoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destino__Group__1__Impl"


    // $ANTLR start "rule__Destino__Group__2"
    // InternalWizard.g:2085:1: rule__Destino__Group__2 : rule__Destino__Group__2__Impl rule__Destino__Group__3 ;
    public final void rule__Destino__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2089:1: ( rule__Destino__Group__2__Impl rule__Destino__Group__3 )
            // InternalWizard.g:2090:2: rule__Destino__Group__2__Impl rule__Destino__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Destino__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destino__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destino__Group__2"


    // $ANTLR start "rule__Destino__Group__2__Impl"
    // InternalWizard.g:2097:1: rule__Destino__Group__2__Impl : ( ( rule__Destino__Group_2__0 )? ) ;
    public final void rule__Destino__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2101:1: ( ( ( rule__Destino__Group_2__0 )? ) )
            // InternalWizard.g:2102:1: ( ( rule__Destino__Group_2__0 )? )
            {
            // InternalWizard.g:2102:1: ( ( rule__Destino__Group_2__0 )? )
            // InternalWizard.g:2103:2: ( rule__Destino__Group_2__0 )?
            {
             before(grammarAccess.getDestinoAccess().getGroup_2()); 
            // InternalWizard.g:2104:2: ( rule__Destino__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalWizard.g:2104:3: rule__Destino__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Destino__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDestinoAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destino__Group__2__Impl"


    // $ANTLR start "rule__Destino__Group__3"
    // InternalWizard.g:2112:1: rule__Destino__Group__3 : rule__Destino__Group__3__Impl ;
    public final void rule__Destino__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2116:1: ( rule__Destino__Group__3__Impl )
            // InternalWizard.g:2117:2: rule__Destino__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Destino__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destino__Group__3"


    // $ANTLR start "rule__Destino__Group__3__Impl"
    // InternalWizard.g:2123:1: rule__Destino__Group__3__Impl : ( ')' ) ;
    public final void rule__Destino__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2127:1: ( ( ')' ) )
            // InternalWizard.g:2128:1: ( ')' )
            {
            // InternalWizard.g:2128:1: ( ')' )
            // InternalWizard.g:2129:2: ')'
            {
             before(grammarAccess.getDestinoAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDestinoAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destino__Group__3__Impl"


    // $ANTLR start "rule__Destino__Group_2__0"
    // InternalWizard.g:2139:1: rule__Destino__Group_2__0 : rule__Destino__Group_2__0__Impl rule__Destino__Group_2__1 ;
    public final void rule__Destino__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2143:1: ( rule__Destino__Group_2__0__Impl rule__Destino__Group_2__1 )
            // InternalWizard.g:2144:2: rule__Destino__Group_2__0__Impl rule__Destino__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Destino__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destino__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destino__Group_2__0"


    // $ANTLR start "rule__Destino__Group_2__0__Impl"
    // InternalWizard.g:2151:1: rule__Destino__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Destino__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2155:1: ( ( ',' ) )
            // InternalWizard.g:2156:1: ( ',' )
            {
            // InternalWizard.g:2156:1: ( ',' )
            // InternalWizard.g:2157:2: ','
            {
             before(grammarAccess.getDestinoAccess().getCommaKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDestinoAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destino__Group_2__0__Impl"


    // $ANTLR start "rule__Destino__Group_2__1"
    // InternalWizard.g:2166:1: rule__Destino__Group_2__1 : rule__Destino__Group_2__1__Impl ;
    public final void rule__Destino__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2170:1: ( rule__Destino__Group_2__1__Impl )
            // InternalWizard.g:2171:2: rule__Destino__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Destino__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destino__Group_2__1"


    // $ANTLR start "rule__Destino__Group_2__1__Impl"
    // InternalWizard.g:2177:1: rule__Destino__Group_2__1__Impl : ( ( rule__Destino__CasillaAssignment_2_1 ) ) ;
    public final void rule__Destino__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2181:1: ( ( ( rule__Destino__CasillaAssignment_2_1 ) ) )
            // InternalWizard.g:2182:1: ( ( rule__Destino__CasillaAssignment_2_1 ) )
            {
            // InternalWizard.g:2182:1: ( ( rule__Destino__CasillaAssignment_2_1 ) )
            // InternalWizard.g:2183:2: ( rule__Destino__CasillaAssignment_2_1 )
            {
             before(grammarAccess.getDestinoAccess().getCasillaAssignment_2_1()); 
            // InternalWizard.g:2184:2: ( rule__Destino__CasillaAssignment_2_1 )
            // InternalWizard.g:2184:3: rule__Destino__CasillaAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Destino__CasillaAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDestinoAccess().getCasillaAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destino__Group_2__1__Impl"


    // $ANTLR start "rule__Wizard__TituloAssignment_1"
    // InternalWizard.g:2193:1: rule__Wizard__TituloAssignment_1 : ( ruleEString ) ;
    public final void rule__Wizard__TituloAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2197:1: ( ( ruleEString ) )
            // InternalWizard.g:2198:2: ( ruleEString )
            {
            // InternalWizard.g:2198:2: ( ruleEString )
            // InternalWizard.g:2199:3: ruleEString
            {
             before(grammarAccess.getWizardAccess().getTituloEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWizardAccess().getTituloEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__TituloAssignment_1"


    // $ANTLR start "rule__Wizard__PaginasAssignment_4"
    // InternalWizard.g:2208:1: rule__Wizard__PaginasAssignment_4 : ( rulePagina ) ;
    public final void rule__Wizard__PaginasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2212:1: ( ( rulePagina ) )
            // InternalWizard.g:2213:2: ( rulePagina )
            {
            // InternalWizard.g:2213:2: ( rulePagina )
            // InternalWizard.g:2214:3: rulePagina
            {
             before(grammarAccess.getWizardAccess().getPaginasPaginaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePagina();

            state._fsp--;

             after(grammarAccess.getWizardAccess().getPaginasPaginaParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__PaginasAssignment_4"


    // $ANTLR start "rule__Wizard__PagIniAssignment_6"
    // InternalWizard.g:2223:1: rule__Wizard__PagIniAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Wizard__PagIniAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2227:1: ( ( ( ruleEString ) ) )
            // InternalWizard.g:2228:2: ( ( ruleEString ) )
            {
            // InternalWizard.g:2228:2: ( ( ruleEString ) )
            // InternalWizard.g:2229:3: ( ruleEString )
            {
             before(grammarAccess.getWizardAccess().getPagIniPaginaCrossReference_6_0()); 
            // InternalWizard.g:2230:3: ( ruleEString )
            // InternalWizard.g:2231:4: ruleEString
            {
             before(grammarAccess.getWizardAccess().getPagIniPaginaEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWizardAccess().getPagIniPaginaEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getWizardAccess().getPagIniPaginaCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__PagIniAssignment_6"


    // $ANTLR start "rule__Pagina__NameAssignment_1"
    // InternalWizard.g:2242:1: rule__Pagina__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Pagina__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2246:1: ( ( ruleEString ) )
            // InternalWizard.g:2247:2: ( ruleEString )
            {
            // InternalWizard.g:2247:2: ( ruleEString )
            // InternalWizard.g:2248:3: ruleEString
            {
             before(grammarAccess.getPaginaAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__NameAssignment_1"


    // $ANTLR start "rule__Pagina__CamposTextoAssignment_3_2"
    // InternalWizard.g:2257:1: rule__Pagina__CamposTextoAssignment_3_2 : ( ruleCampoTexto ) ;
    public final void rule__Pagina__CamposTextoAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2261:1: ( ( ruleCampoTexto ) )
            // InternalWizard.g:2262:2: ( ruleCampoTexto )
            {
            // InternalWizard.g:2262:2: ( ruleCampoTexto )
            // InternalWizard.g:2263:3: ruleCampoTexto
            {
             before(grammarAccess.getPaginaAccess().getCamposTextoCampoTextoParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCampoTexto();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getCamposTextoCampoTextoParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__CamposTextoAssignment_3_2"


    // $ANTLR start "rule__Pagina__CamposTextoAssignment_3_3_1"
    // InternalWizard.g:2272:1: rule__Pagina__CamposTextoAssignment_3_3_1 : ( ruleCampoTexto ) ;
    public final void rule__Pagina__CamposTextoAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2276:1: ( ( ruleCampoTexto ) )
            // InternalWizard.g:2277:2: ( ruleCampoTexto )
            {
            // InternalWizard.g:2277:2: ( ruleCampoTexto )
            // InternalWizard.g:2278:3: ruleCampoTexto
            {
             before(grammarAccess.getPaginaAccess().getCamposTextoCampoTextoParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCampoTexto();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getCamposTextoCampoTextoParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__CamposTextoAssignment_3_3_1"


    // $ANTLR start "rule__Pagina__CasillasVerifAssignment_4_2"
    // InternalWizard.g:2287:1: rule__Pagina__CasillasVerifAssignment_4_2 : ( ruleCasillaVerif ) ;
    public final void rule__Pagina__CasillasVerifAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2291:1: ( ( ruleCasillaVerif ) )
            // InternalWizard.g:2292:2: ( ruleCasillaVerif )
            {
            // InternalWizard.g:2292:2: ( ruleCasillaVerif )
            // InternalWizard.g:2293:3: ruleCasillaVerif
            {
             before(grammarAccess.getPaginaAccess().getCasillasVerifCasillaVerifParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCasillaVerif();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getCasillasVerifCasillaVerifParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__CasillasVerifAssignment_4_2"


    // $ANTLR start "rule__Pagina__CasillasVerifAssignment_4_3_1"
    // InternalWizard.g:2302:1: rule__Pagina__CasillasVerifAssignment_4_3_1 : ( ruleCasillaVerif ) ;
    public final void rule__Pagina__CasillasVerifAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2306:1: ( ( ruleCasillaVerif ) )
            // InternalWizard.g:2307:2: ( ruleCasillaVerif )
            {
            // InternalWizard.g:2307:2: ( ruleCasillaVerif )
            // InternalWizard.g:2308:3: ruleCasillaVerif
            {
             before(grammarAccess.getPaginaAccess().getCasillasVerifCasillaVerifParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCasillaVerif();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getCasillasVerifCasillaVerifParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__CasillasVerifAssignment_4_3_1"


    // $ANTLR start "rule__Pagina__BotonesAssignment_7"
    // InternalWizard.g:2317:1: rule__Pagina__BotonesAssignment_7 : ( ruleBoton ) ;
    public final void rule__Pagina__BotonesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2321:1: ( ( ruleBoton ) )
            // InternalWizard.g:2322:2: ( ruleBoton )
            {
            // InternalWizard.g:2322:2: ( ruleBoton )
            // InternalWizard.g:2323:3: ruleBoton
            {
             before(grammarAccess.getPaginaAccess().getBotonesBotonParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleBoton();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getBotonesBotonParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__BotonesAssignment_7"


    // $ANTLR start "rule__Pagina__BotonesAssignment_8_1"
    // InternalWizard.g:2332:1: rule__Pagina__BotonesAssignment_8_1 : ( ruleBoton ) ;
    public final void rule__Pagina__BotonesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2336:1: ( ( ruleBoton ) )
            // InternalWizard.g:2337:2: ( ruleBoton )
            {
            // InternalWizard.g:2337:2: ( ruleBoton )
            // InternalWizard.g:2338:3: ruleBoton
            {
             before(grammarAccess.getPaginaAccess().getBotonesBotonParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoton();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getBotonesBotonParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__BotonesAssignment_8_1"


    // $ANTLR start "rule__CampoTexto__TagAssignment_1"
    // InternalWizard.g:2347:1: rule__CampoTexto__TagAssignment_1 : ( ruleEString ) ;
    public final void rule__CampoTexto__TagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2351:1: ( ( ruleEString ) )
            // InternalWizard.g:2352:2: ( ruleEString )
            {
            // InternalWizard.g:2352:2: ( ruleEString )
            // InternalWizard.g:2353:3: ruleEString
            {
             before(grammarAccess.getCampoTextoAccess().getTagEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCampoTextoAccess().getTagEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CampoTexto__TagAssignment_1"


    // $ANTLR start "rule__CampoTexto__OpcionalAssignment_2"
    // InternalWizard.g:2362:1: rule__CampoTexto__OpcionalAssignment_2 : ( ( 'opcional' ) ) ;
    public final void rule__CampoTexto__OpcionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2366:1: ( ( ( 'opcional' ) ) )
            // InternalWizard.g:2367:2: ( ( 'opcional' ) )
            {
            // InternalWizard.g:2367:2: ( ( 'opcional' ) )
            // InternalWizard.g:2368:3: ( 'opcional' )
            {
             before(grammarAccess.getCampoTextoAccess().getOpcionalOpcionalKeyword_2_0()); 
            // InternalWizard.g:2369:3: ( 'opcional' )
            // InternalWizard.g:2370:4: 'opcional'
            {
             before(grammarAccess.getCampoTextoAccess().getOpcionalOpcionalKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCampoTextoAccess().getOpcionalOpcionalKeyword_2_0()); 

            }

             after(grammarAccess.getCampoTextoAccess().getOpcionalOpcionalKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CampoTexto__OpcionalAssignment_2"


    // $ANTLR start "rule__CasillaVerif__NameAssignment_1"
    // InternalWizard.g:2381:1: rule__CasillaVerif__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CasillaVerif__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2385:1: ( ( ruleEString ) )
            // InternalWizard.g:2386:2: ( ruleEString )
            {
            // InternalWizard.g:2386:2: ( ruleEString )
            // InternalWizard.g:2387:3: ruleEString
            {
             before(grammarAccess.getCasillaVerifAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCasillaVerifAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasillaVerif__NameAssignment_1"


    // $ANTLR start "rule__CasillaVerif__TagAssignment_2"
    // InternalWizard.g:2396:1: rule__CasillaVerif__TagAssignment_2 : ( ruleEString ) ;
    public final void rule__CasillaVerif__TagAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2400:1: ( ( ruleEString ) )
            // InternalWizard.g:2401:2: ( ruleEString )
            {
            // InternalWizard.g:2401:2: ( ruleEString )
            // InternalWizard.g:2402:3: ruleEString
            {
             before(grammarAccess.getCasillaVerifAccess().getTagEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCasillaVerifAccess().getTagEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasillaVerif__TagAssignment_2"


    // $ANTLR start "rule__CasillaVerif__PorDefAssignment_3"
    // InternalWizard.g:2411:1: rule__CasillaVerif__PorDefAssignment_3 : ( ( 'selected' ) ) ;
    public final void rule__CasillaVerif__PorDefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2415:1: ( ( ( 'selected' ) ) )
            // InternalWizard.g:2416:2: ( ( 'selected' ) )
            {
            // InternalWizard.g:2416:2: ( ( 'selected' ) )
            // InternalWizard.g:2417:3: ( 'selected' )
            {
             before(grammarAccess.getCasillaVerifAccess().getPorDefSelectedKeyword_3_0()); 
            // InternalWizard.g:2418:3: ( 'selected' )
            // InternalWizard.g:2419:4: 'selected'
            {
             before(grammarAccess.getCasillaVerifAccess().getPorDefSelectedKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCasillaVerifAccess().getPorDefSelectedKeyword_3_0()); 

            }

             after(grammarAccess.getCasillaVerifAccess().getPorDefSelectedKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasillaVerif__PorDefAssignment_3"


    // $ANTLR start "rule__BotonNavegar__TagAssignment_0"
    // InternalWizard.g:2430:1: rule__BotonNavegar__TagAssignment_0 : ( ruleEString ) ;
    public final void rule__BotonNavegar__TagAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2434:1: ( ( ruleEString ) )
            // InternalWizard.g:2435:2: ( ruleEString )
            {
            // InternalWizard.g:2435:2: ( ruleEString )
            // InternalWizard.g:2436:3: ruleEString
            {
             before(grammarAccess.getBotonNavegarAccess().getTagEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBotonNavegarAccess().getTagEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__TagAssignment_0"


    // $ANTLR start "rule__BotonNavegar__DestinoAssignment_3"
    // InternalWizard.g:2445:1: rule__BotonNavegar__DestinoAssignment_3 : ( ruleDestino ) ;
    public final void rule__BotonNavegar__DestinoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2449:1: ( ( ruleDestino ) )
            // InternalWizard.g:2450:2: ( ruleDestino )
            {
            // InternalWizard.g:2450:2: ( ruleDestino )
            // InternalWizard.g:2451:3: ruleDestino
            {
             before(grammarAccess.getBotonNavegarAccess().getDestinoDestinoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDestino();

            state._fsp--;

             after(grammarAccess.getBotonNavegarAccess().getDestinoDestinoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__DestinoAssignment_3"


    // $ANTLR start "rule__BotonNavegar__DestinoAssignment_4_1"
    // InternalWizard.g:2460:1: rule__BotonNavegar__DestinoAssignment_4_1 : ( ruleDestino ) ;
    public final void rule__BotonNavegar__DestinoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2464:1: ( ( ruleDestino ) )
            // InternalWizard.g:2465:2: ( ruleDestino )
            {
            // InternalWizard.g:2465:2: ( ruleDestino )
            // InternalWizard.g:2466:3: ruleDestino
            {
             before(grammarAccess.getBotonNavegarAccess().getDestinoDestinoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDestino();

            state._fsp--;

             after(grammarAccess.getBotonNavegarAccess().getDestinoDestinoParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonNavegar__DestinoAssignment_4_1"


    // $ANTLR start "rule__BotonMensaje__TagAssignment_0"
    // InternalWizard.g:2475:1: rule__BotonMensaje__TagAssignment_0 : ( ruleEString ) ;
    public final void rule__BotonMensaje__TagAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2479:1: ( ( ruleEString ) )
            // InternalWizard.g:2480:2: ( ruleEString )
            {
            // InternalWizard.g:2480:2: ( ruleEString )
            // InternalWizard.g:2481:3: ruleEString
            {
             before(grammarAccess.getBotonMensajeAccess().getTagEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBotonMensajeAccess().getTagEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonMensaje__TagAssignment_0"


    // $ANTLR start "rule__BotonMensaje__MensajeAssignment_2"
    // InternalWizard.g:2490:1: rule__BotonMensaje__MensajeAssignment_2 : ( ruleEString ) ;
    public final void rule__BotonMensaje__MensajeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2494:1: ( ( ruleEString ) )
            // InternalWizard.g:2495:2: ( ruleEString )
            {
            // InternalWizard.g:2495:2: ( ruleEString )
            // InternalWizard.g:2496:3: ruleEString
            {
             before(grammarAccess.getBotonMensajeAccess().getMensajeEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBotonMensajeAccess().getMensajeEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonMensaje__MensajeAssignment_2"


    // $ANTLR start "rule__BotonCerrar__TagAssignment_1"
    // InternalWizard.g:2505:1: rule__BotonCerrar__TagAssignment_1 : ( ruleEString ) ;
    public final void rule__BotonCerrar__TagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2509:1: ( ( ruleEString ) )
            // InternalWizard.g:2510:2: ( ruleEString )
            {
            // InternalWizard.g:2510:2: ( ruleEString )
            // InternalWizard.g:2511:3: ruleEString
            {
             before(grammarAccess.getBotonCerrarAccess().getTagEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBotonCerrarAccess().getTagEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCerrar__TagAssignment_1"


    // $ANTLR start "rule__Destino__DestinoAssignment_1"
    // InternalWizard.g:2520:1: rule__Destino__DestinoAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Destino__DestinoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2524:1: ( ( ( ruleEString ) ) )
            // InternalWizard.g:2525:2: ( ( ruleEString ) )
            {
            // InternalWizard.g:2525:2: ( ( ruleEString ) )
            // InternalWizard.g:2526:3: ( ruleEString )
            {
             before(grammarAccess.getDestinoAccess().getDestinoPaginaCrossReference_1_0()); 
            // InternalWizard.g:2527:3: ( ruleEString )
            // InternalWizard.g:2528:4: ruleEString
            {
             before(grammarAccess.getDestinoAccess().getDestinoPaginaEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDestinoAccess().getDestinoPaginaEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDestinoAccess().getDestinoPaginaCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destino__DestinoAssignment_1"


    // $ANTLR start "rule__Destino__CasillaAssignment_2_1"
    // InternalWizard.g:2539:1: rule__Destino__CasillaAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Destino__CasillaAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2543:1: ( ( ( ruleEString ) ) )
            // InternalWizard.g:2544:2: ( ( ruleEString ) )
            {
            // InternalWizard.g:2544:2: ( ( ruleEString ) )
            // InternalWizard.g:2545:3: ( ruleEString )
            {
             before(grammarAccess.getDestinoAccess().getCasillaCasillaVerifCrossReference_2_1_0()); 
            // InternalWizard.g:2546:3: ( ruleEString )
            // InternalWizard.g:2547:4: ruleEString
            {
             before(grammarAccess.getDestinoAccess().getCasillaCasillaVerifEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDestinoAccess().getCasillaCasillaVerifEStringParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDestinoAccess().getCasillaCasillaVerifCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destino__CasillaAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000041000000L});

}