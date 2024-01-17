package com.practice.abstractDemo.Demo1.Demo3;

public class Developer extends Employee{
    @Override
    public int calculateSalary(){
        return 25*3000;
    }
    public static void main(String args[]){
        Developer devops=new Developer();
        System.out.println(devops.calculateSalary());
    }
}
