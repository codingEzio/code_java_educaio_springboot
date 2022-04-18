package com.homer.spring.basics.movierecommendersystem.lesson07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(
				MovieRecommenderSystemApplication.class, args
		);

		// Constructor injection
		RecommenderImplementation recommender = appContext.getBean(
				RecommenderImplementation.class
		);
		String[] result = recommender.recommendMovies("test");
		System.out.println(Arrays.toString(result));

		// Setter injection
		RecommenderImplementation2 recommender2 = appContext.getBean(
				RecommenderImplementation2.class
		);
		String[] result2 = recommender.recommendMovies("test");

		System.out.println(Arrays.toString(result2));
	}

}