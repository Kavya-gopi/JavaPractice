package com.practice.abstractDemo.Demo1.Demo2;


/*
Create an abstract method called "Shape" with an abstract method called "calculateArea".
Create three subclasses,"Rectangle","Circle", and "Triangle", that extends the "Shape" class.
Implement the "calculateArea" method in each subclass to calculate the area of the respective shape.
*/

public abstract class Shape{

    private int length;

    private int breadth;

    public void setLength(int length){

        this.length=length;
    }

    public int getLength(){

        return this.length;
    }
    public void setBreadth(int breadth){

        this.breadth=breadth;
    }

    public int getBreadth(){

        return this.breadth;
    }

    public abstract double calculateArea();




}

