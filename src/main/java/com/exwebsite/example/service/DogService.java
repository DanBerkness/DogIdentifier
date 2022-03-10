package com.exwebsite.example.service;

import java.util.List;

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
		dog.setId(id++);
		dogRepo.createDog(dog);
	}

	public List<Dog> findAll() {
		return dogRepo.findAll();
	}

	public Dog getById(Integer id) {
		return dogRepo.getById(id);
	}
}
