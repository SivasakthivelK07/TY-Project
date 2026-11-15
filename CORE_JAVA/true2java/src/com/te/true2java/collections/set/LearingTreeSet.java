package com.te.true2java.collections.set;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//Using Comparator interface in TreeSet it remove the dupicates if the states are different.
//For example, if the ID are different but AGE are same in then it will remove the object based on AGE.
public class LearingTreeSet {

	public static void main(String[] args) {
		// Using Labmda expression and pass through TreeSet which is accept the
		// Comparable interface
		Comparator<Employee1> naturalOrder = Comparator.naturalOrder();
		Comparator<Employee1> reverseOrder = Comparator.reverseOrder();
		Comparator<Employee1> reverseOrder2 = Collections.reverseOrder();

//		Set<Employee1> employees = new TreeSet<Employee1>(naturalOrder);
		Set<Employee1> employees = new TreeSet<Employee1>(reverseOrder);
		Set<Employee1> employees2 = new TreeSet<Employee1>(reverseOrder2);

//		Set<Employee1> employees = new TreeSet<Employee1>((e1, e2) -> e2.getAge() - e1.getAge());
		employees.add(new Employee1(1, "FN01", "LN01", LocalDate.of(2020, 7, 24), 35000f, 24));
		employees.add(new Employee1(11, "FN02", "LN02", LocalDate.of(2021, 1, 20), 250000f, 29));
		employees.add(new Employee1(15, "FN03", "LN03", LocalDate.of(2023, 5, 11), 30000f, 26));
		employees.add(new Employee1(8, "FN04", "LN05", LocalDate.of(2019, 8, 15), 50000f, 24));
		employees.add(new Employee1(9, "FN05", "LN06", LocalDate.of(2015, 2, 24), 15000f, 27));
		employees.add(new Employee1(1, "FN01", "LN01", LocalDate.of(2020, 7, 24), 35000f, 24));
		employees.add(new Employee1(10, "FN02", "LN02", LocalDate.of(2021, 1, 20), 250000f, 29));

		employees.forEach(System.out::println);
	}

}
