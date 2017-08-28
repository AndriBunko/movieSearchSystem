package com.abunko.predicates;

import com.abunko.Movie;

import java.util.function.Predicate;

/**
 * Created by Andrew on 09.08.2017.
 */
public class FilterByYear implements Predicate<Movie>{
    private final int star;
    private final int end;

    public FilterByYear(int star, int end) {
        this.star = star;
        this.end = end;
    }

    @Override
    public boolean test(Movie movie) {
        return movie.getYearRelease() > star && movie.getYearRelease() < end;
    }
}
