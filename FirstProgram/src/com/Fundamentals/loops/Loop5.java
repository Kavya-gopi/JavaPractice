package com.Fundamentals.loops;
/*5. Write a program to check if a number is prime or not using a for loop.
*/
import java.util.*;
public class Loop5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=2;
        int num=sc.nextInt();
        for(c=2;c<num;c++){
            if(num%c==0){
                System.out.println("The given number is not prime");
            }
            else if(num<=0){
                System.out.println("The given number is neither prime nor composite");
            }
            else{
                System.out.println("The given number is prime");
            }

        }

    }
}
