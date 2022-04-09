package com.homer.spring.basics.movierecommendersystem.lesson02;

public interface Filter {
	public String[] getRecommendations(String movie);
}