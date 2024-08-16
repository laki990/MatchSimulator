package com.nikolic.matchsimulator.controller;

import com.nikolic.matchsimulator.model.Player;
import com.nikolic.matchsimulator.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping
    public ResponseEntity<Player> addNewPlayer(@RequestBody  Player player) {
        Player newPlayer = playerService.addNewPlayer(player);
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
    }
}
