package com.exwebsite.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.exwebsite.example.domain.Dog;
import com.exwebsite.example.service.DogService;

@Controller
public class ViewController {
//work on creating a model map 
	@Autowired
	DogService dogService;
	
	@GetMapping("/welcome")
	public String getHomePage () {
		System.out.println("HI HERE!!");
		return "homeview";
		
	}
	
	@GetMapping("/dogs")
	public String getDogPage () {
		return "dogview";
	}
	
	@PostMapping("/dogs")
	public String postDogPage (Dog dog) {
		dogService.createDog(dog);
		return "dogview";
	}
}
