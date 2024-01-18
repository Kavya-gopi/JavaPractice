package com.practice.Practicepage;
import java.util.Scanner;

public class SuperDigit {
    static int findSuperDigit(int n) {
        int sum=0;
        if(n>=0 && n<10){
            return n;
        }
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        //System.out.println(sum);
         return findSuperDigit(sum);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(findSuperDigit(n));

    }
}
