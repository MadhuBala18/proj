package com.accolite.vrr.dao;

import javax.sql.DataSource;

import org.arpit.java2blog.bean.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class CountryDaoImpl implements CountryDao {

	JdbcTemplate jdbcTemplate;
	private final String INSERT_COUNTRY = "insert into country(name, population) values(?,?)";
	
	@Autowired
	public CountryDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void createCountry(Country country) {
		
		jdbcTemplate.update(INSERT_COUNTRY, country.getCountryName(), country.getPopulation());
	}

}
