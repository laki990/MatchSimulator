package com.nikolic.matchsimulator.service;

import com.nikolic.matchsimulator.model.Player;
import com.nikolic.matchsimulator.repository.PlayerRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class PlayerService {

    private PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    public Player addNewPlayer(Player player) {
        return this.playerRepository.save(player);
    }
}
