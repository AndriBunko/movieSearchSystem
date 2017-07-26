package com.abunko.roles;

import com.abunko.Movie;
import com.abunko.Movies;
import com.abunko.interfaces.Role;

/**
 * Created by Andrew on 23.07.2017.
 */
public class Guest implements Role{
    private final Movies movies;

    public Guest(Movies movies) {
        this.movies = movies;
    }

    public void watchMovie(Movie movie) {

    }
}
