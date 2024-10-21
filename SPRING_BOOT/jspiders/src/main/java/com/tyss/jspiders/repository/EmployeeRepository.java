package com.tyss.jspiders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.jspiders.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
	
}
