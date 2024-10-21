package com.jspiders.ems;

import com.jspiders.ems.repository.EmployeeRespository;

public class DeleteOperation {

	public static void main(String[] args) {
		EmployeeRespository employeeRespository=new EmployeeRespository();
		boolean delete=employeeRespository.deleteEmployee(1);
		System.out.println("is deleted ? "+delete);
	}

}
