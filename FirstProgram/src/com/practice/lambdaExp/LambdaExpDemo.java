package com.practice.lambdaExp;

public class LambdaExpDemo{
    public static void main(String args[]){

        InterfaceSingle ex=new Game();
        ex.test();
        InterfaceSingle.test2();
        InterfaceSingle id=(int num1,int num2)->System.out.println(num1+num2);

        id.add(27,13);

    }

}
