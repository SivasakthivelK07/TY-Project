package com.tyss.jspiders.dto;

import java.time.LocalDate;

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
public class EmployeeDTO {
	private String employeeId;
	private String firstname;
	private String lastname;
	private LocalDate dateOfJoin;
	private Double salary;

	private BankAccountDTO backAccount;
}
