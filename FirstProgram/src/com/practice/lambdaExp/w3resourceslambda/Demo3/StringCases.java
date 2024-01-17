package com.practice.lambdaExp.w3resourceslambda.Demo3;
/*
Write a java Program to implement a lambda expression to covert
a list of string to uppercase and lowercase.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class StringCases {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<String>();
        for(int i=0;i<5;i++){
            arr.add(String.valueOf(sc.next()));

        }
        System.out.println(arr);
        Case c=()->{
            for(String str:arr){
                System.out.print(str.toUpperCase());
                System.out.print(" ");

            }
            for(String str1:arr){
                System.out.print(str1.toLowerCase());
                System.out.print(" ");


            }
        };
        c.convert();


    }

}
interface Case{
    public void convert();
}
