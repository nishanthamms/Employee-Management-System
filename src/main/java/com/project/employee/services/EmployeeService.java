package com.project.employee.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.project.employee.dto.EmployeeDto;
import com.project.employee.dto.SupervisorDto;
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
	public List<EmployeeDto> showAllEmployees(){
		List<EmployeeDto> employees = new ArrayList<EmployeeDto>();
		
		for(EmployeeDto employee:employeeRepository.findAllEmployees()) {
			employees.add(employee);
		}
		
		return employees;
	}
	
	public List<SupervisorDto> showAllSupervisors(){
	List<SupervisorDto> supervisors = new ArrayList<SupervisorDto>();

	for(SupervisorDto supervisor:supervisorRepository.findAllSupervisors()) {
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
	public List<Supervisor> showSupervisors(){
		List<Supervisor> supervisors = new ArrayList<Supervisor>();
	
		for(Supervisor supervisor:supervisorRepository.findAll()) {
			supervisors.add(supervisor);
		}
		return supervisors;
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
	public void saveSupervisorToBranch(Branch branch,Supervisor supervisor1,Supervisor supervisor2) {
		int brnchId = branch.getId();
		int supvisor1Id = supervisor1.getId();
		int supvisor2Id = supervisor2.getId();
		
		Branch brnch = branchRepository.findById(brnchId).get();	
		Supervisor sup1 = supervisorRepository.findById(supvisor1Id).get();
		Supervisor sup2 = supervisorRepository.findById(supvisor2Id).get();

		brnch.getSupervisors().add(sup1);
		brnch.getSupervisors().add(sup2);
		
		sup1.getBranches().add(brnch);
		sup2.getBranches().add(brnch);
		branchRepository.save(brnch);	
	}
	public void saveSupervisor(Supervisor supervisor) {
		supervisorRepository.save(supervisor);	
	}
	public void saveNewBranch(Branch branch) {
		branchRepository.save(branch);	
	}
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}
	
}
