package com.LinearSearch;
import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args){
        String s="kavyagopi";
        char c='y';
        boolean result=LinearSearch(s,c);
        System.out.println(result);
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(search(s,'b'));


    }
    static boolean LinearSearch(String str,char c){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(c==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean search(String s,char c){
        if(s.length()==0){
            return false;
        }
        for(char ch:s.toCharArray()){
            if(c==ch){
                return true;
            }
        }
        return false;
    }
}
