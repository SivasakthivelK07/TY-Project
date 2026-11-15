package com.te.true2dsa.stream;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private Integer employeeId;
	private String name;
	private String department;
	private String jobTitle;
	private Integer age;
	private Integer yearsOfExprience;
	private Double salary;
	private Integer performanceRating;
	private Boolean isMarried;
	private LocalDate dateOfJoining;

	public Employee() {
		super();
	}

	public Employee(Integer employeeId, String name, String department, String jobTitle, Integer age,
			Integer yearsOfExprience, Double salary, Integer performanceRating, Boolean isMarried,
			LocalDate dateOfJoining) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
		this.jobTitle = jobTitle;
		this.age = age;
		this.yearsOfExprience = yearsOfExprience;
		this.salary = salary;
		this.performanceRating = performanceRating;
		this.isMarried = isMarried;
		this.dateOfJoining = dateOfJoining;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getYearsOfExprience() {
		return yearsOfExprience;
	}

	public void setYearsOfExprience(Integer yearsOfExprience) {
		this.yearsOfExprience = yearsOfExprience;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getPerformanceRating() {
		return performanceRating;
	}

	public void setPerformanceRating(Integer performanceRating) {
		this.performanceRating = performanceRating;
	}

	public Boolean getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(Boolean isMarried) {
		this.isMarried = isMarried;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dateOfJoining, department, employeeId, isMarried, jobTitle, name, performanceRating,
				salary, yearsOfExprience);
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
		return Objects.equals(age, other.age) && Objects.equals(dateOfJoining, other.dateOfJoining)
				&& Objects.equals(department, other.department) && Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(isMarried, other.isMarried) && Objects.equals(jobTitle, other.jobTitle)
				&& Objects.equals(name, other.name) && Objects.equals(performanceRating, other.performanceRating)
				&& Objects.equals(salary, other.salary) && Objects.equals(yearsOfExprience, other.yearsOfExprience);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", department=" + department + ", jobTitle="
				+ jobTitle + ", age=" + age + ", yearsOfExprience=" + yearsOfExprience + ", salary=" + salary
				+ ", performanceRating=" + performanceRating + ", isMarried=" + isMarried + ", dateOfJoining="
				+ dateOfJoining + "]";
	}

	
}
