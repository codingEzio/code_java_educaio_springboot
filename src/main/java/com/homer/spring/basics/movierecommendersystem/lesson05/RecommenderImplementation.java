package com.homer.spring.basics.movierecommendersystem.lesson05;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RecommenderImplementation {

	// Here the 'camelCaseFilter' would match the 'CamelCaseFilter' impl
	@Autowired
	private Filter collaborativeFilter;

	// Removed the bare-bone constructor (for 'Filter filter')

	// Now use 'variable name <> bean name' (by Name) to choose filters
	// Bad hidden magic for newcomers, yet simple and elegant (DRY-wise)

	public String[] recommendMovies(String movie) {
		// now the upper class determine which filters to use
		System.out.println("\n" + "Name of the filter in use: " + collaborativeFilter);

		return collaborativeFilter.getRecommendations("Interstellar");
	}
}