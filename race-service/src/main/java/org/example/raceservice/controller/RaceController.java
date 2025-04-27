package org.example.raceservice.controller;

import org.example.raceservice.model.Race;
import org.example.raceservice.model.RaceResult;
import org.example.raceservice.service.RaceService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/races")
public class RaceController {
    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @PostMapping
    public Race createRace(@RequestBody Race race) {
        return raceService.createRace(race);
    }

    @GetMapping("/{id}")
    public Optional<Race> getRaceById(@PathVariable Long id) {
        return raceService.getRaceById(id);
    }

    @GetMapping("/winner")
    public RaceResult getWinnerOfLastRace() {
        return raceService.getWinnerOfLastRace();
    }
}
