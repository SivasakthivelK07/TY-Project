package com.jspiders.ems;

import com.jspiders.ems.dto.EmployeeDTO;
import com.jspiders.ems.entiry.Employee;
import com.jspiders.ems.repository.EmployeeRespository;

public class UpdateOperation {

	public static void main(String[] args) {
		EmployeeRespository employeeRespository=new EmployeeRespository();
		Employee employee =employeeRespository.updateEmployee(EmployeeDTO.builder()
				.email("e@e.com")
				.firstname("changed fn")
				.lastname("ln1")
				.build(), 1);
		System.out.println("Update employee details: "+employee);
	}

}
