package com.tyss.jspiders.mms.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.jspiders.mms.dto.ActorDTO;
import com.tyss.jspiders.mms.dto.LanguageDTO;
import com.tyss.jspiders.mms.dto.MovieDTO;
import com.tyss.jspiders.mms.response.SuccessResponse;
import com.tyss.jspiders.mms.service.MovieService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(path = "api/movie")
@RestController
public class MovieController {

	private final MovieService movieService;
	
	@GetMapping(path = "dummy")
	public Object dummy() {
		return MovieDTO.builder().languages(LanguageDTO.builder().build())
				.actors(List.<ActorDTO>of(ActorDTO.builder().build())).build();
	}

	@PostMapping(path ="")
	public ResponseEntity<SuccessResponse> insertMovie(@RequestBody MovieDTO dto) {
		
		List<MovieDTO> moviesDTO= movieService.insertMovie(dto);
		
		return ResponseEntity.<SuccessResponse>ofNullable(
				SuccessResponse.builder()
				.message("Data is Fount")
				.data(moviesDTO)
				.status(HttpStatus.OK)
				.time(LocalDate.now())
				.build()
				);
	}
	
	
	
	
	
	
	
	@GetMapping(path = "")
	public ResponseEntity<SuccessResponse> countMovie() {
		
		List<MovieDTO> moviesDTO= movieService.countMovie();
		
		return ResponseEntity.<SuccessResponse>ofNullable(
				SuccessResponse.builder()
				.message("Data is Fount")
				.data(moviesDTO)
				.status(HttpStatus.OK)
				.time(LocalDate.now())
				.build()
				);
	}
	
	
}
