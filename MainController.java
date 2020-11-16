package eutopiagreen.controller;

import eutopiagreen.model.Startup;
import eutopiagreen.model.StartupFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ComponentScan(value = "eutopiagreen.controller")
public class MainController {
	public List<Startup> getStartupListCore(StartupFilter filter) {
	/**
	TO BE COMPLETED:
		Retrieve from the DB a list of Startups, applying any filter in "filter"
	*/
	}
}

