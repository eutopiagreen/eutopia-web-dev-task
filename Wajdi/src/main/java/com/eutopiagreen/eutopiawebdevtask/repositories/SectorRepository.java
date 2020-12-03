package com.eutopiagreen.eutopiawebdevtask.repositories;

import com.eutopiagreen.eutopiawebdevtask.entities.Sector;
import com.eutopiagreen.eutopiawebdevtask.entities.Startup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectorRepository extends JpaRepository<Sector, Long> {
}
