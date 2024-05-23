package com.abj.spring.springjdbc.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.abj.spring.springjdbc.dao.EmployeeDao;
import com.abj.spring.springjdbc.dto.Employee;

public class EmployeeBusinessImpl implements EmployeeBusiness {
	
	private EmployeeDao employeeDao; 

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void EmployeeHikes() {
		
		//ask dao employee data
		List <Employee> employees  = employeeDao.findAllEmployees();
		//check   each employee and print hike
		if(employees!=null) {
			for( Employee employee : employees) {
				 if(employee.getExp()>15) {
					 System.out.println("employee with id"+employee.getEmployeeId()+" and name "+employee.getEmployeeName()+" with exp "+employee.getExp()+"");
				 }
				 else if(employee.getExp()>=10){
					 System.out.println("employee with id"+employee.getEmployeeId()+" and name "+employee.getEmployeeName()+" with exp "+employee.getExp()+"");
				 }
				 else if(employee.getExp()>=5) {
					 System.out.println("employee with id"+employee.getEmployeeId()+" and name "+employee.getEmployeeName()+" with exp "+employee.getExp()+"");
				 }
				 else {
					 System.out.println("employee with id"+employee.getEmployeeId()+" and name "+employee.getEmployeeName()+" with exp "+employee.getExp()+"");
				 }
			}
		}
		
	}

	
	public void insertEmployee(Employee employee) {
		 
		employeeDao.insertEmployee(employee);
		
		
	}

}
