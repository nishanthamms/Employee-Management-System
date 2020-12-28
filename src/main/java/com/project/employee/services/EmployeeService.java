package com.project.employee.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.project.employee.entity.Branch;
import com.project.employee.entity.Employee;
import com.project.employee.entity.Project;
import com.project.employee.entity.EmployeeContact;
import com.project.employee.repository.EmployeeContactRepository;
import com.project.employee.repository.EmployeeRepository;
import com.project.employee.repository.BranchRepository;
import com.project.employee.repository.ProjectRepository;



@Service
@Transactional
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
	private final EmployeeContactRepository employeeContactRepository; 
	private final ProjectRepository projectRepository;
	private final BranchRepository branchRepository;
	
	public EmployeeService (EmployeeRepository employeeRepository, EmployeeContactRepository employeeContactRepository,ProjectRepository projectRepository,BranchRepository branchRepository) {
		this.employeeRepository = employeeRepository;
		this.employeeContactRepository = employeeContactRepository;
		this.projectRepository = projectRepository;
		this.branchRepository = branchRepository;
	}
	
	
	public List<Employee> showAllEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
	
		for(Employee employee:employeeRepository.findAll()) {
			employees.add(employee);
		}
		return employees;
	}
	public List<Branch> showAllBranches(){
		List<Branch> branches = new ArrayList<Branch>();
	
		for(Branch branch:branchRepository.findAll()) {
			branches.add(branch);
		}
		return branches;
	}
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);	
		
	}
	public void saveProject(Project project) {
		projectRepository.save(project);
	}
	public void saveBranch(Branch branch) {
		branchRepository.save(branch);	
	}
	
}
