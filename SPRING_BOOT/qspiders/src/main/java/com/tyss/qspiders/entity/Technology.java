package com.tyss.qspiders.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Technology {

	@GeneratedValue
	@Id
	private Integer technologyId;
	private String name;
	
	
	@ManyToMany(
			mappedBy = "technologies",
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER
	)
	private List<Employee> employees;

}
