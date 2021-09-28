package com.epsilon.springdatajpademo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.epsilon.springdatajpademo.models.Player;
import com.epsilon.springdatajpademo.services.PlayerService;

@RestController
public class PlayerController {
   
	@Autowired
	private PlayerService playerService;
	
	@PostMapping(path = "/player")
	public Player createPlayer(@RequestBody Player player) {
		return this.playerService.createPlayer(player);
	}
	
	@GetMapping(path="/player")
	public List<Player> getPlayers(){
	    return this.playerService.getPlayers();
	}
	
	@GetMapping(path="/player/{id}")
	public Optional<Player> getPlayer(@PathVariable String id) {
		return this.playerService.getPlayer(id);
	}
	
	@PutMapping(path="/player/{id}")
	public Player updatePlayer(@PathVariable String id, @RequestBody Player player) {
        return this.playerService.updatePlayer(id,player);		
	}
	
	@DeleteMapping(path="/player/{id}")
	public void deletePlayer(@PathVariable String id) {
		this.playerService.deletePlayer(id);
	}
	
	@GetMapping(path="/player/country/{country}")
	public List<Player> getPlayerByCountry(@PathVariable String country) {
		return this.playerService.getPlayersByCountry(country);
	}
	
	@GetMapping(path="/player/club/{club}")
	public List<Player> getPlayerByClub(@PathVariable String club) {
		return this.playerService.getPlayersByClub(club);
	}
	
	@GetMapping(path="/player/club/{club}/{country}")
	public List<Player> getPlayerByClub(@PathVariable(name = "club") String club, @PathVariable(name = "country") String country) {
		return this.playerService.getPlayersByCountryAndClub(country, club);
	}
}
