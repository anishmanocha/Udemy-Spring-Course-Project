package com.luv2code.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Student {
	
	public String firstName;
	
	public String lastName;
	
	public String country;
	
	public String programmingLanguage;
	
	public String[] favoriteOperatingSystems;
	
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
	
	public String getProgrammingLanguage() {
		
		return this.programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		
		this.programmingLanguage=programmingLanguage;
	}


	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}



	public String[] getFavoriteOperatingSystems() {
		return favoriteOperatingSystems;
	}



	public void setFavoriteOperatingSystems(String[] favoriteOperatingSystem) {
		this.favoriteOperatingSystems = favoriteOperatingSystem;
	}



	
	
	
	
	
	
	
	

}
