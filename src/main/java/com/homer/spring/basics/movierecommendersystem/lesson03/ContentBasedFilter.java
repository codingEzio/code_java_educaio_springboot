package com.homer.spring.basics.movierecommendersystem.lesson03;

public class ContentBasedFilter implements Filter {
	public String[] getRecommendations(String movie) {
		// Implement logic of content based filter

		return new String[] {"Interstellar", "Solaris", "Gravity"};
	}
}