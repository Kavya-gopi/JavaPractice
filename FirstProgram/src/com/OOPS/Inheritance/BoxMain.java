package com.OOPS.Inheritance;

public class BoxMain {
    public static void main(String[] args) {
        Box box1=new Box(4,3,5);
        System.out.println(box1.l+" "+ box1.w+" "+box1.h);
        Box box2=new Box(box1);
        System.out.println(box2.l+" "+ box2.w+" "+box2.h);


    }
}
