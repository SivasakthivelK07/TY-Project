package com.tyss.qspiders.service;

import com.tyss.qspiders.dto.EmployeeDTO;

public interface EmployeeService {

	String createEmployee(EmployeeDTO dto);

	EmployeeDTO updateEmployee(String employeeId, EmployeeDTO dto);

	boolean deleteAddressByAddressType(String employeeId, String tableName);

}
