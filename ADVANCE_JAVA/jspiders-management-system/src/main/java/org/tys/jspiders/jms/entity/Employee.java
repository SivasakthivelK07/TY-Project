package org.tys.jspiders.jms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.tys.jspiders.jms.customannotation.GenderAnnotation;

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
@Table(name = "employees")
public class Employee {

	@Column(name = "employee_id")
	@GeneratedValue
	@Id
	private Integer employeeId;

	@Column(name = "first_name")
	private String firstname;

	@Column(name = "last_name")
	private String lastname;

	@Enumerated(EnumType.STRING)
//	@GenderAnnotation(gender = Gender.FEMALE)
	private Gender gender;
	private Double Salary;

	@JoinTable(name = "tech_emp_map", 
			joinColumns = @JoinColumn(name = "technology_fk"), 
			inverseJoinColumns = @JoinColumn(name = "employee_fk"))
	@ManyToMany
	private List<Technology> technologies;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Address> addresses;

	@JoinColumn(name = "bank_fk")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private BankAccount bankAccount;
	
}
