package com.project.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.employee.services.EmployeeService;
import com.project.employee.entity.Employee;
import com.project.employee.entity.EmployeeContact;

@org.springframework.web.bind.annotation.RestController
public class RestEmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	

	
}