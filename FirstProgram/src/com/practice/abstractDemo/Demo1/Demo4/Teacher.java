package com.practice.abstractDemo.Demo1.Demo4;

public class Teacher extends Person{
    @Override
    public void greet(){
        System.out.println("Welcome to Teacher's login page");
    }
    public static void main(String args[]){
        Teacher teacher=new Teacher();
        teacher.greet();
    }
}
