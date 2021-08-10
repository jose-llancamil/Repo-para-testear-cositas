package com.paradigmas.TDA;

import java.util.List;

public class Reaction extends Post{
    public Reaction(int postId, String postDate, String author, String type, String content, int likes, List<Reaction> comments) {
        super(postId, postDate, author, type, content, likes, comments);
    }
}

