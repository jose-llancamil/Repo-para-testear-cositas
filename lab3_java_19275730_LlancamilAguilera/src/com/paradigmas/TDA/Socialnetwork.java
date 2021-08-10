package com.paradigmas.TDA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Socialnetwork {
    private static int count = 0;
    private long socialId;
    private String socialDate;
    private String socialName;
    private String onlineUser;
    private List<Post> timeLine;
    private List<User> userList;

    public Socialnetwork(long socialId, String socialDate, String socialName,String onlineUser, List<Post> timeLine, List<User> userList) {
        this.socialId = socialId;
        this.socialDate = socialDate;
        this.socialName = socialName;
        this.onlineUser = onlineUser;
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

    public String getOnlineUser() { return onlineUser; }

    public void setOnlineUser(String onlineUser) { this.onlineUser = onlineUser; }

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

    public static void addPost(Socialnetwork socialnetwork){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please indicate the type of your publication: \n" +
                    "(Remember that only these types are supported: photo, video, url, text or audio)");
            String type = scanner.next();
            if (type.equals("photo") || type.equals("video") || type.equals("url") || type.equals("text")  || type.equals("audio")) {
                System.out.println("So, what are you gonna post? " +
                        "Please indicate the content of your post:");
                String content = scanner.next();
                long initialPostId = 0L;
                LocalDate today = LocalDate.now();
                String date = today.format(DateTimeFormatter.ofPattern("dd/MMM/yy"));
                String author = socialnetwork.getOnlineUser();
                int likes = 0;
                ArrayList<Reaction> comments = new ArrayList<Reaction>();
                Post postToAdd = new Post(initialPostId, date, author, type, content, likes, comments);
                socialnetwork.getTimeLine().add(postToAdd);
                System.out.println("Post added successfully! \n");
                for (int i = 0; i < socialnetwork.getUserList().size(); i++){

                }
            } else {
                System.out.println("Type of post invalid, try again.\n");
            }
    }

    @Override
    public String toString() {
        return "----- My Social Network ----- \n" +
                "ID: " + socialId + "\n" +
                "Date: " + socialDate + "\n" +
                "Name: " + socialName + "\n" +
                "Current Online User: " + onlineUser + "\n" +
                "Current Posts: " + timeLine + "\n" +
                "Current Users: " + userList + "\n";
    }
}
