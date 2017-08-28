package com.abunko;

import com.abunko.enams.Genre;
import com.abunko.interfaces.AuthorizedRole;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Andrew on 19.07.2017.
 */
public final class Movie implements Comparable<Movie> {
    private final UUID movieId;
    private final String name;
    private final int yearRelease;
    private final String producer;
    private final List<Genre> genres;
    private final Actors actors;

    private Movie(Bilder bilder) {
        this.movieId = bilder.movieId;
        this.name = bilder.name;
        this.yearRelease = bilder.yearRelease;
        this.producer = bilder.producer;
        this.actors = bilder.actors;
        this.genres = bilder.genres;

    }

    public UUID getMovieId() {
        return movieId;
    }

    public String getName() {
        return name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public String getProducer() {
        return producer;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public Actors getActors() {
        return actors;
    }

    @Override
    public int compareTo(Movie o) {
        return this.getName().compareToIgnoreCase(o.getName());
    }


    public static class Bilder{
        private final UUID movieId;
        private final String name;
        private final int yearRelease;
        private final String producer;
        private Actors actors;
        private List<Genre> genres;


        public Bilder( String name, int yearRelease, String producer) {
            this.movieId = UUID.randomUUID();
            this.name = name;
            this.yearRelease = yearRelease;
            this.producer = producer;
        }

        public Bilder acttorsInThisFilm (Actors actors){
            this.actors = actors; return this;
        }

        public Bilder genrs (List<Genre> genres){
            this.genres = genres; return this;
        }

        public Movie bild(Bilder bilder){
            return  new Movie(bilder);
        }
    }
}
