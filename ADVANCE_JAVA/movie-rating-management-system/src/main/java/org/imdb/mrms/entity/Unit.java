package org.imdb.mrms.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Unit {
	Billion("Billion"), Million("Million"), Thousand("Thousand");
	
	private String unitType;
	
}
