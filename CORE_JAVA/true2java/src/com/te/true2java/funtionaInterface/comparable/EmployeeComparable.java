package com.te.true2java.funtionaInterface.comparable;

public class EmployeeComparable extends Employee implements Comparable<Employee> {

	public EmployeeComparable(Integer id, String firstname, String lastename, Integer age, Float salary) {
		super(id, firstname, lastename, age, salary);
	}

	//Based on ID
	/*
	 * @Override public int compareTo(Employee e) {
	 *  return this.getId() - e.getId();
	 * }
	 */
	
	//Based on String
	/*
	 * @Override public int compareTo(Employee e) { 
	 * return this.getFirstname().compareTo(e.getFirstname()); 
	 * }
	 */

	//Based on Salary
	@Override
	public int compareTo(Employee o) {
		return this.getSalary().compareTo(getSalary());
	}
	
}
