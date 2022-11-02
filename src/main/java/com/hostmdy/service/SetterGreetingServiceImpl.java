package com.hostmdy.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService{
	
	public static final String HELLO_WORD = "Hello from setterGreetingServiceImpl Bean";

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_WORD;
	}

}
