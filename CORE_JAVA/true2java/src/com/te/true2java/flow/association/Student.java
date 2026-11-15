package com.te.true2java.flow.association;

import java.time.LocalDate;
import java.util.Objects;

//Variable
//No Argument Constructor 
//All Argument Constructor
//Getter and Setter
//HashCode and Equals
//ToString
//Other methods
public class Student {
	private Integer id;
	private String firstname;
	private String lastname;
	private LocalDate dateOfBirth;
	private Integer age;

	// Early/Eager Instantiation
	private Address address = new Address();

	public Student() {
		super();
	}

	public Student(Integer id, String firstname, String lastname, LocalDate dateOfBirth, Integer age) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	// Late/Lazy instantiation
	public void setAddress(Address address) {
		this.address = address;
	}

	// Late/Lazy instantiation
	public void helper(Address address) {
		this.address = address;
	}

	// Late/Lazy instantiation
	public void helper() {
		this.address = new Address();
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dateOfBirth, firstname, id, lastname);
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
		return Objects.equals(age, other.age) && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(firstname, other.firstname) && Objects.equals(id, other.id)
				&& Objects.equals(lastname, other.lastname);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", dateOfBirth="
				+ dateOfBirth + ", age=" + age + "]";
	}

}
