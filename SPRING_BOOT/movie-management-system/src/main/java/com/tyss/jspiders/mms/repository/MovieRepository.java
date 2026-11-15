package com.tyss.jspiders.mms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.tyss.jspiders.mms.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

	//How would you construct a API to find the count of movies released each year, 
	//considering only the years with more than 2 movies, and ordering the results by release year in descending order?
	@Modifying
	@Query(value = "SELECT m FROM Movie m GROUP BY m.releaseYear HAVING COUNT(m)>2 ORDER BY m.releaseYear DESC")
	List<Movie> findMovieCountByReleaseYear();

}
