package com.Fundamentals;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter integer value:");
        int a=input.nextInt();
        System.out.println(a);

        System.out.println("Enter a string: ");
        String s= input.nextLine();
        System.out.println(s);

        System.out.println(a);
        System.out.println("Enter a floating value: ");
        System.out.println(input.nextFloat());
        System.out.println("Enter a double value: ");
        System.out.println(input.nextDouble());
        System.out.println("Enter a char :");
        System.out.println(input.next());


    }
}
/*package com.Fundamentals;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name? ");
        String UserName=scanner.nextLine();//string

        System.out.println("Enter your age:");
        int UserAge=scanner.nextInt();//int
        scanner.nextLine();
        System.out.println("Enter your job title");
        String JobName=scanner.nextLine();
        System.out.println("ans the question, is 10>8?, say true or false");
        boolean check=scanner.nextBoolean();
        System.out.println("How many members in your Family?");
        byte famCount=scanner.nextByte();
        System.out.println("rate your skills out of 10");
        float rate=scanner.nextFloat();


        System.out.println("My name is "+UserName);
        System.out.println("My age is "+UserAge);
        System.out.println("My Profile: "+JobName);
        System.out.println("10>8 is "+ check);
        System.out.println("Total member in my family is:"+famCount);
        System.out.println("My Skill rate is :"+rate);


    }
}*/
