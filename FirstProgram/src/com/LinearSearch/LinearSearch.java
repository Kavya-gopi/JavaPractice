package com.LinearSearch;

public class LinearSearch {

        public static void main(String[] args){
            int[] array={12,45,-9,33,11,1,13};
            int target=111;
            int ans=linearSearch(array,target);
            System.out.println(ans);
            int ele=linearSearchElement(array,target);
            System.out.println(ele);
            System.out.println(linearSearch3(array,target));


        }
    static int linearSearchElement(int[] arr,int target){
        if(arr.length==0){
            return -1;

        }

        for(int i=0;i<arr.length;i++){
            int element=arr[i];

            if(element==target){
                return element;
            }
        }
        return -1;

    }

        static int linearSearch(int[] arr,int target){
            if(arr.length==0){
                return -1;
            }

            for(int index=0;index<arr.length;index++){
                int element=arr[index];

                if(element==target){
                    return index;
                }
            }
            return -1;
        }
    static boolean linearSearch3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];

            if(element==target){
                return true;
            }
        }
        return false;

        }
    }

