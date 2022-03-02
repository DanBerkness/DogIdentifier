package com.exwebsite.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/welcome")
	public String getHomePage () {
		System.out.println("HI HERE!!");
		return "homeview";
		
	}
	
	@GetMapping("/dogs")
	public String getDogPage () {
		return "dogview";
	}
}
