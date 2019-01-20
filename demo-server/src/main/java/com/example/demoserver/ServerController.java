package com.example.demoserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class ServerController {

	@GetMapping("/test")
	public String sayHello(){
		return "Hii";
	}
	
}
