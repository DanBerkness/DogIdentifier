package com.exwebsite.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/welcome")
	public String homePage () {
		System.out.println("HI HERE!!");
		return "homeview";
		
	}
	
	@GetMapping("/animals")
	public String animalView () {
		return "animals";
	}
}
