package com.abunko;

import com.abunko.enams.Genre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrew on 19.07.2017.
 */
public class Movies {
    private final ArrayList <Movie> movies;

    public Movies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}
