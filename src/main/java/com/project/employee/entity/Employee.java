package com.project.employee.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="employee")
public class Employee  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@OneToOne(fetch = FetchType.LAZY , cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id")
	//@JsonIgnore
	private EmployeeContact employeeContact;


	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="branch_id",nullable=false)	
	private Branch branch;
	
	@ManyToOne(fetch = FetchType.LAZY ,cascade=CascadeType.ALL)
	@JoinColumn(name="project_id",nullable=true)	
	private Project project;
	
	public Employee() {
		
	}

	public Employee(String firstName, String lastName) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public EmployeeContact getEmployeeContact() {
		return employeeContact;
	}

	public void setEmployeeContact(EmployeeContact employeeContact) {
		this.employeeContact = employeeContact;
	}
	
	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", employeeContact="
				+ employeeContact + ", branch=" + branch + ", project=" + project + "]";
	}


	
	
	
}
