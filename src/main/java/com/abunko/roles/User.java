package com.abunko.roles;

import com.abunko.*;
import com.abunko.interfaces.AuthorizedRole;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Andrew on 19.07.2017.
 */
public class User implements AuthorizedRole {

    private final UUID userID ;
    private final String name;
    private Movies faworiteMovies;
    private Actors faworiteActors;
    private final Movies movies;

    public User(String name, Movies faworiteMovies, Actors faworiteActors, Movies movies) {
        this.userID = UUID.randomUUID();
        this.name = name;
        this.faworiteMovies = faworiteMovies;
        this.faworiteActors = faworiteActors;
        this.movies = movies;
    }

    public void watchMovie(Movie movie) {

    }

    public void getRecomendation() {

    }

    public void addFaworiteMovies(Movie movie){
        faworiteMovies.getMovies().add(movie);
    }

    public void addFaworiteActors(Actor actor){
        faworiteActors.getListActors().add(actor);
    }

    public UUID getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public Movies getFaworiteMovies() {
        return faworiteMovies;
    }

    public Actors getFaworiteActors() {
        return faworiteActors;
    }

    public Movies getMovies() {
        return movies;
    }
}
