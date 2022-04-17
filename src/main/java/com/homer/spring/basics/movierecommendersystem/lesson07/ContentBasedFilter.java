package com.homer.spring.basics.movierecommendersystem.lesson07;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("ContBasedF")
public class ContentBasedFilter implements Filter {
	public String[] getRecommendations(String movie) {

		return new String[] {"Interstellar", "Solaris", "Gravity"};
	}
}