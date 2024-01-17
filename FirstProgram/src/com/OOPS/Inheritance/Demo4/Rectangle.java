package com.OOPS.Inheritance.Demo4;

public class Rectangle extends Shape{

    public Rectangle(){

    }
    public Rectangle(int length,int breadth){
        super();
    }

    @Override
    public double getsArea(int length,int breadth){
        return length*breadth;
    }
}
