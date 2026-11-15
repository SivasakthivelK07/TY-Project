package com.tyss.qspiders.util;

import java.util.ArrayList;
import java.util.List;

import com.tyss.qspiders.dto.AddressDTO;
import com.tyss.qspiders.dto.EmployeeDTO;
import com.tyss.qspiders.entity.Address;
import com.tyss.qspiders.entity.BankAccount;
import com.tyss.qspiders.entity.Employee;
import com.tyss.qspiders.entity.Technology;

public interface EmployeeUtil {

	public static Employee convertEmployee(EmployeeDTO dto) {
		Employee employee = Employee.builder()
				.firstname(dto.getFirstname())
				.lastname(dto.getLastname())
				.dateOfJoin(dto.getDateOfJoin())
				.backAccount(BankAccount.builder()
						.accountno(dto.getBackAccount().getAccountno())
						.ifsc(dto.getBackAccount().getIfsc())
						.build())
				.build();
		
		//Address object
		List<Address> addresses=new ArrayList<Address>();
		
		
		for (AddressDTO dto_ : dto.getAddresses()) {
			addresses.add(Address.builder()
					.addressType(dto_.getAddressType())  
					.city(dto_.getCity())
					.country(dto_.getCountry())
					.state(dto_.getState())
					.employees(employee)
					.build());
		}
		
		employee.setAddress(addresses);
		employee.setTechnologies(new ArrayList<Technology>());
		
		return employee;
		
	}
}
