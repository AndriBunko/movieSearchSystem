package com.abunko;

import com.abunko.enams.Genre;
import com.abunko.interfaces.AuthorizedRole;

import java.util.List;
import java.util.Map;

/**
 * Created by Andrew on 19.07.2017.
 */
public final class Movie {
    private final String name;
    private final int yearRelease;
    private final String producer;
    private final List<Genre> genres;
    private final List<Actor> actors;
    private final Map<AuthorizedRole, Comment> coments;

    public static class Bilder{
        private final String name;
        private final int yearRelease;
        private final String producer;
        private List <Actor> actors;
        private List<Genre> genres;
        private Map<AuthorizedRole, Comment> coments;

        public Bilder(String name, int yearRelease, String producer) {
            this.name = name;
            this.yearRelease = yearRelease;
            this.producer = producer;
        }

        public Bilder acttorsInThisFilm (List <Actor> actorsInThisFilm){
            this.actors = actorsInThisFilm; return this;
        }

        public Bilder genrs (List<Genre> genres){
            this.genres = genres; return this;
        }

        public Bilder comets(Map<AuthorizedRole, Comment> coments){
            this.coments = coments; return this;
        }

        public Movie bild(Bilder bilder){
            return  new Movie(this);
        }

    }

    private Movie(Bilder bilder) {
        this.name = bilder.name;
        this.yearRelease = bilder.yearRelease;
        this.producer = bilder.producer;
        this.actors = bilder.actors;
        this.genres = bilder.genres;
        this.coments = bilder.coments;

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

    public List<Actor> getActorsInThisFilm() {
        return actors;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public Map<AuthorizedRole, Comment> getComents() {
        return coments;
    }
}
