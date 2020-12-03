package com.eutopiagreen.eutopiawebdevtask.repositories;

import com.eutopiagreen.eutopiawebdevtask.entities.Location;
import com.eutopiagreen.eutopiawebdevtask.entities.Startup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
