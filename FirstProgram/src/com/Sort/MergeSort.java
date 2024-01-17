package com.Sort;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr={3,2,5,7,1,8,4};
        arr=sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] first=sort(Arrays.copyOfRange(arr,0,mid));
        int[] second=sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(first,second);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merge=new int[left.length+ right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< left.length && j< right.length){
            if(left[i]<right[j]){
                merge[k]=left[i];
                i++;
            }
            else{
                merge[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            merge[k]=left[i];
            i++;
            k++;
        }
        while(j< right.length){
            merge[k]=right[j];
            j++;
            k++;

        }
        return merge;
    }
}
