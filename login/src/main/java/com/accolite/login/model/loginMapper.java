package com.accolite.login.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class loginMapper implements RowMapper<userDetail> {

	public userDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
	{
		userDetail user=new userDetail();
		user.setUserid(rs.getInt("userid"));
		user.setPassword(rs.getString("password"));
		return user;
	}
	}
}
