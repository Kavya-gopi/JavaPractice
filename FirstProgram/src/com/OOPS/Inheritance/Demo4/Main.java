package com.OOPS.Inheritance.Demo4;

public class Main {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(4,5);
        System.out.println(r.getsArea(4,5));
        Shape s=new Rectangle();
        System.out.println(s.getsArea(44,11));

    }
}
