package com.te.true2dsa.stream;

import java.util.Objects;

public class Student {
	private String id;
	private String name;
	private String major;
	private Integer age;
	private Integer yearOfEnrollment;
	private Double gpa;
	private Integer numberOfIncompleteCource;

	public Student() {
		super();
	}

	public Student(String id, String name, String major, Integer age, Integer yearOfEnrollment, Double gpa,
			Integer numberOfIncompleteCource) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.age = age;
		this.yearOfEnrollment = yearOfEnrollment;
		this.gpa = gpa;
		this.numberOfIncompleteCource = numberOfIncompleteCource;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getYearOfEnrollment() {
		return yearOfEnrollment;
	}

	public void setYearOfEnrollment(Integer yearOfEnrollment) {
		this.yearOfEnrollment = yearOfEnrollment;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public Integer getNumberOfIncompleteCource() {
		return numberOfIncompleteCource;
	}

	public void setNumberOfIncompleteCource(Integer numberOfIncompleteCource) {
		this.numberOfIncompleteCource = numberOfIncompleteCource;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, gpa, id, major, name, numberOfIncompleteCource, yearOfEnrollment);
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
		return Objects.equals(age, other.age) && Objects.equals(gpa, other.gpa) && Objects.equals(id, other.id)
				&& Objects.equals(major, other.major) && Objects.equals(name, other.name)
				&& Objects.equals(numberOfIncompleteCource, other.numberOfIncompleteCource)
				&& Objects.equals(yearOfEnrollment, other.yearOfEnrollment);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + ", age=" + age + ", yearOfEnrollment="
				+ yearOfEnrollment + ", gpa=" + gpa + ", numberOfIncompleteCource=" + numberOfIncompleteCource + "]";
	}

	
}
