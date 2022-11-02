package com.hostmdy.service;

import com.hostmdy.basic.repository.GreetingRepository;

public class GreetingBeanFactory {
	
	private final GreetingRepository greetingRepository;

	public GreetingBeanFactory(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}
	
	
	public GreetingService createGreetingBean(String language) {
		return switch (language) {
		case "en" -> new PrimaryGreetingServiceImpl(greetingRepository);
		case "fr" -> new PrimaryFrenchGreetingService(greetingRepository);
		case "es" -> new PrimarySpanishGreetingService(greetingRepository);
		default -> new PrimaryGreetingServiceImpl(greetingRepository);
		};
		
	}

}
