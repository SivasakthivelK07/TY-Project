package com.tyss.jspiders.mms.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "movies")
public class Movie {

	@Column(name = "movie_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	Integer movieId;
	String title;

	@Enumerated
	IndustryType industry;
	
	@Column(name = "release_year")
	Integer releaseYear;
	
	@Column(name = "imdb_rating")
	Float imdbRating;
	String studio;

	@JoinColumn(name = "language_id")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Language languages;

	@JoinTable(name = "movie_actor",
			joinColumns = @JoinColumn(name="movie_id"),
			inverseJoinColumns = @JoinColumn(name="actor_id")
	)
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Actor> actors;

}
