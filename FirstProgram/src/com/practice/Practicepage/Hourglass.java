package com.practice.Practicepage;
import java.util.Scanner;

public class Hourglass {
    static void pattern(int n){
        int i,j,k;

        for( i=1;i<=n;i++){
            for(k=1;k<i;k++){
                System.out.print(" ");

            }
            for(j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--){
            for(k=1;k<i;k++){
                System.out.print(" ");
            }
            for(j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);

        pattern(7);

    }
}
