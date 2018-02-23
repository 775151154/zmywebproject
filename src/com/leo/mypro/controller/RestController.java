package com.leo.mypro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/rest")
public class RestController {

	@RequestMapping("/index")
	public String getRestIndex(){
		return "restindex";
	}
	
	/**
	 * rest风格的mvc，传入同一个值，根据请求类型的不同，判断其增删改查
	 * @param id
	 * @return String
	 */
	
	@RequestMapping(value = "/method/{id}", method = RequestMethod.GET)
	public String get(@PathVariable("id") Integer id){
		System.out.println(id);
		return "helloword";
	}
	
	@RequestMapping(value = "/method/{id}", method = RequestMethod.POST)
	public String post(@PathVariable("id") Integer id){
		System.out.println(id);
		return "helloword";
	}
	
	@RequestMapping(value = "/method/{id}", method = RequestMethod.PUT)
	public String put(@PathVariable("id") Integer id){
		System.out.println(id);
		return "helloword";
	}
	
	@RequestMapping(value = "/method/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer id){
		System.out.println(id);
		return "helloword";
	}
}
