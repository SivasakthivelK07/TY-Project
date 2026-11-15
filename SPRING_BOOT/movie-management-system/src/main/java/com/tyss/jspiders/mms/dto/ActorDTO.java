package com.tyss.jspiders.mms.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
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
public class ActorDTO {

	Integer actorId;
	String name;
	Integer birthYear;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<MovieDTO> movies;
}
