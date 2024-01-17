package com.practice;
public class Rect{
    public static void main(String args[]){
        Rectangle r1=new Rectangle(12,14);
        Student s1=new Student("Abi",22);
        Circle c1=new Circle(10);
        System.out.println("The area of rectangle is "+r1.calculateArea());
        System.out.println("Details of Student");
        s1.displayInfo();
        System.out.println("The circumference of the circle :"+c1.calculateCircumference());
        Book book1=new Book("Head first Java","Kunal",2004);
        Book book2=new Book("Think Python","Kushwaha",2014);
        Book book3=new Book("Two states","Chetan bhagat",2012);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();

        BankAccount user1=new BankAccount(51341910,100);
        user1.deposit(900);
        System.out.println(user1.deposit(500));
        System.out.println(user1.withDraw(20));

        BankAccount user2=new BankAccount(8978565,79.89);
        System.out.println(user2.deposit(100));
        System.out.println(user2.withDraw(29));



    }


}