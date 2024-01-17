package com.practice.interfacedemo.Demo1;

import java.util.ArrayList;

/*Create an array of 'shape' objects and calculate the area of each shape using a loop.*/

public class Main {
    public static void main(String args[]){
        Shape[] shape=new Shape[3];
        shape[0]=new Circle();
        shape[1]=new Rectangle(23,12);
        shape[2]=new Triangle(1,3);
        for(Shape shapes:shape){
            double area=shapes.calculateArea();
            System.out.println("The area of shape is: "+area);
        }
        Shape[] shape1=new Shape[2];
        shape1[0]=new Circle();
        shape1[1]=new Rectangle(34,12);
        for(Shape shapes1:shape1){
            double area1=shapes1.calculateArea();
            System.out.println("The area of shape is: "+area1);
        }


    }
}
