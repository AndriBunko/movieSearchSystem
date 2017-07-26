package com.abunko.interfaces;

import com.abunko.Comment;

/**
 * Created by Andrew on 25.07.2017.
 */
public interface AuthorizedRole extends  Role {
    public void addComment(Comment comment);
    public  void deleteComment(Comment comment);
    public void getRecomendation();

}
