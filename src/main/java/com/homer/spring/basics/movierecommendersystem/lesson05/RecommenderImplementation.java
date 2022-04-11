package com.homer.spring.basics.movierecommendersystem.lesson05;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RecommenderImplementation {

	// mark Filter as one of the dependency of the RecommenderImplementation
	@Autowired
	private Filter filter;

	public RecommenderImplementation(Filter filter) {
		super();
		this.filter = filter;
	}

	public String[] recommendMovies(String movie) {
		// now the upper class determine which filters to use
		System.out.println("Name of the filter in use: " + filter + "\n");

		return filter.getRecommendations("Interstellar");
	}
}