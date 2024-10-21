package com.te.true2java.flow.finalreferencevar;

import java.util.Objects;

public class Address {
	private String city;
	private String sate;
	private String country;

	public Address() {
		super();

	}

	public Address(String city, String sate, String country) {
		super();
		this.city = city;
		this.sate = sate;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSate() {
		return sate;
	}

	public void setSate(String sate) {
		this.sate = sate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(city, country, sate);
//	}

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
				&& Objects.equals(sate, other.sate);
	}
//
//	@Override
//	public String toString() {
//		return "Address [city=" + city + ", sate=" + sate + ", country=" + country + "]";
//	}

}
