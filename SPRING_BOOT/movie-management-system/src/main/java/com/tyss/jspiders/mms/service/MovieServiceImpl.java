package com.tyss.jspiders.mms.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tyss.jspiders.mms.dto.MovieDTO;
import com.tyss.jspiders.mms.entity.Movie;
import com.tyss.jspiders.mms.repository.MovieRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService {

	private final MovieRepository movieRepository;

	// How would you construct a API to find the count of movies released each year,
	// considering only the years with more than 2 movies, and ordering the results
	// by release year in descending order?
	@Transactional
	@Override
	public List<MovieDTO> countMovie() {
		List<Movie> list = movieRepository.findMovieCountByReleaseYear();
		System.err.println(list);

		List<MovieDTO> collectedData = list.stream().map(res -> {
			MovieDTO dto = new MovieDTO();
//			dto.setReleaseYear((Integer) res[0]);
			return dto;
		}).collect(Collectors.toList());
		
		return collectedData;

	}

	
	@Override
	public List<MovieDTO> insertMovie(MovieDTO dto) {
		
		
		return null;
	}

}
