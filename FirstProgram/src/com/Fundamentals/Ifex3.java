package com.Fundamentals;
/*You are designing a login system.Write a java program that prompts the user to enter
their username and password.If the username is"admin" and the password is "password123", display a message "login successful."
Otherwise,display a message "Invalid username or password."
 */

import java.util.Scanner;

public class Ifex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your UserName: ");
        String username=scanner.nextLine();
        System.out.println(username);
        System.out.println("Enter your password: ");
        String password=scanner.nextLine();
        System.out.println(password);
        if((username.equals("admin")) && (password.equals("password123"))){
            System.out.println("login Successful");
        }
        else{
            System.out.println("Invalid username or password");
        }



    }
}
