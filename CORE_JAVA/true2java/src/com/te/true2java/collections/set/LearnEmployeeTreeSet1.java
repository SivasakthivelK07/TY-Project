package com.te.true2java.collections.set;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

// Using comparable interface in TreeSet it remove the dupicates if the states are same.
// For example, if the id are different but age are same in then it will remove the object based on AGE.
public class LearnEmployeeTreeSet1 {
	public static void main(String[] args) {
		Set<Employee1> employees = new TreeSet<Employee1>();
		employees.add(new Employee1(1, "FN01", "LN01", LocalDate.of(2020, 7, 24), 35000f, 24));
		employees.add(new Employee1(11, "FN02", "LN02", LocalDate.of(2021, 1, 20), 250000f, 29));
		employees.add(new Employee1(15, "FN03", "LN03", LocalDate.of(2023, 5, 11), 30000f, 26));
		employees.add(new Employee1(8, "FN04", "LN05", LocalDate.of(2019, 8, 15), 50000f, 24));
		employees.add(new Employee1(9, "FN05", "LN06", LocalDate.of(2015, 2, 24), 15000f, 27));
		employees.add(new Employee1(1, "FN01", "LN01", LocalDate.of(2020, 7, 24), 35000f, 24));
		employees.add(new Employee1(11, "FN02", "LN02", LocalDate.of(2021, 1, 20), 250000f, 29));

		employees.forEach(System.out::println);
	}
}
