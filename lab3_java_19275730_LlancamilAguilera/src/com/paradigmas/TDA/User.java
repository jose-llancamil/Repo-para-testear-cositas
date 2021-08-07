package com.paradigmas.TDA;

import java.util.List;

public class User {
    private static int count = 0;
    private long userId;
    private String userName;
    private String password;
    private boolean loginStatus;
    private List<Post> postList;
    private List<String> followers;
    private List<String> following;

    public User(long userId, String userName, String password, boolean loginStatus, List<Post> postList, List<String> followers, List<String> following) {
        setUserId(++count);
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.loginStatus = false;
        this.postList = postList;
        this.followers = followers;
        this.following = following;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        User.count = count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    public List<String> getFollowers() {
        return followers;
    }

    public void setFollowers(List<String> followers) {
        this.followers = followers;
    }

    public List<String> getFollowing() {
        return following;
    }

    public void setFollowing(List<String> following) {
        this.following = following;
    }

    public void login() { loginStatus = true; }

    public void logout() { loginStatus = false; }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userId +
                ", username='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", loginstatus=" + loginStatus +
                ", postList=" + postList +
                ", followers=" + followers +
                ", following=" + following +
                '}';
    }
}
