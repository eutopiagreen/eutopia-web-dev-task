package com.eutopiagreen.eutopiawebdevtask.services;

import com.eutopiagreen.eutopiawebdevtask.entities.Startup;
import com.eutopiagreen.eutopiawebdevtask.repositories.StartupRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StartupServiceImpl implements StartupService {
    private final StartupRepository startupRepository;

    @Override
    public Optional<Startup> findById(long id) {
        return this.startupRepository.findById(id);
    }

    @Override
    public List<Startup> findAll() {
        return this.startupRepository.findAll();
    }
}
