package com.hostmdy.basic.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.hostmdy.service.PetService;

@Controller
public class PetController {
	
	private PetService petService;

	public PetController(@Qualifier("rabbitPetService") PetService petService) {
		super();
		this.petService = petService;
	}
	
	public String getPetType() {
		return petService.getPetType();
	}

}
