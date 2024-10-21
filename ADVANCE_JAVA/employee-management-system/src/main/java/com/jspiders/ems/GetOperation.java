package com.jspiders.ems;

import com.jspiders.ems.entiry.Employee;
import com.jspiders.ems.repository.EmployeeRespository;

public class GetOperation {

	public static void main(String[] args) {
		EmployeeRespository employeeRespository=new EmployeeRespository();
		Employee employee=employeeRespository.getEmployee(1);
		System.out.println("Employee data provided: "+employee);

	}

}
