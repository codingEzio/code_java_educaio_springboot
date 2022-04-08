package com.homer.spring.basics.movierecommendersystem.lesson02;

public class ContentBasedFilter implements Filter {
	public String[] getRecommendations(String movie) {
		// Implement logic of content based filter

		return new String[] {"Interstellar", "Solaris", "Gravity"};
	}
}