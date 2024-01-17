package com.Fundamentals.loops;

/*14. Write a program to find the GCD of two numbers using a while loop.
*/

import java.util.Scanner;

public class Loop14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;

            System.out.println("The GCD is "+num1);
        }
    }
}
