package com.homer.spring.basics.movierecommendersystem.lesson02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		RecommenderImplementation recommender = new RecommenderImplementation();
		String[] result = recommender.recommendMovies("test");

		System.out.println(Arrays.toString(result));
	}

}