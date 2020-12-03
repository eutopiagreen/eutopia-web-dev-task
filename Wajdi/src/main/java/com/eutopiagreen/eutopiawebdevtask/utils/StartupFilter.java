package com.eutopiagreen.eutopiawebdevtask.utils;

import com.eutopiagreen.eutopiawebdevtask.entities.Startup;

import java.util.List;
import java.util.stream.Collectors;

public class StartupFilter {
    public String location;
    public String sector;
    public int limit = 1;
    public int offset = 0;
    private List<Startup> startups;

    /**
     * return current dataset
     * @return List<Startup>
     */
    public List<Startup> getStartups() {
        return this.startups;
    }

    /**
     * constructs a new Filter to chain methods on.
     * @param startups datasource
     * @return StartupFilter
     */
    public StartupFilter of(List<Startup> startups) {
        this.startups = startups;
        return this;
    }

    /**
     * apply the location filter
     * @return StartupFilter
     */
    public StartupFilter withLocation() {
        this.startups = this.startups.stream().filter(startup -> startup.getLocation().getName().equals(this.location)).collect(Collectors.toList());
        return this;
    }

    /**
     * apply the location filter
     * @param location input filter
     * @return StartupFilter
     */
    public StartupFilter withLocation(String location) {
        this.location = location;
        return this.withLocation();
    }

    /**
     * apply the sector filter
     * @return StartupFilter
     */
    public StartupFilter withSector() {
        this.startups = this.startups.stream().filter(startup -> startup.getSector().getName().equals(this.sector)).collect(Collectors.toList());
        return this;
    }

    /**
     * apply the sector filter
     * @param sector input filter
     * @return StartupFilter
     */
    public StartupFilter withSector(String sector) {
        this.sector = sector;
        return this.withSector();
    }

    /**
     * limit the total number of results
     * @return StartupFilter
     */
    public StartupFilter withLimit() {
        this.startups = this.startups.subList(0, this.limit);
        return this;
    }

    /**
     * limit the total number of results
     * @param limit if it is greater than the size, it will revert to size
     * @return StartupFilter
     */
    public StartupFilter withLimit(int limit) {
        this.limit = Math.min(limit, this.startups.size());
        return this.withLimit();
    }

    /**
     * define the starting point of results
     * @return StartupFilter
     */
    public StartupFilter withOffset() {
        this.startups = this.startups.subList(this.offset, this.startups.size());
        return this;
    }

    /**
     * define the starting point of results
     * @param offset if it is greater than the size, it will show only one result
     * @return StartupFilter
     */
    public StartupFilter withOffset(int offset) {
        if (offset >= this.startups.size())
            this.offset = --offset;
        else
            this.offset = offset;
        return this.withOffset();
    }
}

