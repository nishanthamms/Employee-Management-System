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

import com.project.employee.entity.Branch;
import com.project.employee.entity.Employee;
import com.project.employee.entity.EmployeeContact;
import com.project.employee.entity.Supervisor;
import com.project.employee.services.EmployeeService;

@Controller
public class EmployeeController {


	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	 public String Welcome(HttpServletRequest request) {
		return "welcomepage";
	}
	@RequestMapping("/add-employee")
	public String addEmployee(HttpServletRequest request) {
		return "addemployee";
	}
	@RequestMapping("/add-newbranch")
	public String addNewBranch(HttpServletRequest request) {
		return "addnewbranch";
	}
	@GetMapping("/show-employee")
	public String showAllEmployee(HttpServletRequest request) {
		request.setAttribute("employees",employeeService.showAllEmployees());
		return "userlist";
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
		
		// Department department = new Department(department);
		employeeService.saveEmployee(employee);
		return "welcomepage";
	}

	@PostMapping("/save-branch")
	public String saveBranch(@RequestParam String branchname,@RequestParam String region,@RequestParam String supervisor1,@RequestParam String supervisor2) {
		
		Branch branch = new Branch(branchname,region);
		Supervisor supervisor01 = new Supervisor(supervisor1);
		Supervisor supervisor02 = new Supervisor(supervisor2);
		
		branch.getSupervisors().add(supervisor01);
		branch.getSupervisors().add(supervisor02);
		
		supervisor01.getBranches().add(branch);
		supervisor02.getBranches().add(branch);
		
		employeeService.saveBranch(branch);
		return "welcomepage";
	}
}
