package com.eutopiagreen.eutopiawebdevtask.services;

import com.eutopiagreen.eutopiawebdevtask.entities.Location;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LocationService {
    List<Location> findAll();
}
