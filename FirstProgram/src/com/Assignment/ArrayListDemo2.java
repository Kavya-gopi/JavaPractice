package com.Assignment;
import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String args[]){
        List<String> studentNames=new ArrayList<String>();
        studentNames.add(0,"Abinaya");
        //studentNames.set(0,"Abirami");
        studentNames.add(1,"Bharathi");
        studentNames.add(2,"Charulatha");
        studentNames.add(3,"Abirami");
        System.out.println(studentNames.size());


        System.out.println(studentNames);
    }
}
