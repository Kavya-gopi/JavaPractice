package com.Sort;
import java.util.Arrays;
public class Demo1 {
    //BubbleSort

    public static void main(String[] args){
        int[] arr={50,40,30,20,10};
        System.out.println("Before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        bubblesort(arr);
        System.out.println("Sorted array");
        printArray(arr);


    }
    static void bubblesort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];//40
                    arr[j]=arr[j-1];//50
                    arr[j-1]=temp;
                }
            }
        }



    }
    static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}
