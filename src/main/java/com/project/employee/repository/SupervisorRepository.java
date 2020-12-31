package com.project.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.employee.dto.SupervisorDto;
import com.project.employee.entity.Supervisor;

@Repository
public interface SupervisorRepository extends JpaRepository<Supervisor, Integer>{


	  @Query("SELECT new com.project.employee.dto.SupervisorDto(s.name,b.name,b.region)"
	  		+ "FROM Supervisor s INNER JOIN s.branches b")
	  List<SupervisorDto> findAllSupervisors();
}
