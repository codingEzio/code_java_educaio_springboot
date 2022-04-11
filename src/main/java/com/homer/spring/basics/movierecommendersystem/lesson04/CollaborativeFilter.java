package com.homer.spring.basics.movierecommendersystem.lesson04;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CollaborativeFilter implements Filter {
	public String[] getRecommendations(String movie) {
		// Implement logic of collaborative filter
		
		return new String[] {"Interstellar", "Solaris", "Gravity"};
	}
}