package com.Fundamentals.loops;
/*4. Write a program to find the factorial of a given number using a while loop.
*/
import java.util.Scanner;
public class Loop4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int fact=1;
        while(i>=1){
            fact=fact*i;
            i--;
        }
        System.out.println(fact);
    }
}
