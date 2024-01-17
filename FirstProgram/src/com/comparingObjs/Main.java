package com.comparingObjs;
//toString method
public class Main {
    public static void main(String[] args) {
        Person p=new Person("Kavya","G");
        Person p1=new Person();
        p1.setFirstName("Kavya");
        p1.setLastName("G");
        Person p3=null;
        Person p4=new Person("Keerthi","P");
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p.equals(p1));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals("kavya"));
        System.out.println(p1.equals(p4));

    }
}
