//BinarySearch
package com.BinarySearch;

public class BinarySearch{
    public static void main(String[] args){
        int[] arr={12,45,50,55,99,100};
        int target=99;
        int result=binarySearch(arr,target);
        System.out.println(result);

    }

    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;


            if(target>arr[mid]){
                start=mid+1;

            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return arr[mid];
            }

        }
        return -1;

    }


}

