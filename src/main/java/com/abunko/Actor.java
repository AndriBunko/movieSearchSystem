package com.abunko;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrew on 19.07.2017.
 */
public class Actor {
    private final String name;
    private final String surname;
    private List<Movie> filmsWithThisActor;

    public Actor(String name, String surname, List<Movie> filmsWithThisActor) {
        this.name = name;
        this.surname = surname;
        this.filmsWithThisActor = filmsWithThisActor;
    }
}
