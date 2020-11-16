package eutopiagreen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

	/**
	TO BE COMPLETED:
		Map this method to the path "/"
	*/
	public String index(Model model) {
	/**
	TO BE COMPLETED:
		Here the candidate will need to extract from the DB all the necessary filters, which will be displayed on the home page
		- Add to "model" an attribute called "locations", a JSON with all the countries in the DB (see Location.java)
		- Add to "model" an attribute called "sectors", a JSON with all the sectors in the DB (see Sector.java)
	*/
		return "index";
	}


	/**
	TO BE COMPLETED:
		Map this method to the path "/{id}", where "id" corresponds to the startup id
	*/
	public String detail(Model model, /**TO BE COMPLETED: map url param "id" to the following long variable */ Long id) {
	/**
	TO BE COMPLETED:
		Here the candidate will need to extract from the DB all the details about a single startup, which will be displayed on the detail page
		- Add to "model" an attribute called "startup", with the Startup.java object corresponding to "id"
		- Add to "model" an attribute called "startupJSON", a JSON with the details above already in JSON format
	*/	
		return "detail";
	}
}

