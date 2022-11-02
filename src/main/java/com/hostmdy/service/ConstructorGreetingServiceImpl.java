package com.hostmdy.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{
	
	public static final String HELLO_WORD = "Hello from ConstructorGreetingServiceImpl Bean";

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_WORD;
	}
}
