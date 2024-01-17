package com.practice.recursion;

public class SumOfDigits {
    public static void main(String[] args){
       int sum=sum(1342);
       System.out.println(sum);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }
}
