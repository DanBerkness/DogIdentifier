package com.exwebsite.example.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exwebsite.example.domain.Dog;
import com.exwebsite.example.service.DogService;

@Repository
public class DogRepository {
	

	private Map<Integer, Dog> dogs = new HashMap<>();

	public void createDog(Dog dog) {
		dogs.put(dog.getId(), dog);
		
	}

	public List<Dog> findAll() {
		
		return dogs.entrySet().stream()
							  .map(d -> d.getValue())
							  .collect(Collectors.toList());
	}
}
