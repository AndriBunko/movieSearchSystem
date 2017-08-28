package com.abunko;

import com.abunko.interfaces.AuthorizedRole;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrew on 31.07.2017.
 */
public class MovieSearchSystem {
    private static final MovieSearchSystem INSTANCE = new MovieSearchSystem();
    private final List<Movie> movies = readMove();
    private final List<Actors> actors = readActors();
    private final List<AuthorizedRole> authorizedRoles = readAuthorizedRoles();

    private MovieSearchSystem() {
    }

    public static MovieSearchSystem getInstence() {
        return INSTANCE;
    }

    private static List<Movie> readMove() {
        return new ArrayList<Movie>();
    }

    private static List<Actors> readActors() {
        return new ArrayList<Actors>();
    }

    private static List<AuthorizedRole> readAuthorizedRoles() {
        return new ArrayList<AuthorizedRole>();
    }

    public  List<AuthorizedRole> getRoles() {
        return authorizedRoles;
    }

    public List<Movie> getMovies() { return movies; }

    public List<Actors> getActors() {
        return actors;
    }
}
