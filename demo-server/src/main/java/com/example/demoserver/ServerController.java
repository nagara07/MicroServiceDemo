package com.example.demoserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ServerController {

	@GetMapping("/greet")
	public String sayHello(){
		return "Hello";
	}
	
}
