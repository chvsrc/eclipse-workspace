package com.group.MySpringBootProject1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group.MySpringBootProject1.model.Employee;
import com.group.MySpringBootProject1.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("/test")
	public String getTest() {
		return "Test success.";
	}

	@GetMapping("/getall")
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	@PostMapping("/addEmp")
	public Employee addEmp(@RequestBody Employee emp) {
		employeeRepository.save(emp);
		return emp;
	}

}