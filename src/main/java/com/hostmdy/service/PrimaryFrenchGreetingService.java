package com.hostmdy.service;

import com.hostmdy.basic.repository.GreetingRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PrimaryFrenchGreetingService implements GreetingService{
	
	private final GreetingRepository greetingRepository;

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return greetingRepository.getFranceGreeting();
	}
	
}
