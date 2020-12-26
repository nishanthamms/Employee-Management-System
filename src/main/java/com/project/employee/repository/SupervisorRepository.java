package com.project.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.employee.entity.Supervisor;

@Repository
public interface SupervisorRepository extends JpaRepository<Supervisor, Integer>{

}
