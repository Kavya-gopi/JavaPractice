package com.Fundamentals.loops;
/*
15. Write a program to calculate the factorial of a given number using a for loop.

 */
import java.util.Scanner;

public class Loop15 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int fact=1;
        for(int i=num;i>0;i--){
            fact*=i;
        }
        System.out.println("The factorial of the given num :"+fact);
    }
}
