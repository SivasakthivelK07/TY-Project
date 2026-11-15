package com.tyss.ems.repository;

import java.util.Optional;

import com.tyss.ems.dto.EmployeeRegisterDTO;
import com.tyss.ems.entity.Employee;

public interface EmsRepository {

	Optional<Employee> getEmployee(String id);

	String save(Employee employee);

}
