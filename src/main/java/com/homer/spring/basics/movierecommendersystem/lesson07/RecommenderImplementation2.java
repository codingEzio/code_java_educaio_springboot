package com.homer.spring.basics.movierecommendersystem.lesson07;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RecommenderImplementation2 {
	private Filter filter;

	@Autowired
	@Qualifier("contentBasedFilter")
	public void setFilter(Filter filter) {
		this.filter = filter;

		System.out.println("Setter method invoked...");
	}

	public String[] recommendMovies(String movie) {
		System.out.println("\n" + "Name of the filter in use: " + filter);

		return filter.getRecommendations("Interstellar");
	}
}