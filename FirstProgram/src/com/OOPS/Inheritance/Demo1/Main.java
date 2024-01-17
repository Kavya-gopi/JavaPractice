package com.OOPS.Inheritance.Demo1;

public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat(4,"Breed");
        cat.makeSound();
        Animal cat1=new Cat();
        cat1.setLegs(4);
        cat1.setCategory("summa");
        System.out.println(cat1.getLegs());
        System.out.println(cat1.getCategory());
    }
}
