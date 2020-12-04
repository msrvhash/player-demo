package com.intuit.demo.player.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="players")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player extends BaseEntity{

	@Field("playerId")
	private String playerId;
	
	@Field("birthYear")
	private Integer birthYear;
	
	@Field("birthDay")
	private Integer birthDay;
	 
	@Field("birthMonth")
	private Integer birthMonth;
	
	@Field("deathYear")
	private Object deathYear;
	
	@Field("deathDay")
	private Object deathDay;
	 
	@Field("deathMonth")
	private Object deathMonth;
	
	
	@Field("height")
	private Integer height;
	
	@Field("weight")
	private Integer weight;
	
	@Field("nameGiven")
	private String nameGiven;
	
	@Field("birthState")
	private String birthState;
	
	@Field("birthCountry")
	private String birthCountry;
	
	@Field("birthCity")
	private String birthCity;
	
	@Field("deathState")
	private String deathState;
	
	@Field("deathCountry")
	private String deathCountry;
	
	@Field("deathCity")
	private String deathCity;
	

	@Field("nameFirst")
	private String nameFirst;

	@Field("nameLast")
	private String nameLast;
	
	@Field("bats")
	private String bats;

	@Field("throws")
	private String _throws;
	
	@Field("debut")
	private String debut;

	@Field("finalGame")
	private String finalGame;
	
	@Field("retroId")
	private String retroId;

}
