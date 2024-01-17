package com.Assignment;

import java.util.Scanner;

public class Matrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] first=new int[rows][cols];
        int[][] second=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter values of "+"first "+"["+i+"]"+"["+j+"]");
                first[i][j]=sc.nextInt();
                System.out.println("Enter values of "+"second "+"["+i+"]"+"["+j+"]");
                second[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(first[i][j]+"\t");

            }
            System.out.println();
        }


    }
}
