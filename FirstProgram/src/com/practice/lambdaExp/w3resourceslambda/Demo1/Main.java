package com.practice.lambdaExp.w3resourceslambda.Demo1;

public class Main {
    public static void main(String[] args){
        SumOfIntegers s=(a,b)->a+b;
        int add=s.sum(1,2);
        System.out.println(add);
    }
}
