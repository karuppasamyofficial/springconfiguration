package com.revature.SpringBootWeb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	
	@GetMapping("/hello")
	public String sayHi()
	{
		return "Hi from Spring Rest Controller";
	}
	

}