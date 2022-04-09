package com.homer.spring.basics.movierecommendersystem.lesson03;

public interface Filter {
	public String[] getRecommendations(String movie);
}