package com.springboot.restapi.service;

import java.util.List;

import com.springboot.restapi.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployeeDetails();

	Employee getEmployeeById(long id);

	Employee updateEmployee(Employee employee, long id);

	void deleteEmployee(long id);
	
	//CRUD

}
