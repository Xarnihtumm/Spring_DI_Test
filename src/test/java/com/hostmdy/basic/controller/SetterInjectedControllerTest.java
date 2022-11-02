package com.hostmdy.basic.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.service.GreetingServiceImpl;

class SetterInjectedControllerTest {
	
	private SetterInjectedController setterInjectedController
	 = new SetterInjectedController();

	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImpl greetingService = new GreetingServiceImpl();
		setterInjectedController.setGreetingService(greetingService);
	}

	@Test
	void test() {
		assertEquals(GreetingServiceImpl.HELLO_WORD,setterInjectedController.sayHello());
	}

}
