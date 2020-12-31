package com.project.employee.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "supervisor")
public class Supervisor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "name")
    private String name;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, mappedBy = "supervisors")
	private Set<Branch> branches = new HashSet<>();
	
	public Supervisor() {
		
	}
	public Supervisor(String name) {
		super();
		this.name = name;
	}
	public Supervisor(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Branch> getBranches() {
		return branches;
	}

	public void setBranches(Set<Branch> branches) {
		this.branches = branches;
	}

	
	
	
}
