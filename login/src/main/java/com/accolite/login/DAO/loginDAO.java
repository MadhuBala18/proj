package com.accolite.login.DAO;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.accolite.login.loginQUERIES;
import com.accolite.login.model.loginMapper;
import com.accolite.login.model.userDetail;

@Repository
public class loginDAO {
	
	private JdbcTemplate jdbc=null;
	private DataSource ds=null;
	
	@Autowired
	public loginDAO(DataSource ds)
	{
		this.ds=ds;
		this.jdbc=new JdbcTemplate(ds);
	}
	
	public List<userDetail> getUserDetails()
	{
		return jdbc.query(loginQUERIES.GET_ALL_DETAILS,new Object[] {},new loginMapper());
	}
}