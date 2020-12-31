package com.project.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.project.employee.dto.EmployeeDto;
import com.project.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	  @Query("SELECT new com.project.employee.dto.EmployeeDto(e.id, e.firstName,e.lastName,ec.address,ec.email,ec.telephone,p.project_name)"
	  		+ "FROM Employee e INNER JOIN e.employeeContact ec INNER JOIN e.project p")
	  List<EmployeeDto> findAllEmployees();
}
