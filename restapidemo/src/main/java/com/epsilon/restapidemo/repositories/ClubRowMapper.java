package com.epsilon.restapidemo.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.epsilon.restapidemo.models.Club;

public class ClubRowMapper implements RowMapper<Club> {

	@Override
	public Club mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Club club = new Club();
		club.setID(rs.getString("id"));
		club.setClubName(rs.getString("name"));
		club.setCountry(rs.getString("country"));
		club.setLeagueName(rs.getString("league"));
		return club;
		
	}

}
