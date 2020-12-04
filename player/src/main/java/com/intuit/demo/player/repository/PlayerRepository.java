package com.intuit.demo.player.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.intuit.demo.player.entity.Player;

public interface PlayerRepository extends MongoRepository<Player,String> {

	Player findByPlayerId(String playerId);
}
