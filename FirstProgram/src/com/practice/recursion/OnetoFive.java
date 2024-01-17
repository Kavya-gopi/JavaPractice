package com.practice.recursion;

public class OnetoFive {
    public static void main(String[] args){
        fun(1);
        //funRev(5);
    }
    static void fun(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        fun(n + 1);
    }

}
