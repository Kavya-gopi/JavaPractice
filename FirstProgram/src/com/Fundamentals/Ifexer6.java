package com.Fundamentals;

/*
You are building a program to determine if a year is a leap year.Write a java program that
takes a year as input and checks if it is a leap year.If the year is divisible by 4 but not divisible by 100,or if it is divisible by 400,then it is a leap year
Display the appropriate message accordingly.
 */
import java.util.*;
public class Ifexer6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(((year%4==0)
           && (year%100!=0))
               || (year%400==0))
                    System.out.println("leap year");

        else{
                    System.out.println("not a leap year");
                }

    }
}
