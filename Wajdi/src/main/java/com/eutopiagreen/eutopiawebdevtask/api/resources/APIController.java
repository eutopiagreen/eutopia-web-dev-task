package com.eutopiagreen.eutopiawebdevtask.api.resources;

import com.eutopiagreen.eutopiawebdevtask.entities.Startup;
import com.eutopiagreen.eutopiawebdevtask.services.StartupService;
import com.eutopiagreen.eutopiawebdevtask.utils.StartupFilter;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class APIController {
    private final StartupService startupServiceImpl;

    //	map this method to /getStartupList using POST, consuming JSON and producing JSON
    @PostMapping(path = "getStartupList", produces = "application/json", consumes = "application/json")
    public ResponseEntity<HashMap<String, Object>> getStartupList(@RequestBody StartupFilter startupFilter) {
//        get all the startups from the database
        List<Startup> startups = this.startupServiceImpl.findAll();
//        check if the request has a sector filter
        if (startupFilter.sector != null)
            startups = startupFilter.of(startups).withSector(startupFilter.sector).getStartups();
//        check if the request has a location filter
        if (startupFilter.location != null)
            startups = startupFilter.of(startups).withLocation(startupFilter.location).getStartups();
//        creates a new map which is the response
        Map map = new HashMap();
//        put the total number of results after sector / location filters
        map.put("count", startups.size());
//        apply the limit / offset pagination
        startups = startupFilter.withOffset(startupFilter.offset).withLimit(startupFilter.limit).getStartups();
//        put the result in the map
        map.put("results", startups);
//        return the result
        return new ResponseEntity(map, HttpStatus.OK);
    }

    //	map this method to /getStartup/{id} using GET, producing JSON
    @GetMapping(path = "/getStartup/{id}", produces = "application/json")
    public ResponseEntity<Startup> getStartup(@PathVariable Long id) {
//        check to see if the id is null
        if (id == null) {
//            throw the exception
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        } else {
            Optional<Startup> optionalStartup = this.startupServiceImpl.findById(id);
            return optionalStartup.map(startup -> new ResponseEntity(startup, HttpStatus.OK)).orElseGet(() -> new ResponseEntity("Startup not found", HttpStatus.NOT_FOUND));
        }
    }
}

