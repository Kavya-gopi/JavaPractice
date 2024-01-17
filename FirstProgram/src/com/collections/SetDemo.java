package com.collections;
import com.comparingObjs.Person;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> names = new HashSet<String>();
        names.add("Adam");
        names.add("Smith");
        names.add("James");
        names.add("John");
        names.add("Joe");
        names.add("John");
        System.out.println(names);
        System.out.println(names.contains("John"));
        System.out.println(names.contains("Clara"));

        Set<Person> persons=new HashSet<Person>();
        persons.add(new Person("Adam","Smith"));
        persons.add(new Person("John","Harry"));
        persons.add(new Person("Adam","Smith"));
        System.out.println(persons);






    }
}
