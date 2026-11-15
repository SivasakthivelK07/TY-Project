package com.te.true2java.funtionaInterface.comparable;

import java.util.Arrays;

public class LearnComparable {

	public static void main(String[] args) {
		Employee[] employees= { new Employee(1, "F1", "L1", 24, 30000.00f), 
				new EmployeeComparable(6, "F6", "L6", 28, 30000.88f),
				new EmployeeComparable(2, "F2", "L2", 27, 30000.45f),
				new EmployeeComparable(3, "F3", "L3", 25, 30000.24f), 
				new EmployeeComparable(5, "F5", "L5", 22, 30000.45f),
				new EmployeeComparable(4, "F4", "L4", 23, 30000.86f),
		};	
		// sort this array
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("=======================");
		System.out.println("======Sotring==========");

		Arrays.sort(employees);

		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("=======================");
	}

}
