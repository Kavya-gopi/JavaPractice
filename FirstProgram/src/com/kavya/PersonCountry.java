package com.kavya;

public class PersonCountry {
    private String name;
    private String country;
    private int age;
    public PersonCountry(){

    }
    public PersonCountry(String name,String country,int age){
        this.name=name;
        this.country=country;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String getCountry(){
        return this.country;
    }
}
