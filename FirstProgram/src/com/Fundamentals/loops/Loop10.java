package com.Fundamentals.loops;
/*10. Write a program to calculate the average of a list of numbers using a for loop.
*/
import java.util.Scanner;
public class Loop10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int average;
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];

        }
        System.out.println("The sum :"+sum);
        System.out.println("The average of the list: "+sum/size);
        System.out.println("arraylist");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
}
