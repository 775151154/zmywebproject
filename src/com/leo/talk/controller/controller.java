package com.leo.talk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/talk")
public class controller {
	
	@RequestMapping("/begin.do")
	@ResponseBody
	public String execute (String name){
		
		System.out.println("pass");
		return name;
	}
	
	
	
}
