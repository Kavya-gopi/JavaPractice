package com.Assignment;

public class Employee implements Comparable<Employee> {
    String name;
    int salary;
    String role;

    public Employee(){

    }
    public Employee(String name,int salary,String role){
        this.name=name;
        this.salary=salary;
        this.role=role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString(){
        return "Name: "+ this.name+" Salary :"+this.salary+" Role: "+this.role;

    }
    @Override
    public boolean equals(Object obj) {
        return this.name == ((Employee) obj).name;
    }

    @Override
    public int compareTo(Employee ob){
        return this.salary-ob.salary;
    }

}
