package com.te.true2java.flow.association;

import java.util.Objects;

public class Address {
	private Integer id;
	private String country;
	private String state;
	private String city;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(Integer id, String country, String state, String city) {
		super();
		this.id = id;
		this.country = country;
		this.state = state;
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, country, id, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& Objects.equals(id, other.id) && Objects.equals(state, other.state);
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", country=" + country + ", state=" + state + ", city=" + city + "]";
	}

}
