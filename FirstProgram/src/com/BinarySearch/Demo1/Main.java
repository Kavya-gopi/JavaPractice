
/*Given a sorted array of size N and an integer k,find the position(0-based indexing) at which k is present in the array using binary search*/

package com.BinarySearch.Demo1;

public class Main{

    public static void main(String[] args){
       int[] arr={5,4,3,2,1};
       int k=4;
       int N=arr.length;
       int result=search(arr,k,N);
       System.out.println(result);
    }
    static int search(int[] arr,int k,int N){
        int start=0;
        int end=N-1;
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==k){
                return mid;
            }
            if(isAsc){//{1,2,3,4,5}, k=4,{5,4,3,2,1}
                if(arr[mid]<k){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }

            }
            else{
                if(arr[mid]>k){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

        }
        return -1;
    }


}



