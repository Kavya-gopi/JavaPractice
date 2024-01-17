package com.kavya;

public class Car {
    private String color;
    private String modelName;
    private int noOfSeats;

    public Car(){//default constructor

    }
    //parameterized constructor
    public Car(String color,String modelName,int noOfSeats){
        this.color=color;
        this.modelName=modelName;
        this.noOfSeats=noOfSeats;
    }

    public void setColor(String color){
        this.color=color;

    }
    public String getColor(){
        return color;
    }
    public void setModelName(String modelName){
        this.modelName=modelName;
    }
    public String getModelName(){
        return modelName;
    }
    public void setNoOfSeats(int noOfSeats){
        this.noOfSeats=noOfSeats;
    }
    public int getNoOfSeats(){
        return noOfSeats;
    }
    @Override
    public String toString(){
        return "Color"+": "+this.color+" "+"ModelName"+" : "+this.modelName+" "+"NoofSeats"+" : "+this.noOfSeats;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(getClass()!=obj.getClass())
            return false;
        Car other=(Car) obj;
          return this.color.equals(other.color) && this.modelName.equals(other.modelName);

    }
}
