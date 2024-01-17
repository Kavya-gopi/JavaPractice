package com.OOPS.Inheritance;

public class AnimalMain {
    public static void main(String args[]){
        Dog d1=new Dog("jothi",6,"eeee","white");
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.breed);
        System.out.println(d1.color);
        Animal d2=new Dog();
        System.out.println(d2.name);
        System.out.println(d2.age);
        System.out.println(((Dog) d2).breed);//animal is the reference type
        //and we created object for the dog and only the properties of animal
        //can only access to access the objects properties we need to caste
        //Object casting
        Animal.bark();
        Dog.bark();
        d1.bark();
        Dog d3=new Dog();
        System.out.println(d3.name);
        System.out.println(d3.age);
        System.out.println(d3.color);
        System.out.println(d3.breed);

    }
}
