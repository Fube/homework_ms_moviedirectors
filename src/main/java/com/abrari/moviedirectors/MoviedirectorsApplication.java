package com.abrari.moviedirectors;

import com.abrari.moviedirectors.controllers.MovieLister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviedirectorsApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(MoviedirectorsApplication.class, args);

        MovieLister lister = context.getBean(MovieLister.class);
        lister.findByDirector("Baz").forEach(System.out::println);
    }

}
