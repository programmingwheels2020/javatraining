package com.epsilon.springdatajpademo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epsilon.springdatajpademo.models.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
	
	public List<Player> findByCountry(String country);
	public List<Player> findByClubName(String clubName);
	
	public List<Player> findByCountryAndClubName(String country, String clubName);
	

}
