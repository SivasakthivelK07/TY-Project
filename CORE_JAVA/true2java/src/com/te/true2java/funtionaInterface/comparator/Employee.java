package com.te.true2java.funtionaInterface.comparator;

import java.util.Objects;

// 1.Using a class
// 2.Using Anonymous class

public final class Employee {
	private Integer id;
	private String firstname;
	private String lastename;
	private Integer age;
	private Float salary;

	public Employee() {
		super();
	}

	public Employee(Integer id, String firstname, String lastename, Integer age, Float salary) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastename = lastename;
		this.age = age;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastename() {
		return lastename;
	}

	public void setLastename(String lastename) {
		this.lastename = lastename;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, firstname, id, lastename, salary);
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
		return Objects.equals(age, other.age) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(id, other.id) && Objects.equals(lastename, other.lastename)
				&& Objects.equals(salary, other.salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastename=" + lastename + ", age=" + age
				+ ", salary=" + salary + "]";
	}

}
