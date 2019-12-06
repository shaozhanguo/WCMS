package com.wcms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wcms.model.UserEntity;
import com.wcms.service.IUserService;

@Controller
@RequestMapping(value = "/v1")
public class TestController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String login() {
		List<UserEntity> users = userService.findAll(); 
		System.out.println(users);
		return "hello world";
	}
	
}
