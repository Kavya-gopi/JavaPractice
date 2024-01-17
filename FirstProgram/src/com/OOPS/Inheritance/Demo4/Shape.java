package com.OOPS.Inheritance.Demo4;
/*
Write a Java program to create a class called Shape with a method called getArea().
Create a subclass called Rectangle that overrides the getArea() method
to calculate the area of a rectangle.
 */

public abstract class Shape {

    private int length;
    private int breadth;
    private int height;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }




    public abstract double getsArea(int length, int breadth);
}
