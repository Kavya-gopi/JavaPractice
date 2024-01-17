package com.Fundamentals.loops;
/*
7. Write a program to find the sum of all odd numbers between 1 and 50 using a do-while loop.

 */
public class Loop7 {
    public static void main(String args[]){
        int i=1;
        int sum=0;
        do{
           if(i%2!=0){
               sum+=i;
           }
           i++;
        }while(i<=50);
        System.out.println(sum);

    }
}
