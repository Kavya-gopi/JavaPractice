package com.leetcodejava;

public class Q2 {

        public String[] reverseWords(String s) {
            String[] arr=null;
            arr = s.split(" ");
            int i;
            String[] result=null;
            for (i = arr.length-1; i>=0; i--) {
                System.out.println(arr[i]);
                //return arr[i];

            }
            return arr;

        }


        public static void main(String[] args){
            Q2 q=new Q2();
            q.reverseWords("Hello world");
        }

}
