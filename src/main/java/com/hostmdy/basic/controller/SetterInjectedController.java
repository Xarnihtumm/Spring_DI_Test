package com.hostmdy.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.hostmdy.service.GreetingService;

@Controller
public class SetterInjectedController {
	
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayHello();
	}

	@Autowired
	public void setGreetingService(@Qualifier("setterGreetingServiceImpl") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	

}
