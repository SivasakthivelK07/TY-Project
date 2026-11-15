package com.te.true2java.flow.oops.encapsulation;

import java.time.LocalDate;

public class EmployeeApp {
public static void main(String[] args) {
	Employee employee=new Employee();
	employee.setAge(143);
	employee.setFirstname("firstname");
	employee.setLastname("lastname");
	employee.setDateOfJoining(LocalDate.now());
	employee.setAge(24);
	employee.setSalary(650000f);
	System.out.println(employee);
}
}
