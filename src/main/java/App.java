import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */


public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //prompting for username / password
        System.out.print("What is the Username? ");
        String user = in.nextLine();

        System.out.print("What is the Password? ");
        String pw = in.nextLine();

        //simple if / else statement
        if(pw.equals("abc$123")){

            System.out.println("Welcome!");
        }else{
            System.out.println("I don't know you.");
        }

    }
}
