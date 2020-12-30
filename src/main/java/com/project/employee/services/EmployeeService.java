package com.project.employee.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.project.employee.entity.Branch;
import com.project.employee.entity.Employee;
import com.project.employee.entity.Supervisor;
import com.project.employee.entity.Project;
import com.project.employee.repository.EmployeeRepository;
import com.project.employee.repository.BranchRepository;
import com.project.employee.repository.ProjectRepository;
import com.project.employee.repository.SupervisorRepository;


@Service
@Transactional
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
	private final ProjectRepository projectRepository;
	private final BranchRepository branchRepository;
	private final SupervisorRepository supervisorRepository;
	
	public EmployeeService (EmployeeRepository employeeRepository,ProjectRepository projectRepository,BranchRepository branchRepository,SupervisorRepository supervisorRepository) {
		this.employeeRepository = employeeRepository;
		this.projectRepository = projectRepository;
		this.branchRepository = branchRepository;
		this.supervisorRepository =supervisorRepository;
	}
	
	
	public List<Employee> showAllEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
	
		for(Employee employee:employeeRepository.findAll()) {
			employees.add(employee);
		}
		return employees;
	}
	public List<Supervisor> showAllSupervisors(){
		List<Supervisor> supervisors = new ArrayList<Supervisor>();
	
		for(Supervisor supervisor:supervisorRepository.findAll()) {
			supervisors.add(supervisor);
		}
		return supervisors;
	}
	public List<Branch> showAllBranches(){
		List<Branch> branches = new ArrayList<Branch>();
	
		for(Branch branch:branchRepository.findAll()) {
			branches.add(branch);
		}
		return branches;
	}
	public void saveEmployee(Employee employee,int brnchId) {
		Branch branch = branchRepository.findById(brnchId).get();
		employee.setBranch(branch);
		branch.getEmployees().add(employee);
		employeeRepository.save(employee);	
		
	}
	public void saveProject(Project project) {
		projectRepository.save(project);
	}
	public void saveBranch(Branch branch) {
		branchRepository.save(branch);	
	}
	
}
