/*
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BromiumStandaloneSetup extends BromiumStandaloneSetupGenerated {

	def static void doSetup() {
		new BromiumStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
