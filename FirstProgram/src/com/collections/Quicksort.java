package com.collections;

public class Quicksort {
    public static void main(String[] args) {
        int[] array={10,16,8,12,15,6,3,9,5};
        System.out.println("Original array: ");
        printArray(array);
        quickSort(array, 0, array.length-1);
        System.out.println("\nSorted array");
        printArray(array);
    }
    public static void quickSort(int[] array,int low,int high){
        if(low<high){
            //Partition the array and get the pivot index
            int pivotIndex=partition(array,low,high);
            //Recursively sort sub-arrays
            quickSort(array,low,pivotIndex -1);
            quickSort(array,pivotIndex+1,high);

        }
    }
    public static int partition(int[] array,int low,int high){
        //choose the leftmost elememt as the pivot
        int pivot = array[low];
        //Index of the smaller element
        int i=low+1;
        //Traverse the array and rearrange elements
        for(int j=low+1;j<=high;j++){
            if(array[j]<pivot){
                //Swap array[i] and array[j]
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                i++;
            }
        }
        //Swap array[low]and array[i-1] (pivot)
        int temp =array[low];
        array[low]=array[i-1];
        array[i-1]=temp;

        //Return the pivot index
        return i-1;
    }
    public static void  printArray(int[] array){
        for(int value:array){
            System.out.print(value + " ");
        }
        System.out.println();

    }
}
