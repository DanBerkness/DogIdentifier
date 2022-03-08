package com.exwebsite.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.exwebsite.example.domain.Dog;
import com.exwebsite.example.service.DogService;

@Controller
public class ViewController {

	@Autowired
	DogService dogService;
	
	@GetMapping("/welcome")
	public String getHomePage (ModelMap model) {
		Dog dog = new Dog();
		List<Dog> dogs = dogService.findAll();
		model.put("dogs", dog);
		model.put("alldogs", dogs);
		dogs.stream().forEach(x -> System.out.println(x));
		System.out.println("heyyy");
		return "homeview";
		
		}
	@PostMapping("/welcome")
	public String postDogPage (Dog dog) {
		dogService.createDog(dog);
		return "redirect:/welcome";
	}
	
	@GetMapping("/dogs")
	public String getDogPage () {
		return "dogview";
	}
	
}
