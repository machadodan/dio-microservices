package com.javainuse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class FirstController {

	@GetMapping("/message")
	public String test() {
		return "Hello DigitalInnvationOn! Called in FIRST SERVICE API de Microservice!";
	}
}
