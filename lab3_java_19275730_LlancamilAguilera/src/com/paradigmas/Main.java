package com.paradigmas;

import com.paradigmas.TDA.Post;
import com.paradigmas.TDA.Socialnetwork;
import com.paradigmas.TDA.User;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static LocalDate today = LocalDate.now();
    static String date = today.format(DateTimeFormatter.ofPattern("dd/MMM/yy"));
    static ArrayList<Post> myTimeLine = new ArrayList<>();
    static ArrayList<User> myUsers = new ArrayList<>();
    static String onlineUsers = "";
    static Socialnetwork mySocialNetwork = new Socialnetwork(1L,date,"Kiubo",onlineUsers,myTimeLine,myUsers);

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
                        Socialnetwork.register(mySocialNetwork);
                        break;

                    case 2:
                        Socialnetwork.login(mySocialNetwork);
                        break;

                    case 3:
                        //Se ejecuta si el usuario tiene sesión activa.
                        Socialnetwork.addPost(mySocialNetwork);
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
