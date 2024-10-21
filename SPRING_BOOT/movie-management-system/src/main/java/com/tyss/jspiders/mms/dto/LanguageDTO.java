package com.tyss.jspiders.mms.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
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
public class LanguageDTO {
	Integer languageId;
	String name;
	
	@OneToMany(mappedBy = "languages",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	List<MovieDTO> movies;
}
