package com.OOPS;


import static com.OOPS.ClassesAndObjects.Student.a;

public class ClassesAndObjects {

    static class Student{
         int rollno;
        String name;
        static int a=2;
        static int b;

        static{
            System.out.println("Iam a static block");
            b=a*10;
        }
    }
  public static void main(String args[]){

    Student s1=new Student();
    s1.rollno=12;
    s1.name="kavya";
    System.out.println(s1.rollno);
    System.out.println(s1.name);

    Student s2=new Student();
    s2.rollno=13;
    s2.name="Jana";
    System.out.println(s2.rollno);
    System.out.println(s2.name);

    //System.out.println(a);
  }

}
