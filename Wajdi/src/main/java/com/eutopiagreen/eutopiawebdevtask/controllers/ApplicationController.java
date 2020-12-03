package com.eutopiagreen.eutopiawebdevtask.controllers;

import com.eutopiagreen.eutopiawebdevtask.entities.Location;
import com.eutopiagreen.eutopiawebdevtask.entities.Sector;
import com.eutopiagreen.eutopiawebdevtask.entities.Startup;
import com.eutopiagreen.eutopiawebdevtask.services.LocationService;
import com.eutopiagreen.eutopiawebdevtask.services.SectorService;
import com.eutopiagreen.eutopiawebdevtask.services.StartupService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class ApplicationController {

//    dependency injection
    private final SectorService sectorServiceImpl;
    private final LocationService locationServiceImpl;
    private final StartupService startupServiceImpl;
    private final ObjectMapper mapper;

//    map this method to / using Http GET
//    Model model is a global variable that is passed automatically to thymeleaf
    @GetMapping(path = "/")
    public String index(Model model) {
//        get all the sectors from the database
        List<Sector> sectors = this.sectorServiceImpl.findAll();
//        get all the locations from the database
        List<Location> locations = this.locationServiceImpl.findAll();
//        bind the 2 results to the model object
        model.addAttribute("sectors", sectors);
        model.addAttribute("locations", locations);
//        return the index.html view
        return "index";
    }

//    map this method to /{id} using Http GET
    @GetMapping(path = "/{id}")
    public String detail(Model model, @PathVariable Long id) {
//        query the database for the startup with id
        Optional<Startup> optionalStartup = this.startupServiceImpl.findById(id);
//        if the startup was present
        optionalStartup.ifPresent(startup -> {
//            add the object itself to the model
            model.addAttribute("startup", startup);
//            try converting it to JSON and add it to the model
            try {
                model.addAttribute("startupJSON", this.mapper.writeValueAsString(startup));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        });
//        return detail.html view
        return "detail";
    }
}

