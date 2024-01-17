package com.kavya;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class StudentOrderMain {
    public static void main(String[] args) {
        //List<StudentOrder> studentlist=new ArrayList<StudentOrder>();
        StudentOrder[] studentlist=new StudentOrder[3];
        //StudentOrder student1=new StudentOrder(105,"Kavya",89.7f);
        /*studentlist.add(student1);
        studentlist.add(new StudentOrder(104,"Abinaya",98f));
        StudentOrder student3=new StudentOrder(12,"Suchismathi",89.56f);
        studentlist.add(student3);
        StudentOrder student4=new StudentOrder(4,"Gunavathi",76.9f);
        studentlist.add(student4);*/
        //System.out.println(StudentOrder[] studentlist=new StudentOrder[4];
        //      student1.compareTo(student3));
        //System.out.println(student1.equals(student3));
        //student1.compareTo(student3);
        //System.out.println(studentlist);
        studentlist[0]=new StudentOrder(104,"Abinaya",98);
        studentlist[1]=new StudentOrder(14,"Keerthi",99);
        studentlist[2]=new StudentOrder(114,"Kavya",76);


//        Arrays.sort(studentlist);
//        for(StudentOrder s:studentlist)
//            System.out.println(s);
        Arrays.sort(studentlist,StudentOrder.NAME_COMPARATOR);
        for(StudentOrder s:studentlist)
            System.out.println(s);
        Arrays.sort(studentlist,StudentOrder.ROLLNO_COMPARATOR);
        for(StudentOrder s:studentlist)
            System.out.println(s);




    }
}
