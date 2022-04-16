package com.homer.spring.basics.movierecommendersystem.lesson06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

// Other than using @Component to mark Beans, @Autowired to mark dependencies, we would
// also need @ComponentScan to tell where those Beans are (so Spring could find them).
// @ComponentScan tells Spring to scan a specific package and all of its sub-packages.
//
// The @SpringBootApplication is equivalent to the three annotations
//  @Configuration              declares a class as the source for bean definitions
//  @EnableAutoConfiguration    allows the application to add beans using classpath definitions
//  @ComponentScan ⭐️⭐️⭐️       directs Spring to search for components in the path specified
@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		// Now it manages the Beans and dependencies (both were marked by annotations)
		// ApplicationContext is an interface for providing configuration info to an app
		ApplicationContext appContext = SpringApplication.run(
				MovieRecommenderSystemApplication.class, args
		);

		RecommenderImplementation recommender = appContext.getBean(
				RecommenderImplementation.class
		);

		String[] result = recommender.recommendMovies("test");

		System.out.println(Arrays.toString(result));
	}

}