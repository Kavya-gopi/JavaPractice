package com.practice.lambdaExp.Demo1;

public class AddUsingLambda{
    public static void main(String args[]){
        LambdaExpDemo1 id=(num1,num2)->System.out.println(num1+num2);
        LambdaExpDemo1 ex=new Add();
        id.sum(20,10);

    }
}
