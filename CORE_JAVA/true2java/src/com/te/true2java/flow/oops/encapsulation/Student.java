package com.te.true2java.flow.oops.encapsulation;

import java.util.Objects;

public class Student {
	private Integer id;
	private String firstname;
	private String lastname;
	private long contact;
	private String subject;
	private Integer age;
	private Integer mark;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String firstname, String lastname, long contact, String subject, Integer age,
			Integer mark) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
		this.subject = subject;
		this.age = age;
		this.mark = mark;
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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, contact, firstname, id, lastname, mark, subject);
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
		return Objects.equals(age, other.age) && contact == other.contact && Objects.equals(firstname, other.firstname)
				&& Objects.equals(id, other.id) && Objects.equals(lastname, other.lastname)
				&& Objects.equals(mark, other.mark) && Objects.equals(subject, other.subject);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", contact=" + contact
				+ ", subject=" + subject + ", age=" + age + ", mark=" + mark + "]";
	}

}
