package com.practice.abstractDemo.Demo1;

public class Cat extends Animal{
    public static void main(String args[]){
        Cat c=new Cat();
        c.sound();

    }
    @Override
    public void sound(){
        System.out.println("Make a simple sound");

    }
}
