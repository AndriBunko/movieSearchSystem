package com.abunko;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Andrew on 19.07.2017.
 */
public class Actors {
    private  final List <Actor> listActors;

    public Actors(List<Actor> listActors) {
        this.listActors = listActors;
    }

    public List<Actor> getListActors() {
        return listActors;
    }

    public Actors sortActors(Comparator comparator){
        return null;
    }
}
