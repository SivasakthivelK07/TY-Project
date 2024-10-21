package com.te.true2java.stream;

import java.util.function.Function;

public class LearnFunction {
	static class Trainee {
		String name;

		public Trainee(String name) {
			super();
			this.name = name;
		}

	}

	static class Employee {
		String name;

		public Employee(String name) {
			super();
			this.name = name;
		}

	}

	public static void main(String[] args) {
		Trainee trainee = new Trainee("Sivasakthivel");
		System.out.println("Trainee Name: " + trainee.name);

		Function<Trainee, Employee> function = t -> new Employee("Mr. " + t.name);

		Employee employee = function.apply(trainee);
		System.out.println("Employee Name: " + employee.name);
	}

}
