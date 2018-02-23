package com.leo.mypro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leo.mypro.service.impl.LoginServiceImpl;


@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginServiceImpl loginService;
	
	@RequestMapping("/doformlogin")
	public String doFormLogin(){
		loginService.doLoginTest();
		return "helloword";
	}
}
