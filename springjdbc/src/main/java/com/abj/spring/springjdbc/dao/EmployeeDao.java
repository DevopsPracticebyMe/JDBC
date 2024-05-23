package com.abj.spring.springjdbc.dao;

import java.util.List;

import com.abj.spring.springjdbc.dto.Employee;

public interface EmployeeDao {
	
	void insertEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	Employee getEmployeeById(String Id);
}
