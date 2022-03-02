package com.exwebsite.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exwebsite.example.domain.Dog;
import com.exwebsite.example.repository.DogRepository;

@Service
public class DogService {
	
	@Autowired
	DogRepository dogRepo;

	private Integer id = 1;
	
	public void createDog(Dog dog) {
		
		dogRepo.createDog(dog);
	}
}
