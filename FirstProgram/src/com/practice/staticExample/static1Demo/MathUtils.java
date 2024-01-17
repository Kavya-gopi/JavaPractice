package com.practice.staticExample.static1Demo;


/*Create a class called "StringUtil" with static methods for basic mathematical operations such as addition,
subtraction,multiplication and division. Test the methods by calling them in a separate class.
*/

public class MathUtils{

    private static int num1=1;
    private static int num2=2;

    public MathUtils(){}
    public MathUtils(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public  void setNum1(int num1){
        this.num1=num1;
    }
    public int getNum1(){
        return num1;

    }
    public void setNum2(int num2){
        this.num2=num2;
    }
    public int getNum2(){
        return num2;

    }

    static int addition(int num1,int num2){
        return num1+num2;
    }

    static int subtraction(int num1,int num2){
        return num2-num1;
    }

    static int multiplication(int num1,int num2){
        return num1*num2;
    }

    static int division(int num1,int num2){
        return num2/num1;
    }


}

