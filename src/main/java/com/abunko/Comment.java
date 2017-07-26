package com.abunko;

/**
 * Created by Andriy on 25.07.2017.
 */
public class Comment {
    private  String coment;

    public Comment(String coment) {
        this.coment = coment;
    }

    public String getComent() {
        return coment;
    }

    @Override
    public String toString() {
        return coment;
    }
}
