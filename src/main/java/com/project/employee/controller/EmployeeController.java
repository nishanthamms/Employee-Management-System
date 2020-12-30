package com.project.employee.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.employee.entity.Branch;
import com.project.employee.entity.Employee;
import com.project.employee.entity.EmployeeContact;
import com.project.employee.entity.Supervisor;
import com.project.employee.entity.Project;
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
		request.setAttribute("branches",employeeService.showAllBranches());
		return "addemployee";
	}
	@RequestMapping("/add-newbranch")
	public String addNewBranch(HttpServletRequest request) {
		return "addnewbranch";
	}
	@GetMapping("/show-employee")
	public String showAllEmployee(HttpServletRequest request) {
		request.setAttribute("employees",employeeService.showAllEmployees());
		return "employeelist";
	}
	@GetMapping("/show-supervisor")
	public String showAllSupervisor(HttpServletRequest request) {
		request.setAttribute("supervisors",employeeService.showAllSupervisors());
		return "supervisorlist";
	}

	@PostMapping("/save-employee")
	public String saveEmployee(@RequestParam String firstname1,@RequestParam String lastname1,@RequestParam String email1,@RequestParam String telephone1,@RequestParam String address1,@RequestParam String project,
								@RequestParam String firstname2,@RequestParam String lastname2,@RequestParam String email2,@RequestParam String telephone2,@RequestParam String address2,@RequestParam int branch1,@RequestParam int branch2) {
		//Employee 01
		Employee employee1 = new Employee();
		employee1.setFirstName(firstname1);
		employee1.setLastName(lastname1);
		EmployeeContact empcon1  = new 	EmployeeContact();
		empcon1.setEmail(email1);
		empcon1.setTelephone(telephone1);
		empcon1.setAddress(address1);
		employee1.setEmployeeContact(empcon1);
		empcon1.setEmployee(employee1);
		
		//Employee 02
		Employee employee2 = new Employee();
		employee2.setFirstName(firstname2);
		employee2.setLastName(lastname2);
		EmployeeContact empcon2  = new 	EmployeeContact();
		empcon2.setEmail(email2);
		empcon2.setTelephone(telephone2);
		empcon2.setAddress(address2);
		employee2.setEmployeeContact(empcon2);
		empcon2.setEmployee(employee2);
		
		//Project
		Project projt = new Project(project);
		projt.getEmployee().add(employee1);
		projt.getEmployee().add(employee2);
		
		//branch 
		Branch brnch1 = new Branch(branch1);
		Branch brnch2 = new Branch(branch2);
		int branch1Id = brnch1.getId();
		int branch2Id = brnch2.getId();
		//services
		employeeService.saveEmployee(employee1,branch1Id);
		employeeService.saveEmployee(employee2,branch2Id);
		employeeService.saveProject(projt);
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
