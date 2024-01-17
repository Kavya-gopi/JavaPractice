package com.Fundamentals.loops;
import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str);
        String reversedWord="";
        for(int i=str.length()-1;i>=0;i--){
            reversedWord+=str.charAt(i);
        }
        System.out.println(reversedWord);

        if(str.equals(reversedWord)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
