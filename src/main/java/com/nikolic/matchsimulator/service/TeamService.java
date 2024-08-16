package com.nikolic.matchsimulator.service;

import com.nikolic.matchsimulator.model.Team;
import com.nikolic.matchsimulator.repository.TeamRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team addTeam(Team team) {
        return teamRepository.save(team);
    }
}
