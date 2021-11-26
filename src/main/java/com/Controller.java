package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public String printhello() {
		String newLine = System.getProperty("line.separator");
		return "Welcome to CI/CD Deployment for Springboot Application" 
				.concat(newLine)
				.concat(" Developed by Samyak Jain");
		
	}
	

}
