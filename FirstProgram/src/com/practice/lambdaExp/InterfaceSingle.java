package com.practice.lambdaExp;

public interface InterfaceSingle {
    public void add(int num1,int num2);
     default void test(){
         System.out.println("Iam a default method");
     }
     static void test2(){
         System.out.println("Iam a static method");
     }


}
