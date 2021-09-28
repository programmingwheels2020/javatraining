package com.epsilon.restapidemo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.epsilon.restapidemo.models.Club;
import com.epsilon.restapidemo.repositories.ClubRowMapper;

@Service
public class ClubService {

	List<Club> clubs = new ArrayList<Club>();

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Club addClub(Club club) {
		club.setID(UUID.randomUUID().toString());
		String sql = "INSERT INTO CLUBS VALUES('" + club.getID() + "','" + club.getClubName() + "','"
				+ club.getCountry() + "','" + club.getLeagueName() + "')";

		System.out.println(sql);
		jdbcTemplate.execute(sql);
		return club;

	}

	public List<Club> getClubs() {

		String sql = "SELECT * FROM CLUBS";

		ClubRowMapper rowMapper = new ClubRowMapper();

		List<Club> clubs = jdbcTemplate.query(sql, rowMapper);
		return clubs;
	}

	public Club getClubById(String id) {
		String sql = "SELECT * FROM CLUBS WHERE id =?";

		ClubRowMapper rowMapper = new ClubRowMapper();

		// Club club = jdbcTemplate.query(sql, new Object[] { id }, rowMapper);

		return jdbcTemplate.queryForObject(sql, new Object[] { id }, rowMapper);

	}

	public void updateClub(Club club) {
		String sql = "UPDATE CLUBS SET NAME =?,COUNTRY=?,LEAGUE=? WHERE ID=?";

		jdbcTemplate.update(sql, club.getClubName(), club.getCountry(), club.getLeagueName(), club.getID());

	}

	public void deleteClubById(String id) {

		String sql = "DELETE FROM CLUBS WHERE ID=?";

		jdbcTemplate.update(sql, id);

	}

}
