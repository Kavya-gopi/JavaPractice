package com.practice.abstractDemo.Demo1.Demo3;

public class Manager extends Employee{
    @Override
    public int calculateSalary(){
        return 25*2000;

    }
    public static void main(String args[]){
        Employee manager=new Manager();
        System.out.println( manager.calculateSalary());
    }
}
