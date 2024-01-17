package com.practice;

/*Create a class called "Rectangle" with attributes 'length' and 'width'. Include a method called 'calculateArea()'
that calculates and returns the area of the rectangle. Create an Object of the 'Rectangle' class and test the 'calculateArea()' method.
*/

public class Rectangle{
    private int length;
    private int width;

    public Rectangle(){
    }

    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }

    public void setLength(int length){
        this.length=length;
    }
    public int getLength(){
        return length;

    }

    public void setWidth(int width){
        this.width=width;
    }
    public int getWidth(){
        return width;

    }
    public int calculateArea(){
        return length*width;
    }


}
