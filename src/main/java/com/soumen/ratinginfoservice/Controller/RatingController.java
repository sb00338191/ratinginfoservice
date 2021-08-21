package com.soumen.ratinginfoservice.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumen.ratinginfoservice.model.Rating;

@RestController
public class RatingController {

	@RequestMapping(value="/ratinginfo/{movieid}")
	public Rating getRating(@PathVariable(value="movieid") int movieid) {
		return new Rating(movieid, 4);
		
	}
}
