package com.eutopiagreen.eutopiawebdevtask.services;

import com.eutopiagreen.eutopiawebdevtask.entities.Sector;
import com.eutopiagreen.eutopiawebdevtask.repositories.SectorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class SectorServiceImpl implements SectorService {
    private final SectorRepository sectorRepository;

    @Override
    public List<Sector> findAll() {
        return this.sectorRepository.findAll();
    }
}
