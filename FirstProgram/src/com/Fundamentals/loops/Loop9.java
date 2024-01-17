package com.Fundamentals.loops;

/*
9. Write a program to check if a number is palindrome or not using a for loop.

 */
import java.util.Scanner;
public class Loop9 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        //int n=input.nextInt();
        int num=input.nextInt();
        int res=0;
        while(num>0){
            int val=num%10;
            res=res*10+val;
            num=num/10;
        }
        System.out.println(res);
        if(num==res){
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("The given number is not palindrome");
        }

    }
}
