package com.app.employee.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.employee.spring.model.Employee;
import com.app.employee.spring.repository.EmployeeRepository;

@RestController
@RequestMapping("/auth/api/")
public class AuthEmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping("/addEmployee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
}
