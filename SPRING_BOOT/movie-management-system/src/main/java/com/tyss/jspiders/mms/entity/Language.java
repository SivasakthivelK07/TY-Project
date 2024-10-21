package com.tyss.jspiders.mms.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "languages")
public class Language {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "language_id")
	Integer languageId;
	String name;
	
	@OneToMany(mappedBy = "languages",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	List<Movie> movies;
}
