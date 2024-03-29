package com.project.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.employee.entity.Project;

@Repository
public interface ProjectRepository  extends JpaRepository<Project, Integer>{

}
