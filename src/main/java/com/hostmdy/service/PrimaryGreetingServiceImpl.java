package com.hostmdy.service;

import com.hostmdy.basic.repository.GreetingRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class PrimaryGreetingServiceImpl implements GreetingService{
	
	private final GreetingRepository greetingRepository;

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		log.debug("log : primaryGreetingServiceImpl Bean:sayHello() is invoted");
		return greetingRepository.getEnglishGreeting();
	}
	
}
