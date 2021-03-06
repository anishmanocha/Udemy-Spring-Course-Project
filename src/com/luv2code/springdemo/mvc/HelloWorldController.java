package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//Need controller method to show form
	
	@RequestMapping("/showForm") 
	public String showForm(){
		return "helloworld-form";
	}
	
	//Need controller method to process the form
	
	@RequestMapping("/processForm") 
	public String processForm(){
		return "helloworld";
	}
	
	//We're doing to create a new controller to process form data
	/*This will a particular controller, convert data being sent to upper case,
	append the information to the model.  The model will then be sent to front end.
	*/
	
	/*Notice we updated the path to a different path, so we know when we submit the
	form from the front end, it hits a different path/calls a different controller*/
	@RequestMapping("/processFormVersionTwo") 
	public String letsShoutDude(HttpServletRequest request, Model model) {
		//read request parameter from HTML form
		String theName= request.getParameter("studentName");
	
		System.out.println("The name is " + theName);
		//Convert data to upper case
		theName= theName.toUpperCase();
		
		String result= "Yo " + theName;
		
		//Append message to model
		model.addAttribute("message", result);
		
		//Render front end
		return "helloworld";
	}
	
	/* This method is similar to the one above; however, instead of accepting a form parameter via
	HTTPServletClass, we're binding using a Spring annotation*/
	
	@RequestMapping("/processFormVersionThree") 
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

		System.out.println("The name is " + theName);
		//Convert data to upper case
		theName= theName.toUpperCase();
		
		String result= "Hey from my friend " + theName;
		
		//Append message to model
		model.addAttribute("message", result);
		
		//Render front end
		return "helloworld";
	}
	
	

}
