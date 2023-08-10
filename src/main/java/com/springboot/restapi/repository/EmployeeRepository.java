package com.springboot.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.restapi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
