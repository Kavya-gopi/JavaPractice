package com.practice.lambdaExp.Demo2;

import java.util.Scanner;

public class AscendOrder {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=in.nextInt();
        }
        Sort sort=()->{
            System.out.println("Sorted Array");
        };



    }
}
