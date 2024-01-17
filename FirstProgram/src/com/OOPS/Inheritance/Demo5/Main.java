package com.OOPS.Inheritance.Demo5;

public class Main {
    public static void main(String args[]){
        Employee emp=new Employee(25000);
        int empSalary=emp.getSalary();
        System.out.println(empSalary);
        HREmployee emp2=new HREmployee(30000);
        System.out.println(emp2.getSalary());
        emp2.work();
        emp2.addEmployee();
    }
}
