package com.abj.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abj.spring.springjdbc.business.EmployeeBusiness;
import com.abj.spring.springjdbc.business.EmployeeBusinessImpl;
import com.abj.spring.springjdbc.dto.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	EmployeeBusiness employeeBusiness = (EmployeeBusinessImpl) context.getBean("employeeBusiness");
    	
    	//mployee emp = new Employee("11","Pavani",34);
    	//employeeBusiness.insertEmployee(emp);
    	
    	
    	employeeBusiness.EmployeeHikes();
    }
}
