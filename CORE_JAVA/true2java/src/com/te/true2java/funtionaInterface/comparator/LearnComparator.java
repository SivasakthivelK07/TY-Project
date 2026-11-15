package com.te.true2java.funtionaInterface.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class LearnComparator {

	// 1.Using a class(Nested Class)
	static ComparatorOnId comparatorOnId() {
		return new ComparatorOnId();
	}

	private static class ComparatorOnId implements Comparator<Employee> {

//		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getId() - e2.getId();
		}

	}

	// 2.Using Anonymous class
	private static Comparator<Employee> comparatorOnAge = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getAge().compareTo(e2.getAge());
		}
	};

	// 3.Using Lambda expression
	private static Comparator<Employee> comparatorOnSalary = (e1, e2) -> e1.getSalary().compareTo(e2.getSalary());

	public static void main(String[] args) {
		Employee[] employees = { new Employee(1, "F1", "L1", 24, 30000.00f), new Employee(6, "F6", "L6", 28, 30000.88f),
				new Employee(2, "F2", "L2", 27, 30000.45f), new Employee(3, "F3", "L3", 25, 30000.24f),
				new Employee(5, "F5", "L5", 22, 30000.45f), new Employee(4, "F4", "L4", 23, 30000.86f), };
		System.out.println("===========Original Array============");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("===========Sotring===================");

		// using inner class
		/*
		 * ComparatorOnId learnComparator = LearnComparator.comparatorOnId();
		 * Arrays.sort(employees, learnComparator);
		 */

		// using Anonymous class
		// Lambda Expression
		String sortType = "dads";
		Comparator<Employee> comparator;
		if (sortType.equalsIgnoreCase("age")) {
			comparator = comparatorOnAge;
		} else if (sortType.equalsIgnoreCase("id")) {
			comparator = LearnComparator.comparatorOnId();
		} else {
			comparator = comparatorOnSalary;
		}
		Arrays.sort(employees, comparator);


		// Normal calling
		/* Arrays.sort(employees, new ComparatorOnId()); */

		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}
}
