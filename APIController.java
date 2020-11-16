package eutopiagreen.controller;

import eutopiagreen.model.Startup;
import eutopiagreen.model.StartupFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;

/**
TO BE COMPLETED:
	Allow REST controller
*/
@ComponentScan(value = "eutopiagreen.controller")
public class APIController {
	/**
	TO BE COMPLETED:
		Map this method to "/getStartupList", consuming a JSON and producing a JSON
	*/
	public ResponseEntity<HashMap<String, Object>> getStartupList(/**TO BE COMPLETED: map JSON from request to the following variable */StartupFilter startupFilter) {
	/**
	TO BE COMPLETED:
		Return a ResponseEntity containing a HashMap<String, Object> with two items:
			- "results", with a List<Startup> applying any filter in "startupFilter"
			- "count", with the total number of results found with the filters above, excluding offset and limit
	*/
	}
	
	/**
	TO BE COMPLETED:
		Map this method to "/getStartup/{id}", producing a JSON
	*/
	public ResponseEntity<Startup> getStartup(/**TO BE COMPLETED: map url param "{id}" to the following variable */Long id) {
	/**
	TO BE COMPLETED:
		Return a ResponseEntity containing th Startup with id corresponding to "id", with the following cases:
			- startup found
			- startup not found
			- "id" is null
	*/
	}
}

