package com.homer.spring.basics.movierecommendersystem.lesson06;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
	public String[] getRecommendations(String movie) {
		// Implement logic of content based filter

		return new String[] {"Interstellar", "Solaris", "Gravity"};
	}
}