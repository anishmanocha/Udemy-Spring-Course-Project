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
	public String showForm(Model theModel) {
		/*Maybe I don't remember correctly, but I don't understand exactly why 
		 we create this student object and send it to view upon rendering the form*/
		
		/* I think it's saying: these form fields will represent a student object
		 on the front end, and in the next method, its binding those form fields
		 directly to the student object*/
		
		/* When we load the jsp for the first time, after the return, we will
		 call the get method associated with all attributes on this student object*/
		
		Student theStudent= new Student();
		
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	/*The purpose of this model attribute tag is to associate information that is directly
	bind backend objects via these tags.  To create objects from front end tags.*/
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		/*Now that it has been submitted, the set methods will be triggered for all
		fields on this given class, Student in this case*/
		
		
		System.out.println("The name of the student is " + student.getFirstName());
		
		System.out.println("The last name of the student is " + student.getLastName());
		
		System.out.println("The country of the student is " + student.getCountry());
		
		return "student-confirmation";
		
	}

}
