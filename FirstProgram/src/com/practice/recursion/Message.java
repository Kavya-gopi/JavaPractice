package com.practice.recursion;

public class Message {
    static int count=0;
    public static void main(String[] args){
        message();

    }
    static void message(){

        count++;
        if(count<=5) {
            System.out.println("This is recursion part");
            message();

        }
    }
//    static void message1(){
//        System.out.println("This is recursion part");
//        message2();
//    }
//    static void message2(){
//        System.out.println("This is recursion part");
//        message3();
//    }
//    static void message3(){
//        System.out.println("This is recursion part");
//
//    }
}
