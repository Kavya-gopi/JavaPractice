package com.practice.recursion;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr={1,2,33,44,50,90,100};
        int target=100;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(target==arr[m]){
                return m;
            }
            if(arr[m]<target){
                return search(arr,target,m+1,e);
            }
            else{
                return search(arr,target,s,m-1);
            }
        }
        return -1;
    }
}
