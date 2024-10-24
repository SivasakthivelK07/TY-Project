package com.te.true2java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PipeLine {
	static class Employee {
		private Integer id;
		private String firstName;
		private Float salary;
		private Integer age;
		private Integer experience;

		public Employee() {
			super();

		}

		public Employee(Integer id, String firstName, Float salary, Integer age, Integer experience) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.salary = salary;
			this.age = age;
			this.experience = experience;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public Float getSalary() {
			return salary;
		}

		public void setSalary(Float salary) {
			this.salary = salary;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public Integer getExperience() {
			return experience;
		}

		public void setExperience(Integer experience) {
			this.experience = experience;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", salary=" + salary + ", age=" + age
					+ ", experience=" + experience + "]";
		}

	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<PipeLine.Employee>();
		employees.add(new Employee(1, "Name1", 25000f, 25, 2));
		employees.add(new Employee(2, "Name2", 50000f, 40, 7));
		employees.add(new Employee(3, "Name3", 27000f, 26, 3));
		employees.add(new Employee(4, "Name4", 30000f, 27, 5));
		employees.add(new Employee(5, "Name5", 20000f, 23, 1));

		System.out.println("========Before=======");
		employees.forEach(System.out::println);

		employees.stream().forEach(e -> {
			if (e.getExperience() >= 5) {
				e.setSalary(e.getSalary() * 1.25f);
			}
		});
		
		List<Float> collect = employees.stream()
				.filter(e->e.getExperience()>=5)
				.map(e->e.getSalary()*1.25f).collect(Collectors.toList());
		

		System.out.println("\n========After=======");
		collect.forEach(System.out::println);
//		employees.forEach(System.out::println);

	}

}
