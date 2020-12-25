package com.project.employee.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.employee.entity.Employee;
import com.project.employee.entity.EmployeeContact;
import com.project.employee.services.EmployeeService;


@Controller
public class EmployeeController {


	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	 public String Welcome(HttpServletRequest request) {
		return "welcomepage";
	}
	
	@GetMapping("/show-employee")
	public String showAllEmployee(HttpServletRequest request) {
		request.setAttribute("employees",employeeService.showAllEmployees());
		return "userlist";
	}
	@RequestMapping("/add-employee")
	public String addEmployee(HttpServletRequest request) {
		return "addemployee";
	}
	@PostMapping("/save-employee")
	public String saveEmployee(@RequestParam String firstname,@RequestParam String lastname,@RequestParam String email,@RequestParam String telephone,@RequestParam String address) {
		Employee employee = new Employee();
		employee.setFirstName(firstname);
		employee.setLastName(lastname);
		EmployeeContact empcon  = new 	EmployeeContact();
		empcon.setEmail(email);
		empcon.setTelephone(telephone);
		empcon.setAddress(address);
		employee.setEmployeeContact(empcon);
		empcon.setEmployee(employee);
		employeeService.saveEmployee(employee);
		return "welcomepage";
	}
	/*@PostMapping("/save-employee")
	public String registerUser(@ModelAttribute Employee employee,BindingResult bindingResult,HttpServletRequest request) {
		employeeService.saveEmployee(employee);
		return "welcomepage";
	}*/
}
