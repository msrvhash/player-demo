package com.intuit.demo.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.demo.player.dto.PlayerDTO;
import com.intuit.demo.player.entity.Player;
import com.intuit.demo.player.service.PlayerService;


@RestController
@RequestMapping("/api/players")
public class PlayerController {

	@Autowired PlayerService playerService;
	
	@GetMapping("")
	public ResponseEntity<List<Player>> getPlayers() {
		
		List<Player> Playerdtos = playerService.getPlayers();
		return ResponseEntity.status(HttpStatus.OK).body(Playerdtos);
		
	}

	@GetMapping("{id}")
	public ResponseEntity<Player> getPlayerById(@PathVariable("id") String id) {
		Player player =playerService.getPlayerById(id);
		if(player!=null) {
		return ResponseEntity.status(HttpStatus.OK).body(player);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	@PutMapping("{playerID}/weight")
	public ResponseEntity<Player> updatePlayerWeight(@PathVariable("playerID") String playerId) {
		
		Player player = playerService.getPlayerById(playerId);
		return ResponseEntity.status(HttpStatus.OK).body(playerService.updatePlayerWeight(playerId));
		
	}

	@PutMapping("{playerID}/height")
	public ResponseEntity<Player> updatePlayerHeight(@PathVariable("playerID") String id) {
		Player player = playerService.getPlayerById(id);
		return ResponseEntity.status(HttpStatus.OK).body(playerService.updatePlayerHeight(id));
	}
	
	@PostMapping("")
	public ResponseEntity<Player> createLead(@RequestBody Player player) {
		
		Player playerdto = playerService.savePlayer(player);
		return ResponseEntity.status(HttpStatus.CREATED).body(playerdto);
		
	}


}
