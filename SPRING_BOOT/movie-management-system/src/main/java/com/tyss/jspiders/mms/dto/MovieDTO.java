package com.tyss.jspiders.mms.dto;

import java.util.List;

import com.tyss.jspiders.mms.entity.IndustryType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
public class MovieDTO {
	Integer movieId;
	String title;

	@Enumerated
	IndustryType industry;
	Integer releaseYear;
	Float imdbRating;
	String studio;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	LanguageDTO languages;

	@ManyToMany(mappedBy = "movies", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<ActorDTO> actors;

}
