package com.luv2code.springdemo.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Student {
	
	public String firstName;
	
	public String lastName;
	
	public Student(String firstName, String lastName) {
		this.firstName= firstName;
		
		this.lastName=lastName;
		
	}
	
	public Student() {
		
		
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName= firstName;
	}
	
	public void setLastName(String lastName) {
		
		this.lastName=lastName;
	}
	
	public String getFirstName() {
		
		return this.firstName;
	}
	
	public String getLastName() {
		
		return this.lastName;
	}
	
	

}
