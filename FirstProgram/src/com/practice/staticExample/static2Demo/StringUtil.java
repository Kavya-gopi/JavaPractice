package com.practice.staticExample.static2Demo;

/*Implement a class called "StringUtil" with static methods for string
manipulation, such as reversing a string, counting the occurrences of a specific character
or checking if a string is a palindrome. Test the methods by calling them in a separate
class.
 */

import java.util.Arrays;

public class StringUtil {
    private String word;

    public StringUtil() {
    }

    public StringUtil(String word) {
        this.word = word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    static String reverse(String word) {
        //word.split(" ");
        //System.out.println(Arrays.toString(word.split(" "));


        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return reversedWord;
    }

    static int occurrence(String word){
        char c=word.charAt(2);
        int count=0;
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(2)){
                count++;
            }

        }
        return count;
    }

    static boolean palindrome(String word){
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        if(word.equals(reversedWord)){
            return true;

        }
        else{
            return false;
        }

    }


}



