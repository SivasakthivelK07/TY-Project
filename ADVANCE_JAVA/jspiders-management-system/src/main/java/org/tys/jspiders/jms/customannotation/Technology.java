package org.tys.jspiders.jms.customannotation;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "technologys")
public class Technology {

	@Column(name = "technology_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer technologyId;

	@ManyToMany(mappedBy = "technologies", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Employee> employees;
}
