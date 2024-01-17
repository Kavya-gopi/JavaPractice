package com.Assignment;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;


public class ArrList {
    public static void main(String args[]) {


        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("Kavya",25000,"Developer"));
        emp.add(new Employee("Keerthi",25000,"Software Tester"));
        emp.add(new Employee("Suchi",30000,"Atomic"));
        emp.add(new Employee("Abinaya",45000,"Java Developer"));
        System.out.println(emp);
        int size=emp.size();
        System.out.println(size);
        emp.add(4,new Employee("Abirami",50000,"Android Developer"));
        System.out.println(emp);
        emp.add(new Employee("keerthi",24000,"Flutter Developer"));
        //System.out.println(emp.get(0).equals(emp.get(1)));
    }
}
