package com.kavya;

import java.util.Arrays;

public class StudentsMain {
    public static void main(String[] args) {
        Student[] students=new Student[5];
        students[0]=new Student("kavya",21,97);
        students[1]=new Student("Abi",22,99);
        students[2]=new Student("keerthi",23,92);
        students[3]=new Student("Suchi",22,90);
        students[4]=new Student("Abirami",21,67);

        //for(int i=0;i< students.length;i++){
          //  System.out.println(students[i]);
        //}

        //System.out.println(students[0].compareTo(students[1]));
        Arrays.sort(students);
        for(Student s:students)
            System.out.println(s);

    }
}
