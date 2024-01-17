package com.OOPS.Inheritance.Demo3;

public class Main {
    public static void main(String args[]){
        Car car=new Car();
        car.drive();
        Vehicle v=new Vehicle();
        v.drive();
        Vehicle v1=new Car();
        v1.drive();
       // Car c1=new Vehicle();
       // c1.drive();


    }
}
