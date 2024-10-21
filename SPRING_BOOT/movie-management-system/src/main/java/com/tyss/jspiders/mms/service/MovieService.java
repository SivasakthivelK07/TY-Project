package com.tyss.jspiders.mms.service;

import java.util.List;

import com.tyss.jspiders.mms.dto.MovieDTO;

public interface MovieService {

	List<MovieDTO> countMovie();

	List<MovieDTO> insertMovie(MovieDTO dto);
	
}
