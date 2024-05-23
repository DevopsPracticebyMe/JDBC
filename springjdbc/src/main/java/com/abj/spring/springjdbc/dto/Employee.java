package com.abj.spring.springjdbc.dto;

public class Employee {
	private String employeeId;
	private String employeeName;
	private int exp;
	
	
	public Employee(String employeeId, String employeeName, int exp) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.exp = exp;
		
		
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
}
