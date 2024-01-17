package com.practice.interfacedemo.Demo1;

public class Rectangle implements Shape,Resizable{
    int length;
    int breadth;
    int initial=5;
    int array[]=new int[initial];
    public Rectangle(){

    }

    public Rectangle(int length,int breadth){
        this.length=length;

        this.breadth=breadth;
    }

    @Override
    public int calculateArea(){
        return length*breadth;

    }
    @Override
    public void resize(int newlength,int newbreadth){
        length=newlength;
        breadth=newbreadth;



    }
    //dummy implementation
    @Override
    public void resize(double radius){
        System.out.println("It is a radius");
    }

    public static void main(String args[]){
        Rectangle rect=new Rectangle(12,11);
        System.out.println(rect.calculateArea());
        System.out.println(rect.age);
        rect.resize(21,13);
        System.out.println(rect.calculateArea());




    }


}
