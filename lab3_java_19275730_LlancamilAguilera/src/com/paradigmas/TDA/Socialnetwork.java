package com.paradigmas.TDA;

import java.util.List;


public class Socialnetwork {
    private static int count = 0;
    private long socialId;
    private String socialDate;
    private String socialName;
    private List<Post> timeLine;
    private List<User> userList;

    public Socialnetwork(long socialId, String socialDate, String socialName, List<Post> timeLine, List<User> userList) {
        this.socialId = socialId;
        this.socialDate = socialDate;
        this.socialName = socialName;
        this.timeLine = timeLine;
        this.userList = userList;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Socialnetwork.count = count;
    }

    public long getSocialId() {
        return socialId;
    }

    public void setSocialId(long socialId) {
        this.socialId = socialId;
    }

    public String getSocialDate() {
        return socialDate;
    }

    public void setSocialDate(String socialDate) {
        this.socialDate = socialDate;
    }

    public String getSocialName() {
        return socialName;
    }

    public void setSocialName(String socialName) {
        this.socialName = socialName;
    }

    public List<Post> getTimeLine() {
        return timeLine;
    }

    public void setTimeLine(List<Post> timeLine) {
        this.timeLine = timeLine;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Socialnetwork{" +
                "socialid=" + socialId +
                ", socialDate=" + socialDate +
                ", socialname='" + socialName + '\'' +
                ", timeline=" + timeLine +
                ", userList=" + userList +
                '}';
    }
}
