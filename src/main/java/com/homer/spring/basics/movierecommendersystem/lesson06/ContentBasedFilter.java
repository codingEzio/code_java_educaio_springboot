package com.homer.spring.basics.movierecommendersystem.lesson06;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Primary (bean marker) versus @Qualifier (bean marker + bean parent init)
// > Info
//  When they are both being used, @Primary acts like the default selection
//  when there is more than one beans of the same type AND Spring couldn't
//  determine which one to use.
// > Simply put
//  @Primary    defines the default selection when no other info is available
//  @Qualifier  tells Spring to use a specific Bean (P default VS Q specified)
@Component
@Primary
@Qualifier("ContBasedF")
public class ContentBasedFilter implements Filter {
	public String[] getRecommendations(String movie) {
		// Implement logic of content based filter

		return new String[] {"Interstellar", "Solaris", "Gravity"};
	}
}