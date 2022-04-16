package com.homer.spring.basics.movierecommendersystem.lesson06;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RecommenderImplementation {

	// Here the 'camelCaseFilter' would match the 'CamelCaseFilter' impl
//	@Autowired
//	private Filter collaborativeFilter;

	@Autowired
	@Qualifier("CollabF")
	private Filter filter;

	// Removed the bare-bone constructor (for 'Filter filter')

	// Now use the Qualifier way (by Type)
	//  It acts like a marker (in Bean), then we call its name (init)
	//  here to call it up. I myself think this is better (much more
	//  explicit) than the 'variable name <> bean name' way.

	// Precedence (these two lines all mean the same thing)
	//  by name < by Type
	//  by name < @Primary < @Qualifier

	public String[] recommendMovies(String movie) {
		// now the upper class determine which filters to use
		System.out.println("\n" + "Name of the filter in use: " + filter);

		return filter.getRecommendations("Interstellar");
	}
}