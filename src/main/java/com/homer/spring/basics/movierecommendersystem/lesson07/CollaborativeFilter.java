package com.homer.spring.basics.movierecommendersystem.lesson07;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CollabF")
public class CollaborativeFilter implements Filter {
	public String[] getRecommendations(String movie) {
		// Implement logic of collaborative filter

		return new String[] {"Interstellar", "Solaris", "Gravity"};
	}
}