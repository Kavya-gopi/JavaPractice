//SearchIn2DArray


package com.LinearSearch;

import java.util.Arrays;

public class SearchArray{
    public static void main(String[] args){
        int[][] arr={
                {12,4,11,7},
                {1,45,13},
                {122,77}

        };
        int target=122;
        System.out.println(Arrays.toString(search(arr,target)));


    }
    static int[] search(int[][] arr, int target){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(target==arr[i][j]){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};

    }

}

