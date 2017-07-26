package com.abunko.roles;

import com.abunko.Actor;
import com.abunko.Movie;
import com.abunko.Movies;
import com.abunko.interfaces.Role;

import java.util.List;
import java.util.Map;

/**
 * Created by Andrew on 23.07.2017.
 */
public class Admin extends User {
    private final List<Role> roles;

    public Admin( String name, Map<Movie, Integer> filmsThatWatched, List<Movie> faworiteMovies, List<Actor> faworiteActors, List<Role> roles, Movies movies) {
        super( name, filmsThatWatched, faworiteMovies, faworiteActors, movies);
        this.roles = roles;
    }

    public void banRole(Role role) {

    }
}
