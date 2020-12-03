package com.eutopiagreen.eutopiawebdevtask.services;

import com.eutopiagreen.eutopiawebdevtask.entities.Location;
import com.eutopiagreen.eutopiawebdevtask.repositories.LocationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;

    @Override
    public List<Location> findAll() {
        return this.locationRepository.findAll();
    }
}
