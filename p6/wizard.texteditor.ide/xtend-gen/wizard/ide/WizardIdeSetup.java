/**
 * generated by Xtext 2.15.0
 */
package wizard.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import wizard.WizardRuntimeModule;
import wizard.WizardStandaloneSetup;
import wizard.ide.WizardIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class WizardIdeSetup extends WizardStandaloneSetup {
  @Override
  public Injector createInjector() {
    WizardRuntimeModule _wizardRuntimeModule = new WizardRuntimeModule();
    WizardIdeModule _wizardIdeModule = new WizardIdeModule();
    return Guice.createInjector(Modules2.mixin(_wizardRuntimeModule, _wizardIdeModule));
  }
}