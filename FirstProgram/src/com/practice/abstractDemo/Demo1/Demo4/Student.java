package com.practice.abstractDemo.Demo1.Demo4;

public class Student extends Person{
    @Override
    public void greet(){
        System.out.println("Welcome to the student login page");
    }
    public static void main(String args[]){
        Student stu=new Student();
        stu.greet();
    }
}
