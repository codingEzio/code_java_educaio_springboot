package com.homer.spring.basics.movierecommendersystem.lesson07;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RecommenderImplementation {
	private Filter filter;

	// Previously we auto-wire dependencies by adding annotations above
	// the Filter initiation. Now we directly "choose" which filters to
	// use in the implementation level (at least from my point of view).
	//
	// Refer to https://stackoverflow.com/a/51670384/6273859
	// Rule of thumb of choosing between constructor DI and setter DI
	// - Constructor DI for mandatory dependencies (when context is loaded)
	// - Setter      DI for optional dependencies (load when needed)
	@Autowired
	public RecommenderImplementation(@Qualifier("CollabF") Filter filter) {
		this.filter = filter;
		System.out.println("Constructor invoked...");
	}

	public String[] recommendMovies(String movie) {
		System.out.println("\n" + "Name of the filter in use: " + filter);

		return filter.getRecommendations("Interstellar");
	}
}