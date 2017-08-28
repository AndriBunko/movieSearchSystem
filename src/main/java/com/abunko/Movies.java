package com.abunko;

import com.abunko.enams.Genre;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Andrew on 19.07.2017.
 */
public class Movies {
    private final List<Movie> movies;

    public Movies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public Movies filterFilm(Predicate<Movie> predicate){
        return new Movies( movies.stream().filter(predicate).collect(Collectors.toList()));
    }

    public Movies filterFilmsByGare(Genre ... genres) {
        return new Movies(movies.stream().filter(movie -> movie.getGenres().containsAll((Arrays.asList(genres)))).collect(Collectors.toList()));
    }

    public Movies filterFilmsByActor(Actor ... actors) {
        return new Movies( movies.stream().filter(movie -> movie.getActors().getListActors().containsAll((Arrays.asList(actors)))).collect(Collectors.toList()));
    }

    public Movies filterFilmsByYear(int star, int end) {
        return new Movies(movies.stream().filter(movie -> movie.getYearRelease() >= star && movie.getYearRelease() <= end).collect(Collectors.toList()));
    }


    public Movie getMovieById(UUID uuid){
        Movie movie = null;
        for (Movie m: movies){
            if (m.getMovieId().equals(uuid))
                movie = m;
            break;
        }
        return movie;
    }

    public Actors getActorsByFilmId(UUID uuid){
        return new Actors(getMovieById(uuid).getActors().getListActors());
    }

    public Movies sortMovie(Comparator<Movie> comparator) {
        Collections.sort(movies, comparator);
        return this;
    }
}
