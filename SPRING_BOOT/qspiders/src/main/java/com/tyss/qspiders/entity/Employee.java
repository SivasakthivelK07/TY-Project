package com.tyss.qspiders.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class Employee {

	@Id
	private String employeeId;
	private String firstname;
	private String lastname;
	private LocalDate dateOfJoin;
	private Double salary;
	
	@OneToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			orphanRemoval = true
	)
	private BankAccount backAccount;
	
	@OneToMany(
			mappedBy = "employees",
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER,
			orphanRemoval = true
	)
	private List<Address> address;
	
	@JoinTable(
			name = "map_employee_technology",
			joinColumns = @JoinColumn(name="employee_fk"),
			inverseJoinColumns = @JoinColumn(name="technology_fk")
			
			)
	@ManyToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER
	)
	private List<Technology> technologies;
}
