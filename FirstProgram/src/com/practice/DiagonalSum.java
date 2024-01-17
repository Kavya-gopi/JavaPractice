package com.practice;
import java.util.*;
public class DiagonalSum {


        // Enter the logic here
        public void calculateDiagonalSums(int[][] matrix,int N){
            int pSum=0;
            int sSum=0;
            for(int i=0;i<N;i++){
                pSum=pSum+matrix[i][i];
                sSum=sSum+matrix[i][N-i-1];
            }
            System.out.println(pSum);
            System.out.println(sSum);
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after integer input
            int[][] matrix = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            DiagonalSum solution = new DiagonalSum();
            solution.calculateDiagonalSums(matrix, N);
        }
    }

//    public static void main(String[] args){
//        int pSum=0;
//        int sSum=0;
//        Scanner sc=new Scanner(System.in);
//        int rows=sc.nextInt();
//        int[][] arr=new int[rows][rows];
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<rows;j++){
//                arr[i][j]=sc.nextInt();
//
//            }
//
//        }
//        System.out.println("Matrix array");
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<rows;j++){
//                System.out.print(arr[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//
//        }
//        for(int i=0;i<rows;i++){
//            pSum=pSum+arr[i][i];
//            sSum=sSum+arr[i][rows-i-1];
//        }
//        System.out.println(pSum);
//        System.out.println(sSum);
//
//    }


