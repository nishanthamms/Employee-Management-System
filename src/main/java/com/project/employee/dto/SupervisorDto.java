package com.project.employee.dto;

public class SupervisorDto {

	private String name;
	private String branchName;
	private String region;
	
	public SupervisorDto(String name, String branchName, String region) {
		super();
		this.name = name;
		this.branchName = branchName;
		this.region = region;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "SupervisorDto [name=" + name + ", branchName=" + branchName + ", region=" + region + "]";
	}
	
}
