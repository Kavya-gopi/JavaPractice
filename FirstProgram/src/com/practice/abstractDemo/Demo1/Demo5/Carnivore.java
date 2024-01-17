package com.practice.abstractDemo.Demo1.Demo5;

public class Carnivore extends Animal{
    @Override
    public void eat(){
        System.out.println("It can only eat meat");
    }
    public static void main(String args[]){
        Carnivore c=new Carnivore();
        c.eat();
    }
}
