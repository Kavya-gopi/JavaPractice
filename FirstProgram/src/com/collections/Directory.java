package com.collections;
import java.util.Map;
import java.util.HashMap;

//hashmap will accept the null value but hashtable not accept the null key value


public class Directory {
    public static void main(String[] args) {
        Map<String,String> persons=new HashMap<String,String>();
        persons.put("James","9025189932");
        persons.put("John","9500106746");
        persons.put("James","9456783094");
        persons.put(null,null);
        persons.put("Adam",null);
        System.out.println("Phonenumber of John");
        System.out.println(persons.get("John"));
        System.out.println(persons.get(null));
        System.out.println(persons.get("Adam"));
        System.out.println(persons.get("Clara"));

    }
}
