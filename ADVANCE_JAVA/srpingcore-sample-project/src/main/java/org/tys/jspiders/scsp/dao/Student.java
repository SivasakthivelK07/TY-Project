package org.tys.jspiders.scsp.dao;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Student {
	private Integer id;
	private String name;
	private String email;
	private Cource cource;

//	public Student() {
//		super();
//	}
//
//	public Student(Integer id, String name, String email, Cource cource) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.email = email;
//		this.cource = cource;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cource getCource() {
		return cource;
	}

	public void setCource(Cource cource) {
		this.cource = cource;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", cource=" + cource + "]";
	}

}
