package com.kavya;

public class Main {
    public static void main(String[] args) {
        Car c1=new Car("Black","maruthi",4);
        Car c2=new Car();
        c2.setColor("Red");
        c2.setModelName("RangeRover");
        c2.setNoOfSeats(6);
        Car c3=new Car("Black","maruthi",4);
        System.out.println(c1);
        System.out.println(c2);

        //equals
        System.out.println(c1.equals("null"));
        System.out.println(c1.equals("Prem"));
        System.out.println(c1.equals(c3));

    }
}
