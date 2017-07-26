package com.abunko.roles;

import com.abunko.Actor;
import com.abunko.Comment;
import com.abunko.Movie;
import com.abunko.Movies;
import com.abunko.interfaces.AuthorizedRole;

import java.util.List;
import java.util.Map;

/**
 * Created by Andrew on 19.07.2017.
 */
public class User implements AuthorizedRole {
    private static int count;
    private final long userID ;
    private final String name;
    private Map<Movie,Integer> filmsThatWatched;
    private Map<Movie, Comment> commentMap;
    private List<Movie> faworiteMovies;
    private List<Actor> faworiteActors;
    private final Movies movies;

    public User(String name, Map<Movie, Integer> filmsThatWatched, List<Movie> faworiteMovies, List<Actor> faworiteActors, Movies movies) {
        this.userID = count;
        count++;
        this.name = name;
        this.filmsThatWatched = filmsThatWatched;
        this.faworiteMovies = faworiteMovies;
        this.faworiteActors = faworiteActors;
        this.movies = movies;
    }

    public void watchMovie(Movie movie) {

    }

    public void addComment(Comment comment) {

    }

    public void deleteComment(Comment comment) {

    }

    public void getRecomendation() {

    }

    public static int getCount() {
        return count;
    }

    public long getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public Map<Movie, Integer> getFilmsThatWatched() {
        return filmsThatWatched;
    }

    public Map<Movie, Comment> getCommentMap() {
        return commentMap;
    }

    public List<Movie> getFaworiteMovies() {
        return faworiteMovies;
    }

    public List<Actor> getFaworiteActors() {
        return faworiteActors;
    }

    public Movies getMovies() {
        return movies;
    }
}
