package com.group.MySpringBootProject1.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String home() {
		return "Welcome to spring boot rest services.";
	}

	@GetMapping("/test")
	public String getTest() {
		return "Testing";
	}

	@PostMapping("/test")
	public int postTest(@RequestBody int id) {
		return id;
	}

	@DeleteMapping("/test/{aid}")
	public String deleteTest(@PathVariable int id) {
		return "deleted " + id;
	}

	@PutMapping("/test")
	public int saveOrUpdateTest(@RequestBody int id) {
		return id;
	}

}