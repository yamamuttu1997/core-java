package com.xworkz.ipl.dto;

import lombok.Data;

@Data
public class IplDTO {
	
 private String gameOf;
 private String type;
 private String sponser;
 private String mangedBy;
 private int teams;
 
 public IplDTO() {
	}
/*
public String getGameOf() {
	return gameOf;
}

public void setGameOf(String gameOf) {
	this.gameOf = gameOf;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getSponser() {
	return sponser;
}

public void setSponser(String sponser) {
	this.sponser = sponser;
}

public String getMangedBy() {
	return mangedBy;
}

public void setMangedBy(String mangedBy) {
	this.mangedBy = mangedBy;
}

public int getTeams() {
	return teams;
}

public void setTeams(int teams) {
	this.teams = teams;
}
 */
 
}
