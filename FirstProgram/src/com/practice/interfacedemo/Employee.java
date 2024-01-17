package com.practice.interfacedemo;

public interface Employee {
    int SALARY=25000;//by default, the variables are final and static
    int LEAVES=10;
    public void maintainHours();//by default, it is abstract
    public void relocate();
    public void report();
    public void dress();
}
