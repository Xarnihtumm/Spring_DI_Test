package com.hostmdy.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.hostmdy.service.CatPetService;
import com.hostmdy.service.RabbitPetService;

@Configuration
public class PetConfig {
	
	@Bean
	@Primary
	public CatPetService catPetService() {
		return new CatPetService();
	}
	
	@Bean

	public RabbitPetService rabbitPetService() {
		return new RabbitPetService();
	}

}
