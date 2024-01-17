package com.practice.interfacedemo.Demo2;

public class Hippo implements Animal{
    @Override
    public void makeNoise(){
        System.out.println("Hippo makes a noise while sleeping");
    }
    @Override
    public void roam(){
        System.out.println("It will roam here and there");
    }

    @Override
    public void eat(){
        System.out.println("It can only eat meat");
    }

    @Override
    public void sleep(){
        System.out.println("It can sleep at anytime");
    }

    public static void main(String args[]){
        Hippo hippo=new Hippo();
        hippo.eat();
        hippo.sleep();
        hippo.makeNoise();
        hippo.roam();
    }
}
