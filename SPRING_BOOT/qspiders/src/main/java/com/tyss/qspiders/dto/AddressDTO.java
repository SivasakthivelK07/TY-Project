package com.tyss.qspiders.dto;

import com.tyss.qspiders.entity.AddressType;

import jakarta.persistence.Enumerated;
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
public class AddressDTO {

	private String city;
	private String country;
	private String state;
	
	@Enumerated
	private AddressType addressType;
}
