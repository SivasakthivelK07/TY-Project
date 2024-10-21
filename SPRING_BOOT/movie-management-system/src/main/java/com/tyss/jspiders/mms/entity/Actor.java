package com.tyss.jspiders.mms.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
@Table(name = "actors")
public class Actor {

	@Column(name = "actor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	Integer actorId;
	String name;
	
	@Column(name = "birth_year")
	Integer birthYear;

	@ManyToMany(mappedBy = "actors",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Movie> movies;
}
