package com.nikolic.matchsimulator.service;

import com.nikolic.matchsimulator.model.Team;
import com.nikolic.matchsimulator.repository.TeamRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class TeamService {

    private TeamRepository teamRepository;

    public Team addTeam(Team team) {
        return teamRepository.save(team);
    }
}
