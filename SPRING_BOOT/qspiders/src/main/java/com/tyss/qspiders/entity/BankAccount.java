package com.tyss.qspiders.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
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
public class BankAccount {
	@Id
	private long accountno;
	private String ifsc;
	
	@OneToOne(
			mappedBy = "backAccount",
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
	)
	private Employee employee;
}
