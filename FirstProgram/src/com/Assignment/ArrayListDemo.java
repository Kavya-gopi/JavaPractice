package com.Assignment;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<String> fruits=new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        //System.out.println(fruits);
        fruits.set(1,"Strawberry");
        System.out.println(fruits);
        fruits.remove("Strawberry");
        //System.out.println(fruits);
        boolean s=fruits.contains("Strawberry");
        System.out.println(s);
        fruits.add("coconut");
        System.out.println(fruits);



    }
}
