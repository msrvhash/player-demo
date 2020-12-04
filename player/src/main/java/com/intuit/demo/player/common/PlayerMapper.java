package com.intuit.demo.player.common;

import java.util.List;

import org.mapstruct.Mapper;

import com.intuit.demo.player.dto.PlayerDTO;
import com.intuit.demo.player.entity.Player;



@Mapper(componentModel = "spring")
public interface PlayerMapper {

Player dto2entity(PlayerDTO Playerdto);
	
	PlayerDTO entity2dto(Player Player);
	 
	List<Player> dto2entity(List<PlayerDTO> Playerdtos);
	
	List<PlayerDTO> entity2dto(List<Player> Players);
	
}
