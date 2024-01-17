package com.practice.interfacedemo.Demo2;

public class Lion extends Feline implements Animal{
    @Override
    public void makeNoise(){
        System.out.println("It will make a loud sound");
    }

    @Override
    public void eat(){
        System.out.println("It can only eat meat");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep ");
    }

    @Override
    public void roam() {
        System.out.println("Roam here and there");
    }
    public static void main(String[] args){
        Lion lion=new Lion();
        lion.makeNoise();
        lion.eat();
        lion.roam();
        lion.sleep();
    }
}
