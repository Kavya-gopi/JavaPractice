package com.OOPS.Inheritance.Demo1;

public class Animal{
    private int legs;
    private String category;

    public Animal(){}
    public Animal(int legs,String category){
        this.legs=legs;
        this.category=category;

    }

    public void setLegs(int legs){
        this.legs=legs;

    }
    public int getLegs(){
        return legs;
    }

    public void setCategory(String category){
        this.category=category;
    }
    public String getCategory(){
        return category;
    }

    public void makeSound(){
        System.out.println("The animal can Bark");
    }

}

