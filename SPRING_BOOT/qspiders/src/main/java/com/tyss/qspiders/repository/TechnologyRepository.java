package com.tyss.qspiders.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.tyss.qspiders.entity.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer>{

	//1. JAP Query method
	Optional<Technology> findByName(String name);

	@Modifying
	@Query(value = "DELETE FROM Technology t")
	boolean deleteTechnology();

}
