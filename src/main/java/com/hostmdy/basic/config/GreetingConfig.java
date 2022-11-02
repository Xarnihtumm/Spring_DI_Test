package com.hostmdy.basic.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.hostmdy.basic.repository.GreetingRepository;
import com.hostmdy.service.GreetingBeanFactory;
import com.hostmdy.service.GreetingService;

@Configuration
public class GreetingConfig {
	
	private final GreetingRepository greetingRepository;
	
	public GreetingConfig(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	@Bean
	public GreetingBeanFactory greetingBeanFactory() {
		return new GreetingBeanFactory(greetingRepository);
	}
	
	@Bean
	@Profile({"default","en"})
	@Primary
	public GreetingService primaryGreeting() {
		return greetingBeanFactory().createGreetingBean("en");
	}
	
	@Bean
	@Profile("fr")
	@Primary
	public GreetingService primaryFrenchGreeting() {
		return greetingBeanFactory().createGreetingBean("fr");
	}
	
	@Bean
	@Profile("es")
	@Primary
	public GreetingService primarySpanishGreeting() {
		return greetingBeanFactory().createGreetingBean("es");
	}
}
