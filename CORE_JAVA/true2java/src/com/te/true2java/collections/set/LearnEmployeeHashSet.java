package com.te.true2java.collections.set;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LearnEmployeeHashSet {

	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee(1, "FN01", "LN01", LocalDate.of(2020, 7, 24), 35000f, 24));
		employees.add(new Employee(11, "FN02", "LN02", LocalDate.of(2021, 1, 20), 250000f, 29));
		employees.add(new Employee(15, "FN03", "LN03", LocalDate.of(2023, 5, 11), 30000f, 26));
		employees.add(new Employee(8, "FN04", "LN05", LocalDate.of(2019, 8, 15), 50000f, 24));
		employees.add(new Employee(9, "FN05", "LN06", LocalDate.of(2015, 2, 24), 15000f, 27));
		employees.add(new Employee(1, "FN01", "LN01", LocalDate.of(2020, 7, 24), 35000f, 24));
		employees.add(new Employee(11, "FN02", "LN02", LocalDate.of(2021, 1, 20), 250000f, 29));

		employees.forEach(System.out::println);

	}

}
