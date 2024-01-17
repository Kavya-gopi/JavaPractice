package com.comparingObjs;

public class CompareObject {
    public static void main(String[] args) {
        String str1="Hello World";
        String str2="Hello World";
        String str3=new String("Hello World");
        if(str1==str2){
            System.out.println("str1 and str2 are equal");
        }
        else{
            System.out.println("str1 and str2 are not equal");
        }
        if(str1==str3)
            System.out.println("str1 and str3 are equal");
        else
            System.out.println("str1 and str3 are not equal");
        if(str1.equals(str3)){
            System.out.println("str1 and str3 are equal");
        }
        else{
            System.out.println("str1 and str3 are not equal");
        }
        System.out.println(str1);
        str1=str1.concat("hiii");
        if(str1.equals(str3)){
            System.out.println("str1 and str3 are equal");
        }
        else{
            System.out.println("str1 and str3 are not equal");
        }
        System.out.println(str1);

    }
}


