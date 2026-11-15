package com.tyss.jspiders.mms.dto;

import com.tyss.jspiders.mms.entity.CurrencyType;
import com.tyss.jspiders.mms.entity.UnitType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class FinancialDTO {
	Integer financialId;
	Double budget;
	Double revenue;

	@Enumerated
	UnitType unit;

	@Enumerated
	CurrencyType currency;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	MovieDTO movies;
}
