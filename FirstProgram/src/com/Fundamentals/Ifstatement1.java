package com.Fundamentals;
/*You are building a quiz application. Write a java program that asks the user
to enter their age. if the age is less than 18,display a message "You are nit eligible to participate
in the quiz." Otherwise, display a message "Welcome to the quiz."
 */
import java.util.Scanner;
public class Ifstatement1{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        if(age>=18)
            System.out.println("Welcome to the quiz");
        else
            System.out.println("You are not eligible to participate in the quiz");
    }
}