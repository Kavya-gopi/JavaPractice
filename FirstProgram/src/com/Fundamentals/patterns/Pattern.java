package com.Fundamentals.patterns;
/*
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
 */

public class Pattern {
    public static void main(String args[]){
        System.out.println("Pattern 1");
        pattern1(5);
        System.out.println("Pattern 2");
        pattern2(4);
        System.out.println("Pattern 3");
        pattern3(5);
        System.out.println("Pattern 4");
        pattern4(5);
        System.out.println("Pattern 5");
        pattern5(5);
    }

    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    /*
     *
     * *
     * * *
     * * * *
     */
    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    * * * * *
    * * * *
    * * *
    * *
    *
     */
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<n+1-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    /*
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
     */
    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

 }

