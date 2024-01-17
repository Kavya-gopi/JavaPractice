package com.practice.recursion;

public class Fibo {
    public static void main(String[] args){
       //System.out.println(fibo(5));
        int ans = fibo(4);
        System.out.println(ans);
    }
    static int fibo(int N){
        if(N<2){
            return N;
        }
        return fibo(N-1)+fibo(N-2);
    }
}
