package com.abunko.comparators;

import com.abunko.Movie;

import java.util.Comparator;

/**
 * Created by Andew on 09.08.2017.
 */
public class YearsComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getYearRelease() - o2.getYearRelease();
    }
}
