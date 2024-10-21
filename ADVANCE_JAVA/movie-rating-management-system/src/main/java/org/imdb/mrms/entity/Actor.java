package org.imdb.mrms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name = "actors")
public class Actor {
	@Column(name = "actor_id")
	@GeneratedValue
	@Id
	private Integer actorId;
	private String name;
	
	@Column(name = "birth_year")
	private Integer birthYear;
	
	@ManyToMany(mappedBy = "actors", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Movie> movies;
}
