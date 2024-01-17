package com.OOPS.Inheritance.Demo1;


public class Cat extends Animal{

    public Cat(){}

    public Cat(int legs,String category){
        super();
    }



    @Override

    public void makeSound(){
        System.out.println("Meaohwww");
    }


}
