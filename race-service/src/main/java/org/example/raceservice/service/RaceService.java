package org.example.raceservice.service;

import org.example.raceservice.model.Race;
import org.example.raceservice.model.RaceResult;
import org.example.raceservice.repository.RaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RaceService {
    private final RaceRepository raceRepository;

    public RaceService(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    public Race createRace(Race race) {
        race.getResults().forEach(result -> result.setRace(race));
        return raceRepository.save(race);
    }

    public Optional<Race> getRaceById(Long id) {
        return raceRepository.findById(id);
    }

    public RaceResult getWinnerOfLastRace() {
        List<Race> races = raceRepository.findAll();
        if (races.isEmpty()) {
            return null;
        }
        Race lastRace = races.get(races.size() - 1);
        return lastRace.getResults().stream()
                .filter(result -> result.getPosition() == 1)
                .findFirst()
                .orElse(null);
    }
}
