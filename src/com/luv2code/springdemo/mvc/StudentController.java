package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/*Instead of having to have custom methods, like we did in the jsp/controller course, notice
 that we simply need to use a controller annotation to note that we're in a controller class*/
@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String submitForm(Model theModel) {
		
		Student theStudent= new Student();
		
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	/*The purpose of this model attribute tag is to associate information that is directly
	bind backend objects via these tags.  To create objects from front end tags.*/
	@RequestMapping("/processStudent")
	public void processForm(@ModelAttribute("Student") Student student) {
		
		System.out.println("The name of the student is " + student.getFirstName());
		
		
		
	}

}
