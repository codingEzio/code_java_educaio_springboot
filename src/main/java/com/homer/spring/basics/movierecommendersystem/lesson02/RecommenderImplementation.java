package com.homer.spring.basics.movierecommendersystem.lesson02;

public class RecommenderImplementation {
	private Filter filter;

	public RecommenderImplementation(Filter filter) {
		super();
		this.filter = filter;
	}

	public String[] recommendMovies(String movie) {
		// now the upper class determine which filters to use
		System.out.println("\n" + "Name of the filter in use: " + filter);

		return filter.getRecommendations("Interstellar");
	}
}