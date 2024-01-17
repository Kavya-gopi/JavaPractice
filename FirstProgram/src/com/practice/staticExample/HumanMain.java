package com.practice.staticExample;

public class HumanMain {
    public static void main(String[] args) {


        Human person1 = new Human("kavya", 25000, 21, false);
        System.out.println(person1.population);
        System.out.println(Human.population);
        person1.greet();
        Human.greet();

    }
}
