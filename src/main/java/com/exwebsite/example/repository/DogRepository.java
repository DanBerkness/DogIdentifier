package com.exwebsite.example.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exwebsite.example.domain.Dog;
import com.exwebsite.example.service.DogService;

@Repository
public class DogRepository {
	
	@Autowired
	DogService dogService;

	private Map<Integer, Dog> dogs = new HashMap<>();

	public void createDog(Dog dog) {
		dogs.put(dog.getId(), dog);
		
	}
}
