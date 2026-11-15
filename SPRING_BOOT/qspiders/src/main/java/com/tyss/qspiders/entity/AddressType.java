package com.tyss.qspiders.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AddressType {
	PERMENENT("Permenent"), TEMPORARY("Temporary");
	
	private String addressType;
}
