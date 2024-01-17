package com.practice.lambdaExp.w3resourceslambda.Demo2;

public class Main {
    public static void main(String[] args){
        StringEmpty check=(s)->{
            if(s.equals("")){
                return true;
            }
            else{
                return false;
            }
        };
        System.out.println(check.isEmpty(""));
    }
}
