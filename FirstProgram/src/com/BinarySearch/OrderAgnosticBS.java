package com.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args){
        //int[] arr={1,34,45,55,66,77,88,99,100,110,120};
        int[] arr1={120,110,100,99,77,1};
        //int val=1;
        int target=1;
        int result=orderAgnosticBS(arr1,target);
        System.out.println(result);
        //System.out.println("SEcond");
        //int res=binarySearch(arr1,val);
        //System.out.println(res);


    }
    static int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
          int mid=start+(end-start)/2;
          if(target==arr[mid]){
              return mid;
          }
          if(isAsc){
              if(target<arr[mid]){
                  end=mid-1;
              }
              else{
                  start=mid+1;
              }
          }
          else{
              if(target>arr[mid]){
                  end=mid-1;
              }
              else{
                  start=mid+1;
              }
          }
        }
        return -1;
    }

    }
