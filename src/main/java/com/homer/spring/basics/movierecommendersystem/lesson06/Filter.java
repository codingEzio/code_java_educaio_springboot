package com.homer.spring.basics.movierecommendersystem.lesson06;

public interface Filter {
	public String[] getRecommendations(String movie);
}