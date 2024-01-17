
//2d array

package com.LinearSearch;

import java.util.Arrays;

public class Search2DArray{
    public static void main(String[] args){
        int[][] arr={{28,10,80},{11,6,2},{21,1,4}};
        int target=1;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(target==arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
