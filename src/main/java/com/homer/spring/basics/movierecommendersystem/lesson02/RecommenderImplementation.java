package com.homer.spring.basics.movierecommendersystem.lesson02;

public class RecommenderImplementation {
	public String[] recommendMovies(String movie) {
		CollaborativeFilter filter = new CollaborativeFilter();

		return filter.getRecommendations("test");
	}
}