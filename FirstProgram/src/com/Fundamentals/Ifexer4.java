package com.Fundamentals;
/*
You are developing a program to determine the grade of a student based on their marks.Write
a Java program that takes the marks as input and prints the corresponding grade according to thr following criteria:
--Marks>=90:GradeA
--Marks>=80:GradeB
--Marks>=70:GradeC
--Marks>=60:GradeD
--Marks<=60:GradeF

 */
import java.util.Scanner;
public class Ifexer4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=80){
            System.out.println("Grade B");
        } else if (marks>=70) {
            System.out.println("Grade C");

        }
        else if(marks>=60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }

    }
}
