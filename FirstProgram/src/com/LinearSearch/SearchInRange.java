package com.LinearSearch;

public class SearchInRange{
    public static void main(String[] args){
        int[] arr={12,45,-9,11,8};
        int target=11;
        int result=search(arr,target,1,4);
        System.out.println(result);
        int result1=search1(arr,target,1,4);
        System.out.println(result1);

    }

    static int search(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }

        }
        return -1;

    }

    static int search1(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            int element=arr[i];
            if(element==target){
                return element;
            }
        }
        return -1;
    }


}
