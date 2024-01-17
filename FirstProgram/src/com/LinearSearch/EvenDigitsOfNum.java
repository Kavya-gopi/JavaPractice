package com.LinearSearch;

public class EvenDigitsOfNum {
    public static void main(String[] args){
        int[] arr={13,5,789,7890,1};
        //System.out.println(findNum(arr));
        //System.out.println(digit(12345));
        int ans=evenCount(arr);
        System.out.println(ans);


    }
    static int evenCount(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int n=digit(arr[i]);
            if(n%2==0){
                count++;
            }
        }
        return count;
    }

    static int digit(int num){
        int digit=0;
        while(num>0){
            digit++;
            num=num/10;

        }
        return digit;
    }
}
