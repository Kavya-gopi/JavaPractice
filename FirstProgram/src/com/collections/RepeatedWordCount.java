package com.collections;
import java.util.Map;
import java.util.HashMap;
public class RepeatedWordCount {
    public static void main(String args[]) {
        String message = "How are you? What are you doing?";
        Map<String, Integer> words = new HashMap<String, Integer>();
        String[] arrString=message.split(" ");
        for(String arr:arrString){
            Integer count=words.get(arr);
            if(count==null)//First occurrence
                words.put(arr,1);
            else{
                count=words.get(arr);//gives the previous count
                count++;//increment the previous value by 1
                words.put(arr,count);
            }
        }
        System.out.println(words);



    }
}
