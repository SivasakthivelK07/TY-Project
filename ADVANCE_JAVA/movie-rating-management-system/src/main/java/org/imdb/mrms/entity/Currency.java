package org.imdb.mrms.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Currency {
	INR("INR"), USD("USD");

	private String currencyType;
}
