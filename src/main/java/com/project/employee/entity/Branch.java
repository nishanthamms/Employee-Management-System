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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "branch")
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "region")
    private String region;
	
	public int getId() {
		return id;
	}
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "branch_supervisor",
		joinColumns = { @JoinColumn(name = "branch_id")},
		inverseJoinColumns = { @JoinColumn (name = "supervisor_id")})
	private Set<Supervisor> supervisors = new HashSet<>();
	
	public Branch() {}
	
	public Branch(String name, String region) {
		super();
		this.name = name;
		this.region = region;
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Set<Supervisor> getSupervisors() {
		return supervisors;
	}

	public void setSupervisors(Set<Supervisor> supervisors) {
		this.supervisors = supervisors;
	}

	
	
	
}
