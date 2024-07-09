package com.nikolic.matchsimulator.controller;

import com.nikolic.matchsimulator.model.Team;
import com.nikolic.matchsimulator.service.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public ResponseEntity<Team> addTeam (@RequestBody Team team) {
        Team newTeam = this.teamService.addTeam(team);
        return new ResponseEntity<>(newTeam, HttpStatus.CREATED);
    }
}
