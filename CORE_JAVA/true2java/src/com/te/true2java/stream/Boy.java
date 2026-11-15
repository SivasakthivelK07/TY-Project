package com.te.true2java.stream;

import java.util.Objects;

public class Boy {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;

	public Boy() {
		super();

	}

	public Boy(Integer id, String firstName, String lastName, Integer age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
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

	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, id, lastName);
	}

	@Override
	public String toString() {
		return "Boy [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
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
				&& Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName);
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
