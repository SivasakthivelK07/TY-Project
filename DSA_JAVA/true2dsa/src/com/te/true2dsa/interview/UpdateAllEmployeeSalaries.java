package com.te.true2dsa.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UpdateAllEmployeeSalaries {

	static class Employee {

		Integer id;
		String name;
		Double salary;

		public Employee(Integer id, String name, Double salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getSalary() {
			return salary;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id, name, salary);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Objects.equals(id, other.id) && Objects.equals(name, other.name)
					&& Objects.equals(salary, other.salary);
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}

	}

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(10, "fn01", 5000.0), new Employee(20, "fn01", 6000.0),
				new Employee(30, "fn01", 4000.0));

		employees.forEach(System.out::println);

		employees.stream().forEach(e -> {
			e.setSalary(e.getSalary() + 1000);
		});

		System.out.println("======================");
		employees.forEach(System.out::println);
	}
}
