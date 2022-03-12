package com.exwebsite.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.exwebsite.example.domain.Dog;
import com.exwebsite.example.service.DogService;

@Controller
public class ViewController {

	@Autowired
	DogService dogService;
	
	@GetMapping("/dogs")
	public String getDogHomePage (ModelMap model) {
		Dog dog = new Dog();
		List<Dog> dogs = dogService.findAll();
		model.put("dogs", dog);
		model.put("alldogs", dogs);
		dogs.stream().forEach(x -> System.out.println(x));
		return "dogview";
		
		}
	@PostMapping("/dogs")
	public String postDogPage (Dog dog) {
		dogService.createDog(dog);
		return "redirect:/dogs";
	}
	
	@GetMapping("/dogs/{id}")
	public String getDogPageById (@PathVariable Integer id, ModelMap model) {
		Dog dog = dogService.getById(id);
		System.out.println("hi");
		model.put("dogs", dog);
		return "specificdog";
	}
	@PostMapping("/dogs/{id}")
	public String postDogPageById (Dog dog) {
		Dog currentDog = dogService.save(dog);
		System.out.println(currentDog.toString());
		return "redirect:/dogs/" + currentDog.getId();
	}
	
}
