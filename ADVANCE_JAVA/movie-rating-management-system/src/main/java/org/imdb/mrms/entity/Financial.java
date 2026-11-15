package org.imdb.mrms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "financials")
public class Financial {
	@Column(name = "financial_id")
	@GeneratedValue
	@Id
	private Integer financialId;
	private Double budget;
	private Double revenue;

	@Enumerated(EnumType.STRING)
	private Unit unit;

	@Enumerated(EnumType.STRING)
	private Currency currency;

	@JoinColumn(name = "movie_fk")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Movie movie;

}
