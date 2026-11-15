package com.te.true2dsa.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilterEmployeeBasedOnAge {

	static class Employee {

		Integer id;
		String name;
		Integer age;

		public Employee() {
			super();
		}

		public Employee(Integer id, String name, Integer age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
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

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public int hashCode() {
			return Objects.hash(age, id, name);
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
			return Objects.equals(age, other.age) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
		}

	}

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(10, "fn01", 23), new Employee(10, "fn01", 27),
				new Employee(10, "fn01", 28));

		List<Employee> list = employees.stream().filter(e -> e.getAge() > 25).toList();

		list.forEach(System.out::println);

	}

}
