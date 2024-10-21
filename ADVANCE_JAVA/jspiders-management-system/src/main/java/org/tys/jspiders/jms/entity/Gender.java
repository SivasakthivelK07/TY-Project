package org.tys.jspiders.jms.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Gender {
	MALE("Male"), FEMALE("Female");

	private String genderType;

}
