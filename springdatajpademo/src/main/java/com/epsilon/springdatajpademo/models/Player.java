package com.epsilon.springdatajpademo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "player")
public class Player {

	@Id
	private String ID;
	
	private String playerName;
	private String clubName;
	private String country;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Player [ID=" + ID + ", playerName=" + playerName + ", clubName=" + clubName + ", country=" + country
				+ "]";
	}
	
}
