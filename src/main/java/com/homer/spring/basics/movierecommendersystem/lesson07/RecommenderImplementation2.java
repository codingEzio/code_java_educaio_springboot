package com.homer.spring.basics.movierecommendersystem.lesson07;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RecommenderImplementation2 {
	@Autowired
	@Qualifier("CollabF")
	private Filter filter;

	public String[] recommendMovies(String movie) {
		System.out.println("\n" + "Name of the filter in use: " + filter);

		return filter.getRecommendations("Interstellar");
	}
}