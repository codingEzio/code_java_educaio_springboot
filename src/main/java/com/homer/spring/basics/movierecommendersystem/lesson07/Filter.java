package com.homer.spring.basics.movierecommendersystem.lesson07;

public interface Filter {
	public String[] getRecommendations(String movie);
}