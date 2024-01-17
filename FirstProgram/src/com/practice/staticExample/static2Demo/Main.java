package com.practice.staticExample.static2Demo;

public class Main {
    public static void main(String args[]){
        StringUtil str =new StringUtil("kavya");
        String s=StringUtil.reverse("kavya");
        int c=StringUtil.occurrence("Hello");
        boolean b=StringUtil.palindrome("kavya");
        System.out.println("The reverse word of the string is: "+s);
        System.out.println("Count: "+c);
        System.out.println("Palindrome:"+b);
    }
}
