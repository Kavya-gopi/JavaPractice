package com.OOPS.Inheritance;

/*Create a base class called "Animal" with attributes like name and age.Then, create
a derived class called "Dog" that inherits from the Animals class and adds additional
attributes specific to a dog,like breed or color.
 */

public class Animal {
     String name;
     int age;

     static void bark(){
         System.out.println("bark content");
     }

    public Animal(){
        this.age=0;
        this.name=null;
    }

    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Animal(Animal other){
        this.name=other.name;
        this.age=other.age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }
}
