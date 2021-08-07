package com.paradigmas.TDA;

import java.util.Date;
import java.util.List;

public class Reaction extends Post {

    public Reaction(int postId, Date postDate, String author, String type, String content, int likes, List<Reaction> comments) {
        super(postId, postDate, author, type, content, likes, comments);
    }
}
