package com.paradigmas.TDA;

import java.util.List;

public class Post {
    public static int count = 0;
    private long postId;
    private String postDate;
    private String author;
    private String type;
    private String content;
    private int likes;
    private List<Reaction> comments;

    public Post(long postId, String postDate, String author, String type, String content, int likes, List<Reaction> comments) {
        setPostId(++count);
        this.postId = postId;
        this.postDate = postDate;
        this.author = author;
        this.type = type;
        this.content = content;
        this.likes = likes;
        this.comments = comments;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Post.count = count;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Reaction> getComments() {
        return comments;
    }

    public void setComments(List<Reaction> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return
                "ID: " + postId + ", " +
                "Date: " + postDate + ", " +
                "Author: " + author + ", " +
                "Type: " + type + ", " +
                "Content: " + content + ", " +
                "Likes: " + likes + ", " +
                "Comments: " + comments + "; ";
    }
}
