package com.Assignment;

import java.util.Scanner;

public class SumOfDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first=0;
        int second=0;
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();

            }
        }
        if(rows==cols){
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(i==j){
                        first+=mat[i][j];

                    }
                    if ((i + j) == (rows - 1)) {
                        second += mat[i][j];


                }
                }
            }
            System.out.println("The sum of first Diagonal is "+first);
            System.out.println("The sum of second diagonal is "+second);

        }
        else{
            System.out.println("-1");
        }




    }

}
