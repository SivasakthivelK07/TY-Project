package org.tys.jspiders.jms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
@Table(name = "addresss")
public class Address {

	@Column(name = "address_id")
	@GeneratedValue
	@Id
	private Integer addressId;
	private String city;
	private String state;
	private String nation;

	@JoinColumn(name = "employee_fk")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Employee employee;
}
