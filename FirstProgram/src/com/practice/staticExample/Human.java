package com.practice.staticExample;

public class Human {
    String name;
    int age;
    static long population;
    boolean married;
    int salary;

    static void greet(){
        System.out.println("Heyy all");
    }
    public Human(String name,int salary,int age,boolean married){
        this.name=name;
        this.salary=salary;
        this.age=age;
        this.married=married;
        Human.population+=1;
    }
}
