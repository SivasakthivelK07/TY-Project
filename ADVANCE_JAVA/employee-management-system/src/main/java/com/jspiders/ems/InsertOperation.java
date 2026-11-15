package com.jspiders.ems;

import com.jspiders.ems.entiry.Employee;
import com.jspiders.ems.repository.EmployeeRespository;

public class InsertOperation {

	public static void main(String[] args) {

		EmployeeRespository employeeRespository = new EmployeeRespository();

		Integer id = employeeRespository
				.insert(Employee.builder().email("e@e.com").firstname("fn01").lastname("ln01").build());
		System.out.println("Saved with ID: "+id);
	}

}
