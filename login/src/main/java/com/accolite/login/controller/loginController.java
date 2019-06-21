package com.accolite.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.login.model.userDetail;
import com.accolite.login.service.loginService;

@RestController
public class loginController {

	@Autowired
	loginService serv;
	
	@RequestMapping("/api/alldetails")
	public List<userDetail> getAllDetails()
	{
		return serv.getalldetails();
	}
}
