package com.practice;
import java.util.HashMap;
import java.util.ArrayList;

public class CharCount {
    public static void main(String args[]){
        //ArrayList<String> list =new ArrayList<String>();
        String s="keerthikakavya";
        HashMap<Character,Integer> charCountMap=new HashMap<>();
        System.out.println(charCountMap);
        char[] ch=s.toCharArray();
        for (char c:ch) {
            System.out.print(c);
            System.out.print(" ");
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }
            else{
                charCountMap.put(c,1);
            }
        }
        System.out.println(charCountMap);



    }
}
