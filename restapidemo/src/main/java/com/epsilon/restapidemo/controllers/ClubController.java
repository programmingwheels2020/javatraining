package com.epsilon.restapidemo.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.epsilon.restapidemo.models.Club;
import com.epsilon.restapidemo.services.ClubService;

@RestController
public class ClubController {
  
	@Autowired
	private ClubService clubService;
	
	
	@PostMapping(path = "/club")
	public Club createClub(@RequestBody Club club) {
		return this.clubService.addClub(club);
		
	}
	
	@GetMapping(path = "/clubs")
	public List<Club> getClubs(){
		return this.clubService.getClubs();
	}
	
	@GetMapping(path = "/club/{id}" )
	public Club getClub(@PathVariable String id) {
		return this.clubService.getClubById(id);
	}
	
	@PutMapping(path="/club/{id}")
	public Club updateClub(@PathVariable String id, @RequestBody Club club) {
		club.setID(id);
		this.clubService.updateClub(club);
		return club;
	}
	
	@DeleteMapping(path="/club/{id}")
	public void deleteClub(@PathVariable String id) {
		this.clubService.deleteClubById(id);
	}
	
}