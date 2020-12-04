package com.intuit.demo.player.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.intuit.demo.player.entity.Player;
import com.intuit.demo.player.repository.PlayerRepository;

@Component
public class PlayerDAO {
	
	@Autowired PlayerRepository playerRepository;
	
public List<Player>findAllPlayers() {
	List<Player> players = playerRepository.findAll();
	return players;
}

public Player findPlayerById(String playerId) {
	return playerRepository.findByPlayerId(playerId);
}

public Player updatePlayerHeight(String playerId) {
	Player player = playerRepository.findByPlayerId(playerId);;
	player.setHeight((player.getHeight())+1);
	return playerRepository.save(player);
}

public Player updatePlayerWeight(String playerId) {
	Player player = playerRepository.findByPlayerId(playerId);;
	player.setWeight((player.getWeight())+1);
	return playerRepository.save(player);
}

public Player savePlayer(Player player) {
	return playerRepository.save(player);
}

}
