package org.tys.jspiders.jms.customannotation;

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
import org.tys.jspiders.jms.entity.Gender;

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

	@Enumerated(EnumType.STRING)
//	@GenderAnnotation(gender = Gender.FEMALE)
	private Gender gender;

	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Technology> addresses;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Technology bankAccount;
	
}
