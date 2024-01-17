package com.Fundamentals.loops;

/*
8. Write a program to reverse a given number using a while loop.

 */
import java.util.Scanner;
public class Loop8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=0;
        while(num>0){
            int val=num%10;
            res=res*10+val;
            num=num/10;
        }
        System.out.println(res);
    }
}
