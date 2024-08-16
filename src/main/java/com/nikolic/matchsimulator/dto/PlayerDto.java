package com.nikolic.matchsimulator.dto;

import com.nikolic.matchsimulator.model.PlayerPosition;
import lombok.Data;

@Data
public class PlayerDto {
    private String name;
    private int ranking;
    private PlayerPosition position;
    private Long teamId;

}
