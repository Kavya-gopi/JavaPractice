package com.Fundamentals.loops;
/*
11. Write a program to print the multiplication table of a given number using a while loop.

 */
import java.util.Scanner;
public class Loop11 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(num+" x "+i+" = "+num*i);
            i++;
        }

    }
}
