/*
 * generated by Xtext 2.15.0
 */
package wizard


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class WizardStandaloneSetup extends WizardStandaloneSetupGenerated {

	def static void doSetup() {
		new WizardStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
