package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Student {
	
	public String firstName;
	
	public String lastName;
	
	public String country;
	
	public LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		countryOptions= new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Denmark");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");
		
		System.out.println("The student has been created");
		
	}
	
	
	
	public void setFirstName(String firstName) {
		
		this.firstName= firstName;
	}
	
	public void setLastName(String lastName) {
		
		this.lastName=lastName;
	}
	
	public void setCountry(String country) {
		
		this.country=country;
	}
	
	public String getFirstName() {
		
		return this.firstName;
	}
	
	public String getLastName() {
		
		return this.lastName;
	}
	
	public String getCountry() {
		
		return this.country;
	}



	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}



	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	
	
	
	

}
