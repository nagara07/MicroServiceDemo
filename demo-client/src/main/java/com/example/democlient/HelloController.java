package com.example.democlient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest")
public class HelloController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/hello/{username}")
	public String sayHello(@PathVariable String username){
		return restTemplate.getForObject("http://demo-server/rest/greet", String.class) + " "   +username;
	} 

}
