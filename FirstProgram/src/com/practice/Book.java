package com.practice;

/*
Create a class called 'Book' with attributes 'title','author', and 'year'.Include a method called 'displayDetails()'
that displays the title,author, and year of the book.Create multiple objects of the 'Book' class and test the 'displayDetails()' method.
*/

public class Book{
    private String title;
    private String author;
    private int year;

    public Book(){

    }
    public Book(String title,String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }

    public void setTitle(String title){
        this.title=title;

    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        this.author=author;

    }

    public String getAuthor(){
        return author;
    }

    public void setYear(int year){
        this.year=year;

    }

    public int getYear(){
        return year;
    }

    public void displayDetails(){
        System.out.println("The title of the book: "+this.title);
        System.out.println("The author of the book: "+this.author);
        System.out.println("The published Year: "+this.year);


    }


}





