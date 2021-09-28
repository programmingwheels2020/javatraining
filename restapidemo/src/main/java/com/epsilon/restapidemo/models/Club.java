package com.epsilon.restapidemo.models;

import org.springframework.stereotype.Component;


public class Club {

	private String ID;
	private String clubName;
	private String country;
	private String leagueName;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
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

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	@Override
	public String toString() {
		return "Club [ID=" + ID + ", clubName=" + clubName + ", country=" + country + ", leagueName=" + leagueName
				+ "]";
	}
	
	

}
