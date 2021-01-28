package com.abrari.moviedirectors.services;

import com.abrari.moviedirectors.entities.Movie;

import java.util.List;

public interface MovieFinder {

    List<Movie> findAllMovies();
}
