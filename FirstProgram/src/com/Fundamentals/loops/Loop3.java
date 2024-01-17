package com.Fundamentals.loops;
/*
3. Write a program to print the even numbers from 1 to 20 using a do-while loop.
 */
public class Loop3 {
    public static void main(String args[]){
        int i=1;
        do{
            if(i%2==0)
                System.out.println(i);
            i++;
        }while(i<=20);
    }
}
