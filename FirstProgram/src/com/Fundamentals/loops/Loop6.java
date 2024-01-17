package com.Fundamentals.loops;
/*
6. Write a program to print the Fibonacci series up to a given number using a for loop.

 */
import java.util.Scanner;
public class Loop6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        //int temp=a+b;
        int count=10;
        System.out.print(a+" "+b);
        for(int j=2;j<count;++j){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }


    }
}
