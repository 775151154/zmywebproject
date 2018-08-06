package com.leo.mypro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mvc")
public class HelloWordController {
	
	@RequestMapping("/hello")
	public String Hello(){
//		int i = 5/0;
		return "helloword";
	}
	
	/**
	 * �ֲ��쳣������ת��error.jsp
	 * @param ex
	 * @return
	 */
	@ExceptionHandler
    public ModelAndView exceptionHandler(Exception ex){
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex);
        System.out.println("in testExceptionHandler");
        return mv;
    }
}
