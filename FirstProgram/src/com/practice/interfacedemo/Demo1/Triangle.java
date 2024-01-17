package com.practice.interfacedemo.Demo1;

public class Triangle implements Shape{
    private int base;
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public Triangle(){

    }
    public Triangle(int height,int base){
        this.height=height;
        this.base=base;
    }

    @Override
    public int calculateArea(){
        return (int)(0.5*base*height);
    }
}
