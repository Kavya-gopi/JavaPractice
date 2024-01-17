package com.collections;

import com.comparingObjs.Person;

import java.util.Set;
import java.util.TreeSet;

public class TreeDemo {
    public static void main(String[] args) {

        Set<Person> persons = new TreeSet<Person>();
        persons.add(new Person("Joe","Smith"));
        persons.add(new Person("John","Smith"));
        persons.add(new Person("Adam","Joshva"));
        


    }
}
