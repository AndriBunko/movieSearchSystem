package com.abunko;

import com.abunko.comparators.ProduserComparator;
import com.abunko.comparators.YearsComparator;
import com.abunko.enams.Genre;
import com.abunko.predicates.FilterByGenre;
import com.abunko.predicates.FilterByYear;

import java.util.ArrayList;

import static com.abunko.predicates.FilterByGenre.byGenres;

/**
 * Created by Andrew on 09.08.2017.
 */
public class Runer {
    public static void main(String[] args) {
        Movies movies = new Movies(new ArrayList<>());
        movies.filterFilm(new FilterByGenre(Genre.ACTHION));
        movies.filterFilm(new FilterByYear(2133, 1341));
        movies.filterFilm(movie -> movie.getYearRelease()<2017);
        movies.filterFilm(byGenres(Genre.ACTHION));

        movies.sortMovie(new YearsComparator());
        movies.sortMovie(new ProduserComparator());
    }
}
