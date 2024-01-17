package com.practice.staticExample.static1Demo;

public class MathOperations{

    public static void main(String args[]){
        MathUtils op1=new MathUtils();
        op1.setNum1(12);
        System.out.println(op1.getNum1());
        System.out.println(MathUtils.addition(1,2));
        System.out.println(MathUtils.subtraction(23,23));
        System.out.println(MathUtils.multiplication(12,45));
        System.out.println(MathUtils.division(33,0));

        //StringUtil.setNum1(10);


    }


}
