package com.tyss.jspiders.util;

import com.tyss.jspiders.dto.BankAccountDTO;
import com.tyss.jspiders.dto.EmployeeDTO;
import com.tyss.jspiders.entity.BankAccount;
import com.tyss.jspiders.entity.Employee;

public interface EmployeeUtils {

	 static Employee conver(EmployeeDTO dto) {	
		return Employee.builder()
				.dateOfJoin(dto.getDateOfJoin())
				.firstname(dto.getFirstname())
				.lastname(dto.getLastname())
				.dateOfJoin(dto.getDateOfJoin())
				.salary(dto.getSalary())
				.backAccount(BankAccount.builder()
						.accountno(dto.getBackAccount().getAccountno())
						.ifsc(dto.getBackAccount().getIfsc())
						.build())
			.build();
	}

	static EmployeeDTO convert(Employee employee) {
		
		return EmployeeDTO.builder()
				.dateOfJoin(employee.getDateOfJoin())
				.firstname(employee.getFirstname())
				.lastname(employee.getLastname())
				.dateOfJoin(employee.getDateOfJoin())
				.salary(employee.getSalary())
				.backAccount(BankAccountDTO.builder()
						.accountno(employee.getBackAccount().getAccountno())
						.ifsc(employee.getBackAccount().getIfsc())
						.build())
			.build();
	}

}
