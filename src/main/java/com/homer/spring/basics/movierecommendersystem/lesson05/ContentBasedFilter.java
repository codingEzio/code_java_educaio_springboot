package com.homer.spring.basics.movierecommendersystem.lesson05;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
	public String[] getRecommendations(String movie) {
		// Implement logic of content based filter

		return new String[] {"Interstellar", "Solaris", "Gravity"};
	}
}