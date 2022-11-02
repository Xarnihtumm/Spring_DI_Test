package com.hostmdy.basic.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ContextController {
	
	public String getContextValue() {
		System.out.println("Hello I am the value in contxt controller bean");
		return "Just Return String";
	}

}
