package com.abrari.moviedirectors.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Movie {
    String title;
    String director;
}
