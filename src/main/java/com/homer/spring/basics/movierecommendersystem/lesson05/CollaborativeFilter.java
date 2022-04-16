package com.homer.spring.basics.movierecommendersystem.lesson05;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Ways of choose (auto-wiring) filters (beans/objects/dependencies)
// - by Type    whether @Primary was used or not
// - by Name    variable name <> name of the implementation
//
// Note that
// - @Primary has higher priority than 'by Name'
// - @Primary would ALWAYS give ONE bean PRIORITY (by Name is flexible)
@Component
//@Primary
public class CollaborativeFilter implements Filter {
	public String[] getRecommendations(String movie) {
		// Implement logic of collaborative filter

		return new String[] {"Interstellar", "Solaris", "Gravity"};
	}
}