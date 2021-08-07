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
    static Socialnetwork mySocialNetwork = new Socialnetwork(1L,date,"Kiubo",myTimeLine,myUsers);
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
            newUser = new User(++initialId,username,null,false,myPostList,myFollowers,myFollowings);

            if(myUsers.contains(newUser)){
                System.out.println("This account already exists!");
            }else{
                break;
            }
        }
        System.out.println("Please input your password:");
        String password = scanner.next();
        newUser.setPassword(password);
        myUsers.add(newUser);
        mySocialNetwork.setUserList(myUsers);
        System.out.println("Account registration success!");
        System.out.println("Current social network status: " + mySocialNetwork);
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
                userToLogin.login();
                System.out.println("login successful!");
                System.out.println("Current online user: " + username2);
            }else{
                System.out.println("Login failed!");
            }
        }
    }

    public static void main(String[] args) {
        boolean menu = true;
        while (menu) {
            //Runtime.getRuntime().exec("cls");

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
                        //Se ejecuta si el usuario tiene sesión activa.
                        System.out.println("Code to print the social network as a string.");
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
                System.out.println("ERROR");
            }
        }
    }
}
