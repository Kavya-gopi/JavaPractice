package com.OOPS.Inheritance.Demo5;

public class Employee {
    private int salary;
    public Employee(int salary){
        this.salary=salary;
    }
    public void work(){
        System.out.println("This is work statement");
    }
    public int getSalary(){
        return salary;
    }
}
