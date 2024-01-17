package com.practice.recursion;

public class RevNum {
    public static void main(String[] args) {
        System.out.println(rev(1234));
    }
//    static int rev(int n){
//        if(n%10==n){
//            return n;
//        }
//        int rem=n%10;
//        int digit= (int) ((Math.pow(10,Math.log10(n))));
//        System.out.println(digit);
//        return helper(n,digit);
//
//
//    }
//    private static int helper(int n,int digit){
//        return digit+rev(n/10);
//    }

    static int rev(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
