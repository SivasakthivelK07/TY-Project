package org.imdb.mrms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Entity
@Table(name = "movies")
public class Movie {
	@Column(name = "movie_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer movieid;
	private String title;
	private String industry;

	@Column(name = "release_year")
	private Integer releaseYear;

	@Column(name = "imdb_rating")
	private Float imdbRating;
	private String studio;

	@JoinColumn(name = "language_fk")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Language language;

	@JoinTable(name = "movies_actors_map", 
			joinColumns = @JoinColumn(name = "movie_fk"),
			inverseJoinColumns = @JoinColumn(name = "actors_fk"))
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Actor> actors;

	@OneToOne(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Financial financial;
}
