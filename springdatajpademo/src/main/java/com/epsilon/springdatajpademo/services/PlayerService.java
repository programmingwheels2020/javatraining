package com.epsilon.springdatajpademo.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.epsilon.springdatajpademo.models.Player;
import com.epsilon.springdatajpademo.repositories.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;
	
	public Player createPlayer(Player player) {
		
		player.setID(UUID.randomUUID().toString());
		
		playerRepository.save(player);
		return player;
	}

	public List<Player> getPlayers() {
		return this.playerRepository.findAll();
	}

	public Optional<Player> getPlayer(String id) {
		return this.playerRepository.findById(id);
	}

	public Player updatePlayer(String id, Player player) {
		player.setID(id);
		return this.playerRepository.save(player);
	}

	public void deletePlayer(String id) {
		this.playerRepository.deleteById(id);
		
	}

	public List<Player> getPlayersByCountry(String country) {
	  return this.playerRepository.findByCountry(country);
	}

	public List<Player> getPlayersByClub(String club) {
		return this.playerRepository.findByClubName(club);
	}
	
	public List<Player> getPlayersByCountryAndClub(String country, String clubName){
		return this.playerRepository.findByCountryAndClubName(country, clubName);
	}
}
