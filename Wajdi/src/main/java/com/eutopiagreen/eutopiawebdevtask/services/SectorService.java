package com.eutopiagreen.eutopiawebdevtask.services;

import com.eutopiagreen.eutopiawebdevtask.entities.Sector;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SectorService {
    List<Sector> findAll();
}
