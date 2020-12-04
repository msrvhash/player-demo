package com.intuit.demo.player.dto;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {

	private String playerId;
	
	private int birthYear;
	
	private int birthDay;
	 
	private int birthMonth;
	

	private Object deathYear;
	
	private Object deathDay;
	 
	private Object deathMonth;
	
	private int height;
	
	private int weight;
	
	private String nameGiven;
	
	private String birthState;
	
	private String birthCountry;
	
	private String birthCity;
	
	private String deathState;
	
	private String deathCountry;
	
	private String deathCity;
	
	private String nameFirst;

	private String nameLast;
	
	private String bats;

	private String _throws;
	
	private String debut;

	private String finalGame;
	
	private String retroId;

}
