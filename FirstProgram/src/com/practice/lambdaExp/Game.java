package com.practice.lambdaExp;

public class Game implements InterfaceSingle{
    public static void main(String args[]){
        Game gg=new Game();
        gg.add(2,3);
        gg.test();
        InterfaceSingle.test2();
    }
    @Override
    public void add(int num1,int num2){
        System.out.println(num1+num2);
    }
}
