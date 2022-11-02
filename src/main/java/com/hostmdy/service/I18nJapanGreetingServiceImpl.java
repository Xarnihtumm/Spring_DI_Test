package com.hostmdy.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service("i18nGreeting")
//@Profile({"JP","default"})
public class I18nJapanGreetingServiceImpl implements GreetingService{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Konnichiwa : Japanese Greeting";
	}

}
