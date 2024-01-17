package com.practice.abstractDemo.Demo1.Demo2;

public class Rectangle extends Shape{

    private double length;
    private double breadth;

    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public static void main(String args[]){

        Rectangle rect=new Rectangle(12,34);
        System.out.println(rect.calculateArea());
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }


}
