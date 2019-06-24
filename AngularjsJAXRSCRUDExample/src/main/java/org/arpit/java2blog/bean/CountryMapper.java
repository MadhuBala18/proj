package org.arpit.java2blog.bean;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class CountryMapper implements RowMapper<Country> {

	@Override
	public Country mapRow(ResultSet rs, int i) throws SQLException {
		
		Country country = new Country();
		
		country.setId(rs.getInt("id"));
		country.setCountryName(rs.getString("name"));
		country.setPopulation(rs.getLong("population"));
		
		return country;
	}

}
