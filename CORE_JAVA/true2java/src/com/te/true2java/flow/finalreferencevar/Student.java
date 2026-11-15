package com.te.true2java.flow.finalreferencevar;

import java.util.Objects;

public class Student {
	private final String name;
	private final Integer age;
	private final String email;
	private final Address address;

	public Student(String name, Integer age, String email, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, email, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && Objects.equals(age, other.age)
				&& Objects.equals(email, other.email) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", email=" + email + ", address=" + address + "]";
	}

}
