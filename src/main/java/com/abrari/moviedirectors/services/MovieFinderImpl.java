package com.abrari.moviedirectors.services;

import com.abrari.moviedirectors.entities.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieFinderImpl implements MovieFinder{


    @Override
    public List<Movie> findAllMovies() {

        List<Movie> movies = new ArrayList<>(){{
            add(new Movie("Foo", "Bar"));
            add(new Movie("Bar", "Baz"));
            add(new Movie("Qux", "Quux"));
            add(new Movie("Quux", "Grault"));
            add(new Movie("Grault", "Corge"));
        }};

        return movies;
    }
}
