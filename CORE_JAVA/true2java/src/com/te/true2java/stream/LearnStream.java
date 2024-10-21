package com.te.true2java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class LearnStream {

	private static class Boy {
		private Integer id;
		private String firstName;
		private String lastName;
		private Integer age;
		private Double salary;

		public Boy() {
			super();
		}

		public Boy(Integer id, String firstName, String lastName, Integer age, Double salary) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.salary = salary;
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

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public Double getSalary() {
			return salary;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}

		@Override
		public int hashCode() {
			return Objects.hash(age, firstName, id, lastName, salary);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Boy other = (Boy) obj;
			return Objects.equals(age, other.age) && Objects.equals(firstName, other.firstName)
					&& Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName)
					&& Objects.equals(salary, other.salary);
		}

		@Override
		public String toString() {
			return "Boy [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
					+ ", salary=" + salary + "]";
		}

	}

	public static void main(String[] args) {

		List<Boy> boys = new ArrayList<LearnStream.Boy>();
		boys.add(new Boy(1, "FN1", "LN1", 23, 25000.0));
		boys.add(new Boy(2, "FN2", "LN2", 24, 26000.0));
		boys.add(new Boy(3, "FN3", "LN3", 26, 30000.0));
		boys.add(new Boy(4, "FN4", "LN4", 22, 25000.0));
		boys.add(new Boy(5, "FN5", "LN5", 20, 21000.0));
		boys.add(new Boy(6, "FN6", "LN6", 27, 35000.0));

		System.out.println("=========== Before ===========");
		boys.forEach(System.out::println);

//		findFirst and findAny method
		Boy boyfirst = boys.stream().filter(b -> b.getSalary() > 25000).findFirst().orElse(null);
		Boy boylast = boys.stream().filter(b -> b.getSalary() > 25000).findAny().orElse(null);

		System.out.println("=========== After ===========");
		System.out.println("findFirst : " + boyfirst);
		System.out.println("findAny : " + boylast);

//		toArray method
		Boy[] array = boys.stream().toArray(Boy[]::new);
		System.out.println(Arrays.toString(array));
//		convert Array to Collection
		List<Boy> collect = Arrays.stream(array).collect(Collectors.toList());
		collect.forEach(System.out::println);

//		flatMap method
//		boys.stream().flatMap(Collection::stream).collect(Collections.);

	}

}
