package module

import geb.Module

class GoogleSearchModule extends Module {

	// a parameterised value set when the module is included
	def buttonValue

	// the content DSL
	static content = {
		// name the search input control “field”, defining it with the jQuery like navigator
		field { $("input", name: "q") }
	}
	
}
