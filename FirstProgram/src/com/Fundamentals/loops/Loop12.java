package com.Fundamentals.loops;

/*
12. Write a program to find the largest element in an array using a for loop.

 */
import java.util.Scanner;
public class Loop12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int max=arr[0];
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();

        }
        /*STEP 1: START.
                STEP 2: INITIALIZE arr[] = {25, 11, 7, 75, 56}
        STEP 3: max = arr[0]
        STEP 4: REPEAT STEP 5 for(i=0; i< arr.length; i++)
            STEP 5: if(arr[i]>max) max=arr[i]
        STEP 6: PRINT "Largest element in given array:"
        STEP 7: PRINT max.
        STEP 8: END.*/
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
