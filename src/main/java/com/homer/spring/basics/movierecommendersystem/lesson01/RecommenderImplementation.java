package com.homer.spring.basics.movierecommendersystem.lesson01;

public class RecommenderImplementation {
	public String[] recommendMovies(String movie) {
		ContentBasedFilter filter = new ContentBasedFilter();

		return filter.getRecommendations("test");
	}
}