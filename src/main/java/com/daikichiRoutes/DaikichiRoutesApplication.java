package com.daikichiRoutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class DaikichiRoutesApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
		}

	@RequestMapping("")
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping("/today")
	public String luck() {
		return "Today you will find luck in all your endeavors";
	}
	
	@RequestMapping("/tomorrow")
	public String opportunity() {
		return "Tomorrow an opportunity will arise, so be sure to be open to new ideas";
	}
	
	
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable("city") String city) {
    		return "Congratulations, you will soon travel to: " + city;
	}
	
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int number) {
    		if (number %2 == 0) {
    			return "You will take a grand journey in the near future, but be weary of tempting 					offers";
    		}
    		else {
    			return "You have enjoyed the fruits of your labor but now is a great time to spend time 				with family and friends.";
    		}
	}
	
}
		
	

