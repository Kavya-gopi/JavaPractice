package com.comparingObjs;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    

    //default constructors
    public Person(){

    }
    //parameterized constructors
    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }
    @Override
    public String toString(){
        return "FirstName:"+ this.firstName+" "+"LastName:"+this.lastName;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)//same reference
            return true;
        if(obj==null)//null reference
            return false;
        if(getClass()!=obj.getClass())//Two different class types
            return false;
        Person other=(Person) obj;//Type casting
        return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
    }
    @Override
    public int compareTo(Person p){
        return 0;

    }




}

