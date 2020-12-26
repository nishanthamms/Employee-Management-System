package com.project.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.employee.entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer>{

}
