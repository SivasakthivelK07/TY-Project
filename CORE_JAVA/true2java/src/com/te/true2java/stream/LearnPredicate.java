package com.te.true2java.stream;

import java.time.LocalDate;
import java.util.function.Predicate;

public class LearnPredicate {

	public static void main(String[] args) {
		Employee employees = new Employee(11, "FN02", "LN02", LocalDate.of(2021, 1, 20), 250000f, 14);

		Predicate<Employee> predicate = t -> t.getAge() >= 18;
		if(predicate.test(employees)) {
			System.out.println("Employee eligible to work here");
		}else {
			System.out.println("Employee age is below 18");
		}
	}

}
