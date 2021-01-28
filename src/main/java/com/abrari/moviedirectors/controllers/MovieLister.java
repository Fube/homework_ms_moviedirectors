package com.abrari.moviedirectors.controllers;
import com.abrari.moviedirectors.entities.Movie;
import com.abrari.moviedirectors.services.MovieFinder;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MovieLister {

    @Setter(onMethod = @__({@Autowired}))
    private MovieFinder movieFinder;

    public List<Movie> findByDirector(String director){
        return movieFinder.findAllMovies().stream().filter(n -> n.getDirector().equals(director)).collect(Collectors.toList());
    }
}
