package com.OOPS.Inheritance;

public class Dog extends Animal{
     String breed;
     String color;

    public Dog(){
        super();
        this.breed=null;
        this.color=null;

    }
    public Dog(String name,int age,String breed,String color){
        super(name,age);
        this.breed=breed;
        this.color=color;

    }


}
