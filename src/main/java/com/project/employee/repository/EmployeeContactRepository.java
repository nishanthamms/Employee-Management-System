package com.project.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.employee.entity.EmployeeContact;

@Repository
public interface EmployeeContactRepository extends JpaRepository<EmployeeContact, Integer>{

}
