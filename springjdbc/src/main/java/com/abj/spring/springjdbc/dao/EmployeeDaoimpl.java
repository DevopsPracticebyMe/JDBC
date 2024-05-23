package com.abj.spring.springjdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.*;

import com.abj.spring.springjdbc.dto.Employee;

public class EmployeeDaoimpl implements EmployeeDao {
	
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public void insertEmployee(Employee employee) {
		
		
		//code to insert into database 
		String sql = "insert into employee values('"+employee.getEmployeeId()+"','"+employee.getEmployeeName()+"',"
				+ ""+employee.getExp()+")";
		
		//System.out.println("query : "+sql);
		
		jdbcTemplate.update(sql);
		
		
	}
	

	@Override
	public List<Employee> findAllEmployees() {
		
		
		
		
		return null;
	}

	@Override
	public Employee getEmployeeById(String Id) {
		
		//code to return employee id 
		
		return null;
	}

}
