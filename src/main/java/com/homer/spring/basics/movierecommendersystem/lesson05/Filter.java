package com.homer.spring.basics.movierecommendersystem.lesson05;

public interface Filter {
	public String[] getRecommendations(String movie);
}