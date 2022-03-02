package com.exwebsite.example.domain;

public class Dog {
	
	private Integer id;
	private String breed;
	private Boolean easyToMaintain;
	
	public Dog(Integer id, String breed, Boolean easyToMaintain) {
		this.id = id;
		this.breed = breed;
		this.easyToMaintain = easyToMaintain;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Boolean getEasyToMaintain() {
		return easyToMaintain;
	}
	public void setEasyToMaintain(Boolean easyToMaintain) {
		this.easyToMaintain = easyToMaintain;
	}
	@Override
	public String toString() {
		return "Dog [id=" + id + ", breed=" + breed + ", easyToMaintain=" + easyToMaintain + "]";
	}
	
	
	
}
