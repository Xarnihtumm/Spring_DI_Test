package com.hostmdy.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hostmdy.service.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	//@Qualifier("greetingServiceImpl")
	public GreetingService greetingService;
	
	public String sayHello() {
		
		return greetingService.sayHello();
	}

}
