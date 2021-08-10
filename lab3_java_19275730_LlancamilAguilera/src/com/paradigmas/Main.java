package com.paradigmas;

import com.paradigmas.TDA.Post;
import com.paradigmas.TDA.Socialnetwork;
import com.paradigmas.TDA.User;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static LocalDate today = LocalDate.now();
    static String date = today.format(DateTimeFormatter.ofPattern("dd/MMM/yy"));
    static ArrayList<Post> myTimeLine = new ArrayList<Post>();
    static ArrayList<User> myUsers = new ArrayList<User>();
    static String onlineUsers = new String();
    static Socialnetwork mySocialNetwork = new Socialnetwork(1L,date,"Kiubo",onlineUsers,myTimeLine,myUsers);
    static Scanner scanner = new Scanner(System.in);

    public static void register(){
        User newUser = null;
        while(true){
            System.out.println("Please input your username:");
            String username = scanner.next();
            ArrayList<Post> myPostList = new ArrayList<Post>();
            ArrayList<String> myFollowers = new ArrayList<String>();
            ArrayList<String> myFollowings = new ArrayList<String>();
            long initialId = 0L;
            newUser = new User(++initialId,username,null,myPostList,myFollowers,myFollowings);

            if(myUsers.contains(newUser)){
                System.out.println("This account already exists!\n");
            }else{
                break;
            }
        }
        System.out.println("Please input your password:");
        String password = scanner.next();
        newUser.setPassword(password);
        myUsers.add(newUser);
        mySocialNetwork.setUserList(myUsers);
        System.out.println("Account registration success!\n");
    }


    public static void loginUser(){
        System.out.println("Username:");
        String username2 = scanner.next();
        System.out.println("Password:");
        String password2 = scanner.next();
        boolean isLogin = false;
        Iterator it = myUsers.iterator();
        while(it.hasNext()){
            User userToLogin = (User) it.next();
            if(userToLogin.getUserName().equals(username2) && userToLogin.getPassword().equals(password2)){
                isLogin = true;
                mySocialNetwork.setOnlineUser(username2);
                System.out.println("login successful!\n");
            }else{
                System.out.println("Login failed!\n");
            }
        }
    }

    public static void main(String[] args) {
        boolean menu = true;
        while (menu) {
            System.out.println("Welcome to Kiubo:");
            System.out.println("The chilean social network. \n");
            System.out.println(""
                    + "[1] Register. \n"
                    + "[2] Log in. \n"
                    + "[3] Post. \n"
                    + "[4] Follow. \n"
                    + "[5] Share. \n"
                    + "[6] Visualize. \n"
                    + "[7] Comment. \n"
                    + "[8] Like. \n"
                    + "[9] Exit. \n"
            );
            Scanner input = new Scanner(System.in);
            System.out.println("Choose an option: ");
            try {
                var opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        register();
                        break;

                    case 2:
                        loginUser();
                        break;

                    case 3:
                        //Se ejecuta si el usuario tiene sesión activa.
                        System.out.println("Code to make a Post.");
                        mySocialNetwork.addPost(mySocialNetwork);
                        break;

                    case 4:
                        //Se ejecuta si el usuario tiene sesión activa.
                        System.out.println("Code to make a Follow.");
                        break;

                    case 5:
                        //Se ejecuta si el usuario tiene sesión activa.
                        System.out.println("Code to make a Share.");
                        break;

                    case 6:
                        System.out.println("Social network as a String: \n" + mySocialNetwork.toString());
                        break;

                    case 7:
                        //Se ejecuta si el usuario tiene sesión activa.
                        System.out.println("Code to make a comment to a post.");
                        break;
                    case 8:
                        //Se ejecuta si el usuario tiene sesión activa.
                        System.out.println("Code to give a like a post.");
                        break;

                    case 9:
                        menu = false;
                        System.out.println("Bye!");
                        break;

                    default:
                        System.out.println("System error.");

                }

            } catch (Exception e) {
                System.out.println("Invalid option, please try again");
            }
        }
    }
}
