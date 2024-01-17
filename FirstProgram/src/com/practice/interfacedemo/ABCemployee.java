package com.practice.interfacedemo;

public class ABCemployee implements Employee, FamilyRules {
    @Override
    public void maintainHours(){
        System.out.println("40 hours of work should be done by the employee");

    }
    @Override
    public void relocate(){
        System.out.println("Relocate to another city");
    }
    @Override
    public void report(){
        System.out.println("Report submit on weekend");
    }

    @Override
    public void dress(){
        System.out.println("The dress should be formal");
    }
    @Override
    public void takeCareParents(){
        System.out.println("Taking care of parents");
    }
    @Override
    public void helpMember(){
        System.out.println("Helping to family");

    }
    @Override

    public void eatTogether(){
        System.out.println("Eating together with the family members");
    }
    @Override

    public void enjoy(){
        System.out.println("Enjoy each moment with family members");
    }
    public static void main(String args[]){
        ABCemployee emp1=new ABCemployee();
        //employee rules
        emp1.maintainHours();
        emp1.dress();
        emp1.relocate();
        emp1.report();

        System.out.println(Employee.SALARY);
        System.out.println(Employee.LEAVES);
        //family rules
        emp1.eatTogether();
        emp1.helpMember();
        emp1.takeCareParents();
        emp1.enjoy();
    }
}
