package com.Fundamentals.loops;
/*
Write a program to calculate the sum of all numbers from 1 to 100 using a
for loop.
 */
public class Loop2 {
    public static void main(String args[]){
        int sum=0;
        for(int i=1;i<=100;i++){
            sum+=i;

        }
        System.out.println(sum);
    }
}
