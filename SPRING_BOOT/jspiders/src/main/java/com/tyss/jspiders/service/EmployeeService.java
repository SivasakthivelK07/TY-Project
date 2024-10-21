package com.tyss.jspiders.service;

import java.util.List;

import com.tyss.jspiders.dto.EmployeeDTO;

public interface EmployeeService {

	String saveEmployee(EmployeeDTO dto);

	EmployeeDTO getEmployeeId(String employeeId);

	boolean deleteEmployeeById(String employeeId);

	EmployeeDTO updateEmployee(String employeeId, EmployeeDTO dto);

	List<EmployeeDTO> getAllEmployee();

	boolean deleteAllEmployee();

}
