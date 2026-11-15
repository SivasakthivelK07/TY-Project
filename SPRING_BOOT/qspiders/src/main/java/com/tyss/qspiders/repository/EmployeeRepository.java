package com.tyss.qspiders.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.tyss.qspiders.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

	@Modifying
	@Query(value = "UPDATE Employee e SET e.firstname = ?2, e.lastname = ?3, e.dateOfJoin = ?4, e.salary = ?5 WHERE e.employeeId = ?1 ")
	int updateEmployee(String employeeId, String firstname, String lastname, LocalDate dateOfJoin, Double salary);
}
