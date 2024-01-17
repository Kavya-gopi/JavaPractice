package com.practice;


/*Create a class called 'Student' with attributes 'name' and 'age'. Include a method called 'displayInfo()'
that displays the name and age of the student. Create multiple objects of the 'Student' class and test the 'displayInfo()'
method*/

public class Student{
    String name;
    int age;

    public Student(){
    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;

    }

    public void displayInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }





}

