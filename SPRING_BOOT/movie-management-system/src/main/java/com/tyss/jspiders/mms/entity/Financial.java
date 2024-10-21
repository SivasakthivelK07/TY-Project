package com.tyss.jspiders.mms.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Table(name = "financials")
public class Financial {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	Integer financialId;
	Double budget;
	Double revenue;

	@Enumerated
	UnitType unit;

	@Enumerated
	CurrencyType currency;

	@JoinColumn(name = "movie_id")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Movie movies;
}
