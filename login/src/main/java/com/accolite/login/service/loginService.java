package com.accolite.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accolite.login.DAO.loginDAO;
import com.accolite.login.model.userDetail;

@Service
public class loginService {

	@Autowired
	private loginDAO daoobj;
	
	@Transactional
	public List<userDetail> getalldetails(){
		return daoobj.getUserDetails();
	}
}
