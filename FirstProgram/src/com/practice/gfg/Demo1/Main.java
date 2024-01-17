/*
Given an array arr of size N and an element k. The task is to find the count of elements in the array that appear more than n/k times.

Example 1:

Input:
N = 8
arr = [3,1,2,2,1,2,3,3]
k = 4
Output:
2
Explanation:
In the given array, 3 and 2 are the only elements that appears more than n/k times.
*/

package com.practice.gfg.Demo1;

public class Main{

    public static void main(String[] args){
       int[] arr={3,1,2,2,1,2,3,3};
       int N= arr.length;
       int k=4;
       int result=occurrence(arr,k,N);
       System.out.println(result);

    }
    static int occurrence(int[] arr,int k,int N){//arr = [3,1,2,2,1,2,3,3]
        int count=0;
        int occ=N/k;
        for(int i=0;i<N;i++){
            for(int j=1;j<N;j++){
                if(arr[i]==arr[j]){
                    count++;

                       if(occ>=count) {
                         return arr[i];

                    }
                }
            }
        }

      return -1;
    }

}



