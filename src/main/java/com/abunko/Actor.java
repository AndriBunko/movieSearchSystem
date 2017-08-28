package com.abunko;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Andrew on 19.07.2017.
 */
public class Actor {
    private final UUID actorId;
    private final String name;
    private final String surname;

    private Actor(String name, String surname, List<Movie> filmsWithThisActor) {
        actorId = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
    }

    public static Actor createActor(String name, String surname, List<Movie> filmsWithThisActor){
        return new Actor(name, surname, filmsWithThisActor);
    }
}
