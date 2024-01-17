package com.practice.abstractDemo.Demo1;

public class Dog extends Animal{
    public static void main(String args[]){
        Dog d=new Dog();
        d.age=2;
        System.out.println(d.age);


    }
    @Override
    public void sound(){
        System.out.println("Cunning");
    }
}
