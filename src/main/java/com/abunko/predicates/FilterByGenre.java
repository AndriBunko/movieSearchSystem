package com.abunko.predicates;

import com.abunko.Movie;
import com.abunko.enams.Genre;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Andrew on 09.08.2017.
 */
public class FilterByGenre implements Predicate<Movie>{
    private final List<Genre> genreList;

    public static Predicate<Movie> byGenres(Genre... genres) {
        return new FilterByGenre(genres);
    }

    public FilterByGenre(Genre... genres) {
        this.genreList = Arrays.asList(genres);
    }

    @Override
    public boolean test(Movie movie) {
        return movie.getGenres().containsAll(genreList);
    }
}
