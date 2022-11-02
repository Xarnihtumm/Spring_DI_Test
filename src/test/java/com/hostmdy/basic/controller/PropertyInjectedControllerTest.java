package com.hostmdy.basic.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.service.GreetingServiceImpl;

class PropertyInjectedControllerTest {
	
	private PropertyInjectedController propertyController = 
			new PropertyInjectedController();

	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImpl greetingService = new GreetingServiceImpl();
		this.propertyController.greetingService = greetingService;
	}

	@Test
	void test() {
		assertEquals(GreetingServiceImpl.HELLO_WORD,propertyController.sayHello());
	}

}
