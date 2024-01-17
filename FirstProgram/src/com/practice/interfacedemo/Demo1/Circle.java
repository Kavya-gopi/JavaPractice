package com.practice.interfacedemo.Demo1;

public class Circle implements Shape,Resizable{
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int calculateArea(){
        return (int)(2*Math.PI*radius);
    }
    //dummy implementation
    @Override
    public void resize(int breadth,int length){
        System.out.println(" ");
    }
    @Override
    public void resize(double newradius){
        radius=newradius;
    }
    public static void main(String args[]){
        Circle circle=new Circle();
        circle.setRadius(12);
        Shape c=new Circle();//c.setRadius is not allowed because
        //doesnot have any idea about the class instance variables
        circle.resize(10);


        System.out.println(circle.calculateArea());
    }
}
