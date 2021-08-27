package com.soumen.ratinginfoservice.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumen.ratinginfoservice.model.Rating;
import com.soumen.ratinginfoservice.model.RatingList;

@RestController
public class RatingController {

	@RequestMapping(value="/ratinginfo/{movieid}")
	public Rating getRating(@PathVariable(value="movieid") int movieid) {
		return new Rating(movieid, 4);
		
	}
	
	@RequestMapping(value="/users/{userid}")
	public RatingList getRatings(@PathVariable(value="userid") int userid) {
	
		 RatingList ratingList= new RatingList();
		 ratingList.setRatings(Arrays.asList(new Rating(101,4),
				new Rating(102,5)));
		 return ratingList;
	}
}
