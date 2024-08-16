package com.nikolic.matchsimulator.mapper;

import com.nikolic.matchsimulator.dto.PlayerDto;
import com.nikolic.matchsimulator.model.Player;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

    PlayerMapper INSTANCE = Mappers.getMapper(PlayerMapper.class);

    @Mapping(source = "team.id", target = "teamId")
    PlayerDto playerToPlayerDto(Player player);

    @Mapping(source = "teamId", target = "team.id")
    Player playerDtoToPlayer(PlayerDto playerDto);
}