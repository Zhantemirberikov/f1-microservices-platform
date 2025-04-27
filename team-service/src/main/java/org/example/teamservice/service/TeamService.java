package org.example.teamservice.service;

import org.example.teamservice.feign.DriverClient;
import org.example.teamservice.model.Team;
import org.example.teamservice.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class TeamService {
    private final TeamRepository teamRepository;
    private final DriverClient driverClient;

    public TeamService(TeamRepository teamRepository, DriverClient driverClient) {
        this.teamRepository = teamRepository;
        this.driverClient = driverClient;
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Optional<Team> getTeamById(Long id) {
        return teamRepository.findById(id);
    }

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    public List<Map<String, Object>> getAllDrivers() {
        return driverClient.getAllDrivers();
    }

}
