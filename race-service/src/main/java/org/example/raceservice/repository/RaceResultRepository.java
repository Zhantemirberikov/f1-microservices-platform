package org.example.raceservice.repository;

import org.example.raceservice.model.RaceResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceResultRepository extends JpaRepository<RaceResult, Long> {
}
