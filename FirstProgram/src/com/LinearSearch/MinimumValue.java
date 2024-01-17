package com.LinearSearch;

public class MinimumValue{
    public static void main(String[] args){
        int[] array={20,99,78,111,8,1};
        int min=minimum(array);
        System.out.println("The minimum value is:"+min);

    }

    static int minimum(int[] arr){
        int ans=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;

    }
}
