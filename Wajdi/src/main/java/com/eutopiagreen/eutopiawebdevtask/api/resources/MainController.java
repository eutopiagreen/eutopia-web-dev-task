package com.eutopiagreen.eutopiawebdevtask.api.resources;

import com.eutopiagreen.eutopiawebdevtask.entities.Startup;
import com.eutopiagreen.eutopiawebdevtask.services.StartupService;
import com.eutopiagreen.eutopiawebdevtask.utils.StartupFilter;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {
//    dependency injection
    private final StartupService startupServiceImpl;

    public List<Startup> getStartupListCore(StartupFilter filter) {
//        get all the startups from the database
		List<Startup> startups = this.startupServiceImpl.findAll();
//		applying sector filter and offset and limit pagination
        startups = filter.of(startups).withSector().withOffset().withLimit().getStartups();
		return startups;
    }
}

