/**
 * generated by Xtext 2.15.0
 */
package wizard;

import wizard.WizardStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class WizardStandaloneSetup extends WizardStandaloneSetupGenerated {
  public static void doSetup() {
    new WizardStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
