package com.practice.abstractDemo.Demo1.Demo2;

public class Triangle extends Shape{
    private int height;

    private int base;

    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return this.height;
    }

    public void setBase(int base){
        this.base=base;
    }
    public int getBase(){
        return this.base;
    }

    public static void main(String args[]){

        Triangle t=new Triangle();
        t.setBase(12);
        t.setHeight(12);

        System.out.println(t.calculateArea());



    }

    @Override

    public double calculateArea(){

        return 0.5*height*base;

    }

}
