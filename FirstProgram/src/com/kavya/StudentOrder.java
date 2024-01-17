package com.kavya;
import java.util.Comparator;
public class StudentOrder implements Comparable<StudentOrder> {
    private int rollno;
    private String name;
    private int marks;

    public StudentOrder(){


    }
    public StudentOrder(int rollno,String  name,int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;

    }

    public void setRollno(int rollno){
        this.rollno=rollno;
    }
    public int getRollno(){
        return rollno;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public int getMarks(){
        return marks;
    }
    @Override
    public String toString(){
        return "(Register no : "+this.rollno+" Name :"+this.name+" marks: "+this.marks+" )";
    }

    public static Comparator<StudentOrder> NAME_COMPARATOR=new Comparator<StudentOrder>(){
        public int compare(StudentOrder stu1,StudentOrder stu2){
            return stu1.name.compareTo(stu2.name);
        }

    };

    public static Comparator<StudentOrder> ROLLNO_COMPARATOR=new Comparator<StudentOrder>(){
        public int compare(StudentOrder stu1,StudentOrder stu2){
            return stu1.rollno-stu2.rollno;
        }
    };
    @Override
    public int compareTo(StudentOrder ob){
        return this.marks-ob.marks;
    }


}
