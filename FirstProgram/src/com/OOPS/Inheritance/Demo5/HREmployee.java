package com.OOPS.Inheritance.Demo5;

public class HREmployee extends Employee{
    public HREmployee(int salary){
        super(salary);
    }
    @Override
    public void work(){
        System.out.println("HREmployee work");
    }

    public void addEmployee(){
        System.out.println("Add employee to the work");
    }

}
