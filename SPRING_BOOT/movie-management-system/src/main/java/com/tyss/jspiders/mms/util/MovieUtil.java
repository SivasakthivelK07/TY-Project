package com.tyss.jspiders.mms.util;

import java.util.List;

import com.tyss.jspiders.mms.dto.MovieDTO;
import com.tyss.jspiders.mms.entity.Actor;
import com.tyss.jspiders.mms.entity.Movie;

public interface MovieUtil {

	public static Movie conver(MovieDTO dto) {
	
		return Movie.builder()
				.actors(List.<Actor>of(Actor.builder().build()))
				
				
				.build();
	}
}
