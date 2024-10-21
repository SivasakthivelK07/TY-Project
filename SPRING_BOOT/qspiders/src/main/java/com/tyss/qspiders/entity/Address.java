package com.tyss.qspiders.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
@Entity
public class Address {

	@GeneratedValue
	@Id
	private Integer addressId;
	private String city;
	private String state;
	private String country;
	
	@Enumerated
	private AddressType addressType;
	
	@JoinColumn(name = "employee_fk")
	@ManyToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER
	)
	private Employee employees;
	
}
