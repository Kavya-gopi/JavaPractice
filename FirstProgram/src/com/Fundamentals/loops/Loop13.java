package com.Fundamentals.loops;
/*
13. Write a program to print the pattern:
    1
    12
    123
    1234
    using a nested for loop.
 */
import java.util.Scanner;
public class Loop13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        for(int i=1;i<=rows;i++){
           // System.out.println(i);
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();



        }

    }
}
