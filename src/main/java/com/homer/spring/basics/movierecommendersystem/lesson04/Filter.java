package com.homer.spring.basics.movierecommendersystem.lesson04;

public interface Filter {
	public String[] getRecommendations(String movie);
}