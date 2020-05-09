/*
 * generated by Xtext 2.15.0
 */
package wizard.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import wizard.parser.antlr.internal.InternalWizardParser;
import wizard.services.WizardGrammarAccess;

public class WizardParser extends AbstractAntlrParser {

	@Inject
	private WizardGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalWizardParser createParser(XtextTokenStream stream) {
		return new InternalWizardParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Wizard";
	}

	public WizardGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WizardGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
