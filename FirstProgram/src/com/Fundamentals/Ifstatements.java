package com.Fundamentals;
import java.util.*;
public class Ifstatements {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number :");
        int a=scanner.nextInt();
        if(a>0){
            System.out.println("The number is positive");
        }
        else if(a<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The given value is zero");
        }

    }
}
