package com.intuit.demo.player.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intuit.demo.player.common.PlayerMapper;
import com.intuit.demo.player.dao.PlayerDAO;
import com.intuit.demo.player.dto.PlayerDTO;
import com.intuit.demo.player.entity.Player;


@Service
public class PlayerService {
@Autowired PlayerMapper playerMapper;
	
	@Autowired PlayerDAO playerDao;

	public List<Player> getPlayers() {
		return (this.playerDao.findAllPlayers());
	}
	

	public Player getPlayerById(String id) {
		return (this.playerDao.findPlayerById(id));
	}
	
	public Player savePlayer(Player player) {
		return (this.playerDao.savePlayer(player));
	}
	
	
	public Player updatePlayerHeight(String id) {
		return (this.playerDao.updatePlayerHeight(id));
	}
	
	public Player updatePlayerWeight(String id) {
		return (this.playerDao.updatePlayerWeight(id));
	}
}
