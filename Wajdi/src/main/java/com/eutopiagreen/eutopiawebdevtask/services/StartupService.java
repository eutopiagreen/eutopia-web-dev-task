package com.eutopiagreen.eutopiawebdevtask.services;

import com.eutopiagreen.eutopiawebdevtask.entities.Startup;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StartupService {
    Optional<Startup> findById(long id);

    List<Startup> findAll();
}
