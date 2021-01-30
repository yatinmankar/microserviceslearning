package com.springmvc.controller;

       
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
@RequestMapping("/greet")
//@EnableWebMvc
public class HelloWorldController /*extends AbstractController*/ {

/*	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelView=new ModelAndView("hello");
		modelView.addObject("welcomeMsg"," Hello User !!!! Welcome to spring application");
		
		return modelView;
	}*/

	@RequestMapping("/hello")
	public ModelAndView HelloWorld1(){
		ModelAndView modelView=new ModelAndView("hello");
		modelView.addObject("welcomeMsg"," Hello Yatin !!!! Welcome to spring application");
		
		return modelView;
		
	}
	
	@RequestMapping("/welcome/{user}/{country}")
	public ModelAndView HelloWorld2(@PathVariable("user") String user,
									@PathVariable("country") String country){
		ModelAndView modelView=new ModelAndView("Welcome");
		modelView.addObject("welcomeMsg"," Hello "+user+" !!!! Welcome to "+country);
		
		return modelView;
		
	}
	
	
	@RequestMapping("/welcome1/{user}/{country}")
	public ModelAndView HelloWorld3(@PathVariable Map<String,String> pathVars){
		
		String user=pathVars.get("user");
		String country=pathVars.get("country");
		
		ModelAndView modelView=new ModelAndView("Welcome");
		modelView.addObject("welcomeMsg"," Hello "+user+" !!!! Welcome to "+country);
		
		return modelView;
		
	}
	
	
	
	
}
