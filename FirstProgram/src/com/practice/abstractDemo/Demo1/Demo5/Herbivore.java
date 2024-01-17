package com.practice.abstractDemo.Demo1.Demo5;

public class Herbivore extends Animal{
    @Override
    public void eat(){
        System.out.println("It can only eat plants");
    }
    public static void main(String args[]){
        Herbivore herbivore=new Herbivore();
        herbivore.eat();
    }
}
