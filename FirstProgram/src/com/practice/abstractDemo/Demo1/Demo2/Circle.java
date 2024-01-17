package com.practice.abstractDemo.Demo1.Demo2;

public class Circle extends Shape{
    private float radius;

    public void setRadius(float radius){
        this.radius=radius;
    }
    public float getRadius(){
        return this.radius;
    }

    public static void main(String args[]){

        Circle c=new Circle();
        c.setRadius(12);
        System.out.println(c.calculateArea());
    }

    @Override

    public double calculateArea(){
        return 2*3.14*radius;
    }



}


