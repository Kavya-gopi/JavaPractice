package com.kavya;
import java.util.*;

public class Student<T> implements Comparable<Student> {
    private ArrayList<T> list;

    private String name;
    private int age;
    private int marks;

    public Student(){
       // list=new ArrayList<T>();

    }
    public Student(String name,int age,int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setMarks(int marks){
        this.marks=marks;
    }
    public int getMarks(){
        return marks;
    }
    @Override
    public String toString(){
        return "Name: "+this.name+" ,"+"Age :"+this.age+" ,"+"Marks :"+this.marks;
    }
    @Override
    public int compareTo(Student o){
        return -(this.marks-o.marks);
    }
}
